-- Run this manually in psql to prepare PostgreSQL DB
CREATE DATABASE orm_platform;
CREATE USER orm_user WITH ENCRYPTED PASSWORD 'orm_pass';
GRANT ALL PRIVILEGES ON DATABASE orm_platform TO orm_user;
