<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spittles</title>
<style type="text/css">
#titleName{
	cursor: pointer;
}

.activeStateDiv{
	padding: 5px;
	margin-bottom: 5px;
}

.title{
	font-size: 20px;
	font-weight: bold;
}

.essential{
	margin-top: 5px;
}

</style>
<script type="text/javascript" src="resource/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
$(function(){
	var list = '${list}';
	list = JSON.parse(list);
	//console.log(list);
	var listDiv = $('#listDiv');
	for (var i=0;i<list.length;i++){
		listDiv.append('<div class="activeStateDiv">'+
				'<div class="title">'+list[i].title+'</div>'+
				'<div class="essential">'+list[i].essential+'</div>'+
				'</div>');
	}
	
	$('#titleName').click(function(){
		$.ajax({
			type:'post',
			url:'spittles/showMessage',
			data:{'param':'aabbcc'},
			dataType:'json',
			success:function(data){
				//console.log(data);
				$('#titleName').text(data.titleName);
				$('#dateTime').text(data.dataTime);
			},
			error:function(data){
				alert('Interaction Errors');
			}
		});
	});
	
	
});
</script>
</head>
<body>
	<h2 id="titleName">${titleName}</h2>
	<h5 id="dateTime">${dateTime}</h5>
	<div id="listDiv">
	</div>
</body>
</html>