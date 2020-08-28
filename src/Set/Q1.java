package Set;

import java.util.LinkedHashSet;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> link1 = new LinkedHashSet<String>();
        //add elements to LinkedHashSet
        link1.add("dog");
        link1.add("cat");
        link1.add("elephant");
        link1.add("rat");
        link1.add("dinosour");
        System.out.println(link1);
        LinkedHashSet<String> link2 = new LinkedHashSet<String>();
        link2.add("bee");
        link2.add("mosquitoe");
        link2.add("butterfly");
        link2.add("cat");
        link2.add("elephant");
        System.out.println(link2);
        link1.retainAll(link2);
        System.out.println("LinkedHashSet retain elements : " + link1);

	}

}
