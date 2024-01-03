#include <bits/stdc++.h> 
using namespace std;

long long dijkstra(int start, int end, vector<vector<pair<int, int>>>& graph) {
    priority_queue<pair<long long, int>, vector<pair<long long, int>>, greater<pair<long long, int>>> pq;
    vector<long long> dist(graph.size(), LLONG_MAX);

    pq.push({0, start});
    dist[start] = 0;

    while (!pq.empty()) {
        int u = pq.top().second;
        long long u_dist = pq.top().first;
        pq.pop();

        if (u_dist > dist[u]) continue;

        for (auto& edge : graph[u]) {
            int v = edge.first;
            int weight = edge.second;

            if (dist[v] > dist[u] + weight) {
                dist[v] = dist[u] + weight;
                pq.push({dist[v], v});
            }
        }
    }

    return dist[end];
}

long long minimumCostPath(int N, int M, int source, int destination, int intermediate, vector<vector<int>> edges) {
    vector<vector<pair<int, int>>> graph(N + 1);

    for (int i = 0; i < M; ++i) {
        int u = edges[i][0];
        int v = edges[i][1];
        int w = edges[i][2];

        graph[u].push_back({v, w});
        graph[v].push_back({u, w});
    }

    // Calculate shortest paths
    long long source_to_intermediate = dijkstra(source, intermediate, graph);
    long long intermediate_to_destination = dijkstra(intermediate, destination, graph);

    // Minimum cost path
    return source_to_intermediate + intermediate_to_destination;
}
