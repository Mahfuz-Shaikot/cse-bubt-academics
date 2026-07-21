CREATE DATABASE MahfuzShaikot USE MahfuzShaikot CREATE TABLE Customer(
    CustomerID int,
    CustomerName varchar(100),
    PurchaseIteam varchar(100),
    Address varchar(100),
    PostalCode int,
    PhoneNumber int
);
INSERT INTO Customer(
        CustomerID,
        CustomerName,
        PurchaseIteam,
        Address,
        PostalCode,
        PhoneNumber
    )
VALUES(
        1,
        'Adiba mehjabin',
        'Three Piece',
        'Dhanmondi',
        1205,
        0131745367
    ),
    (
        2,
        'Rafiqul Islam',
        'Wallet',
        'Mirpur 1',
        1216,
        0161745387
    ),
    (
        3,
        'Sanjila',
        'Kurti',
        'Uttarkhan',
        1106,
        0171748367
    ),
    (
        4,
        'Sharifa Begum',
        'Bed sheet',
        'Sector 7',
        1108,
        0191745388
    ),
    (
        5,
        'Amina Begum',
        'Two Piece',
        'Badda',
        1300,
        0131745768
    ),
    (
        6,
        'Monowara Akter',
        'Ear ring',
        'Mirpur 12',
        1217,
        0151845366
    );
ALTER TABLE Customer
ADD CoustomerGrade Varchar(100);
ALTER TABLE Customer DROP COLUMN PostalCode;
ALTER TABLE Customer CHANGE COLUMN Address AddressDetails Varchar(100);
ALTER TABLE Customer
MODIFY COLUMN PhoneNumber VARCHAR(20)
UPDATE customer
SET PurchaseIteam = 'Shirt'
WHERE customerID = 3;
ALTER TABLE Customer
ADD PRIMARY KEY (CustomerID);
UPDATE customer
SET customerGrade = 'GOLD'
WHERE CustomerID = '1';
SELECT *
FROM Customer
WHERE CustomerGrade = 'gold';