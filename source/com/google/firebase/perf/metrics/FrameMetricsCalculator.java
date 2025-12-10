package com.google.firebase.perf.metrics;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class FrameMetricsCalculator {

    /* loaded from: classes4.dex */
    public static class PerfFrameMetrics {

        /* renamed from: a */
        public int f56177a;

        /* renamed from: b */
        public int f56178b;

        /* renamed from: c */
        public int f56179c;

        public PerfFrameMetrics(int i, int i2, int i3) {
            this.f56177a = i;
            this.f56178b = i2;
            this.f56179c = i3;
        }

        public PerfFrameMetrics deltaFrameMetricsFromSnapshot(PerfFrameMetrics perfFrameMetrics) {
            return new PerfFrameMetrics(this.f56177a - perfFrameMetrics.getTotalFrames(), this.f56178b - perfFrameMetrics.getSlowFrames(), this.f56179c - perfFrameMetrics.getFrozenFrames());
        }

        public int getFrozenFrames() {
            return this.f56179c;
        }

        public int getSlowFrames() {
            return this.f56178b;
        }

        public int getTotalFrames() {
            return this.f56177a;
        }
    }

    @NonNull
    public static PerfFrameMetrics calculateFrameMetrics(@Nullable SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                }
                if (keyAt > 16) {
                    i += valueAt;
                }
                i3++;
            }
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        return new PerfFrameMetrics(i3, i, i2);
    }
}
