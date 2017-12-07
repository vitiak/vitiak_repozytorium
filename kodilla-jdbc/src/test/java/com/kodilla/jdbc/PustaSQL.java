package com.kodilla.jdbc;

public class PustaSQL {
}

/*

CREATE TABLE BOOKS_AUD (
EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
EVENT_date date NOT NULL,
EVENT_type varchar(10) default NULL,
BOOK_ID INT(11) NOT NULL,
OLD_TITLE VARCHAR(255),
NEW_TITLE VARCHAR(255),
OLD_PUBYEAR INT(4),
NEW_PUBYEAR INT(4),
OLD_BESTSELLER BOOLEAN,
NEW_BESTSELLER BOOLEAN,
PRIMARY KEY (EVENT_ID)
);

CREATE TABLE READERS_AUD (
EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
EVENT_date date NOT NULL,
EVENT_type varchar(10) default NULL,
READER_ID INT(11) NOT NULL,
OLD_FIRSTNAME VARCHAR(255),
NEW_FIRSTNAME VARCHAR(255),
OLD_LASTNAME VARCHAR(255),
NEW_LASTNAME VARCHAR(255),
OLD_PESELID VARCHAR(11),
NEW_PESELID VARCHAR(11),
OLD_VIP_LEVEL VARCHAR(20),
NEW_VIP_LEVEL VARCHAR(20),
PRIMARY KEY (EVENT_ID)
);

commit;


delimiter $$

create trigger books_insert after insert on books
for each row
begin
insert into books_aud (event_date, event_type, book_id, new_title, new_pubyear,
	new_bestseller)
	values (curdate(), "INSERT", new.book_id, new.title, new.pubyear,
		new.bestseller);
end $$

delimiter ;



delimiter $$

create trigger books_delete after delete on books
for each row
begin
insert into books_aud (event_date, event_type, book_id)
	values (curdate(), "DELETE", old.book_id);
end $$

delimiter ;
commit;

delimiter $$

create trigger books_update after update on books
for each row
begin
insert into books_aud (event_date, event_type, book_id, new_title, new_pubyear,
	new_bestseller, old_title, old_pubyear,	old_bestseller)
	values (curdate(), "UPDATE", new.book_id, new.title, new.pubyear,
		new.bestseller, old.title, old.pubyear,
		old.bestseller);
end $$

delimiter ;
commit;



delimiter $$

create trigger readers_update after update on readers
for each row
begin
insert into readers_aud (event_date, event_type, reader_id, new_firstname, new_lastname,
	new_peselid, new_vip_level, old_firstname, old_lastname,
	old_peselid, old_vip_level)
	values (curdate(), "UPDATE", new.reader_id, new.firstname, new.lastname,
		new.peselid, new.vip_level, old.firstname, old.lastname,
		old.peselid, old.vip_level);
end $$

delimiter ;
commit;




delimiter $$

create trigger readers_insert after insert on readers
for each row
begin
insert into readers_aud (event_date, event_type, reader_id, new_firstname, new_lastname,
	new_peselid, new_vip_level)
	values (curdate(), "INSERT", new.reader_id, new.firstname, new.lastname,
		new.peselid, new.vip_level);
end $$

delimiter ;



delimiter $$

create trigger readers_delete after delete on readers
for each row
begin
insert into readers_aud (event_date, event_type, reader_id)
	values (curdate(), "DELETE", old.reader_id);
end $$

delimiter ;
commit;

 */


