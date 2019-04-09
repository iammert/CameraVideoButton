# CameraVideoButton
Instagram like animated button for taking photo or recording video.

<img src="https://raw.githubusercontent.com/iammert/CameraVideoButton/master/art/art.png"/>

[Watch!](https://www.youtube.com/watch?v=4zmgleq5dCw)

## Usage

PS. This is just a dummy view. All recording or taking picture operation is up to you.

```xml
<com.iammert.library.cameravideobuttonlib.CameraVideoButton
    android:id="@+id/button"
    android:layout_width="120dp"
    android:layout_height="120dp"
    app:cvb_recording_color="#D438A2"/>
```

Customize it!

```kotlin
videoRecordButton.setVideoDuration(10000)
videoRecordButton.enableVideoRecording(true)
videoRecordButton.enablePhotoTaking(true)
```

Observe!
```kotlin
videoRecordButton.actionListener = object : CameraVideoButton.ActionListener{
    override fun onStartRecord() {
        Log.v("TEST", "Start recording video")
    }

    override fun onEndRecord() {
        Log.v("TEST", "Stop recording video")
    }

    override fun onDurationTooShortError() {
        Log.v("TEST", "Toast or notify user")
    }

    override fun onSingleTap() {
        Log.v("TEST", "Take photo here")
    }
}
```

## Setup
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    implementation 'com.github.iammert:CameraVideoButton:0.2'
}
```

### Used Apps
<a href="https://kunduz.com/"><img src="https://kunduz.com/wp-content/uploads/2018/12/icon-512x512.png" width="72" height="72"/></a>

License
--------


    Copyright 2019 Mert Şimşek

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


