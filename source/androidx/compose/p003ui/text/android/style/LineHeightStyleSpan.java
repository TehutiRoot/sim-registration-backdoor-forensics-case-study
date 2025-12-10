package androidx.compose.p003ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.FloatRange;
import androidx.compose.p003ui.text.android.InternalPlatformTextApi;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010 R$\u00104\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u00103R$\u00107\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u00103¨\u00068"}, m28850d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "<init>", "(FIIZZF)V", "", TextBundle.TEXT_ENTRY, "start", "end", "spanStartVertical", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "copy$ui_text_release", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "copy", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/Paint$FontMetricsInt;)V", "F", "getLineHeight", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "d", "Z", "e", "getTrimLastLineBottom", "()Z", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "firstAscent", OperatorName.CLOSE_PATH, "ascent", "i", "descent", OperatorName.SET_LINE_JOINSTYLE, "lastDescent", "<set-?>", OperatorName.NON_STROKING_CMYK, "getFirstAscentDiff", "()I", "firstAscentDiff", OperatorName.LINE_TO, "getLastDescentDiff", "lastDescentDiff", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.style.LineHeightStyleSpan */
/* loaded from: classes2.dex */
public final class LineHeightStyleSpan implements LineHeightSpan {

    /* renamed from: a */
    public final float f31181a;

    /* renamed from: b */
    public final int f31182b;

    /* renamed from: c */
    public final int f31183c;

    /* renamed from: d */
    public final boolean f31184d;

    /* renamed from: e */
    public final boolean f31185e;

    /* renamed from: f */
    public final float f31186f;

    /* renamed from: g */
    public int f31187g = Integer.MIN_VALUE;

    /* renamed from: h */
    public int f31188h = Integer.MIN_VALUE;

    /* renamed from: i */
    public int f31189i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f31190j = Integer.MIN_VALUE;

    /* renamed from: k */
    public int f31191k;

    /* renamed from: l */
    public int f31192l;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, @FloatRange(from = -1.0d, m64743to = 1.0d) float f2) {
        this.f31181a = f;
        this.f31182b = i;
        this.f31183c = i2;
        this.f31184d = z;
        this.f31185e = z2;
        this.f31186f = f2;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.f31184d;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i, i2, z);
    }

    /* renamed from: a */
    public final void m59054a(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int lineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int ceil2 = (int) Math.ceil(this.f31181a);
        int i = ceil2 - lineHeight;
        float f = this.f31186f;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        }
        if (i <= 0) {
            ceil = Math.ceil(i * f);
        } else {
            ceil = Math.ceil(i * (1.0f - f));
        }
        int i2 = (int) ceil;
        int i3 = fontMetricsInt.descent;
        int i4 = i2 + i3;
        this.f31189i = i4;
        int i5 = i4 - ceil2;
        this.f31188h = i5;
        if (this.f31184d) {
            i5 = fontMetricsInt.ascent;
        }
        this.f31187g = i5;
        if (this.f31185e) {
            i4 = i3;
        }
        this.f31190j = i4;
        this.f31191k = fontMetricsInt.ascent - i5;
        this.f31192l = i4 - i3;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z2 = false;
        if (i == this.f31182b) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == this.f31183c) {
            z2 = true;
        }
        if (z && z2 && this.f31184d && this.f31185e) {
            return;
        }
        if (this.f31187g == Integer.MIN_VALUE) {
            m59054a(fontMetricsInt);
        }
        if (z) {
            i5 = this.f31187g;
        } else {
            i5 = this.f31188h;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.f31190j;
        } else {
            i6 = this.f31189i;
        }
        fontMetricsInt.descent = i6;
    }

    @NotNull
    public final LineHeightStyleSpan copy$ui_text_release(int i, int i2, boolean z) {
        return new LineHeightStyleSpan(this.f31181a, i, i2, z, this.f31185e, this.f31186f);
    }

    public final int getFirstAscentDiff() {
        return this.f31191k;
    }

    public final int getLastDescentDiff() {
        return this.f31192l;
    }

    public final float getLineHeight() {
        return this.f31181a;
    }

    public final boolean getTrimLastLineBottom() {
        return this.f31185e;
    }
}
