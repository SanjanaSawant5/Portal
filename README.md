CREATE DEFINER=`root`@`localhost` PROCEDURE `userportallogin`(IN p_username varchar(45), IN p_password varchar(45))
@username varchar(255)
@password varchar(255)
AS

BEGIN
SET NOCOUNT ON;
    IF EXISTS(SELECT * FROM sheraton_town_house WHERE username= p_username AND password = p_password) 
    BEGIN
        -- user exists in the 'sheraton_town_house' table
        SELECT * FROM sheraton_town_house WHERE username = p_username AND password = p_password AND propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 IS NOT NULL;
        END
        ELSE
        BEGIN
        SELECT 'Invalid username or password' AS ErrorMsg
        END
        END
        EXEC userportallogin 'username','password'
    END IF;
    
    IF EXISTS(SELECT * FROM huntington_hacienda_1 WHERE username= p_username AND password = p_password ) THEN
        -- user exists in the 'huntington_hacienda_1' table
        SELECT * FROM huntington_hacienda_1 WHERE username = p_username AND password = p_password propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 IS NOT NULL;
        END
        ELSE
        BEGIN
        SELECT 'Invalid username or password' AS ErrorMsg
        END
        END
        EXEC userportallogin 'username','password'
    END IF;
    IF EXISTS(SELECT * FROM courtland_city_lights WHERE username= p_username AND password = p_password ) THEN
        -- user exists in the 'courtland_city_lights' table
        SELECT * FROM courtland_city_lights WHERE username = p_username AND password = p_password propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 IS NOT NULL;
        END
        ELSE
        BEGIN
        SELECT 'Invalid username or password' AS ErrorMsg
        END
        END
        EXEC userportallogin 'username','password'
    END IF;
    IF EXISTS(SELECT * FROM adams_city_lights WHERE username= p_username AND password = p_password ) THEN
        -- user exists in the 'adams_city_lights' table
        SELECT * FROM adams_city_lights WHERE username = p_username AND password = p_password propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 IS NOT NULL;
        END
        ELSE
        BEGIN
        SELECT 'Invalid username or password' AS ErrorMsg
        END
        END
        EXEC userportallogin 'username','password'
    END IF;

END
CREATE DEFINER=root@localhost PROCEDURE userportallogin(
    IN p_username varchar(45), 
    IN p_password varchar(45)
)
BEGIN 
    SET NOCOUNT ON; 
    
    IF EXISTS(SELECT * FROM sheraton_town_house WHERE username= p_username AND password = p_password) THEN
        -- user exists in the 'sheraton_town_house' table
        SELECT propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 FROM sheraton_town_house WHERE username = p_username AND password = p_password AND (propertycode IS NOT NULL OR propertyname IS NOT NULL OR unit IS NOT NULL OR resident IS NOT NULL OR name IS NOT NULL OR parkingspace1 IS NOT NULL OR parkinglevel1 IS NOT NULL OR parkingtype1 IS NOT NULL OR vehiclenumber1 IS NOT NULL OR registrationtenantname1 IS NOT NULL OR licensenumber1 IS NOT NULL OR vehiclemodel1 IS NOT NULL OR registrationexpiredate1 IS NOT NULL OR insuranceexpiredate1 IS NOT NULL OR status1 IS NOT NULL OR parkingspace2 IS NOT NULL OR parkinglevel2 IS NOT NULL OR parkingtype2 IS NOT NULL OR vehiclenumber2 IS NOT NULL OR registrationtenantname2 IS NOT NULL OR licensenumber2 IS NOT NULL OR vehiclemodel2 IS NOT NULL OR registrationexpiredate2 IS NOT NULL OR insuranceexpiredate2 IS NOT NULL OR status2 IS NOT NULL);
    ELSEIF EXISTS(SELECT * FROM huntington_hacienda_1 WHERE username= p_username AND password = p_password ) THEN
        -- user exists in the 'huntington_hacienda_1' table
        SELECT propertycode, propertyname, unit, resident, name, parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1, registrationtenantname1, licensenumber1, vehiclemodel1, registrationexpiredate1, insuranceexpiredate1, status1, parkingspace2, parkinglevel2, parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2, vehiclemodel2, registrationexpiredate2, insuranceexpiredate2, status2 FROM huntington_hacienda_1 WHERE username = p_username AND password = p_password AND (propertycode IS NOT NULL OR propertyname IS NOT NULL OR unit IS NOT NULL OR resident IS NOT NULL OR name IS NOT NULL OR parkingspace1 IS NOT NULL OR parkinglevel1 IS NOT NULL OR parkingtype1 IS NOT NULL OR vehiclenumber1 IS NOT NULL OR registrationtenantname1 IS NOT NULL OR licensenumber1 IS NOT NULL OR vehiclemodel1 IS NOT NULL OR registrationexpiredate1 IS NOT NULL OR insuranceexpiredate1 IS NOT NULL OR status1 IS NOT NULL OR parkingspace2 IS NOT NULL OR parkinglevel2 IS NOT NULL OR parkingtype2 IS NOT NULL OR vehiclenumber2 IS NOT NULL OR registrationtenantname2 IS NOT NULL OR licensenumber2 IS NOT NULL OR vehiclemodel2 IS NOT NULL OR registrationexpiredate2 IS NOT NULL OR insuranceexpiredate2 IS NOT NULL OR status2 IS NOT NULL);
