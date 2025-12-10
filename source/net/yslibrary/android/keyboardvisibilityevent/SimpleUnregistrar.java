package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class SimpleUnregistrar implements Unregistrar {

    /* renamed from: a */
    public WeakReference f72400a;

    /* renamed from: b */
    public WeakReference f72401b;

    public SimpleUnregistrar(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f72400a = new WeakReference(activity);
        this.f72401b = new WeakReference(onGlobalLayoutListener);
    }

    @Override // net.yslibrary.android.keyboardvisibilityevent.Unregistrar
    public void unregister() {
        Activity activity = (Activity) this.f72400a.get();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f72401b.get();
        if (activity != null && onGlobalLayoutListener != null) {
            KeyboardVisibilityEvent.m26074a(activity).getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.f72400a.clear();
        this.f72401b.clear();
    }
}
