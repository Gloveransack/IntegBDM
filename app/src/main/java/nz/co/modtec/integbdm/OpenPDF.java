package nz.co.modtec.integbdm;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class OpenPDF extends Activity {
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        Intent whichpdf = getIntent();
        String PDF = whichpdf.getStringExtra("requestedPDF");

        startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(FileProvider.CONTENT_URI
                        + PDF)));
        finish();
    }
}