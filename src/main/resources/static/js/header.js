const hiddenBox = document.querySelector(".hidden-box");
const boardBox = document.querySelector(".board-box");
console.log("start");
hiddenBox.onclick = () => {
	boardBox.classList.toggle("hidden");
}

