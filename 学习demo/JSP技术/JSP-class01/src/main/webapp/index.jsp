<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<html>
<body>
<%
    List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
    HashMap map = new HashMap();
    map.put("no", "1001");
    map.put("name", "Tom");
    map.put("ps",93);  //平时成绩
    map.put("sy",85);  //实验成绩
    map.put("qm",88);   //期末成绩
    list.add(map);

    map = new HashMap();
    map.put("no", "1002");
    map.put("name", "Jack");
    map.put("ps", 76);
    map.put("sy",75);  //实验成绩
    map.put("qm",52);   //期末成绩
    list.add(map);

    map = new HashMap();
    map.put("no", "1003");
    map.put("name", "Mary");
    map.put("ps", 67);
    map.put("sy",65);  //实验成绩
    map.put("qm",48);   //期末成绩
    list.add(map);

    request.setAttribute("data", list);

    list =(List<Map<String,Object>>) request.getAttribute("data");
%>
<table border="1px">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>平时成绩</th>
        <th>实验成绩</th>
        <th>期末成绩</th>
        <th>总评</th>
    </tr>
    <%
        for(int i=0;i<list.size();i++){
            String no = (String)list.get(i).get("no");
            String name = (String)list.get(i).get("name");
            Integer ps = (Integer)list.get(i).get("ps");
            Integer sy = (Integer)list.get(i).get("sy");
            Integer qm = (Integer)list.get(i).get("qm");
            Integer zp =(int)(qm<50?qm:(ps*0.1+sy*0.2+qm*0.7));//总评成绩计算
            String redString="";
            if(zp<60){
                redString="style=\"color:red\"";
            }
    %>
    <tr align="left">
        <td><%=no%></td>
        <td><%=name%></td>
        <td><%=ps%></td>
        <td><%=sy%></td>
        <td><%=qm%></td>
        <td  <%=redString%>><%=zp%></td>
    </tr>
    <%
        }
    %>

</table>
</body>
</html>
