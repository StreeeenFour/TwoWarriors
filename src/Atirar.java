package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Atirar {

	private Image missel;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;

	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 5;

	public Atirar(int x, int y) {

		this.x = x;
		this.y = y;

		ImageIcon referencia = new ImageIcon("src/ImageDisplay/missel.png");
		missel = referencia.getImage();
                
		this.largura = missel.getWidth(null);
		this.altura = missel.getHeight(null);
		
		isVisivel = true;
	}

	public void mexer(){
		
		this.x += VELOCIDADE;
		if(this.x > LARGURA_TELA){
			isVisivel = false;
		}
		
	}
	
	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return missel;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x, y, largura, altura);
	}

	
}
