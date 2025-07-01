
insert into Venu (venu_name, address) values
('Nehru Stadium', 'Chennai'),
('Wankhede Stadium', 'Mumbai'),
('Bharatiya Kala Bhavan', 'Delhi'),
('Rangmanch Theater', 'Pune'),
('Sardar Patel Stadium', 'Ahmedabad'),
('Hitech Auditorium', 'Hyderabad'),
('Green Field', 'Kerala'),
('Royal Park', 'Bangalore'),
('City Arena', 'Lucknow'),
('Phoenix Hall', 'Kolkata');

Select* from venu;

insert into Event(event_name, event_date, event_time, venu_id, total_seats, available_seats, ticket_price, event_type, booking_id) values
('Champions Cup Final', '2025-06-20', '18:00:00', 1, 20000, 5000, 2500.00, 'Sports', NULL),
('Rock Concert Night', '2025-07-10', '20:00:00', 2, 15000, 3000, 1800.00, 'Concert', NULL),
('Cricket World Cup', '2025-10-12', '15:30:00', 3, 25000, 0, 3000.00, 'Sports', NULL),
('Movie Premiere: FutureX', '2025-04-01', '19:00:00', 4, 200, 60, 500.00, 'Movie', NULL),
('Comedy Concert', '2025-08-25', '20:30:00', 5, 1000, 300, 1200.00, 'Concert', NULL),
('Drama Night', '2025-09-10', '18:45:00', 6, 500, 500, 700.00, 'Movie', NULL),
('Football Cup Semi', '2025-06-15', '17:00:00', 7, 18000, 2000, 2200.00, 'Sports', NULL),
('Jazz Music Live', '2025-12-01', '21:00:00', 8, 1200, 0, 1500.00, 'Concert', NULL),
('Dance Fiesta', '2025-05-05', '19:30:00', 9, 900, 400, 1000.00, 'Concert', NULL),
('Horror Movie Night', '2025-10-31', '22:00:00', 10, 300, 50, 800.00, 'Movie', NULL);

Select* from Event;


insert into Customer(custmoer_name, email, phone_number, booking_id) values
('Ravi Sharma', 'ravi@gmail.com', '9876543000', NULL),
('Anjali Mehta', 'anjali@gmail.com', '9123456000', NULL),
('John Doe', 'john@example.com', '9988776600', NULL),
('Priya Singh', 'priya@yahoo.com', '9900887000', NULL),
('Aman Verma', 'amanv@gmail.com', '9000111222', NULL),
('Sana Khan', 'sana@outlook.com', '7000000000', NULL),
('Kiran Patil', 'kiran@gmail.com', '7777700000', NULL),
('David Miller', 'david@demo.com', '8111100000', NULL),
('Neha Joshi', 'neha.j@gmail.com', '8222200000', NULL),
('Arjun Reddy', 'arjunreddy@gmail.com', '8333300000', NULL);

Select* from Customer;

insert into Booking(customer_id, event_id, num_tickets, total_cost, booking_date) values
(1, 1, 5, 12500.00, '2025-06-01'),
(2, 2, 2, 3600.00, '2025-06-05'),
(3, 4, 1, 500.00, '2025-06-10'),
(4, 3, 3, 9000.00, '2025-06-15'),
(5, 5, 6, 7200.00, '2025-06-18'),
(6, 6, 2, 1400.00, '2025-06-20'),
(7, 7, 4, 8800.00, '2025-06-22'),
(8, 8, 3, 4500.00, '2025-06-25'),
(9, 9, 1, 1000.00, '2025-06-27'),
(10, 10, 2, 1600.00, '2025-06-29');

Select* from Booking;

SET foreign_key_checks = 1;

UPDATE Event SET booking_id = 1 WHERE event_id = 1;
UPDATE Event SET booking_id = 2 WHERE event_id = 2;
UPDATE Event SET booking_id = 3 WHERE event_id = 4;
UPDATE Event SET booking_id = 4 WHERE event_id = 3;
UPDATE Event SET booking_id = 5 WHERE event_id = 5;
UPDATE Event SET booking_id = 6 WHERE event_id = 6;
UPDATE Event SET booking_id = 7 WHERE event_id = 7;
UPDATE Event SET booking_id = 8 WHERE event_id = 8;
UPDATE Event SET booking_id = 9 WHERE event_id = 9;
UPDATE Event SET booking_id = 10 WHERE event_id = 10;


UPDATE Customer SET booking_id = 1 WHERE customer_id = 1;
UPDATE Customer SET booking_id = 2 WHERE customer_id = 2;
UPDATE Customer SET booking_id = 3 WHERE customer_id = 3;
UPDATE Customer SET booking_id = 4 WHERE customer_id = 4;
UPDATE Customer SET booking_id = 5 WHERE customer_id = 5;
UPDATE Customer SET booking_id = 6 WHERE customer_id = 6;
UPDATE Customer SET booking_id = 7 WHERE customer_id = 7;
UPDATE Customer SET booking_id = 8 WHERE customer_id = 8;
UPDATE Customer SET booking_id = 9 WHERE customer_id = 9;
UPDATE Customer SET booking_id = 10 WHERE customer_id = 10;

