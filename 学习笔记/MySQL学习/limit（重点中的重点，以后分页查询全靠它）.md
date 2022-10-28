limit（重点中的重点，以后分页查询全靠它）



1、limit是mysql特有的，其他数据库中没有，不通用。



2、limit取结果集中的部分数据，这是它的作用。



3、语法机制：

Limit startIndex,length

startIndex表示起始位置

length表示取几个



案例：取出工资前五名的员工（思路：降序取前五个）

select ename,sal from emp order by sal desc limit 0,5;

+-------+---------+

| ename | sal |

+-------+---------+

| KING | 5000.00 |

| FORD | 3000.00 |

| SCOTT | 3000.00 |

| JONES | 2975.00 |

| BLAKE | 2850.00 |

+-------+---------+



limi是sql语句中最后执行的一个环节。



案例：找出工资排名在第四到第九名的员工：

select ename,sal from emp order by sal desc limit 3,6;

+--------+---------+

| ename | sal |

+--------+---------+

| JONES | 2975.00 |

| BLAKE | 2850.00 |

| CLARK | 2450.00 |

| ALLEN | 1600.00 |

| TURNER | 1500.00 |

| MILLER | 1300.00 |

+--------+---------+



4、通用的标准分页sql



每页显示3条记录：

第一页：0，3

第二页：3，3

第三页：6，3

第四页：9，3

第五页：12，3



每页显示pageSize条记录：

第pageNo页：（pageNo-1）\*pageSize，pageSize



pageSize是什么？是每页显示多少条记录

pageNo是什么？显示第几页

