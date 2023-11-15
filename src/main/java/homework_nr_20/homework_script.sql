-- a. Получите список всех сотрудников и соответствующих названий их департаментов.
SELECT employee_name, department_name
FROM employees
         INNER JOIN departments d ON d.department_id = employees.department_id;

--  Получите имена сотрудников, которые не прикреплены к какому-либо департаменту.
-- using join, as correct example:
SELECT employees.employee_name
FROM employees
         LEFT JOIN departments ON employees.department_id = departments.department_id
WHERE departments.department_id IS NULL;

-- more simple example, but this not verify attributing department.
SELECT employee_name
from employees
where employees.department_id IS NULL;

--  Отобразите названия проектов вместе с именами сотрудников, работающих над каждым проектом.
SELECT employees.employee_name, projects.project_name
FROM employees
         JOIN employee_projects ON employees.employee_id = employee_projects.employee_id
         JOIN projects ON employee_projects.project_id = projects.project_id;

-- Найдите имена сотрудников и их департаментов, включая тех, кто не прикреплен к какому-либо департаменту
SELECT employee_name, department_name
FROM employees
         FULL JOIN departments d ON d.department_id = employees.department_id;

--  Выведите названия департаментов и общее количество сотрудников в каждом департаменте.
SELECT departments.department_name, COUNT(employees.employee_id) AS employee_count
FROM departments
         LEFT JOIN employees ON departments.department_id = employees.department_id
GROUP BY departments.department_id, departments.department_name;