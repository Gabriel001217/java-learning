修改数据：update



语法格式：

update 表名 set 字段名1=值1，字段名2=值2….where 条件；



注意：没有条件整张表数据全部更新。



案例：将部门10的LOC修改为shanghai，将部门名称修改为RENSHIBU

update dept2 set loc='SHANGHAI',dname='RENSHIBU' where deptno=10;

select \* from dept2;

+--------+------------+----------+

| DEPTNO | DNAME | LOC |

+--------+------------+----------+

| 10 | RENSHIBU | SHANGHAI |

| 20 | RESEARCH | DALLAS |

| 30 | SALES | CHICAGO |

| 40 | OPERATIONS | BOSTON |

| 10 | RENSHIBU | SHANGHAI |

| 20 | RESEARCH | DALLAS |

| 30 | SALES | CHICAGO |

| 40 | OPERATIONS | BOSTON |

+--------+------------+----------+



