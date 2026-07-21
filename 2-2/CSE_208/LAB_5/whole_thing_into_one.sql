DROP TABLE IF EXISTS borrower;
DROP TABLE IF EXISTS depositor;
DROP TABLE IF EXISTS loan;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS branch;
CREATE TABLE branch (
    branch_name VARCHAR(50) PRIMARY KEY,
    branch_city VARCHAR(50),
    assets INT
);
CREATE TABLE customer (
    customer_name VARCHAR(50) PRIMARY KEY,
    customer_street VARCHAR(50),
    customer_city VARCHAR(50)
);
CREATE TABLE account (
    account_number VARCHAR(10) PRIMARY KEY,
    branch_name VARCHAR(50),
    balance INT,
    FOREIGN KEY (branch_name) REFERENCES branch(branch_name) ON DELETE
    SET NULL
);
CREATE TABLE loan (
    loan_number VARCHAR(10) PRIMARY KEY,
    branch_name VARCHAR(50),
    amount INT,
    FOREIGN KEY (branch_name) REFERENCES branch(branch_name) ON DELETE
    SET NULL
);
CREATE TABLE depositor (
    customer_name VARCHAR(50),
    account_number VARCHAR(10),
    PRIMARY KEY (customer_name, account_number),
    FOREIGN KEY (customer_name) REFERENCES customer(customer_name) ON DELETE CASCADE,
    FOREIGN KEY (account_number) REFERENCES account(account_number) ON DELETE CASCADE
);
CREATE TABLE borrower (
    customer_name VARCHAR(50),
    loan_number VARCHAR(10),
    PRIMARY KEY (customer_name, loan_number),
    FOREIGN KEY (customer_name) REFERENCES customer(customer_name) ON DELETE CASCADE,
    FOREIGN KEY (loan_number) REFERENCES loan(loan_number) ON DELETE CASCADE
);
INSERT INTO branch (branch_name, branch_city, assets)
VALUES ('Brighton', 'Brooklyn', 7100000),
    ('Downtown', 'Brooklyn', 9000000),
    ('Mianus', 'Horseneck', 400000),
    ('North Town', 'Rye', 3700000),
    ('Perryridge', 'Horseneck', 1700000),
    ('Pownal', 'Bennington', 300000),
    ('Redwood', 'Palo Alto', 2100000),
    ('Round Hill', 'Horseneck', 8000000);
INSERT INTO customer (customer_name, customer_street, customer_city)
VALUES ('Adams', 'Spring', 'Pittsfield'),
    ('Brooks', 'Senator', 'Brooklyn'),
    ('Curry', 'North', 'Rye'),
    ('Glenn', 'Sand Hill', 'Woodside'),
    ('Green', 'Walnut', 'Stamford'),
    ('Hayes', 'Main', 'Harrison'),
    ('Johnson', 'Alma', 'Palo Alto'),
    ('Jones', 'Main', 'Harrison'),
    ('Lindsay', 'Park', 'Pittsfield'),
    ('Smith', 'North', 'Rye'),
    ('Turner', 'Putnam', 'Stamford'),
    ('Williams', 'Nassau', 'Princeton');
INSERT INTO account (account_number, branch_name, balance)
VALUES ('A-101', 'Downtown', 500),
    ('A-102', 'Perryridge', 400),
    ('A-201', 'Brighton', 900),
    ('A-215', 'Mianus', 700),
    ('A-217', 'Brighton', 750),
    ('A-222', 'Redwood', 700),
    ('A-305', 'Round Hill', 350);
INSERT INTO loan (loan_number, branch_name, amount)
VALUES ('L-11', 'Round Hill', 900),
    ('L-14', 'Downtown', 1500),
    ('L-15', 'Perryridge', 1500),
    ('L-16', 'Perryridge', 1300),
    ('L-17', 'Downtown', 1000),
    ('L-23', 'Redwood', 2000),
    ('L-93', 'Mianus', 500);
INSERT INTO depositor (customer_name, account_number)
VALUES ('Hayes', 'A-102'),
    ('Johnson', 'A-101'),
    ('Johnson', 'A-201'),
    ('Jones', 'A-217'),
    ('Lindsay', 'A-222'),
    ('Smith', 'A-215'),
    ('Turner', 'A-305');
INSERT INTO borrower (customer_name, loan_number)
VALUES ('Adams', 'L-16'),
    ('Curry', 'L-93'),
    ('Hayes', 'L-15'),
    ('Johnson', 'L-14'),
    ('Jones', 'L-17'),
    ('Smith', 'L-11'),
    ('Smith', 'L-23'),
    ('Williams', 'L-17');