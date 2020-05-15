<div class="p-3">
    <div class="panel bg-white">
        <div class="panel-heading text-center p-3"> 
            <h2>Cadastro de Instrutor</h2>
        </div>
        <div class="panel-body"> 
            <div class="col">
                <form action="cadastro.do" method="post">
                    <div class="row">
                        <div class="form-group col-md-2">
                              <label for="inputCodigoEvento">Código</label>
                              <input type="number" class="form-control" id="inputCodigoEvento">
                        </div>
                        <div class="form-group col-md-10">
                          <label for="inputCodigoEvento">Titulo do Evento</label>
                          <input type="text" class="form-control" id="inputCodigoEvento">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputInicioEvento">Data de Inicio</label>
                            <input type="date" class="form-control" id="inputInicioEvento">
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputFimEvento">Data de Encerramento</label>
                            <input type="date" class="form-control" id="inputFimEvento">
                        </div>
                    </div>
                    <button type="submit" class="btn btn-success">Cadastrar</button>
                </form>
            </div>
        </div>
        <div class="panel-footer">
            <div class="p-3">
                
            </div>
        </div>
    </div>
</div>      