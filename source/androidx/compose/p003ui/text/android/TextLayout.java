package androidx.compose.p003ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p003ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.p003ui.text.android.style.LineHeightStyleSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b)\u0010!J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b*\u0010!J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010!J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b/\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b2\u0010-J\u0015\u00103\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b3\u0010-J\u0015\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b5\u0010-J\u001d\u00107\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u000f¢\u0006\u0004\b=\u0010<J\u0015\u0010>\u001a\u00020\b2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b>\u0010-J\u0015\u0010?\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\b?\u00101J\u0015\u0010@\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b@\u0010-J%\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bF\u0010GJ-\u0010M\u001a\u00020E2\u0006\u0010H\u001a\u00020\b2\u0006\u0010I\u001a\u00020\b2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\b¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u00020O2\u0006\u00109\u001a\u00020\b¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020E2\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u000f\u0010X\u001a\u00020\u000fH\u0000¢\u0006\u0004\bV\u0010WR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010Y\u001a\u0004\bZ\u0010WR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010Y\u001a\u0004\b\\\u0010WR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010c\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\ba\u0010Y\u001a\u0004\bb\u0010WR \u0010k\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010j\u001a\u0004\bg\u0010hR\u0017\u0010p\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR \u0010t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bq\u0010m\u0012\u0004\bs\u0010j\u001a\u0004\br\u0010oR \u0010x\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bu\u0010m\u0012\u0004\bw\u0010j\u001a\u0004\bv\u0010oR\u0014\u0010{\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010zR\u0014\u0010\u007f\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010YR\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010mR\u001f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0093\u0001\u001a\u00030\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b[\u0010\u0092\u0001R\u0014\u0010\u0096\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0014\u0010\u0098\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u0014\u0010\u009b\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u009d\u0001\u001a\u00020\b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010o¨\u0006\u009e\u0001"}, m28850d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "line", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)F", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "getLineEnd", "getLineVisibleEnd", "isLineEllipsized", "(I)Z", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", "(IF)I", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "(IZ)F", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "", "getSelectionPath", "(IILandroid/graphics/Path;)V", "startOffset", "endOffset", "", "array", "arrayStart", "fillBoundingBoxes", "(II[FI)V", "Landroid/graphics/RectF;", "getBoundingBox", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "paint", "(Landroid/graphics/Canvas;)V", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "Z", "getIncludePadding", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getFallbackLineSpacing", OperatorName.CURVE_TO, "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "d", "getDidExceedMaxLines", "didExceedMaxLines", "Landroid/text/Layout;", "e", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", OperatorName.FILL_NON_ZERO, "I", "getLineCount", "()I", "lineCount", OperatorName.NON_STROKING_GRAY, "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", OperatorName.CLOSE_PATH, "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "i", "F", "leftPadding", OperatorName.SET_LINE_JOINSTYLE, "rightPadding", OperatorName.NON_STROKING_CMYK, "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", OperatorName.LINE_TO, "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", OperatorName.MOVE_TO, "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", OperatorName.ENDPATH, "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "Landroid/graphics/Rect;", "o", "Landroid/graphics/Rect;", "rect", "Landroidx/compose/ui/text/android/LayoutHelper;", "p", "Lkotlin/Lazy;", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "getText", "()Ljava/lang/CharSequence;", TextBundle.TEXT_ENTRY, "getHeight", "height", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1033:1\n1#2:1034\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.TextLayout */
/* loaded from: classes2.dex */
public final class TextLayout {

    /* renamed from: a */
    public final boolean f31146a;

    /* renamed from: b */
    public final boolean f31147b;

    /* renamed from: c */
    public final LayoutIntrinsics f31148c;

    /* renamed from: d */
    public final boolean f31149d;

    /* renamed from: e */
    public final Layout f31150e;

    /* renamed from: f */
    public final int f31151f;

    /* renamed from: g */
    public final int f31152g;

    /* renamed from: h */
    public final int f31153h;

    /* renamed from: i */
    public final float f31154i;

    /* renamed from: j */
    public final float f31155j;

    /* renamed from: k */
    public final boolean f31156k;

    /* renamed from: l */
    public final Paint.FontMetricsInt f31157l;

    /* renamed from: m */
    public final int f31158m;

    /* renamed from: n */
    public final LineHeightStyleSpan[] f31159n;

    /* renamed from: o */
    public final Rect f31160o;

    /* renamed from: p */
    public final Lazy f31161p;

    public TextLayout(@NotNull CharSequence charSequence, float f, @NotNull TextPaint textPaint, int i, @Nullable TextUtils.TruncateAt truncateAt, int i2, float f2, @InterfaceC2055Px float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, @Nullable int[] iArr, @Nullable int[] iArr2, @NotNull LayoutIntrinsics layoutIntrinsics) {
        TextDirectionHeuristic textDirectionHeuristic;
        Layout create;
        long m59070d;
        LineHeightStyleSpan[] m59071c;
        long m59072b;
        Paint.FontMetricsInt m59073a;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        this.f31146a = z;
        this.f31147b = z2;
        this.f31148c = layoutIntrinsics;
        this.f31160o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i);
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f && !z3) {
                this.f31156k = true;
                create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z, z2, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
            } else {
                this.f31156k = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                create = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, ceil, textDirectionHeuristic2, alignment, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.f31150e = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i3);
            this.f31151f = min;
            int i9 = min - 1;
            this.f31149d = min >= i3 && (create.getEllipsisCount(i9) > 0 || create.getLineEnd(i9) != charSequence.length());
            m59070d = TextLayoutKt.m59070d(this);
            m59071c = TextLayoutKt.m59071c(this);
            this.f31159n = m59071c;
            m59072b = TextLayoutKt.m59072b(this, m59071c);
            this.f31152g = Math.max(VerticalPaddings.m73254getTopPaddingimpl(m59070d), VerticalPaddings.m73254getTopPaddingimpl(m59072b));
            this.f31153h = Math.max(VerticalPaddings.m73253getBottomPaddingimpl(m59070d), VerticalPaddings.m73253getBottomPaddingimpl(m59072b));
            m59073a = TextLayoutKt.m59073a(this, textPaint, textDirectionHeuristic, m59071c);
            this.f31158m = m59073a != null ? m59073a.bottom - ((int) getLineHeight(i9)) : 0;
            this.f31157l = m59073a;
            this.f31154i = IndentationFixSpanKt.getEllipsizedLeftPadding$default(create, i9, null, 2, null);
            this.f31155j = IndentationFixSpanKt.getEllipsizedRightPadding$default(create, i9, null, 2, null);
            this.f31161p = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new TextLayout$layoutHelper$2(this));
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i, z);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* renamed from: a */
    public final float m59075a(int i) {
        if (i == this.f31151f - 1) {
            return this.f31154i + this.f31155j;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final LayoutHelper m59074b() {
        return (LayoutHelper) this.f31161p.getValue();
    }

    public final void fillBoundingBoxes(int i, int i2, @NotNull float[] array, int i3) {
        float m66086d;
        float m66085e;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = getText().length();
        if (i >= 0) {
            if (i < length) {
                if (i2 > i) {
                    if (i2 <= length) {
                        if (array.length - i3 >= (i2 - i) * 4) {
                            int lineForOffset = getLineForOffset(i);
                            int lineForOffset2 = getLineForOffset(i2 - 1);
                            U80 u80 = new U80(this);
                            if (lineForOffset > lineForOffset2) {
                                return;
                            }
                            while (true) {
                                int lineStart = getLineStart(lineForOffset);
                                int lineEnd = getLineEnd(lineForOffset);
                                int min = Math.min(i2, lineEnd);
                                float lineTop = getLineTop(lineForOffset);
                                float lineBottom = getLineBottom(lineForOffset);
                                boolean z = true;
                                if (getParagraphDirection(lineForOffset) != 1) {
                                    z = false;
                                }
                                boolean z2 = !z;
                                for (int max = Math.max(i, lineStart); max < min; max++) {
                                    boolean isRtlCharAt = isRtlCharAt(max);
                                    if (z && !isRtlCharAt) {
                                        m66086d = u80.m66088b(max);
                                        m66085e = u80.m66087c(max + 1);
                                    } else if (z && isRtlCharAt) {
                                        m66085e = u80.m66086d(max);
                                        m66086d = u80.m66085e(max + 1);
                                    } else if (z2 && isRtlCharAt) {
                                        m66085e = u80.m66088b(max);
                                        m66086d = u80.m66087c(max + 1);
                                    } else {
                                        m66086d = u80.m66086d(max);
                                        m66085e = u80.m66085e(max + 1);
                                    }
                                    array[i3] = m66086d;
                                    array[i3 + 1] = lineTop;
                                    array[i3 + 2] = m66085e;
                                    array[i3 + 3] = lineBottom;
                                    i3 += 4;
                                }
                                if (lineForOffset != lineForOffset2) {
                                    lineForOffset++;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.f31153h;
    }

    @NotNull
    public final RectF getBoundingBox(int i) {
        boolean z;
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        if (getParagraphDirection(lineForOffset) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = this.f31150e.isRtlCharAt(i);
        if (z && !isRtlCharAt) {
            secondaryHorizontal = getPrimaryHorizontal(i, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
        } else {
            if (z && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i, false);
                primaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i, false);
                primaryHorizontal2 = getPrimaryHorizontal(i + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.f31149d;
    }

    public final boolean getFallbackLineSpacing() {
        return this.f31147b;
    }

    public final int getHeight() {
        int height;
        if (this.f31149d) {
            height = this.f31150e.getLineBottom(this.f31151f - 1);
        } else {
            height = this.f31150e.getHeight();
        }
        return height + this.f31152g + this.f31153h + this.f31158m;
    }

    public final boolean getIncludePadding() {
        return this.f31146a;
    }

    @NotNull
    public final Layout getLayout() {
        return this.f31150e;
    }

    @NotNull
    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.f31148c;
    }

    public final float getLineAscent(int i) {
        int lineAscent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i == this.f31151f - 1 && (fontMetricsInt = this.f31157l) != null) {
            lineAscent = fontMetricsInt.ascent;
        } else {
            lineAscent = this.f31150e.getLineAscent(i);
        }
        return lineAscent;
    }

    public final float getLineBaseline(int i) {
        float lineBaseline;
        float f = this.f31152g;
        if (i == this.f31151f - 1 && this.f31157l != null) {
            lineBaseline = getLineTop(i) - this.f31157l.ascent;
        } else {
            lineBaseline = this.f31150e.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float getLineBottom(int i) {
        int i2;
        if (i == this.f31151f - 1 && this.f31157l != null) {
            return this.f31150e.getLineBottom(i - 1) + this.f31157l.bottom;
        }
        float lineBottom = this.f31152g + this.f31150e.getLineBottom(i);
        if (i == this.f31151f - 1) {
            i2 = this.f31153h;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int getLineCount() {
        return this.f31151f;
    }

    public final float getLineDescent(int i) {
        int lineDescent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i == this.f31151f - 1 && (fontMetricsInt = this.f31157l) != null) {
            lineDescent = fontMetricsInt.descent;
        } else {
            lineDescent = this.f31150e.getLineDescent(i);
        }
        return lineDescent;
    }

    public final int getLineEllipsisCount(int i) {
        return this.f31150e.getEllipsisCount(i);
    }

    public final int getLineEllipsisOffset(int i) {
        return this.f31150e.getEllipsisStart(i);
    }

    public final int getLineEnd(int i) {
        if (this.f31150e.getEllipsisStart(i) == 0) {
            return this.f31150e.getLineEnd(i);
        }
        return this.f31150e.getText().length();
    }

    public final int getLineForOffset(int i) {
        return this.f31150e.getLineForOffset(i);
    }

    public final int getLineForVertical(int i) {
        return this.f31150e.getLineForVertical(i - this.f31152g);
    }

    public final float getLineHeight(int i) {
        return getLineBottom(i) - getLineTop(i);
    }

    public final float getLineLeft(int i) {
        float f;
        float lineLeft = this.f31150e.getLineLeft(i);
        if (i == this.f31151f - 1) {
            f = this.f31154i;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float getLineRight(int i) {
        float f;
        float lineRight = this.f31150e.getLineRight(i);
        if (i == this.f31151f - 1) {
            f = this.f31155j;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final int getLineStart(int i) {
        return this.f31150e.getLineStart(i);
    }

    public final float getLineTop(int i) {
        int i2;
        float lineTop = this.f31150e.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f31152g;
        }
        return lineTop + i2;
    }

    public final int getLineVisibleEnd(int i) {
        if (this.f31150e.getEllipsisStart(i) == 0) {
            return this.f31150e.getLineVisibleEnd(i);
        }
        return this.f31150e.getEllipsisStart(i) + this.f31150e.getLineStart(i);
    }

    public final float getLineWidth(int i) {
        return this.f31150e.getLineWidth(i);
    }

    public final float getMaxIntrinsicWidth() {
        return this.f31148c.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.f31148c.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i, float f) {
        return this.f31150e.getOffsetForHorizontal(i, f + ((-1) * m59075a(i)));
    }

    public final int getParagraphDirection(int i) {
        return this.f31150e.getParagraphDirection(i);
    }

    public final float getPrimaryHorizontal(int i, boolean z) {
        return m59074b().getHorizontalPosition(i, true, z) + m59075a(getLineForOffset(i));
    }

    public final float getSecondaryHorizontal(int i, boolean z) {
        return m59074b().getHorizontalPosition(i, false, z) + m59075a(getLineForOffset(i));
    }

    public final void getSelectionPath(int i, int i2, @NotNull Path dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f31150e.getSelectionPath(i, i2, dest);
        if (this.f31152g != 0 && !dest.isEmpty()) {
            dest.offset(0.0f, this.f31152g);
        }
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.f31150e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    public final int getTopPadding$ui_text_release() {
        return this.f31152g;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.f31156k) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.f31150e;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.f31150e;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.f31147b);
    }

    public final boolean isLineEllipsized(int i) {
        return TextLayoutKt.isLineEllipsized(this.f31150e, i);
    }

    public final boolean isRtlCharAt(int i) {
        return this.f31150e.isRtlCharAt(i);
    }

    public final void paint(@NotNull Canvas canvas) {
        TextAndroidCanvas textAndroidCanvas;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!canvas.getClipBounds(this.f31160o)) {
            return;
        }
        int i = this.f31152g;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        textAndroidCanvas = TextLayoutKt.f31162a;
        textAndroidCanvas.setCanvas(canvas);
        this.f31150e.draw(textAndroidCanvas);
        int i2 = this.f31152g;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.p003ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
