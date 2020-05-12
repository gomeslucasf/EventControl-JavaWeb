<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="configTemplate" class="com.eventcontrol.controller.servlet.DashboardUsuarioServlet"  scope="session"/>
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
    
    <body style="background:#EAEAEA;">
        
        
        <div class="container">
            <div class="fixed-top">
                <div class="collapse" id="menuTop">
                    <div class="bg-dark p-4">
                        <a class="navbar-brand " href="/eventos/">
                            <img src="/eventos/img/logoUnoesteBranco.png" width="200" height="44"/>
                        </a>
                        <h5 class="text-white h4">Collapsed content</h5>
                        <span class="text-muted">Toggleable via the navbar brand.</span>
                    </div>
                </div>
                <nav class="navbar navbar-dark bg-dark  justify-content-end ">
                    <button class="navbar-toggler border-0" title="Menu" type="button" data-toggle="collapse" data-target="#menuTop" aria-controls="menuTop" aria-expanded="false" aria-label="Toggle navigation">
                        <i><img src="/eventos/icon/avatarAdmin.ico" height="30" width="30" alt="Perfil" title="Mostrar Senha" /></i>
                    </button>
                </nav>
            </div>
            <div class="fixed-bottom">
                <div class="collapse" id="menuBottom">
                  <div class="bg-dark p-4">
                    <a class="navbar-brand p-3" href="/eventos/">
                        <img src="/eventos/img/logoUnoesteBranco.png" width="200" height="44"/>
                    </a>
                    <h5 class="text-white h4">Informações sobre a Infoeste</h5>
                    <span class="text-muted">É um Evento mt top</span>
                  </div>
                </div>
                <nav class="navbar navbar-dark bg-dark justify-content-center ">
                    <button class="navbar-toggler border-0" title="Menu" type="button" data-toggle="collapse" data-target="#menuBottom" aria-controls="menuBottom" aria-expanded="false" aria-label="Toggle navigation">
                        <i><img src="/eventos/icon/setaCimaAzul.ico" height="30" width="30" alt="Menu" title="Menu" /></i>
                    </button>
                </nav>
            </div>
            <div class="row p-3">
                <div class="col-12 p-3">
                    <div class="p-3">
                        <jsp:include page="${configTemplate.caminhoPagina}"/>
                    </div>
                </div>
            </div>
            
        </div>
        
        
        
        
        
    
    
    <script src="/eventos/js/jquery-3.4.1.slim.min.js"></script>
    <script src="/eventos/js/popper.min.js"></script>
    <script src="/eventos/js/bootstrap.min.js"></script>
    </body>
</html>
