package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class FrameMetricsAggregator {
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;

    /* renamed from: a */
    public final C3821b f33538a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface MetricType {
    }

    /* renamed from: androidx.core.app.FrameMetricsAggregator$a */
    /* loaded from: classes2.dex */
    public static class C3819a extends C3821b {

        /* renamed from: e */
        public static HandlerThread f33539e;

        /* renamed from: f */
        public static Handler f33540f;

        /* renamed from: a */
        public int f33541a;

        /* renamed from: b */
        public SparseIntArray[] f33542b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList f33543c = new ArrayList();

        /* renamed from: d */
        public Window.OnFrameMetricsAvailableListener f33544d = new Window$OnFrameMetricsAvailableListenerC3820a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a */
        /* loaded from: classes2.dex */
        public class Window$OnFrameMetricsAvailableListenerC3820a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC3820a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C3819a c3819a = C3819a.this;
                if ((c3819a.f33541a & 1) != 0) {
                    c3819a.m57877f(c3819a.f33542b[0], frameMetrics.getMetric(8));
                }
                C3819a c3819a2 = C3819a.this;
                if ((c3819a2.f33541a & 2) != 0) {
                    c3819a2.m57877f(c3819a2.f33542b[1], frameMetrics.getMetric(1));
                }
                C3819a c3819a3 = C3819a.this;
                if ((c3819a3.f33541a & 4) != 0) {
                    c3819a3.m57877f(c3819a3.f33542b[2], frameMetrics.getMetric(3));
                }
                C3819a c3819a4 = C3819a.this;
                if ((c3819a4.f33541a & 8) != 0) {
                    c3819a4.m57877f(c3819a4.f33542b[3], frameMetrics.getMetric(4));
                }
                C3819a c3819a5 = C3819a.this;
                if ((c3819a5.f33541a & 16) != 0) {
                    c3819a5.m57877f(c3819a5.f33542b[4], frameMetrics.getMetric(5));
                }
                C3819a c3819a6 = C3819a.this;
                if ((c3819a6.f33541a & 64) != 0) {
                    c3819a6.m57877f(c3819a6.f33542b[6], frameMetrics.getMetric(7));
                }
                C3819a c3819a7 = C3819a.this;
                if ((c3819a7.f33541a & 32) != 0) {
                    c3819a7.m57877f(c3819a7.f33542b[5], frameMetrics.getMetric(6));
                }
                C3819a c3819a8 = C3819a.this;
                if ((c3819a8.f33541a & 128) != 0) {
                    c3819a8.m57877f(c3819a8.f33542b[7], frameMetrics.getMetric(0));
                }
                C3819a c3819a9 = C3819a.this;
                if ((c3819a9.f33541a & 256) != 0) {
                    c3819a9.m57877f(c3819a9.f33542b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C3819a(int i) {
            this.f33541a = i;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3821b
        /* renamed from: a */
        public void mo57876a(Activity activity) {
            if (f33539e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f33539e = handlerThread;
                handlerThread.start();
                f33540f = new Handler(f33539e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f33542b;
                if (sparseIntArrayArr[i] == null && (this.f33541a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f33544d, f33540f);
            this.f33543c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3821b
        /* renamed from: b */
        public SparseIntArray[] mo57875b() {
            return this.f33542b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3821b
        /* renamed from: c */
        public SparseIntArray[] mo57874c(Activity activity) {
            Iterator it = this.f33543c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f33543c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f33544d);
            return this.f33542b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3821b
        /* renamed from: d */
        public SparseIntArray[] mo57873d() {
            SparseIntArray[] sparseIntArrayArr = this.f33542b;
            this.f33542b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3821b
        /* renamed from: e */
        public SparseIntArray[] mo57872e() {
            for (int size = this.f33543c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f33543c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f33544d);
                    this.f33543c.remove(size);
                }
            }
            return this.f33542b;
        }

        /* renamed from: f */
        public void m57877f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.FrameMetricsAggregator$b */
    /* loaded from: classes2.dex */
    public static class C3821b {
        /* renamed from: a */
        public void mo57876a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo57875b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo57874c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo57873d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo57872e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void add(@NonNull Activity activity) {
        this.f33538a.mo57876a(activity);
    }

    @Nullable
    public SparseIntArray[] getMetrics() {
        return this.f33538a.mo57875b();
    }

    @Nullable
    public SparseIntArray[] remove(@NonNull Activity activity) {
        return this.f33538a.mo57874c(activity);
    }

    @Nullable
    public SparseIntArray[] reset() {
        return this.f33538a.mo57873d();
    }

    @Nullable
    public SparseIntArray[] stop() {
        return this.f33538a.mo57872e();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f33538a = new C3819a(i);
        } else {
            this.f33538a = new C3821b();
        }
    }
}