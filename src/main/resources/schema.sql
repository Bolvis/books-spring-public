CREATE TABLE public.book (
    isbn character varying(17) PRIMARY KEY NOT NULL,
    title text NOT NULL,
    author integer NOT NULL,
    CONSTRAINT fk_book_author FOREIGN KEY (author) REFERENCES author(id)
);

CREATE TABLE public.author (
    id INTEGER PRIMARY KEY NOT NULL,
    name character varying(20) NOT NULL,
    surname character varying(30) NOT NULL
);
