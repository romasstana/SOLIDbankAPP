CREATE TABLE Account
(
    id NVARCHAR(20) NOT NULL,
    account_type NVARCHAR(10) NOT NULL,
    client_id NVARCHAR(20) not null,
    balance DOUBLE not null ,
    withdrawal_allowed BIT,
    CONSTRAINT PK_Account PRIMARY KEY  (id)
);
CREATE TABLE Transactions(
    id NVARCHAR(20) NOT NULL,
    transaction_type NVARCHAR(10) NOT NULL,

)
-- insert into Account values('CHECKING' , 1, '00100001', 100.00,true);