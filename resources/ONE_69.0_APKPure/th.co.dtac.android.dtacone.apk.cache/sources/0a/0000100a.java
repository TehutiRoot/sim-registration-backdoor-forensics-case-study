package p000;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Qt */
/* loaded from: classes2.dex */
public final class C1186Qt implements TextForegroundStyle {

    /* renamed from: a */
    public final long f5346a;

    public /* synthetic */ C1186Qt(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1186Qt) && Color.m71920equalsimpl0(this.f5346a, ((C1186Qt) obj).f5346a)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public float getAlpha() {
        return Color.m71921getAlphaimpl(mo69363getColor0d7_KjU());
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    public Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.p003ui.text.style.TextForegroundStyle
    /* renamed from: getColor-0d7_KjU */
    public long mo69363getColor0d7_KjU() {
        return this.f5346a;
    }

    public int hashCode() {
        return Color.m71926hashCodeimpl(this.f5346a);
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
        return "ColorStyle(value=" + ((Object) Color.m71927toStringimpl(this.f5346a)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C1186Qt(long j) {
        this.f5346a = j;
        if (j == Color.Companion.m71955getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }
}