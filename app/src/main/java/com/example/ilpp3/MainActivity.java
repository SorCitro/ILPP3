package com.example.ilpp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/*
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animaciones
        Animation anim1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        //Crear relaciones
        TextView tV_ILP= findViewById(R.id.tV_ILP);
        TextView tV_prote= findViewById(R.id.tV_prote);
        ImageView iV_portada= findViewById(R.id.iV_portada);


        tV_ILP.setAnimation(anim2);
        tV_prote.setAnimation(anim2);
        iV_portada.setAnimation(anim1);

      /*  new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){

                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(MainActivity.this);
                if(user !=null && account != null)

                {
                    Intent intent = new Intent(MainActivity.this, UserActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 4000);*/
    }
}
