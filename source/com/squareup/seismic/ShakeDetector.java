package com.squareup.seismic;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes5.dex */
public class ShakeDetector implements SensorEventListener {
    public static final int SENSITIVITY_HARD = 15;
    public static final int SENSITIVITY_LIGHT = 11;
    public static final int SENSITIVITY_MEDIUM = 13;

    /* renamed from: a */
    public int f59071a = 13;

    /* renamed from: b */
    public final C9815c f59072b = new C9815c();

    /* renamed from: c */
    public final Listener f59073c;

    /* renamed from: d */
    public SensorManager f59074d;

    /* renamed from: e */
    public Sensor f59075e;

    /* loaded from: classes5.dex */
    public interface Listener {
        void hearShake();
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$a */
    /* loaded from: classes5.dex */
    public static class C9813a {

        /* renamed from: a */
        public long f59076a;

        /* renamed from: b */
        public boolean f59077b;

        /* renamed from: c */
        public C9813a f59078c;
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$b */
    /* loaded from: classes5.dex */
    public static class C9814b {

        /* renamed from: a */
        public C9813a f59079a;

        /* renamed from: a */
        public C9813a m33210a() {
            C9813a c9813a = this.f59079a;
            if (c9813a == null) {
                return new C9813a();
            }
            this.f59079a = c9813a.f59078c;
            return c9813a;
        }

        /* renamed from: b */
        public void m33209b(C9813a c9813a) {
            c9813a.f59078c = this.f59079a;
            this.f59079a = c9813a;
        }
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$c */
    /* loaded from: classes5.dex */
    public static class C9815c {

        /* renamed from: a */
        public final C9814b f59080a = new C9814b();

        /* renamed from: b */
        public C9813a f59081b;

        /* renamed from: c */
        public C9813a f59082c;

        /* renamed from: d */
        public int f59083d;

        /* renamed from: e */
        public int f59084e;

        /* renamed from: a */
        public void m33208a(long j, boolean z) {
            m33205d(j - 500000000);
            C9813a m33210a = this.f59080a.m33210a();
            m33210a.f59076a = j;
            m33210a.f59077b = z;
            m33210a.f59078c = null;
            C9813a c9813a = this.f59082c;
            if (c9813a != null) {
                c9813a.f59078c = m33210a;
            }
            this.f59082c = m33210a;
            if (this.f59081b == null) {
                this.f59081b = m33210a;
            }
            this.f59083d++;
            if (z) {
                this.f59084e++;
            }
        }

        /* renamed from: b */
        public void m33207b() {
            while (true) {
                C9813a c9813a = this.f59081b;
                if (c9813a != null) {
                    this.f59081b = c9813a.f59078c;
                    this.f59080a.m33209b(c9813a);
                } else {
                    this.f59082c = null;
                    this.f59083d = 0;
                    this.f59084e = 0;
                    return;
                }
            }
        }

        /* renamed from: c */
        public boolean m33206c() {
            C9813a c9813a;
            C9813a c9813a2 = this.f59082c;
            if (c9813a2 != null && (c9813a = this.f59081b) != null && c9813a2.f59076a - c9813a.f59076a >= 250000000) {
                int i = this.f59084e;
                int i2 = this.f59083d;
                if (i >= (i2 >> 1) + (i2 >> 2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m33205d(long j) {
            C9813a c9813a;
            while (true) {
                int i = this.f59083d;
                if (i >= 4 && (c9813a = this.f59081b) != null && j - c9813a.f59076a > 0) {
                    if (c9813a.f59077b) {
                        this.f59084e--;
                    }
                    this.f59083d = i - 1;
                    C9813a c9813a2 = c9813a.f59078c;
                    this.f59081b = c9813a2;
                    if (c9813a2 == null) {
                        this.f59082c = null;
                    }
                    this.f59080a.m33209b(c9813a);
                } else {
                    return;
                }
            }
        }
    }

    public ShakeDetector(Listener listener) {
        this.f59073c = listener;
    }

    /* renamed from: a */
    public final boolean m33211a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        int i = this.f59071a;
        if ((f * f) + (f2 * f2) + (f3 * f3) <= i * i) {
            return false;
        }
        return true;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean m33211a = m33211a(sensorEvent);
        this.f59072b.m33208a(sensorEvent.timestamp, m33211a);
        if (this.f59072b.m33206c()) {
            this.f59072b.m33207b();
            this.f59073c.hearShake();
        }
    }

    public void setSensitivity(int i) {
        this.f59071a = i;
    }

    public boolean start(SensorManager sensorManager) {
        if (this.f59075e != null) {
            return true;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f59075e = defaultSensor;
        if (defaultSensor != null) {
            this.f59074d = sensorManager;
            sensorManager.registerListener(this, defaultSensor, 0);
        }
        if (this.f59075e != null) {
            return true;
        }
        return false;
    }

    public void stop() {
        Sensor sensor = this.f59075e;
        if (sensor != null) {
            this.f59074d.unregisterListener(this, sensor);
            this.f59074d = null;
            this.f59075e = null;
        }
    }
}
