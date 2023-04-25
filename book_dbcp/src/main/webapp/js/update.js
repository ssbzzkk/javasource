/**
 * 
 */

 document.querySelector(".btn-primary").addEventListener("click",()=>{
	 location.href="listPro.jsp";
 })
 
 const form = document.querySelector("form");
 form.addEventListener("submit",(e)=>{
	 e.preventDefault();
	 const price=document.querySelector("#price");
	 
	 if(price.value===""||isNaN(price.value)){
		 alert("가격을 입력해주세요");
		 price.select();
		 return;
	 }
	 form.submit();
 })
 
 document.querySelector(".btn-danger").addEventListener("click",()=>{
	 location.href="removePro.jsp?code="+code;
 })