INSERT INTO "account" ("account_no", "customer_id", "ifsc_code", "account_type", "account_balance", "account_creation_date", "account_status") VALUES
(355245,	556677,	'DBSB238',	'S',	25000,	'2016-11-12',	't'),
(355230,	556677,	'DBSB234',	'S',	5000,	'2016-11-08',	't'),
(355650,	556677,	'DBSB274',	'S',	50000,	'2016-12-03',	't'),
(355680,	556678,	'DBSB244',	'S',	50000,	'2016-01-03',	't'),
(3557230,	556678,	'DBSB294',	'S',	50000,	'2016-11-11',	't');

INSERT INTO "customer" ("customer_id", "customer_name", "password", "last_login", "mobile_no", "email_id") VALUES
(556677,	'Raja',	'capg123',	NULL,	NULL,	NULL),
(556678,	'Mahesh',	'capg123',	NULL,	NULL,	NULL);