package com.example.exampledemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.exampledemo2.databinding.ActivityMainBinding
import com.thingclips.smart.android.user.api.ILoginCallback
import com.thingclips.smart.android.user.bean.User
import com.thingclips.smart.home.sdk.ThingHomeSdk

class MainActivity : AppCompatActivity() {
    private  lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val countryCode = binding.etCountrycode.text.toString()
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            ThingHomeSdk.getUserInstance().loginWithEmail(/* countryCode = */ countryCode,/* email = */
                email,/* passwd = */
                password,/* callback = */
                object  : ILoginCallback{
                    override fun onSuccess(user: User?) {
                        Toast.makeText(this@MainActivity,"Logged success",Toast.LENGTH_LONG).show()
                    }

                    override fun onError(code: String?, error: String?) {
                        Toast.makeText(this@MainActivity,"code: " + code + "error: " + error, Toast.LENGTH_LONG).show()
                    }

                })
        }

    }
}