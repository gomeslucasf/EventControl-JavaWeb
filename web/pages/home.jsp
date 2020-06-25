<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html   >

<!-- 

    Lucas Gomes     261810120
    Felipe Geroldi  261811053
-->
<html>
    <head>
        <link rel="shortcut icon" href="/eventos/img/favicon-32x32.png" />
        <title>FIPP - Infoeste 2020</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/eventos/css/bootstrap.min.css">
        <link rel="stylesheet" href="/eventos/css/theme.min.css">
        <style>
            body, html {
            height: 100%;
          }

        .bg-image {
            background-image:  url("/eventos/img/wolf.webp");
            

            
            height: 100%;
            
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
          }

          
        .bg-text {
            background-color: rgb(0,0,0);
            background-color: rgba(0,0,0, 0.4);
            color: black;
            font-weight: bold;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            z-index: 2;
            width: 100%;
            height: 100%;
            text-align: center;
          }
          .bg-white-panel{
              background-color: rgba(255,255,255, 0.3);
          }
        </style>
    </head>
    <body>
        
        <div class="bg-image"></div>
        <div class="bg-text">
            <div class="container">
                <div class="row">
                    <div class="col-md-3">
                        <a class="navbar-brand p-3" href="/eventos">
                            <img src="/eventos/img/logoUnoesteBranco.png" width="200" height="44"/>
                        </a>
                    </div>
                    <div class="col-md-7">
                    </div>
                    <div class="col-md-2">
                        <div class="p-3">
                          <a href="/eventos/login" class="btn btn-outline-success btn-sm">Acessar</a>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="offset-xl-1 col-xl-10 col-md-12 col-12 p-2">
                      <div class=" p-3 text-center text-light">
                        <h1 class="display-3 font-weight-bold text-white mb-2">
                            33ª Semana de Computação e Informática <p>da FIPP/Unoeste</p> INFOESTE 2020
                        </h1>
                        <p class="px-lg-14 mb-4 lead">
                          O evento, que é aberto a toda a comunidade regional e de outros centros.<br />
                        </p>
                        <a href="/eventos/usuario/CadastroUsuarioServlets" class="btn btn-success">Cadastrar</a>
                      </div>
                    </div>
                </div>
              </div>
        </div>  
    
    <script src="/eventos/js/jquery-3.4.1.slim.min.js"></script>
    <script src="/eventos/js/popper.min.js"></script>
    <script src="/eventos/js/bootstrap.min.js"></script>
    </body>
</html>
