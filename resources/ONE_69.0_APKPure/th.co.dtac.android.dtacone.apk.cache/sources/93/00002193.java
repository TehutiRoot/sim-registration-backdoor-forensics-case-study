package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.view.RotationProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class RotationProvider {

    /* renamed from: b */
    public final OrientationEventListener f12269b;

    /* renamed from: a */
    public final Object f12268a = new Object();

    /* renamed from: c */
    public final Map f12270c = new HashMap();

    /* renamed from: d */
    public boolean f12271d = false;

    /* loaded from: classes.dex */
    public interface Listener {
        void onRotationChanged(int i);
    }

    /* renamed from: androidx.camera.view.RotationProvider$a */
    /* loaded from: classes.dex */
    public class C2674a extends OrientationEventListener {

        /* renamed from: a */
        public int f12272a;

        public C2674a(Context context) {
            super(context);
            this.f12272a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int m61816a;
            ArrayList<C2675b> arrayList;
            if (i != -1 && this.f12272a != (m61816a = RotationProvider.m61816a(i))) {
                this.f12272a = m61816a;
                synchronized (RotationProvider.this.f12268a) {
                    arrayList = new ArrayList(RotationProvider.this.f12270c.values());
                }
                if (!arrayList.isEmpty()) {
                    for (C2675b c2675b : arrayList) {
                        c2675b.m61812d(m61816a);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.camera.view.RotationProvider$b */
    /* loaded from: classes.dex */
    public static class C2675b {

        /* renamed from: a */
        public final Listener f12274a;

        /* renamed from: b */
        public final Executor f12275b;

        /* renamed from: c */
        public final AtomicBoolean f12276c = new AtomicBoolean(true);

        public C2675b(Listener listener, Executor executor) {
            this.f12274a = listener;
            this.f12275b = executor;
        }

        /* renamed from: b */
        public void m61814b() {
            this.f12276c.set(false);
        }

        /* renamed from: c */
        public final /* synthetic */ void m61813c(int i) {
            if (this.f12276c.get()) {
                this.f12274a.onRotationChanged(i);
            }
        }

        /* renamed from: d */
        public void m61812d(final int i) {
            this.f12275b.execute(new Runnable() { // from class: zz1
                @Override // java.lang.Runnable
                public final void run() {
                    RotationProvider.C2675b.this.m61813c(i);
                }
            });
        }
    }

    public RotationProvider(@NonNull Context context) {
        this.f12269b = new C2674a(context);
    }

    /* renamed from: a */
    public static int m61816a(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    @CheckResult
    public boolean addListener(@NonNull Executor executor, @NonNull Listener listener) {
        synchronized (this.f12268a) {
            try {
                if (!this.f12269b.canDetectOrientation() && !this.f12271d) {
                    return false;
                }
                this.f12270c.put(listener, new C2675b(listener, executor));
                this.f12269b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeListener(@NonNull Listener listener) {
        synchronized (this.f12268a) {
            try {
                C2675b c2675b = (C2675b) this.f12270c.get(listener);
                if (c2675b != null) {
                    c2675b.m61814b();
                    this.f12270c.remove(listener);
                }
                if (this.f12270c.isEmpty()) {
                    this.f12269b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}