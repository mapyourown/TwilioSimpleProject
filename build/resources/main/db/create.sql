CREATE TABLE USER_INFO (
                          USERID INT NOT NULL AUTO_INCREMENT,
                          TOCOUNTRY varchar(100),
                          TOSTATE varchar(100),
                          SMSMESSAGEID varchar(255),
                          NUMMEDIA int,
                          TOCITY varchar(100),
                          FROMZIP varchar(20),
                          SMSID varchar(255),
                          FROMSTATE varchar(50),
                          SMSSTATUS varchar(255),
                          FROMCITY	varchar(50),
                          BODY varchar(255),
                          FROMPHONE varchar(20),
                          APIVERSION varchar(255),
                          CREATE_DATE varchar(50),
						  UPDATE_DATE varchar(50),
                          OPTIN boolean,
                          PRIMARY KEY (USERID)

);