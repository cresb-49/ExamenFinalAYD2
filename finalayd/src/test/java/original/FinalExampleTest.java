package original;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InjectMocks;

import com.carlos.original.FinalExample;

public class FinalExampleTest {
    private final String TEST1 = "kgkjgtkerjgter,kegrkjtger,kjehgrjt";
    private final String TEST3 = "kgkjgtkerjgter";

    // Normal user information
    private final String NAME = "Carlos";
    private final String NAME_FAIL = "";
    private final String EMAIL = "carlosemail@email.com";
    private final String EMAIL_FAIL = "carlosemailemail.com";
    private final String PHONE = "12345678";
    private final String ADDRESS = "Direccion 1";
    private final String CITY = "Ciudad";
    private final String ZIP = "ZIP";

    @InjectMocks
    FinalExample finalExample = new FinalExample();
    
    @Test
    public void processDateWhenStirngHas3Comas(){
        finalExample.processData(TEST1);
        verify(finalExample,times(1)).processData(TEST1);
    }

    @Test
    public void processDataWhenStringHas0Comas(){
        finalExample.processData(TEST3);
        verify(finalExample,times(1)).processData(TEST3);
    }

    @Test
    public void createUserWithValidInformation(){
        when(finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP)).thenReturn("User created: " + NAME);
        String result = finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP);
        assertNotNull(result);
        assertEquals(result, "User created: "+NAME);
    }


    @Test
    public void createUserWithNoValidName(){
        when(finalExample.createUser(NAME_FAIL, EMAIL, PHONE, ADDRESS, CITY, ZIP)).thenReturn("Name cannot be empty");
        String result = finalExample.createUser(NAME_FAIL, EMAIL, PHONE, ADDRESS, CITY, ZIP);
        assertNotNull(result);
        assertEquals(result,"Name cannot be empty");
    }

    @Test
    public void createUserWithInvalidEmail(){
        when(finalExample.createUser(NAME, EMAIL_FAIL, PHONE, ADDRESS, CITY, ZIP)).thenReturn("Invalid email");
        String result = finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP);
        assertNotNull(result);
        assertEquals(result, "Invalid email");
    }

    @Test
    public void calculateAreaOfCircle(){

    }

    @Test
    public void calculateAreaOfRectangle(){

    }

    @Test
    public void calculateAreaOfTriangle(){

    }

    @Test
    public void calculateAreaOfShapeWithNotFomulaShape(){
        
    }

}
