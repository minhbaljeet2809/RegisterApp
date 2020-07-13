package com.example.registerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_dialog.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // button onClick to show dialog

        mainLoginBtn.setOnClickListener{
            // Inflate the dialog with custom view
            val mdialogView = LayoutInflater.from(this).inflate(R.layout.login_dialog, null);
            // AlertDiaLogBuilder
            val mBuilder = AlertDialog.Builder( this)
                .setView(mdialogView)
            // show dialog
            val mAlertDiaLog = mBuilder.show()
            // login button click of custom layout
            mdialogView.dialogRegister.setOnClickListener{
                mAlertDiaLog.dismiss()
            }
            mdialogView.diaLogCancel.setOnClickListener{
                mAlertDiaLog.dismiss()
            }
        }
    }
}