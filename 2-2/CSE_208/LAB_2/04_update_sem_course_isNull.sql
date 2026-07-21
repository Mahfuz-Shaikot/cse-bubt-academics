UPDATE Course
SET Course_Code = "CSE 471"
WHERE Course_Code IS NULL;
UPDATE Faculty
SET Conduct_Semester = "Fall 2019-2020"
WHERE Conduct_Semester IS NULL;