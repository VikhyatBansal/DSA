import java.util.LinkedList;

public class graphadjl {
   
int vertex;
LinkedList<Integer> list[];

graphadjl(int vertex){
this.vertex = vertex;
list = new LinkedList[vertex];

//create a linked list for vertices
for(int i = 0; i<vertex; i++) {
list[i] = new LinkedList<>();
}
}

public void addEdge(int source, int destination) {

//add edge
list[source].addFirst(destination);

}


public void printGraph() {

    for(int i = 0;i<vertex; i++) {
    if(list[i].size()>0) {
    System.out.print("Vertex "+i+" is connected to: ");
    
    for(int j = 0;j<list[i].size();j++) {
    System.out.print(list[i].get(j)+" ");
    }
    System.out.println();
    }
    }
    }
    
    
        public static void main(String[] args) {
          
        graphadjl obj = new graphadjl(4);
        
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 0);
        obj.addEdge(0, 3);
        
        obj.printGraph();
        
        
        }
        
    }
    


