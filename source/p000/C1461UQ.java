package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mixpanel.android.viewcrawler.ViewVisitor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: UQ */
/* loaded from: classes5.dex */
public class C1461UQ extends IW1 {

    /* renamed from: b */
    public final Handler f6328b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Map f6329c = new HashMap();

    /* renamed from: d */
    public final Set f6330d = new HashSet();

    /* renamed from: UQ$a */
    /* loaded from: classes5.dex */
    public class RunnableC1462a implements Runnable {
        public RunnableC1462a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1461UQ.this.m66040h();
        }
    }

    /* renamed from: UQ$b */
    /* loaded from: classes5.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC1463b implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        /* renamed from: c */
        public final WeakReference f6334c;

        /* renamed from: d */
        public final ViewVisitor f6335d;

        /* renamed from: e */
        public final Handler f6336e;

        /* renamed from: b */
        public boolean f6333b = true;

        /* renamed from: a */
        public volatile boolean f6332a = false;

        public ViewTreeObserver$OnGlobalLayoutListenerC1463b(View view, ViewVisitor viewVisitor, Handler handler) {
            this.f6335d = viewVisitor;
            this.f6334c = new WeakReference(view);
            this.f6336e = handler;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        /* renamed from: a */
        public final void m66037a() {
            if (this.f6333b) {
                View view = (View) this.f6334c.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
                this.f6335d.cleanup();
            }
            this.f6333b = false;
        }

        /* renamed from: b */
        public void m66036b() {
            this.f6332a = true;
            this.f6336e.post(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            run();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f6333b) {
                return;
            }
            View view = (View) this.f6334c.get();
            if (view != null && !this.f6332a) {
                this.f6335d.visit(view);
                this.f6336e.removeCallbacks(this);
                this.f6336e.postDelayed(this, 1000L);
                return;
            }
            m66037a();
        }
    }

    /* renamed from: e */
    public void m66043e(Activity activity) {
        super.m67895a(activity);
        m66041g();
    }

    /* renamed from: f */
    public final void m66042f(View view, List list) {
        synchronized (this.f6330d) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.f6330d.add(new ViewTreeObserver$OnGlobalLayoutListenerC1463b(view, (ViewVisitor) list.get(i), this.f6328b));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m66041g() {
        if (Thread.currentThread() == this.f6328b.getLooper().getThread()) {
            m66040h();
        } else {
            this.f6328b.post(new RunnableC1462a());
        }
    }

    /* renamed from: h */
    public final void m66040h() {
        List list;
        List list2;
        for (Activity activity : m67894b()) {
            String canonicalName = activity.getClass().getCanonicalName();
            View rootView = activity.getWindow().getDecorView().getRootView();
            synchronized (this.f6329c) {
                list = (List) this.f6329c.get(canonicalName);
                list2 = (List) this.f6329c.get(null);
            }
            if (list != null) {
                m66042f(rootView, list);
            }
            if (list2 != null) {
                m66042f(rootView, list2);
            }
        }
    }

    /* renamed from: i */
    public void m66039i(Activity activity) {
        super.m67893c(activity);
    }

    /* renamed from: j */
    public void m66038j(Map map) {
        synchronized (this.f6330d) {
            try {
                for (ViewTreeObserver$OnGlobalLayoutListenerC1463b viewTreeObserver$OnGlobalLayoutListenerC1463b : this.f6330d) {
                    viewTreeObserver$OnGlobalLayoutListenerC1463b.m66036b();
                }
                this.f6330d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f6329c) {
            this.f6329c.clear();
            this.f6329c.putAll(map);
        }
        m66041g();
    }
}
