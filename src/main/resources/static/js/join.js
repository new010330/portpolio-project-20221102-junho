const joinButton = document.querySelector(".join-button")
const joinInputs = document.querySelectorAll(".login-input");

joinButton.onclick = () => {

    let joinInfo = {
        id: joinInputs[0].value,
        pw: joinInputs[1].value,
        confirmPw: joinInputs[2].value,
        name: joinInputs[3].value,
        phone: joinInputs[4].value,
        email: joinInputs[5].value
    }

    $.ajax({
        async: false,
        type: "post",
        url: "/api/member/join",
        contentType: "application/json",
        data: JSON.stringify(joinInfo),
        dataType: "json",
        success: (response) => {
            location.replace("/member/login");
        },
        error: (error) => {
            console.log(error);
        }
    });
}