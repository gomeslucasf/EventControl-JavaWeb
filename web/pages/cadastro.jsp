<%-- 
    Document   : cadastro
    Created on : 03/05/2020, 17:05:21
    Author     : Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="./img/favicon-32x32.png" />
        <title>FIPP - Infoeste 2020 - Cadastro</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <style>
            body, html {
                height: 100%;
              }

              * {
                box-sizing: border-box;
              }

            .bg-image {
                background-image: url("./img/man-wearing-gray-dress-shirt-and-blue-jeans-3184317.jpg");

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
            <div class="container p-3">
                <div class="row p-3">
                    <div class="col-md-12 ">
                        <div class="row justify-content-md-center">
                            <div class="col-md-6 ">
                                <div class="panel bg-white-panel" >
                                    <div class="panel-heading p-3">
                                        <h1> Cadastro do Convidado</h1>
                                        
                                    </div>
                                    <div class="panel-body">
                                        <form>
                                            
                                        </form>
                                        <a href="index.html">
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
        <!--  style="background: url('./img/man-wearing-gray-dress-shirt-and-blue-jeans-3184317.jpg') no-repeat center center fixed;  -webkit-background-size: cover;
                -moz-background-size: cover;
                background-size: cover;
                -o-background-size: cover;
                " -->
    </body>
</html>
