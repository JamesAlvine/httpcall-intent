package com.example.myapplicationhttpcalls

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//

//        val queue = Volley.newRequestQueue(this)
//
//        val url ="https://mtekcdnstoragev2.blob.core.windows.net/admin/mcfish/students.json"
//
//        val stringRequest = StringRequest(
//            Request.Method.GET, url,
//            Response.Listener<String> { response ->
//
//                Log.i("RESPONSE", "The response is:$response")
//
//            },
//            Response.ErrorListener { Log.e("ERROR", "FEtch unsuccessful ", ) })
//1
//        queue.add(stringRequest)


//       GET HTTP Request:


//
//// prepare the Request
//
//// prepare the Request
//        val getRequest = JsonObjectRequest(
//            Request.Method.GET, url, null,
//            { response -> // display response on Success
//                Log.d("Response", response.toString())
//            }
//        ) { error -> Log.d("Error.Response", error.toString()) }
//
//// add it to the RequestQueue
//
//// add it to the RequestQueue
//        queue.add(getRequest)


//        explicit intent

        val Aboutbtn =findViewById<Button>( R.id.home_btn)
        Aboutbtn.setOnClickListener {
//            intentanilize intent

            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }



//
//        inlicit intent

        val urlinput = findViewById<EditText>( R.id.url_input)
        val url = urlinput.text.toString()

        val goButton = findViewById<Button>(R.id.go_btn)

        goButton.setOnClickListener {
            val implintent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("url")
            startActivity(implintent)
        }








    }






}