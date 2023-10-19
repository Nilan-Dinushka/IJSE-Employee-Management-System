package lk.ijse.dep11.EAS.db;

import lk.ijse.dep11.EAS.tm.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataAccess {
    private static final PreparedStatement STM_INSERT;
    private static final PreparedStatement STM_UPDATE;
    private static final PreparedStatement STM_DELETE;
    private static final PreparedStatement STM_GET_ROLE;
    private static final PreparedStatement STM_GET_NAME;
    private static final PreparedStatement STM_GET_ALL;
    private static final PreparedStatement STM_GET_LAST_ID;
    private static final PreparedStatement STM_GET_USER;

    static {

        try {
            Connection connection = SingleConnectionDataSource.getInstance().getConnection();
            STM_INSERT = connection.prepareStatement("INSERT INTO employee (id, password, name, nic, role, username, contact, branch_id, employment_status) VALUES (?,?,?,?,?,?,?,?,?,?)");
            STM_UPDATE = connection.prepareStatement("UPDATE employee SET password=?,name=?,nic=?,role=?,username=?,contact=?,branch_id=?,employment_status=? WHERE id=?");
            STM_DELETE = connection.prepareStatement("DELETE FROM employee WHERE id=?");
            STM_GET_ROLE = connection.prepareStatement("SELECT role FROM employee WHERE username=?");
            STM_GET_NAME = connection.prepareStatement("SELECT name FROM employee WHERE username=?");
            STM_GET_ALL = connection.prepareStatement("SELECT * FROM employee ORDER BY id");
            STM_GET_LAST_ID = connection.prepareStatement("SELECT id FROM employee ORDER BY id DESC FETCH FIRST ROW ONLY");
            STM_GET_USER = connection.prepareStatement("SELECT * FROM employee WHERE id=? AND password=?");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> getAllEmployee() throws SQLException {
        ResultSet rst = STM_GET_ALL.executeQuery();
        ArrayList<Employee> employeeList = new ArrayList<>();
        while(rst.next()){
            String id = rst.getString("id");
            String password = rst.getString("password");
            String name = rst.getString("name");
            String nic = rst.getString("nic");
            String role = rst.getString("role");
            String username = rst.getString("username");
            String contact = rst.getString("contact");
            int branch_id = rst.getInt("branch_id");
            String employment_status = rst.getString("employment_status");
            employeeList.add(new Employee(id,name,username,password,nic,role,contact,branch_id,employment_status));
        }
        return employeeList;

    }

    public static ResultSet getUser(String id,String password) throws SQLException {
        STM_GET_USER.setString(1,id);
        STM_GET_USER.setString(2,password);
        ResultSet rst = STM_GET_USER.executeQuery();
        return rst;
    }
}
