package Classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class BackGround extends JDesktopPane {
    
    private Image imagem;
    
    public BackGround() {
    }
    
    public BackGround(String img) {
        if (img != null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        }
    }
    public BackGround(Image imagemInicial) {
        if (imagemInicial != null) {
            imagem = imagemInicial;
        }
    }
    public void setImagem(String img) {
        if (img != null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        } else{
            imagem = null;
        }
        repaint();
    }
    public void setImagem(Image novaImagem) {
        imagem = novaImagem;
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        if (imagem != null) {
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }
} 
