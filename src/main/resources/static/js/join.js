const joinButton = document.querySelector(".join-button")
const joinInputs = document.querySelectorAll(".login-input");

joinButton.onclick = () => {

    let joinInfo = {
        id: joinInputs[0].value,
        pw: joinInputs[1].value,
        confirmPw: joinInputs[2].value,
        name: joinInputs[3].value,
        phone: joinInputs[4].value + joinInputs[5].value + joinInputs[6].value,
        email: joinInputs[7].value
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
            console.log(response);
        },
        error: (error) => {
            console.log(error);
            validationError(error.responseJSON.data);
        }
    });
}

function validationError(error) {
    const memberErrors = document.querySelector(".validation-check");
    
    const errorValues = Object.values(error);

    memberErrors.innerHTML = "";

    errorValues.forEach((value) => {
        memberErrors.innerHTML += `
            ${value}
        `;
    });

    memberErrors.classList.remove("errors-invisible");
}