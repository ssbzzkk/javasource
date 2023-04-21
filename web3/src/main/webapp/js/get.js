/**
 *  목록으로 클릭시 : list.jsp
 *  수정 클릭 시 : form 안의 no값 가져오기
 *  			modify.jsp 이동
 * 				modify.jsp?no=가져온값
 * 
 *  삭제 클릭 시 : form 안의 no값 가져오기 
 * 				remove.jsp?no=가져온값
 * 
 */




// form안에 hidden이용시
//const no = document.querySelector("#no").value;

 document.querySelector(".btn-primary").addEventListener("click",()=>{
	 location.href="list.jsp";
 })
 
 document.querySelector(".btn-success").addEventListener("click",()=>{
	 location.href="modify.jsp?no="+no;
 })
 
 document.querySelector(".btn-danger").addEventListener("click",()=>{
	 location.href="remove.jsp?no="+no;
 })
 