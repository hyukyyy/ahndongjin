<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	session="false"%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="팀플전사 안동진">
<meta name="author" content="안동진">
<link rel="icon" href="../../favicon.ico">

<title>팀플전사 안동진</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.servletContext.contextPath}/resources/css/dashboard.css">

</head>

<body>

	<nav class="navbar navbar-default navbar-fixed-top navbar-static-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">팀플전사 안동진</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a class="profile-pic" href="#"> <img
							src="image/user-img.png" alt="user-img" width="30"
							class="img-circle"><b class="hidden-xs"> 안동진</b></a></li>
					</button>
					</li>
				</ul>

				<form class="navbar-form navbar-left">
					<input type="text" class="form-control" placeholder="검색어를 입력하세요">
					<button type="submit" class="btn btn-default">찾기</button>
				</form>

			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">홈 보드<span class="sr-only">(current)</span></a></li>
					<li><a href="#">파일 창고</a></li>
					<li><a href="#">회의 노트</a></li>
					<li><a href="#">상점</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">파티 모집</a></li>
					<li><a href="">친구 관리</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="">프로젝트</a></li>
				</ul>
			</div>

			<div
				class="context col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<button type="button" class="backbtn btn btn-default"
					aria-label="Left Align">
					<span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>
				</button>
				<p class="description-title">동해물과 백두산이</p>
				<p class="description-text">이상의 속잎나고, 방황하여도, 풍부하게 그들은 품에 하는 인간에
					있다. 가는 착목한는 가치를 부패를 가진 부패뿐이다. 주는 무엇을 풀이 황금시대의 할지라도 피에 이것이다. 이상의 이상
					있는 열매를 얼마나 보이는 예가 운다. 피어나기 바이며, 구하기 인간의 못하다 우는 창공에 천지는 사막이다.</p>
				<span class="description-user">안동진</span> <span
					class="description-date">20.05.20</span> <span
					class="description-time">14:23</span>
				<hr>
				<div class="description-content">
					<div class="btn-group1"></div>
					<div class="btn-group2">
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-align-center" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-align-right" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-align-justify"
								aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-font" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-bold" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-italic" aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-facetime-video"
								aria-hidden="true"></span>
						</button>
						<button type="button" class="btn btn-default"
							aria-label="Left Align">
							<span class="glyphicon glyphicon-picture" aria-hidden="true"></span>
						</button>
					</div>
					<div class="description-content-input">
						<textarea class="form-control" rows="20"></textarea>
					</div>
					<div class="btn-group3">
						<button type="button" class="btn btn-primary pull-right">저장하기</button>
					</div>

				</div>


			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/bootstrap.min.css"></script>
</body>
</html>
