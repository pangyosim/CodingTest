v,e = map(int,input().split())

inf=1e9

graph = [[inf]*v for _ in range(v)]

for _ in range(e):
    a, b, cost = map(int,input().split())
    graph[a-1][b-1]=cost

for k in range(v):
    for i in range(v):
        for j in range(v):
            if graph[i][j] > graph[i][k] + graph[k][j]:
                graph[i][j] = graph[i][k] + graph[k][j]

answer = inf
for i in range(v):
    if graph[i][i] != 0:
        answer = min(answer,graph[i][i])

if answer != inf:
    print(answer)
else:
    print(-1)
