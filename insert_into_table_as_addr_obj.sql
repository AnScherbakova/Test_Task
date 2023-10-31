INSERT INTO my_db.as_addr_obj VALUES (1, 'ул. Северная', '1422396', CURRENT_DATE, CURRENT_DATE, TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (2, 'р-н Заполярный', '1450759', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (3, 'п Нельмин Нос', '1449192', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (4, 'п Екуша', '1451562', CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE, TRUE);
INSERT INTO my_db.as_addr_obj VALUES (5, 'ул.Димитрова', '1455887', '2010-12-20', DATE_ADD(current_date, interval 1 year), FALSE, FALSE, 200);
UPDATE my_db.as_addr_obj SET my_db.as_addr_obj.start_date = '2010-12-20' WHERE my_db.as_addr_obj.object_id = 1;


select my_db.as_addr_obj.type_name, my_db.as_addr_obj.name from my_db.as_addr_obj where type_name IN ('1422396', '1455887') and start_date='2010-12-20';

SELECT * FROM my_db.as_addr_obj;
SELECT * FROM my_db.as_addr_obj WHERE name LIKE '%ул%';