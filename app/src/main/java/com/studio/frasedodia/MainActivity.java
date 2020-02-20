package com.studio.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.botaoNovaFrase = findViewById(R.id.botaoNovaFrase);
        this.mViewHolder.viewNovaFrase = findViewById(R.id.textoNovaFrase);
        this.mViewHolder.botaoNovaFrase.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.mViewHolder.viewNovaFrase.setText(this.fraseArray());
    }

    private static class ViewHolder {
        Button botaoNovaFrase;
        TextView viewNovaFrase;
    }

    private String fraseArray(){
        String[] frases = {
                "“Os problemas são oportunidades para se mostrar o que sabe.” (Duke Ellington)",
                "“Nossos fracassos, às vezes, são mais frutíferos do que os êxitos.” (Henry Ford)",
                "“Tente de novo. Fracasse de novo. Mas fracasse melhor”. (Samuel Beckett)",
                "“É costume de um tolo, quando erra, queixar-se dos outros. É costume de um sábio queixar-se de si mesmo”. (Sócrates)",
                "“O verdadeiro heroísmo consiste em persistir por mais um momento, quando tudo parece perdido”. (W. F. Grenfel)",
                "“Cada cliente é como se fosse primeiro e único”. (Norman Bawes)",
                "“Mesmo que já tenhas feito uma longa caminhada, há sempre um novo caminho a fazer”. (Santo Agostinho)",
                "“Vender é construir uma ponte entre você e seu cliente e fazê-lo atravessar para o seu lado”. (Ciclo dos Profissionais de Venda)"
        };
        Random randomic = new Random();
        int randomNum = randomic.nextInt(frases.length);
        return frases [randomNum];
    }
}
