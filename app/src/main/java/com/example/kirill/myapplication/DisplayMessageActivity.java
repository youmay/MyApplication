package com.example.kirill.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
//import java.util.Random;

public class DisplayMessageActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Вывесит сообщение
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);


        // Get a string resource from your app's Resources
        //String hello = getResources().getString(R.string.hello_world);
        // Or supply a string resource to a method that requires a string
        /*
        TextView textView2 = new TextView(this);
        textView2.setText(R.string.hello_world);

        layout.addView(textView2);
        */

        final int rnd = Random.rnd(1, 10);

        String itog = rnd + "/10: ";


        switch (rnd) {
            case 1:
                itog += "Бескосячный элемент";
                break;

            case 2:
                itog += R.string.kosyak_1;
                break;


            case 3:
                itog += "Этот субъект совершил недавно косяк третьего уровня сложности";
                break;

            case 4:
                itog = "3.4/10: в программе произошел косяк в 3.4 балла. Попробуйте еще раз!";
                break;

            case 5:
                itog = "3/10: косяк третьего уровня сложности совершен";
                break;

            case 9:
                itog += "Осторожно! Перед вами девятибальный косякодел!";
                break;

            case 10:
                itog += "Осторожно! Перед вами десятибальный косяк!";
                break;


            default:
                itog += "Все очень, очень плохо";
                break;
        }


        TextView textView3 = new TextView(this);
        textView3.setText(itog);

        layout.addView(textView3);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("DisplayMessage Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
