
$(function () {

	$("#sub").on("click",function(){
		var pran = {
			userName : $("#userName") .val(),
			passWord : $("passWord").val()
		};

		$.messager.progress();
		$.ajax({
			type : "post",
			dataType : "json",
			url : "doLogin",
			success : function (data) {
				if (data.result === 200){
					window.location.href = "/home";
				}
				$.messager.progress('close');
				$.messager.alert(
					"确认对话框",
					"登录失败，请重新尝试",
					function (r) {
						if (r){
						}
					}
				);
				console.log(data);
			},
			error : function(XMLHttpRequest){
				console.log(XMLHttpRequest);
			}



		});

		/*$("#loginFrom").form("submit",{
			url:"doLogin",
			success:function (data) {
				
				if (data.result === 200){
					window.location.href = "/home";
				}
				$.messager.progress('close');
				$.messager.alert(
					"确认对话框",
					"登录失败，请重新尝试",
					function (r) {
						if (r){
						}
					}
				);
				console.log(data);

			},
			onLoadError:function(data){

			}
		});*/
	});
});