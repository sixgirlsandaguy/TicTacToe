
$(function(){

    $('td').click( function(){
	var cell = $(this).attr('id'); 
	if($(this).html()==""){
	    $.ajax({
		type: "post"
		url: "/cell",
		data: cell
	   
	   }).done(function(result){
	       $("#" + cell).html(result);
	});
	};
	event.preventDefault();
	
    });



});
