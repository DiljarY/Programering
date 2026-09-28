package Exercise10;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCorrectPassword() {


        //Arange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("password1!");

        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testLessThan8Charachters() {


        //Arange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);


    }
    @Test
    public void testLessThan8CharachtersAndNoDigits() {


        //Arange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass2");

        //Assert
        assertEquals(expected, actual);


    }


    @Test
    public void testNoDigit() {


        //Arange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password!");

        //Assert
        assertEquals(expected, actual);


    }
    @Test
    public void testNoSpecialCharacthers() {


        //Arange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password2");

        //Assert
        assertEquals(expected, actual);


    }


}
