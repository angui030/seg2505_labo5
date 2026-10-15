package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Récupérer le RecyclerView (il est inclus via content_main.xml)
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // 2. Définir le gestionnaire de mise en page en liste verticale
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 3. Créer une liste de données de test
        List<String> wordList = Arrays.asList("Élément 01", "Élément 02", "Élément 03", "Élément 04", "Élément 05");

        // 4. Instancier l'adaptateur avec vos données
        WordListAdapter adapter = new WordListAdapter(wordList);

        // 5. Assigner l'adaptateur au RecyclerView
        recyclerView.setAdapter(adapter);
    }
}