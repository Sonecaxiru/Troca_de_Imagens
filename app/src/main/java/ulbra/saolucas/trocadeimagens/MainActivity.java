package ulbra.saolucas.trocadeimagens;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrar1 = findViewById(R.id.btnMostrar);
        Button btnMostrar2 = findViewById(R.id.btnMostrar2);
        ImageView imageView = findViewById(R.id.imageView);

        // Configura a ação do botão 1
        btnMostrar1.setOnClickListener(v -> imageView.setImageResource(R.drawable.img1)); // Troca para a imagem 1

        // Configura a ação do botão 2
        btnMostrar2.setOnClickListener(v -> imageView.setImageResource(R.drawable.img2)); // Troca para a imagem 2
    }
}