package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: x20  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22893x20 implements Z40 {

    /* renamed from: a */
    public final Set f108206a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public volatile boolean f108207b;

    /* renamed from: x20$a */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnDrawListenerC17016a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f108208a;

        /* renamed from: x20$a$a */
        /* loaded from: classes3.dex */
        public class RunnableC17017a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f108210a;

            public RunnableC17017a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f108210a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                HardwareConfigState.getInstance().unblockHardwareBitmaps();
                C22893x20.this.f108207b = true;
                C22893x20.m628b(ViewTreeObserver$OnDrawListenerC17016a.this.f108208a, this.f108210a);
                C22893x20.this.f108206a.clear();
            }
        }

        public ViewTreeObserver$OnDrawListenerC17016a(View view) {
            this.f108208a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Util.postOnUiThread(new RunnableC17017a(this));
        }
    }

    /* renamed from: b */
    public static void m628b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // p000.Z40
    /* renamed from: a */
    public void mo629a(Activity activity) {
        if (this.f108207b || !this.f108206a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver$OnDrawListenerC17016a(decorView));
    }
}
