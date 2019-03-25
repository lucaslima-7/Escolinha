<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Escolinha | Consulta</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/estilo.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="../js/main.js" type="text/javascript"></script>
        <script src="../js/notas.js" type="text/javascript"></script>
        <script src="../js/faltas.js" type="text/javascript"></script>
    </head>
    <body class="teste">
        <header>
            <div class="row">
                <div class=" text-center col-sm-2 logo"></div>
            </div>
        </header>
        <div class="container">
            <h3>Minhas Notas</h3>
            <br>
            <div class="table">
                <div id="tb-faltas_wrapper">
                    <div class="row">
                        <div class="col-sm-12">
                            <table class="table table-hover" id="tb-notas">
                                <thead>
                                    <tr role="row">
                                        <th scope="col">Matéria</th>
                                        <th scope="col">Bimestre 1</th>
                                        <th scope="col">Bimestre 2</th>
                                        <th scope="col">Bimestre 3</th>
                                        <th scope="col">Bimestre 4</th>
                                        <th scope="col">Nota Final</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr role="row" class="odd"></tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
            <br>
            <h3>Minhas Faltas</h3>
            <br>
             <div class="table">
                <div id="tb-faltas_wrapper">
                    <div class="row">
                        <div class="col-sm-12">
                            <table class="table table-hover" id="tb-faltas">
                                <thead>
                                    <tr role="row">
                                        <th scope="col">Matéria</th>
                                        <th scope="col">Bimestre 1</th>
                                        <th scope="col">Bimestre 2</th>
                                        <th scope="col">Bimestre 3</th>
                                        <th scope="col">Bimestre 4</th>
                                        <th scope="col">Total Faltas</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr role="row" class="odd"></tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <div class="row">
                <p>2018&copy;- Curso de Análise e Desenvolvimento de Sistemas - Desenvolvido por Giovanni Almeida</p>
            </div>
        </footer>
    </body>
</html>
