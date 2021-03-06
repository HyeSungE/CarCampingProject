<%@include file="../top.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="assets/css/map_region.css">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
<link rel="stylesheet"
	href="https://unpkg.com/flickity@2/dist/flickity.min.css">
<script src="https://unpkg.com/flickity@2/dist/flickity.pkgd.min.js"></script>

<script>
			function popup() {
				var url = "regionReviewView.region";
				var name = "popup test";
				var option = "width = 700, height = 1000, top = 100, left = 200, location = no"
				window.open(url, name, option);
			}
</script>

<div id="ccm-doc-hs" class="ccm-t7-hs">
	<div id="ccm-bd-hs">
		<div id="ccm-main-hs">
			<div class="ccm-b-hs">
				<div class="ccm-gc-hs">
					<div class="ccm-u-hs first">
						<div class="map_content-hs">
							<div id="map" class="border rounded-4 border-4"
								style="width: 100%; height: 600px;">
								<script type="text/javascript"
									src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a12f9fc709978bc3b122b007b64e2afd"></script>
								<script>
									//맵생성
									var container = document
											.getElementById('map');
									var options = {
										center : new kakao.maps.LatLng(36, 128),
										level : 13,
										draggable : false
									};
									var map = new kakao.maps.Map(container,
											options);

									//좌표
									function Position(x, y) {
										this.x = x;
										this.y = y;

									}
									var PositionArr = [
											new Position(37.540705, 126.956764),//서울=1
											//new Position(37.17, 127.7),//경기도
											new Position(37.8304115,
													128.2260705),//강원도 2 
											new Position(36.628503, 127.929344),//충청북도 3
											new Position(36.557229, 126.779757),//충청남도 4 
											new Position(36.248647, 128.664734),//경상북도 5 
											new Position(35.259787, 128.664734),//경상남도 6 
											new Position(35.716705, 127.144185),//전라북도 7 
											new Position(34.819400, 126.893113),//전라남도 8
											new Position(33.364805, 126.542671) //제주도=9
									];

									//이미지
									//var imageSrc = 'mapMarkerImage/', //이미지 
									imageSize = new kakao.maps.Size(64, 69), imageOption = {
										offset : new kakao.maps.Point(27, 69)
									};
									
									//var markerImage = new kakao.maps.MarkerImage(
									//		imageSrc, imageSize, imageOption);

									//마커
									for (var i = 0; i < PositionArr.length; i++) {
										var markerPosition = new kakao.maps.LatLng(
												PositionArr[i].x,
												PositionArr[i].y);
										var imageSrc ="mapMarkerImage/"+(i+1)+".png"
										var markerImage = new kakao.maps.MarkerImage(
												imageSrc, imageSize, imageOption);

										addMarker(i);
									}
									//마커-클릭 이벤트 추가
									function addMarker(i) {
										var marker = new kakao.maps.Marker({
											map : map,
											position : markerPosition,
											image : markerImage,
											clickable : true
										});
										kakao.maps.event
												.addListener(
														marker,
														'click',
														function() {
															location.href = "test?region_code="
																	+ (i + 1);//controller       

														});
									}
								</script>
							</div>
						</div>
					</div>
					<div class="ccm-u-hs border rounded-4 border-4" style="height: 600px;">
						<div class="region_content-hs rounded-4 ">
							<ul class="list-group list-group-flush rounded-4 ">

								<li class="list-group-item fs-2 text-center"><button
										class="btn btn-outline-warning btn-lg" type="button" disabled
										style="-bs-btn-padding-x: 70px; - -bs-btn-padding-y: 15px;"
										
									>
										인 기 글 <i class="bi bi-trophy-fill" width="40" height="40"
											fill="currentColor"></i>
									</button>
								<li class="list-group-item position-relative"><img
									src="sik.jpg" class="img-responsive rounded-circle"
									style="width: 107px; height: 107px;">
									<div
										class="position-absolute top-50 start-50 translate-middle ">
										<a href="regionView.region">I'm
										a flexbox container!</a></div></li>

								<li class="list-group-item position-relative"><img
									src="sik.jpg" class="img-responsive rounded-circle"
									style="width: 107px; height: 107px;">
									<div class="position-absolute top-50 start-50 translate-middle">
									<a href="regionView.region">I'm
										a flexbox container!</a>
									</div></li>

								<li class="list-group-item position-relative"><img
									src="sik.jpg" class="img-responsive rounded-circle"
									style="width: 107px; height: 107px;">
									<div class="position-absolute top-50 start-50 translate-middle">
									<a href="regionView.region">I'm
										a flexbox container!</a>
									</div></li>

								<li class="list-group-item position-relative"><img
									src="sik.jpg" class="img-responsive rounded-circle"
									style="width: 107px; height: 107px;">
									<div class="position-absolute top-50 start-50 translate-middle">
									<a href="regionView.region">I'm
										a flexbox container!</a>
									</div></li>
							</ul>

						</div>
					</div>
				</div>

			</div>
		</div>
		<div class="ccm-b-hs">
			<div id="hot-loaction-title-hs" style="margin-top:20px;">
				<nav
					class="navbar navbar-expand-lg border rounded-4 border-4 aria-label="
					Eighth
					navbarexample" 
					style="margin-bottom: 0px; background-color: #dc3545d4;">
					<div class="container">
						<a class="navbar-brand text-light" href="#" text>H O T 차 박 지</a>
					</div>
				</nav>
			</div>
			<div id="hot-loaction-content-hs"
				style="margin-bottom: 0px; margin-top: 10px;">
				<div class="carousel"
					data-flickity='{ "cellAlign": "left", "contain": true ,
 									"autoPlay": 1200,"pauseAutoPlayOnHover": false,
									"dragThreshold": 10,"imagesLoaded": true,
									"freeScroll": true,"wrapAround": true}'>

					<a
						href="regionView.region">
						<div class="carousel-cell" style="width: 300px; height: 380px">
							<div class="card" style="width: 100%; height: 100%">
								<img src="sik.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">Card title</h5>
									<p class="card-text">Some quick example text to build on
										the card title and make up the bulk of the card's content.</p>
								</div>
							</div>
					</a>
				</div>


				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
				<div class="carousel-cell"></div>
			</div>
		</div>
	</div>



	<div class="ccm-b-hs" style="margin-top: 20px; margin-bottom:45px;">
		<nav
			class="navbar navbar-expand-lg navbar navbar-dark bg-primary border rounded-4 border-4"
			aria-label="Eighth navbar example" style="margin-bottom: 0px;">
			<div class="container">
				<a class="navbar-brand text-light" href="#">추 천 차 박 지</a>
			</div>
		</nav>
		<div id="recommand-loaction-content-hs ">
			<div class="carousel"
				data-flickity='{ "cellAlign": "left", "contain": true ,
 									"autoPlay": 1200,"pauseAutoPlayOnHover": false,
									"dragThreshold": 10,"imagesLoaded": true,
									"freeScroll": true,"wrapAround": true}'>
				<a
					href="regionView.region">
					<div class="carousel-cell" style="width: 300px; height: 380px">
						<div class="card" style="width: 100%; height: 100%">
							<img src="sik.jpg" class="card-img-top" alt="...">
							<div class="card-body">
								<h5 class="card-title">Card title</h5>
								<p class="card-text">Some quick example text to build on the
									card title and make up the bulk of the card's content.</p>
							</div>
						</div>
				</a>
			</div>


			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
			<div class="carousel-cell"></div>
		</div>
	</div>
</div>
</div>

<script>
	
</script>
<%@include file="../bottom.jsp"%>
