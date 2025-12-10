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
    public int f59083a = 13;

    /* renamed from: b */
    public final C9804c f59084b = new C9804c();

    /* renamed from: c */
    public final Listener f59085c;

    /* renamed from: d */
    public SensorManager f59086d;

    /* renamed from: e */
    public Sensor f59087e;

    /* loaded from: classes5.dex */
    public interface Listener {
        void hearShake();
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$a */
    /* loaded from: classes5.dex */
    public static class C9802a {

        /* renamed from: a */
        public long f59088a;

        /* renamed from: b */
        public boolean f59089b;

        /* renamed from: c */
        public C9802a f59090c;
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$b */
    /* loaded from: classes5.dex */
    public static class C9803b {

        /* renamed from: a */
        public C9802a f59091a;

        /* renamed from: a */
        public C9802a m33202a() {
            C9802a c9802a = this.f59091a;
            if (c9802a == null) {
                return new C9802a();
            }
            this.f59091a = c9802a.f59090c;
            return c9802a;
        }

        /* renamed from: b */
        public void m33201b(C9802a c9802a) {
            c9802a.f59090c = this.f59091a;
            this.f59091a = c9802a;
        }
    }

    /* renamed from: com.squareup.seismic.ShakeDetector$c */
    /* loaded from: classes5.dex */
    public static class C9804c {

        /* renamed from: a */
        public final C9803b f59092a = new C9803b();

        /* renamed from: b */
        public C9802a f59093b;

        /* renamed from: c */
        public C9802a f59094c;

        /* renamed from: d */
        public int f59095d;

        /* renamed from: e */
        public int f59096e;

        /* renamed from: a */
        public void m33200a(long j, boolean z) {
            m33197d(j - 500000000);
            C9802a m33202a = this.f59092a.m33202a();
            m33202a.f59088a = j;
            m33202a.f59089b = z;
            m33202a.f59090c = null;
            C9802a c9802a = this.f59094c;
            if (c9802a != null) {
                c9802a.f59090c = m33202a;
            }
            this.f59094c = m33202a;
            if (this.f59093b == null) {
                this.f59093b = m33202a;
            }
            this.f59095d++;
            if (z) {
                this.f59096e++;
            }
        }

        /* renamed from: b */
        public void m33199b() {
            while (true) {
                C9802a c9802a = this.f59093b;
                if (c9802a != null) {
                    this.f59093b = c9802a.f59090c;
                    this.f59092a.m33201b(c9802a);
                } else {
                    this.f59094c = null;
                    this.f59095d = 0;
                    this.f59096e = 0;
                    return;
                }
            }
        }

        /* renamed from: c */
        public boolean m33198c() {
            C9802a c9802a;
            C9802a c9802a2 = this.f59094c;
            if (c9802a2 != null && (c9802a = this.f59093b) != null && c9802a2.f59088a - c9802a.f59088a >= 250000000) {
                int i = this.f59096e;
                int i2 = this.f59095d;
                if (i >= (i2 >> 1) + (i2 >> 2)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m33197d(long j) {
            C9802a c9802a;
            while (true) {
                int i = this.f59095d;
                if (i >= 4 && (c9802a = this.f59093b) != null && j - c9802a.f59088a > 0) {
                    if (c9802a.f59089b) {
                        this.f59096e--;
                    }
                    this.f59095d = i - 1;
                    C9802a c9802a2 = c9802a.f59090c;
                    this.f59093b = c9802a2;
                    if (c9802a2 == null) {
                        this.f59094c = null;
                    }
                    this.f59092a.m33201b(c9802a);
                } else {
                    return;
                }
            }
        }
    }

    public ShakeDetector(Listener listener) {
        this.f59085c = listener;
    }

    /* renamed from: a */
    public final boolean m33203a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        int i = this.f59083a;
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
        boolean m33203a = m33203a(sensorEvent);
        this.f59084b.m33200a(sensorEvent.timestamp, m33203a);
        if (this.f59084b.m33198c()) {
            this.f59084b.m33199b();
            this.f59085c.hearShake();
        }
    }

    public void setSensitivity(int i) {
        this.f59083a = i;
    }

    public boolean start(SensorManager sensorManager) {
        if (this.f59087e != null) {
            return true;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.f59087e = defaultSensor;
        if (defaultSensor != null) {
            this.f59086d = sensorManager;
            sensorManager.registerListener(this, defaultSensor, 0);
        }
        if (this.f59087e != null) {
            return true;
        }
        return false;
    }

    public void stop() {
        Sensor sensor = this.f59087e;
        if (sensor != null) {
            this.f59086d.unregisterListener(this, sensor);
            this.f59086d = null;
            this.f59087e = null;
        }
    }
}