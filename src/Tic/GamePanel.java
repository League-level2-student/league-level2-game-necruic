package Tic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements KeyListener, MouseListener {
	final int MENU = 0;
	final int P1 = 1;
	final int P2 = 2;
	final int END = 3;
	int currentState = P1;
	Font titlefont = new Font("Arial", Font.PLAIN, 48);
	char[][] grid;
	public GamePanel() {
		grid = new char[3][3];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j]= ' ' ;
				
			}
		}
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setFont(titlefont);
		g.setColor(Color.white);
		g.fillRect(0, 0, Tic.WIDTH, Tic.LENGTH);
		g.setColor(Color.black);
		for (int i =0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				g.drawRect(j*Tic.WIDTH/3, i*Tic.LENGTH/3, Tic.WIDTH/3, Tic.LENGTH/3);
				g.drawString(""+grid[j][i], j*Tic.WIDTH/3+75, i*Tic.LENGTH/3+150);
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x =arg0.getX();
		int y=arg0.getY();
		System.out.println(grid[y/Tic.LENGTH][x/Tic.WIDTH]);
		if(currentState == P1) {
			grid[y/Tic.LENGTH][x/Tic.WIDTH]='x';
				
			
			
		}
		/*
		else if(currentState == P2) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					grid[i][j]= 'y' ;
					
				}
			}
			currentState = P1;
		}
		*/
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
