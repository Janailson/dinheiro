package jsadev.com.br.dinheiro.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import jsadev.com.br.dinheiro.R;
import jsadev.com.br.dinheiro.models.Planejamento;

public class PlanejamentoAdapter extends RecyclerView.Adapter {

    private List<Planejamento> planejamentos;
    private Context context;

    public PlanejamentoAdapter(List<Planejamento> planejamentos, Context context) {
        this.planejamentos = planejamentos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_planejamento, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder h = (ViewHolder) holder;
        final Planejamento planejamento = planejamentos.get(position);

        h.nome.setText(planejamento.getNome());
        h.data.setText(planejamento.getData());

        // valor
        Currency real = Currency.getInstance("BRL");
        DecimalFormat format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("");
        symbols.setMonetaryDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        format.setDecimalFormatSymbols(symbols);
        h.valor.setText(format.format(planejamento.getValor()));

        // status
        if (planejamento.isStatus()) {
            h.status.setImageResource(R.drawable.ic_check);
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date data = new Date();
            try {
                data = dateFormat.parse(planejamento.getData());

                Calendar validDate = Calendar.getInstance();
                validDate.set(data.getYear(), data.getMonth(), data.getDay());

                Calendar currentDate = Calendar.getInstance();

                if (currentDate.before(validDate) || currentDate.equals(validDate))
                    h.status.setImageResource(R.drawable.ic_clock);
                else
                    h.status.setImageResource(R.drawable.ic_none);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return planejamentos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final CardView item;
        final TextView nome;
        final TextView data;
        final TextView valor;
        final ImageView status;

        public ViewHolder(View itemView) {
            super(itemView);
            item = (CardView) itemView.findViewById(R.id.item);
            nome = (TextView) itemView.findViewById(R.id.nome);
            data = (TextView) itemView.findViewById(R.id.data);
            valor = (TextView) itemView.findViewById(R.id.valor);
            status = (ImageView) itemView.findViewById(R.id.status);
        }
    }
}
