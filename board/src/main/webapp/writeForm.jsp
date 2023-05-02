<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>


	<h2>Board Write</h2>
	<form action= '<c:url value= "/write.do" />' method="post" enctype="multipart/form-data">
  <div class="row mb-3">
    <label for="inputName" class="col-sm-2 col-form-label">작성자</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputName" name="name" required>
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputTitle" name="title" required>
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputContent" class="col-sm-2 col-form-label">내용</label>
    <div class="col-sm-10">
    	<textarea id="inputContent" class="form-control" rows="10" name="content" required></textarea>
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputAttach" class="col-sm-2 col-form-label">파일첨부</label>
    <div class="col-sm-10">
      <input type="file" class="form-control" id="inputAttach" name="attach">
    </div>
  </div>
  <div class="row mb-3">
    <label for="inputPassword" class="col-sm-2 col-form-label">비밀번호</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword" name="password" required>
    </div>
  </div>
  
  
  <button type="submit" class="btn btn-primary">등록</button>
  <button type="reset" class="btn btn-danger">다시작성</button>
  <button type="button" class="btn btn-success">목록보기</button>
</form>


<%@ include file="include/footer.jsp" %>