Maven常用操作

1、maven的属性设置

<properties>设置maven的常用属性

2、maven的全局变量

自定义的属性，1）在<properties>通过自定义标签声明变量（标签名就是变量名）

2）在pom.xml文件中的其他位置，使用${标签名}使用变量的值

自定义全局变量一般是定义依赖的版本号，当你的项目中要使用多个相同的版本号，先使用全局变量定 义，再使用${变量名}



3、资源插件

在<build>标签下

作用：mybatis课程中会用到这个作用



CSGO-DGSjh-Fopqv-QNVhr-WpPZz-HsnkP



