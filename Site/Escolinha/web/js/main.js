$(document).ready(function () {
    $(window).scroll(function () {
        if ($(window).scrollTop() > 52) {
            $('header').addClass('menu_fixo');
        } else {
            $('header').removeClass('menu_fixo');
        }
    });

    $("#entrarCliente").click(function () {
        $("#formLogin").submit();
    });
});