package com.example.yoanncorreia.localisationvelov;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        // jsonObject = client.getJsonObject();
        // Field f = (Field)jsonObject;

        // Toast.makeText(this.getBaseContext(),"JSON OBJECT = "+f.getName(),Toast.LENGTH_LONG);


    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        ConnectRest connectRest = new ConnectRest();
        connectRest.execute();



    }


    public class ConnectRest extends AsyncTask<Void, Integer, String> {

        //l'URL du serveur
        private static final String QUERY_URL = "https://download.data.grandlyon.com/ws/smartdata/jcd_jcdecaux.jcdvelov/all.json";
        private String reponse;

        // constructeur
        public ConnectRest() {
            super();
        }

        // avant execution
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(getApplicationContext(),"Début du traitement asynchrone "+QUERY_URL, Toast.LENGTH_LONG).show();
        }

        // en tache de fond
        @Override
        protected String doInBackground(Void... params) {

            RestClient client = new RestClient(QUERY_URL);
            try {
                client.Execute(RestClient.RequestMethod.GET);
            } catch (Exception e) {
                e.printStackTrace();
            }
            reponse = client.getResponse();
            return reponse;
        }

        // apres execution
        protected void onPostExecute(String result) {
            if(!result.equalsIgnoreCase("") && !result.equalsIgnoreCase("0")){
                Toast.makeText(getApplicationContext(),"CONNECT"+result.toString(), Toast.LENGTH_LONG).show();
                Log.i("christophe","res : "+result);
                JSONParser.getJSONFromUrl(result);

                if(!JSONParser.getFieldList().isEmpty()) {
                    ListViewAdapterPerso listViewAdapterPerso = new ListViewAdapterPerso(getBaseContext(), JSONParser.getFieldList());
                    listView.setAdapter(listViewAdapterPerso);

                }

            }
        }

        // fin de la classe ConnectRest
    }



}
