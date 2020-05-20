<%-- 
    Document   : status404
    Created on : 19/05/2020, 10:28:02
    Author     : Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina não encontrada!</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/eventos/css/bootstrap.min.css">
        <link rel="stylesheet" href="/eventos/css/theme.min.css">
        <style>
            body, html {
                height: 100%;
              }

             
            .bg-image {
                background-image:url("/eventos/img/robo.jpg");


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
        <div class="bg-text p-3">
            <div class="container p-3">
                <div class="row p-3">
                    <div class="col p-3">
                        <div class="row justify-content-md-center p-3">
                            <div class="col-md-6 align-items-center">
                                <div class="panel bg-white-panel p-3" >
                                    <div class="panel-heading p-3">
                                        
                                        <img src="/eventos/img/error_icon_124063.png"/>
                                        <h1 class="p-2">Pagina Não encontrada </h1>
                                    </div>
                                    <div class="panel-body">
                                        <div class="row justify-content-md-center">
                                            <h2>Me desculpe, estamos buscando sempre melhorar a cada dia!</h2>
                                        </div>
                                        <a href="/eventos">
                                            Clique aqui para voltar a pagina principal...
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <script src="//static.miniclipcdn.com/js/game-embed.js"></script>
    </body>
</html>
