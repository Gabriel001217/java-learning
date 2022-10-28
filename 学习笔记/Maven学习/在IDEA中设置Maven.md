在IDEA中设置Maven

1、在idea中设置maven，让idea和maven结合使用。

idea中内置了maven，一般不使用内置的，因为用内置的修改maven的设置不方便。

使用自己安装的maven，需要覆盖idea中的默认的设置。让idea指定maven安装位置等信息。



配置的入口 ①：配置当前工程的 设置，file--settings--Build，excution，deployment--build tools--maven

maven home directory：maven的安装目录

user settings file：maven安装目录conf/setting.xml配置文件

local repository：本机仓库的目录位置



\--maven--runner

VM Options：archetypeCatalog=internal

JRE：你项目的jdk



②：配置以后新建工程的设置，file--other settings



2、使用模板创建项目

1）maven-archetype-quickstart：普通的java项目

2）maven-archetype-webqpp：web项目



3、依赖范围，使用scope表示的。

scope的值又compile，test，provided，默认是compile

scope：表示依赖使用的范围，也就是再maven构建项目的那些阶段中启动作用。

maven构建项目 清理，编译，测试，打包，安装，部署 过程（阶段）



例如：junit的以来范围是test

<dependency>

<groupId>junit</groupId>

<artifactId>junit</artifactId>

<version>4.11</version>

<scope>test</scope>

</dependency>

