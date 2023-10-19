INSERT INTO branch (id, name) VALUES (1,'Panadura'),(2,'Galle');

INSERT INTO employment_status (id, status) VALUES (1,'Permanent'),(2,'Probationary'),(3,'Contract Employment');


INSERT INTO employee (id, password, name, nic, role, username, contact, branch_id, employment_status)
VALUES ('IJSE231001', '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9', 'Nilan Dinushka',
        '951511617V', 'Admin', 'admin', '0715189370', 1, 1);
