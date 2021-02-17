CREATE TABLE public.books (
    isbn character varying(17) NOT NULL,
    title text NOT NULL,
    author character varying(30) NOT NULL,
    PRIMARY KEY (isbn)
);

