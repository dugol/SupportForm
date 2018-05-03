Script DB
---------------------------------------------------------------------------------
CREATE TABLE TypeUser(
idTypeUser int not null,
name varchar(20) not null,
primary key(idTypeUser)
);

CREATE TABLE MainFrame(
stockNumber varchar(30) not null,
reference varchar(30) not null,
brand varchar(20) not null,
serialNumber varchar(25) not null,
processor varchar(40) not null,
ram int not null,
hardDrive varchar(20) not null,
mainBoard varchar(20) not null,
primary key(serialNumber));

CREATE TABLE User(
email varchar(30) not null,
typeUser int not null,
name varchar(40) not null,
office varchar(20),
mainFrame varchar(30),
phoneNumber varchar(10),
password varchar(30),
primary key(email),
foreign key(typeUser) REFERENCES TypeUser(idTypeUser),
foreign key(mainFrame) REFERENCES MainFrame(serialNumber)
);

CREATE TABLE TypeRequest(
idTypeRequest int not null AUTO_INCREMENT,
name varchar(20) not null,
primary key(idTypeRequest));

CREATE TABLE Request(
idRequest int not null AUTO_INCREMENT,
date Date not null not null,
eventTime varchar(10) not null,
user varchar(30) not null,
office varchar(20),
description varchar(200),
type int not null,
channel varchar(20),
priority int,
level int,
state char(1),
primary key(idRequest),
foreign key(user) REFERENCES User(email),
foreign key(type) REFERENCES TypeRequest(idTypeRequest));

CREATE TABLE GeneralEvent(
idGEvent int not null AUTO_INCREMENT,
request int not null,
date Date,
eventTime varchar(10),
stockNumber varchar(30),
detail varchar(200),
administrator varchar(10),
primary key(idGEvent),
foreign key(request) REFERENCES Request(idRequest));

CREATE TABLE MaintenanceEvent(
idREvent int not null AUTO_INCREMENT,
request int not null,
date Date,
stockNumber varchar(30),
interventionType varchar(10) not null,
firstState varchar(10) not null,
firstObservation varchar(100) not null,
process varchar(100) not null,
finalState varchar(10) not null,
finalObservation varchar(100),
administrator varchar(10),
primary key(idREvent),
foreign key(request) REFERENCES Request(idRequest));

CREATE TABLE ModificationEvent(
idMEvent int not null AUTO_INCREMENT,
request int not null,
date Date,
stockNumber varchar(30),
component varchar(50),
modificationType varchar(10),
serialNAdded varchar(20),
serialNRetired varchar(20),
observation varchar(100),
administrator varchar(10),
primary key(idMEvent),
foreign key(request) REFERENCES Request(idRequest));

CREATE TABLE SharedEvent(
idSEvent int not null AUTO_INCREMENT,
request int not null,
date Date,
action varchar(10),
route varchar(10),
userType varchar(10),
stockNumber varchar(30),
user varchar(30),
office varchar(20),
administrator varchar(10),
primary key(idSEvent),
foreign key(request) REFERENCES Request(idRequest));

CREATE TABLE TransferEvent(
idTEvent int not null AUTO_INCREMENT,
request int not null,
date Date,
stockNumber varchar(30),
originPlace varchar(20),
destinationPlace varchar(20),
user varchar(30),
observation varchar(80),
administrator varchar(10),
primary key(idTEvent),
foreign key(request) REFERENCES Request(idRequest));

CREATE TABLE RefundEvent(
idReEvent int not null AUTO_INCREMENT,
date Date,
stockNumber varchar(30),
item varchar(30),
amount int,
reference varchar(30),
state varchar(15),
observation varchar(80),
primary key(idReEvent));

INSERT INTO TypeUser values(1,'administrador')

INSERT INTO MainFrame values('000000','G32M','SURE','0000000','Intel core i3',8,'500GB','G32M');

insert into User values('rgr2228@gmail.com',1,'Raul','','0000000','','12345');

INSERT INTO TypeRequest values(1,'incidente');

INSERT INTO Request values(1,NOW(),'08:00','rgr2228@gmail.com','111','Mi equipo se incendio', 1, 'telefonico', 2, 1 ,'0');

INSERT INTO GeneralEvent values(1,1, NOW(), '08:00', '000000', 'Se usa extintor', 'Daniel');

INSERT INTO MaintenanceEvent values(1,1,NOW(),'000000','Prev','OP','Tiene daños leves pero funciona correctamente','Se limpia la impresora','OP','','Daniel');


---------------------------------------------------------------------------------
