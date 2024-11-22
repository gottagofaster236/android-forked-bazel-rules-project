package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.provider.MediaStore

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    // Should not be red because of android_min_sdk in the project view
    MediaStore.getExternalVolumeNames(this)
  }
}
