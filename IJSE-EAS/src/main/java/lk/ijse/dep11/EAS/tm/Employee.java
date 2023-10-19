package lk.ijse.dep11.EAS.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee implements Serializable {
    private String id;
    private String name;
    private String username;
    private String password;
    private String nic;
    private String role;
    private String contact;
    private int branch_id;
    private String employment_status;
}
