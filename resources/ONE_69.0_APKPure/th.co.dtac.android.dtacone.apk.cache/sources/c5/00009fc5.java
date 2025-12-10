package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Detector;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class MultiProcessor<T> implements Detector.Processor<T> {

    /* renamed from: a */
    public Factory f48660a;

    /* renamed from: b */
    public SparseArray f48661b;

    /* renamed from: c */
    public int f48662c;

    /* loaded from: classes4.dex */
    public static class Builder<T> {

        /* renamed from: a */
        public MultiProcessor f48663a;

        public Builder(@RecentlyNonNull Factory<T> factory) {
            MultiProcessor multiProcessor = new MultiProcessor();
            this.f48663a = multiProcessor;
            if (factory != null) {
                multiProcessor.f48660a = factory;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        @RecentlyNonNull
        public MultiProcessor<T> build() {
            return this.f48663a;
        }

        @RecentlyNonNull
        public Builder<T> setMaxGapFrames(int i) {
            if (i >= 0) {
                this.f48663a.f48662c = i;
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
    public class C6769a {

        /* renamed from: a */
        public Tracker f48664a;

        /* renamed from: b */
        public int f48665b;

        public C6769a(MultiProcessor multiProcessor) {
            this.f48665b = 0;
        }

        /* renamed from: d */
        public static /* synthetic */ int m45982d(C6769a c6769a) {
            int i = c6769a.f48665b;
            c6769a.f48665b = i + 1;
            return i;
        }
    }

    public MultiProcessor() {
        this.f48661b = new SparseArray();
        this.f48662c = 3;
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void receiveDetections(@RecentlyNonNull Detector.Detections<T> detections) {
        SparseArray<T> detectedItems = detections.getDetectedItems();
        for (int i = 0; i < detectedItems.size(); i++) {
            int keyAt = detectedItems.keyAt(i);
            T valueAt = detectedItems.valueAt(i);
            if (this.f48661b.get(keyAt) == null) {
                C6769a c6769a = new C6769a();
                c6769a.f48664a = this.f48660a.create(valueAt);
                c6769a.f48664a.onNewItem(keyAt, valueAt);
                this.f48661b.append(keyAt, c6769a);
            }
        }
        SparseArray<T> detectedItems2 = detections.getDetectedItems();
        HashSet<Integer> hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f48661b.size(); i2++) {
            int keyAt2 = this.f48661b.keyAt(i2);
            if (detectedItems2.get(keyAt2) == null) {
                C6769a c6769a2 = (C6769a) this.f48661b.valueAt(i2);
                C6769a.m45982d(c6769a2);
                if (c6769a2.f48665b >= this.f48662c) {
                    c6769a2.f48664a.onDone();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    c6769a2.f48664a.onMissing(detections);
                }
            }
        }
        for (Integer num : hashSet) {
            this.f48661b.delete(num.intValue());
        }
        SparseArray<T> detectedItems3 = detections.getDetectedItems();
        for (int i3 = 0; i3 < detectedItems3.size(); i3++) {
            int keyAt3 = detectedItems3.keyAt(i3);
            T valueAt2 = detectedItems3.valueAt(i3);
            C6769a c6769a3 = (C6769a) this.f48661b.get(keyAt3);
            c6769a3.f48665b = 0;
            c6769a3.f48664a.onUpdate(detections, valueAt2);
        }
    }

    @Override // com.google.android.gms.vision.Detector.Processor
    public void release() {
        for (int i = 0; i < this.f48661b.size(); i++) {
            ((C6769a) this.f48661b.valueAt(i)).f48664a.onDone();
        }
        this.f48661b.clear();
    }
}