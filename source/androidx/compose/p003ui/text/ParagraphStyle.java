package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b1\b\u0007\u0018\u00002\u00020\u0001Bt\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015B:\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016BR\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0017Bj\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001bJC\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ[\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!Js\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J}\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR#\u0010V\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010+R#\u0010Y\u001a\u00020\u000e8\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010+R#\u0010\\\u001a\u00020\u00108\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m28850d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "<init>", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "merge", "(Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "plus", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/text/style/TextAlign;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/style/TextDirection;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getLineHeight-XSAIIZE", "()J", "d", "Landroidx/compose/ui/text/style/TextIndent;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "e", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/text/style/LineHeightStyle;", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/text/style/LineBreak;", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/text/style/Hyphens;", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "i", "Landroidx/compose/ui/text/style/TextMotion;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", OperatorName.SET_LINE_JOINSTYLE, "I", "getTextAlignOrDefault-e0LSkKk$ui_text_release", "textAlignOrDefault", OperatorName.NON_STROKING_CMYK, "getLineBreakOrDefault-rAG3T2k$ui_text_release", "lineBreakOrDefault", OperatorName.LINE_TO, "getHyphensOrDefault-vmbZdU8$ui_text_release", "hyphensOrDefault", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.ParagraphStyle */
/* loaded from: classes2.dex */
public final class ParagraphStyle {
    public static final int $stable = 0;

    /* renamed from: a */
    public final TextAlign f31014a;

    /* renamed from: b */
    public final TextDirection f31015b;

    /* renamed from: c */
    public final long f31016c;

    /* renamed from: d */
    public final TextIndent f31017d;

    /* renamed from: e */
    public final PlatformParagraphStyle f31018e;

    /* renamed from: f */
    public final LineHeightStyle f31019f;

    /* renamed from: g */
    public final LineBreak f31020g;

    /* renamed from: h */
    public final Hyphens f31021h;

    /* renamed from: i */
    public final TextMotion f31022i;

    /* renamed from: j */
    public final int f31023j;

    /* renamed from: k */
    public final int f31024k;

    /* renamed from: l */
    public final int f31025l;

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    /* renamed from: copy-Elsmlbk$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m73119copyElsmlbk$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = paragraphStyle.f31014a;
        }
        if ((i & 2) != 0) {
            textDirection = paragraphStyle.f31015b;
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.f31016c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.f31017d;
        }
        return paragraphStyle.m73123copyElsmlbk(textAlign, textDirection2, j2, textIndent);
    }

    /* renamed from: copy-NH1kkwU$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m73120copyNH1kkwU$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j2;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        TextMotion textMotion2;
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.f31014a;
        } else {
            textAlign2 = textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.f31015b;
        } else {
            textDirection2 = textDirection;
        }
        if ((i & 4) != 0) {
            j2 = paragraphStyle.f31016c;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.f31017d;
        } else {
            textIndent2 = textIndent;
        }
        if ((i & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.f31018e;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.f31019f;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i & 64) != 0) {
            lineBreak2 = paragraphStyle.f31020g;
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i & 128) != 0) {
            hyphens2 = paragraphStyle.f31021h;
        } else {
            hyphens2 = hyphens;
        }
        if ((i & 256) != 0) {
            textMotion2 = paragraphStyle.f31022i;
        } else {
            textMotion2 = textMotion;
        }
        return paragraphStyle.m73124copyNH1kkwU(textAlign2, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2, textMotion2);
    }

    /* renamed from: copy-ciSxzs0$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m73121copyciSxzs0$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, Object obj) {
        TextAlign textAlign2;
        TextDirection textDirection2;
        long j2;
        TextIndent textIndent2;
        PlatformParagraphStyle platformParagraphStyle2;
        LineHeightStyle lineHeightStyle2;
        LineBreak lineBreak2;
        Hyphens hyphens2;
        if ((i & 1) != 0) {
            textAlign2 = paragraphStyle.f31014a;
        } else {
            textAlign2 = textAlign;
        }
        if ((i & 2) != 0) {
            textDirection2 = paragraphStyle.f31015b;
        } else {
            textDirection2 = textDirection;
        }
        if ((i & 4) != 0) {
            j2 = paragraphStyle.f31016c;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            textIndent2 = paragraphStyle.f31017d;
        } else {
            textIndent2 = textIndent;
        }
        if ((i & 16) != 0) {
            platformParagraphStyle2 = paragraphStyle.f31018e;
        } else {
            platformParagraphStyle2 = platformParagraphStyle;
        }
        if ((i & 32) != 0) {
            lineHeightStyle2 = paragraphStyle.f31019f;
        } else {
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i & 64) != 0) {
            lineBreak2 = paragraphStyle.f31020g;
        } else {
            lineBreak2 = lineBreak;
        }
        if ((i & 128) != 0) {
            hyphens2 = paragraphStyle.f31021h;
        } else {
            hyphens2 = hyphens;
        }
        return paragraphStyle.m73125copyciSxzs0(textAlign2, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle2, lineBreak2, hyphens2);
    }

    /* renamed from: copy-xPh5V4g$default  reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m73122copyxPh5V4g$default(ParagraphStyle paragraphStyle, TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            textAlign = paragraphStyle.f31014a;
        }
        if ((i & 2) != 0) {
            textDirection = paragraphStyle.f31015b;
        }
        TextDirection textDirection2 = textDirection;
        if ((i & 4) != 0) {
            j = paragraphStyle.f31016c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            textIndent = paragraphStyle.f31017d;
        }
        TextIndent textIndent2 = textIndent;
        if ((i & 16) != 0) {
            platformParagraphStyle = paragraphStyle.f31018e;
        }
        PlatformParagraphStyle platformParagraphStyle2 = platformParagraphStyle;
        if ((i & 32) != 0) {
            lineHeightStyle = paragraphStyle.f31019f;
        }
        return paragraphStyle.m73126copyxPh5V4g(textAlign, textDirection2, j2, textIndent2, platformParagraphStyle2, lineHeightStyle);
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            paragraphStyle2 = null;
        }
        return paragraphStyle.merge(paragraphStyle2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-Elsmlbk  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m73123copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, this.f31018e, this.f31019f, this.f31020g, this.f31021h, this.f31022i, (DefaultConstructorMarker) null);
    }

    @NotNull
    /* renamed from: copy-NH1kkwU  reason: not valid java name */
    public final ParagraphStyle m73124copyNH1kkwU(@Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformParagraphStyle, @Nullable LineHeightStyle lineHeightStyle, @Nullable LineBreak lineBreak, @Nullable Hyphens hyphens, @Nullable TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, textMotion, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-ciSxzs0  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m73125copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, this.f31022i, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* renamed from: copy-xPh5V4g  reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m73126copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        return new ParagraphStyle(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, this.f31020g, this.f31021h, this.f31022i, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj;
        if (Intrinsics.areEqual(this.f31014a, paragraphStyle.f31014a) && Intrinsics.areEqual(this.f31015b, paragraphStyle.f31015b) && TextUnit.m73836equalsimpl0(this.f31016c, paragraphStyle.f31016c) && Intrinsics.areEqual(this.f31017d, paragraphStyle.f31017d) && Intrinsics.areEqual(this.f31018e, paragraphStyle.f31018e) && Intrinsics.areEqual(this.f31019f, paragraphStyle.f31019f) && Intrinsics.areEqual(this.f31020g, paragraphStyle.f31020g) && Intrinsics.areEqual(this.f31021h, paragraphStyle.f31021h) && Intrinsics.areEqual(this.f31022i, paragraphStyle.f31022i)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: getHyphens-EaSxIns  reason: not valid java name */
    public final Hyphens m73127getHyphensEaSxIns() {
        return this.f31021h;
    }

    /* renamed from: getHyphensOrDefault-vmbZdU8$ui_text_release  reason: not valid java name */
    public final int m73128getHyphensOrDefaultvmbZdU8$ui_text_release() {
        return this.f31025l;
    }

    @Nullable
    /* renamed from: getLineBreak-LgCVezo  reason: not valid java name */
    public final LineBreak m73129getLineBreakLgCVezo() {
        return this.f31020g;
    }

    /* renamed from: getLineBreakOrDefault-rAG3T2k$ui_text_release  reason: not valid java name */
    public final int m73130getLineBreakOrDefaultrAG3T2k$ui_text_release() {
        return this.f31024k;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m73131getLineHeightXSAIIZE() {
        return this.f31016c;
    }

    @Nullable
    public final LineHeightStyle getLineHeightStyle() {
        return this.f31019f;
    }

    @Nullable
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.f31018e;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m73132getTextAlignbuA522U() {
        return this.f31014a;
    }

    /* renamed from: getTextAlignOrDefault-e0LSkKk$ui_text_release  reason: not valid java name */
    public final int m73133getTextAlignOrDefaulte0LSkKk$ui_text_release() {
        return this.f31023j;
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m73134getTextDirectionmmuk1to() {
        return this.f31015b;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.f31017d;
    }

    @Nullable
    public final TextMotion getTextMotion() {
        return this.f31022i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TextAlign textAlign = this.f31014a;
        int i8 = 0;
        if (textAlign != null) {
            i = TextAlign.m73545hashCodeimpl(textAlign.m73547unboximpl());
        } else {
            i = 0;
        }
        int i9 = i * 31;
        TextDirection textDirection = this.f31015b;
        if (textDirection != null) {
            i2 = TextDirection.m73558hashCodeimpl(textDirection.m73560unboximpl());
        } else {
            i2 = 0;
        }
        int m73840hashCodeimpl = (((i9 + i2) * 31) + TextUnit.m73840hashCodeimpl(this.f31016c)) * 31;
        TextIndent textIndent = this.f31017d;
        if (textIndent != null) {
            i3 = textIndent.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (m73840hashCodeimpl + i3) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.f31018e;
        if (platformParagraphStyle != null) {
            i4 = platformParagraphStyle.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        LineHeightStyle lineHeightStyle = this.f31019f;
        if (lineHeightStyle != null) {
            i5 = lineHeightStyle.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        LineBreak lineBreak = this.f31020g;
        if (lineBreak != null) {
            i6 = LineBreak.m73480hashCodeimpl(lineBreak.m73482unboximpl());
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        Hyphens hyphens = this.f31021h;
        if (hyphens != null) {
            i7 = Hyphens.m73466hashCodeimpl(hyphens.m73468unboximpl());
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        TextMotion textMotion = this.f31022i;
        if (textMotion != null) {
            i8 = textMotion.hashCode();
        }
        return i14 + i8;
    }

    @Stable
    @NotNull
    public final ParagraphStyle merge(@Nullable ParagraphStyle paragraphStyle) {
        if (paragraphStyle == null) {
            return this;
        }
        return ParagraphStyleKt.m73135fastMergeHtYhynw(this, paragraphStyle.f31014a, paragraphStyle.f31015b, paragraphStyle.f31016c, paragraphStyle.f31017d, paragraphStyle.f31018e, paragraphStyle.f31019f, paragraphStyle.f31020g, paragraphStyle.f31021h, paragraphStyle.f31022i);
    }

    @Stable
    @NotNull
    public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @NotNull
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f31014a + ", textDirection=" + this.f31015b + ", lineHeight=" + ((Object) TextUnit.m73846toStringimpl(this.f31016c)) + ", textIndent=" + this.f31017d + ", platformStyle=" + this.f31018e + ", lineHeightStyle=" + this.f31019f + ", lineBreak=" + this.f31020g + ", hyphens=" + this.f31021h + ", textMotion=" + this.f31022i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAlign, textDirection, j, textIndent);
    }

    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this.f31014a = textAlign;
        this.f31015b = textDirection;
        this.f31016c = j;
        this.f31017d = textIndent;
        this.f31018e = platformParagraphStyle;
        this.f31019f = lineHeightStyle;
        this.f31020g = lineBreak;
        this.f31021h = hyphens;
        this.f31022i = textMotion;
        this.f31023j = textAlign != null ? textAlign.m73547unboximpl() : TextAlign.Companion.m73553getStarte0LSkKk();
        this.f31024k = lineBreak != null ? lineBreak.m73482unboximpl() : LineBreak.Companion.m73485getSimplerAG3T2k();
        this.f31025l = hyphens != null ? hyphens.m73468unboximpl() : Hyphens.Companion.m73470getNonevmbZdU8();
        if (TextUnit.m73836equalsimpl0(j, TextUnit.Companion.m73850getUnspecifiedXSAIIZE()) || TextUnit.m73839getValueimpl(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m73839getValueimpl(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) != 0 ? null : hyphens, (i & 256) == 0 ? textMotion : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, null);
    }

    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent) {
        this(textAlign, textDirection, j, textIndent, (PlatformParagraphStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) == 0 ? lineHeightStyle : null, null);
    }

    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, (LineBreak) null, (Hyphens) null, (TextMotion) null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : textAlign, (i & 2) != 0 ? null : textDirection, (i & 4) != 0 ? TextUnit.Companion.m73850getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : textIndent, (i & 16) != 0 ? null : platformParagraphStyle, (i & 32) != 0 ? null : lineHeightStyle, (i & 64) != 0 ? null : lineBreak, (i & 128) == 0 ? hyphens : null, (DefaultConstructorMarker) null);
    }

    public ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long j, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(textAlign, textDirection, j, textIndent, platformParagraphStyle, lineHeightStyle, lineBreak, hyphens, (TextMotion) null, (DefaultConstructorMarker) null);
    }
}
