<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>맛집이 좋아</title>
</head>
<style>
.d-flex {
	float: left;
	margin: 0px 20px 20px 30%;
	width: 500px;
}

#carouselExampleInterval {
	margin: 70px 0px 20px 18.5%;
	width: 800px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>

<body>
	<header>
		<br> <br> <br>
		<nav class="navbar navbar-expand-lg bg-body-tertiary fixed-top">
			<div class="container-fluid">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="navbar-brand " href="">
								맛집이 좋아 <!-- <img src="/mini/완성 로고.png" height="70px" alt="..."> -->
						</a></li>
						<li class="nav-item"><a class="nav-link" href="input">등록</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="modList">수정</a>
						<li class="nav-item"><a class="nav-link" href="delList">삭제</a>
						<li class="nav-item"><a class="nav-link" href="tList">전체보기</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<form class="d-flex" role="search" action="searchSave" method="GET">
		<input class="form-control me-2" type="search" placeholder="가게이름 검색"
			aria-label="Search" name="search">
		<button class="btn btn-outline-success" type="submit">Search</button>
	</form>

	<section>
		<div id="carouselExampleInterval" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active" data-bs-interval="1000">
					<img src="./resources/img/123.jpg" class="d-block w-100" alt="..."
						height="580px">
				</div>
				<div class="carousel-item" data-bs-interval="2000">
					<img src="./resources/img/1234.jpg" class="d-block w-100" alt="..."
						height="580px">
				</div>
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleInterval" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</section>




	<!-- 푸터 -->
	<div class="card text-center">
		<div class="card-header">여행지 맛집 추천 사이트</div>
		<div class="card-body">
			<p class="ft_info">
				회사명 : 맛집이 좋아 / 대표 : 박도영<br> 주소 : OO도 OO시 OO구 OO동 123-45 사업자
				등록번호 : 123-45-67890<br>
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
					fill="currentColor" class="bi bi-telephone-fill"
					viewBox="0 0 16 16">
            <path fill-rule="evenodd"
						d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.68.68 0 0 0 .178.643l2.457 2.457a.68.68 0 0 0 .644.178l2.189-.547a1.75 1.75 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.6 18.6 0 0 1-7.01-4.42 18.6 18.6 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877z" />
          </svg>
				Tel : 123-456-7890
				<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
					fill="currentColor" class="bi bi-printer-fill" viewBox="0 0 16 16">
            <path
						d="M5 1a2 2 0 0 0-2 2v1h10V3a2 2 0 0 0-2-2zm6 8H5a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1" />
            <path
						d="M0 7a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2h-1v-2a2 2 0 0 0-2-2H5a2 2 0 0 0-2 2v2H2a2 2 0 0 1-2-2zm2.5 1a.5.5 0 1 0 0-1 .5.5 0 0 0 0 1" />
          </svg>
				Fax : 123-456-7890<br> 개인정보관리책임자 : 박도영
			</p>
		</div>
	</div>
</body>
</html>
