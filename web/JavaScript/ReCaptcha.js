const changeTextBtn = document.querySelector('.changeText');
const readTextBtn = document.querySelector('.readText');
const code = document.querySelector('#code');
const input = document.querySelector('.userInput input');
const submitBtn = document.querySelector('.btn');

changeTextBtn.addEventListener('click', () => {
    code.textContent = createCaptcha();
});
window.addEventListener('load', () => {
    code.textContent = createCaptcha();
});

function createCaptcha() {
    let letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];
    let a = letters[Math.floor(Math.random() * letters.length)];
    let b = letters[Math.floor(Math.random() * letters.length)];
    let c = letters[Math.floor(Math.random() * letters.length)];
    let d = letters[Math.floor(Math.random() * letters.length)];
    let e = letters[Math.floor(Math.random() * letters.length)];
    let f = letters[Math.floor(Math.random() * letters.length)];
    let g = letters[Math.floor(Math.random() * letters.length)];
    let code = a + b + c + d + e + f + g;
    return code;
}
submitBtn.addEventListener('click', () => {
    let val = input.value;
    if (val == '') {
        alert('Verifique el captcha');
    } else if (val === code.textContent) {
       alert('Captcha correcto');
    } else {
        alert('Captcha incorrecto!');
    }
})
readTextBtn.addEventListener('click', () => {
    let text = code.textContent;
    responsiveVoice.speak(text, {rate: 0.8});
})


//Limpiar formularios
document.addEventListener('DOMContentLoaded', function () {
    let formulario = document.getElementById('limpiar');
    formulario.addEventListener('submit', function () {
        formulario.reset();
    });
});