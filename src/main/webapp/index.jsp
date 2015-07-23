<%@page import="org.slf4j.LoggerFactory"%>
<%@page import="org.slf4j.Logger"%>
<%
Logger log = LoggerFactory.getLogger("index.jsp");
log.info("start");

%>
<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
<%
log.info("end");
%>