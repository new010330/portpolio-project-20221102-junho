const hiddenBox = document.querySelector(".hidden-box");
const boardBox = document.querySelector(".board-box");

hiddenBox.mouseenter = () => {
    console.log("마우스 호버");
    boardBox.classList.remove("hidden");
}