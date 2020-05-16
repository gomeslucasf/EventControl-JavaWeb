<div class="p-3">
    <div class="panel bg-white">
        <div class="panel-heading text-center p-3">
            <h2>Cadastro de Instrutor</h2>
            <h2>Alteração de Instrutor</h2>
        </div>
        <div class="panel-body"> 
            <div class="col">
                <form action="AdminInstrutorServlet.do" method="post">
                    <div class="row">
                        <div class="form-group col-12">
                          <label for="inputNomeInstrutor">Nome do Instrutor</label>
                          <input type="text" class="form-control" name="inputNomeInstrutor" id="inputNomeInstrutor">
                        </div>
                        <div class="form-group col-12">
                          <label for="inputCurriculo">Curriculo</label>
                          <input type="text" class="form-control" name="inputCurriculo" id="inputCurriculo">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col align-items-end">
                            <button type="submit" name="btnSubmit" value="cadastrar" class="btn btn-success">Confirmar</button>
                            <button type="reset" name="btnSubmit" value="cadastrar" class="btn btn-danger">Cancelar</button>
                        </div>
                    </div>
                    
                </form>
            </div>
        </div>
        <div class="panel-footer">
            <div class="p-3">

            </div>
        </div>
    </div>
</div>      