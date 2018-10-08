'use strict';
document.getElementById("signupbtn").onclick = function () {
    var userId = $('#id').val();
    var username = $('#username').val();
    var email = $('#email').val();
    var psw = $('#psw').val();
    var repsw = $('#repsw').val();
    if (psw !== repsw)
        alert("password is not same value");
    else {
        $.post('/rest/signup', {
            userId: userId,
            userName: username,
            email: email,
            userPw: psw,
        }, function () {
            console.log("id: " + userId);
            console.log("username: " + username);
            console.log("email: " + email);
            console.log("psw: " + psw + ", repsw: " + repsw);
        })

    }

}