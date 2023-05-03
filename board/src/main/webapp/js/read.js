/**
 * 
 */

 document.querySelector(".btn-success").addEventListener("click",()=>{
	 	 location.href="list.do";
 });
 
 
 document.querySelector("form").addEventListener("submit",(e)=>{
 //수정 클릭 시 submit기능 중지
	 e.preventDefault();
	 	 
 // readForm을 가져온 후 readForm 전송
	 const readForm=document.querySelector("#readForm");
	
 // modify.do로 
	readForm.action = "modify.do";
	readForm.submit(); 
 })
 