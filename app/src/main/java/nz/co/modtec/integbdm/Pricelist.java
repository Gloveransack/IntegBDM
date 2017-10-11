package nz.co.modtec.integbdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Pricelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricelist);


        final Button austminbutton = (Button) findViewById(R.id.AusMin);
        austminbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAusMin();
            }
        });

        final Button auststdbutton = (Button) findViewById(R.id.AusStd);
        auststdbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAusStd();
            }
        });

        final Button nzminbutton = (Button) findViewById(R.id.NZMin);
        nzminbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNZMin();
            }
        });

        final Button nzstdbutton = (Button) findViewById(R.id.NZStd);
        nzstdbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openNZStd();
            }
        });

        final Button indminbutton = (Button) findViewById(R.id.IndMin);
        indminbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openIndiaMin();
            }
        });

        final Button indstdbutton = (Button) findViewById(R.id.IndStd);
        indstdbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openIndiaStd();
            }
        });

        final Button haworthindbutton = (Button) findViewById(R.id.HawInd);
        haworthindbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHaworthInd();
            }
        });

        final Button steelcaseindbutton = (Button) findViewById(R.id.SteelInd);
        steelcaseindbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSteelcaseInd();
            }
        });

        austminbutton.setVisibility(View.GONE);
        auststdbutton.setVisibility(View.GONE);
        nzminbutton.setVisibility(View.GONE);
        nzstdbutton.setVisibility(View.GONE);
        indminbutton.setVisibility(View.GONE);
        indstdbutton.setVisibility(View.GONE);
        haworthindbutton.setVisibility(View.GONE);
        steelcaseindbutton.setVisibility(View.GONE);

        final EditText password = (EditText)findViewById(R.id.pricepassword);

        final Button gobutton = (Button) findViewById(R.id.gobutton);
        gobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String answer = password.getText().toString();

                if (answer.equals("hide")) {
                    austminbutton.setVisibility(View.VISIBLE);
                    auststdbutton.setVisibility(View.VISIBLE);
                }
                if (answer.equals("back")) {
                    nzminbutton.setVisibility(View.VISIBLE);
                    nzstdbutton.setVisibility(View.VISIBLE);
                }
                if (answer.equals("call")) {
                    indminbutton.setVisibility(View.VISIBLE);
                    indstdbutton.setVisibility(View.VISIBLE);
                    haworthindbutton.setVisibility(View.VISIBLE);
                    steelcaseindbutton.setVisibility(View.VISIBLE);
                }
                if (answer.equals("push")) {
                    auststdbutton.setVisibility(View.VISIBLE);
                }
                if (answer.equals("door")) {
                    indstdbutton.setVisibility(View.VISIBLE);
                    haworthindbutton.setVisibility(View.VISIBLE);
                    steelcaseindbutton.setVisibility(View.VISIBLE);
                }
                if (answer.equals("sand")) {
                    nzminbutton.setVisibility(View.VISIBLE);
                    nzstdbutton.setVisibility(View.VISIBLE);
                    austminbutton.setVisibility(View.VISIBLE);
                    auststdbutton.setVisibility(View.VISIBLE);
                    indminbutton.setVisibility(View.VISIBLE);
                    indstdbutton.setVisibility(View.VISIBLE);
                    haworthindbutton.setVisibility(View.VISIBLE);
                    steelcaseindbutton.setVisibility(View.VISIBLE);
                    TextView passwordInstuctions = (TextView)findViewById(R.id.passwordInstructions);
                    passwordInstuctions.setText("Aust Head = hide, Aust BDM = push, NZ Head = back, India Head = call, India BDM = door");
                }
            }
        });




    }

    private void openAusMin() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","priceaustralianinternal.pdf");
        startActivity(intent);
    }

    private void openAusStd() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","priceaustraliandealer.pdf");
        startActivity(intent);
    }

    private void openNZMin() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","pricenzinternal.pdf");
        startActivity(intent);
    }

    private void openNZStd() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","pricenzdealer.pdf");
        startActivity(intent);
    }

    private void openIndiaMin() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","priceindiainternal.pdf");
        startActivity(intent);
    }

    private void openIndiaStd() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","priceindiadealer.pdf");
        startActivity(intent);
    }

    private void openHaworthInd() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","pricehaworthindia.pdf");
        startActivity(intent);
    }

    private void openSteelcaseInd() {
        Intent intent = new Intent(Pricelist.this, OpenPDF.class);
        intent.putExtra("requestedPDF","pricesteelcaseindia.pdf");
        startActivity(intent);
    }
}
