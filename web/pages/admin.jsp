<%-- 
    Document   : admin
    Created on : 03/05/2020, 16:40:41
    Author     : Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="/eventos/img/favicon-32x32.png" />
        <title>FIPP - Infoeste 2020 - Painel</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/eventos/css/bootstrap.min.css">
        <link rel="stylesheet" href="/eventos/css/theme.min.css">
        <style>
        body, html {
            height: 100%;
          }

          * {
            box-sizing: border-box;
          }

        .bg-image {
            background-image:  url("./img/10951g.jpg");
           
            filter: blur(8px);
            -webkit-filter: blur(8px);

            
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
    <body >
        <div class="bg-image"></div>
        <div class="bg-text">
            <div class="container p-2">
                <div class="row">
                    <div class="col">
                        <div class="row justify-content-md-center ">
                            <div class="col-md-6 ">
                                <div class="panel bg-white-panel p-3" >
                                    <div class="panel-heading p-3">
                                        <img src="/eventos/img/logo-fipp-440x172.png"/>
                                        <h1>Painel do Administrador</h1>
                                    </div>
                                    <div class="panel-body">
                                        <div class=" row justify-content-md-center">
                                            <form action="/eventos/admin">
                                                <div class="col-md-12">
                                                    <div class="form-group text-justify">
                                                      <label for="adminTxtLogin">Login</label>
                                                      <input type="text" class="form-control" id="adminTxtLogin" aria-describedby="adminTxtLogin">
                                                    </div>
                                                </div>
                                                <div class="col-md-12">
                                                    <div class="form-group text-justify">
                                                      <label for="adminTxtSenha">Senha
                                                            <div class="btn" type="button" id="adminBtnMostrar">
                                                                <i><img src="/eventos/img/eye_icon-icons.com_71204.ico" height="20" width="20" alt="Mostrar Senha" title="Mostrar Senha" /></i>
                                                            </div>
                                                      </label>
                                                      <input type="password" class="form-control" id="adminTxtSenha">
                                                    </div> 
                                                </div>
                                                <div class="col-md-12">
                                                    <div class="form-group text-justify form-check">
                                                      <input type="checkbox" class="form-check-input" id="adminCheckConectado">
                                                      <label class="form-check-label" for="adminCheckConectado">Me mantenha conectado</label>
                                                    </div>
                                                </div>
                                                    <button id="adminBtnAcessar" type="submit" class="btn btn-success">Acessar</button>
                                                
                                            </form>
                                        </div>
                                        <a href="/eventos">
                                            Home...
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="/eventos/js/bootstrap.min.js"></script>
        <script src="/eventos/js/jquery-3.4.1.slim.min.js"></script>
        <script src="/eventos/js/popper.min.js"> </script> 
        <script>
          $(document).ready(function(){
              $('#adminBtnMostrar').on('click', function(){
                var passwordField = $('#adminTxtSenha');
                var passwordFieldType = passwordField.attr('type');
                if(passwordFieldType == 'password')
                {
                    passwordField.attr('type', 'text');
                    $(this).val('Hide');
                } else {
                    passwordField.attr('type', 'password');
                    $(this).val('Show');
                }
              });
          });
        </script>
    </body>
</html>
