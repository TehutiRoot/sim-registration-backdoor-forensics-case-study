package p000;

import android.os.Build;
import android.view.View;

/* renamed from: A42 */
/* loaded from: classes2.dex */
public class A42 extends C23143y42 {

    /* renamed from: j */
    public static boolean f20j = true;

    @Override // androidx.transition.AbstractC5110e
    /* renamed from: h */
    public void mo52533h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo52533h(view, i);
        } else if (f20j) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f20j = false;
            }
        }
    }
}