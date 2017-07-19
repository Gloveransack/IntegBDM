package nz.co.modtec.integbdm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;


public class Mainmenu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ViewFlipper VF;

    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        VF = (ViewFlipper) findViewById(R.id.ViewFlipper01);

        final Button cataloguebutton = (Button) findViewById(R.id.catalogue_button);
        cataloguebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openCatalogue();
            }
        });

        final Button drawingsbutton = (Button) findViewById(R.id.drawings_button);
        drawingsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { openDrawings(); }
        });

        final Button ergonomicsbutton = (Button) findViewById(R.id.ergonomics_button);
        ergonomicsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openErgonomics();
            }
        });

        final Button alanhedgebutton = (Button) findViewById(R.id.alanhedge_button);
        alanhedgebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAlanHedge();
            }
        });

        final Button websitebutton = (Button) findViewById(R.id.website_button);
        websitebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openWebsite();
            }
        });

        final Button modularitybutton = (Button) findViewById(R.id.modularity_button);
        modularitybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openModularity();
            }
        });

        final Button missionbutton = (Button) findViewById(R.id.mission_button);
        missionbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMission();
            }
        });

        final Button productivitybutton = (Button) findViewById(R.id.productivity_button);
        productivitybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openProductivity();
            }
        });

        final Button warrantybutton = (Button) findViewById(R.id.warranty_button);
        warrantybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openWarranty();
            }
        });

        final Button refundbutton = (Button) findViewById(R.id.refund_button);
        refundbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openRefund();
            }
        });

        final Button mercuryspecsbutton = (Button) findViewById(R.id.mercuryspecs_button);
        mercuryspecsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMercuryspecs();
            }
        });

        final Button arrayspecsbutton = (Button) findViewById(R.id.arrayspecs_button);
        arrayspecsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openArrayspecs();
            }
        });

        final Button extrusionsbutton = (Button) findViewById(R.id.extrusions_button);
        extrusionsbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openExtrusions();
            }
        });

        final Button configuratorbutton = (Button) findViewById(R.id.configurator_button);
        configuratorbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Mainmenu.this, Configurator_spinner.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if (VF.getDisplayedChild() != 0) {
            VF.setDisplayedChild(0);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.home) {
            VF.setDisplayedChild(0);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.integ_brand) {

        } else if (id == R.id.integ_products) {
            openModularity();

        } else if (id == R.id.ergonomics) {
            openErgonomics();

        } else if (id == R.id.productivity) {

        } else if (id == R.id.workspacehw) {

        } else if (id == R.id.alan_hedge) {
            openAlanHedge();

        } else if (id == R.id.hr) {

        } else if (id == R.id.terms_of_trade) {

        } else if (id == R.id.website) {
            openWebsite();
        } else if (id == R.id.insurance) {

        } else if (id == R.id.contracts) {

        } else if (id == R.id.sales_expenses) {

        } else if (id == R.id.costings) {

        } else if (id == R.id.catalogue) {
            openCatalogue();
        } else if (id == R.id.drawings) {
            openDrawings();
        } else if (id == R.id.purchasing) {

        } else if (id == R.id.logistics) {

        } else if (id == R.id.inventory) {

        } else if (id == R.id.photos) {

        } else if (id == R.id.sales_professional) {

        } else if (id == R.id.sales_assessment) {

        }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void openCatalogue() {
        Intent intent = new Intent(Mainmenu.this, OpenPDF.class);
        intent.putExtra("requestedPDF","catalogue.pdf");
        startActivity(intent);
    }

    private void openMercuryspecs() {
        Intent intent = new Intent(Mainmenu.this, OpenPDF.class);
        intent.putExtra("requestedPDF","mercuryspecs.pdf");
        startActivity(intent);
    }

    private void openArrayspecs() {
        Intent intent = new Intent(Mainmenu.this, OpenPDF.class);
        intent.putExtra("requestedPDF","arrayspecs.pdf");
        startActivity(intent);
    }

    private void openDrawings (){
        Uri uri = Uri.parse("https://drive.google.com/drive/folders/0B-xPMBK6AjfXVjJ1X0w0YnptOWc?usp=sharing");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    private void openErgonomics() {
        WebView web = (WebView) findViewById(R.id.ergonomicspage);
        web.loadUrl("file:///android_asset/ergonomics.html");
        VF.setDisplayedChild(1);
    }

    private void openAlanHedge() {
        WebView web = (WebView) findViewById(R.id.alan_hedgepage);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.loadUrl("file:///android_asset/Alan-Hedge.html");
        VF.setDisplayedChild(2);
    }

    private void openModularity() {
        WebView web = (WebView) findViewById(R.id.modularitypage);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.loadUrl("file:///android_asset/Modularity.htm");
        VF.setDisplayedChild(3);
    }

    private void openWebsite() {
        Uri uri = Uri.parse("http://www.modtec.co.nz");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openMission() {
        WebView web = (WebView) findViewById(R.id.missionvisionvaluespage);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.loadUrl("file:///android_asset/MissionVisionValues.htm");
        VF.setDisplayedChild(4);
    }

    private void openProductivity() {
        WebView web = (WebView) findViewById(R.id.productivitypage);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        web.loadUrl("file:///android_asset/productivity_research.htm");
        VF.setDisplayedChild(5);
    }

    private void openWarranty() {
        TextView warranty = (TextView) findViewById(R.id.warrantypage);
        warranty.setText(R.string.warranty_text);
        VF.setDisplayedChild(6);
    }

    private void openRefund() {
        TextView refund = (TextView) findViewById(R.id.refundpage);
        refund.setText(R.string.refund_text);
        VF.setDisplayedChild(7);
    }

    private void openExtrusions() {
        Intent intent = new Intent(Mainmenu.this, ExtrusionListActivity.class);
        startActivity(intent);
    }

}

