
$(function(){

    $('td').click( function(){
	var cell = $(this).attr('id'); 
	if($(this).html()==""){
	    $.ajax({
		url: "/cell"
		type: "post"
		data: cell
	   
	   }).done(function(result)){
	       $("#" + cell).html(result);
	}    
	event.preventDefault();
	
    });



});
