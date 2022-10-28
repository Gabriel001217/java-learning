Union（可以将查询结果相加）



案例：找出岗位是salesman和manager的员工

第一种：select ename,job from emp where job='MANAGER'or job='SALESMAN';

+--------+----------+

| ename | job |

+--------+----------+

| ALLEN | SALESMAN |

| WARD | SALESMAN |

| JONES | MANAGER |

| MARTIN | SALESMAN |

| BLAKE | MANAGER |

| CLARK | MANAGER |

| TURNER | SALESMAN |

+--------+----------+

第二种：select ename,job from emp where job in('MANAGER','SALESMAN');

+--------+----------+

| ename | job |

+--------+----------+

| ALLEN | SALESMAN |

| WARD | SALESMAN |

| JONES | MANAGER |

| MARTIN | SALESMAN |

| BLAKE | MANAGER |

| CLARK | MANAGER |

| TURNER | SALESMAN |

+--------+----------+

第三种：

select ename,job from emp where job='MANAGER'

Union

select ename,job from emp where job='SALESMAN';

+--------+----------+

| ename | job |

+--------+----------+

| JONES | MANAGER |

| BLAKE | MANAGER |

| CLARK | MANAGER |

| ALLEN | SALESMAN |

| WARD | SALESMAN |

| MARTIN | SALESMAN |

| TURNER | SALESMAN |

+--------+----------+



两张不相干的表中的数据凭借在一起显示：

select ename from emp

union

select dname from dept;

+------------+

| ename |

+------------+

| SMITH |

| ALLEN |

| WARD |

| JONES |

| MARTIN |

| BLAKE |

| CLARK |

| SCOTT |

| KING |

| TURNER |

| ADAMS |

| JAMES |

| FORD |

| MILLER |

| ACCOUNTING |

| RESEARCH |

| SALES |

| OPERATIONS |

+------------+



