
-- Statement for create table in database
CREATE TABLE IF NOT EXISTS StudentsTable(
    id SERIAL PRIMARY KEY,
    name VARCHAR(30) not null ,
    age INT NOT NULL CHECK (age >= 16 AND age <= 99),
    grade INT not null CHECK (grade >= 1 AND grade <= 10)
);