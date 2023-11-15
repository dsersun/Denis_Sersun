CREATE TABLE departments
(
    department_id   INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees
(
    employee_id   INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments (department_id)
);

CREATE TABLE projects
(
    project_id   INT PRIMARY KEY,
    project_name VARCHAR(50)
);


CREATE TABLE employee_projects
(
    employee_id INT,
    project_id  INT,
    FOREIGN KEY (employee_id) REFERENCES employees (employee_id),
    FOREIGN KEY (project_id) REFERENCES projects (project_id)
);

-- Insert Data into tables

INSERT INTO departments (department_id, department_name)
VALUES (1, 'Finance'),
       (2, 'Human Resources'),
       (3, 'IT'),
       (4, 'Marketing'),
       (5, 'Operations');

INSERT INTO employees (employee_id, employee_name, department_id)
VALUES (101, 'John Doe', 1),
       (102, 'Jane Smith', 2),
       (103, 'Alex Johnson', 3),
       (104, 'Emily Davis', 4),
       (105, 'Michael Brown', 5),
       (106, 'Michael Smith', null);

INSERT INTO projects (project_id, project_name)
VALUES (501, 'Financial Software'),
       (502, 'Employee Training Program'),
       (503, 'Database Optimization'),
       (504, 'Product Launch'),
       (505, 'Supply Chain Management');

INSERT INTO employee_projects (employee_id, project_id)
VALUES (101, 501),
       (102, 502),
       (103, 503),
       (104, 504),
       (105, 505);