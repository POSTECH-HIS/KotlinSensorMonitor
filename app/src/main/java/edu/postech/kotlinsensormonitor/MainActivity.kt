package edu.postech.kotlinsensormonitor

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /*
    private SensorManager mSensorManager;
    private Sensor mAccel;
    private boolean mSensing = false;
    private SensorEventListener mSensorEventListener;
    private HandlerThread mWorkerThread;
    private Handler mHandlerWorker;
     */

    // Guide: use val, var, lateinit keywords

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mAccel         = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mWorkerThread = new HandlerThread("Worker Thread");
        mWorkerThread.start();
        mHandlerWorker = new Handler(mWorkerThread.getLooper());

        ((Button)findViewById(R.id.buttonStartStop)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mSensing = !mSensing;
                if (mSensing){
                    startSensing();
                    ((Button)findViewById(R.id.buttonStartStop)).setText("Stop");
                }else{
                    stopSensing();
                    ((Button)findViewById(R.id.buttonStartStop)).setText("Start");
                }
            }
        });
         */

        // Guide: if a field has a getter and setter, it becomes a var property
        // Guide: pass a lambda expression instead of OnClickListener()

    }

    fun startSensing() {
        /*
        mSensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                    long ts = event.timestamp;
                    float[] values = event.values.clone();
                    Log.d("", Thread.currentThread().getName());

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            ((TextView)findViewById(R.id.valueAccelX)).setText(String.format("%.3f", values[0]));
                            ((TextView)findViewById(R.id.valueAccelY)).setText(String.format("%.3f", values[1]));
                            ((TextView)findViewById(R.id.valueAccelZ)).setText(String.format("%.3f", values[2]));
                        }
                    });
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                return;
            }
        };
        mSensorManager.registerListener(mSensorEventListener, mAccel, 10000, mHandlerWorker);
        */

        // Guide: use object expression; create an anonymous object and inherit from (or implement) SensorEventListener
        // Guide: pass a lambda expression instead of Runnable()

    }

    fun stopSensing() {
        /*
        mSensorManager.unregisterListener(mSensorEventListener, mAccel);
         */

    }
}
