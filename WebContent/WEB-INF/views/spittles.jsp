<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spittles</title>
<style type="text/css">
#titleName{
	cursor: pointer;
}
</style>
<script type="text/javascript" src="resource/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
$(function(){
	var list = '${list}';
	console.log(list);
	console.log(typeof list);
	list = JSON.parse(list);
	console.log(list);
	console.log(list[0].theme);
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
	<div id="listDiv"></div>
	<h2 id="titleName">${titleName}</h2>
	<h5 id="dateTime">${dateTime}</h5>
</body>
</html>