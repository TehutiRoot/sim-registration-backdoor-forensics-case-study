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
    public static class C12380a extends AutoActivityLifecycleCallback {

        /* renamed from: b */
        public final /* synthetic */ Unregistrar f72515b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12380a(Activity activity, Unregistrar unregistrar) {
            super(activity);
            this.f72515b = unregistrar;
        }

        @Override // net.yslibrary.android.keyboardvisibilityevent.AutoActivityLifecycleCallback
        public void onTargetActivityDestroyed() {
            this.f72515b.unregister();
        }
    }

    /* renamed from: net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent$b */
    /* loaded from: classes6.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC12381b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b */
        public final int f72517b;

        /* renamed from: d */
        public final /* synthetic */ Activity f72519d;

        /* renamed from: e */
        public final /* synthetic */ View f72520e;

        /* renamed from: f */
        public final /* synthetic */ KeyboardVisibilityEventListener f72521f;

        /* renamed from: a */
        public final Rect f72516a = new Rect();

        /* renamed from: c */
        public boolean f72518c = false;

        public ViewTreeObserver$OnGlobalLayoutListenerC12381b(Activity activity, View view, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
            this.f72519d = activity;
            this.f72520e = view;
            this.f72521f = keyboardVisibilityEventListener;
            this.f72517b = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            this.f72520e.getWindowVisibleDisplayFrame(this.f72516a);
            if (this.f72520e.getRootView().getHeight() - this.f72516a.height() > this.f72517b) {
                z = true;
            } else {
                z = false;
            }
            if (z == this.f72518c) {
                return;
            }
            this.f72518c = z;
            this.f72521f.onVisibilityChanged(z);
        }
    }

    /* renamed from: a */
    public static View m26334a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    public static boolean isKeyboardVisible(Activity activity) {
        Rect rect = new Rect();
        View m26334a = m26334a(activity);
        int round = Math.round(UIUtil.convertDpToPx(activity, 100.0f));
        m26334a.getWindowVisibleDisplayFrame(rect);
        if (m26334a.getRootView().getHeight() - rect.height() > round) {
            return true;
        }
        return false;
    }

    public static Unregistrar registerEventListener(Activity activity, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        if (activity != null) {
            if (keyboardVisibilityEventListener != null) {
                View m26334a = m26334a(activity);
                ViewTreeObserver$OnGlobalLayoutListenerC12381b viewTreeObserver$OnGlobalLayoutListenerC12381b = new ViewTreeObserver$OnGlobalLayoutListenerC12381b(activity, m26334a, keyboardVisibilityEventListener);
                m26334a.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC12381b);
                return new SimpleUnregistrar(activity, viewTreeObserver$OnGlobalLayoutListenerC12381b);
            }
            throw new NullPointerException("Parameter:listener must not be null");
        }
        throw new NullPointerException("Parameter:activity must not be null");
    }

    public static void setEventListener(Activity activity, KeyboardVisibilityEventListener keyboardVisibilityEventListener) {
        activity.getApplication().registerActivityLifecycleCallbacks(new C12380a(activity, registerEventListener(activity, keyboardVisibilityEventListener)));
    }
}