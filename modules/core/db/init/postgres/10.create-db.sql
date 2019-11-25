-- begin CUBASHARE_CUSTOMER
create table CUBASHARE_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    USERNAME varchar(255) not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUBASHARE_CUSTOMER
-- begin CUBASHARE_FOUR
create table CUBASHARE_FOUR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end CUBASHARE_FOUR
