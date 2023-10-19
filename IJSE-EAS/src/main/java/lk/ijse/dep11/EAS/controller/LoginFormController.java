package lk.ijse.dep11.EAS.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.dep11.EAS.db.EmployeeDataAccess;
import lk.ijse.dep11.EAS.db.SingleConnectionDataSource;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFormController {
    public AnchorPane root;
    public TextField txtId;
    public PasswordField txtPassword;
    public JFXButton btnLogin;
    public Hyperlink lnkForgotPassword;
    public ResultSet rst;

    public void initialize(){

    }

    public void btnLoginOnAction(ActionEvent actionEvent) {
        String id = txtId.getText().strip();
        String password = txtPassword.getText().strip();
        try {
            rst = EmployeeDataAccess.getUser(id, DigestUtils.sha256Hex(password));
            if(rst.next()){
                String role = rst.getString("role");
                navigateToApp(role);
            }else{
                new Alert(Alert.AlertType.ERROR,"Access Denied: Invalid login credentials").show();
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void lnkForgotPasswordOnAction(ActionEvent actionEvent) {
    }


    private void navigateToApp(String role) throws IOException {
        Stage stage = new Stage();
        if(role.equals("Admin")){
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminPanel.fxml"))));
        }
        stage.setTitle("IJSE Employee Attendance System");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
        ((Stage)(root.getScene().getWindow())).close();

    }
}
