CREATE OR REPLACE PROCEDURE calculate_grade (
    student_name IN VARCHAR2,
    subject_name IN VARCHAR2,
    marks        IN NUMBER
)
IS
    grade CHAR(1);
BEGIN
    IF marks < 0 OR marks > 100 THEN
        DBMS_OUTPUT.PUT_LINE('Invalid marks entered for ' || student_name);
        RETURN;
    END IF;

    IF marks >= 90 THEN
        grade := 'A';
    ELSIF marks >= 80 THEN
        grade := 'B';
    ELSIF marks >= 70 THEN
        grade := 'C';
    ELSIF marks >= 60 THEN
        grade := 'D';
    ELSE
        grade := 'F';
    END IF;

    DBMS_OUTPUT.PUT_LINE('Student: ' || student_name);
    DBMS_OUTPUT.PUT_LINE('Subject: ' || subject_name);
    DBMS_OUTPUT.PUT_LINE('Marks: ' || marks);
    DBMS_OUTPUT.PUT_LINE('Grade: ' || grade);
END;
/
BEGIN
    calculate_grade('VEENA', 'Math',96);
END;
/
