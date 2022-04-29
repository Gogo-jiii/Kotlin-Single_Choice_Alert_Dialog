package com.example.singlechoicealertdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class SingleChoiceDialog(private val _context: Context, private val data: Array<String>) :

    DialogFragment() {
    private var builder: AlertDialog.Builder? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        builder = AlertDialog.Builder(_context)
        builder!!.setTitle("Single Choice Alert Dialog")
        builder!!.setSingleChoiceItems(data, 0) { dialogInterface, i ->
            Toast.makeText(
                context,
                "Selected: " + data[i],
                Toast.LENGTH_LONG
            ).show()
        }
        builder!!.setPositiveButton("OK") { dialogInterface, i ->
            dialogInterface.dismiss()
            Toast.makeText(context, "Dismissed.", Toast.LENGTH_LONG).show()
        }
        builder!!.setNegativeButton("CANCEL") { dialogInterface, i ->
            dialogInterface.dismiss()
            Toast.makeText(context, "Cancelled.", Toast.LENGTH_LONG).show()
        }
        return builder!!.create()
    }
}