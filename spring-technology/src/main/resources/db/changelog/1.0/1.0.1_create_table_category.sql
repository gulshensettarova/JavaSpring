create table category
(
    id serial primary key,
    category_name varchar(30),
    is_active boolean not null default true
)