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
    public LayoutInflater f10181a;

    /* renamed from: d */
    public Handler.Callback f10184d = new C2267a();

    /* renamed from: b */
    public Handler f10182b = new Handler(this.f10184d);

    /* renamed from: c */
    public C2270d f10183c = C2270d.m64025b();

    /* loaded from: classes.dex */
    public interface OnInflateFinishedListener {
        void onInflateFinished(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$a */
    /* loaded from: classes.dex */
    public class C2267a implements Handler.Callback {
        public C2267a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C2269c c2269c = (C2269c) message.obj;
            if (c2269c.f10190d == null) {
                c2269c.f10190d = AsyncLayoutInflater.this.f10181a.inflate(c2269c.f10189c, c2269c.f10188b, false);
            }
            c2269c.f10191e.onInflateFinished(c2269c.f10190d, c2269c.f10189c, c2269c.f10188b);
            AsyncLayoutInflater.this.f10183c.m64023d(c2269c);
            return true;
        }
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$b */
    /* loaded from: classes.dex */
    public static class C2268b extends LayoutInflater {

        /* renamed from: a */
        public static final String[] f10186a = {"android.widget.", "android.webkit.", "android.app."};

        public C2268b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C2268b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            for (String str2 : f10186a) {
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
    public static class C2269c {

        /* renamed from: a */
        public AsyncLayoutInflater f10187a;

        /* renamed from: b */
        public ViewGroup f10188b;

        /* renamed from: c */
        public int f10189c;

        /* renamed from: d */
        public View f10190d;

        /* renamed from: e */
        public OnInflateFinishedListener f10191e;
    }

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$d */
    /* loaded from: classes.dex */
    public static class C2270d extends Thread {

        /* renamed from: c */
        public static final C2270d f10192c;

        /* renamed from: a */
        public ArrayBlockingQueue f10193a = new ArrayBlockingQueue(10);

        /* renamed from: b */
        public Pools.SynchronizedPool f10194b = new Pools.SynchronizedPool(10);

        static {
            C2270d c2270d = new C2270d();
            f10192c = c2270d;
            c2270d.start();
        }

        /* renamed from: b */
        public static C2270d m64025b() {
            return f10192c;
        }

        /* renamed from: a */
        public void m64026a(C2269c c2269c) {
            try {
                this.f10193a.put(c2269c);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: c */
        public C2269c m64024c() {
            C2269c c2269c = (C2269c) this.f10194b.acquire();
            if (c2269c == null) {
                return new C2269c();
            }
            return c2269c;
        }

        /* renamed from: d */
        public void m64023d(C2269c c2269c) {
            c2269c.f10191e = null;
            c2269c.f10187a = null;
            c2269c.f10188b = null;
            c2269c.f10189c = 0;
            c2269c.f10190d = null;
            this.f10194b.release(c2269c);
        }

        /* renamed from: f */
        public void m64022f() {
            try {
                C2269c c2269c = (C2269c) this.f10193a.take();
                try {
                    c2269c.f10190d = c2269c.f10187a.f10181a.inflate(c2269c.f10189c, c2269c.f10188b, false);
                } catch (RuntimeException e) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(c2269c.f10187a.f10182b, 0, c2269c).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w("AsyncLayoutInflater", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m64022f();
            }
        }
    }

    public AsyncLayoutInflater(@NonNull Context context) {
        this.f10181a = new C2268b(context);
    }

    @UiThread
    public void inflate(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull OnInflateFinishedListener onInflateFinishedListener) {
        if (onInflateFinishedListener != null) {
            C2269c m64024c = this.f10183c.m64024c();
            m64024c.f10187a = this;
            m64024c.f10189c = i;
            m64024c.f10188b = viewGroup;
            m64024c.f10191e = onInflateFinishedListener;
            this.f10183c.m64026a(m64024c);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}