create table employee
(
    id serial primary key,
    employee_name varchar(30),
    employee_surname varchar(200),
    employee_birthdate date,
    employee_profession_id int,
    employee_team_id int,
    is_active boolean not null default true,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    foreign key (employee_profession_id) references profession(id),
    foreign key (employee_team_id) references team(id)

)