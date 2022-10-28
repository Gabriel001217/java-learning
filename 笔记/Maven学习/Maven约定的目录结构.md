Maven约定的目录结构



每一个maven项目在磁盘中都是一个文件夹（项目\-Hello）

Hello/

——/src

————/main #放你的主程序java代码和配置文件

——————/java #你的程序包和包中的文件

——————/resources #你的java程序中要使用的配置文件



————/test #放测试程序代码和用到的文件（不严格要求可以没有）

——————/java #测试程序包和包中的文件

——————/resources #测试程序中要使用的配置文件



——/pom.xml #maven的核心文件（maven项目必须拥有）



疑问：mvn compile 编译src/main目录下的所有java文件的

1）为什么要下载

maven工具执行的操作需要很多插件（java类）完成的

2）下载什么东西了

jar文件——叫做插件——插件是完成某些功能的

3）下载存放到哪里了

默认仓库（本机仓库）：

C盘

[https://repo.maven.apache.org](https://repo.maven.apache.org) 中央仓库的地址



执行mvn compile，结果是在项目的根目录下生成target目录（结果目录）

maven编译的java程序，最后的class文件都放在target目录中

