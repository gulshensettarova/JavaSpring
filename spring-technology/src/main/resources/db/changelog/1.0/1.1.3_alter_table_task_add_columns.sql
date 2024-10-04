alter table task
    add  task_status_id int;

ALTER TABLE task
    ADD CONSTRAINT fk_task_status
        FOREIGN KEY (task_status_id) REFERENCES task_status(id);


ALTER TABLE  task
    ADD task_deadline date;


ALTER TABLE  task
    ADD task_project_id int;

ALTER TABLE task
    ADD CONSTRAINT fk_project
        FOREIGN KEY (task_project_id) REFERENCES project(id);


ALTER TABLE  task
    ADD task_employee_id int;

ALTER TABLE task
    ADD CONSTRAINT fk_employee
        FOREIGN KEY (task_employee_id) REFERENCES employee(id);