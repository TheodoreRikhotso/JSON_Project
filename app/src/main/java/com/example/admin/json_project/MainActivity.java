package com.example.admin.json_project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin,btnSign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.tools);
        toolbar.setTitle("Sliding Root");
        setSupportActionBar(toolbar);

//        new SlidingRootNavBuilder(this)
//                .withToolbarMenuToggle(toolbar)
//                .withMenuOpened(false)
//                .withMenuLayout(R.layout.menus)
//        .inject();

        Login f = new Login();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.fragment_placeholder,f);
        transaction.commit();



    }
    public void onSelectedFragment(View view)
    {

        btnLogin =(Button)findViewById(R.id.btnLogin) ;
        btnSign =(Button)findViewById(R.id.btnSign) ;

        Fragment newFragment;
        if(view == findViewById(R.id.btnSign)){

            overridePendingTransition(R.anim.slide_out_right,R.anim.slide_left);
            newFragment =  new Sign_in();

        }else if(view == findViewById(R.id.btnLogin)){

         overridePendingTransition(R.anim.slide_n_right,R.anim.slide_out_left);
            newFragment =  new Login();



        }else {
            newFragment =  new Login();

        }


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_placeholder,newFragment);
        // transaction.addToBackStack(null);
        transaction.commit();
    }
//    public void veiwAll(View view)
//    {
//        Resources res =getResources();
//        InputStream is =res.openRawResource(R.raw.student);
//
//        Scanner scanner = new Scanner(is);
//
//        StringBuilder builder = new StringBuilder();
//
//        while (scanner.hasNextLine()) {
//            builder.append(scanner.nextLine());
//        }
//        parseJson(builder.toString());
//    }
//
//    private void parseJson(String s)
//    {
//        TextView tvDisplay=(TextView)findViewById(R.id.tvDisplay);
//        StringBuilder builder = new StringBuilder();
//        try {
//            JSONObject root = new JSONObject(s);
//            JSONObject student = root.getJSONObject("student-grades");
//            builder.append("Name:  ").append(student.getString("name")).append("\n");
//            builder.append("full-time:  ").append(student.getString("full-time")).append("\n");
//
//            JSONArray courses =student.getJSONArray("courses");
//            for(int i=0;i<courses.length();i++)
//            {
//                JSONObject course = courses.getJSONObject(i);
//                builder.append(course.getString("name"))
//                        .append(": ")
//                        .append(course.getString("grade"))
//                        .append("\n");
//            }
//
//        }catch (JSONException e)
//        {
//            e.printStackTrace();
//        }
//        tvDisplay.setText(builder.toString());
//    }
}
