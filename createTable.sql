CREATE TABLE my_db.AS_ADDR_OBJ
(
    object_id  int not null auto_increment,
    name       varchar(20),
    type_name  int,
    start_date timestamp,
    end_date   timestamp,
    ISACTUAL   boolean,
    ISACTIVE   boolean,
    primary key (object_id)
);

CREATE TABLE my_db.AS_ADM_HIERARCHY
(
    parent_obj_id int not null auto_increment,
    object_id     int,
    start_date    timestamp,
    end_date      timestamp,
    ISACTIVE      boolean,
    primary key (parent_obj_id),
    foreign key (object_id) references my_db.AS_ADDR_OBJ (object_id)
);