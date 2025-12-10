package p000;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: IG0 */
/* loaded from: classes2.dex */
public final class IG0 {

    /* renamed from: a */
    public long f2631a;

    /* renamed from: b */
    public long f2632b;

    /* renamed from: c */
    public FontWeight f2633c;

    /* renamed from: d */
    public FontStyle f2634d;

    /* renamed from: e */
    public FontSynthesis f2635e;

    /* renamed from: f */
    public FontFamily f2636f;

    /* renamed from: g */
    public String f2637g;

    /* renamed from: h */
    public long f2638h;

    /* renamed from: i */
    public BaselineShift f2639i;

    /* renamed from: j */
    public TextGeometricTransform f2640j;

    /* renamed from: k */
    public LocaleList f2641k;

    /* renamed from: l */
    public long f2642l;

    /* renamed from: m */
    public TextDecoration f2643m;

    /* renamed from: n */
    public Shadow f2644n;

    public /* synthetic */ IG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }

    /* renamed from: a */
    public final void m68051a(long j) {
        this.f2642l = j;
    }

    /* renamed from: b */
    public final void m68050b(BaselineShift baselineShift) {
        this.f2639i = baselineShift;
    }

    /* renamed from: c */
    public final void m68049c(long j) {
        this.f2631a = j;
    }

    /* renamed from: d */
    public final void m68048d(String str) {
        this.f2637g = str;
    }

    /* renamed from: e */
    public final void m68047e(long j) {
        this.f2632b = j;
    }

    /* renamed from: f */
    public final void m68046f(FontStyle fontStyle) {
        this.f2634d = fontStyle;
    }

    /* renamed from: g */
    public final void m68045g(FontSynthesis fontSynthesis) {
        this.f2635e = fontSynthesis;
    }

    /* renamed from: h */
    public final void m68044h(FontWeight fontWeight) {
        this.f2633c = fontWeight;
    }

    /* renamed from: i */
    public final void m68043i(long j) {
        this.f2638h = j;
    }

    /* renamed from: j */
    public final void m68042j(Shadow shadow) {
        this.f2644n = shadow;
    }

    /* renamed from: k */
    public final void m68041k(TextDecoration textDecoration) {
        this.f2643m = textDecoration;
    }

    /* renamed from: l */
    public final void m68040l(TextGeometricTransform textGeometricTransform) {
        this.f2640j = textGeometricTransform;
    }

    /* renamed from: m */
    public final SpanStyle m68039m() {
        return new SpanStyle(this.f2631a, this.f2632b, this.f2633c, this.f2634d, this.f2635e, this.f2636f, this.f2637g, this.f2638h, this.f2639i, this.f2640j, this.f2641k, this.f2642l, this.f2643m, this.f2644n, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (DefaultConstructorMarker) null);
    }

    public IG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        this.f2631a = j;
        this.f2632b = j2;
        this.f2633c = fontWeight;
        this.f2634d = fontStyle;
        this.f2635e = fontSynthesis;
        this.f2636f = fontFamily;
        this.f2637g = str;
        this.f2638h = j3;
        this.f2639i = baselineShift;
        this.f2640j = textGeometricTransform;
        this.f2641k = localeList;
        this.f2642l = j4;
        this.f2643m = textDecoration;
        this.f2644n = shadow;
    }

    public /* synthetic */ IG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m71955getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m74034getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m74034getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m71955getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, null);
    }
}