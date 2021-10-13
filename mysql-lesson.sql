-- insert record 
INSERT INTO tbl_subject VALUES (1,'Maths')   -- query 
INSERT INTO tbl_student (fname,nic) VALUES ('Kamal','863598745V') 

-- update 
UPDATE tbl_student SET address = 'Colombo', lname = 'Silva'  WHERE id = 3 
UPDATE tbl_student SET address = 'Kolpity' WHERE city = 'Negombo' OR city = 'Nugegoda'

-- select 
SELECT * FROM tbl_student
SELECT fname,lname FROM tbl_student
SELECT * FROM tbl_student WHERE gender = 'M'
SELECT * FROM tbl_student WHERE gender = 'M' AND subject_id = 2
SELECT * FROM tbl_student WHERE city = 'Negombo' OR city = 'Nugegoda' 


-- delete 
DELETE FROM tbl_subject WHERE id = 2


fname , nic , subject_name
-- join 
SELECT tbl_student.fname , tbl_student.nic , tbl_subject.subject_name FROM tbl_student
INNER JOIN tbl_subject 
ON tbl_student.subject_id = tbl_subject.id



SELECT A.fname , A.nic , B.subject_name FROM tbl_student AS A
INNER JOIN tbl_subject AS B
ON A.subject_id = B.id
WHERE A.gender = 'M'
