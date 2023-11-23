package ventana;

import modelo.Empresa;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    Empresa empresa;

    JTextField textFieldNombre, textFieldApellido, textFieldRut, textFieldIsapre, textFieldAfp;

    JButton botonAgregar, botonBuscar, botonEliminar;


    public Ventana(Empresa empresa){

        this.empresa = empresa;

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

        if(e.getSource()==botonAgregar){

            if ((empresa.trabajadorExiste(textFieldRut.getText())==false)){

                Trabajador trabajador = new Trabajador(textFieldNombre.getText(), textFieldApellido.getText(), textFieldRut.getText(), textFieldIsapre.getText(), textFieldAfp.getText());
                empresa.agregarTrabajador(trabajador);

            }else {
                JOptionPane.showMessageDialog(null, "ESTE TRABAJADOR YA EXISTE!!?","Error critico",JOptionPane.ERROR_MESSAGE);
            }

            Trabajador trabajador = new Trabajador(textFieldNombre.getText(), textFieldApellido.getText(), textFieldRut.getText(), textFieldIsapre.getText(), textFieldAfp.getText());
            empresa.agregarTrabajador(trabajador);

        }

        if (e.getSource()==botonBuscar){

            String rutTrabajador = JOptionPane.showInputDialog("Ingrese el rut del trabajador");

            if ((empresa.trabajadorExiste(rutTrabajador)==false)){
                JOptionPane.showMessageDialog(null,"TRABAJADOR NO ENCONTRADO!!!","Error", JOptionPane.ERROR_MESSAGE);
            }else {

                String[] opciones = {"OK", "Eliminar Trabajador"};
                int eliminar = JOptionPane.showOptionDialog(null,(empresa.buscarTrabajador(rutTrabajador)).mostrarDatos(),"Informacion del trabajador", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, 0);

                if (eliminar==1){

                    empresa.eliminarTrabajador(rutTrabajador);
                    JOptionPane.showMessageDialog(null, "El trabajador ha sido eliminado","Eliminar Trabajador",JOptionPane.WARNING_MESSAGE);

                }
            }




            /*

            if ((empresa.trabajadorExiste(textFieldRut.getText())==false)){
                JOptionPane.showMessageDialog(null,"TRABAJADOR NO ENCONTRADO!!!","Error", JOptionPane.ERROR_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "Trabajador encontrado :"+(empresa.buscarTrabajador(textFieldRut.getText()).toString()),"Busqueda",JOptionPane.INFORMATION_MESSAGE);
            }*/
        }

        if (e.getSource()==botonEliminar){

            /*

            if ((empresa.trabajadorExiste(textFieldRut.getText())==false)){
                JOptionPane.showMessageDialog(null,"TRABAJADOR NO ENCONTRADO!","Error", JOptionPane.ERROR_MESSAGE);
            }else {
                empresa.eliminarTrabajador(textFieldRut.getText());
                JOptionPane.showMessageDialog(null, "El trabajador ha sido eliminado","Eliminar Trabajador",JOptionPane.WARNING_MESSAGE);
            }*/

        }

    }
}
