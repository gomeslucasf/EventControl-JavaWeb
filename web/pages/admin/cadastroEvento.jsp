<div class="p-3">
    <div class="panel bg-white">
        <div class="panel-heading text-center p-3">
            <h2>Cadastro de Eventos</h2>
            <h2>Alteração de Eventos</h2>
        </div>
        <div class="panel-body"> 
            <div class="col">
                <form action="AdminEventoServlets.do" method="post">
                    <div class="row">
                        <div class="form-group col-12">
                          <label for="inputCodigoEvento">Titulo do Evento</label>
                          <input type="text" class="form-control" name="evt_titulo" id="inputCodigoEvento">
                        </div>
                        <div class="form-group col-6">
                            <label for="inputInicioEvento">Data de Inicio</label>
                            <input type="date" class="form-control" name="evt_data_ini" id="inputInicioEvento">
                        </div>
                        <div class="form-group col-6">
                            <label for="inputFimEvento">Data de Encerramento</label>
                            <input type="date" class="form-control" name="evt_data_fim" id="inputFimEvento">
                        </div>
                    </div>
                    <button type="submit" name="bSubmit" value="cadastrar" class="btn btn-success">Confirmar</button>
                </form>
            </div>
        </div>
        <div class="panel-footer">
            <div class="p-3">

            </div>
        </div>
    </div>
</div>      