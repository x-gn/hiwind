<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <html>  
        <head>  
            <meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
            <title>ajax for springMVC</title>  
            <script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>  
            <script type="text/javascript">  
                function send() {
                	$("#msg").text('');
                    	var id = $("#idname").val();
                         $.ajax( {  
                            type : "GET",  
                            url : "json",  
                            data : "id="+id,  
                            dataType: "text",  
                            success : function(msg) {  
                                $("#msg").text(msg);
                            }  
                        });  
                     
                };  
            </script>  
        </head>  
        <body>  
            <input id="idname"  type="text" value="11" /> 
             <input id="click" type="button" value="click to show person" onclick="send()"/>  
             <div id="msg"></div> 
        </body>  
    </html>  