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

/* renamed from: CG0 */
/* loaded from: classes2.dex */
public final class CG0 {

    /* renamed from: a */
    public long f653a;

    /* renamed from: b */
    public long f654b;

    /* renamed from: c */
    public FontWeight f655c;

    /* renamed from: d */
    public FontStyle f656d;

    /* renamed from: e */
    public FontSynthesis f657e;

    /* renamed from: f */
    public FontFamily f658f;

    /* renamed from: g */
    public String f659g;

    /* renamed from: h */
    public long f660h;

    /* renamed from: i */
    public BaselineShift f661i;

    /* renamed from: j */
    public TextGeometricTransform f662j;

    /* renamed from: k */
    public LocaleList f663k;

    /* renamed from: l */
    public long f664l;

    /* renamed from: m */
    public TextDecoration f665m;

    /* renamed from: n */
    public Shadow f666n;

    public /* synthetic */ CG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow);
    }

    /* renamed from: a */
    public final void m68814a(long j) {
        this.f664l = j;
    }

    /* renamed from: b */
    public final void m68813b(BaselineShift baselineShift) {
        this.f661i = baselineShift;
    }

    /* renamed from: c */
    public final void m68812c(long j) {
        this.f653a = j;
    }

    /* renamed from: d */
    public final void m68811d(String str) {
        this.f659g = str;
    }

    /* renamed from: e */
    public final void m68810e(long j) {
        this.f654b = j;
    }

    /* renamed from: f */
    public final void m68809f(FontStyle fontStyle) {
        this.f656d = fontStyle;
    }

    /* renamed from: g */
    public final void m68808g(FontSynthesis fontSynthesis) {
        this.f657e = fontSynthesis;
    }

    /* renamed from: h */
    public final void m68807h(FontWeight fontWeight) {
        this.f655c = fontWeight;
    }

    /* renamed from: i */
    public final void m68806i(long j) {
        this.f660h = j;
    }

    /* renamed from: j */
    public final void m68805j(Shadow shadow) {
        this.f666n = shadow;
    }

    /* renamed from: k */
    public final void m68804k(TextDecoration textDecoration) {
        this.f665m = textDecoration;
    }

    /* renamed from: l */
    public final void m68803l(TextGeometricTransform textGeometricTransform) {
        this.f662j = textGeometricTransform;
    }

    /* renamed from: m */
    public final SpanStyle m68802m() {
        return new SpanStyle(this.f653a, this.f654b, this.f655c, this.f656d, this.f657e, this.f658f, this.f659g, this.f660h, this.f661i, this.f662j, this.f663k, this.f664l, this.f665m, this.f666n, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (DefaultConstructorMarker) null);
    }

    public CG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow) {
        this.f653a = j;
        this.f654b = j2;
        this.f655c = fontWeight;
        this.f656d = fontStyle;
        this.f657e = fontSynthesis;
        this.f658f = fontFamily;
        this.f659g = str;
        this.f660h = j3;
        this.f661i = baselineShift;
        this.f662j = textGeometricTransform;
        this.f663k = localeList;
        this.f664l = j4;
        this.f665m = textDecoration;
        this.f666n = shadow;
    }

    public /* synthetic */ CG0(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.Companion.m71771getUnspecified0d7_KjU() : j, (i & 2) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & 128) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & 1024) != 0 ? null : localeList, (i & 2048) != 0 ? Color.Companion.m71771getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : textDecoration, (i & 8192) != 0 ? null : shadow, null);
    }
}
