DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  emp_id TEXT NOT NULL,
  emp_name TEXTNOT NULL
);

INSERT INTO employee(emp_id,emp_name)values("emp001","emp1");
INSERT INTO employee(emp_id,emp_name)values("emp002","emp2");
INSERT INTO employee(emp_id,emp_name)values("emp003","emp3");