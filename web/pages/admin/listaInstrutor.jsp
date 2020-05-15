<<div class="p-3">
    <div class="panel bg-white p-3">
        <div class="panel-heading text-center">
            <h2>Lista de Instrutores</h2>
        </div>
        <div class="panel-body">
            <div class="p-3">
                <form action="AdmisnInstrutorListagemServlet.do">
                    <div class="row">
                        <div class="col-2">
                            <button type="button" class="btn btn-outline-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span>Buscar Por </span>
                            </button>
                            <div class="dropdown-menu text-center">
                                <input class="dropdown-item" type="radio" id="radioCodigo" name="pesquisa" value="codigo" >
                                <label for="radioCodigo">Código</label><br>
                                <input class="dropdown-item" type="radio" id="radioNome" name="pesquisa" value="nome">
                                <label for="radioNome">Nome</label><br>
                                <input class="dropdown-item" accept=""type="radio" id="other" name="pesquisa" value="Outros">
                                <label for="other">Outros</label>
                            </div>   
                        </div>
                        <div class="col-8">
                            <input id="inputTextBusca" name="inputTextBusca" class="form-control">
                        </div>
                        <div class="col-2">
                            <button id="btnPesquisar" name="btnPesquisar" type="button" class="btn btn-outline-secondary">Pesquisar</button>
                        </div>
                    </div>
                </form>
            </div>
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th scope="col">Código</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Curriculo</th>
                    <th scope="col">Ações</th>
                  </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row">1</th>
                        <td >Mark</td>
                        <td>Otto</td>
                        <td>
                            <form action="AdminInstrutorServlet.do">
                                <button id="btnAlterar" name="btnAlterar" type="button" class="btn btn-warning text-white btn-sm">Alterar</button>
                                <input type="hidden" value="evento">
                                <button id="btnExcluir" name="btnExcluir" type="button" class="btn btn-danger btn-sm">Excluir</button>
                            </form>
                        </td>
                    </tr>
                     <tr>
                        <th scope="row">1</th>
                        <td >Mark</td>
                        <td>Otto</td>
                        <td>
                            <form action="AdminInstrutorServlet.do">
                                <button id="btnAlterar" name="btnAlterar" type="button" class="btn btn-warning text-white btn-sm">Alterar</button>
                                <input type="hidden" value="evento">
                                <button id="btnExcluir" name="btnExcluir" type="button" class="btn btn-danger btn-sm">Excluir</button>
                            </form>
                        </td>
                    </tr>
                     <tr>
                        <th scope="row">1</th>
                        <td >Mark</td>
                        <td>Otto</td>
                        <td>
                            <form action="AdminInstrutorServlet.do">
                                <button id="btnAlterar" name="btnAlterar" type="button" class="btn btn-warning text-white btn-sm">Alterar</button>
                                <input type="hidden" value="evento">
                                <button id="btnExcluir" name="btnExcluir" type="button" class="btn btn-danger btn-sm">Excluir</button>
                            </form>
                        </td>
                    </tr>
                     <tr>
                        <th scope="row">1</th>
                        <td >Mark</td>
                        <td>Otto</td>
                        <td>
                            <form action="AdminInstrutorServlet.do">
                                <button id="btnAlterar" name="btnAlterar" type="button" class="btn btn-warning text-white btn-sm">Alterar</button>
                                <input type="hidden" value="evento">
                                <button id="btnExcluir" name="btnExcluir" type="button" class="btn btn-danger btn-sm">Excluir</button>
                            </form>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="panel-footer">
            <form  action="AdminInstrutorListagemServlet.do">
                <button id="btnNovoEvento" name="btnNovoEvento" type="button" class="btn btn-outline-success">Novo Evento</button>
            </form>
                    
        </div>
    </div>
</div>