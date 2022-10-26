package com.study.container;

//自定义函数
//该类及其函数，需要在一个扩展名为.tld的XML文件中进行注册
//tld是tag library definition，标签库定义
//XML文件是需要约束的，即需要配置文件头部。这个头部约束可以从以下文件进行复制：
//在Tomcat安装目录下：D:\学习\JavaWeb\apache-tomcat-9.0.46\webapps\examples\WEB-INF\jsp2
//这个.tld的xml文件需要定义在当前web项目的WEB-INF目录下
public class ELFunction {
    //将字符串小写变成大写
    public static String lowerToUpper(String source){
        return source.toUpperCase();
    }
}
