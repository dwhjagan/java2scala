package EduJava.M10.patterns.adapter;

import java.util.Collections;
import java.util.List;

public class Adaptee 
{
	public static void sort(List<Integer> list)
	{
		Collections.sort(list);
	}
}
