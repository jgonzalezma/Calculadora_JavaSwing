import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField pantalla;
	double resultado;
	String operacion;
	boolean nuevaOperacion = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Metodo para hacer las operaciones
	
	double num, ans;
	int calculo;
	
	public static String fmt(double d)
	{
	    if(d == (long) d)
	        return String.format("%d",(long)d);
	    else
	        return String.format("%s",d);
	}
	
	public void operacion_aritmetica() {
		switch (calculo) {
		case 1: // Sumar
			ans = num + Double.parseDouble(pantalla.getText());
			fmt(ans);
			pantalla.setText(Double.toString(ans));
			break;
			
		case 2: // Restar
			ans = num - Double.parseDouble(pantalla.getText());
			pantalla.setText(Double.toString(ans));
			break;
			
		case 3: // Multiplicar
			ans = num * Double.parseDouble(pantalla.getText());
			pantalla.setText(Double.toString(ans));
			break;
			
		case 4: // Dividir
			ans = num / Double.parseDouble(pantalla.getText());
			pantalla.setText(Double.toString(ans));
			break;

		default:
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	
	public Calculadora() {
		super("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setBackground(Color.LIGHT_GRAY);
		pantalla.setBounds(28, 26, 236, 44);
		contentPane.add(pantalla);
		pantalla.setColumns(10);
		
		JLabel jlabel = new JLabel("");
		jlabel.setForeground(Color.RED);
		jlabel.setBounds(216, 11, 46, 14);
		contentPane.add(jlabel);
		
		JButton btn_c = new JButton("C");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText("");
				jlabel.setText("");
			}
		});
		
		btn_c.setBounds(158, 81, 48, 38);
		contentPane.add(btn_c);
		
		JButton btn_sumar = new JButton("+");
		btn_sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(pantalla.getText());
				calculo = 1;
				pantalla.setText("");
				jlabel.setText(num + " +");
			}
		});
		
		btn_sumar.setBounds(216, 81, 48, 38);
		contentPane.add(btn_sumar);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "7");
			}
		});
		
		btn_7.setBounds(28, 130, 48, 38);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "8");
			}
		});
		
		btn_8.setBounds(93, 130, 48, 38);
		contentPane.add(btn_8);
		
		JButton btn_restar = new JButton("-");
		btn_restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(pantalla.getText());
				calculo = 2;
				pantalla.setText("");
				jlabel.setText(num + " -");
			}
		});
		
		btn_restar.setBounds(216, 130, 48, 38);
		contentPane.add(btn_restar);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "9");
			}
		});
		
		btn_9.setBounds(158, 130, 48, 38);
		contentPane.add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "4");
			}
		});
		
		btn_4.setBounds(28, 179, 48, 38);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "5");
			}
		});
		
		btn_5.setBounds(93, 179, 48, 38);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "6");
			}
		});
		
		btn_6.setBounds(158, 179, 48, 38);
		contentPane.add(btn_6);
		
		JButton btn_multiplicar = new JButton("*");
		btn_multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(pantalla.getText());
				calculo = 3;
				pantalla.setText("");
				jlabel.setText(num + " *");
			}
		});
		
		btn_multiplicar.setBounds(216, 179, 48, 38);
		contentPane.add(btn_multiplicar);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "1");
			}
		});
		
		btn_1.setBounds(28, 228, 48, 38);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "2");
			}
		});
		
		btn_2.setBounds(93, 228, 48, 38);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "3");
			}
		});
		
		btn_3.setBounds(158, 228, 48, 38);
		contentPane.add(btn_3);
		
		JButton btn_dividir = new JButton("/");
		btn_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(pantalla.getText());
				calculo = 4;
				pantalla.setText("");
				jlabel.setText(num + " /");
			}
		});
		
		btn_dividir.setBounds(216, 228, 48, 38);
		contentPane.add(btn_dividir);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + "0");
			}
		});
		
		btn_0.setBounds(28, 277, 48, 38);
		contentPane.add(btn_0);
		
		JButton btn_coma = new JButton(".");
		btn_coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText() + ".");
			}
		});
		
		btn_coma.setBounds(93, 277, 48, 38);
		contentPane.add(btn_coma);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacion_aritmetica();
			}
		});
		
		btn_igual.setBounds(158, 277, 106, 38);
		contentPane.add(btn_igual);
		
		JButton btn_backspace = new JButton("<---");
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = pantalla.getText().length();
				int number = pantalla.getText().length() -1;
				String store;
				
				if(length > 0) {
					StringBuilder back = new StringBuilder(pantalla.getText());
					back.deleteCharAt(number);
					store = back.toString();
					pantalla.setText(store);
				}
			}
		});
		
		btn_backspace.setBounds(28, 81, 113, 38);
		contentPane.add(btn_backspace);
	
	}
	
}
