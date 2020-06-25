<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row mt-3">
    
    <div class="col text-center">
        <div class="panel shadow-lg rounded">
           <div class="panel-heading bg-dark pt-3 pb-3 text-center">
                <h3 class="text-white">
                    Seus Eventos Eventos
                </h3>
            </div>
            <div class="panel-body bg-white">
                <nav>
                    <div class="nav nav-tabs bg-light" id="nav-tab" role="tablist">
                        <a class="nav-item nav-link active" id="nav-2406eventos-tab" data-toggle="tab" href="#nav-2406eventos" role="tab" aria-controls="nav-2406eventos" aria-selected="true">24/06</a>
                      
                        <a class="nav-item nav-link" id="nav-2506eventos-tab" data-toggle="tab" href="#nav-2506eventos" role="tab" aria-controls="nav-2506eventos" aria-selected="false">25/06</a>
                        <a class="nav-item nav-link" id="nav-2606eventos-tab" data-toggle="tab" href="#nav-2606eventos" role="tab" aria-controls="nav-2606eventos" aria-selected="false">26/06</a>
                    </div>
                </nav>
                <div class="tab-content pt-3" id="nav-tabContent">
                    
                    <div class="tab-pane fade show active" id="nav-2406eventos" role="tabpanel" aria-labelledby="nav-2406eventos-tab">
                        <div class="w-100">
                            <form action="/eventos/usuario/lista" method="get">
                                <div class="form-row justify-items-center pl-4">
                                        <div class="col-3 p-2 ">
                                          <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                                          <select class="custom-select mr-sm-2 border-0" id="inlineFormCustomSelect">
                                            <option selected value="0">Pesquisar por...</option>
                                            <option value="1">Descrição</option>
                                            <option value="2">Tema</option>
                                          </select>
                                        </div>
                                        <div class="col-6 p-3">
                                          <div class="custom-control custom-input">
                                              <input type="text" class="w-100 border-0" placeholder="Digite aqui...">
                                          </div>
                                        </div>
                                        <div class="col-2 p-2">
                                          <button type="submit" class="btn btn-outline-secondary ">Buscar</button>
                                        </div>
                                </div>
                            </form>
                        </div>
                        
                        <form action="/eventos/usuario/lista" method="get">
                            <table class="table table-striped">
                                <thead>
                                  <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Descrição</th>
                                    <th scope="col">Inicio</th>
                                    <th scope="col">Instrutor</th>
                                    <th scope="col">Escolha o curso</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="palestra" items="${listaPalestras}">
                                        <tr>
                                            <th scope="row">${palestra.codigo}</th>
                                            <td>${palestra.nome}</td>
                                            <td>${palestra.descricao}</td>
                                            
                                            <td>${palestra.data}</td>
                                            <td>

                                                <button type="button" class="btn btn-outline-light" data-toggle="modal" data-target="#exampleModal">
                                                    <div class="text-dark">
                                                        CAETANO BOCCHI PEDROSO
                                                    </div>
                                                </button>

                                                  <!-- Modal -->
                                                  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                      <div class="modal-content">
                                                        <div class="modal-header">
                                                          <h5 class="modal-title" id="exampleModalLabel">CAETANO BOCCHI PEDROSO</h5>
                                                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                          </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <img src="/eventos/docentes/2.jpg" width="100" height="120"/>
                                                            
                                                        </div>
                                                      </div>
                                                    </div>
                                                  </div>
                                            </td>
                                            <td>
                                                <div class="input-group justify-content-center">
                                                    <div class="input-group-prepend">
                                                      <div class="input-group-text align-content-center bg-transparent border-0">
                                                        <input type="radio" name="codigoEventoEscolhido" id="inputCodigoEscolhido" value="${evento.codigo}">
                                                      </div>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                </tbody>
                            </table>
                            <div class="w-100 pb-3">
                                <button type="submit" id="btnConfirmarCurso" class="btn btn-success">Confirmar Curso</button>
                            </div>
                        </form>
                    </div>
                    
                    <div class="tab-pane fade" id="nav-2506eventos" role="tabpanel" aria-labelledby="nav-2506eventos-tab">
                        <div class="w-100">
                            <form action="/eventos/usuario/lista" method="get">
                                <div class="form-row justify-items-center pl-4">
                                        <div class="col-3 p-2 ">
                                          <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                                          <select class="custom-select mr-sm-2 border-0" id="inlineFormCustomSelect">
                                            <option selected value="0">Pesquisar por...</option>
                                            <option value="1">Descrição</option>
                                            <option value="2">Tema</option>
                                          </select>
                                        </div>
                                        <div class="col-6 p-3">
                                          <div class="custom-control custom-input">
                                              <input type="text" class="w-100 border-0" placeholder="Digite aqui...">
                                          </div>
                                        </div>
                                        <div class="col-2 p-2">
                                          <button type="submit" class="btn btn-outline-secondary ">Buscar</button>
                                        </div>
                                </div>
                            </form>
                        </div>
                    <form action="/eventos/usuario/lista" method="get">
                            <table class="table table-striped">
                                <thead>
                                  <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Descrição</th>
                                    <th scope="col">Inicio</th>
                                    <th scope="col">Instrutor</th>
                                    <th scope="col">Escolha o curso</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="palestra" items="${listaPalestras}">
                                        <tr>
                                            <th scope="row">${palestra.codigo}</th>
                                            <td>${palestra.nome}</td>
                                            <td>${palestra.descricao}</td>
                                            
                                            <td>${palestra.data}</td>
                                            <td>

                                               <button type="button" class="btn btn-outline-light" data-toggle="modal" data-target="#exampleModal">
                                                    <div class="text-dark">
                                                        CAETANO BOCCHI PEDROSO
                                                    </div>
                                                </button>

                                                  <!-- Modal -->
                                                  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                      <div class="modal-content">
                                                        <div class="modal-header">
                                                          <h5 class="modal-title" id="exampleModalLabel">CAETANO BOCCHI PEDROSO</h5>
                                                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                          </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <img src="/eventos/docentes/2.jpg" width="100" height="120"/>
                                                            
                                                        </div>
                                                      </div>
                                                    </div>
                                                  </div>
                                            </td>
                                            <td>
                                                <div class="input-group justify-content-center">
                                                    <div class="input-group-prepend">
                                                      <div class="input-group-text align-content-center bg-transparent border-0">
                                                        <input type="radio" name="codigoEventoEscolhido" id="inputCodigoEscolhido" value="${evento.codigo}">
                                                      </div>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                </tbody>
                            </table>
                            <div class="w-100 pb-3">
                                <button type="submit" id="btnConfirmarCurso" class="btn btn-success">Confirmar Curso</button>
                            </div>
                        </form>
                    </div>
                    
                    <div class="tab-pane fade show " id="nav-2606eventos" role="tabpanel" aria-labelledby="nav-2606eventos-tab">
                        <div class="w-100">
                            <form action="/eventos/usuario/lista" method="get">
                                <div class="form-row justify-items-center pl-4">
                                        <div class="col-3 p-2 ">
                                          <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                                          <select class="custom-select mr-sm-2 border-0" id="inlineFormCustomSelect">
                                            <option selected value="0">Pesquisar por...</option>
                                            <option value="1">Descrição</option>
                                            <option value="2">Tema</option>
                                          </select>
                                        </div>
                                        <div class="col-6 p-3">
                                          <div class="custom-control custom-input">
                                              <input type="text" class="w-100 border-0" placeholder="Digite aqui...">
                                          </div>
                                        </div>
                                        <div class="col-2 p-2">
                                          <button type="submit" class="btn btn-outline-secondary ">Buscar</button>
                                        </div>
                                </div>
                            </form>
                        </div>
                        <form action="/eventos/usuario/lista" method="get">
                            <table class="table table-striped">
                                <thead>
                                  <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Descrição</th>
                                    <th scope="col">Inicio</th>
                                    <th scope="col">Instrutor</th>
                                    <th scope="col">Escolha o curso</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="palestra" items="${listaPalestras}">
                                        <tr>
                                            <th scope="row">${palestra.codigo}</th>
                                            <td>${palestra.nome}</td>
                                            <td>${palestra.descricao}</td>
                                            
                                            <td>${palestra.data}</td>
                                            <td>

                                                <button type="button" class="btn btn-outline-light" data-toggle="modal" data-target="#exampleModal">
                                                    <div class="text-dark">
                                                        CAETANO BOCCHI PEDROSO
                                                    </div>
                                                </button>

                                                  <!-- Modal -->
                                                  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                    <div class="modal-dialog">
                                                      <div class="modal-content">
                                                        <div class="modal-header">
                                                          <h5 class="modal-title" id="exampleModalLabel">CAETANO BOCCHI PEDROSO</h5>
                                                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                            <span aria-hidden="true">&times;</span>
                                                          </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <img src="/eventos/docentes/2.jpg" width="100" height="120"/>
                                                            
                                                        </div>
                                                      </div>
                                                    </div>
                                                  </div>
                                            </td>
                                            <td>
                                                <div class="input-group justify-content-center">
                                                    <div class="input-group-prepend">
                                                      <div class="input-group-text align-content-center bg-transparent border-0">
                                                        <input type="radio" name="codigoEventoEscolhido" id="inputCodigoEscolhido" value="${evento.codigo}">
                                                      </div>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                </tbody>
                            </table>
                            <div class="w-100 pb-3">
                                <button type="submit" id="btnConfirmarCurso" class="btn btn-success">Confirmar Curso</button>
                            </div>
                        </form>
                        
                    </div>
                    
                </div>
            </div>
            <div class="panel-footer">
                
            </div>
        </div>
    </div>
</div>
