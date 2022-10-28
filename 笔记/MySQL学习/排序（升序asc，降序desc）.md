排序（升序asc，降序desc）



按照工资升序，找出员工名和薪资：

select ename,sal from emp order by sal asc;

  +--------+---------+

  | ename | sal |

  +--------+---------+

  | SMITH | 800.00 |

  | JAMES | 950.00 |

  | ADAMS | 1100.00 |

  | WARD | 1250.00 |

  | MARTIN | 1250.00 |

  | MILLER | 1300.00 |

  | TURNER | 1500.00 |

  | ALLEN | 1600.00 |

  | CLARK | 2450.00 |

  | BLAKE | 2850.00 |

  | JONES | 2975.00 |

  | SCOTT | 3000.00 |

  | FORD | 3000.00 |

  | KING | 5000.00 |

  +--------+---------+

  


按照工资的降序排，工资一样的按照名字的升序排列：

select ename,sal from emp order by sal desc,ename asc;

  +--------+---------+

  | ename | sal |

  +--------+---------+

  | KING | 5000.00 |

  | FORD | 3000.00 |

  | SCOTT | 3000.00 |

  | JONES | 2975.00 |

  | BLAKE | 2850.00 |

  | CLARK | 2450.00 |

  | ALLEN | 1600.00 |

  | TURNER | 1500.00 |

  | MILLER | 1300.00 |

  | MARTIN | 1250.00 |

  | WARD | 1250.00 |

  | ADAMS | 1100.00 |

  | JAMES | 950.00 |

  | SMITH | 800.00 |

  +--------+---------+

  


先执行from，再执行where，再执行select，最后执行order by

