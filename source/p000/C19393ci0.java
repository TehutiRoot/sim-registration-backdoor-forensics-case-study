package p000;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.TransformOrigin;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ci0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19393ci0 {

    /* renamed from: c */
    public float f40192c;

    /* renamed from: d */
    public float f40193d;

    /* renamed from: e */
    public float f40194e;

    /* renamed from: f */
    public float f40195f;

    /* renamed from: g */
    public float f40196g;

    /* renamed from: a */
    public float f40190a = 1.0f;

    /* renamed from: b */
    public float f40191b = 1.0f;

    /* renamed from: h */
    public float f40197h = 8.0f;

    /* renamed from: i */
    public long f40198i = TransformOrigin.Companion.m72080getCenterSzJe1aQ();

    /* renamed from: a */
    public final void m51312a(C19393ci0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f40190a = other.f40190a;
        this.f40191b = other.f40191b;
        this.f40192c = other.f40192c;
        this.f40193d = other.f40193d;
        this.f40194e = other.f40194e;
        this.f40195f = other.f40195f;
        this.f40196g = other.f40196g;
        this.f40197h = other.f40197h;
        this.f40198i = other.f40198i;
    }

    /* renamed from: b */
    public final void m51311b(GraphicsLayerScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f40190a = scope.getScaleX();
        this.f40191b = scope.getScaleY();
        this.f40192c = scope.getTranslationX();
        this.f40193d = scope.getTranslationY();
        this.f40194e = scope.getRotationX();
        this.f40195f = scope.getRotationY();
        this.f40196g = scope.getRotationZ();
        this.f40197h = scope.getCameraDistance();
        this.f40198i = scope.mo71887getTransformOriginSzJe1aQ();
    }

    /* renamed from: c */
    public final boolean m51310c(C19393ci0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f40190a == other.f40190a && this.f40191b == other.f40191b && this.f40192c == other.f40192c && this.f40193d == other.f40193d && this.f40194e == other.f40194e && this.f40195f == other.f40195f && this.f40196g == other.f40196g && this.f40197h == other.f40197h && TransformOrigin.m72074equalsimpl0(this.f40198i, other.f40198i)) {
            return true;
        }
        return false;
    }
}
