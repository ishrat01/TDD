import org.junit.Test;

import java.io.IOException;

/**
 * Created by TUSHAR on 29-11-2016.
 */
public class InputReaderTest {

    @Test
    public void numberOfProductShouldBeValid() throws Exception
    {
        WriteToFile.writeToFile("1\n" +
                "Ishrat H L");
            InputReader.read();


    }
    @Test
    public void numberOfProductsShoudlMatch() throws Exception {

        WriteToFile.writeToFile("1\n" +
                "Ishrat H L");
        InputReader.read();


    }

    @Test
    public void productShouldBeValid() throws Exception {
         WriteToFile.writeToFile("1\n" +
                 "Ishrat H L\n" +
                 "1\n" +
                 "Ishrat X 10") ;
        InputReader.read();

    }

    @Test
    public void numberOfCompetitorsShouldBeValid() throws Exception
    {
        WriteToFile.writeToFile("1\n" +
                "Ishrat H L\n" +
                "1\n" +
                "Ishrat X 10") ;
        InputReader.read();


    }
    @Test(expected = Exception.class)
    public void numberOfCompetitorsShoudlMatch() throws Exception {

        WriteToFile.writeToFile("1\n" +
                "Ishrat H L\n" +
                "1\n" +
                "Ishrat X 10") ;
        InputReader.read();


    }

    @Test
    public void competitorsShouldBeValid() throws Exception {
     WriteToFile.writeToFile("1\n" +
        "Ishrat H L\n" +
                "1\n" +
                "Ishrat X 10") ;
        InputReader.read();


    }
}
