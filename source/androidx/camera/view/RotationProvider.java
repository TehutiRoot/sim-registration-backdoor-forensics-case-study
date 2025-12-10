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
    public final OrientationEventListener f12181b;

    /* renamed from: a */
    public final Object f12180a = new Object();

    /* renamed from: c */
    public final Map f12182c = new HashMap();

    /* renamed from: d */
    public boolean f12183d = false;

    /* loaded from: classes.dex */
    public interface Listener {
        void onRotationChanged(int i);
    }

    /* renamed from: androidx.camera.view.RotationProvider$a */
    /* loaded from: classes.dex */
    public class C2692a extends OrientationEventListener {

        /* renamed from: a */
        public int f12184a;

        public C2692a(Context context) {
            super(context);
            this.f12184a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int m61868a;
            ArrayList<C2693b> arrayList;
            if (i != -1 && this.f12184a != (m61868a = RotationProvider.m61868a(i))) {
                this.f12184a = m61868a;
                synchronized (RotationProvider.this.f12180a) {
                    arrayList = new ArrayList(RotationProvider.this.f12182c.values());
                }
                if (!arrayList.isEmpty()) {
                    for (C2693b c2693b : arrayList) {
                        c2693b.m61864d(m61868a);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.camera.view.RotationProvider$b */
    /* loaded from: classes.dex */
    public static class C2693b {

        /* renamed from: a */
        public final Listener f12186a;

        /* renamed from: b */
        public final Executor f12187b;

        /* renamed from: c */
        public final AtomicBoolean f12188c = new AtomicBoolean(true);

        public C2693b(Listener listener, Executor executor) {
            this.f12186a = listener;
            this.f12187b = executor;
        }

        /* renamed from: b */
        public void m61866b() {
            this.f12188c.set(false);
        }

        /* renamed from: c */
        public final /* synthetic */ void m61865c(int i) {
            if (this.f12188c.get()) {
                this.f12186a.onRotationChanged(i);
            }
        }

        /* renamed from: d */
        public void m61864d(final int i) {
            this.f12187b.execute(new Runnable() { // from class: Cy1
                @Override // java.lang.Runnable
                public final void run() {
                    RotationProvider.C2693b.this.m61865c(i);
                }
            });
        }
    }

    public RotationProvider(@NonNull Context context) {
        this.f12181b = new C2692a(context);
    }

    /* renamed from: a */
    public static int m61868a(int i) {
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
        synchronized (this.f12180a) {
            try {
                if (!this.f12181b.canDetectOrientation() && !this.f12183d) {
                    return false;
                }
                this.f12182c.put(listener, new C2693b(listener, executor));
                this.f12181b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeListener(@NonNull Listener listener) {
        synchronized (this.f12180a) {
            try {
                C2693b c2693b = (C2693b) this.f12182c.get(listener);
                if (c2693b != null) {
                    c2693b.m61866b();
                    this.f12182c.remove(listener);
                }
                if (this.f12182c.isEmpty()) {
                    this.f12181b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
