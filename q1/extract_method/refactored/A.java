package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   return extractedMethod(nodes, p);
   }

   Edge m2(List<Edge> edgeList, String p) {
	   return extractedMethod(edgeList, p);
   }

    public <T extends Base> extractedMethod(List<T> items, p) {
    	for (T item : items) {
			if (item.contains(p))
				System.out.println(item);
		}
		return null;
    }
}

class Node extends Base {
   
}

class Edge extends Base {
   
}

class Base {
	String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}