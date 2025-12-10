package p000;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ShaderBrush;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Kc */
/* loaded from: classes2.dex */
public final class C0750Kc implements TextForegroundStyle {

    /* renamed from: a */
    public final ShaderBrush f3228a;

    /* renamed from: b */
    public final float f3229b;

    public C0750Kc(ShaderBrush value, float f) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3228a = value;
        this.f3229b = f;
    }

    /* renamed from: a */
    public final ShaderBrush m67605a() {
        return this.f3228a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0750Kc)) {
            return false;
        }
        C0750Kc c0750Kc = (C0750Kc) obj;
        if (Intrinsics.areEqual(this.f3228a, c0750Kc.f3228a) && Float.compare(this.f3229b, c0750Kc.f3229b) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.f3229b;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.f3228a;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long mo69180getColor0d7_KjU() {
        return Color.Companion.m71771getUnspecified0d7_KjU();
    }

    public int hashCode() {
        return (this.f3228a.hashCode() * 31) + Float.floatToIntBits(this.f3229b);
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.m58968a(this, textForegroundStyle);
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return TextForegroundStyle.CC.m58967b(this, function0);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f3228a + ", alpha=" + this.f3229b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
