package com.example.liquid;

import android.graphics.Bitmap;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView qrCodeImage;
    private Button generateButton;
    private EditText inputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        qrCodeImage = findViewById(R.id.qrCodeImage);
        generateButton = findViewById(R.id.buttonGenerate);
        inputText = findViewById(R.id.editTextURL);

        inputText.setHorizontallyScrolling(true);
        inputText.setMovementMethod(new ScrollingMovementMethod());

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateQRCode();
            }
        });
    }

    private void generateQRCode() {
        String text = inputText.getText().toString(); // Get text from EditText
        if (!text.isEmpty()) { // Check if the input is not empty
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                Bitmap bitmap = barcodeEncoder.encodeBitmap(text, com.google.zxing.BarcodeFormat.QR_CODE, 400, 400);
                qrCodeImage.setImageBitmap(bitmap);
                qrCodeImage.setAlpha(0f); // Start with transparency
                qrCodeImage.animate().alpha(1f).setDuration(500); // Smooth transition
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // Handle empty input (e.g., show a Toast)
            inputText.setError("Please enter text");
        }
    }
}