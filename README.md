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
[使用openFeign进行服务间调用]
```text
1. 引入依赖
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
2. 创建接口, 接口声明方法包含远程服务方法的全部签名
@FeignClient("mall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}
3. 开启服务,在启动程序上加注解
@EnableFeignClients
4. 调用方法
@Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {
        R r = couponFeignService.memberCoupon();
        return R.ok().put("coupons", r.get("coupns"));
    }
```
# 资料
[spring-cloud-alibaba]https://github.com/alibaba/spring-cloud-alibaba/blob/2.2.x/README-zh.md

[spring-cloud-gateway]https://cloud.spring.io/spring-cloud-gateway/reference/html/

# 知识
[分布式与集群概念]
```text
分布式：众多的服务运行在众多的服务器中
集群：一个服务运行在众多的服务器中
```
[mybatis 出错]
```text
依赖错误，应该依赖：
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.4.1</version>
</dependency>
而不是：
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus</artifactId>
    <version>3.4.1</version>
</dependency>
也不是：
 <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-start</artifactId>
      <version>2.1.1</version>
</dependency>
```
[nacos出现NacosException: Client not connected,current status:STARTING错误]
```text
mvn clean
```
[LF will be replaced by CRLF in pom.xml.错误]
```text
#提交时转换为LF，检出时转换为CRLF
$ git config --global core.autocrlf true
```
[nacos配置中心在项目中的常用模式]
```text
1. 命名空间：每个微服务拥有自己的独立命名空间
2. group: 分别针对dev、prod、test建立不同分组
3. dataId: 根据配置文件的不同模块分成相应的dataId，例如datasource、mybatis等
```
[nacos配置中心的配置]
```text
spring.application.name=gulimall-coupon
spring.cloud.nacos.config.server-addr=192.168.11.1:8848

spring.cloud.nacos.config.namespace=ed042b3b-b7f3-4734-bdcb-0c516cb357d7  # # 可以选择对应的命名空间 ，即写上对应环境的命名空间ID
spring.cloud.nacos.config.group=dev  # 配置文件所在的组
# 加载的第一个配置，可加载多个，复制多个即可
spring.cloud.nacos.config.ext-config[0].data-id=datasource.yml
spring.cloud.nacos.config.ext-config[0].group=dev
spring.cloud.nacos.config.ext-config[0].refresh=true

```