package br.com.atilabraga.komodoro.settings

import android.os.Bundle
import br.com.atilabraga.komodoro.BaseActivity
import br.com.atilabraga.komodoro.R

class SettingsActivity : BaseActivity(), SettingsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    override fun getContentView() : Int {
        return R.layout.activity_settings
    }

}
