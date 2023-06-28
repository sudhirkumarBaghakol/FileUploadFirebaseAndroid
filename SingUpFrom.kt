package com.example.postapidataview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SingUpFrom : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up_from)

        val username=findViewById<EditText>(R.id.name2)
        val email=findViewById<EditText>(R.id.email2)
        val password=findViewById<EditText>(R.id.password2)
        var button=findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val data =Userdata(username.text.toString(), email.text.toString(), password.text.toString())
            UserInterFace.create().postUsersDetails(data)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { result ->
                    Toast.makeText(this, result.user.username, Toast.LENGTH_SHORT).show()
                }
        }
    }
}