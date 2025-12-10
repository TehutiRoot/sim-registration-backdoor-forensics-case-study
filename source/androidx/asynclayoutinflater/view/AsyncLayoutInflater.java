package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class AsyncLayoutInflater {

    /* renamed from: a */
    public LayoutInflater f10093a;

    /* renamed from: d */
    public Handler.Callback f10096d = new C2285a();

    /* renamed from: b */
    public Handler f10094b = new Handler(this.f10096d);

    /* renamed from: c */
    public C2288d f10095c = C2288d.m64074b();

    /* loaded from: classes.dex */
    public interface OnInflateFinishedListener {
        void onInflateFinished(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$a */
    /* loaded from: classes.dex */
    public class C2285a implements Handler.Callback {
        public C2285a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C2287c c2287c = (C2287c) message.obj;
            if (c2287c.f10102d == null) {
                c2287c.f10102d = AsyncLayoutInflater.this.f10093a.inflate(c2287c.f10101c, c2287c.f10100b, false);
            }
            c2287c.f10103e.onInflateFinished(c2287c.f10102d, c2287c.f10101c, c2287c.f10100b);
            AsyncLayoutInflater.this.f10095c.m64072d(c2287c);
            return true;
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$b */
    /* loaded from: classes.dex */
    public static class C2286b extends LayoutInflater {

        /* renamed from: a */
        public static final String[] f10098a = {"android.widget.", "android.webkit.", "android.app."};

        public C2286b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C2286b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            for (String str2 : f10098a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$c */
    /* loaded from: classes.dex */
    public static class C2287c {

        /* renamed from: a */
        public AsyncLayoutInflater f10099a;

        /* renamed from: b */
        public ViewGroup f10100b;

        /* renamed from: c */
        public int f10101c;

        /* renamed from: d */
        public View f10102d;

        /* renamed from: e */
        public OnInflateFinishedListener f10103e;
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$d */
    /* loaded from: classes.dex */
    public static class C2288d extends Thread {

        /* renamed from: c */
        public static final C2288d f10104c;

        /* renamed from: a */
        public ArrayBlockingQueue f10105a = new ArrayBlockingQueue(10);

        /* renamed from: b */
        public Pools.SynchronizedPool f10106b = new Pools.SynchronizedPool(10);

        static {
            C2288d c2288d = new C2288d();
            f10104c = c2288d;
            c2288d.start();
        }

        /* renamed from: b */
        public static C2288d m64074b() {
            return f10104c;
        }

        /* renamed from: a */
        public void m64075a(C2287c c2287c) {
            try {
                this.f10105a.put(c2287c);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: c */
        public C2287c m64073c() {
            C2287c c2287c = (C2287c) this.f10106b.acquire();
            if (c2287c == null) {
                return new C2287c();
            }
            return c2287c;
        }

        /* renamed from: d */
        public void m64072d(C2287c c2287c) {
            c2287c.f10103e = null;
            c2287c.f10099a = null;
            c2287c.f10100b = null;
            c2287c.f10101c = 0;
            c2287c.f10102d = null;
            this.f10106b.release(c2287c);
        }

        /* renamed from: f */
        public void m64071f() {
            try {
                C2287c c2287c = (C2287c) this.f10105a.take();
                try {
                    c2287c.f10102d = c2287c.f10099a.f10093a.inflate(c2287c.f10101c, c2287c.f10100b, false);
                } catch (RuntimeException e) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(c2287c.f10099a.f10094b, 0, c2287c).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w("AsyncLayoutInflater", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m64071f();
            }
        }
    }

    public AsyncLayoutInflater(@NonNull Context context) {
        this.f10093a = new C2286b(context);
    }

    @UiThread
    public void inflate(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull OnInflateFinishedListener onInflateFinishedListener) {
        if (onInflateFinishedListener != null) {
            C2287c m64073c = this.f10095c.m64073c();
            m64073c.f10099a = this;
            m64073c.f10101c = i;
            m64073c.f10100b = viewGroup;
            m64073c.f10103e = onInflateFinishedListener;
            this.f10095c.m64075a(m64073c);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
