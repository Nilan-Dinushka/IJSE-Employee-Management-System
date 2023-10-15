CREATE TABLE IF NOT EXISTS branch
(
    id
    SERIAL
    PRIMARY
    KEY,
    name
    VARCHAR
(
    200
) NOT NULL
    );

CREATE TABLE IF NOT EXISTS employment_status
(
    id
    SERIAL
    PRIMARY
    KEY,
    status
    VARCHAR
(
    30
) NOT NULL
    );



CREATE TABLE IF NOT EXISTS employee
(
    id VARCHAR
(
    20
) PRIMARY KEY,
    password VARCHAR
(
    300
) NOT NULL,
    name VARCHAR
(
    200
) NOT NULL,
    nic VARCHAR
(
    20
) UNIQUE NOT NULL,
    role VARCHAR
(
    10
) NOT NULL,
    username VARCHAR
(
    12
) UNIQUE NOT NULL,
    contact VARCHAR
(
    15
) NOT NULL,
    branch_id INT NOT NULL,
    employment_status INT NOT NULL,
    CONSTRAINT fk_employee1 FOREIGN KEY
(
    branch_id
) REFERENCES branch
(
    id
),
    CONSTRAINT fk_employee2 FOREIGN KEY
(
    employment_status
) REFERENCES employment_status
(
    id
)
    );

CREATE TABLE IF NOT EXISTS termination_requests
(
    id
    SERIAL
    PRIMARY
    KEY,
    employee_id
    VARCHAR
(
    20
) NOT NULL,
    requested_by VARCHAR
(
    20
) NOT NULL,
    status VARCHAR
(
    20
) NOT NULL,
    reason VARCHAR
(
    1000
) NOT NULL,
    request_date DATE NOT NULL,
    CONSTRAINT fk1_termination_requests1 FOREIGN KEY
(
    employee_id
) REFERENCES employee
(
    id
),
    CONSTRAINT fk1_termination_requests2 FOREIGN KEY
(
    requested_by
) REFERENCES employee
(
    id
)
    );

CREATE TABLE IF NOT EXISTS attendance
(
    id
    SERIAL
    PRIMARY
    KEY,
    employee_id
    VARCHAR
(
    20
) NOT NULL,
    type VARCHAR
(
    5
) NOT NULL,
    time_stamp TIMESTAMP NOT NULL,
    CONSTRAINT fk_attendance FOREIGN KEY
(
    employee_id
) REFERENCES employee
(
    id
)
    );

CREATE TABLE IF NOT EXISTS profile_picture
(
    employee_id VARCHAR
(
    20
) PRIMARY KEY,
    picture BYTEA NOT NULL,
    CONSTRAINT fk_profile_picture FOREIGN KEY
(
    employee_id
) REFERENCES employee
(
    id
)
    );

CREATE TABLE IF NOT EXISTS reset
(
    it_employee_id VARCHAR
(
    20
) NOT NULL,
    employee_id VARCHAR
(
    20
) NOT NULL,
    time_stamp TIMESTAMP NOT NULL,
    CONSTRAINT fk_reset1 FOREIGN KEY
(
    it_employee_id
) REFERENCES employee
(
    id
),
    CONSTRAINT fk_reset2 FOREIGN KEY
(
    employee_id
) REFERENCES employee
(
    id
)
    );