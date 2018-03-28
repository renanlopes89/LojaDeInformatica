package br.edu.etec.lojainformatica;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

//import br.edu.etec.lojainformatica.model.Cliente;
//import br.edu.etec.lojainformatica.persistence.ClienteJdbcDAO;
//import br.edu.etec.lojainformatica.persistence.JdbcUtil;

public class TelaCadClientes {

	//Cliente cliente = new Cliente();
	
	JLabel lbNome = new JLabel("Nome");
	JTextField txtNome = new JTextField();
	
	JLabel lbEndereco = new JLabel("Endereço");
	JTextField txtEndereco = new JTextField();
	
	JLabel lbFone = new JLabel("Fone");
	JTextField txtFone = new JTextField();
	
	JLabel lbEmail = new JLabel("Email");
	JTextField txtEmail = new JTextField();
	
	public TelaCadClientes() {
		super(4, 2);
		
		this.painelParaCampos.add(lbNome);
		this.painelParaCampos.add(txtNome);
		
		this.painelParaCampos.add(lbEndereco);
		this.painelParaCampos.add(txtEndereco);
		
		this.painelParaCampos.add(lbFone);
		this.painelParaCampos.add(txtFone);
		
		this.painelParaCampos.add(lbEmail);
		this.painelParaCampos.add(txtEmail);
		System.out.println("terminando de adicionar os campos, add afora um actionlistener");

		
	}	
	
}
