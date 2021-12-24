package corejavaAssignment9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ColorWise_2nd {
	public static void main(String[] args) {
		List<fruit> fruits= Arrays.asList(
		new fruit("apple",40,60,"red"),
		new fruit("banana",79,80,"yellow"),
		new fruit("mango",70,60,"yellow"),
		new fruit("orange",50,70,"orange"),
		new fruit("grapes",60,50,"green"),
		new fruit("guva",30,40,"green")
		);
		Collections.sort(fruits,(o1,o2)->(o1.getColor().compareTo(o2.getColor())));
		fruits.stream().forEach( p ->System.out.println(" "+p.toString()));
		}

}
