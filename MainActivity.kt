package com.example.postapidataview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "CheckResult", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val register=findViewById<Button>(R.id.Register)
        val buttons=findViewById<Button>(R.id.login)
        register.setOnClickListener {
            startActivity(Intent(this,SingUpFrom::class.java))
        }

        val emailid=findViewById<EditText>(R.id.loginemail)
      val pass=findViewById<EditText>(R.id.loginpassword)


        buttons.setOnClickListener {
            val datas = hashMapOf(
                "email" to emailid.text.toString(),
                "password" to pass.text.toString()
            )
            UserInterFace.create().postUsersLong(datas)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{result->
                    Toast.makeText(this@MainActivity, result.user.username, Toast.LENGTH_SHORT).show()
                }
        }
    }
}