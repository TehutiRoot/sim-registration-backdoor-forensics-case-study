package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.lang.ref.WeakReference;

/* renamed from: sT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22108sT1 extends AbstractC18024Lx1 {

    /* renamed from: b */
    public final WeakReference f79794b;

    public C22108sT1(Context context, Resources resources) {
        super(resources);
        this.f79794b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable m67451a = m67451a(i);
        Context context = (Context) this.f79794b.get();
        if (m67451a != null && context != null) {
            ResourceManagerInternal.get().m64237s(context, i, m67451a);
        }
        return m67451a;
    }
}
