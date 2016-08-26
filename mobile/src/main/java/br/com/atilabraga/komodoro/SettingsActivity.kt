package br.com.atilabraga.komodoro

import android.os.Bundle

class SettingsActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    override fun getContentView() : Int {
        return R.layout.activity_settings
    }

}
