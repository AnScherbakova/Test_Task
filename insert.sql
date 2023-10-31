INSERT INTO my_db.as_addr_obj VALUES (1, 'ул. Северная', '1422396', CURRENT_DATE, CURRENT_DATE, TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (2, 'р-н Заполярный', '1450759', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (3, 'п Нельмин Нос', '1449192', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (4, 'п Екуша', '145562', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);

SELECT *FROM my_db.as_addr_obj;