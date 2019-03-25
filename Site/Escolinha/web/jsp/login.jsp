<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">  
        <title>Escolinha | Login</title>
        <link rel="stylesheet" type="text/css" href="../css/estilo.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body class="teste">
        <header>
            <div class="row">
                <div class=" text-center col-sm-2 logo"></div>
            </div>
        </header>
        <div class="container">
            <form action="../LoginServlet" method="post" id="formLogin">
                <h3 class="cadastro">Aluno, Para Verificar Suas Notas, Realize o Login</h3>
                <div class="organizador">
                    <div class="form-group col-xs-5 col-sm-5 col-md-5" id="raLogin">
                        <label>RA:</label>
                        <input type="text" name="ra" class="form-control" id="inputRALogin">
                    </div>                        
                    <div class="form-group col-xs-5 col-sm-5 col-md-5" id="senhaLogin">
                        <label>Senha:</label>
                        <div class="input-group mb-3">
                            <input type="password" name="senha" class="form-control" id="inputSenhaLogin">
                        </div>
                    </div>
                </div>
                <br>                      
            </form>
            <button type="button" id="entrarCliente" class=" botoes btn">Entrar</button> 
        </div>
        <footer>
            <div class="row">
                <p>2018&copy;- Curso de Análise e Desenvolvimento de Sistemas - Desenvolvido por Giovanni Almeida</p>
            </div>
        </footer>
    </body>      
</html>
