package Tic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements KeyListener, MouseListener, ActionListener {
	final int MENU = 0;
	final int P1 = 1;
	final int P2 = 2;
	final int END = 3;
	int currentState = MENU;
	Font titlefont = new Font("Arial", Font.PLAIN, 48);
	Font smolFont = new Font("Arial", Font.PLAIN, 24);
	char[][] grid;
	Timer framedraw = new Timer(1000/60, this);
	public GamePanel() {
		grid = new char[3][3];
		framedraw.start();
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
		if (currentState == 0) {
			drawMenuState(g);
		}
		if (currentState == 1 || currentState == 2) {
			for (int i =0; i < grid.length; i++) {
				for (int j = 0; j < grid[i].length; j++) {
					g.drawRect(j*Tic.WIDTH/3, i*Tic.LENGTH/3, Tic.WIDTH/3, Tic.LENGTH/3);
					g.drawString(""+grid[j][i], j*Tic.WIDTH/3+75, i*Tic.LENGTH/3+150);
					
				}
			}
			
					
				}
		
		if (currentState == 3){
		drawEndState(g);
			}
		
	}
	
	public void drawMenuState(Graphics g) {
		g.setColor(Color.black);
		g.setFont(titlefont);
		g.drawString("Tic Tac Toe", 100, 100);
		g.setFont(smolFont);
		g.drawString("Press Enter to start", 125, 300);
	}
	public void drawEndState(Graphics g) {
		g.setColor(Color.black);
		g.setFont(titlefont);
		g.drawString("won!", 100, 100);
		g.drawString("Press Enter to play again", 125, 300);
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == 3) {
		        currentState = 0;
	
		    } 
		    else if (currentState == 1 || currentState == 2) {
		    	currentState = 3;
		    }
		    else {
		        currentState++;
		    }
		}  
		
	}
	public void checkMatch(int r, int c, int p) {
		for (int i = 0; i<grid.length; i++) {
			for (int j=0; j<grid[i].length; j++){
				
			}
		}
	}
public void updateMenuState() {
		
	}
	public void updateGameState() {
		
	}
	public void updateEndState() {
		
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
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	
	
	
}
