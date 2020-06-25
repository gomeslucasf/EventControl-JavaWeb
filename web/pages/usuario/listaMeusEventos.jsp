<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row mt-3">
    
    <div class="col text-center">
        <div class="panel shadow-lg rounded">
           <div class="panel-heading bg-dark pt-3 pb-3 text-center">
                <h3 class="text-white">
                    Meus Eventos
                </h3>
            </div>
            <div class="panel-body bg-white">
                <div class="row">
                <c:forEach var="palestra" items="${listaPalestras}">
                    <div class="col-4 p-3">
                        <div class="card p-5 shadow-lg">
                            <img class="card-img-top" src="/eventos/docentes/2.jpg" width="100" height="300" alt="Card image cap">
                            <div class="card-body">
                              <h5 class="card-title">${palestra.nome}</h5>
                              <p class="card-text">${palestra.descricao}</p>
                              
                              <p class="card-text">${palestra.data}</p>
                              <a href="#" class="btn btn-danger">Cancelar Inscrição</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
                    </div>
            </div>
            <div class="panel-footer">
                
            </div>
        </div>
    </div>
</div>
