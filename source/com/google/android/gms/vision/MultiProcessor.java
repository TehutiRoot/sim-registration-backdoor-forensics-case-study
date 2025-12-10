package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class MultiProcessor<T> implements Detector.Processor<T> {

    /* renamed from: a */
    public Factory f48648a;

    /* renamed from: b */
    public SparseArray f48649b;

    /* renamed from: c */
    public int f48650c;

    /* loaded from: classes4.dex */
    public static class Builder<T> {

        /* renamed from: a */
        public MultiProcessor f48651a;

        public Builder(@RecentlyNonNull Factory<T> factory) {
            MultiProcessor multiProcessor = new MultiProcessor();
            this.f48651a = multiProcessor;
            if (factory != null) {
                multiProcessor.f48648a = factory;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        @RecentlyNonNull
        public MultiProcessor<T> build() {
            return this.f48651a;
        }

        @RecentlyNonNull
        public Builder<T> setMaxGapFrames(int i) {
            if (i >= 0) {
                this.f48651a.f48650c = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(28);
            sb.append("Invalid max gap: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* loaded from: classes4.dex */
    public interface Factory<T> {
        @RecentlyNonNull
        Tracker<T> create(@RecentlyNonNull T t);
    }

    /* renamed from: com.google.android.gms.vision.MultiProcessor$a */
    /* loaded from: classes4.dex */
    public class C6780a {

        /* renamed from: a */
        public Tracker f48652a;

        /* renamed from: b */
        public int f48653b;

        public C6780a(MultiProcessor multiProcessor) {
            this.f48653b = 0;
        }

        /* renamed from: d */
        public static /* synthetic */ int m45997d(C6780a c6780a) {
            int i = c6780a.f48653b;
            c6780a.f48653b = i + 1;
            return i;
        }
    }

    public MultiProcessor() {
        this.f48649b = new SparseArray();
        this.f48650c = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(@RecentlyNonNull Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int keyAt = detectedItems.keyAt(i);
            T valueAt = detectedItems.valueAt(i);
            if (this.f48649b.get(keyAt) == null) {
                C6780a c6780a = new C6780a();
                c6780a.f48652a = this.f48648a.create(valueAt);
                c6780a.f48652a.onNewItem(keyAt, valueAt);
                this.f48649b.append(keyAt, c6780a);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet<Integer> hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f48649b.size(); i2++) {
            int keyAt2 = this.f48649b.keyAt(i2);
            if (detectedItems2.get(keyAt2) == null) {
                C6780a c6780a2 = (C6780a) this.f48649b.valueAt(i2);
                C6780a.m45997d(c6780a2);
                if (c6780a2.f48653b >= this.f48650c) {
                    c6780a2.f48652a.onDone();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    c6780a2.f48652a.onMissing(detections);
                }
            }
        }
        for (Integer num : hashSet) {
            this.f48649b.delete(num.intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i3 = 0; i3 < detectedItems3.size(); i3++) {
            int keyAt3 = detectedItems3.keyAt(i3);
            T valueAt2 = detectedItems3.valueAt(i3);
            C6780a c6780a3 = (C6780a) this.f48649b.get(keyAt3);
            c6780a3.f48653b = 0;
            c6780a3.f48652a.onUpdate(detections, valueAt2);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i = 0; i < this.f48649b.size(); i++) {
            ((C6780a) this.f48649b.valueAt(i)).f48652a.onDone();
        }
        this.f48649b.clear();
    }
}
