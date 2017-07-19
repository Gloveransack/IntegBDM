package nz.co.modtec.integbdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Configurator_spinner extends AppCompatActivity{




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurator_spinner);

        Spinner clamp_spin = (Spinner) findViewById(R.id.Clamp);
        Spinner arm_spin = (Spinner) findViewById(R.id.Arms);
        Spinner pole_spin = (Spinner) findViewById(R.id.Pole);
        Spinner acc_spin = (Spinner) findViewById(R.id.Accessories);

        clamp_spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ImageView clampimage = (ImageView) findViewById(R.id.clamp_image);
                String clamp = parent.getItemAtPosition(position).toString();
                if (clamp.equals("Split clamp - Silver")) {
                    clampimage.setImageResource(R.drawable.sc_s);
                    clampimage.setTag ("SC-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPD9-SA2-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (clamp.equals("Grommet clamp - Silver")) {
                    clampimage.setImageResource(R.drawable.kg_s);
                    clampimage.setTag ("KG-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPG2-SW0-01", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (clamp.equals("Split clamp - White")) {
                    clampimage.setImageResource(R.drawable.sc_w);
                    clampimage.setTag ("SC-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPD9-WA2-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (clamp.equals("Grommet clamp - White")) {
                    clampimage.setImageResource(R.drawable.kg_w);
                    clampimage.setTag ("KG-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPG2-WW0-01", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (clamp.equals("Split clamp - Black")) {
                    clampimage.setImageResource(R.drawable.sc_b);
                    clampimage.setTag ("SC-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPD9-BA2-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (clamp.equals("Grommet clamp - Black")) {
                    clampimage.setImageResource(R.drawable.kg_b);
                    clampimage.setTag ("KG-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "PCPG2-BW0-01", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                }
                else {
                    clampimage.setImageResource(android.R.color.transparent);
                }
                productcode();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        arm_spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ImageView armsimage = (ImageView) findViewById(R.id.arms_image);
                ImageView leftarmsimage = (ImageView) findViewById(R.id.left_arms_image);
                armsimage.setImageResource(android.R.color.transparent);
                leftarmsimage.setImageResource(android.R.color.transparent);

                ImageView accimage = (ImageView) findViewById(R.id.acc_image);
                ImageView leftaccimage = (ImageView) findViewById(R.id.left_acc_image);
                accimage.setImageResource(android.R.color.transparent);
                leftaccimage.setImageResource(android.R.color.transparent);

                String arms = parent.getItemAtPosition(position).toString();

                if (arms.equals("Ar-ray Single - Silver")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.arr_s);
                    armsimage.setTag("ARS-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-SUR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Ar-ray Dual - Silver")) {
                    armsimage.setImageResource(R.drawable.arr_s);
                    leftarmsimage.setImageResource(R.drawable.arl_s);
                    armsimage.setTag("ARD-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-SUR-20 + RAYB2-SLR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Ar-ray Single - White")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.arr_w);
                    armsimage.setTag("ARS-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-WUR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Ar-ray Dual - White")) {
                    armsimage.setImageResource(R.drawable.arr_w);
                    leftarmsimage.setImageResource(R.drawable.arl_w);
                    armsimage.setTag("ARD-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-WUR-20 + RAYB2-WLR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Ar-ray Single - Black")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.arr_b);
                    armsimage.setTag("ARS-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-BUR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Ar-ray Dual - Black")) {
                    armsimage.setImageResource(R.drawable.arr_b);
                    leftarmsimage.setImageResource(R.drawable.arl_b);
                    armsimage.setTag("ARD-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "RAYA2-BUR-20 + RAYB2-BLR-20", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Single - Silver")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.mr_s);
                    armsimage.setTag("A4S-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-SAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Dual - Silver")) {
                    armsimage.setImageResource(R.drawable.mr_s);
                    leftarmsimage.setImageResource(R.drawable.ml_s);
                    armsimage.setTag("A4D-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-SAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Single - White")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.mr_w);
                    armsimage.setTag("A4S-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-WAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Dual - White")) {
                    armsimage.setImageResource(R.drawable.mr_w);
                    leftarmsimage.setImageResource(R.drawable.ml_w);
                    armsimage.setTag("A4D-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-WAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Single - Black")) {
                    leftarmsimage.setImageResource(android.R.color.transparent);
                    armsimage.setImageResource(R.drawable.mr_b);
                    armsimage.setTag("A4S-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-BAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (arms.equals("Apollo Dual - Black")) {
                    armsimage.setImageResource(R.drawable.mr_b);
                    leftarmsimage.setImageResource(R.drawable.ml_b);
                    armsimage.setTag("A4D-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-BAR-15", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else {
                    armsimage.setImageResource(android.R.color.transparent);
                    leftarmsimage.setImageResource(android.R.color.transparent);
                }
                productcode();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        pole_spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                ImageView poleimage = (ImageView) findViewById(R.id.pole_image);
                poleimage.setImageResource(android.R.color.transparent);

                String pole = parent.getItemAtPosition(position).toString();

                if (pole.equals("Ar-ray - Silver")) {
                    poleimage.setImageResource(R.drawable.ar_s);
                    poleimage.setTag ("AR-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPAR4-SW0-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (pole.equals("Apollo4 - Silver")) {
                    poleimage.setImageResource(R.drawable.ap_s);
                    poleimage.setTag ("A4-S");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPCD4-SW0-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (pole.equals("Ar-ray - White")) {
                    poleimage.setImageResource(R.drawable.ar_w);
                    poleimage.setTag ("AR-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPAR4-WW0-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (pole.equals("Apollo4 - White")) {
                    poleimage.setImageResource(R.drawable.ap_w);
                    poleimage.setTag ("A4-W");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPCD4-WW0-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (pole.equals("Ar-ray - Black")) {
                    poleimage.setImageResource(R.drawable.ar_b);
                    poleimage.setTag ("AR-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPAR4-BW0-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else if (pole.equals("Apollo4 - Black")) {
                    poleimage.setImageResource(R.drawable.ap_b);
                    poleimage.setTag ("A4-B");
                    Toast toast = Toast.makeText(getApplicationContext(), "PPCD4-BW0-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                } else {
                    poleimage.setImageResource(android.R.color.transparent);
                }
                productcode();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

        acc_spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                {
                    ImageView accimage = (ImageView) findViewById(R.id.acc_image);
                    ImageView leftaccimage = (ImageView) findViewById(R.id.left_acc_image);
                    accimage.setImageResource(android.R.color.transparent);
                    leftaccimage.setImageResource(android.R.color.transparent);

                    ImageView poleimage = (ImageView) findViewById(R.id.pole_image);
                    String whichone = String.valueOf(poleimage.getTag());

                    ImageView armsimage = (ImageView) findViewById(R.id.arms_image);
                    ImageView leftarmsimage = (ImageView) findViewById(R.id.left_arms_image);
                    armsimage.setImageResource(android.R.color.transparent);

                    String acc = parent.getItemAtPosition(position).toString();
                    if (acc.equals("Blade (Apollo only) - Silver")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_s);
                        accimage.setTag ("BLS-S");
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-SAR-10QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade Dual - Silver")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_s);
                        leftaccimage.setImageResource(R.drawable.bl_s);
                        accimage.setTag ("BLD-S");
                        Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-SAR-15QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade (Apollo only) - White")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_w);
                        accimage.setTag ("BLS-W");
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-WAR-15QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade Dual (Apollo only) - White")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_w);
                        leftaccimage.setImageResource(R.drawable.bl_w);
                        accimage.setTag ("BLD-W");
                        Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-WAR-15QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade (Apollo only) - Black")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_b);
                        accimage.setTag ("BLS-B");
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-BAR-15QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade Dual (Apollo only) - Black")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setImageResource(R.drawable.br_b);
                        leftaccimage.setImageResource(R.drawable.bl_b);
                        accimage.setTag ("BLD-B");
                        Toast toast = Toast.makeText(getApplicationContext(), "2 x MAKP2-BAR-15QB", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Traemate - Silver")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag("TR-S");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.mlap_s);
                        } else {
                            accimage.setImageResource(R.drawable.arlap_s);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-SAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Traemate - White")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("TR-W");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.mlap_w);
                        } else {
                            accimage.setImageResource(R.drawable.arlap_w);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-WAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Traemate - Black")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("TR-B");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.mlap_b);
                        } else {
                            accimage.setImageResource(R.drawable.arlap_b);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-BAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Tabmate - Silver")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("TA-S");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.tab_s);
                        } else {
                            accimage.setImageResource(R.drawable.taba_s);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-SAT-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Tabmate - White")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("TA-W");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.tab_w);
                        } else {
                            accimage.setImageResource(R.drawable.taba_w);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-WAT-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Tabmate - Black")) {
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("TA-B");
                        if (whichone.equals("A4-S") || whichone.equals("A4-W") || whichone.equals("A4-B")) {
                            accimage.setImageResource(R.drawable.tab_b);
                        } else {
                            accimage.setImageResource(R.drawable.taba_b);
                        }
                        Toast toast = Toast.makeText(getApplicationContext(), "PXTK1-SAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Traemate (Apollo only) - Silver")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTR-S");
                        accimage.setImageResource(R.drawable.mlap_s);
                        leftaccimage.setImageResource(R.drawable.bl_s);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-SAR-15QB + PXTK1-SAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Traemate (Apollo only) - White")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTR-W");
                        accimage.setImageResource(R.drawable.mlap_w);
                        leftaccimage.setImageResource(R.drawable.bl_w);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-WAR-15QB + PXTK1-WAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Traemate (Apollo only) - Black")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTR-B");
                        accimage.setImageResource(R.drawable.mlap_b);
                        leftaccimage.setImageResource(R.drawable.bl_b);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-BAR-15QB + PXTK1-BAS-02", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Tabmate (Apollo only) - Silver")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTA-S");
                        accimage.setImageResource(R.drawable.tab_s);
                        leftaccimage.setImageResource(R.drawable.bl_s);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-SAR-15QB + PXTK1-SAT-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Tabmate (Apollo only) - White")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTA-W");
                        accimage.setImageResource(R.drawable.tab_w);
                        leftaccimage.setImageResource(R.drawable.bl_w);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-WAR-15QB + PXTK1-WAT-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else if (acc.equals("Blade + Tabmate (Apollo only) - Black")) {
                        leftarmsimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("BLTA-B");
                        accimage.setImageResource(R.drawable.tab_b);
                        leftaccimage.setImageResource(R.drawable.bl_b);
                        Toast toast = Toast.makeText(getApplicationContext(), "MAKP2-BAR-15QB + PXTK1-BAT-00", Toast.LENGTH_LONG); toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,400); toast.show();;
                    } else {
                        accimage.setImageResource(android.R.color.transparent);
                        leftaccimage.setImageResource(android.R.color.transparent);
                        accimage.setTag ("No-acc");
                    }
                    productcode();
                }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    void productcode() {
        TextView PC = (TextView) findViewById(R.id.PC);

        ImageView clampimage = (ImageView) findViewById(R.id.clamp_image);
        String clamp = String.valueOf(clampimage.getTag());

        ImageView poleimage = (ImageView) findViewById(R.id.pole_image);
        String pole = String.valueOf(poleimage.getTag());

        ImageView armsimage = (ImageView) findViewById(R.id.arms_image);
        String arms = String.valueOf(armsimage.getTag());

        ImageView accimage = (ImageView) findViewById(R.id.acc_image);
        String acc = String.valueOf(accimage.getTag());


        //Apollo with laptop tray
        if (clamp.equals("SC-S") && pole.equals("A4-S") && arms.equals("A4D-S") && acc.equals("TR-S")) {
            PC.setText("Combined product code: QA4-4S2L2D");
        }
        else if (clamp.equals("SC-W") && pole.equals("A4-W") && arms.equals("A4D-W") && acc.equals("TR-W")) {
            PC.setText("Combined product code: QA4-4S2L2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("A4-B") && arms.equals("A4D-B") && acc.equals("TR-B")) {
            PC.setText("Combined product code: QA4-4S2L2D-B");
        }
        else if (clamp.equals("KG-S") && pole.equals("A4-S") && arms.equals("A4D-S") && acc.equals("TR-S")) {
            PC.setText("Combined product code: QA4-4S2L2KG");
        }
        else if (clamp.equals("KG-W") && pole.equals("A4-W") && arms.equals("A4D-W") && acc.equals("TR-W")) {
            PC.setText("Combined product code: QA4-4S2L2KG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("A4-B") && arms.equals("A4D-B") && acc.equals("TR-B")) {
            PC.setText("Combined product code: QA4-4S2L2KG-B");
        }
        //Ar-ray with laptop tray
        else if (clamp.equals("SC-B") && pole.equals("AR-S") && arms.equals("ARD-S") && acc.equals("TR-S")) {
            PC.setText("Combined product code: AR-4A2B2LD");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-W") && arms.equals("ARD-W") && acc.equals("TR-W")) {
            PC.setText("Combined product code: AR-4A2B2LD-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-B") && arms.equals("ARD-B") && acc.equals("TR-B")) {
            PC.setText("Combined product code: AR-4A2B2LD-B");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-S") && arms.equals("ARD-S") && acc.equals("TR-S")) {
            PC.setText("Combined product code: AR-4A2B2LKG");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-W") && arms.equals("ARD-W") && acc.equals("TR-W")) {
            PC.setText("Combined product code: AR-4A2B2LKG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-B") && arms.equals("ARD-B") && acc.equals("TR-B")) {
            PC.setText("Combined product code: AR-4A2B2LKG-B");
        }

        //Apollo4 single and dual blade with split clamp
        else if (clamp.equals("SC-S") && pole.equals("A4-S") && acc.equals("BLS-S")) {
            PC.setText("Combined product code: BQA4-4S2D");
        }
        else if (clamp.equals("SC-W") && pole.equals("A4-W") && acc.equals("BLS-W")) {
            PC.setText("Combined product code: BQA4-4S2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("A4-B") && acc.equals("BLS-B")) {
            PC.setText("Combined product code: BQA4-4S2D-B");
        }
        else if (clamp.equals("SC-S") && pole.equals("A4-S") && acc.equals("BLD-S")) {
            PC.setText("Combined product code: BQA4-4D2D");
        }
        else if (clamp.equals("SC-W") && pole.equals("A4-W") && acc.equals("BLD-W")) {
            PC.setText("Combined product code: BQA4-4D2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("A4-B") && acc.equals("BLD-B")) {
            PC.setText("Combined product code: BQA4-4D2D-B");
        }

        //Apollo4 single and dual with split clamp
        else if (clamp.equals("SC-S") && pole.equals("A4-S") && arms.equals("A4S-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2D");
        }
        else if (clamp.equals("SC-W") && pole.equals("A4-W") && arms.equals("A4S-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("A4-B") && arms.equals("A4S-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2D-B");
        }
        else if (clamp.equals("SC-S") && pole.equals("A4-S") && arms.equals("A4D-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2D");
        }
        else if (clamp.equals("SC-W") && pole.equals("A4-W") && arms.equals("A4D-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("A4-B") && arms.equals("A4D-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2D-B");
        }
        //Ar-ray single and dual with split clamp
        else if (clamp.equals("SC-B") && pole.equals("AR-S") && arms.equals("ARS-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2D");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-W") && arms.equals("ARS-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-B") && arms.equals("ARS-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2D-B");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-S") && arms.equals("ARD-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2D");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-W") && arms.equals("ARD-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2D-W");
        }
        else if (clamp.equals("SC-B") && pole.equals("AR-B") && arms.equals("ARD-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2D-B");
        }
        //Apollo4 single and dual with grommet clamp
        else if (clamp.equals("KG-S") && pole.equals("A4-S") && arms.equals("A4S-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2KG");
        }
        else if (clamp.equals("KG-W") && pole.equals("A4-W") && arms.equals("A4S-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2KG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("A4-B") && arms.equals("A4S-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4S2KG-B");
        }
        else if (clamp.equals("KG-S") && pole.equals("A4-S") && arms.equals("A4D-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2KG");
        }
        else if (clamp.equals("KG-W") && pole.equals("A4-W") && arms.equals("A4D-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2KG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("A4-B") && arms.equals("A4D-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: QA4-4D2KG-B");
        }
        //Ar-ray single and dual with grommet clamp
        else if (clamp.equals("KG-B") && pole.equals("AR-S") && arms.equals("ARS-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2KG");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-W") && arms.equals("ARS-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2KG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-B") && arms.equals("ARS-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2KG-B");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-S") && arms.equals("ARD-S") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2KG");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-W") && arms.equals("ARD-W") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2KG-W");
        }
        else if (clamp.equals("KG-B") && pole.equals("AR-B") && arms.equals("ARD-B") && acc.equals("No-acc")) {
            PC.setText("Combined product code: AR-4A2B2KG-B");
        }
        else {
            PC.setText("Combined product code will appear here with valid combinations. Note: Ar-ray always uses a black clamp");
        }
        //Apollo - Blade


    }
}


