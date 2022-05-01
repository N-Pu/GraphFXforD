package sections;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class SituationA {
    public void createGraph(){
        System.setProperty("org.graphstream.ui", "javafx");
        Graph graph = new SingleGraph("P");
        graph.addNode("A" );
        graph.addNode("B" );
        graph.addNode("C" );
        graph.addEdge("AB", "A", "B");
        graph.addEdge("BC", "B", "C");
        graph.addEdge("CA", "C", "A");

        graph.display();

    }

    public static void main(String[] args) {
//        Thread thread = new Thread();
//        thread.getContextClassLoader();
        SituationA s = new SituationA();
        s.createGraph();
    }
}
