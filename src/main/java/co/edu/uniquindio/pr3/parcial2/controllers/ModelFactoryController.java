package co.edu.uniquindio.pr3.parcial2.controllers;

import co.edu.uniquindio.pr3.parcial2.viewControllers.LoginViewController;

public class ModelFactoryController {

    private LoginViewController loginViewController;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();

    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    //--------------FUNCIONES PARA EL INICIO DE LA APLICACION------------------
    public void initLoginViewController(LoginViewController loginViewController){
        this.loginViewController=loginViewController;
    }
}
