CREATE TABLE post (
                      id SERIAL PRIMARY KEY,
                      name TEXT
);
CREATE TABLE candidate (
                      id SERIAL PRIMARY KEY,
                      name TEXT
);
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name TEXT,
    email TEXT,
    password TEXT,
    CONSTRAINT email_unique UNIQUE (email)
);
CREATE TABLE cities (
                       id TEXT, country_en TEXT, region_en TEXT,
                       city_en TEXT, country TEXT, region TEXT,
                        city TEXT, lat TEXT, lng TEXT, population TEXT
);