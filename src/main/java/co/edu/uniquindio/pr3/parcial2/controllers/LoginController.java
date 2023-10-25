package co.edu.uniquindio.pr3.parcial2.controllers;

public class LoginController {

    public ModelFactoryController mfm;
    public LoginController(){
        System.out.println("Llamado al singleton desde Mi cuenta");
        mfm=  ModelFactoryController.getInstance();
    }
}
