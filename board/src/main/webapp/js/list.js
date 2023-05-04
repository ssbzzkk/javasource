/**
 * 
 */
//검색 클릭 시 검색기준 value, keyword 입력여부 확인
//없다면 submit 막고


const form = document.querySelector("form");
form.addEventListener("submit",(e)=>{
	e.preventDefault();
	
	//검색기준 요소 가져오기
	const sel = document.querySelector(".form-select");
	//검색어 요소 가져오기
	const keyword = document.querySelector(".form-control");

	//select요소의 선택된 value가져오기
	//const selectedVal = sel.options[sel.selectedIndex].value;
	//console.log(selectedVal	);

	if(sel.value=="n"){
		alert("검색기준을 입력해주세요");
		sel.focus();
		return;
	
	}else if(keyword.value==""){
		alert("검색어를 입력해주세요");
		keyword.focus();
		return;
	
	}
	form.submit();
	
	
})