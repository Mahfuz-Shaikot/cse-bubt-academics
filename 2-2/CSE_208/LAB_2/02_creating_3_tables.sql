CREATE TABLE Student (
    Name varchar(50),
    St_Id int(3),
    NID int(3),
    Intake int(2),
    Section int(1),
    CGPA float(3, 2)
);
INSERT INTO BUBT_DB1.Student (
        Name,
        St_Id,
        NID,
        Intake,
        Section,
        CGPA
    )
VALUES ("Ashraful", 1, 102, 44, 1, 3.30),
    ("Tonny", 2, 101, 44, 1, 3.50),
    ("Zakir", 33, 103, 35, 2, 3.98),
    ("Urmi", 6, 104, 35, 1, 3.96),
    ("Tonny", 23, 105, 44, 1, 3.50);
CREATE TABLE Faculty (
    Name varchar(50),
    Short_Code varchar(5),
    Course_code varchar(10),
    Conduct_Semester varchar(20)
);
INSERT INTO BUBT_DB1.Faculty (
        Name,
        Short_Code,
        Course_code,
        Conduct_Semester
    )
VALUES (
        "Farha Akhter Munmun",
        "FAM",
        "CSE 319",
        "Summer 2019"
    ),
    ("Sweety Lima", "SWL", "CSE 209", "Fall 2019-20"),
    ("Shumi Khatun", "SKN", NULL, "Summer 2019"),
    ("Nadia Afrin Ritu", NULL, "CSE 351", NULL);
CREATE TABLE Course (
    Course_Title varchar(50),
    Course_Code varchar(20)
);
INSERT INTO BUBT_DB1.Course (Course_Title, Course_Code)
VALUES ("Database Systems", "CSE 207"),
    ("Computer Networks", "CSE 319"),
    ("Data Communication", "CSE 209"),
    ("System Analysis Design", NULL);