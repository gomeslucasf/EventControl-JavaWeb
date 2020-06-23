<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="/eventos/img/favicon-32x32.png" />
        <title>FIPP - Infoeste 2020 ${configTemplate.tituloPagina}</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/eventos/css/bootstrap.min.css">
        <link rel="stylesheet" href="/eventos/css/theme.min.css">
    </head>
    <style>
    </style>
    <body style="background:#EAEAEA;">
        <div class="relative-top">
            <div class="collapse" id="menuTop">
                <div class="bg-dark p-4">
                    <a class="navbar-brand " href="/eventos/">
                        <img src="/eventos/img/logoUnoesteBranco.png" width="200" height="44"/>
                    </a>
                    <h5 class="text-white h4 pt-3 pb-3">Seja bem vindo ao seu menu Usuario</h5>
                    <p><a href="/eventos/usuario/lista">Escolher Eventos</a></p>
                    <p><a href="/eventos/usuario/agenda">Meus Eventos</a></p>
                    <a href="cadastro">Meu Perfil</a>
                </div>
            </div>
            <nav class="navbar navbar-dark bg-dark  ">
                <div clas="w-50">
                    <div class="container ml-5">
                        <a class="navbar-brand " href="/eventos/">                           
                            <img src="/eventos/img/logoUnoesteBranco.png" width="100" height="22"/>    
                        </a>
                    </div>
                    
                </div>
                <div clas="w-50">
                    <div class="justify-content-end ">
                        <button class="navbar-toggler border-0" type="button" data-toggle="collapse" data-target="#menuTop" aria-controls="menuTop" aria-expanded="false" aria-label="Toggle navigation">
                            <i><img src="/eventos/icon/1486506264-hamburger-list-menu-options-bars-stack_81469.ico" height="30" width="30" alt="Perfil" title="Meu Perfil" /></i>
                        </button>
                    </div>
                </div>
            </nav>
        </div>
       
        <div class="container pb-3">
            
            <div class="row pt-3">
                <div class="col-12">
                        <jsp:include page="${configTemplate.caminhoPagina}"/>
                </div>
            </div>
            
        </div>
        
        <div class="relative-bottom">
            <div class="bg-dark">
                <div class="container">
                     <div class="row">
                        <div class="col">
                            Rodapé
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
