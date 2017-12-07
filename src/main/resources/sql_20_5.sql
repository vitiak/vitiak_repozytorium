
CREATE TABLE STATS (
STAT_ID INT(11) AUTO_INCREMENT,
STAT_date date NOT NULL,
stat varchar(20) NOT NULL,
READER_ID INT(11) NOT NULL,
value INT(11) NOT NULL,
PRIMARY KEY (STAT_ID)
);
create view bestsellerrs_count as select count(*) as b_count
from books where bestseller is true;

DELIMITER $$
create event update_bestsellers
on schedule every 20 minute
do 
begin
declare b_count int;
call UpdateBestsellers();
select sum(b_count) into b_count from bestsellers_count;
insert into stat(stat_date, stat, value)
values (curdate(), 'bestsellers', b_count);
end$$
DELIMITER ;

