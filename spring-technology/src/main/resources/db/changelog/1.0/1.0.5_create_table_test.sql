create table Test
(
    id serial primary key,
    name varchar(30),
    is_active boolean not null default true
)

