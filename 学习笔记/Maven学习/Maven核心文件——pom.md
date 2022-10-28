Maven核心文件——pom

Pom:项目对象模型



一、

1、groupId：组织Id，一般是公司域名的倒写。

2、artifactId：项目名称，也是模块名称，对应groupId中项目的子项目。

3、version：项目的版本号。如果项目还在开发中，是不稳定版本，通常在版本后带—SNAPSHOT（快照）



groupId、artifactId、version一起称为坐标，用来在互联网中唯一标识项目。

<groupId>com.bjpwoernode.maven</groupId>

<artifactId>ch01-maven</artifactId>

<version>1.0-SNAPSHOT</version>



[http://wwww.mvnrepository.com/](http://wwww.mvnrepository.com/) 搜索使用的中央仓库，使用groupId或者artifactId作为搜索条件



二、

packaging：大巴后压缩文件的扩展名，默认是jar，web应用是war

packaging可以不写，默认是jar



三、依赖

dependencies和dependency，相当于java代码中的import

你的项目中要使用的各种资源说明，比如我的项目要使用mysql驱动

<dependencies>

<dependency>

<groupId>mysql</groupId>

<artifactId>mysql-connector-java</artifactId>

<version>5.1.9</version>

</dependency>

</dependencise>



四、properties：设置属性



五、build：maven在进行项目的构建时，配置信息，例如指定编译java代码使用的jdk的版本



