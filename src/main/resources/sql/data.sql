insert into oauth2_user (password, username) values ('user', 'user');
insert into oauth2_user (password, username) values ('admin', 'admin');

insert into oauth2_role (role) values ('USER');
insert into oauth2_role (role) values ('ADMIN');

insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 2);
insert into user_role (user_id, role_id) values (2, 1);