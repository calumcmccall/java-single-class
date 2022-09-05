import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50);
    }

    @Test
    public void hasSheetsLeft(){
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void printHaveEnoughSheets(){
        printer.print(2, 5);
        assertEquals(40, printer.getSheetsLeft());
    }

    @Test
    public void printNotEnoughSheets(){
        printer.print(20, 8);
        assertEquals(50, printer.getSheetsLeft());
    }

}
