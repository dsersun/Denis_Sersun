create table if not exists public.books
(
    book_id            serial
        primary key,
    name               text not null,
    author             text,
    date_of_publishing date,
    genre              text,
    available_cout     integer
);

-- insert value in DB
insert into books (book_id, name, author, date_of_publishing, genre, available_cout)
values ('1', 'The Great Gatsby', '"F.Sco^Fitzgerald"', '1925-01-01', '"Classics"', '3'),
       ('2', '"To kill a Mockingbird"', '"Harper Lee"', '1960-01-01', '"Fiction"', '5'),
       ('3', '"1984"', '"George Orwell"', '1949-01-01', '"Science Fiction"', '2'),
       ('4', '"Pride and Prejudice"', '"Jane Austen"', '1813-01-01', '"Romance"', '4');

-- read All data from tables
SELECT *
FROM books;

-- select partial data, filter and sort value
select book_id, name, date_of_publishing
from books
where extract(year from date_of_publishing) < 1950
order by date_of_publishing desc;