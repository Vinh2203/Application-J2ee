	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<hr width="80%" color="#eee">
	<div class="footer">
		<div>
		<h3>
			<em>S</em> <em class="planet left">U</em> <em>P</em> <em>T</em> <em>R</em>
			<em class="planet right">I</em> <em>P</em>
		</h3>
		<b> ©2015 -</b>
		<a 	  href="${pageContext.request.contextPath}/about"><b style="color: #aaaaaa;">Qui Somme Nous ?</b></a> -<b> <c:out value="${number_user}"></c:out>
	 		Utilisateur  
		</b>- <b><c:out value="${number_trip}"></c:out>
	 		Nombres De Voyages 
		</b>
	</div>
	</div>
	
</body>
</html>