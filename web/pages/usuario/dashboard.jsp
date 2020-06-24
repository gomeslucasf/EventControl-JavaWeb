<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">
    
    <div class="col">
        <div id="carouselExampleSlidesOnly" class="carousel slide shadow-lg" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="/eventos/carrossel/1.png" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2 class="text-white">INFOESTE 2020 </h2>
                        <p>33ª Semana de Computação e Informática da FIPP/Unoeste</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="/eventos/carrossel/2.png" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2 class="text-white">Palestras</h2>
                        <p>As melhores palestras com os temas atuais</p>
                        <p>Java Web, Postgress  e Bootstrap</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="/eventos/carrossel/3.png" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2 class="text-white">Eventos</h2>
                        <p>Os melhores eventos para participar nessa semana</p>
                        <p>Festa Linux, Maratona de Programação, Hackthons, entre outros.</p>
                    </div>
                </div><div class="carousel-item">
                    <img src="/eventos/carrossel/4.png" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h2 class="text-white">O que esta esperando? </h2>
                        <p>Comece agora a se cadastrar nos eventos da melhor semana de informática da região</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</div>


<div class="row mt-3">
    
    <div class="col-6">
        <div class="panel bg-dark shadow-lg rounded">
            <div class="panel-heading pt-3 text-center "> <h3 class="text-white">Ultimas vagas</h3></div>
            <div class="panel-body">
                <div class="col pt-3">
                    <div class="pb-3">
                        <ul class="list-group">
                            <c:forEach var="evento" items="${listEvent}" >
                                <li class="list-group-item d-flex justify-content-between align-items-center">
                                    ${evento.nome}
                                  <span class="badge badge-success badge-pill">2</span>
                                </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="col-6">
        <div class="panel bg-dark shadow-lg rounded">
            <div class="panel-heading pt-3 text-center "> <h3 class="text-white">Meus Eventos Hoje</h3></div>
            <div class="panel-body ">
                <div class="col pt-3">
                    <div class="pb-3">
                        <table class="table table-striped bg-white rounded ">
                        <thead>
                            <tr>
                              <th scope="col">Descrição</th>
                              <th scope="col">Horario</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                              <td>Java Web</td>
                              <td>8:00</td>
                            </tr>
                            <tr>
                              <td>Postgress</td>
                              <td>14:00</td>
                            </tr>
                            <tr>
                              <td>Chopada</td>
                              <td>20:00</td>
                            </tr>
                        </tbody>
                    </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</div>



