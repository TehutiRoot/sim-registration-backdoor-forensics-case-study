package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010'\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010*\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u0017\u0010-\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u0017\u00100\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u0017\u00103\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010#R\u0017\u00106\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u0017\u00109\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#R\u0017\u0010<\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u0017\u0010?\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b=\u0010!\u001a\u0004\b>\u0010#R\u0017\u0010B\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010#R\u0017\u0010E\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bC\u0010!\u001a\u0004\bD\u0010#R\u0017\u0010H\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bG\u0010#R\u0017\u0010K\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bI\u0010!\u001a\u0004\bJ\u0010#R\u0017\u0010P\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010S\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR\u001a\u0010V\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010!\u001a\u0004\bU\u0010#R\u0017\u0010Y\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010OR \u0010_\u001a\b\u0012\u0004\u0012\u00020\b0Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006`"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "<init>", "()V", "", "toXYZD50", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "function", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "match", "([FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "id", "getColorSpace$ui_graphics_release", "(I)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", PDPageLabelRange.STYLE_LETTERS_LOWER, "[F", "getSrgbPrimaries$ui_graphics_release", "()[F", "SrgbPrimaries", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getNtsc1953Primaries$ui_graphics_release", "Ntsc1953Primaries", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "SrgbTransferParameters", "d", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "e", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getSrgb", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", OperatorName.FILL_NON_ZERO, "getLinearSrgb", "LinearSrgb", OperatorName.NON_STROKING_GRAY, "getExtendedSrgb", "ExtendedSrgb", OperatorName.CLOSE_PATH, "getLinearExtendedSrgb", "LinearExtendedSrgb", "i", "getBt709", "Bt709", OperatorName.SET_LINE_JOINSTYLE, "getBt2020", "Bt2020", OperatorName.NON_STROKING_CMYK, "getDciP3", "DciP3", OperatorName.LINE_TO, "getDisplayP3", "DisplayP3", OperatorName.MOVE_TO, "getNtsc1953", "Ntsc1953", OperatorName.ENDPATH, "getSmpteC", "SmpteC", "o", "getAdobeRgb", "AdobeRgb", "p", "getProPhotoRgb", "ProPhotoRgb", OperatorName.SAVE, "getAces", "Aces", PDPageLabelRange.STYLE_ROMAN_LOWER, "getAcescg", "Acescg", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieXyz", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "t", "getCieLab", "CieLab", "u", "getUnspecified$ui_graphics_release", "Unspecified", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getOklab", "Oklab", "", OperatorName.SET_LINE_WIDTH, "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ColorSpacesArray", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaces */
/* loaded from: classes2.dex */
public final class ColorSpaces {
    @NotNull
    public static final ColorSpaces INSTANCE = new ColorSpaces();

    /* renamed from: a */
    public static final float[] f29227a;

    /* renamed from: b */
    public static final float[] f29228b;

    /* renamed from: c */
    public static final TransferParameters f29229c;

    /* renamed from: d */
    public static final TransferParameters f29230d;

    /* renamed from: e */
    public static final Rgb f29231e;

    /* renamed from: f */
    public static final Rgb f29232f;

    /* renamed from: g */
    public static final Rgb f29233g;

    /* renamed from: h */
    public static final Rgb f29234h;

    /* renamed from: i */
    public static final Rgb f29235i;

    /* renamed from: j */
    public static final Rgb f29236j;

    /* renamed from: k */
    public static final Rgb f29237k;

    /* renamed from: l */
    public static final Rgb f29238l;

    /* renamed from: m */
    public static final Rgb f29239m;

    /* renamed from: n */
    public static final Rgb f29240n;

    /* renamed from: o */
    public static final Rgb f29241o;

    /* renamed from: p */
    public static final Rgb f29242p;

    /* renamed from: q */
    public static final Rgb f29243q;

    /* renamed from: r */
    public static final Rgb f29244r;

    /* renamed from: s */
    public static final ColorSpace f29245s;

    /* renamed from: t */
    public static final ColorSpace f29246t;

    /* renamed from: u */
    public static final Rgb f29247u;

    /* renamed from: v */
    public static final ColorSpace f29248v;

    /* renamed from: w */
    public static final ColorSpace[] f29249w;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f29227a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f29228b = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f29229c = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f29230d = transferParameters2;
        Illuminant illuminant = Illuminant.INSTANCE;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, illuminant.getD65(), transferParameters, 0);
        f29231e = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, illuminant.getD65(), 1.0d, 0.0f, 1.0f, 1);
        f29232f = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, illuminant.getD65(), null, new DoubleFunction() { // from class: Ot
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return ColorSpaces.m59733a(d);
            }
        }, new DoubleFunction() { // from class: Pt
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return ColorSpaces.m59732b(d);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        f29233g = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, illuminant.getD65(), 1.0d, -0.5f, 7.499f, 3);
        f29234h = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f29235i = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f29236j = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f29237k = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, illuminant.getD65(), transferParameters, 7);
        f29238l = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, illuminant.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f29239m = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, illuminant.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f29240n = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, illuminant.getD65(), 2.2d, 0.0f, 1.0f, 10);
        f29241o = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, illuminant.getD50(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f29242p = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        f29243q = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, illuminant.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        f29244r = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        f29245s = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        f29246t = lab;
        Rgb rgb15 = new Rgb("None", fArr, illuminant.getD65(), transferParameters2, 16);
        f29247u = rgb15;
        Oklab oklab = new Oklab("Oklab", 17);
        f29248v = oklab;
        f29249w = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, oklab};
    }

    /* renamed from: a */
    public static /* synthetic */ double m59733a(double d) {
        return m59731c(d);
    }

    /* renamed from: b */
    public static /* synthetic */ double m59732b(double d) {
        return m59730d(d);
    }

    /* renamed from: c */
    public static final double m59731c(double d) {
        return ColorSpaceKt.absRcpResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: d */
    public static final double m59730d(double d) {
        return ColorSpaceKt.absResponse(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @NotNull
    public final Rgb getAces() {
        return f29243q;
    }

    @NotNull
    public final Rgb getAcescg() {
        return f29244r;
    }

    @NotNull
    public final Rgb getAdobeRgb() {
        return f29241o;
    }

    @NotNull
    public final Rgb getBt2020() {
        return f29236j;
    }

    @NotNull
    public final Rgb getBt709() {
        return f29235i;
    }

    @NotNull
    public final ColorSpace getCieLab() {
        return f29246t;
    }

    @NotNull
    public final ColorSpace getCieXyz() {
        return f29245s;
    }

    @NotNull
    public final ColorSpace getColorSpace$ui_graphics_release(int i) {
        return getColorSpacesArray$ui_graphics_release()[i];
    }

    @NotNull
    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return f29249w;
    }

    @NotNull
    public final Rgb getDciP3() {
        return f29237k;
    }

    @NotNull
    public final Rgb getDisplayP3() {
        return f29238l;
    }

    @NotNull
    public final Rgb getExtendedSrgb() {
        return f29233g;
    }

    @NotNull
    public final Rgb getLinearExtendedSrgb() {
        return f29234h;
    }

    @NotNull
    public final Rgb getLinearSrgb() {
        return f29232f;
    }

    @NotNull
    public final Rgb getNtsc1953() {
        return f29239m;
    }

    @NotNull
    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return f29228b;
    }

    @NotNull
    public final ColorSpace getOklab() {
        return f29248v;
    }

    @NotNull
    public final Rgb getProPhotoRgb() {
        return f29242p;
    }

    @NotNull
    public final Rgb getSmpteC() {
        return f29240n;
    }

    @NotNull
    public final Rgb getSrgb() {
        return f29231e;
    }

    @NotNull
    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return f29227a;
    }

    @NotNull
    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return f29229c;
    }

    @NotNull
    public final Rgb getUnspecified$ui_graphics_release() {
        return f29247u;
    }

    @Nullable
    public final ColorSpace match(@NotNull float[] toXYZD50, @NotNull TransferParameters function) {
        ColorSpace[] colorSpaceArr;
        Intrinsics.checkNotNullParameter(toXYZD50, "toXYZD50");
        Intrinsics.checkNotNullParameter(function, "function");
        for (ColorSpace colorSpace : f29249w) {
            if (ColorModel.m72096equalsimpl0(colorSpace.m72105getModelxdoWZVw(), ColorModel.Companion.m72103getRgbxdoWZVw())) {
                ColorSpace adapt$default = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
                Intrinsics.checkNotNull(adapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) adapt$default;
                if (ColorSpaceKt.compare(toXYZD50, rgb.getTransform$ui_graphics_release()) && ColorSpaceKt.compare(function, rgb.getTransferParameters())) {
                    return colorSpace;
                }
            }
        }
        return null;
    }
}
