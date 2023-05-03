/**
 * 
 */
 const modifyForm = document.querySelector("#modifyForm");
 const password = document.querySelector("#inputPassword");
 document.querySelector(".btn-success").addEventListener("click",()=>{
	 	 
	 	 
	 	 location.href="list.do";
 });
 
 //삭제 버튼 클릭시 modifyForm전송
 //action=delete.do
 
 
 document.querySelector(".btn-danger").addEventListener("click",()=>{
	 	 
	 	 if(password.value==""){
			  alert("비밀번호를 입력해 주세요");
			  password.focus();
			  return;
		  }  
		 	//사용자가 입력한 비밀번호를 가져와서 id=password 요소의 value값으로 세팅 
	 	   document.querySelector("#password").value = password.value;
	 	
	 	modifyForm.action="delete.do";
	 	modifyForm.method = "post";
	 	console.log(modifyForm);
	 	modifyForm.submit();	
	 
	 	
 })
 