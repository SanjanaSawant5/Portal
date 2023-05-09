CREATE PROCEDURE sp_Login

    @username varchar(50),

    @password varchar(50)

AS

BEGIN

    SET NOCOUNT ON;

    -- Check if the user exists in the "users" table

    IF EXISTS (SELECT * FROM users WHERE username = @username AND password = @password)

    BEGIN

        -- User exists, so return all non-null columns for that user

        SELECT * FROM users WHERE username = @username AND password = @password AND column_name IS NOT NULL

    END

    ELSE

    BEGIN

        -- User does not exist, so return an error message

        SELECT 'Invalid username or password' AS ErrorMsg

    END

END

EXEC sp_Login 'myusername', 'mypassword'

