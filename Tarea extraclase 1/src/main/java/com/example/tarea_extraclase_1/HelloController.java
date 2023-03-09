package com.example.tarea_extraclase_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class HelloController  implements Initializable {
    // controladores de la aplicacion
    @FXML
    private TextField nombre;

    @FXML TextField edad;

    @FXML
    private Button agregarp;


    // listas para guardar los nombres
    private List<String> persona1 = new ArrayList<String>();
    private List<String> persona2 = new ArrayList<String>();
    private List<String> persona3 = new ArrayList<String>();
    private List<String> persona4 = new ArrayList<String>();


    //Enteros para guardar la edad
    private int persona1n;
    private int persona2n;
    private int persona3n;
    private int persona4n;
    private int contador;


    // Boton donde se guarda la informacion de las personas
    @FXML
    private void personam(ActionEvent event) {
        if (contador == 0) {
            persona1.add(0,nombre.getText());
            persona1n += Integer.parseInt(edad.getText());
            nombre.setText(null);
            edad.setText(null);
            contador += 1;
        }
        if (contador == 1) {
            persona2.add(0,nombre.getText());
            persona2n += Integer.parseInt(edad.getText());
            nombre.setText(null);
            contador += 1;
        }

        if (contador == 2) {
            persona3.add(0,nombre.getText());
            System.out.println(persona3);
            persona3n += Integer.parseInt(edad.getText());
            nombre.setText(null);
            edad.setText(null);
            contador += 1;
        }

        if (contador == 3) {
            persona4.add(0,nombre.getText());
            persona4n = Integer.parseInt(edad.getText());
            nombre.setText(null);
            edad.setText(null);
            contador += 1;


            }
        }



    //Controladores

    @FXML
    private ChoiceBox p1;
    @FXML
    private ChoiceBox p2;

    private  String[] per = {persona1.toString(), persona2.toString(), persona3.toString(), persona4.toString()};

    private int[] num = {persona1n,persona2n,persona3n,persona4n};
    @FXML
    private ChoiceBox provincias;

    // lista con las provincias

    private String[] prov = {"San Jose","Limon","Heredia","Cartago","Alajuela","Guanacaste","Puntarenas"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        provincias.getItems().addAll(prov);
        p1.getItems().addAll(num);
        p2.getItems().addAll(num);
    }
    private Label result;

    // operaciones
    /*
    private void suma(ActionEvent event){
        result.setText((p1 + p2));

    }
    private void resta(ActionEvent event){
        result.setText((p1 - p2));

    }
    private void multi(ActionEvent event){
        result.setText((p1 * p2));

    }
    private void div(ActionEvent event){
        result.setText((p1 / p2));

    }

     */

}
