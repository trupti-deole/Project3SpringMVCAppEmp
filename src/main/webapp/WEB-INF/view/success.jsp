<%@page import="com.test.binding.Student"%>
<html>
<head>
<title></title>
</head>
<body>
     <h2>Welcome to CJC!</h2>
    
     <!-- because of STL we print data like this otherwise we have to write only ${data} -->
     <!-- for single value data -->
     <%--  <%String uname=(String)request.getAttribute("data"); %> --%>
     <%-- <h2><%= uname %></h2> --%>
     <!-- for multiple data -->
     
    <h2>Bundle of data</h2>
    <%Student st=(Student)request.getAttribute("data"); %>
     <h2><%=st.getUname() %><%=st.getPwd() %><%=st.getFname() %><%=st.getMobno() %>
     <%=st.getEmail() %></h2>
     
     
</body>
</html>