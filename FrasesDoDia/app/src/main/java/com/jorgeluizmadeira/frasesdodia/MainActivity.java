package com.jorgeluizmadeira.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Acredite em si mesmo e você será imparável.",
            "Grandes coisas nunca vêm de zonas de conforto.",
            "O sucesso é a soma de pequenos esforços repetidos diariamente.",
            "Não importa o quão devagar você vá, desde que não pare.",
            "Você é mais forte do que pensa e mais capaz do que imagina.",
            "Transforme seus sonhos em metas e suas metas em conquistas.",
            "A persistência é o caminho do êxito.",
            "Não espere por oportunidades. Crie-as.",
            "Sua única limitação é a sua mente.",
            "Desafios são oportunidades disfarçadas.",
            "Nunca é tarde para ser quem você poderia ter sido.",
            "Cada dia é uma nova chance de ser melhor do que ontem.",
            "Coragem não é a ausência de medo, mas agir apesar dele.",
            "Falhar é parte do aprendizado. Levante-se e tente novamente.",
            "Seja a mudança que você quer ver no mundo.",
            "O sucesso é a soma de esforço, trabalho duro e dedicação.",
            "Acredite que você pode, e você já está no meio do caminho.",
            "Os limites são apenas barreiras mentais que você pode superar.",
            "Não desista. O início é sempre o mais difícil.",
            "A jornada de mil milhas começa com um único passo.",
            "Seja grato pelo que você tem, enquanto trabalha pelo que deseja.",
            "O que você faz hoje pode mudar todo o seu amanhã.",
            "Sonhe grande, comece pequeno e avance sempre.",
            "Nada é impossível para aquele que persiste.",
            "Você nunca falha até parar de tentar.",
            "A ação é o antídoto para o desespero.",
            "Vença seus medos e conquiste seus sonhos.",
            "A disciplina é a ponte entre metas e realizações.",
            "Seu futuro é criado pelo que você faz hoje, não amanhã.",
            "Você é o autor da sua própria história. Escreva algo incrível."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){

        TextView texto = findViewById(R.id.textFrases);
        int numeroAleatorio = new Random().nextInt(4);
        String frase = frases[numeroAleatorio];

        texto.setText(frase);

    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textFrases);
        String textoResultado = "";

        for (String frase : frases){
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText(textoResultado);

    }

}