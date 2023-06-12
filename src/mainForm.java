import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;
    private Menu m= new Menu();
    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textIngresoCalorias.getText().isEmpty()&&!textIngresoNombre.getText().isEmpty()&&!textIngresoPrecio.getText().isEmpty()
                        &&!textIngresoPreparacion.getText().isEmpty()){
                    if( m.AñadirPlato(textIngresoNombre.getText(),Double.parseDouble(textIngresoPrecio.getText()),Integer.parseInt(textIngresoCalorias.getText())
                            ,Integer.parseInt(textIngresoPreparacion.getText()))){
                        textAIngresoPlatos.setText(m.BusquedaNombre(textIngresoNombre.getText()).toString());
                    }else{
                        textAIngresoPlatos.setText("Ya existe un plato con ese nombre plato");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Llene todos los datos");
                }
            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.AñadirPlato("Arroz",1.1,100,35);
                m.AñadirPlato("Pizza",2.5,1500,30);
                m.AñadirPlato("Hambuerguesa",2.0,2000,20);
                m.AñadirPlato("Carne asada",5.0,500,60);
                m.AñadirPlato("Pastel",1.0,300,40);
                textAIngresoPlatos.setText(m.toString());
        }});
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(!textoModifNombre.getText().isEmpty()) {
                Plato x = m.BusquedaNombre(textoModifNombre.getText());

                if (x != null) {
                    textoModifCalorias.setText(String.valueOf(x.getCalorias()));
                    textoModifPrecio.setText(String.valueOf(x.getPrecio()));
                    textoModifPreparacion.setText(String.valueOf(x.getTiempoprep()));
                    textoModifCalorias.setEditable(true);
                    textoModifPreparacion.setEditable(true);
                    textoModifPrecio.setEditable(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe ese plato, ingrese un nombre valido");
                    textoModifCalorias.setEditable(false);
                    textoModifPreparacion.setEditable(false);
                    textoModifPrecio.setEditable(false);
                }
            }else{
            JOptionPane.showMessageDialog(null,"Ingrese el nombre de un plato");}
            }
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(m.ModificarPlato(textoModifNombre.getText(),Double.parseDouble(textoModifPrecio.getText()),
                        Integer.parseInt(textoModifCalorias.getText()),Integer.parseInt(textoModifPreparacion.getText()))){
                   textAModif.setText(m.BusquedaNombre(textoModifNombre.getText()).toString());
                    textoModifCalorias.setEditable(false);
                    textoModifPreparacion.setEditable(false);
                    textoModifPrecio.setEditable(false);
                    textoModifCalorias.setText("");
                    textoModifPreparacion.setText("");
                    textoModifPrecio.setText("");
                }
            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Plato x= m.BusquedaNombre(textNombreEliminar.getText());
               textAEliminar.setText(x.toString());
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(m.EliminarPlato(textNombreEliminar.getText())){
                textAEliminar.setText("Se eliminó el plato");
            }else {
                JOptionPane.showMessageDialog(null,"Ingrese un nombre correcto");
            }
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }
}
