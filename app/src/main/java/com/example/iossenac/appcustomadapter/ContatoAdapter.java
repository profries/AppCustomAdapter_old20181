package com.example.iossenac.appcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.iossenac.appcustomadapter.model.Contato;

import java.util.List;

public class ContatoAdapter extends BaseAdapter {
    private Context contexto;
    private List<Contato> listaContatos;

    public ContatoAdapter(Context contexto, List<Contato> lista){
        this.contexto = contexto;
        this.listaContatos = lista;

    }

    @Override
    public int getCount() {
        return listaContatos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.list_item_contatos,parent,false);

        TextView textNome = (TextView) view.findViewById(R.id.textNome);
        TextView textTelefone = (TextView) view.findViewById(R.id.textTelefone);

        Contato contato = listaContatos.get(position);

        textNome.setText(contato.getNome());
        textTelefone.setText(contato.getTelefone());

        return view;

    }
}
