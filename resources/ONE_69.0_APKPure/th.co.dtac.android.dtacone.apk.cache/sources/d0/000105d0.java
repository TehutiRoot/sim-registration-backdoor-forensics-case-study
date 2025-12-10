package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import java.lang.ref.WeakReference;

/* renamed from: pU1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21656pU1 extends AbstractC17866Iy1 {

    /* renamed from: b */
    public final WeakReference f76821b;

    public C21656pU1(Context context, Resources resources) {
        super(resources);
        this.f76821b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable m67942a = m67942a(i);
        Context context = (Context) this.f76821b.get();
        if (m67942a != null && context != null) {
            ResourceManagerInternal.get().m64188s(context, i, m67942a);
        }
        return m67942a;
    }
}