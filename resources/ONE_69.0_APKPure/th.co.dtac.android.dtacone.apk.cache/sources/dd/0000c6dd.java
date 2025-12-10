package p000;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.base.zak;

/* renamed from: fa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19939fa2 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f61884a;

    /* renamed from: b */
    public int f61885b;

    public C19939fa2(C19939fa2 c19939fa2) {
        if (c19939fa2 != null) {
            this.f61884a = c19939fa2.f61884a;
            this.f61885b = c19939fa2.f61885b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f61884a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zak(this);
    }
}