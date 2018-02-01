package be.vdab.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Venster extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public Venster(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addMouseListener(new MuisActieBijClick());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class MuisActieBijClick extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent me) {
            String zin = String.format("De coordinaten van deze positie: X = %d, Y= %d",me.getX(),+me.getY());
            JOptionPane.showMessageDialog(Venster.this,zin,"Positie op het scherm", JOptionPane.INFORMATION_MESSAGE);
        }        
    }
}