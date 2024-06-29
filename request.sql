CREATE TABLE request (
	id int not null auto_increment,
	code varchar(255) not null,
    start date not null,
    end date not null,
    value float not null,
    date date not null,
    primary key(id)
);

