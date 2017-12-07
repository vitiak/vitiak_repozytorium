explain select count(*) from books;
create index books_title on books (title);
explain select count(*) from books;

explain select * from readers where firstname = 'John';
create index readers_name on readers (firstname, lastname);
explain select * from readers where firstname = 'John';
