/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inpos.tools;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.JPanel;
/**
 *
 * @author Ogat Dezaign
 */
public class PanelBulat extends JPanel{
    private Color col;
    private GradientPaint paint;
    private Double shape;
    
    public PanelBulat() {
        setOpaque(false);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr=(Graphics2D)g.create();
        gr.setColor(col);
//        gr.fillRect(0, 0, getWidth(), getHeight());
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 120, 80);
        gr.fill(shape);
        gr.dispose();
    }


    
}
