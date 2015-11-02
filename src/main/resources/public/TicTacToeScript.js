
$(function(){

    $('td').click( function(){
	var cell = $(this).attr('id'); 
	if($(this).html()==""){
	    $.ajax({
		type: "post",
		url: "/cell",
		data:"cell=" + cell
	   
	   }).done(function(result){
	       $("#" + cell).html(result);
	});
	};
	event.preventDefault();
	
    });

    $("#restart").click( function(){
	for(var i = 1; i < 10; i++){
	    $("#"+i).html("");
	}
	
	});


});
