import java.util.*;


class Program {

    public static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void printGraph(ArrayList<Edge> graph[]) {

        for(int i=0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e =graph[i].get(j);
                System.out.print(e.src+" is connect to "+e.dest+" \n");
            }

            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(1);
        while(!q.isEmpty()) {
            int curr = q.remove();
            if(!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr] = true;
            }
 
            for(int j=0; j<graph[curr].size();j++) {
                Edge e = graph[curr].get(j);
                q.add(e.dest);
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]) {
        
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int j=0; j<graph[curr].size(); j++) {
            Edge e = graph[curr].get(j);
            if(!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 6, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 4, 1));
        graph[6].add(new Edge(6, 5, 1));

        bfs(graph);

        // printGraph(graph);


    }
}
