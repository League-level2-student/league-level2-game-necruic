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
	int currentState = MENU;
	Font titlefont = new Font("Arial", Font.PLAIN, 48);
	Font smolFont = new Font("Arial", Font.PLAIN, 24);
	char[][] grid;
	public GamePanel() {
		grid = new char[3][3];
		
		
		
	}
	@Override
	public void paintComponent(Graphics g) {
		g.setFont(titlefont);
		g.setColor(Color.white);
		g.fillRect(0, 0, Tic.WIDTH, Tic.LENGTH);
		g.setColor(Color.black);
		if (currentState == MENU) {
			drawMenuState(g);
		}
		if (currentState == P1) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					grid[i][j]= ' ' ;
					
				}
			}
		}
		for (int i =0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				g.drawRect(j*Tic.WIDTH/3, i*Tic.LENGTH/3, Tic.WIDTH/3, Tic.LENGTH/3);
				g.drawString(""+grid[j][i], j*Tic.WIDTH/3+75, i*Tic.LENGTH/3+150);
				
			}
		}
	}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.black);
		g.setFont(titlefont);
		g.drawString("Tic Tac Toe", 100, 100);
		g.setFont(smolFont);
		g.drawString("Press Enter to start", 125, 300);
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
	
if (grid[x/(Tic.WIDTH/3)] [y/(Tic.LENGTH/3)]=='x' || grid[x/(Tic.WIDTH/3)][y/(Tic.LENGTH/3)]=='y') {
			return;
		}
		if(currentState == P1) {
			grid[x/(Tic.WIDTH/3)] [y/(Tic.LENGTH/3)]='x';
				currentState = P2;
				
			
			
		}
		
		else if (currentState == P2) {
			grid[x/(Tic.WIDTH/3)][y/(Tic.LENGTH/3)]='y';
			currentState = P1;
		}
		
		if(grid[x/(Tic.WIDTH/3)][y/(Tic.LENGTH/3)] == ' ') {
			currentState = END;
		}
		
		System.out.println(x);
		System.out.println(y);
		repaint();
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
