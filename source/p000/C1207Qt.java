package p000;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Qt */
/* loaded from: classes2.dex */
public final class C1207Qt implements TextForegroundStyle {

    /* renamed from: a */
    public final long f5192a;

    public /* synthetic */ C1207Qt(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1207Qt) && Color.m71736equalsimpl0(this.f5192a, ((C1207Qt) obj).f5192a)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m71737getAlphaimpl(mo69180getColor0d7_KjU());
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo69180getColor0d7_KjU() {
        return this.f5192a;
    }

    public int hashCode() {
        return Color.m71742hashCodeimpl(this.f5192a);
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
        return "ColorStyle(value=" + ((Object) Color.m71743toStringimpl(this.f5192a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C1207Qt(long j) {
        this.f5192a = j;
        if (j == Color.Companion.m71771getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}
