create table profession
(
    id serial primary key,
    profession_name varchar(30),
    is_active boolean not null default true
)

