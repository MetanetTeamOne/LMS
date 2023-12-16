DROP TABLE STUDENT 
   CASCADE CONSTRAINTS;

DROP TABLE COURSE 
   CASCADE CONSTRAINTS;

DROP TABLE LECTURE 
   CASCADE CONSTRAINTS;

DROP TABLE MAJOR 
   CASCADE CONSTRAINTS;

DROP TABLE LECTURECOMMENT 
   CASCADE CONSTRAINTS;

DROP TABLE COMMENTS 
   CASCADE CONSTRAINTS;

DROP TABLE ROLE 
   CASCADE CONSTRAINTS;

CREATE TABLE STUDENT (
   student_id VARCHAR2(50) NOT NULL,
   student_name VARCHAR2(20),
   student_email VARCHAR2(100),
   student_address VARCHAR2(50),
   student_phone_number VARCHAR2(20),
   student_grade NUMBER,
   student_admission_year DATE,
   password VARCHAR2(100),
   major_id NUMBER
);

ALTER TABLE STUDENT
   ADD
      CONSTRAINT PK_STUDENT
      PRIMARY KEY (
         student_id
      );

CREATE TABLE COURSE (
   student_id VARCHAR2(50) NOT NULL,
   lecture_id NUMBER NOT NULL,
   course_Id NUMBER NOT NULL
);

ALTER TABLE COURSE
   ADD
      CONSTRAINT PK_COURSE
      PRIMARY KEY (
         student_id,
         lecture_id,
         course_Id
      );

CREATE TABLE LECTURE (
   lecture_id NUMBER NOT NULL,
   lecture_name VARCHAR2(20),
   lecture_location VARCHAR2(20),
   lecture_time VARCHAR2(20),
   lecture_credit NUMBER,
   student_grade NUMBER,
   major_id NUMBER
);

ALTER TABLE LECTURE
   ADD
      CONSTRAINT PK_LECTURE
      PRIMARY KEY (
         lecture_id
      );

CREATE TABLE MAJOR (
   major_id NUMBER NOT NULL,
   major_name VARCHAR2(20)
);

ALTER TABLE MAJOR
   ADD
      CONSTRAINT PK_MAJOR
      PRIMARY KEY (
         major_id
      );

CREATE TABLE LECTURECOMMENT (
   lecture_comment_id NUMBER NOT NULL,
   lecture_comment_content VARCHAR2(100),
   lecture_comment_star_score NUMBER,
   course_id NUMBER,
   lecture_id NUMBER,
   student_id VARCHAR2(50),
   lecture_comment_write_date DATE
);

ALTER TABLE LECTURECOMMENT
   ADD
      CONSTRAINT PK_LECTURECOMMENT
      PRIMARY KEY (
         lecture_comment_id
      );

CREATE TABLE COMMENTS (
   comments_id NUMBER NOT NULL,
   comments_content VARCHAR2(100),
   lecture_comment_id NUMBER,
   student_id VARCHAR2(50),
   comment_write_date DATE
);

ALTER TABLE COMMENTS
   ADD
      CONSTRAINT PK_COMMENTS
      PRIMARY KEY (
         comments_id
      );

CREATE TABLE ROLE (
   student_id VARCHAR2(50) NOT NULL,
   role_name VARCHAR2(30)
);

ALTER TABLE ROLE
   ADD
      CONSTRAINT PK_ROLE
      PRIMARY KEY (
         student_id
      );

ALTER TABLE STUDENT
   ADD
      CONSTRAINT FK_MAJOR_TO_STUDENT
      FOREIGN KEY (
         major_id
      )
      REFERENCES MAJOR (
         major_id
      );

ALTER TABLE COURSE
   ADD
      CONSTRAINT FK_STUDENT_TO_COURSE
      FOREIGN KEY (
         student_id
      )
      REFERENCES STUDENT (
         student_id
      );

ALTER TABLE COURSE
   ADD
      CONSTRAINT FK_LECTURE_TO_COURSE
      FOREIGN KEY (
         lecture_id
      )
      REFERENCES LECTURE (
         lecture_id
      );

ALTER TABLE LECTURE
   ADD
      CONSTRAINT FK_MAJOR_TO_LECTURE
      FOREIGN KEY (
         major_id
      )
      REFERENCES MAJOR (
         major_id
      );

ALTER TABLE LECTURECOMMENT
   ADD
      CONSTRAINT FK_COURSE_TO_LECTURECOMMENT
      FOREIGN KEY (
         student_id,
         lecture_id,
         course_Id
      )
      REFERENCES COURSE (
         student_id,
         lecture_id,
         course_Id
      ) ON DELETE CASCADE;

ALTER TABLE COMMENTS
   ADD
      CONSTRAINT FK_LECTURECOMMENT_TO_COMMENTS
      FOREIGN KEY (
         lecture_comment_id
      )
      REFERENCES LECTURECOMMENT (
         lecture_comment_id
      ) ON DELETE CASCADE;

ALTER TABLE ROLE
   ADD
      CONSTRAINT FK_STUDENT_TO_ROLE
      FOREIGN KEY (
         student_id
      )
      REFERENCES STUDENT (
         student_id
      );
      
CREATE OR REPLACE TRIGGER TRG_INSERT_ROLE_AFTER_STUDENT
AFTER INSERT ON STUDENT
FOR EACH ROW
BEGIN
   INSERT INTO ROLE (student_id, role_name)
   VALUES (:NEW.student_id, 'ROLE_USER');
END;

INSERT INTO MAJOR VALUES (1, '11111!');
INSERT INTO STUDENT VALUES ('1', '11111!', '11111!', '11111!', '11111!',5, SYSDATE,'111',1);
INSERT INTO LECTURE VALUES (1, '11111!', '11111!', '11111!', 1,1,1);
INSERT INTO COURSE VALUES ('1',1,1);
INSERT INTO LECTURECOMMENT VALUES (1, '11111!', 5, 1, 1, '1', SYSDATE);
INSERT INTO COMMENTS VALUES (1, '11111!', 1, '1', SYSDATE);
INSERT INTO ROLE VALUES ('1', 'ROLE_ADMIN');

desc ROLE;

SELECT * FROM  MAJOR;      
SELECT * FROM  STUDENT;  
SELECT * FROM  LECTURE;  
SELECT * FROM  COURSE;  
SELECT * FROM  LECTURECOMMENT;  
SELECT * FROM  COMMENTS;  
SELECT * FROM  ROLE;  
commit;