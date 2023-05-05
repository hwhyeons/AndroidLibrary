커스텀 다이얼로그




xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="250dp"
    android:layout_height="200dp"
    android:layout_gravity="center"
    android:gravity="center"
    android:weightSum="3"
    android:background="#FFFFFF"
    android:orientation="vertical">

    <TextView
        android:layout_weight="2"
        android:id="@+id/dialog_text"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:gravity="center"
        android:textSize="20dp"
        android:textColor="#000000"
        android:text="커스텀 다이얼로그" />

    <Button
        android:layout_weight="1"
        android:id="@+id/dialog_btn"
        android:layout_width="match_parent"
        android:layout_marginLeft="50dp"
        android:layout_marginRight="50dp"
        android:layout_height="0dp"
        android:text="확인" />
</LinearLayout>
```

CustomDialogGUI.java
파일 추가 후에 실행하고자 하는 위치에서
```java
CustomDialogGUI t = new CustomDialogGUI(현재액티비티.this);
t.startCustomDialog();
```


