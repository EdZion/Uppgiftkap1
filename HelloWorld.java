import javax.swing.*;
import java.awt.*;
import java.util.*;
public class HelloWorld {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Datum och Tid:"+
		"\n" + Calendar.getInstance().getTime().toString());
		
		} 
}