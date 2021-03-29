CREATE TABLE public.book (
    isbn character varying(17) NOT NULL,
    title text NOT NULL,
    author integer NOT NULL,
    PRIMARY KEY (isbn),
    CONSTRAINT fk_book_author FOREIGN KEY (author) REFERENCES author(id)
);

CREATE TABLE public.book (
    id integer NOT NULL,
    name character varying(20) NOT NULL,
    surname character varying(30) NOT NULL,
    PRIMARY KEY (id)
)
