create database lms_db;
create user 'lms_user'@'localhost' identified by 'my123';
grant all privileges on lms_db.* to 'lms_user'@'localhost';

flush privileges

