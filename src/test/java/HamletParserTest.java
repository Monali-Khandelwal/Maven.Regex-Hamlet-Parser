import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {

        //When
        String actual = hamletParser.ChangeHamletToLeon();
        System.out.println("LEON");

        //Then
        Assert.assertFalse(actual.contains("HAMLET"));

    }

    @Test
    public void testChangeHoratioToTariq() {
        //When
        String actual = hamletParser.changeHoratioToTariq();
        System.out.println("TARIQ");

        //Then
        Assert.assertFalse(actual.contains("HORATIO"));
    }

    @Test
    public void testFindHoratio() {

        //When
        String actual = hamletParser.FindHoratio();
        System.out.println("TARIQ");

        //Then
        Assert.assertFalse(actual.contains("HORATIO"));
    }

    @Test
    public void testFindHamlet() {
        String expected="Horatio";
        String actual=hamletParser.FindHoratio();
        System.out.println(actual);
        //

        Assert.assertEquals(expected,actual);

    }

}