document.addEventListener("DOMContentLoaded", function () {
    // Seleciona o footer
    let footer = document.querySelector("footer");
    
    // Obtém o ano atual
    let currentYear = new Date().getFullYear();
    
    // Atualiza o texto do footer com o ano atual
    footer.textContent = `© ${currentYear} Ferrari`;
});
