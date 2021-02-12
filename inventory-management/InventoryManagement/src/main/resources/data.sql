insert into SL_PRODUCTS
values(501,'Item_Order1',10,250);

insert into SL_PRODUCTS
values(502,'Item_Order2',20,200);

insert into SL_PRODUCTS
values(503,'Item_Order3',5,25);

insert into SL_PRODUCTS
values(504,'Item_Order4',4,400);

INSERT INTO SL_INV
VALUES (
           100,
           to_date('30-DEC-2014'),
           '{"id"             : 501,
             "name"           : "Item_Order1",
             "quantity"       : 10,
             "price"          : 250
           }');

INSERT INTO SL_INV
VALUES (
           200,
           to_date('30-JAN-2016'),
           '{"id"             : 502,
             "name"           : "Item_Order2",
             "quantity"       : 20,
             "price"          : 200
           }');