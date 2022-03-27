/*ユーザマスタ*/
/*
INSERT INTO m_user(
    user_id,
    password,
    user_name,
    birthday,
    age,
    gender,
    department_id,
    role,
) VALUES
('system@co.jp', 'password', 'System Administrator', '2000-01-01', '21','1','1', 'ROLE_ADMIN'),
('user@co.jp', 'password', 'user1', '2000-01-01', '21','2','2', 'ROLE_GENERAL');
*/

/*部署マスタ
INSERT INTO m_department(
    department_id,
    department_name
) VALUES
(1, 'System Management Department'), (2, 'Sales Department');
*/

/*給与テーブル*/
/*
INSERT INTO t_salary(
    user_id,
    year_mnt,
    salary
) VALUES
('kaname.f.1995g@gmail.com', '1995/06', 280000),
('hikaru3532@gmail.com', '1998/01', 290000),
('mei@gmail.com', '1997/12', 300000);
*/