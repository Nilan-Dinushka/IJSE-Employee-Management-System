package lk.ijse.dep11.EAS.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginFormController {
    public AnchorPane root;
    public TextField txtId;
    public PasswordField txtPassword;
    public JFXButton btnLogin;
    public Hyperlink lnkForgotPassword;

    public void btnLoginOnAction(ActionEvent actionEvent) {
    }

    public void lnkForgotPasswordOnAction(ActionEvent actionEvent) {
    }

    private boolean isDataValid(){
        return true;
    }
}
