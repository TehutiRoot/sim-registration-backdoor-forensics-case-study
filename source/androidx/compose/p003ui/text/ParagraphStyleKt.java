package androidx.compose.p003ui.text;

import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextIndentKt;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aq\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a\u001f\u0010$\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b$\u0010%\"\u0017\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m28850d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/ParagraphStyle;F)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/PlatformParagraphStyle;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;F)Landroidx/compose/ui/text/PlatformParagraphStyle;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "resolveParagraphStyleDefaults", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "platformStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineBreak;", "lineBreak", "Landroidx/compose/ui/text/style/Hyphens;", "hyphens", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "fastMerge-HtYhynw", "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "fastMerge", "other", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;", OperatorName.SET_LINE_CAPSTYLE, "DefaultLineHeight", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,470:1\n250#2:471\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n433#1:471\n*E\n"})
/* renamed from: androidx.compose.ui.text.ParagraphStyleKt */
/* loaded from: classes2.dex */
public final class ParagraphStyleKt {

    /* renamed from: a */
    public static final long f31026a = TextUnit.Companion.m73850getUnspecifiedXSAIIZE();

    /* renamed from: a */
    public static final PlatformParagraphStyle m59101a(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f);
    }

    /* renamed from: b */
    public static final PlatformParagraphStyle m59100b(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (androidx.compose.p003ui.unit.TextUnit.m73836equalsimpl0(r11, r23.m73131getLineHeightXSAIIZE()) != false) goto L39;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: fastMerge-HtYhynw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.p003ui.text.ParagraphStyle m73135fastMergeHtYhynw(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.ParagraphStyle r23, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextAlign r24, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextDirection r25, long r26, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextIndent r28, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.PlatformParagraphStyle r29, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.LineHeightStyle r30, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.LineBreak r31, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.Hyphens r32, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.style.TextMotion r33) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            java.lang.String r9 = "$this$fastMerge"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r9)
            if (r1 == 0) goto L28
            androidx.compose.ui.text.style.TextAlign r9 = r23.m73132getTextAlignbuA522U()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
            if (r9 == 0) goto L24
            goto L28
        L24:
            r11 = r26
            goto L93
        L28:
            boolean r9 = androidx.compose.p003ui.unit.TextUnitKt.m73857isUnspecifiedR2X_6o(r26)
            r9 = r9 ^ 1
            if (r9 == 0) goto L3d
            long r9 = r23.m73131getLineHeightXSAIIZE()
            r11 = r26
            boolean r9 = androidx.compose.p003ui.unit.TextUnit.m73836equalsimpl0(r11, r9)
            if (r9 == 0) goto L93
            goto L3f
        L3d:
            r11 = r26
        L3f:
            if (r3 == 0) goto L4b
            androidx.compose.ui.text.style.TextIndent r9 = r23.getTextIndent()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r9)
            if (r9 == 0) goto L93
        L4b:
            if (r2 == 0) goto L57
            androidx.compose.ui.text.style.TextDirection r9 = r23.m73134getTextDirectionmmuk1to()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r9)
            if (r9 == 0) goto L93
        L57:
            if (r4 == 0) goto L63
            androidx.compose.ui.text.PlatformParagraphStyle r9 = r23.getPlatformStyle()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r9)
            if (r9 == 0) goto L93
        L63:
            if (r5 == 0) goto L6f
            androidx.compose.ui.text.style.LineHeightStyle r9 = r23.getLineHeightStyle()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r9 == 0) goto L93
        L6f:
            if (r6 == 0) goto L7b
            androidx.compose.ui.text.style.LineBreak r9 = r23.m73129getLineBreakLgCVezo()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r9)
            if (r9 == 0) goto L93
        L7b:
            if (r7 == 0) goto L87
            androidx.compose.ui.text.style.Hyphens r9 = r23.m73127getHyphensEaSxIns()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)
            if (r9 == 0) goto L93
        L87:
            if (r8 == 0) goto Lf0
            androidx.compose.ui.text.style.TextMotion r9 = r23.getTextMotion()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r9 != 0) goto Lf0
        L93:
            boolean r9 = androidx.compose.p003ui.unit.TextUnitKt.m73857isUnspecifiedR2X_6o(r26)
            if (r9 == 0) goto L9f
            long r9 = r23.m73131getLineHeightXSAIIZE()
            r14 = r9
            goto La0
        L9f:
            r14 = r11
        La0:
            if (r3 != 0) goto La6
            androidx.compose.ui.text.style.TextIndent r3 = r23.getTextIndent()
        La6:
            r16 = r3
            if (r1 != 0) goto Lae
            androidx.compose.ui.text.style.TextAlign r1 = r23.m73132getTextAlignbuA522U()
        Lae:
            r12 = r1
            if (r2 != 0) goto Lb7
            androidx.compose.ui.text.style.TextDirection r1 = r23.m73134getTextDirectionmmuk1to()
            r13 = r1
            goto Lb8
        Lb7:
            r13 = r2
        Lb8:
            androidx.compose.ui.text.PlatformParagraphStyle r17 = m59100b(r0, r4)
            if (r5 != 0) goto Lc5
            androidx.compose.ui.text.style.LineHeightStyle r1 = r23.getLineHeightStyle()
            r18 = r1
            goto Lc7
        Lc5:
            r18 = r5
        Lc7:
            if (r6 != 0) goto Ld0
            androidx.compose.ui.text.style.LineBreak r1 = r23.m73129getLineBreakLgCVezo()
            r19 = r1
            goto Ld2
        Ld0:
            r19 = r6
        Ld2:
            if (r7 != 0) goto Ldb
            androidx.compose.ui.text.style.Hyphens r1 = r23.m73127getHyphensEaSxIns()
            r20 = r1
            goto Ldd
        Ldb:
            r20 = r7
        Ldd:
            if (r8 != 0) goto Le6
            androidx.compose.ui.text.style.TextMotion r0 = r23.getTextMotion()
            r21 = r0
            goto Le8
        Le6:
            r21 = r8
        Le8:
            androidx.compose.ui.text.ParagraphStyle r0 = new androidx.compose.ui.text.ParagraphStyle
            r22 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r16, r17, r18, r19, r20, r21, r22)
        Lf0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.text.ParagraphStyleKt.m73135fastMergeHtYhynw(androidx.compose.ui.text.ParagraphStyle, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, androidx.compose.ui.text.style.LineBreak, androidx.compose.ui.text.style.Hyphens, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    @Stable
    @NotNull
    public static final ParagraphStyle lerp(@NotNull ParagraphStyle start, @NotNull ParagraphStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(start.m73132getTextAlignbuA522U(), stop.m73132getTextAlignbuA522U(), f);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(start.m73134getTextDirectionmmuk1to(), stop.m73134getTextDirectionmmuk1to(), f);
        long m73182lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m73182lerpTextUnitInheritableC3pnCVY(start.m73131getLineHeightXSAIIZE(), stop.m73131getLineHeightXSAIIZE(), f);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(textAlign, textDirection, m73182lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f), m59101a(start.getPlatformStyle(), stop.getPlatformStyle(), f), (LineHeightStyle) SpanStyleKt.lerpDiscrete(start.getLineHeightStyle(), stop.getLineHeightStyle(), f), (LineBreak) SpanStyleKt.lerpDiscrete(start.m73129getLineBreakLgCVezo(), stop.m73129getLineBreakLgCVezo(), f), (Hyphens) SpanStyleKt.lerpDiscrete(start.m73127getHyphensEaSxIns(), stop.m73127getHyphensEaSxIns(), f), (TextMotion) SpanStyleKt.lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), f), (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final ParagraphStyle resolveParagraphStyleDefaults(@NotNull ParagraphStyle style, @NotNull LayoutDirection direction) {
        long m73131getLineHeightXSAIIZE;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        TextAlign m73541boximpl = TextAlign.m73541boximpl(style.m73133getTextAlignOrDefaulte0LSkKk$ui_text_release());
        TextDirection m73554boximpl = TextDirection.m73554boximpl(TextStyleKt.m73248resolveTextDirectionYj3eThk(direction, style.m73134getTextDirectionmmuk1to()));
        if (TextUnitKt.m73857isUnspecifiedR2X_6o(style.m73131getLineHeightXSAIIZE())) {
            m73131getLineHeightXSAIIZE = f31026a;
        } else {
            m73131getLineHeightXSAIIZE = style.m73131getLineHeightXSAIIZE();
        }
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = style.getPlatformStyle();
        LineHeightStyle lineHeightStyle = style.getLineHeightStyle();
        LineBreak m73471boximpl = LineBreak.m73471boximpl(style.m73130getLineBreakOrDefaultrAG3T2k$ui_text_release());
        Hyphens m73463boximpl = Hyphens.m73463boximpl(style.m73128getHyphensOrDefaultvmbZdU8$ui_text_release());
        TextMotion textMotion = style.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(m73541boximpl, m73554boximpl, m73131getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, m73471boximpl, m73463boximpl, textMotion, (DefaultConstructorMarker) null);
    }
}
