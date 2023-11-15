-- create tables
create table if not exists public.students
(
    studentid  serial
        primary key,
    name       varchar(20) not null,
    surname    varchar(20) not null,
    age        int         not null,
    sex        varchar(1)  not null,
    email      varchar(40) default NULL::character varying,
    department varchar(50) not null
);


-- Insert values from tables
insert into students (studentid, name, surname, age, sex, email, department)
values
    (1, 'John', 'Doe', 20, 'M', 'john.doe@example.com', 'Computer Science'),
    (2, 'Emma', 'Smith', 21, 'F', 'emma.smith@example.com', 'Business Administration'),
    (3, 'Michael', 'Johnson', 22, 'M', 'michael.johnson@example.com', 'Mathematics'),
    (4, 'Sophia', 'Williams', 23, 'F', 'sophia.williams@example.com', 'Physics'),
    (5, 'Daniel', 'Brown', 24, 'M', 'daniel.brown@example.com', 'Engineering'),
    (6, 'Olivia', 'Jones', 25, 'F', 'olivia.jones@example.com', 'Medicine'),
    (7, 'Alexander', 'Garcia', 26, 'M', 'alexander.garcia@example.com', 'Psychology'),
    (8, 'Ava', 'Martinez', 27, 'F', 'ava.martinez@example.com', 'Sociology'),
    (9, 'William', 'Lopez', 28, 'M', 'william.lopez@example.com', 'Chemistry'),
    (10, 'Emily', 'Davis', 23, 'F', 'mia.lee@example.com', 'History'),
    (11, 'James', 'Scott', 30, 'M', 'james.scott@example.com', 'Geography'),
    (12, 'Charlotte', 'Green', 31, 'F', 'charlotte.green@example.com', 'Languages'),
    (13, 'Benjamin', 'Adams', 32, 'M', 'benjamin.adams@example.com', 'Economics'),
    (14, 'Amelia', 'Campbell', 33, 'F', 'amelia.campbell@example.com', 'Biology'),
    (15, 'Elijah', 'Parker', 34, 'M', 'elijah.parker@example.com', 'Political Science'),
    (16, 'Grace', 'Stewart', 35, 'F', 'grace.stewart@example.com', 'Anthropology'),
    (17, 'Logan', 'Murphy', 36, 'M', 'logan.murphy@example.com', 'Fine Arts'),
    (18, 'Harper', 'Rogers', 37, 'F', 'harper.rogers@example.com', 'Environmental Science'),
    (19, 'Aiden', 'Hill', 38, 'M', 'aiden.hill@example.com', 'Philosophy'),
    (20, 'Ella', 'Wood', 39, 'F', 'ella.wood@example.com', 'Music');

-- Update
update students
set age = 24
where name = 'Emily' and surname = 'Davis';

-- Delete
delete from students
where name = 'Benjamin' and surname = 'Adams';

-- Filtering
select name, surname, age, sex
from students
where ((age between 18 and 30) and sex = 'F')
   or (age >= 30 and sex = 'M')
order by age;

-- Name start with 'C'
select name, surname, email
from students
where surname like 'S%'
order by age;
