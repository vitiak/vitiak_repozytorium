
delimiter $$

create trigger rents_update after update on rents
for each row
begin 
insert into rents_aud (event_date, event_type, rent_id, new_book_id, new_reader_id,
	new_rent_date, new_return_date, old_book_id, old_reader_id,
	old_rent_date, old_return_date)
	values (curdate(), "UPDATE", new.rent_id, new.book_id, new.reader_id, 
		new.rent_date, new.return_date, old.book_id, old.reader_id, 
		old.rent_date, old.return_date);
end $$

delimiter ;
commit;


delimiter $$

create trigger rents_insert after insert on rents
for each row
begin 
insert into rents_aud (event_date, event_type, rent_id, new_book_id, new_reader_id,
	new_rent_date, new_return_date)
	values (curdate(), "INSERT", new.rent_id, new.book_id, new.reader_id, 
		new.rent_date, new.return_date);
end $$

delimiter ;



delimiter $$

create trigger rents_delete after delete on rents
for each row
begin 
insert into rents_aud (event_date, event_type, rent_id)
	values (curdate(), "DELETE", old.rent_id);
end $$

delimiter ;
commit;
