唯一性约束（unique）



唯一约束修饰的字段具有唯一性，不能重复。但可以为null。



案例：给两个列或者多个列添加unique

create table t\_user(

id int,

usercode varchar(255),

username varchar(255),

unique(usercode,username) //两个字段联合起来唯一

)



create table t\_user(

id int,

usercode varchar(255) unique, //列级约束

username varchar(255) unique //列级约束

)



