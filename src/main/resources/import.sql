insert into brand (id, description) values (1, 'ZARA');
insert into brand (id, description) values (2, 'MANAOS');

insert into price_list (id, description) values (1, 'Tarifa 1');
insert into price_list (id, description) values (2, 'Tarifa 2');
insert into price_list (id, description) values (3, 'Tarifa 3');
insert into price_list (id, description) values (4, 'Tarifa 4');

insert into product (id, description) values (35455, 'Trench impermeable');
insert into product (id, description) values (35456, 'Trench cruzado');

insert into price (brand_id, start_date, end_date, price_list_id, product_id, priority, price, currency) values (1, TIMESTAMP '2020-06-14T00.00.00', TIMESTAMP '2020-12-31T23.59.59', 1, 35455, 0, 35.50, 'EUR');
insert into price (brand_id, start_date, end_date, price_list_id, product_id, priority, price, currency) values (1, TIMESTAMP '2020-06-14T15.00.00', TIMESTAMP '2020-06-14T18.30.00', 2, 35455, 1, 25.45, 'EUR');
insert into price (brand_id, start_date, end_date, price_list_id, product_id, priority, price, currency) values (1, TIMESTAMP '2020-06-15T00.00.00', TIMESTAMP '2020-06-15T11.00.00', 3, 35455, 1, 30.50, 'EUR');
insert into price (brand_id, start_date, end_date, price_list_id, product_id, priority, price, currency) values (1, TIMESTAMP '2020-06-15T16.00.00', TIMESTAMP '2020-12-31T23.59.59', 4, 35455, 1, 38.95, 'EUR');

