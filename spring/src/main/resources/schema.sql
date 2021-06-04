DROP TABLE IF EXISTS admin; CREATE TABLE admin (
    nev character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    jelszo character varying(100) NOT NULL
);DROP TABLE IF EXISTS etel;
   CREATE TABLE etel (
    nev character varying(100) NOT NULL PRIMARY KEY,
    ar integer NOT NULL,
    etterem_id integer
);DROP TABLE IF EXISTS etterem;
  CREATE TABLE etterem (
    id integer NOT NULL PRIMARY KEY,
    etterem_neve character varying(100),
    etterem_cime character varying(100) NOT NULL,
    admin_nev character varying(100)
);DROP TABLE IF EXISTS futar;
    CREATE TABLE futar (
    id integer NOT NULL PRIMARY KEY,
    nev character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    jelszo character varying(100) NOT NULL,
    etterem_id integer
);DROP TABLE IF EXISTS kedvenc;
    CREATE TABLE kedvenc(
    id integer NOT NULL,
    etel_nev character varying(100)
);DROP TABLE IF EXISTS kosar;
   CREATE TABLE kosar (
    id integer NOT NULL PRIMARY KEY,
    etel_neve varchar(10),
    etel_ara integer NOT NULL,
    vasarlo_id integer
);DROP TABLE IF EXISTS megrendeles;
  CREATE TABLE megrendeles (
    id integer NOT NULL PRIMARY KEY,
    futar_id integer,
    megjegyzes varchar(100),
    vasarlo_neve varchar(100) NOT NULL,
    vasarlo_cime varchar(100) NOT NULL,
    etel_neve varchar(10) NOT NULL,
    etel_ara varchar(10) NOT NULL
);DROP TABLE IF EXISTS panasz;
    CREATE TABLE panasz (
    id integer NOT NULL PRIMARY KEY,
    vasarlo_id integer NOT NULL,
    admin_nev varchar(100) NOT NULL,
    tartalom varchar(250) NOT NULL
);DROP TABLE IF EXISTS vasarlo;
    CREATE TABLE vasarlo (
    id integer NOT NULL PRIMARY KEY,
    nev varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    jelszo varchar(100) NOT NULL,
    telefon integer NOT NULL
);
