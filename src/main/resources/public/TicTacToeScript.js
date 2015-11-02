
$(function(){

    $('td').click( function(){
	var cell = $(this).attr('id'); 
	if($(this).html()==""){
	    $.post("/cell",cell);
	   var currPlayer =  $.get("/player");
	    $(this).html(currPlayer);
	}    
	event.preventDefault();
	
    });



});
