package be.vdab.adapter;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

class MuisActieBijClickApart extends MouseAdapterApart{
    @Override
    public void mouseClicked(MouseEvent me) {
        String zin = String.format("De coordinaten van deze positie: X = %d, Y= %d",me.getX(),+me.getY());
        JOptionPane.showMessageDialog(new Venster(),zin,"Positie op het scherm", JOptionPane.INFORMATION_MESSAGE);
    }        
}
