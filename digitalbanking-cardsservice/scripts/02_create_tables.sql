ALTER TABLE public.customer
    OWNER to postgres;
    
create table DBT.card(card_no bigint , cvv int  not null, expiry_date date not null, 
card_type varchar(10) not null, customer_id int, card_company varchar(10) not null, 
credit_limit decimal(10,2), card_status Boolean, constraint pk_cardNo primary key(card_no));

INSERT INTO DBT.CARD VALUES(3624978443870993,6502,'2020-12-31','CREDIT',556677,'VISA',250000,1)
