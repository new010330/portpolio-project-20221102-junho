const hiddenBox = document.querySelector(".hidden-box");

hiddenBox.onmouseenter = () => {
    const invisible = document.querySelector(".invisible");
    invisible.classList.toggle("invisible");

    invisible.onmouseout = () => {
        invisible.classList.toggle("invisible");
    }
}

hiddenBox.onmouseout = () => {
    const invisible = document.querySelector(".invisible");
    invisible.classList.toggle("invisible");
}