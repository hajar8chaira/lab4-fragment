package com.example.fragmentslab;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {
    public FragmentOne() { super(R.layout.fragment_one); }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView tv = view.findViewById(R.id.textOne);
        view.findViewById(R.id.btnHello).setOnClickListener(v -> {
            tv.setText("Bonjour de la part de Hajar !");
        });
    }
}
