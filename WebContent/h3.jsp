<HTML> 



    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>

    <BODY>
    
       <form action=search method="post">
      
<input type=text name="t1" value="<%= request.getAttribute("t2")%>">
<input type=text name="t2" value="<%= request.getAttribute("t1")%>">
...
    </BODY>
</HTML>