<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="evento" class="com.eventcontrol.controller.servlet.admin.AdminEventosServlet" scope="request"/> 
<jsp:useBean id="erros" class="com.eventcontrol.controller.servlet.admin.AdminEventosServlet" scope="request"/> 
<div class="p-3">
    <div class="panel bg-white">
        <div class="panel-heading text-center p-3">
            <h2>Cadastro de Eventos</h2>
            <h2>Alteração de Eventos</h2>
        </div>
        <div class="panel-body"> 
            <div class="col">
                <form action="/eventos/admin/evento/cadastro" method="post">
                    <c:if test="${not empty evento}">
                        <div class="row">
                            <div class="form-group col-12">
                              <label for="inputCodigoEvento">Titulo do Evento</label>
                              <input type="text" class="form-control" name="inputCodigoEvento" id="inputCodigoEvento" required>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputInicioEvento">Data de Inicio</label>
                                <input type="date" class="form-control" name="inputInicioEvento" id="inputInicioEvento" required>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputFimEvento">Data de Encerramento</label>
                                <input type="date" class="form-control" name="inputFimEvento" id="inputFimEvento" required>
                            </div>
                        </div>
                    </c:if>
                    <c:if test="${evento}">
                        <div class="row">
                            <div class="form-group col-12">
                              <label for="inputCodigoEvento">Titulo do Evento</label>
                              <input type="text" class="form-control" name="inputCodigoEvento" id="inputCodigoEvento" value="${evento.nome}" required>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputInicioEvento">Data de Inicio</label>
                                <input type="date" class="form-control" name="inputInicioEvento" id="inputInicioEvento" value="${evento.inicio}" required>
                            </div>
                            <div class="form-group col-6">
                                <label for="inputFimEvento">Data de Encerramento</label>
                                <input type="date" class="form-control" name="inputFimEvento" id="inputFimEvento" value="${evento.fim}" required>
                            </div>
                        </div>
                    </c:if>
                    <div class="row">
                        <div class="col align-items-end">
                            <button type="submit" name="btnSubmit" value="cadastrar" class="btn btn-success">Confirmar</button>
                            <button type="reset" name="btnCancelar" value="cadastrar" class="btn btn-danger">Cancelar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="panel-footer">
            <div class="p-3">
                <c:if test="erros">
                    <c:forEach var="erro" items="erros">
                        <ul>
                            <li>${erro}</li>
                        </ul> 
                    </c:forEach>
                </c:if>
            </div>
        </div>
    </div>
</div>      