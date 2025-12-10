package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MultiDetector extends Detector<Object> {

    /* renamed from: c */
    public List f48646c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public MultiDetector f48647a = new MultiDetector();

        @RecentlyNonNull
        public Builder add(@RecentlyNonNull Detector<? extends Object> detector) {
            this.f48647a.f48646c.add(detector);
            return this;
        }

        @RecentlyNonNull
        public MultiDetector build() {
            if (this.f48647a.f48646c.size() != 0) {
                return this.f48647a;
            }
            throw new RuntimeException("No underlying detectors added to MultiDetector.");
        }
    }

    public MultiDetector() {
        this.f48646c = new ArrayList();
    }

    @Override // com.google.android.gms.vision.Detector
    @RecentlyNonNull
    public SparseArray<Object> detect(@RecentlyNonNull Frame frame) {
        SparseArray<Object> sparseArray = new SparseArray<>();
        for (Detector detector : this.f48646c) {
            SparseArray detect = detector.detect(frame);
            for (int i = 0; i < detect.size(); i++) {
                int keyAt = detect.keyAt(i);
                if (sparseArray.get(keyAt) == null) {
                    sparseArray.append(keyAt, detect.valueAt(i));
                } else {
                    StringBuilder sb = new StringBuilder(104);
                    sb.append("Detection ID overlap for id = ");
                    sb.append(keyAt);
                    sb.append("  This means that one of the detectors is not using global IDs.");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.Detector
    public boolean isOperational() {
        for (Detector detector : this.f48646c) {
            if (!detector.isOperational()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.vision.Detector
    public void receiveFrame(@RecentlyNonNull Frame frame) {
        for (Detector detector : this.f48646c) {
            detector.receiveFrame(frame);
        }
    }

    @Override // com.google.android.gms.vision.Detector
    public void release() {
        for (Detector detector : this.f48646c) {
            detector.release();
        }
        this.f48646c.clear();
    }

    @Override // com.google.android.gms.vision.Detector
    public void setProcessor(@RecentlyNonNull Detector.Processor<Object> processor) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }
}
