connect sys as sysdba

create user sa identified by sa
default tablespace users
temporary tablespace temp
quota unlimited on users;


grant dba to sa;

drop table board;

create table board(
seq number primary key,
title varchar2(100), 
writer varchar2(50), 
content varchar2(2000),
regdate date default sysdate,
cnt number default 0
);

create table users(
 id varchar2(50) primary key,
 password varchar2(50),
 name varchar2(50),
 role varchar2(50)
);