package com.example.iossenac.appcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.iossenac.appcustomadapter.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contato> listaContatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Fulano","3445566"));
        listaContatos.add(new Contato("Fulano","3445566"));


        ListView lista = (ListView) findViewById(R.id.listViewPrincipal);
        lista.setAdapter(new ContatoAdapter(this,listaContatos));


    }
}
