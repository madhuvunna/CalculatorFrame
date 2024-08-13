package com.madhu;

import java.awt.Frame;

public class NewFrame extends Frame {
	
	public NewFrame(boolean visible,String title,int x,int y, int width,int height) {
		
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		
	}
}
