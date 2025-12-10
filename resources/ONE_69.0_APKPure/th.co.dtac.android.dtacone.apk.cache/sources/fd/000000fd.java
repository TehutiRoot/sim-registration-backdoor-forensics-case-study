package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: B20 */
/* loaded from: classes3.dex */
public final class B20 implements InterfaceC19511d50 {

    /* renamed from: a */
    public final Set f300a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f301b;

    /* renamed from: B20$a */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnDrawListenerC0074a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f302a;

        /* renamed from: B20$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC0075a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f304a;

            public RunnableC0075a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f304a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                HardwareConfigState.getInstance().unblockHardwareBitmaps();
                B20.this.f301b = true;
                B20.m69159b(ViewTreeObserver$OnDrawListenerC0074a.this.f302a, this.f304a);
                B20.this.f300a.clear();
            }
        }

        public ViewTreeObserver$OnDrawListenerC0074a(View view) {
            this.f302a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Util.postOnUiThread(new RunnableC0075a(this));
        }
    }

    /* renamed from: b */
    public static void m69159b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p000.InterfaceC19511d50
    /* renamed from: a */
    public void mo934a(Activity activity) {
        if (this.f301b || !this.f300a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver$OnDrawListenerC0074a(decorView));
    }
}