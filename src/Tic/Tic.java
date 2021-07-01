package Tic;

import javax.swing.JFrame;

public class Tic {
public static final int WIDTH = 500, LENGTH = 800;
JFrame frame = new JFrame();
GamePanel game  = new GamePanel();

public void setup() {
	frame.add(game);
	frame.addKeyListener(game);
	frame.setSize(WIDTH, LENGTH);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
