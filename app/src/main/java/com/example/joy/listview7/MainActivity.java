package com.example.joy.listview7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private List<DataModel> list=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----initialize------------------
        listView=findViewById(R.id.list_view);

        //-----------------adding data to list-----------
        list.add(new DataModel("ASUS",R.mipmap.ic_launcher_round));
        list.add(new DataModel("HP",R.mipmap.ic_launcher_round));
        list.add(new DataModel("Samsung",R.mipmap.ic_launcher_round));
        list.add(new DataModel("Lenevo",R.mipmap.ic_launcher_round));
        list.add(new DataModel("Apple",R.mipmap.ic_launcher_round));
        list.add(new DataModel("Toshiba",R.mipmap.ic_launcher_round));
        list.add(new DataModel("Dell",R.mipmap.ic_launcher_round));



        //---------adapter---------------------
        final CustomAdapter adapter=new CustomAdapter(MainActivity.this,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,String.valueOf(i),Toast.LENGTH_LONG).show();


                DataModel dataModel= (DataModel) adapter.getItem(i);

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",dataModel.brand);
                intent.putExtra("des","JUST TEST");
                startActivity(intent);

            }
        });


    }
}
