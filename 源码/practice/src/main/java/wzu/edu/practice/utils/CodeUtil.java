package wzu.edu.practice.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CodeUtil extends HttpServlet {
	Random random = new Random();
	// 设置验证码的文本
	String sRand = "";
	int width = 200, height = 40;
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	Graphics g;

	private static final String CONTENT_TYPE = "text/html; charset=utf-8";

	public void init() throws ServletException {
		super.init();
	}

	// 设置随机的背景颜色
	Color getRandColor(int fc, int bc) {
		Random random = new Random();
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		// 设置类型
		response.setContentType("image/jpeg");
		// 设置字体的大小
		Font mFont = new Font("Times New Roman", Font.PLAIN, 28);

		g = image.getGraphics();
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);
		g.setColor(new Color(102, 102, 102));
		g.drawRect(0, 0, width - 1, height - 1);
		g.setFont(mFont);

		// 设置颜色
		g.setColor(getRandColor(160, 200));
		for (int i = 0; i < 155; i++) {
			int x = random.nextInt(width - 1);
			int y = random.nextInt(height - 1);
			int xl = random.nextInt(6) + 1;
			int yl = random.nextInt(12) + 1;
			g.drawLine(x, y, x + xl, y + yl);
		}
		for (int i = 0; i < 70; i++) {
			int x = random.nextInt(width - 1);
			int y = random.nextInt(height - 1);
			int xl = random.nextInt(12) + 1;
			int yl = random.nextInt(6) + 1;
			g.drawLine(x, y, x - xl, y - yl);
		}
		// 设置验证码的类型
		randomCode();
		HttpSession session = request.getSession(true);
		// 设置session使其进行效验
		session.setAttribute("validate", sRand);
		System.out.println(sRand);
		g.dispose();
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}

	// 英文字符加数字的验证码
	public void one() {
		String[] letter = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (int i = 0; i < 4; i++) {
			String tempRand = "";
			if (random.nextBoolean()) {
				tempRand = String.valueOf(random.nextInt(10));
			} else {
				tempRand = letter[random.nextInt(25)];
				/*
				 * if (random.nextBoolean()) {// 随机将该字母变成小写 tempRand =
				 * tempRand.toLowerCase(); }
				 */
			}
			sRand += tempRand;
			g.setColor(new Color(20 + random.nextInt(10), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(tempRand, 20 * i + 20, 30);
		}
	}

	// 英文
	public void two() {
		for (int i = 0; i < 5; i++) {
			int itmp = random.nextInt(26) + 65;
			char ctmp = (char) itmp;
			sRand += String.valueOf(ctmp);
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			g.drawString(String.valueOf(ctmp), 20 * i + 10, 30);
		}
	}

	// 4个数
	public void three() {
		for (int i = 0; i < 4; i++) {
			String rand = String.valueOf(random.nextInt(10));
			sRand += rand;
			// 将认证码显示到图象中
			g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
			// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
			g.drawString(rand, 20 * i + 10, 30);
		}
	}

	// 中文 肆+？=24
	public void four() {
		String[] cn = { "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
		int x = random.nextInt(10) + 1;
		int y = random.nextInt(30);
		sRand = String.valueOf(y);
		g.setFont(new Font("楷体", Font.PLAIN, 25));// 设定字体
		g.setColor(new Color(20 + random.nextInt(10), 20 + random.nextInt(110), 20 + random.nextInt(110)));
		g.drawString(cn[x - 1], 1 * 1 + 6, 30);
		g.drawString("+", 33, 30);
		g.drawString("？", 50, 30);
		g.drawString("=", 62, 30);
		g.drawString(String.valueOf(x + y), 75, 30);
	}
	
	//随机化验证码的四种类型
	public void randomCode(){
		int x = (int) Math.floor(Math.random()*4)+1;
		switch (x) {
		case 1:
			one();
			break;
		case 2:
			two();
			break;
		case 3:
			three();
			break;
		case 4:
			four();
			break;
		default:
			break;
		}
	}

}
