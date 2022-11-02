import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class swing implements ActionListener, MouseListener {

	swing() {

		JFrame frame = new JFrame();
		JButton button = new JButton("try me !");

		button.setBounds (130, 100, 100, 40);
		button.addActionListener(this);
		button.addMouseListener(this);

		frame.add(button);
		frame.setSize (400, 500);

		frame.setLayout(null);
		frame.setVisible(true);

	}

	public static void main(String args[])
	{
		swing object = new swing();
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("okey");
	}

	public void actionPerformed(MouseEvent e)
	{
		System.out.println("okey with mouse!");
	}

	public void mouseEntered(MouseEvent e)
	{
		System.out.println("enter mouse");
	}

	public void mouseExited(MouseEvent e)
	{
		System.out.println("exit mouse");
	}

	public void mouseReleased(MouseEvent e)
	{
		System.out.println("release mouse");
	}

	public void mousePressed(MouseEvent e)
	{
		System.out.println("PRESSED MOUSE!");
	}
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("CLICKED MOUSE !");
	}

}
