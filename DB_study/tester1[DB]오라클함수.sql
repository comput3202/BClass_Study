-- 오라클 주요 함수
--dual : 오라클에서 지원해주는 더미데이터
--round : 반올림
--abs : 절댓값
--trunc : 소수점(나머지는 자름)
select round(85/3) from dual;
select * from dual;
select abs(-90) 절댓값, trunc(34.5678,2), mod(90,8) from dual;
--문자 처리 함수
select 'welcome to Oracle', upper('welcome to Oracle'), lower('welcome to Oracle'), initCap('welcome to Oracle')
from dual;
--길이
select length('홍길동') from dual; --문자길이
select lengthb('홍길동') from dual; --문자의 바이트 수('홍' 하나가 3바이트)
--4번째 글자부터 3개 추출
select substr('welcome to Oracle',4,3) from dual;
--TO com 추춸
select substr('welcome to Oracle',9,2) from dual;
select substr('Welcome To Oracle',9,1)|| substr('Welcome To Oracle',12,1)||
substr('Welcome To Oracle',8,1)|| substr('Welcome To Oracle',4,3)
from dual;

select * from student;
--문종헌 학생의 이메일에서 @를 출력하기
--1.문종헌 이메일 출력
select stu_email from student where stu_name='문종헌';
--2. @ 출력
select substr(stu_email,5,1) from student where stu_name='문종헌';
select substr(stu_id,2,2) as "일련번호" from student;

--instr
select instr('데이터베이스','이',4,1) from dual;
--1번부터 해서 2번째 나오는 '아'찾기
select instr('학생아이디 학생아이디','아',1,2)from dual;
select * from student;

--stu_id가 120이 있는지?
select stu_id from student;
--lpad : 특정 기호로 채움
select lpad('홍길동',20,'#') from dual;

-- 오라클 주요 함수 
select round(85/3) from dual;
select * from dual;
select abs(-90) 절대값, trunc(34.5678, 2), mod( 90, 8)   from dual;
-- 문자 처리 함수
select 'Welcome to Oracle', upper( 'Welcome to Oracle'), lower('Welcome to Oracle'), initCap('WELCOME TO ORACLE')
  from dual;

select length('홍길동') from dual;  -- 문자의 길이 출력
select lengthb('홍길동') from dual;   -- '홍' - 3바이트 문자의 바이트수 출력

select substr( 'Welcome To Oracle', 4, 3) from dual;
-- TO cem
select  substr( 'Welcome To Oracle', 9, 1) || substr( 'Welcome To Oracle', 12, 1) ||
               substr( 'Welcome To Oracle', 8, 1)|| substr( 'Welcome To Oracle', 4, 1)||
               substr( 'Welcome To Oracle', 7, 1)|| substr( 'Welcome To Oracle', 6, 1)
         from dual;

select * from student;
-- 문종헌학생의 이메일에서 @을 출력하기
-- 문종헌의 이메일을 출력하기 
select stu_email from student where stu_name='문종헌'; 
-- 위에 select문을 활용해서 @를 추출
select    substr( stu_email, 5, 1 )     from student where stu_name='문종헌'; 
-- 학생아이디에서 2번째 3번째 숫자를 뽑기 모든 레코드 출력 01 02 ... 16 
select substr(stu_id, 2, 2) as "일련번호" from student;

-- instr
select instr('데이터베이스', '이') from dual;
select instr('학생아이디 학생아이디', '아', 1, 2) from dual;
select instr('없는글자는 어떻께 나오나? 0이 나온다.','박') from dual;
select * from student;

-- stu_id가 120이 있나? 
select instr(stu_id, 116), stu_id  from student; 


select sysdate from dual;
--오늘 날짜 기준으로 어제 내일 날짜 계산
select to_char(sysdate -1,'yyyy/mm/dd') 어제,
    to_char(sysdate,'yyyy/mm/dd') 오늘,
    to_char(sysdate +1,'yyyy/mm/dd') 내일
from dual;
select to_char(sysdate,'yyyy/mm/dd') 대출일,
to_char(sysdate +14,'yyyy/mm/dd') 반납일
from dual;
--round
select round('2023/05/30', 'cc') from dual;














--dept 컬럼추가 tourism varchar2(20)
select *from dept;
alter table dept add tourism varchar2(20);
alter table dept add decode varchar2(20);
select loc,decode(loc,'new york','롯데타워','dallas','월미도','chicago','화성')from dept;
update dept set tourism=decode(loc,'new york','롯데타워','dallas','월미도','chicago','화성');




select * from student;


 
 
 
 
 
 
 select *from emp;
 --1.모든 사원 급여최고액, 최저액, 총액, 평균급여
 select deptno, max(sal) "급여최고액", min(sal) "최저액",
 sum(sal) "총액", avg(sal) "평균급여"
 from emp
 group by deptno;
 
 --2.담당업무 유형별 최고액,최저액, 총액, 평균
 select job, max(sal) "급여최고액", min(sal) "최저액",
 sum(sal) "총액", avg(sal) "평균급여"
 from emp
 group by job;
 
  
 
 
 
