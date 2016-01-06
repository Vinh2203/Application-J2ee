
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/front/include/header.jsp"/>
	
		
<c:import url="/front/include/body.jsp"/>

<h1>Mes informations personnelles</h1>	
<br />
	<div id="zonePersonne">
		<div id="titre" style="margin-top: 0px; border: solid 0px;"> <p>Votre informations personnels</p></div>
			
			<br>
				<div id="zonePersonneDetail" >
					<label><b>Name : </b></label>
						<hr width="50%" align="left">
							<p><c:out value="${user.name}"></c:out></p>
			
					<label><b>Email : </b></label>
						<hr width="50%" align="left">
							<p><c:out value="${user.email}"></c:out></p>
					
					<label><b>Campus : </b></label>
						<hr width="50%" align="left">
							<p><c:out value="${user.campus.name}"></c:out></p>
						<input style="margin-left: -2px;" type="submit" class="styled-button-2" value="Modifier" onclick="modifier();" /> 
									
		</div>
		
			<div id="zonePersonne_modifier" style="display: none;">
				<form action="${pageContext.request.contextPath}/auth/ModifUser" method="post">
					<label><b>Name : </b></label>
						<hr width="50%" align="left">
							<input type="hidden" name="id_user" value="<c:out value='${user.idBooster}'></c:out>" />
							<input type="text" name="name" value="<c:out value='${user.name}'></c:out>" />
						
						<br/><br/>
						
					<label><b>Email : </b></label>
						<hr width="50%" align="left">
							<input name="email_user" type="email" value="<c:out value='${user.email}'></c:out>" />
						<br/><br/>
					<label><b>Campus : </b></label>
					<hr width="50%" align="left">
					<select name="campusId">
						<c:forEach items="${listCampus}" var="c">
							<option <c:out value="${c.idCampus eq user.campus.idCampus ? 'Selected' : '' }" /> value="${c.idCampus}">${c.name}</option>
						</c:forEach>
					</select> 
				
					<div></div>
					<input style="margin-top: 27px;margin-left: 0px;" type="submit" class="styled-button-2" value="Valider" /> 
							
				</form>			
			</div>
		
	</div>

<c:import url="/front/include/footer.jsp"/>