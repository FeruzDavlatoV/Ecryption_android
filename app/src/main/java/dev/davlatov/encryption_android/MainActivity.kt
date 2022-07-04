package dev.davlatov.encryption_android

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import dev.davlatov.encryption_android.Symmetric.decrypt
import dev.davlatov.encryption_android.Symmetric.encrypt

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initViews() {
        testSymmetric()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun testSymmetric(){
        // secret text
        val originalString = "PDP Academy"

        // Encryption
        val encryptedString = encrypt(originalString)

        // Decryption
        val decryptedString = decrypt(encryptedString)
        
        // Printing originalString,encryptedString,decryptedString
        Log.d("@@@", "Original String:$originalString")
        Log.d("@@@", "Encrypted value:$encryptedString")
        Log.d("@@@", "Decrypted value:$decryptedString")
    }

    
    
}