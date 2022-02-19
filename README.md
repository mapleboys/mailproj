# mailproj
[docker删除容器命令]
```text
1、首先使用docker -s -a命令列出所有容器
2、然后使用docker stop <CONTAINER ID|NAME>命令停止要删除的容器
3、现在使用以下命令删除单个或多个容器。docker rm <CONTAINER ID|NAME> <CONTAINER ID|NAME>
```
[设置docker容器中应用自启动]
```text
docker update mysql --restart=always
```
[设置docker开启自启动]
```text
systemctl enable docker
```
# 资料

# 知识
[分布式与集群概念]
```text
分布式：众多的服务运行在众多的服务器中
集群：一个服务运行在众多的服务器中
```

