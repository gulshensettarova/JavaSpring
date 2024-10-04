create table task
(
    id serial primary key,
    task_title varchar(30),
    task_description varchar(200),
    task_priority int,
    task_category int,
    is_active boolean not null default true,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    foreign key (task_category) references category(id)
)