package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector;

/* loaded from: classes4.dex */
public abstract class FocusingProcessor<T> implements Detector.Processor<T> {

    /* renamed from: a */
    public Detector f48628a;

    /* renamed from: b */
    public Tracker f48629b;

    /* renamed from: e */
    public int f48632e;

    /* renamed from: c */
    public int f48630c = 3;

    /* renamed from: d */
    public boolean f48631d = false;

    /* renamed from: f */
    public int f48633f = 0;

    public FocusingProcessor(@RecentlyNonNull Detector<T> detector, @RecentlyNonNull Tracker<T> tracker) {
        this.f48628a = detector;
        this.f48629b = tracker;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(@RecentlyNonNull Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        if (detectedItems.size() == 0) {
            if (this.f48633f == this.f48630c) {
                this.f48629b.onDone();
                this.f48631d = false;
            } else {
                this.f48629b.onMissing(detections);
            }
            this.f48633f++;
            return;
        }
        this.f48633f = 0;
        if (this.f48631d) {
            T t = detectedItems.get(this.f48632e);
            if (t != null) {
                this.f48629b.onUpdate(detections, t);
                return;
            } else {
                this.f48629b.onDone();
                this.f48631d = false;
            }
        }
        int selectFocus = selectFocus(detections);
        T t2 = detectedItems.get(selectFocus);
        if (t2 == null) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Invalid focus selected: ");
            sb.append(selectFocus);
            Log.w("FocusingProcessor", sb.toString());
            return;
        }
        this.f48631d = true;
        this.f48632e = selectFocus;
        this.f48628a.setFocus(selectFocus);
        this.f48629b.onNewItem(this.f48632e, t2);
        this.f48629b.onUpdate(detections, t2);
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        this.f48629b.onDone();
    }

    public abstract int selectFocus(@RecentlyNonNull Detector.Detections<T> detections);

    public final void zza(int i) {
        if (i >= 0) {
            this.f48630c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("Invalid max gap: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
