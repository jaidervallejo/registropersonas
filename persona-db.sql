PGDMP         )                y         
   persona-db    12.8    12.8                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16393 
   persona-db    DATABASE     ?   CREATE DATABASE "persona-db" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Colombia.1252' LC_CTYPE = 'Spanish_Colombia.1252';
    DROP DATABASE "persona-db";
                postgres    false            ?            1259    16395    personas    TABLE     ?   CREATE TABLE public.personas (
    cedula integer NOT NULL,
    fecha_nacimiento date,
    nombre character varying NOT NULL
);
    DROP TABLE public.personas;
       public         heap    postgres    false            ?
          0    16395    personas 
   TABLE DATA           D   COPY public.personas (cedula, fecha_nacimiento, nombre) FROM stdin;
    public          postgres    false    202   ?       
           2606    16402    personas pk_persona_cedula 
   CONSTRAINT     \   ALTER TABLE ONLY public.personas
    ADD CONSTRAINT pk_persona_cedula PRIMARY KEY (cedula);
 D   ALTER TABLE ONLY public.personas DROP CONSTRAINT pk_persona_cedula;
       public            postgres    false    202            ?
   ?   x?M?M
?0????@efҿ,]t]??4?@Mpj???Rl??f>?#?+c+[`d???7!髗6??(?9%??̐???????+??*?? 8??^??k???"Df$?/??t??n???䗦??p???j;?}'I?|?H??J?/?2?     