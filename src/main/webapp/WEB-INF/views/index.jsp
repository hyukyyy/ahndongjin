<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>

<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="팀플전사 안동진">
<meta name="author" content="안동진">

<meta http-equiv='refresh' content='0;url=이동할주소'>
<link rel="icon" href="../../favicon.ico">

<title>팀플전사 안동진</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

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
							class="img-circle"><b class="hidden-xs">안동진</b></a></li>
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

			<div class="context col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2 class="page-header">프로젝트 진행 상황</h2>
				<div class="context_table row placeholders">
					<div
						class="context_table1 col-xs-3 col-sm-2 placeholder card text-white bg-primary">
						<c:forEach var="subject" items="${subjectList}" begin="0" step="1"
							varStatus="status">
							<div class="card-header">${status.index}</div>
							<div class="card-body">
								<h5 class="card-title">${subject.title}</h5>
								<p class="card-text">${subject.content}</p>
							</div>
						</c:forEach>

				<h2 class="sub-header">팀 멤버</h2>
						<div class="row placeholders">
							<div class="context_card col-xs-6 col-sm-3 placeholder thumbnatil">
								<c:forEach var="avatar" items="${avatarList}" begin="0" step="1" varStatus="status">
									<img class="character-img" src="${avatar.filePath}" alt="character" width="200">
									<div class="card-header">
										<h3 class="character-name">${avatar.nickname}</h3>
										<p class="level">${avatar.level}</p>
									</div>
								</c:forEach>
								<div class="card-body text-left">
									<h4 class="card-title">윤동혁</h4>
									<div class="list-group">
										<c:forEach var="quest_each" items="${questList}" begin="0" step="1"
											varStatus="status">
											<c:forEach var="quest" items="${quest_each}" begin="0" step="1"
											varStatus="status">
												<a href="#" class="list-group-item">${quest.title}<span
													class="badge">${quest.complete}</span></a>
											</c:forEach>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
			<script src="js/bootstrap.min.js"></script>
</body>
</html>
