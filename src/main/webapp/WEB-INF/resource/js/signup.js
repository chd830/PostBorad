'use strict';
document.getElementById("signupbtn").onclick = function() {
    var id = $('#id').val();
    var username=$('#username').val();
    var email=$('#email').val();
    var psw=$('#psw').val();
    var repsw=$('#repsw').val();
    if(psw !== repsw)
        alert("password is not same value");
    else {
        console.log("id: "+id);
        console.log("username: "+username);
        console.log("email: "+email);
        console.log("psw: "+psw+", repsw: "+repsw);
    }

}