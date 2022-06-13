<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- prod_input.jsp -->
<%@ include file="../top.jsp" %>
 <head>
 <!-- rating -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="resources/css/rating2.css">

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->

<script type="text/javascript">
      function check(){
         if (f.review_title.value==""){
            alert("제목을 입력해 주세요!!")
            f.review_title.focus()
            return false
         }
         if (f.review_summaryContent.value==""){
            alert("한줄리뷰를 입력해 주세요!!")
            f.review_summaryContent.focus()
            return false
         }
         if (f.review_regionScore.value==""){
            alert("평점을 입력해 주세요!!")
            f.review_regionScore.focus()
            return false
         }
         if (f.review_regionImage1.value==""){
            alert("이미지를 입력해 주세요!!")
            f.review_regionImage1.focus()
            return false
         }
         if (f.review_regionContent.value==""){
             alert("상세리뷰를 입력해 주세요!!")
             f.review_regionContent.focus()
             return false
          }
         return true
      }
   </script>
</head>
 <body> 
  <div class="container">
  				<div class="row">
  					<div class="col-md-12 text-center">
  					<h2 class="section-title">리뷰쓰기</h2>
  					</div>
          <div class="col-md-8 col-md-offset-2">
 	<form name="f" action="field_review.review" id="review"
                     method="post" enctype="multipart/form-data">

          <label for="goodsRating">제목</label>
           <input class="form-control" id="review_title" name="review_title" type="text" required />
        	<br>

            <label for="goodsRating">장소 한줄리뷰</label>
            <input class="form-control" id="review_summaryContent" name="review_summaryContent" placeholder="ex)화장실이 있어요" type="text" required />
            <br>

         <label for="goodsRating">장소평점</label>
            <div id= "myform" name="review_regionScore">
             <fieldset >
      		 <input type="radio" name="rating1" value="5" id="rate1"><label for="rate1">⭐</label>
       		 <input type="radio" name="rating1" value="4" id="rate2"><label for="rate2">⭐</label>
       		 <input type="radio" name="rating1" value="3" id="rate3"><label for="rate3">⭐</label>
       		 <input type="radio" name="rating1" value="2" id="rate4"><label for="rate4">⭐</label>
      		 <input type="radio" name="rating1" value="1" id="rate5"><label for="rate5">⭐</label>
   			 </fieldset>
   			  </div>
        	<br>

          <label for="goodsRating">장소이미지</label>
           <input type="file" class="form-control" name="review_regionImage1">
           <input type="file" class="form-control" name="review_regionImage2">
           <input type="file" class="form-control" name="review_regionImage3">
           <input type="file" class="form-control" name="review_regionImage4">
           <input type="file" class="form-control" name="review_regionImage5">
         <br>
     
          <label for="goodsRating">리뷰 상세</label>
            <textarea class="form-control" id="content" name="review_regionContent" placeholder="리뷰 상세" rows="5"></textarea>
           <br>
              <button class="btn btn-success mb-3" type="submit">리뷰 작성</button>
               <button class="btn btn-success mb-3" type="reset">취소</button>
     <br>
        </form>
      </div>
   </div>
</div>
</body>
<%@ include file="../bottom.jsp"%>