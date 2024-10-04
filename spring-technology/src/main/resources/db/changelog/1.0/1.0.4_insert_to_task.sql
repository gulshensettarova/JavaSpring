INSERT INTO task (task_title, task_description, task_priority, task_category, is_active, created_at, updated_at) VALUES
-- Frontend Developer Tasks
('Implement UI', 'Develop reusable UI components.', 1, 1, TRUE, NOW(), NOW()),
('Style App', 'Apply CSS styles for layout.', 2, 1, TRUE, NOW(), NOW()),
('Integrate API', 'Connect to backend API.', 3, 1, TRUE, NOW(), NOW()),
('Conduct Review', 'Review code from developers.', 2, 1, TRUE, NOW(), NOW()),
('Write Docs', 'Document components usage.', 1, 1, TRUE, NOW(), NOW()),

-- Backend Developer Tasks
('Set Up DB', 'Configure database and scripts.', 1, 2, TRUE, NOW(), NOW()),
('Develop API', 'Implement RESTful APIs.', 2, 2, TRUE, NOW(), NOW()),
('Handle Auth', 'User authentication process.', 3, 2, TRUE, NOW(), NOW()),
('Write Tests', 'Create unit tests for code.', 2, 2, TRUE, NOW(), NOW()),
('Optimize Queries', 'Improve SQL query performance.', 1, 2, TRUE, NOW(), NOW()),

-- DevOps Tasks
('Configure CI/CD', 'Set up integration and deployment.', 1, 3, TRUE, NOW(), NOW()),
('Manage Cloud', 'Provision cloud resources.', 2, 3, TRUE, NOW(), NOW()),
('Monitor Performance', 'Implement application monitoring.', 3, 3, TRUE, NOW(), NOW()),
('Automate Deploy', 'Create automated deployment scripts.', 2, 3, TRUE, NOW(), NOW()),
('Conduct Audits', 'Perform security checks.', 1, 3, TRUE, NOW(), NOW()),

-- QA Tester Tasks
('Write Cases', 'Create test cases for features.', 1, 4, TRUE, NOW(), NOW()),
('Perform Testing', 'Conduct manual testing.', 2, 4, TRUE, NOW(), NOW()),
('Automate Tests', 'Develop automated tests.', 3, 4, TRUE, NOW(), NOW()),
('Log Bugs', 'Document bugs during testing.', 2, 4, TRUE, NOW(), NOW()),
('Conduct Regression', 'Perform regression tests.', 1, 4, TRUE, NOW(), NOW()),

-- Architect Tasks
('Define Architecture', 'Design system architecture.', 1, 5, TRUE, NOW(), NOW()),
('Review Designs', 'Evaluate developer designs.', 2, 5, TRUE, NOW(), NOW()),
('Ensure Scalability', 'Design scalable systems.', 3, 5, TRUE, NOW(), NOW()),
('Establish Standards', 'Define coding standards.', 2, 5, TRUE, NOW(), NOW()),
('Lead Discussions', 'Facilitate technical talks.', 1, 5, TRUE, NOW(), NOW());
