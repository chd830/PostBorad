'use strict';

document.getElementById("loginBtn").onclick = function() {
    var id=$('#userId').val();
    var pw=$('#userPassword').val();

    console.log("id: "+id+",pw: "+pw);
    $.get('/rest/login',{
        userId: id,
        userPw: pw
    },function(result) {
        if(result !== null)
            location.href=result;
        else {
            alert("wrong password!");
        }
    })
}