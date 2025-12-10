package p000;

import androidx.compose.p003ui.draw.BuildDrawCacheParams;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.LayoutDirection;

/* renamed from: oR */
/* loaded from: classes2.dex */
public final class C12441oR implements BuildDrawCacheParams {

    /* renamed from: a */
    public static final C12441oR f72701a = new C12441oR();

    /* renamed from: b */
    public static final long f72702b = Size.Companion.m71579getUnspecifiedNHjbRc();

    /* renamed from: c */
    public static final LayoutDirection f72703c = LayoutDirection.Ltr;

    /* renamed from: d */
    public static final Density f72704d = DensityKt.Density(1.0f, 1.0f);

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return f72704d;
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return f72703c;
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo71422getSizeNHjbRc() {
        return f72702b;
    }
}
