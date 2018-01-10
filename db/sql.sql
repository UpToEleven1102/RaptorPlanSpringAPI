mysqldump --opt -u sql3212024 -p sql3212024 -h sql3.freesqldatabase.com
..password: 3un1gVILLm

insert into h_user(id,email,password,name,last_name,m_number) values (1,'admin@raptorplan.com','password','Joe','Grandja','M20949823');

insert into h_role(id,name) values (1,'admin')

insert into h_user_role(user_id,role_id) values (1,1)