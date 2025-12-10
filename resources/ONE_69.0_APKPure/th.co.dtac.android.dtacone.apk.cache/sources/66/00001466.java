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

/* renamed from: VQ */
/* loaded from: classes5.dex */
public class C1513VQ extends FX1 {

    /* renamed from: b */
    public final Handler f6900b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Map f6901c = new HashMap();

    /* renamed from: d */
    public final Set f6902d = new HashSet();

    /* renamed from: VQ$a */
    /* loaded from: classes5.dex */
    public class RunnableC1514a implements Runnable {
        public RunnableC1514a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1513VQ.this.m65998h();
        }
    }

    /* renamed from: VQ$b */
    /* loaded from: classes5.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC1515b implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        /* renamed from: c */
        public final WeakReference f6906c;

        /* renamed from: d */
        public final ViewVisitor f6907d;

        /* renamed from: e */
        public final Handler f6908e;

        /* renamed from: b */
        public boolean f6905b = true;

        /* renamed from: a */
        public volatile boolean f6904a = false;

        public ViewTreeObserver$OnGlobalLayoutListenerC1515b(View view, ViewVisitor viewVisitor, Handler handler) {
            this.f6907d = viewVisitor;
            this.f6906c = new WeakReference(view);
            this.f6908e = handler;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        /* renamed from: a */
        public final void m65995a() {
            if (this.f6905b) {
                View view = (View) this.f6906c.get();
                if (view != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
                this.f6907d.cleanup();
            }
            this.f6905b = false;
        }

        /* renamed from: b */
        public void m65994b() {
            this.f6904a = true;
            this.f6908e.post(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            run();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f6905b) {
                return;
            }
            View view = (View) this.f6906c.get();
            if (view != null && !this.f6904a) {
                this.f6907d.visit(view);
                this.f6908e.removeCallbacks(this);
                this.f6908e.postDelayed(this, 1000L);
                return;
            }
            m65995a();
        }
    }

    /* renamed from: e */
    public void m66001e(Activity activity) {
        super.m68406a(activity);
        m65999g();
    }

    /* renamed from: f */
    public final void m66000f(View view, List list) {
        synchronized (this.f6902d) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.f6902d.add(new ViewTreeObserver$OnGlobalLayoutListenerC1515b(view, (ViewVisitor) list.get(i), this.f6900b));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m65999g() {
        if (Thread.currentThread() == this.f6900b.getLooper().getThread()) {
            m65998h();
        } else {
            this.f6900b.post(new RunnableC1514a());
        }
    }

    /* renamed from: h */
    public final void m65998h() {
        List list;
        List list2;
        for (Activity activity : m68405b()) {
            String canonicalName = activity.getClass().getCanonicalName();
            View rootView = activity.getWindow().getDecorView().getRootView();
            synchronized (this.f6901c) {
                list = (List) this.f6901c.get(canonicalName);
                list2 = (List) this.f6901c.get(null);
            }
            if (list != null) {
                m66000f(rootView, list);
            }
            if (list2 != null) {
                m66000f(rootView, list2);
            }
        }
    }

    /* renamed from: i */
    public void m65997i(Activity activity) {
        super.m68404c(activity);
    }

    /* renamed from: j */
    public void m65996j(Map map) {
        synchronized (this.f6902d) {
            try {
                for (ViewTreeObserver$OnGlobalLayoutListenerC1515b viewTreeObserver$OnGlobalLayoutListenerC1515b : this.f6902d) {
                    viewTreeObserver$OnGlobalLayoutListenerC1515b.m65994b();
                }
                this.f6902d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f6901c) {
            this.f6901c.clear();
            this.f6901c.putAll(map);
        }
        m65999g();
    }
}