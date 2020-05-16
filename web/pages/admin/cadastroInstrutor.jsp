<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="instrutor" class="com.eventcontrol.controller.servlet.admin.AdminInstrutorServlet" scope="request"/> 
<jsp:useBean id="erros" class="com.eventcontrol.controller.servlet.admin.AdminInstrutorServlet" scope="request"/> 
<div class="p-3">
    <div class="panel bg-white">
        <div class="panel-heading text-center p-3">
            <h2>Cadastro de Instrutor</h2>
            <h2>Alteração de Instrutor</h2>
        </div>
        <div class="panel-body"> 
            <div class="col">
                <form action="/eventos/admin/instrutor/cadastro" method="post">
                    <c:if test="${not empty instrutor}">
                        <div class="row">
                            <div class="form-group col-12">
                              <label for="inputNomeInstrutor">Nome do Instrutor</label>
                              <input type="text" class="form-control" name="inputNomeInstrutor" id="inputNomeInstrutor" required>
                            </div>
                            <div class="form-group col-12">
                              <label for="inputCurriculo">Curriculo</label>
                              <input type="text" class="form-control" name="inputCurriculo" id="inputCurriculo" required>
                            </div>
                        </div>
                    </c:if>
                    <c:if test="${instrutor}">
                        <div type="hidden" id="inputCodigoInstrutor" name="inputCodigoInstrutor" value="${instrutor.codigo}"/>
                        <div class="row">
                            <div class="form-group col-12">
                              <label for="inputNomeInstrutor">Nome do Instrutor</label>
                              <input type="text" class="form-control" name="inputNomeInstrutor" id="inputNomeInstrutor" value="${instrutor.nome}" required>
                            </div>
                            <div class="form-group col-12">
                              <label for="inputCurriculo">Curriculo</label>
                              <input type="text" class="form-control" name="inputCurriculo" id="inputCurriculo" value="${instrutor.curriculo}" required>
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