package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.graphics.colorspace.ColorModel;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p003ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010\"\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a+\u0010'\u001a\u00020\u0007*\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&\"\"\u0010-\u001a\u00020(*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*\"\"\u00100\u001a\u00020(*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010*\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u00061"}, m28850d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", TypedValues.Custom.S_COLOR, "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "luminance-8_81llA", "(J)F", "luminance", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)F", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,672:1\n587#1:673\n587#1:674\n587#1:675\n646#1:676\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:673\n568#1:674\n569#1:675\n658#1:676\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ColorKt */
/* loaded from: classes2.dex */
public final class ColorKt {
    @Stable
    public static final long Color(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f <= colorSpace.getMaxValue(0) && minValue <= f) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f2 <= colorSpace.getMaxValue(1) && minValue2 <= f2) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f3 <= colorSpace.getMaxValue(2) && minValue3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.isSrgb()) {
                        return Color.m71731constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & BodyPartID.bodyIdMax) << 32));
                    } else if (colorSpace.getComponentCount() == 3) {
                        int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
                        if (id$ui_graphics_release != -1) {
                            short m71835constructorimpl = Float16.m71835constructorimpl(f);
                            short m71835constructorimpl2 = Float16.m71835constructorimpl(f2);
                            short m71835constructorimpl3 = Float16.m71835constructorimpl(f3);
                            return Color.m71731constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(m71835constructorimpl2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(m71835constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(m71835constructorimpl3) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m74146constructorimpl(ULong.m74146constructorimpl(id$ui_graphics_release) & 63)));
                        }
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    } else {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                    }
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    /* renamed from: a */
    public static final float m59751a(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI */
    public static final long m71780compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m71732convertvNxB06k = Color.m71732convertvNxB06k(j, Color.m71739getColorSpaceimpl(j2));
        float m71737getAlphaimpl = Color.m71737getAlphaimpl(j2);
        float m71737getAlphaimpl2 = Color.m71737getAlphaimpl(m71732convertvNxB06k);
        float f3 = 1.0f - m71737getAlphaimpl2;
        float f4 = (m71737getAlphaimpl * f3) + m71737getAlphaimpl2;
        float m71741getRedimpl = Color.m71741getRedimpl(m71732convertvNxB06k);
        float m71741getRedimpl2 = Color.m71741getRedimpl(j2);
        float f5 = 0.0f;
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i == 0) {
            f = 0.0f;
        } else {
            f = ((m71741getRedimpl * m71737getAlphaimpl2) + ((m71741getRedimpl2 * m71737getAlphaimpl) * f3)) / f4;
        }
        float m71740getGreenimpl = Color.m71740getGreenimpl(m71732convertvNxB06k);
        float m71740getGreenimpl2 = Color.m71740getGreenimpl(j2);
        if (i == 0) {
            f2 = 0.0f;
        } else {
            f2 = ((m71740getGreenimpl * m71737getAlphaimpl2) + ((m71740getGreenimpl2 * m71737getAlphaimpl) * f3)) / f4;
        }
        float m71738getBlueimpl = Color.m71738getBlueimpl(m71732convertvNxB06k);
        float m71738getBlueimpl2 = Color.m71738getBlueimpl(j2);
        if (i != 0) {
            f5 = ((m71738getBlueimpl * m71737getAlphaimpl2) + ((m71738getBlueimpl2 * m71737getAlphaimpl) * f3)) / f4;
        }
        return Color(f, f2, f5, f4, Color.m71739getColorSpaceimpl(j2));
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m71781isSpecified8_81llA(long j) {
        if (j != Color.Companion.m71771getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m71782isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m71783isUnspecified8_81llA(long j) {
        if (j == Color.Companion.m71771getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m71784isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM */
    public static final long m71785lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m71732convertvNxB06k = Color.m71732convertvNxB06k(j, oklab);
        long m71732convertvNxB06k2 = Color.m71732convertvNxB06k(j2, oklab);
        float m71737getAlphaimpl = Color.m71737getAlphaimpl(m71732convertvNxB06k);
        float m71741getRedimpl = Color.m71741getRedimpl(m71732convertvNxB06k);
        float m71740getGreenimpl = Color.m71740getGreenimpl(m71732convertvNxB06k);
        float m71738getBlueimpl = Color.m71738getBlueimpl(m71732convertvNxB06k);
        float m71737getAlphaimpl2 = Color.m71737getAlphaimpl(m71732convertvNxB06k2);
        float m71741getRedimpl2 = Color.m71741getRedimpl(m71732convertvNxB06k2);
        float m71740getGreenimpl2 = Color.m71740getGreenimpl(m71732convertvNxB06k2);
        float m71738getBlueimpl2 = Color.m71738getBlueimpl(m71732convertvNxB06k2);
        return Color.m71732convertvNxB06k(Color(MathHelpersKt.lerp(m71741getRedimpl, m71741getRedimpl2, f), MathHelpersKt.lerp(m71740getGreenimpl, m71740getGreenimpl2, f), MathHelpersKt.lerp(m71738getBlueimpl, m71738getBlueimpl2, f), MathHelpersKt.lerp(m71737getAlphaimpl, m71737getAlphaimpl2, f), oklab), Color.m71739getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: luminance-8_81llA */
    public static final float m71786luminance8_81llA(long j) {
        ColorSpace m71739getColorSpaceimpl = Color.m71739getColorSpaceimpl(j);
        if (ColorModel.m72096equalsimpl0(m71739getColorSpaceimpl.m72105getModelxdoWZVw(), ColorModel.Companion.m72103getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(m71739getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) m71739getColorSpaceimpl).getEotfFunc$ui_graphics_release();
            return m59751a((float) ((eotfFunc$ui_graphics_release.invoke(Color.m71741getRedimpl(j)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m71740getGreenimpl(j)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m71738getBlueimpl(j)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m72099toStringimpl(m71739getColorSpaceimpl.m72105getModelxdoWZVw()))).toString());
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m71787takeOrElseDxMtmZc(long j, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (j == Color.Companion.m71771getUnspecified0d7_KjU()) {
            return block.invoke().m71745unboximpl();
        }
        return j;
    }

    @Stable
    /* renamed from: toArgb-8_81llA */
    public static final int m71788toArgb8_81llA(long j) {
        return (int) ULong.m74146constructorimpl(Color.m71732convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m71731constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m71731constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(ULong.m74146constructorimpl(j) & BodyPartID.bodyIdMax) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
