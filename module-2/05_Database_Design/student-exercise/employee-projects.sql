
DROP TABLE IF EXISTS project_employee;
DROP TABLE  IF EXISTS project;
DROP TABLE  IF EXISTS employee;
DROP TABLE  IF EXISTS department;

CREATE TABLE department (
	department_id SERIAL,
	name varchar(40) UNIQUE NOT NULL,
	CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
);
INSERT INTO department (name) VALUES ('Super Software Development Team');
INSERT INTO department (name) VALUES ('Delicate Database Analysts');
INSERT INTO department (name) VALUES ('Anti-Productivity Department');
INSERT INTO department (name) VALUES ('Testers Against Lazy Developers');

CREATE TABLE employee (
	employee_id SERIAL,
	department_id integer,
	first_name varchar(30) NOT NULL,
	last_name varchar(50) NOT NULL,
	birth_date date NOT NULL,
	gender char(1) NOT NULL,
	hire_date date NOT NULL,
	CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
	CONSTRAINT ck_gender CHECK (gender IN ('M', 'F')),
	CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(department_id)
);

INSERT INTO employee (department_id,first_name, last_name, birth_date, gender, hire_date)
VALUES (3,'Fredrick', 'Keppard', '1953-07-15', 'M', '2001-04-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (1, 'Flo', 'Henderson', '1990-12-28', 'F', '2011-08-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (2, 'Franklin', 'Trumbauer', '1980-07-14', 'M', '1998-09-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (2, 'Delora', 'Coty', '1976-07-04', 'F', '2009-03-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (2, 'Sid', 'Goodman', '1972-06-04', 'F', '1998-09-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (3, 'Mary Lou', 'Wolinski', '1983-04-08', 'F', '2012-04-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (3, 'Jammie', 'Mohl', '1987-11-11', 'M', '2013-02-16');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (3, 'Neville', 'Zellers', '1983-04-04', 'M', '2013-07-01');
INSERT INTO employee (department_id, first_name, last_name, birth_date, gender, hire_date)
VALUES (4, 'Gabreila', 'Christie', '1980-03-17', 'F', '1999-08-01');

CREATE TABLE project (
	project_id SERIAL,
	name varchar(40) UNIQUE NOT NULL,
	start_date date,
	CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);
INSERT INTO project (name, start_date) VALUES ('Years and possibly never finished', '1991-03-01');
INSERT INTO project (name, start_date) VALUES ('Writing Java From Scratch', '08-21-2014');
INSERT INTO project (name, start_date) VALUES ('Neville Trying not to get Fired project', '2010-09-01');
INSERT INTO project (name, start_date) VALUES ('Next Tuesday, probably', '2010-06-30');

CREATE TABLE project_employee(
        employee_id integer,
        project_id integer,
        
        CONSTRAINT fk_project_project_id FOREIGN KEY (project_id) REFERENCES project(project_id),
        CONSTRAINT fk_employee_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

INSERT INTO project_employee (employee_id, project_id) VALUES (1,1);
INSERT INTO project_employee (employee_id, project_id) VALUES (2,2);
INSERT INTO project_employee (employee_id, project_id) VALUES (3,3);
INSERT INTO project_employee (employee_id, project_id) VALUES (4,4);
INSERT INTO project_employee (employee_id, project_id) VALUES (5,4);
INSERT INTO project_employee (employee_id, project_id) VALUES (6,3);
INSERT INTO project_employee (employee_id, project_id) VALUES (7,2);
INSERT INTO project_employee (employee_id, project_id) VALUES (8,1);






