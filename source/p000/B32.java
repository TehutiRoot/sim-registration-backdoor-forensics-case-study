package p000;

import android.view.View;

/* renamed from: B32 */
/* loaded from: classes2.dex */
public class B32 extends C23242z32 {

    /* renamed from: i */
    public static boolean f283i = true;

    @Override // androidx.transition.AbstractC5128e
    /* renamed from: f */
    public void mo52582f(View view, int i, int i2, int i3, int i4) {
        if (f283i) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f283i = false;
            }
        }
    }
}
