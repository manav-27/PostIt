package com.example.postit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.auth.api.identity.BeginSignInRequest

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        //290840913341-au3cofiqv2rtqmucre2rueh3mgsb9p2a.apps.googleusercontent.com ID
        string client = 290840913341-au3cofiqv2rtqmucre2rueh3mgsb9p2a.apps.googleusercontent.com
        val signInRequest = BeginSignInRequest.builder()
        .setGoogleIdTokenRequestOptions(
            BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                .setSupported(true)
                // Your server's client ID, not your Android client ID.

                .setServerClientId(getString(R.string.))
                // Only show accounts previously used to sign in.
                .setFilterByAuthorizedAccounts(true)
                .build())
        .build()
    }
}