package com.google.android.gms.vision;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.Frame;

/* loaded from: classes4.dex */
public abstract class Detector<T> {

    /* renamed from: a */
    public final Object f48623a = new Object();

    /* renamed from: b */
    public Processor f48624b;

    /* loaded from: classes4.dex */
    public static class Detections<T> {

        /* renamed from: a */
        public final SparseArray f48625a;

        /* renamed from: b */
        public final Frame.Metadata f48626b;

        /* renamed from: c */
        public final boolean f48627c;

        public Detections(@RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull Frame.Metadata metadata, boolean z) {
            this.f48625a = sparseArray;
            this.f48626b = metadata;
            this.f48627c = z;
        }

        public boolean detectorIsOperational() {
            return this.f48627c;
        }

        @RecentlyNonNull
        public SparseArray<T> getDetectedItems() {
            return this.f48625a;
        }

        @RecentlyNonNull
        public Frame.Metadata getFrameMetadata() {
            return this.f48626b;
        }
    }

    /* loaded from: classes4.dex */
    public interface Processor<T> {
        void receiveDetections(@RecentlyNonNull Detections<T> detections);

        void release();
    }

    @RecentlyNonNull
    public abstract SparseArray<T> detect(@RecentlyNonNull Frame frame);

    public boolean isOperational() {
        return true;
    }

    public void receiveFrame(@RecentlyNonNull Frame frame) {
        Frame.Metadata metadata = new Frame.Metadata(frame.getMetadata());
        metadata.zza();
        Detections<T> detections = new Detections<>(detect(frame), metadata, isOperational());
        synchronized (this.f48623a) {
            try {
                Processor processor = this.f48624b;
                if (processor != null) {
                    processor.receiveDetections(detections);
                } else {
                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void release() {
        synchronized (this.f48623a) {
            try {
                Processor processor = this.f48624b;
                if (processor != null) {
                    processor.release();
                    this.f48624b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean setFocus(int i) {
        return true;
    }

    public void setProcessor(@RecentlyNonNull Processor<T> processor) {
        synchronized (this.f48623a) {
            try {
                Processor processor2 = this.f48624b;
                if (processor2 != null) {
                    processor2.release();
                }
                this.f48624b = processor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
