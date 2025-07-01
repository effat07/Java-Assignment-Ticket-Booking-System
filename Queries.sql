create database TicketBookingSystem;
use TicketBookingSystem;

create table Venu(
venu_id int primary key,
venu_name varchar(200),
address varchar(200)
);

create table Event(
event_id int primary key,
event_name varchar(200),
event_date date,
event_time time,
total_seats int,
available_seats int,
ticket_price decimal(10,2),
event_type enum('Movie', 'Sports', 'Concert'),
booking_id int,
venu_id int,
foreign key(venu_id) references Venu(venu_id)
);

create table Customer(
customer_id int primary key,
custmoer_name varchar(100),
email varchar(100),
phone_number varchar(11)
);

create table Booking(
booking_id int primary key,
num_tickets int,
total_cost decimal(10,2),
booking_date date,
customer_id int,
event_id int,
foreign key(customer_id) references Customer(customer_id),
foreign key(event_id) references Event(event_id)
);

select * from Booking;
select * from Customer;
select * from venu;
select * from Event;

alter table Event add constraint foreign key(booking_id) references Booking(booking_id);


alter table Customer add column booking_id int;
alter table Customer add constraint foreign key(booking_id) references Booking(booking_id);








