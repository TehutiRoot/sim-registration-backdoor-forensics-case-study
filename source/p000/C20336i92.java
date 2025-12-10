package p000;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zak;

/* renamed from: i92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20336i92 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f62724a;

    /* renamed from: b */
    public int f62725b;

    public C20336i92(C20336i92 c20336i92) {
        if (c20336i92 != null) {
            this.f62724a = c20336i92.f62724a;
            this.f62725b = c20336i92.f62725b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f62724a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zak(this);
    }
}
