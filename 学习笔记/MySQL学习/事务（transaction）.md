事务（transaction）



1、什么是事务？

一个事务是一个完整的业务逻辑单元，不可再分。

比如：银行账户转账，从A账户向B账户转账10000.需要执行两条update语句：

upadte t\_act set balance = balance - 10000 where actno = 'act-001';

upadte t\_act set balance = balance + 10000 where actno = 'act-002';



以上两条DML语句必须同时成功，或者同时失败，不允许出现一条成功，一条失败。



要想保证以上两条DML语句同时成功或者同时失败，那么就需要使用数据库的“事务机制”。



2、和事务相关的语句只有：DML语句。（insert delete update）

为什么？因为他们这三个语句都是和数据库表中的“数据”相关的。

事务的存在是为了保证数据的完整性，安全性。



3、假设所有的业务都能使用1条DML语句搞定，还需要事务机制吗？

不需要事务了。

但实际情况不是这样的，通常一个“业务”需要多条DML语句共同联合完成。

