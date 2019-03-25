$(document).ready(function () {

    const REST_URL = "http://localhost:8080/WSEscolinha/webresources/Notas/" + getCookie("idAluno");

    function getCookie(cname) {
        var name = cname + "=";
        var decodedCookie = decodeURIComponent(document.cookie);
        var ca = decodedCookie.split(';');
        for (var i = 0; i < ca.length; i++) {
            var c = ca[i];
            while (c.charAt(0) === ' ') {
                c = c.substring(1);
            }
            if (c.indexOf(name) === 0) {
                return c.substring(name.length, c.length);
            }
        }
        return "";
    }

    $.ajax({
        type: "GET",
        url: REST_URL,
        success: function (data) {
            $.each(data, function (i, item) {
                $('<tr>').append(
                        $('<th>').text(item.id_materia),
                        $('<td>').text(item.nota_bimestre1),
                        $('<td>').text(item.nota_bimestre2),
                        $('<td>').text(item.nota_bimestre3),
                        $('<td>').text(item.nota_bimestre4),
                        $('<td>').text(item.nota_final)).appendTo('#tb-notas');
            });
        }
    });
});