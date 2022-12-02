DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  empId TEXT NOT NULL,
  empName TEXTNOT NULL
);

INSERT INTO employee(empId,empName)values("emp001","emp1");
INSERT INTO employee(empId,empName)values("emp002","emp2");
INSERT INTO employee(empId,empName)values("emp003","emp3");