drop procedure if exists UpdateBestsellers;
delimiter $$
create procedure UpdateBestsellers() 
begin
declare booksread, countOfRents, rdr_id int;
declare finished int default 0;
declare isBestseller boolean;
declare all_books cursor for select book_id from books;
declare continue handler for not found set finished = 1;

open all_books;
while (finished=0) do 
fetch all_books into rdr_id;
if (finished =0) then
select count(*) from rents where book_id = rdr_id into booksread;
set isBestseller = false;
if (booksread > 2) then
	set isBestseller = true;
end if;
update books set bestseller = isBestseller where book_id = rdr_id;
commit;
end if;
end while;
close all_books;
end$$
delimiter ;

call UpdateBestsellers();
select * from books;