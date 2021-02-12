
create table SL_PRODUCTS
(
     id integer not null auto_increment,
    name varchar(255) not null,
    quantity integer not null,
    price integer not null,
    primary key(id)
);

CREATE TABLE SL_INV
(
    id  VARCHAR2 (32) NOT NULL auto_increment,
 date_loaded TIMESTAMP (6) WITH TIME ZONE,
 json_File VARCHAR2 (23767));
