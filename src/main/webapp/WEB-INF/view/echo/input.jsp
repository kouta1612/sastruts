<%@page pageEncoding="UTF-8"%>
<html>
<body>
<html:errors/>
<s:form method="POST">
	<c:out value="${message}"/>
	お名前をどうぞ！
	<html:text property="name"/>
	<s:submit property="echo" value="送信"/>
</s:form>
</body>
</html>