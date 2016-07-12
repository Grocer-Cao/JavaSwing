package edu.wri.jswing.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements MouseListener {
	// 构造方法
	public MyFrame() {
		// TODO Auto-generated constructor stub
		this.setTitle("我的第一个Java GUI图形界面");
		this.setSize(500, 400);
		this.setResizable(false);
		// 关闭程序即停止进程
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 设置打开位置
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		System.out.println("屏幕分辨率： " + width + "*" + height);
		this.setLocation((width - 500) / 2, (height - 400) / 2);

		// 设置鼠标监听本窗口事件
		this.addMouseListener(this);

		int rt = JOptionPane.showConfirmDialog(this, "准备好了吗？");

		System.out.println(rt);

		if (rt == 0) {
			// 设置窗口可见
			this.setVisible(true);
		} else if (rt == 1) {
			// 设置窗口不可见
			this.setVisible(false);
		} else {
			// 设置窗口可见
			this.setVisible(true);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标点击");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标按下");
		System.out.println("鼠标按下坐标： " + e.getX() + " " + e.getY());
		// 消息提示框Dialog
		//JOptionPane.showMessageDialog(this, "鼠标按下坐标： " + e.getX() + " " + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标释放");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标进入");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("鼠标离开");
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//画一个十字线
		g.drawLine(10, 210, 490, 210);
		g.drawLine(250, 37, 250, 390);
		
		//在左上角区域画一个空心圆
		g.drawOval(75, 70, 100, 100);
		
		//在右上角区域画一个蓝色实心矩形
		g.setColor(Color.BLUE);
		g.fillRect(330, 80, 100, 70);
		
		//在左下角插入一幅图片
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("E:/java/workspace/JSwing/psu.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g.drawImage(image,33,230,this);
		
		//在右下的区域写入一段字符
		g.setColor(Color.RED);
		g.setFont(new Font("宋体", 20, 20));
		g.drawString("测试文字", 335, 310);
		
		
	}

	private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
