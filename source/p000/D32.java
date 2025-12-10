package p000;

import android.os.Build;
import android.view.View;

/* renamed from: D32 */
/* loaded from: classes2.dex */
public class D32 extends B32 {

    /* renamed from: j */
    public static boolean f905j = true;

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: h */
    public void mo52581h(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo52581h(view, i);
        } else if (f905j) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f905j = false;
            }
        }
    }
}
