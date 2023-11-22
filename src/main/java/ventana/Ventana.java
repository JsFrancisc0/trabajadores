package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JTextField textFieldNombre, textFieldApellido, textFieldRut, textFieldIsapre, textFieldAfp;

    JButton botonAgregar, botonBuscar, botonEliminar;


    public Ventana(){


        textFieldNombre = new JTextField("Nombre");
        textFieldNombre.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
        //textFieldNombre.setPreferredSize(new Dimension(250,40));
        textFieldNombre.setBounds(120,50,390,40);

        textFieldApellido = new JTextField("Apellido");
        textFieldApellido.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
        //textField.setPreferredSize(new Dimension(250,40));
        textFieldApellido.setBounds(120,110,390,40);

        textFieldRut = new JTextField("Rut");
        textFieldRut.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
        //textField.setPreferredSize(new Dimension(250,40));
        textFieldRut.setBounds(120,170,390,40);

        textFieldIsapre = new JTextField("Isapre");
        textFieldIsapre.setFont(new Font("Comic Sans MS",Font.PLAIN,25));
        //textField.setPreferredSize(new Dimension(250,40));
        textFieldIsapre.setBounds(120,230,390,40);

        textFieldAfp = new JTextField("Afp");
        textFieldAfp.setFont(new Font("Comic Sans MS",Font.PLAIN,27));
        //textField.setPreferredSize(new Dimension(250,40));
        textFieldAfp.setBounds(120,290,390,40);



        botonAgregar = new JButton("Agregar");
        botonAgregar.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        botonAgregar.setBounds(50,360,120,50);
        botonAgregar.addActionListener(this);

        botonBuscar = new JButton("Buscar");
        botonBuscar.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        botonBuscar.setBounds(180,360,120,50);
        botonBuscar.addActionListener(this);

        botonEliminar = new JButton("Eliminar");
        botonEliminar.setFont(new Font("Comic Sans MS",Font.BOLD,15));
        botonEliminar.setBackground(new Color(210,50,50));
        botonEliminar.setBounds(480,360,120,50);
        botonEliminar.addActionListener(this);



        this.setTitle("Trabajadores");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(textFieldNombre);
        this.add(textFieldApellido);
        this.add(textFieldRut);
        this.add(textFieldIsapre);
        this.add(textFieldAfp);
        this.add(botonAgregar);
        this.add(botonBuscar);
        this.add(botonEliminar);
        this.setSize(640,480);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}