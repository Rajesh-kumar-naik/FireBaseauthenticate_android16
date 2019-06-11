package com.example.iteradmin.firebase_authenticate_android16

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Profile_Activity : AppCompatActivity() {
    private lateinit var mAuth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_)
        val text=findViewById<TextView>(R.id.text3)
        val Log_Out=findViewById<Button>(R.id.signo)
        mAuth = FirebaseAuth.getInstance()

        val user:FirebaseUser ?= mAuth.currentUser
        if (user != null){
            text.text=user.uid
        }
        Log_Out.setOnClickListener{
            mAuth.signOut()
            finish()
        }
    }
}
