controller层/action层
service层
dao层
entity

1、IOC注解开发
@component 将对象交给Spring、bean管理，一般用来标注不属于dao service controller/action层
@repository 一般用来标注dao层组件的管理
@service 用于标注service层
@controller 一般用于action层/contoller层
参数value，起别名

@value 注入值

2、作用域
@scope 最常见的了两种singleton单例、propotype多例

3、生命周期
@PostConstruct 初始化执行
