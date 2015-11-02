
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
	       is_game_over();
	});
	};
	event.preventDefault();
	
    });

    $("#restart").click( function(){
	restart_game();
	
	});


});



function is_game_over(){
    $.ajax({
	type: "post",
	url: "/isgameover"
	}).done(function(result){
	    if(result == 'X'){
		$("#winner").html("X Won!");
		restart_game();
	    }
	    if(result == 'O'){
		$("#winner").html("O Won!");
		restart_game();
	    }
	    if(result == 'Z'){
		$("#winner").html("Draw!");
		restart_game();
	    }
    
}



function restart_game(){

    
	for(var i = 1; i < 10; i++){
	    $("#"+i).html("");
	}
    
	$.ajax({
	    type: "post",
	    url: "/newgame"
	    });
    
    $("#winner").html("");
    
}
