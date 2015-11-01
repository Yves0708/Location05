package net.cloud95.android.lession.location05;

import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class Location05Activity extends Activity {

    private LocationManager locationManager;
    private MyLocationListener myLocationListener;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 設定在狀態列可以顯示處理中圖示
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.info);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 執行註冊，設備是GPS，只會讀取一次位置資訊
        // 顯示處理中圖示
    }

    @Override
    protected void onPause() {
        // 移除LocationListener
        super.onPause();
    }

    private class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            // 關閉處理中圖示
        }

        @Override
        public void onProviderDisabled(String provider) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onStatusChanged(String provider, int status, 
                Bundle extras) {

        }

    }
}
