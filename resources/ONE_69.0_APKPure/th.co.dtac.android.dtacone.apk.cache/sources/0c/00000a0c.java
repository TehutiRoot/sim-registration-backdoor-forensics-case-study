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
public final class C0741Kc implements TextForegroundStyle {

    /* renamed from: a */
    public final ShaderBrush f3358a;

    /* renamed from: b */
    public final float f3359b;

    public C0741Kc(ShaderBrush value, float f) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3358a = value;
        this.f3359b = f;
    }

    /* renamed from: a */
    public final ShaderBrush m67693a() {
        return this.f3358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0741Kc)) {
            return false;
        }
        C0741Kc c0741Kc = (C0741Kc) obj;
        if (Intrinsics.areEqual(this.f3358a, c0741Kc.f3358a) && Float.compare(this.f3359b, c0741Kc.f3359b) == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return this.f3359b;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return this.f3358a;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long mo69363getColor0d7_KjU() {
        return Color.Companion.m71955getUnspecified0d7_KjU();
    }

    public int hashCode() {
        return (this.f3358a.hashCode() * 31) + Float.floatToIntBits(this.f3359b);
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return TextForegroundStyle.CC.m58918a(this, textForegroundStyle);
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return TextForegroundStyle.CC.m58917b(this, function0);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f3358a + ", alpha=" + this.f3359b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}