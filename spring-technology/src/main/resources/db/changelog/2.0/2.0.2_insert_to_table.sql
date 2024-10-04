INSERT INTO team (team_name, team_leader_id, is_active, created_at, updated_at)
VALUES
    ('Development Team', 1, true, NOW(), NOW()),
    ('Design Team', 2, true, NOW(), NOW());

INSERT INTO project (project_name, project_team_id, is_active, created_at, updated_at)
VALUES
    ('Project Alpha', 1, true, NOW(), NOW()),
    ('Project Beta', 2, true, NOW(), NOW());

INSERT INTO profession (profession_name, is_active)
VALUES
    ('Software Engineer', true),
    ('UI/UX Designer', true);

INSERT INTO employee (employee_name, employee_surname, employee_birthdate, employee_profession_id, employee_team_id, is_active, created_at, updated_at)
VALUES
    ('John', 'Doe', '1990-01-01', 1, 1, true, NOW(), NOW()),
    ('Jane', 'Smith', '1992-05-12', 2, 2, true, NOW(), NOW());
