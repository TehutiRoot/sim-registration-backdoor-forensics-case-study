package com.mixpanel.android.viewcrawler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.mixpanel.android.util.MPLog;

/* loaded from: classes5.dex */
public class FlipGesture implements SensorEventListener {

    /* renamed from: a */
    public int f58784a = -1;

    /* renamed from: b */
    public int f58785b = 0;

    /* renamed from: c */
    public long f58786c = -1;

    /* renamed from: d */
    public final float[] f58787d = new float[3];

    /* renamed from: e */
    public final OnFlipGestureListener f58788e;

    /* loaded from: classes5.dex */
    public interface OnFlipGestureListener {
        void onFlipGesture();
    }

    public FlipGesture(OnFlipGestureListener onFlipGestureListener) {
        this.f58788e = onFlipGestureListener;
    }

    /* renamed from: a */
    public final float[] m33425a(float[] fArr) {
        for (int i = 0; i < 3; i++) {
            float[] fArr2 = this.f58787d;
            float f = fArr2[i];
            fArr2[i] = f + ((fArr[i] - f) * 0.7f);
        }
        return this.f58787d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] m33425a = m33425a(sensorEvent.values);
        int i = this.f58785b;
        float f = m33425a[0];
        float f2 = m33425a[1];
        float f3 = m33425a[2];
        float f4 = (f * f) + (f2 * f2) + (f3 * f3);
        this.f58785b = 0;
        if (f3 > 7.8f && f3 < 11.8f) {
            this.f58785b = -1;
        }
        if (f3 < -7.8f && f3 > -11.8f) {
            this.f58785b = 1;
        }
        if (f4 < 60.840004f || f4 > 139.24f) {
            this.f58785b = 0;
        }
        int i2 = this.f58785b;
        if (i != i2) {
            this.f58786c = sensorEvent.timestamp;
        }
        long j = sensorEvent.timestamp - this.f58786c;
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 == 1 && j > 250000000 && this.f58784a == 0) {
                    MPLog.m33445v("MixpanelAPI.FlipGesture", "Flip gesture begun");
                    this.f58784a = 1;
                }
            } else if (j > 1000000000 && this.f58784a != 0) {
                MPLog.m33445v("MixpanelAPI.FlipGesture", "Flip gesture abandoned");
                this.f58784a = 0;
            }
        } else if (j > 250000000 && this.f58784a == 1) {
            MPLog.m33445v("MixpanelAPI.FlipGesture", "Flip gesture completed");
            this.f58784a = 0;
            this.f58788e.onFlipGesture();
        }
    }
}