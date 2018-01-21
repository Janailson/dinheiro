package jsadev.com.br.dinheiro;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jsadev.com.br.dinheiro.adapter.PlanejamentoAdapter;
import jsadev.com.br.dinheiro.api.BaseActivity;
import jsadev.com.br.dinheiro.models.Planejamento;

public class PlanejamentoActivity extends BaseActivity {

    private RecyclerView listPlanejamento;
    private PlanejamentoAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_planejamento);
        super.onCreate(savedInstanceState);

        listPlanejamento = (RecyclerView) findViewById(R.id.list_planejamento);
        listPlanejamento.setHasFixedSize(true);

        // specify an adapter
        adapter = new PlanejamentoAdapter(mockPlanejamento(), this);
        listPlanejamento.setAdapter(adapter);

        // define layout as linear
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listPlanejamento.setLayoutManager(layoutManager);
        listPlanejamento.setItemAnimator(new DefaultItemAnimator());
    }

    private List<Planejamento> mockPlanejamento() {
        List<Planejamento> planejamentos = new ArrayList<Planejamento>();

        planejamentos.add(new Planejamento(24, "Ipva", "12/12", 100.00, "28/12/2017", 1, 2018, true));
        planejamentos.add(new Planejamento(25, "Reforma Sala", "7/10", 221.95, "28/12/2017", 1, 2018, true));
        planejamentos.add(new Planejamento(26, "Office 365", "3/12", 12.50, "01/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(27, "Xbox Live", "3/12", 12.50, "01/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(28, "Reserva Fev. 2018", "", 500.00, "01/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(29, "Reserva Fev. 2018", "", 60.00, "01/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(32, "Bianca", "", 25.00, "01/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(1, "Seguro Casa", "4/12", 30.31, "02/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(3, "Maxiconta", "", 69.95, "03/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(2, "Netflix", "", 27.90, "04/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(4, "Visa", "", 648.92, "04/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(5, "Itaú", "36/37", 420.33, "06/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(6, "Carro", "32/48", 388.53, "06/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(7, "Seguro Carro", "2/24", 161.99, "09/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(8, "Tam", "3/4", 292.20, "09/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(9, "Avianca", "3/6", 146.00, "09/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(10, "Peças carro", "1/4", 163.80, "09/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(11, "Sem parar", "", 54.74, "10/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(12, "Gás", "", 15.25, "10/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(13, "Ipva 2018", "", 713.65, "10/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(22, "Dpvat", "", 45.72, "10/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(23, "Licenciamento", "", 98.38, "10/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(14, "Condomínio", "", 352.99, "11/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(15, "Luz", "", 71.82, "13/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(21, "Brasílino", "", 40.00, "15/01/2018", 1, 2018, true));
        planejamentos.add(new Planejamento(16, "Vivo", "", 95.90, "15/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(17, "Apartamento", "33/420", 1438.80, "16/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(18, "Oi", "", 55.85, "16/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(19, "Claro", "", 173.63, "20/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(20, "Net", "", 123.53, "22/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(30, "Dólares", "(100)", 280.00, "24/01/2018", 1, 2018, false));
        planejamentos.add(new Planejamento(31, "Débito", "", 500.00, "24/01/2018", 1, 2018, false));

        return planejamentos;
    }
}
