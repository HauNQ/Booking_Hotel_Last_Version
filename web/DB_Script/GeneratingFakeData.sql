-- Thêm dữ liệu cho bảng Role
use BookingHotel
go
INSERT INTO Role (code, name)
VALUES 
('Admin', 'Administrator'),
('Cust', 'Customer'),
('Sup', 'Supplier');

go

INSERT INTO RoomType (roomType, price, roomDesc)
VALUES 
('Single', 100.00, 'Single bed room with basic amenities'),
('Double', 150.00, 'Double bed room suitable for couples'),
('Suite', 250.00, 'Luxurious suite with living area and kitchenette');
go


-- Thêm dữ liệu cho bảng Customer
INSERT INTO Customer (fullname, dob, role, email, phone, status, address, modifiedBy, modifiedDate, createdDate)
VALUES 
('John Doe', '1990-05-15', 'Cust', 'john.doe@example.com', '1234567890', 1, '456 Pine St', NULL, Null, GETDATE()),
('Jane Smith', '1985-08-20', 'Cust', 'jane.smith@example.com', '9876543210', 1, '789 Cedar St', NULL,Null, GETDATE()),
('Alice Johnson', '1978-12-10', 'Cust', 'alice.johnson@example.com', '4567890123', 1, '321 Oak St', NULL, Null, GETDATE());
go

-- Thêm dữ liệu cho bảng Hotel
INSERT INTO Hotel (name, address, postcode, numRooms, phone, starRating)
VALUES 
('Hotel A', '123 Main St', 'ABC123', 50, '1234567890', 4.5),
('Hotel B', '456 Oak St', 'DEF456', 75, '9876543210', 3.8),
('Hotel C', '789 Elm St', 'GHI789', 100, '4567890123', 4.0);
go


-- Thêm dữ liệu cho bảng Room
INSERT INTO Room (hotelID, roomTypeId, occupancy, priceIncludes, status)
VALUES 
( 2, 1, 1, 'Breakfast', 1),
( 1, 2, 2, 'Breakfast, Wi-Fi', 1),
( 3, 3, 1, 'Breakfast, Parking', 1)
-- Tiếp tục thêm dữ liệu cho các phòng khác tương tự
;
go

-- Thêm dữ liệu cho bảng Supplier
INSERT INTO Supplier (fullName, dob, role, email, phone, status, address, hotelId, modifiedDate, createdDate)
VALUES 
('Supplier A', '1980-03-25', 'Sup', 'supplierA@example.com', '1112223333', 1, '123 Elm St', 3, Null, GETDATE()),
('Supplier B', '1975-07-12', 'Sup', 'supplierB@example.com', '4445556666', 1, '456 Maple St', 1, Null, GETDATE()),
('Supplier C', '1992-10-18', 'Sup', 'supplierC@example.com', '7778889999', 1, '789 Birch St', 2, Null, GETDATE());
go

-- Thêm dữ liệu cho bảng Admin
INSERT INTO [Admin] (fullname, dob, [role], email, phone, status, address, modifiedBy, modifiedDate, createdDate)
VALUES 
('Admin 1', '1990-01-15', 'Admin', 'admin1@example.com', '1234567890', 1, '123 Admin St', NULL, Null, GETDATE()),
('Admin 2', '1985-05-20', 'Admin', 'admin2@example.com', '9876543210', 1, '456 Admin St', NULL, Null, GETDATE())
;

-- Thêm dữ liệu cho bảng Booking
INSERT INTO Booking (hotelID, customerID, roomNo, bookingTime, arrivalTime, departureTime, numAdults, numChilds, specialReq, status)
VALUES 
(1, 2, 1, '2024-03-01 12:00:00', '2024-03-10 14:00:00', '2024-03-15 11:00:00', 2, 1, 'Non-smoking room', 1),
(2, 1, 3, '2024-03-05 10:00:00', '2024-03-12 12:00:00', '2024-03-19 10:00:00', 1, 0, 'Extra towels', 1)
;
go


-- Thêm dữ liệu cho bảng Invoice
INSERT INTO Invoice (bookingID, customerID, roomCharge, roomService, paymentDate, paymentMode, creditCardNo)
VALUES 
(1, 2, 800.00, 'Room service, Laundry', '2024-03-15 11:30:00', 'Card', '1234567890123456'),
(2, 1, 650.00, 'Room service, Spa', '2024-03-19 10:30:00', 'Card', '9876543210987654')
-- Tiếp tục thêm dữ liệu cho các hóa đơn khác tương tự
;
go


-- Thêm dữ liệu cho bảng CancelBooking
INSERT INTO CancelBooking (customerID, bookingid, content, createdDate, status)
VALUES 
(1, 2, 'Change of plans', '2024-03-14 09:00:00', 1),
(2, 1, 'Emergency situation', '2024-03-17 15:30:00', 1)
-- Tiếp tục thêm dữ liệu cho các bản ghi hủy đặt phòng khác tương tự
;
go


-- Thêm dữ liệu cho bảng manageFavRoom
INSERT INTO manageFavRoom (roomNo, customerId)
VALUES 
(1, 2),
(2, 1)
-- Tiếp tục thêm dữ liệu cho các phòng ưa thích khác tương tự
;
go


-- Thêm dữ liệu cho bảng Report
INSERT INTO Report (customerId, roomNo, createdDate, content)
VALUES 
(2, 1, '2024-03-15 14:00:00', 'Excellent service and amenities.'),
(1, 3, '2024-03-20 10:00:00', 'Room cleanliness could be improved.')
-- Tiếp tục thêm dữ liệu cho các báo cáo khác tương tự
;
go

-- Thêm dữ liệu cho bảng Feedback
INSERT INTO Feedback (customerID, roomNo, createdDate, content)
VALUES 
(2, 1, '2024-03-16 09:00:00', 'Very satisfied with the room.'),
(1, 3, '2024-03-21 11:00:00', 'Average experience, could be better.')
-- Tiếp tục thêm dữ liệu cho các phản hồi khác tương tự
;
go
