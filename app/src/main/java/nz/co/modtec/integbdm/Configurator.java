package nz.co.modtec.integbdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class Configurator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurator);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView productcode = (TextView) findViewById(R.id.productCode);
        ImageView arm_left=(ImageView) findViewById(R.id.arm_left);
        ImageView arm_right=(ImageView) findViewById(R.id.arm_right);
        ImageView clamp_d=(ImageView) findViewById(R.id.clamp_d);
        ImageView clamp_kg=(ImageView) findViewById(R.id.clamp_kg);
        ImageView pole_400=(ImageView) findViewById(R.id.pole_400);
        CheckBox checkkidney = (CheckBox)findViewById(R.id.checkkg);
        CheckBox checksplit = (CheckBox) findViewById(R.id.checksc);
        CheckBox checkpole = (CheckBox) findViewById(R.id.checka4);
        CheckBox checkarmleft = (CheckBox) findViewById(R.id.checkal);
        CheckBox checkarmright = (CheckBox) findViewById(R.id.checkar);


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkal:
                if (checked) {
                    arm_left.setVisibility(View.VISIBLE);
                }
            else {
                    arm_left.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkar:
                if (checked) {
                    arm_right.setVisibility(View.VISIBLE);
                }
            else {
                    arm_right.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checksc:
                if (checked) {
                    clamp_d.setVisibility(View.VISIBLE);
                    clamp_kg.setVisibility(View.INVISIBLE);
                    checkkidney.setChecked(false);
                }
            else {
                    clamp_d.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkkg:
                 if (checked) {
                    clamp_kg.setVisibility(View.VISIBLE);
                     clamp_d.setVisibility(View.INVISIBLE);
                     checksplit.setChecked(false);
                }
            else {
                    clamp_kg.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checka4:
                if (checked) {
                    pole_400.setVisibility(View.VISIBLE);
                }
                else {
                    pole_400.setVisibility(View.INVISIBLE);
                }
                break;
        }
        if (checkarmleft.isChecked()||checkarmright.isChecked()) {
            productcode.setText("MAKP2-SAR-10");
        }
        if (checkkidney.isChecked()) {
            productcode.setText("PCPG2-SW0-01");
        }
        if (checksplit.isChecked()) {
            productcode.setText("PCPD9-SA2-02");
        }
        if (checkpole.isChecked()) {
            productcode.setText("PPCD4-SW0-02");
        }
        if (checkkidney.isChecked()&&checkpole.isChecked()) {
            productcode.setText("PCPG2-SW0-01 + PPCD4-SW0-02");
        }
        if (checkkidney.isChecked()&&checkarmleft.isChecked()) {
            productcode.setText("PCPG2-SW0-01 + MAKP2-SAR-10");
        }
        if (checkkidney.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("PCPG2-SW0-01 + MAKP2-SAR-10");
        }
        if (checksplit.isChecked()&&checkpole.isChecked()) {
            productcode.setText("PCPD9-SA2-02 + PPCD4-SW0-02");
        }
        if (checksplit.isChecked()&&checkarmleft.isChecked()) {
            productcode.setText("PCPD9-SA2-02 + MAKP2-SAR-10");
        }
        if (checksplit.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("PCPD9-SA2-02 + MAKP2-SAR-10");
        }
        if (checkarmleft.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("2 x MAKP2-SAR-10");
        }
        if (checkarmleft.isChecked()&&checkpole.isChecked()) {
            productcode.setText("PPCD4-SW0-02 + MAKP2-SAR-10");
        }
        if (checkarmright.isChecked()&&checkpole.isChecked()) {
            productcode.setText("PPCD4-SW0-02 + MAKP2-SAR-10");
        }
        if (checkarmleft.isChecked()&&checkarmright.isChecked()&&checkkidney.isChecked()) {
            productcode.setText("PCPG2-SW0-01 + 2 x MAKP2-SAR-10");
        }
        if (checkarmleft.isChecked()&&checkarmright.isChecked()&&checksplit.isChecked()) {
            productcode.setText("PCPD9-SW0-02 + 2 x MAKP2-SAR-10");
        }
        if (checkarmleft.isChecked()&&checkarmright.isChecked()&&checkpole.isChecked()) {
            productcode.setText("PPCD4-SW0-02 + 2 x MAKP2-SAR-10");
        }
        if (checkkidney.isChecked()&&checkpole.isChecked()&&checkarmleft.isChecked()) {
            productcode.setText("MA4-4S2KG");
        }
        if (checkkidney.isChecked()&&checkpole.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("MA4-4S2KG");
        }
        if (checksplit.isChecked()&&checkpole.isChecked()&&checkarmleft.isChecked()) {
            productcode.setText("MA4-4S2D");
        }
        if (checksplit.isChecked()&&checkpole.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("MA4-4S2D");
        }
        if (checksplit.isChecked()&&checkpole.isChecked()&&checkarmleft.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("MA4-4D2D");
        }
        if (checkkidney.isChecked()&&checkpole.isChecked()&&checkarmleft.isChecked()&&checkarmright.isChecked()) {
            productcode.setText("MA4-4D2KG");
        }

    }

}
