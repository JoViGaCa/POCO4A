package Lista2ex10;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;

public class Principal extends JFrame {
	private static Principal p;
	private JTextField campo1, campo2, campo3;
	private JLabel texto1, texto2, texto3, texto4;
	private static Font font;
	

	public Principal() {
		super("Construa sua História");
		setLayout(new FlowLayout());

		texto1 = new JLabel("Uma vez uma criança chamada");
		texto1.setFont(font);
		add(texto1);		
		
		campo1 = new JTextField("Digite um nome", 10); //10 colunas
		campo1.setFont(font); 
		add(campo1);
		
		texto2 = new JLabel("encontrou uma varinha mágica e conjurou");
		texto2.setFont(font);
		add(texto2);
		
		campo2 = new JTextField("Digite uma magia:", 10);
		campo2.setFont(font);
		add(campo2);
		
		texto3 = new JLabel(". Mas a magia saiu do controle e foi para a cidade. Então a criaça");
		texto3.setFont(font);
		add(texto3);
		
		campo3 = new JTextField("Digite uma solução:", 10);
		campo3.setFont(font);
		add(campo3);
		
		texto4 = new JLabel(". Assim, a criaça salvou a cidade e ninguém se machucou");
		texto4.setFont(font);
		add(texto4);
		
		
	}
	
	public static Principal getInstance() {
		if( p == null) {
			p = new Principal();
		}
		return p;
	}
	
	public static void main(String [] args) {
		font = new Font("Arial", Font.PLAIN, 12);
		getInstance();
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(450,300);
		p.setVisible(true);
		
	}

}
