CREATE TABLE Account
(
    id INTEGER NOT NULL,
    accountType NVARCHAR(10) NOT NULL,
    clientId NVARCHAR(20) not null,
    balance Decimal(5,2) not null ,
    withdrawalAllowed boolean,
    CONSTRAINT PK_Account PRIMARY KEY  (id)
);
insert into Account values(1 , 'CHECKING', '00100001', 100.00,true);