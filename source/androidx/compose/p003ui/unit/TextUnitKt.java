package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a#\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0004*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0086\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0006\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0011\u001a\"\u0010\u000f\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0013\u001a\"\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0000H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a-\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a-\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0000H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\"\"\u0010.\u001a\u00020**\u00020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b-\u0010\u001c\u001a\u0004\b+\u0010,\"!\u00101\u001a\u00020**\u00020\u00048FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b0\u0010\u001c\u001a\u0004\b/\u0010,\"!\u00106\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"!\u00109\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\"!\u00106\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010;\u001a\u0004\b2\u0010:\"!\u00109\u001a\u00020\u0004*\u00020\u00108FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u0010;\u001a\u0004\b7\u0010:\"!\u00106\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b4\u0010=\u001a\u0004\b2\u0010<\"!\u00109\u001a\u00020\u0004*\u00020\u00128FX\u0087\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b8\u0010=\u001a\u0004\b7\u0010<\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006>"}, m28850d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "Lkotlin/Function0;", "block", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "other", "times-mpE4wyQ", "times", "", "(DJ)J", "", "(IJ)J", "", "unitType", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "pack", "(JF)J", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "checkArithmetic-NB67dxo", "(JJ)V", OperatorName.CURVE_TO, "checkArithmetic-vU-0ePk", "(JJJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "", "isSpecified--R2X_6o", "(J)Z", "isSpecified--R2X_6o$annotations", "isSpecified", "isUnspecified--R2X_6o", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "getEm", "getEm$annotations", "em", "(D)J", "(D)V", "(I)J", "(I)V", "ui-unit_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,388:1\n250#1:389\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n264#1:389\n*E\n"})
/* renamed from: androidx.compose.ui.unit.TextUnitKt */
/* loaded from: classes2.dex */
public final class TextUnitKt {
    /* renamed from: TextUnit-anM5pPY  reason: not valid java name */
    public static final long m73851TextUnitanM5pPY(float f, long j) {
        return pack(j, f);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o  reason: not valid java name */
    public static final void m73852checkArithmeticR2X_6o(long j) {
        if (!m73857isUnspecifiedR2X_6o(j)) {
            return;
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo  reason: not valid java name */
    public static final void m73853checkArithmeticNB67dxo(long j, long j2) {
        if (!m73857isUnspecifiedR2X_6o(j) && !m73857isUnspecifiedR2X_6o(j2)) {
            if (TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), TextUnit.m73838getTypeUIouoOA(j2))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m73869toStringimpl(TextUnit.m73838getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m73869toStringimpl(TextUnit.m73838getTypeUIouoOA(j2)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk  reason: not valid java name */
    public static final void m73854checkArithmeticvU0ePk(long j, long j2, long j3) {
        if (!m73857isUnspecifiedR2X_6o(j) && !m73857isUnspecifiedR2X_6o(j2) && !m73857isUnspecifiedR2X_6o(j3)) {
            if (TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j), TextUnit.m73838getTypeUIouoOA(j2)) && TextUnitType.m73867equalsimpl0(TextUnit.m73838getTypeUIouoOA(j2), TextUnit.m73838getTypeUIouoOA(j3))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m73869toStringimpl(TextUnit.m73838getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m73869toStringimpl(TextUnit.m73838getTypeUIouoOA(j2)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long getEm(float f) {
        return pack(8589934592L, f);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d) {
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d) {
    }

    /* renamed from: isSpecified--R2X_6o  reason: not valid java name */
    public static final boolean m73855isSpecifiedR2X_6o(long j) {
        return !m73857isUnspecifiedR2X_6o(j);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m73856isSpecifiedR2X_6o$annotations(long j) {
    }

    /* renamed from: isUnspecified--R2X_6o  reason: not valid java name */
    public static final boolean m73857isUnspecifiedR2X_6o(long j) {
        if (TextUnit.m73837getRawTypeimpl(j) == 0) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m73858isUnspecifiedR2X_6o$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY  reason: not valid java name */
    public static final long m73859lerpC3pnCVY(long j, long j2, float f) {
        m73853checkArithmeticNB67dxo(j, j2);
        return pack(TextUnit.m73837getRawTypeimpl(j), MathHelpersKt.lerp(TextUnit.m73839getValueimpl(j), TextUnit.m73839getValueimpl(j2), f));
    }

    @PublishedApi
    public static final long pack(long j, float f) {
        return TextUnit.m73831constructorimpl(j | (Float.floatToIntBits(f) & BodyPartID.bodyIdMax));
    }

    /* renamed from: takeOrElse-eAf_CNQ  reason: not valid java name */
    public static final long m73860takeOrElseeAf_CNQ(long j, @NotNull Function0<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!(!m73857isUnspecifiedR2X_6o(j))) {
            return block.invoke().m73848unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m73862timesmpE4wyQ(float f, long j) {
        m73852checkArithmeticR2X_6o(j);
        return pack(TextUnit.m73837getRawTypeimpl(j), f * TextUnit.m73839getValueimpl(j));
    }

    public static final long getEm(double d) {
        return pack(8589934592L, (float) d);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f) {
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f) {
    }

    public static final long getEm(int i) {
        return pack(8589934592L, i);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i) {
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i) {
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m73861timesmpE4wyQ(double d, long j) {
        m73852checkArithmeticR2X_6o(j);
        return pack(TextUnit.m73837getRawTypeimpl(j), ((float) d) * TextUnit.m73839getValueimpl(j));
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m73863timesmpE4wyQ(int i, long j) {
        m73852checkArithmeticR2X_6o(j);
        return pack(TextUnit.m73837getRawTypeimpl(j), i * TextUnit.m73839getValueimpl(j));
    }
}
