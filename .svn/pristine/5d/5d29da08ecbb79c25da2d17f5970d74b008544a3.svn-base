</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<body>

	<div class="header">
	<c:choose>
			
				<c:when test="${sessionScope.test == true}">
					<div class="menu">
						<ul>
							<li><a style="margin-left: -20px; height: 40px;border-bottom-left-radius:10px;border-top-left-radius:10px;
								" href="#">${user.name}
							<input type="image" src="${pageContext.request.contextPath}/front/image/personne.png"> </a>
								<ul>
									<li><a style=" border-bottom-left-radius:10px;border-top-left-radius:10px;"
										href="${pageContext.request.contextPath}/auth/personne">View
											Information</a></li>
									<c:if test="${sessionScope.user.role == 1}">		
									<li><a style=" border-bottom-left-radius:10px;border-top-left-radius:10px;"
										href="${pageContext.request.contextPath}/auth/traiterCommande">Traiter
											Les Commandes</a></li>
											
									<li><a style=" border-bottom-left-radius:10px;border-top-left-radius:10px;"
										href="${pageContext.request.contextPath}/auth/modifierDonne">Modifier
											Les Donnes</a></li>
									</c:if>				
									<li><a style=" border-bottom-left-radius:10px;border-top-left-radius:10px;"
										href="${pageContext.request.contextPath}/auth/histoireCommande">Vos Commandes</a></li>		
									<li><a style=" border-bottom-left-radius:10px;border-top-left-radius:10px;"
									href="${pageContext.request.contextPath}/logout">Logout</a></li>
								</ul></li>
						</ul>
					</div>
				</c:when>
				<c:otherwise>
					<div class="zone_register" style="float:right;">
					<a style="/*float:right*/;color:#1283c5;margin-top: auto;position:inherit;" href="${pageContext.request.contextPath}/creerCompte">Register</a>
					<br>
					<a style="/*float:right.*/;color:#1283c5;margin-top: auto;position:inherit;" href="${pageContext.request.contextPath}/login">Login
					<input type="image" style="margin-top: auto;color: #1283c5;" src="${pageContext.request.contextPath}/front/image/personne.png"> </a>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	<div class="zone_home">
		<a style="margin-left: 2px; text-decoration: none" class="home" href="${pageContext.request.contextPath}/index.jsp"> 
			SUPTRIP
		</a>
					<c:if test="${sessionScope.test == true}">
<div class="zone_panier">
		<a href="${pageContext.request.contextPath}/auth/ViewPanierOrder" >
		<input type="image" src="${pageContext.request.contextPath}/front/image/panier.png">
		</a>
		<div id="number_trip">${number_trip_order}</div>
	</div>
</c:if>	
		
	</div>

	