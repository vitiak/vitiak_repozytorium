explain select count(*) from books;
create index books_title on books (title);
explain select count(*) from books;

explain select count(*) from readers;
create index readers_name on readers (firstname, lastname);
explain select count(*) from readers;
