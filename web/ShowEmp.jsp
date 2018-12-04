<%@page import="org.hibernate.SessionFactory"%>
<%@page import="mypkg.Emp"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%
    int id=Integer.parseInt(request.getParameter("t1"));
    SessionFactory factory=mypkg.Util.getSF();
    Session ses=factory.openSession();
    Emp e=(Emp)ses.get(Emp.class, id);
        
%>
<html>
    <body>
        <h3>Emp-Details</h3>
        <hr>
        <pre>
            ECode   <%=e.getEno()%>
            Name    <%=e.getEname()%>
            Salary  <%=e.getSal()%>
        </pre>
        <hr>
        <a href="search.jsp">Search-More</a><br>
        <a href="index.jsp">Home</a>
    </body>
</html>
