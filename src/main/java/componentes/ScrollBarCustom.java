package componentes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar{
    
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(217,147,200)); //Color Barra Scroll
        setBackground(new Color(255,102,102));//Fondo Scroll
        System.out.println("");
    }
    
}
