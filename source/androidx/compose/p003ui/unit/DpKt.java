package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a%\u0010:\u001a\u00020\u00022\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00109\u001a-\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a-\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a-\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u000eH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010C\u001a&\u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a&\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010I\u001a\"\u0010L\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010I\u001a\"\u0010O\u001a\u00020\b*\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010I\u001a*\u0010R\u001a\u00020\b*\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010P\u001a\u00020\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010A\u001a+\u0010T\u001a\u00020\b*\u00020\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010T\u001a\u00020\u0001*\u00020\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a+\u0010T\u001a\u00020\u0002*\u00020\u00022\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020VH\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b[\u0010Z\u001a\"\u0010\\\u001a\u00020\b*\u00020\t2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\"\u0010\\\u001a\u00020\b*\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010I\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\"\u0010\\\u001a\u00020\b*\u00020\u00112\u0006\u0010]\u001a\u00020\bH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00112\u0006\u0010.\u001a\u00020\u0002H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010c\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\b*\u00020\t8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\"\u0010\u0007\u001a\u00020\b*\u00020\u000e8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010\"\"\u0010\u0007\u001a\u00020\b*\u00020\u00118Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\n\u0010\u0012\u001a\u0004\b\f\u0010\u0013\"\"\u0010\u0014\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\"\u0010\u001a\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\"\u0010\u001f\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\b8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u001e\"\"\u0010'\u001a\u00020\u001b*\u00020\u00018Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010$\"\"\u0010'\u001a\u00020\u001b*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010$\"\"\u0010.\u001a\u00020\u0002*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010\u0017\u001a\u0004\b0\u00101\"\"\u00102\u001a\u00020\b*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006d"}, m28850d2 = {Constant.VIEW_CENTER, "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/ui/unit/DpSize;", "getCenter-EaSLcWc$annotations", "(J)V", "getCenter-EaSLcWc", "(J)J", "dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isSpecified-jo-Fl9I$annotations", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-EaSLcWc$annotations", "isSpecified-EaSLcWc", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "isUnspecified-jo-Fl9I$annotations", "isUnspecified-jo-Fl9I", "isUnspecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "size", "getSize$annotations", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "width", "getWidth$annotations", "getWidth", "DpOffset", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "DpOffset-YgX7TsA", "(FF)J", "DpSize", "DpSize-YgX7TsA", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "lerp-IDex15A", "max", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse-itqla9I", "times", "other", "times-3ABfNKs", "(DF)F", "times-6HolHcs", "(FJ)J", "(IF)F", "(IJ)J", "ui-unit_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n130#1:558\n337#1:562\n473#1:566\n544#1:570\n550#1:572\n25#2,3:559\n25#2,3:563\n71#3:567\n58#3:568\n58#3:569\n58#3:571\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n144#1:558\n351#1:562\n487#1:566\n556#1:570\n556#1:572\n254#1:559,3\n372#1:563,3\n495#1:567\n544#1:568\n550#1:569\n556#1:571\n*E\n"})
/* renamed from: androidx.compose.ui.unit.DpKt */
/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA */
    public static final long m73679DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m73714constructorimpl((Float.floatToIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA */
    public static final long m73680DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m73747constructorimpl((Float.floatToIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToIntBits(f) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA */
    public static final float m73681coerceAtLeastYgX7TsA(float f, float f2) {
        return C3641Dp.m73658constructorimpl(AbstractC11719c.coerceAtLeast(f, f2));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA */
    public static final float m73682coerceAtMostYgX7TsA(float f, float f2) {
        return C3641Dp.m73658constructorimpl(AbstractC11719c.coerceAtMost(f, f2));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ */
    public static final float m73683coerceIn2z7ARbQ(float f, float f2, float f3) {
        return C3641Dp.m73658constructorimpl(AbstractC11719c.coerceIn(f, f2, f3));
    }

    /* renamed from: getCenter-EaSLcWc */
    public static final long m73684getCenterEaSLcWc(long j) {
        return m73679DpOffsetYgX7TsA(C3641Dp.m73658constructorimpl(DpSize.m73756getWidthD9Ej5fM(j) / 2.0f), C3641Dp.m73658constructorimpl(DpSize.m73754getHeightD9Ej5fM(j) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations */
    public static /* synthetic */ void m73685getCenterEaSLcWc$annotations(long j) {
    }

    public static final float getDp(int i) {
        return C3641Dp.m73658constructorimpl(i);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static final float getHeight(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C3641Dp.m73658constructorimpl(dpRect.m73740getBottomD9Ej5fM() - dpRect.m73743getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return m73680DpSizeYgX7TsA(C3641Dp.m73658constructorimpl(dpRect.m73742getRightD9Ej5fM() - dpRect.m73741getLeftD9Ej5fM()), C3641Dp.m73658constructorimpl(dpRect.m73740getBottomD9Ej5fM() - dpRect.m73743getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return C3641Dp.m73658constructorimpl(dpRect.m73742getRightD9Ej5fM() - dpRect.m73741getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4 */
    public static final boolean m73686isFinite0680j_4(float f) {
        return !(f == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations */
    public static /* synthetic */ void m73687isFinite0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-0680j_4 */
    public static final boolean m73688isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations */
    public static /* synthetic */ void m73689isSpecified0680j_4$annotations(float f) {
    }

    /* renamed from: isSpecified-EaSLcWc */
    public static final boolean m73690isSpecifiedEaSLcWc(long j) {
        if (j != DpSize.Companion.m73765getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations */
    public static /* synthetic */ void m73691isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isSpecified-jo-Fl9I */
    public static final boolean m73692isSpecifiedjoFl9I(long j) {
        if (j != DpOffset.Companion.m73728getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m73693isSpecifiedjoFl9I$annotations(long j) {
    }

    /* renamed from: isUnspecified-0680j_4 */
    public static final boolean m73694isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations */
    public static /* synthetic */ void m73695isUnspecified0680j_4$annotations(float f) {
    }

    /* renamed from: isUnspecified-EaSLcWc */
    public static final boolean m73696isUnspecifiedEaSLcWc(long j) {
        if (j == DpSize.Companion.m73765getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations */
    public static /* synthetic */ void m73697isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* renamed from: isUnspecified-jo-Fl9I */
    public static final boolean m73698isUnspecifiedjoFl9I(long j) {
        if (j == DpOffset.Companion.m73728getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations */
    public static /* synthetic */ void m73699isUnspecifiedjoFl9I$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp-IDex15A */
    public static final long m73700lerpIDex15A(long j, long j2, float f) {
        return m73680DpSizeYgX7TsA(m73701lerpMdfbLM(DpSize.m73756getWidthD9Ej5fM(j), DpSize.m73756getWidthD9Ej5fM(j2), f), m73701lerpMdfbLM(DpSize.m73754getHeightD9Ej5fM(j), DpSize.m73754getHeightD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM */
    public static final float m73701lerpMdfbLM(float f, float f2, float f3) {
        return C3641Dp.m73658constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    @Stable
    /* renamed from: lerp-xhh869w */
    public static final long m73702lerpxhh869w(long j, long j2, float f) {
        return m73679DpOffsetYgX7TsA(m73701lerpMdfbLM(DpOffset.m73719getXD9Ej5fM(j), DpOffset.m73719getXD9Ej5fM(j2), f), m73701lerpMdfbLM(DpOffset.m73721getYD9Ej5fM(j), DpOffset.m73721getYD9Ej5fM(j2), f));
    }

    @Stable
    /* renamed from: max-YgX7TsA */
    public static final float m73703maxYgX7TsA(float f, float f2) {
        return C3641Dp.m73658constructorimpl(Math.max(f, f2));
    }

    @Stable
    /* renamed from: min-YgX7TsA */
    public static final float m73704minYgX7TsA(float f, float f2) {
        return C3641Dp.m73658constructorimpl(Math.min(f, f2));
    }

    /* renamed from: takeOrElse-D5KLDUw */
    public static final float m73705takeOrElseD5KLDUw(float f, @NotNull Function0<C3641Dp> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!Float.isNaN(f))) {
            return block.invoke().m73672unboximpl();
        }
        return f;
    }

    /* renamed from: takeOrElse-gVKV90s */
    public static final long m73706takeOrElsegVKV90s(long j, @NotNull Function0<DpOffset> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (j == DpOffset.Companion.m73728getUnspecifiedRKDOV3M()) {
            return block.invoke().m73727unboximpl();
        }
        return j;
    }

    /* renamed from: takeOrElse-itqla9I */
    public static final long m73707takeOrElseitqla9I(long j, @NotNull Function0<DpSize> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (j == DpSize.Companion.m73765getUnspecifiedMYxV2XQ()) {
            return block.invoke().m73764unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m73709times3ABfNKs(float f, float f2) {
        return C3641Dp.m73658constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m73712times6HolHcs(int i, long j) {
        return DpSize.m73762timesGh9hcWk(j, i);
    }

    public static final float getDp(double d) {
        return C3641Dp.m73658constructorimpl((float) d);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f) {
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m73708times3ABfNKs(double d, float f) {
        return C3641Dp.m73658constructorimpl(((float) d) * f);
    }

    @Stable
    /* renamed from: times-6HolHcs */
    public static final long m73711times6HolHcs(float f, long j) {
        return DpSize.m73761timesGh9hcWk(j, f);
    }

    public static final float getDp(float f) {
        return C3641Dp.m73658constructorimpl(f);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-3ABfNKs */
    public static final float m73710times3ABfNKs(int i, float f) {
        return C3641Dp.m73658constructorimpl(i * f);
    }
}
