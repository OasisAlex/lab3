import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;
public class ListTests{
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
