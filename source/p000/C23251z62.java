package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: z62  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C23251z62 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f108976a;

    /* renamed from: b */
    public Drawable.ConstantState f108977b;

    /* renamed from: c */
    public ColorStateList f108978c;

    /* renamed from: d */
    public PorterDuff.Mode f108979d;

    public C23251z62(C23251z62 c23251z62) {
        this.f108978c = null;
        this.f108979d = AbstractC22907x62.f108223g;
        if (c23251z62 != null) {
            this.f108976a = c23251z62.f108976a;
            this.f108977b = c23251z62.f108977b;
            this.f108978c = c23251z62.f108978c;
            this.f108979d = c23251z62.f108979d;
        }
    }

    /* renamed from: a */
    public boolean m131a() {
        if (this.f108977b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i;
        int i2 = this.f108976a;
        Drawable.ConstantState constantState = this.f108977b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C23079y62(this, resources);
    }
}
