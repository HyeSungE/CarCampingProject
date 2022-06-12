<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Container -->
<head>
<!-- rating -->
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="resources/css/rating.css">
</head>


<div class="container-fluid themed-container">
	<!-- Row Grid -->
	<div class="row mb-3">
		<!-- List Column Grid -->
		<div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark"
			style="width: 280px;">
			<a href="/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
				<svg class="bi me-2" width="40" height="32">
					<use xlink:href="#bootstrap"></use></svg> <span class="fs-4">관리자
					페이지</span>
			</a>
			<hr>
			<ul class="nav nav-pills flex-column mb-auto">

				<li><a href="adminRegion.admin"
					class="nav-link text-white" aria-current="page"> <svg
							class="bi me-2" width="16" height="16">
							<use xlink:href="#home"></use></svg> 차박 장소 관리
				</a></li>

				<li><a href="adminAgency.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#speedometer2"></use></svg> 대리점 관리
				</a></li>

				<li><a href="adminCategory.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#table"></use></svg> 카테고리 관리
				</a></li>

				<li><a href="adminProduct.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#grid"></use></svg> 차박 용품 관리
				</a></li>

				<li><a href="adminMember.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle"></use></svg> 회원 관리
				</a></li>

				<li><a href="adminReviewRegion.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle"></use></svg> 장소 리뷰 관리
				</a></li>

				<li><a href="adminReviewProduct.admin"
					class="nav-link text-white"> <svg class="bi me-2" width="16"
							height="16">
							<use xlink:href="#people-circle"></use></svg> 용품 리뷰 관리
				</a></li>

				<li><a href="adminAnnounce.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle"></use></svg> 공지사항 관리
				</a></li>

				<li><a href="adminQuestion.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle"></use></svg> 문의사항 관리
				</a></li>

				<li><a href="adminRental.admin" class="nav-link text-white">
						<svg class="bi me-2" width="16" height="16">
							<use xlink:href="#people-circle"></use></svg> 대여현황
				</a></li>
			</ul>
			<hr>
	</div>

