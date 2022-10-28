Maven生命周期及其常用命令



maven的生命周期：就是maven构建项目的过程，清理、编译、测试、报告、打包、安装、部署。

maven的命令：maven独立使用，通过命令，完成maven的生命周期的执行。

maven可以使用命令，完成项目的清理、编译、测试等等。

maven的插件：maven命令执行时，真正完成功能的是插件，插件是一些jar文件，一些类。



一、单元测试（测试方法的）

用的是junit，junit是一个专门测试的框架（工具）。

junit测试的内容：测试的是类中的方法，每一个方法都是独立测试的。

方法是测试的基本单位（单元）。

maven借助单元测试，批量的测试类中的大量方法是否符合预期的。



二、使用步骤

1、加入依赖，在pom.xml加入单元测试依赖。

<dependency>

<groupId>junit</groupId>

<artifactId>junit</artifactId>

<version>4.11</version>

<scope>test</scope>

</dependency>



2、在maven项目中的src/test/java目录下，创建测试程序。

推荐的创建类和方法的提示：

①测试类的名称是：Test+你要测试的类名

②测试的方法名称是：Test+方法名称



例如你要测试HelloMaven，

创建测试类TestHelloMaven

@Test

Public void testADD(){

测试HelloMaven的add方法是否正确

}



其中testAdd叫做测试方法，他的定义规则

1、方法是public的，必须的

2、方法没有返回值，必须的

3、方法名称是自定义的，推荐是Test+方法名称

4、在方法的上面加入@Test



3、mvn compile

编译main/java/目录下的java为class文件，同时把class拷贝到target/classer目录下面

把main/resources目录下的所有文件都拷贝到target/classes目录下



