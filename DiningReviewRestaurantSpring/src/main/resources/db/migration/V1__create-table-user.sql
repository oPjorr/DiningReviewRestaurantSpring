CREATE TABLE tb_user(
    id SERIAL PRIMARY KEY UNIQUE NOT NULL,
    login TEXT NOT NULL UNIQUE,
    name TEXT NOT NULL,
    phone TEXT,
    email TEXT,
    password TEXT NOT NULL,
    role TEXT NOT NULL
);