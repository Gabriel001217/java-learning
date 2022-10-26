<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="form1" name="form1" method="post" action="beantarget3.jsp">
            <label>书名：<input type="text" name="name" />  </label>
            <p> <label>书号：<input type="text" name="isbn" />    </label>  </p>
            <p> <label>价钱：<input type="text" name="price" />    </label>  </p>
            <p> <label>页数：<input type="text" name="paginalNumber" /> </label>  </p>
            <p>
                <label>
                    <input type="submit" name="Submit" value="提交" />
                </label>
                <label>
                    <input type="reset" name="reset" value="重置" />
                </label>
            </p>
        </form>
    </body>
    </html>
