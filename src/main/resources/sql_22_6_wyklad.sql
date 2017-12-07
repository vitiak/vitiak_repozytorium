create table phones (
phone_id int(11) not null auto_increment primary key,
phonenum int(9),
firstname varchar(50),
lastname varchar(50)
);

delimiter $$
create procedure filltestdata()
begin 
declare k int default 0;
while (k < 1000000) do 
insert into phones (phonenum, firstname, lastname)
values (round(rand()*1000000000), concat('firstname', k),concat('lastname', k));
if (mod(k,5000)=0) then
commit;
end if;
set k=k+1;
end while;
commit;
end $$
delimiter ;

call filltestdata();

create table phonestats (
id int(11) not null auto_increment primary key,
range_from int(11),
range_to int(11),
quantity int(11)
);

delimiter $$
create procedure callphonestats()
begin 
declare k int(11) default 0;
declare qty int(11);
while (k < 1000000000) do 
select count(*) from phones where phonenum between k-99999 and k into qty;
insert into phonestats (range_from, range_to, quantity)
values (k-99999, k,qty);
commit;
set k=k+100000;
end while;
end $$
delimiter ;

commit;

call callphonestats();

select * from phonestats;

explain select count(*) from phones where phonenum between 1 and 100000;

create index phoneno on phones (phonenum);




