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
    public final C3839b f33450a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public @interface MetricType {
    }

    /* renamed from: androidx.core.app.FrameMetricsAggregator$a */
    /* loaded from: classes2.dex */
    public static class C3837a extends C3839b {

        /* renamed from: e */
        public static HandlerThread f33451e;

        /* renamed from: f */
        public static Handler f33452f;

        /* renamed from: a */
        public int f33453a;

        /* renamed from: b */
        public SparseIntArray[] f33454b = new SparseIntArray[9];

        /* renamed from: c */
        public final ArrayList f33455c = new ArrayList();

        /* renamed from: d */
        public Window.OnFrameMetricsAvailableListener f33456d = new Window$OnFrameMetricsAvailableListenerC3838a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a */
        /* loaded from: classes2.dex */
        public class Window$OnFrameMetricsAvailableListenerC3838a implements Window.OnFrameMetricsAvailableListener {
            public Window$OnFrameMetricsAvailableListenerC3838a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C3837a c3837a = C3837a.this;
                if ((c3837a.f33453a & 1) != 0) {
                    c3837a.m57927f(c3837a.f33454b[0], frameMetrics.getMetric(8));
                }
                C3837a c3837a2 = C3837a.this;
                if ((c3837a2.f33453a & 2) != 0) {
                    c3837a2.m57927f(c3837a2.f33454b[1], frameMetrics.getMetric(1));
                }
                C3837a c3837a3 = C3837a.this;
                if ((c3837a3.f33453a & 4) != 0) {
                    c3837a3.m57927f(c3837a3.f33454b[2], frameMetrics.getMetric(3));
                }
                C3837a c3837a4 = C3837a.this;
                if ((c3837a4.f33453a & 8) != 0) {
                    c3837a4.m57927f(c3837a4.f33454b[3], frameMetrics.getMetric(4));
                }
                C3837a c3837a5 = C3837a.this;
                if ((c3837a5.f33453a & 16) != 0) {
                    c3837a5.m57927f(c3837a5.f33454b[4], frameMetrics.getMetric(5));
                }
                C3837a c3837a6 = C3837a.this;
                if ((c3837a6.f33453a & 64) != 0) {
                    c3837a6.m57927f(c3837a6.f33454b[6], frameMetrics.getMetric(7));
                }
                C3837a c3837a7 = C3837a.this;
                if ((c3837a7.f33453a & 32) != 0) {
                    c3837a7.m57927f(c3837a7.f33454b[5], frameMetrics.getMetric(6));
                }
                C3837a c3837a8 = C3837a.this;
                if ((c3837a8.f33453a & 128) != 0) {
                    c3837a8.m57927f(c3837a8.f33454b[7], frameMetrics.getMetric(0));
                }
                C3837a c3837a9 = C3837a.this;
                if ((c3837a9.f33453a & 256) != 0) {
                    c3837a9.m57927f(c3837a9.f33454b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public C3837a(int i) {
            this.f33453a = i;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3839b
        /* renamed from: a */
        public void mo57926a(Activity activity) {
            if (f33451e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f33451e = handlerThread;
                handlerThread.start();
                f33452f = new Handler(f33451e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f33454b;
                if (sparseIntArrayArr[i] == null && (this.f33453a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f33456d, f33452f);
            this.f33455c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3839b
        /* renamed from: b */
        public SparseIntArray[] mo57925b() {
            return this.f33454b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3839b
        /* renamed from: c */
        public SparseIntArray[] mo57924c(Activity activity) {
            Iterator it = this.f33455c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f33455c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f33456d);
            return this.f33454b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3839b
        /* renamed from: d */
        public SparseIntArray[] mo57923d() {
            SparseIntArray[] sparseIntArrayArr = this.f33454b;
            this.f33454b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C3839b
        /* renamed from: e */
        public SparseIntArray[] mo57922e() {
            for (int size = this.f33455c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f33455c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f33456d);
                    this.f33455c.remove(size);
                }
            }
            return this.f33454b;
        }

        /* renamed from: f */
        public void m57927f(SparseIntArray sparseIntArray, long j) {
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
    public static class C3839b {
        /* renamed from: a */
        public void mo57926a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo57925b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo57924c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo57923d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo57922e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void add(@NonNull Activity activity) {
        this.f33450a.mo57926a(activity);
    }

    @Nullable
    public SparseIntArray[] getMetrics() {
        return this.f33450a.mo57925b();
    }

    @Nullable
    public SparseIntArray[] remove(@NonNull Activity activity) {
        return this.f33450a.mo57924c(activity);
    }

    @Nullable
    public SparseIntArray[] reset() {
        return this.f33450a.mo57923d();
    }

    @Nullable
    public SparseIntArray[] stop() {
        return this.f33450a.mo57922e();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f33450a = new C3837a(i);
        } else {
            this.f33450a = new C3839b();
        }
    }
}
