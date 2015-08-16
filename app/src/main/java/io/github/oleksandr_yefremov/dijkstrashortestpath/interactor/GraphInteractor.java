/**
 * Created by Oleksandr Yefremov.
 */
package io.github.oleksandr_yefremov.dijkstrashortestpath.interactor;

import java.util.List;

import io.github.oleksandr_yefremov.dijkstrashortestpath.entity.Graph;

public class GraphInteractor {

  //  private EdgeWeightedGraph graph = new EdgeWeightedGraph(10, 10);
  private Graph graph;
  private static final Graph.Edge[] GRAPH = {
    new Graph.Edge(0, 1, 7),
    new Graph.Edge(1, 2, 9),
    new Graph.Edge(0, 5, 14),
    new Graph.Edge(1, 2, 10),
    new Graph.Edge(1, 3, 15),
    new Graph.Edge(2, 3, 11),
    new Graph.Edge(2, 5, 2),
    new Graph.Edge(3, 4, 6),
    new Graph.Edge(4, 5, 9),
  };
  private static final int START = 0;
  private static final int END = 4;

  public GraphInteractor() {
    graph = new Graph(GRAPH);
  }

  public Graph getGraph() {
    return graph;
  }

  public List<Integer> calculateShortestPath(int v1Index, int v2Index) {
    graph.dijkstra(v1Index);
    return graph.printPath(v2Index);
  }
}