package lk.ijse.dep11.EAS.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class AdminPanelController {
    public AnchorPane navForm2;
    public AnchorPane navForm;
    public Button btnDashboard;
    public Button btnManageEmployees;
    public Button btnTerminationRequests;
    public Button btnAttendanceReport;
    public Button btnManageBranches;
    public Button btnResetEmployees;
    public Button btnEmploymentStatus;
    public Button btnLogout;
    public AnchorPane root;
    public Button btnHome;
    public AnchorPane rootHome;
    public AnchorPane rootDashboard;
    public AnchorPane rootManageEmployees;
    public AnchorPane rootTerminationRequests;
    public AnchorPane rootAttendanceReport;
    public AnchorPane rootManageBranches;
    public AnchorPane rootEmployeeStatus;
    public AnchorPane rootResetEmployee;

    public void initialize(){
        btnHome.fire();
    }


    public void btnDashboardOnAction(ActionEvent actionEvent) throws IOException {
        btnDashboard.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        //btnDashboard.setStyle("-fx-animated: scale(10%)");
        Button[] buttons = {btnHome,btnManageBranches,btnEmploymentStatus,btnManageEmployees,btnAttendanceReport,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        AnchorPane load = FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"));
        root.getChildren().add(0,load);

        rootDashboard.setVisible(true);
        AnchorPane[] anchorPanes = {rootHome,rootResetEmployee,rootManageBranches,rootManageEmployees,rootEmployeeStatus,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnManageEmployeesOnAction(ActionEvent actionEvent) {
        btnManageEmployees.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnManageBranches,btnEmploymentStatus,btnDashboard,btnAttendanceReport,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootManageEmployees.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageBranches,rootHome,rootEmployeeStatus,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnTerminationRequestsOnAction(ActionEvent actionEvent) {
        btnTerminationRequests.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnManageBranches,btnEmploymentStatus,btnManageEmployees,btnAttendanceReport,btnResetEmployees,btnDashboard};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootTerminationRequests.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageBranches,rootHome,rootEmployeeStatus,rootAttendanceReport,rootManageEmployees};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnAttendanceReportOnAction(ActionEvent actionEvent) {
        btnAttendanceReport.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnManageBranches,btnEmploymentStatus,btnManageEmployees,btnDashboard,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootAttendanceReport.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageBranches,rootHome,rootEmployeeStatus,rootManageEmployees,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnManageBranchesOnAction(ActionEvent actionEvent) {
        btnManageBranches.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnDashboard,btnEmploymentStatus,btnManageEmployees,btnAttendanceReport,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootManageBranches.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageEmployees,rootHome,rootEmployeeStatus,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnResetEmployeesOnAction(ActionEvent actionEvent) {
        btnResetEmployees.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnManageBranches,btnEmploymentStatus,btnManageEmployees,btnAttendanceReport,btnDashboard,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootResetEmployee.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootManageBranches,rootHome,rootEmployeeStatus,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnEmployementStatusOnAction(ActionEvent actionEvent) {
        btnEmploymentStatus.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnHome,btnManageBranches,btnDashboard,btnManageEmployees,btnAttendanceReport,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootEmployeeStatus.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageBranches,rootHome,rootManageEmployees,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }

    public void btnLogoutOnAction(ActionEvent actionEvent) {

    }

    public void btnHomeOnAction(ActionEvent actionEvent) {
        btnHome.setStyle("-fx-background-color: linear-gradient(to bottom right,#ef2828,#ffffff)");
        Button[] buttons = {btnEmploymentStatus,btnManageBranches,btnDashboard,btnManageEmployees,btnAttendanceReport,btnResetEmployees,btnTerminationRequests};
        for (Button button : buttons) {
            button.setStyle("-fx-background-color: transparent");
        }
        rootHome.setVisible(true);
        AnchorPane[] anchorPanes = {rootDashboard,rootResetEmployee,rootManageBranches,rootManageEmployees,rootEmployeeStatus,rootAttendanceReport,rootTerminationRequests};
        for (AnchorPane anchorPane : anchorPanes) {
            anchorPane.setVisible(false);
        }
    }
}
