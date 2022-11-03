import java.util.*;

public class CourseSchedule2 {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        // Create an Adjacency List
        Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
        int[] indegree = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];

        //creating the adjacent list
        for(int i=0; i<prerequisites.length; i++){
            int post = prerequisites[i][0];
            int pre = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(pre, new ArrayList<Integer>());
            lst.add(post);
            adjList.put(pre, lst);
            indegree[post] += 1;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int i=0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            topologicalOrder[i++] = node;

            if(adjList.containsKey(node)){
                for(Integer neighbor : adjList.get(node)){
                    indegree[neighbor]--;

                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }
            }
        }
        if(i == numCourses){
            return topologicalOrder;
        }

        return new int[0];
    }
}
