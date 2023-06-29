package chl.ancud.m4_individual12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import chl.ancud.m4_individual12.databinding.ActivityMainBinding;
import chl.ancud.m4_individual12.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {

    protected ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<String> lista = new ArrayList<>();

        for(int i=1; i<=20; i++) lista.add("Menu " + i);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lista);
        binding.lvMenu.setAdapter(adapter);

    }
}