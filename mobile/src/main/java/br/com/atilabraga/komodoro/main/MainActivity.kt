package br.com.atilabraga.komodoro.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.atilabraga.komodoro.R

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
