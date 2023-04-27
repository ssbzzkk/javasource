/**
 * 
 */

const form = document.querySelector("form");

form.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	//검색기준 요소 가져오기
	const sel = document.querySelector(".form-select");
	//검색어 요소 가져오기
	const keyword = document.querySelector(".form-control");

	//select요소의 선택된 value가져오기
	//const selectedVal = sel.options[sel.selectedIndex].value;
	//console.log(selectedVal	);

	if(keyword.value===""){
		alert("검색어를 입력해주세요");
		return;
		keyword.select();
	}else if(sel.value==="검색기준선택"){
		alert("검색기준을 입력해주세요");
		return;
	}
	form.submit();
	
	
})