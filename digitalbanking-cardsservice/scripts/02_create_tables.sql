DROP TABLE IF EXISTS card;
CREATE TABLE card (
  card_no bigint(20) NOT NULL,
  cvv int(11) NOT NULL,
  expiry_date date NOT NULL,
  card_type varchar(10) NOT NULL,
  customer_id int(11) DEFAULT NULL,
  card_company varchar(10) NOT NULL,
  credit_limit decimal(10,2) DEFAULT NULL,
  card_status tinyint(1) DEFAULT NULL,
  PRIMARY KEY (card_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
  customer_id int(11) NOT NULL,
  customer_name char(40) NOT NULL,
  password char(20) DEFAULT NULL,
  last_login date DEFAULT NULL,
  mobile_no char(15) DEFAULT NULL,
  email_id varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
