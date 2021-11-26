package lista2ex9;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;

public class RadioButton extends JFrame{
	
	private JRadioButton manha, tarde, noite, frio, calor;
	private JLabel label, label2;
	private Handler handler;
	private ButtonGroup g1, g2;
	
	
	
	public RadioButton(){
		super("Super teste de personalidade");
		
		setLayout(new FlowLayout());
		
		handler = new Handler();
		
		label = new JLabel("Qual parte do dia você prefere?");
		manha = new JRadioButton("Manhã", false);
		tarde = new JRadioButton("Tarde", false);
		noite = new JRadioButton("Noite", false);
		
		add(label);
		add(manha);
		add(tarde);
		add(noite);
		
		manha.addItemListener(handler);
		tarde.addItemListener(handler);
		noite.addItemListener(handler);
		
		label2 = new JLabel("Você prefere frio ou calor?");
		calor = new JRadioButton("Calor", false);
		frio = new JRadioButton("Frio", false);
		
		add(label2);
		add(calor);
		add(frio);
		
		g1 = new ButtonGroup();
		g1.add(manha);
		g1.add(tarde);
		g1.add(noite);
		
		g2 = new ButtonGroup();
		g2.add(calor);
		g2.add(frio);
		
		calor.addItemListener(handler);
		frio.addItemListener(handler);
		
	}

	private class Handler implements ItemListener{
		
		public void itemStateChanged(ItemEvent event){
			if(manha.isSelected() && calor.isSelected()){
				JOptionPane.showMessageDialog(null,"Você é uma pessoa diurna e friorenta.");
			}if(tarde.isSelected() && calor.isSelected()){
				JOptionPane.showMessageDialog(null,"Você curte a parte do meio do dia e é friorento(a).");
			}if(noite.isSelected() && calor.isSelected()){
				JOptionPane.showMessageDialog(null,"Você é uma pessoa noturna e friorenta.");
			}if(manha.isSelected() && frio.isSelected()){
				JOptionPane.showMessageDialog(null,"Você é uma pessoa diurna e calorenta.");
			}if(tarde.isSelected() && frio.isSelected()){
				JOptionPane.showMessageDialog(null,"Você curte a parte do meio do dia e é calorento(a).");
			}if(noite.isSelected() && frio.isSelected()){
				JOptionPane.showMessageDialog(null,"Você é uma pessoa noturna e calorenta.");
			}
		}
		
	}
	
}
