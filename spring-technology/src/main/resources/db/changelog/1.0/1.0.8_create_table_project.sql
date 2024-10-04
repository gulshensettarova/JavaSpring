create table project
(
    id serial primary key,
    project_name varchar(30),
    project_team_id int,
    is_active boolean not null default true,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    foreign key (project_team_id) references team(id)

)

