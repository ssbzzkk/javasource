/**
 * 기존비밀번호, 새비밀번호, 확인 들어왔는지
 * 새비밀번호, 확인 이 동일한지
 * 동일하면 서브밋
 */

 const form = document.querySelector("form");

form.addEventListener("submit",(e)=>{
	e.preventDefault();
	const currentPwd = document.querySelector("#floatingPassword1");
	const newPwd = document.querySelector("#floatingPassword2");
	const confrimPwd = document.querySelector("#floatingPassword3");
	
	if(currentPwd.value===""){
		alert("기존비밀번호를 확인해주세요");
		currentPwd.select();
		return;
	}else if(currentPwd.value===""||newPwd.value===""||confrimPwd.value===""){
		alert("pwd입력해주세요");
		return;
	}else if(newPwd.value!==confrimPwd.value){
		alert("새 비밀번호 가 일치하지 않습니다");
		confrimPwd.select();
		return;
	}
	form.submit();
	})