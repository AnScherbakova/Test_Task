CREATE TABLE my_db.as_addr_obj
(
    object_id  int not null auto_increment,
    name       varchar(20),
    type_name  int,
    start_date date,
    end_date   date,
    ISACTUAL   boolean,
    ISACTIVE   boolean,
    primary key (object_id)
);

CREATE TABLE my_db.as_adm_hierarchy
(
    parent_obj_id int not null auto_increment,
    obj_id     int REFERENCES my_db.as_addr_obj (object_id),
    start_date    date,
    end_date      date,
    ISACTIVE      boolean,
    primary key (parent_obj_id)
);