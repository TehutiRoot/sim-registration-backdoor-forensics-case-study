package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\f\u001a\u00020\u0003*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0086\bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0011\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001a\"\u0010\u0015\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010\u001a-\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0000H\u0007ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\"\"\u0010!\u001a\u00020\u001c*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\"\"\u0010$\u001a\u00020\u001c*\u00020\u00038Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001e\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m28850d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)F", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n130#1:201\n25#2,3:198\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n144#1:201\n31#1:198,3\n*E\n"})
/* renamed from: androidx.compose.ui.layout.ScaleFactorKt */
/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f2) {
        return ScaleFactor.m72863constructorimpl((Float.floatToIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToIntBits(f) << 32));
    }

    /* renamed from: a */
    public static final float m59521a(float f) {
        float f2 = 10;
        float f3 = f * f2;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        return i / f2;
    }

    @Stable
    /* renamed from: div-UQTWf7w */
    public static final long m72877divUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m71571getWidthimpl(j) / ScaleFactor.m72869getScaleXimpl(j2), Size.m71568getHeightimpl(j) / ScaleFactor.m72870getScaleYimpl(j2));
    }

    /* renamed from: isSpecified-FK8aYYs */
    public static final boolean m72878isSpecifiedFK8aYYs(long j) {
        if (j != ScaleFactor.Companion.m72876getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations */
    public static /* synthetic */ void m72879isSpecifiedFK8aYYs$annotations(long j) {
    }

    /* renamed from: isUnspecified-FK8aYYs */
    public static final boolean m72880isUnspecifiedFK8aYYs(long j) {
        if (j == ScaleFactor.Companion.m72876getUnspecified_hLwfpc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations */
    public static /* synthetic */ void m72881isUnspecifiedFK8aYYs$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp--bDIf60 */
    public static final long m72882lerpbDIf60(long j, long j2, float f) {
        return ScaleFactor(MathHelpersKt.lerp(ScaleFactor.m72869getScaleXimpl(j), ScaleFactor.m72869getScaleXimpl(j2), f), MathHelpersKt.lerp(ScaleFactor.m72870getScaleYimpl(j), ScaleFactor.m72870getScaleYimpl(j2), f));
    }

    /* renamed from: takeOrElse-oyDd2qo */
    public static final long m72883takeOrElseoyDd2qo(long j, @NotNull Function0<ScaleFactor> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (j == ScaleFactor.Companion.m72876getUnspecified_hLwfpc()) {
            return block.invoke().m72874unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-UQTWf7w */
    public static final long m72884timesUQTWf7w(long j, long j2) {
        return SizeKt.Size(Size.m71571getWidthimpl(j) * ScaleFactor.m72869getScaleXimpl(j2), Size.m71568getHeightimpl(j) * ScaleFactor.m72870getScaleYimpl(j2));
    }

    @Stable
    /* renamed from: times-m-w2e94 */
    public static final long m72885timesmw2e94(long j, long j2) {
        return m72884timesUQTWf7w(j2, j);
    }
}
