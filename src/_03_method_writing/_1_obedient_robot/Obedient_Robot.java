package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot Rob = new Robot();
	public static void main(String[] args) {
	
	String Shape = JOptionPane.showInputDialog("Which shape would you like to draw? Square, Circle, or Triangle?");
		if(Shape.equalsIgnoreCase("Square")){
			drawSquare();
		}
		if(Shape.equalsIgnoreCase("triangle")){
			drawTriangle();
		}
		if(Shape.equalsIgnoreCase("circle")){
		drawCircle();
	}}
	static void drawSquare() {
		Rob.penDown();
		Rob.setPenColor(Color.black);
		Rob.setSpeed(50);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
		Rob.turn(90);
		Rob.move(100);
	}
static void drawTriangle() {
	Rob.penDown();
	Rob.setPenColor(Color.blue);
	Rob.setSpeed(50);
	Rob.move(100);
	Rob.turn(120);
	Rob.move(100);
	Rob.turn(120);
	Rob.move(100);
}
static void drawCircle() {
	Rob.penDown();
	Rob.setSpeed(50);
	Rob.setPenColor(Color.red);
for (int i = 0; i < 360; i++) {
	Rob.move(1);
	Rob.turn(1);
}
}
}
