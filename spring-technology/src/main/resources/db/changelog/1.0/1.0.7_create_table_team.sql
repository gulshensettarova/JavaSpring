create table team
(
    id serial primary key,
    team_name varchar(30),
    team_leader_id int,
    is_active boolean not null default true,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
)

