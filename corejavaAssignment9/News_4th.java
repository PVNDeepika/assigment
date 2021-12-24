package corejavaAssignment9;
import java.util.Arrays;
import java.util.List;

public class News_4th {
	
	List<News> newsObj=Arrays.asList(
			new News(111,"postedByUser1","Good","Good Job"),
			new News(222,"postedByUser2","Excellent","Nice Job"),
			new News(333,"postedByUser3","Average","Not Bad")
			);
			newsObj.stream().forEach(p->System.out.println(""+p.getComment()));
 }
}
