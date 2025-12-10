package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

/* loaded from: classes6.dex */
public class KeyboardVisibilityEvent {

    /* renamed from: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$a */
    /* loaded from: classes6.dex */
    public static class C12383a extends AutoActivityLifecycleCallback {

        /* renamed from: b */
        public final /* synthetic */ Unregistrar f72393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12383a(Activity activity, Unregistrar unregistrar) {
            super(activity);
            this.f72393b = unregistrar;
        }

        @Override // net.yslibrary.android.keyboardvisibilityevent.AutoActivityLifecycleCallback
        public void onTargetActivityDestroyed() {
            this.f72393b.unregister();
        }
    }

    /* renamed from: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$b */
    /* loaded from: classes6.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC12384b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final int f72395b;

        /* renamed from: d */
        public final /* synthetic */ Activity f72397d;

        /* renamed from: e */
        public final /* synthetic */ View f72398e;

        /* renamed from: f */
        public final /* synthetic */ KeyboardVisibilityEventListener f72399f;

        /* renamed from: a */
        public final Rect f72394a = new Rect();

        /* renamed from: c */
        public boolean f72396c = false;

        public ViewTreeObserver$OnGlobalLayoutListenerC12384b(Activity activity, View view, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
            this.f72397d = activity;
            this.f72398e = view;
            this.f72399f = keyboardVisibilityEventListener;
            this.f72395b = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            this.f72398e.getWindowVisibleDisplayFrame(this.f72394a);
            if (this.f72398e.getRootView().getHeight() - this.f72394a.height() > this.f72395b) {
                z = true;
            } else {
                z = false;
            }
            if (z == this.f72396c) {
                return;
            }
            this.f72396c = z;
            this.f72399f.onVisibilityChanged(z);
        }
    }

    /* renamed from: a */
    public static View m26074a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    public static boolean isKeyboardVisible(Activity activity) {
        Rect rect = new Rect();
        View m26074a = m26074a(activity);
        int round = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
        m26074a.getWindowVisibleDisplayFrame(rect);
        if (m26074a.getRootView().getHeight() - rect.height() > round) {
            return true;
        }
        return false;
    }

    public static Unregistrar registerEventListener(Activity activity, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        if (activity != null) {
            if (keyboardVisibilityEventListener != null) {
                View m26074a = m26074a(activity);
                ViewTreeObserver$OnGlobalLayoutListenerC12384b viewTreeObserver$OnGlobalLayoutListenerC12384b = new ViewTreeObserver$OnGlobalLayoutListenerC12384b(activity, m26074a, keyboardVisibilityEventListener);
                m26074a.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC12384b);
                return new SimpleUnregistrar(activity, viewTreeObserver$OnGlobalLayoutListenerC12384b);
            }
            throw new NullPointerException("Parameter:listener must not be null");
        }
        throw new NullPointerException("Parameter:activity must not be null");
    }

    public static void setEventListener(Activity activity, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        activity.getApplication().registerActivityLifecycleCallbacks(new C12383a(activity, registerEventListener(activity, keyboardVisibilityEventListener)));
    }
}
