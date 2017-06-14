package nz.co.modtec.integbdm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import android.widget.GridView;
import android.widget.ViewFlipper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

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
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        CopyReadAssets();

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
            public void onClick(View v) {
                openDrawings();
            }
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

        final Button configuratorbutton = (Button) findViewById(R.id.configurator_button);
        configuratorbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Mainmenu.this, Configurator.class);
                startActivity(intent);
            }
        });

    }

    private void CopyReadAssets()
    {
        AssetManager assetManager = getAssets();

        InputStream in = null;
        OutputStream out = null;
        File file = new File(getFilesDir(), "catalogue.pdf");
        try
        {
            in = assetManager.open("catalogue.pdf");
            out = openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

            copyFile(in, out);
            in.close();
            in = null;
            out.flush();
            out.close();
            out = null;
        } catch (Exception e)
        {
            Log.e("tag", e.getMessage());
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
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

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
       // }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.integ_brand) {

        } else if (id == R.id.integ_products) {
            openModularity();

        } else if (id == R.id.ergonomics) {
            openErgonomics();
            /*final Intent intent = new Intent(Intent.ACTION_MAIN, null);

            intent.addCategory(Intent.CATEGORY_LAUNCHER);

            final ComponentName cn = new ComponentName("com.android.settings", "com.android.settings.fuelgauge.PowerUsageSummary");

            intent.setComponent(cn);

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity( intent);*/

        } else if (id == R.id.productivity) {

        } else if (id == R.id.workspacehw) {
            Intent intent = new Intent(this, Configurator.class);
            startActivity(intent);

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
            ArrayList<Bitmap> list = new ArrayList<>();
            try{
                String[] PathFiles = getAssets().list("Photos");
                for (int i = 0; i < PathFiles.length; i++) {
                    InputStream is = getAssets().open("Photos/" + PathFiles[i]);
                    Bitmap bitmap = BitmapFactory.decodeStream(is);
                    list.add(i, bitmap);
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            GridView gridview = (GridView) findViewById(R.id.photogallerygv);
            gridview.setAdapter(new ImageAdapter(this, list));

            VF.setDisplayedChild(3);

            //Intent intent = new Intent(this, Photo_gallery.class);
           // startActivity(intent);

        } else if (id == R.id.sales_professional) {

        } else if (id == R.id.sales_assessment) {

        }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1)
        {
            out.write(buffer, 0, read);
        }
    }

    private void openCatalogue() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse("file://" + getFilesDir() + "/catalogue.pdf"), "application/pdf");
        startActivity(intent);
    }

    private void openDrawings (){
        Uri uri = Uri.parse("https://drive.google.com/drive/folders/0B-xPMBK6AjfXVjJ1X0w0YnptOWc?usp=sharing");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
;
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
        VF.setDisplayedChild(4);
    }

    private void openWebsite() {
        Uri uri = Uri.parse("http://www.modtec.co.nz");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
