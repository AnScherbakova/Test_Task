INSERT INTO my_db.as_adm_hierarchy VALUES (200, 1, CURRENT_DATE, CURRENT_DATE, TRUE);
INSERT INTO my_db.as_adm_hierarchy VALUES (201, 2, CURRENT_DATE, DATE_ADD(current_date, interval 1 year), TRUE);


SELECT *FROM my_db.as_adm_hierarchy;

select my_db.as_addr_obj.object_id from my_db.as_addr_obj INNER JOIN my_db.as_adm_hierarchy ON as_addr_obj.object_id = as_adm_hierarchy.object_id;