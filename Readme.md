# 这是一个SpringMVC的学习过程
`只有不断进步才能避免被时代的洪流所淘汰。`

## 2019年6月1日
1、完成Maven配置，Git存储库配置  
2、完成logback.xml文件配置
## 2019年6月2日
1、完成HelloSpringMVC  
遇到的坑:  
a.完成后需要在设置中的项目结构中设置Artifacts作为项目输出文件配置到tomcat中  
b.JsonToXml转换时需要构造无参函数
## 2019年6月3日
1、解决昨天无法访问的坑  
原因：缺少包扫描配置  
在MVCConfig配置中原来是@ComponentScan("SpringMVC") 更改为 @ComponentScan({"SpringMVC","JsonToXml"})   
2、解决运行时没有debug信息  
原因：缺少log4j的配置文件  
配置文件详情:log4j.propertiess   
```properties
# Global logging configuration 开发时候建议使用 debug
log4j.rootLogger=DEBUG, stdout
# Console output...
log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%5p [%t] - %m%n
```
>>>
