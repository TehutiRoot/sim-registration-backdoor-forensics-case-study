package p000;

import androidx.compose.p003ui.draw.BuildDrawCacheParams;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.LayoutDirection;

/* renamed from: sR */
/* loaded from: classes2.dex */
public final class C13915sR implements BuildDrawCacheParams {

    /* renamed from: a */
    public static final C13915sR f79893a = new C13915sR();

    /* renamed from: b */
    public static final long f79894b = Size.Companion.m71763getUnspecifiedNHjbRc();

    /* renamed from: c */
    public static final LayoutDirection f79895c = LayoutDirection.Ltr;

    /* renamed from: d */
    public static final Density f79896d = DensityKt.Density(1.0f, 1.0f);

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return f79896d;
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return f79895c;
    }

    @Override // androidx.compose.p003ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo71606getSizeNHjbRc() {
        return f79894b;
    }
}