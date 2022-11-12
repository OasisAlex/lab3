import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

import javax.lang.model.util.ElementScanner14;

class listfiltercheck implements StringChecker {
    public boolean checkString(String s)
    {
        if (s == "g" || s == "s")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class ListTests{
    @Test
    public void filtercheck() { 
        listfiltercheck sc = new listfiltercheck();
        List<String> list1 = List.of("g","a","b","g");
        List<String> result = List.of("g","g");
        assertEquals(result, ListExamples.filter(list1,sc));
    }

    @Test
    public void filtercheck1() { 
        listfiltercheck sc = new listfiltercheck();
        List<String> list1 = List.of("g","1","g","2", "s");
        List<String> result = List.of("g","g", "s");
        assertEquals(result, ListExamples.filter(list1,sc));
    }

    @Test 
	public void testFilter1() {
        List<String> list1 = List.of("a", "b", "g");
        List<String> list2 = List.of("c", "f", "w");
        List<String> result = List.of("a", "b", "c","f","g","w");
        assertEquals(result, ListExamples.merge(list1, list2));
	}

    @Test 
	public void testFilter2() {
        List<String> list1 = List.of("c");
        List<String> list2 = List.of("a");
        List<String> result = List.of("a", "c");
        assertEquals(result, ListExamples.merge(list1, list2));
	}

    }

