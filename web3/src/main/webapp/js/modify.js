/**
 *  newaddr, newmobile 둘 중에 하나는 값이 있어야 함
 * 
 * 	둘다 빈칸일때 submit 막고, 메세지 띄우기
 * 
 */
document.querySelector(".btn-primary").addEventListener("click",()=>{
	 location.href="listPro.jsp";
 })

const form = document.querySelector("form");

document.querySelector(".btn-success").addEventListener("click",(e)=>{
	e.preventDefault();


 const addr = document.querySelector("#newaddr");
 const mobile= document.querySelector("#newmobile");
 if(addr.value.length>0 || mobile.value.length>0){
	 form.submit();
	
 }else {
	 alert("변경된 값을 입력하거나 수정을 취소하려면 목록으로 버튼 클릭")
	   } 
 })