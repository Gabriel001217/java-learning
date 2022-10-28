Group by 和 having



Group by：按照某个字段或者某些字段进行分组。

having：having实对分组之后的数据进行再次过滤



找出每个工作岗位的最高薪资：

select max(sal) from emp group by job;



分组函数一般都会和group by联合使用，这也是为什么它被称为分组函数的原因，并且任何一个分组函数（coun sum avg max min）都是在group by语句执行结束后才会执行的。

当一条sql语句没有group by 的话，整张表的数据会自成一组。



执行顺序：from，where，group by，having，select，order by



记住一个规则：当一条语句中有group by 的话，select后面只能跟分组函数和参与分组的字段。



多个字段能不能联合起来一块分组？

找出每个部门不同工作岗位的最高薪资。

  select deptno,job,max(sal) from emp group by deptno,job;

  +--------+-----------+----------+

  | deptno | job | max(sal) |

  +--------+-----------+----------+

  | 10 | CLERK | 1300.00 |

  | 10 | MANAGER | 2450.00 |

  | 10 | PRESIDENT | 5000.00 |

  | 20 | ANALYST | 3000.00 |

  | 20 | CLERK | 1100.00 |

  | 20 | MANAGER | 2975.00 |

  | 30 | CLERK | 950.00 |

  | 30 | MANAGER | 2850.00 |

  | 30 | SALESMAN | 1600.00 |

  +--------+-----------+----------+




找出每个部门的最高薪资，要求显示薪资大于2900的数据：

select max(sal),deptno from emp group by deptno having max(sal)>2900;//这种方式效率低，不建议使用

  +----------+--------+

  | max(sal) | deptno |

  +----------+--------+

  | 5000.00 | 10 |

  | 3000.00 | 20 |

  +----------+--------+

  Select max(sal),deptno from emp where sal>2900 group by deptno;//这种方式效率比较高，建议能顾使用where过滤使用where

  


找出每个部门的平均薪资，要求显示薪资大于2000的数据

select deptno,avg(sal) from emp group by deptno having avg(sal)>2000;

  +--------+-------------+

  | deptno | avg(sal) |

  +--------+-------------+

  | 10 | 2916.666667 |

  | 20 | 2175.000000 |

  +--------+-------------+

  


总结一个完整的DQL语句怎么写？

select 5

…

From 1

…

Where 2

…

Group by 3

…

Having 4

….

Order by 6

…..

