package com.example.android.lunchbuddyhackuci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.ProfileTracker;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

public class MainActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private ProfileTracker profileTrack;
    private Profile currentProfile;
    private String userFirstName;
    private String userLastName;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
        if (callbackManager.onActivityResult(requestCode, resultCode, data)) {
            return;
        }
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callbackManager = CallbackManager.Factory.create();


        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        if (Profile.getCurrentProfile() == null)
                        {
                            profileTrack = new ProfileTracker(){
                            @Override
                            public void onCurrentProfileChanged(Profile oldProfile, Profile currentProfile){
                                userLastName = currentProfile.getLastName();
                                Log.v("facebook - profile", currentProfile.getFirstName());
                                Log.v("facebook - profile",currentProfile.getLastName());
                                profileTrack.stopTracking();
                                }
                            };
                        }
                        else
                        {
                            currentProfile = Profile.getCurrentProfile();
                            userFirstName = currentProfile.getFirstName();
                            userLastName = currentProfile.getLastName();
                            System.out.println(userFirstName + " " + userLastName);
                        }

                        setContentView(R.layout.map_ui);
                    }

                    @Override
                    public void onCancel() {
                        Log.v("facebook - onCancel", "cancelled");
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        Log.v("facebook - onError", exception.getMessage());
                    }
                });
    }


}
