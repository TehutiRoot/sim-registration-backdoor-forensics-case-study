package p000;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p003ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import androidx.compose.p003ui.graphics.colorspace.TransferParameters;
import androidx.compose.p003ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Nt */
/* loaded from: classes2.dex */
public final class C0975Nt {

    /* renamed from: a */
    public static final C0975Nt f4222a = new C0975Nt();

    /* renamed from: a */
    public static /* synthetic */ double m67165a(ColorSpace colorSpace, double d) {
        return m67156j(colorSpace, d);
    }

    /* renamed from: b */
    public static /* synthetic */ double m67164b(Function1 function1, double d) {
        return m67160f(function1, d);
    }

    /* renamed from: c */
    public static /* synthetic */ double m67163c(Function1 function1, double d) {
        return m67159g(function1, d);
    }

    /* renamed from: d */
    public static /* synthetic */ double m67162d(ColorSpace colorSpace, double d) {
        return m67157i(colorSpace, d);
    }

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    /* renamed from: e */
    public static final ColorSpace m67161e(@NotNull androidx.compose.p003ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb m69042a;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        ColorSpace.Named named17;
        ColorSpace colorSpace18;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace18 = ColorSpace.get(named17);
            Intrinsics.checkNotNullExpressionValue(colorSpace18, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace18;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace17 = ColorSpace.get(named16);
            Intrinsics.checkNotNullExpressionValue(colorSpace17, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace17;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace16 = ColorSpace.get(named15);
            Intrinsics.checkNotNullExpressionValue(colorSpace16, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace16;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace15 = ColorSpace.get(named14);
            Intrinsics.checkNotNullExpressionValue(colorSpace15, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace15;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace14 = ColorSpace.get(named13);
            Intrinsics.checkNotNullExpressionValue(colorSpace14, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace14;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace13 = ColorSpace.get(named12);
            Intrinsics.checkNotNullExpressionValue(colorSpace13, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace13;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace12 = ColorSpace.get(named11);
            Intrinsics.checkNotNullExpressionValue(colorSpace12, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace12;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace11 = ColorSpace.get(named10);
            Intrinsics.checkNotNullExpressionValue(colorSpace11, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace11;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = ColorSpace.get(named9);
            Intrinsics.checkNotNullExpressionValue(colorSpace10, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace10;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace9 = ColorSpace.get(named8);
            Intrinsics.checkNotNullExpressionValue(colorSpace9, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace9;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace8 = ColorSpace.get(named7);
            Intrinsics.checkNotNullExpressionValue(colorSpace8, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace8;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named6);
            Intrinsics.checkNotNullExpressionValue(colorSpace7, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace7;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace6 = ColorSpace.get(named5);
            Intrinsics.checkNotNullExpressionValue(colorSpace6, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace6;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace5 = ColorSpace.get(named4);
            Intrinsics.checkNotNullExpressionValue(colorSpace5, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace5;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace4 = ColorSpace.get(named3);
            Intrinsics.checkNotNullExpressionValue(colorSpace4, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace4;
        } else if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace3 = ColorSpace.get(named2);
            Intrinsics.checkNotNullExpressionValue(colorSpace3, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace3;
        } else {
            if (!(colorSpace instanceof Rgb)) {
                named = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named);
            } else {
                Rgb rgb = (Rgb) colorSpace;
                float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
                TransferParameters transferParameters2 = rgb.getTransferParameters();
                if (transferParameters2 != null) {
                    AbstractC0141Bt.m68851a();
                    transferParameters = AbstractC17156yt.m176a(transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
                } else {
                    transferParameters = null;
                }
                if (transferParameters != null) {
                    AbstractC0213Ct.m68723a();
                    m69042a = AbstractC17224zt.m21a(colorSpace.getName(), rgb.getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParameters);
                } else {
                    AbstractC0213Ct.m68723a();
                    String name = colorSpace.getName();
                    float[] primaries$ui_graphics_release = rgb.getPrimaries$ui_graphics_release();
                    final Function1<Double, Double> oetf = rgb.getOetf();
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: Jt
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            return C0975Nt.m67164b(oetf, d);
                        }
                    };
                    final Function1<Double, Double> eotf = rgb.getEotf();
                    m69042a = AbstractC0060At.m69042a(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: Kt
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            return C0975Nt.m67163c(eotf, d);
                        }
                    }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
                }
                colorSpace2 = AbstractC1492Us.m65968a(m69042a);
            }
            Intrinsics.checkNotNullExpressionValue(colorSpace2, "{\n                if (th…          }\n            }");
            return colorSpace2;
        }
    }

    /* renamed from: f */
    public static final double m67160f(Function1 tmp0, double d) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: g */
    public static final double m67159g(Function1 tmp0, double d) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(Double.valueOf(d))).doubleValue();
    }

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    /* renamed from: h */
    public static final androidx.compose.p003ui.graphics.colorspace.ColorSpace m67158h(@NotNull final ColorSpace colorSpace) {
        int id2;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        WhitePoint whitePoint2;
        float[] whitePoint3;
        float[] whitePoint4;
        TransferParameters transferParameters2;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id3;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        float[] whitePoint5;
        float[] whitePoint6;
        float[] whitePoint7;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        id2 = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id2 != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id2 != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id2 != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id2 != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id2 != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id2 != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id2 != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id2 != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id2 != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id2 != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id2 != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id2 != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id2 != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id2 != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id2 != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id2 == ordinal16) {
                                                                        return ColorSpaces.INSTANCE.getSmpteC();
                                                                    }
                                                                    if (AbstractC5407bt.m51802a(colorSpace)) {
                                                                        transferParameters = AbstractC10032ct.m31960a(colorSpace).getTransferParameters();
                                                                        whitePoint = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint5 = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                            float f = whitePoint5[0];
                                                                            whitePoint6 = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                            float f2 = whitePoint6[1];
                                                                            whitePoint7 = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                            whitePoint2 = new WhitePoint(f, f2, whitePoint7[2]);
                                                                        } else {
                                                                            whitePoint3 = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                            float f3 = whitePoint3[0];
                                                                            whitePoint4 = AbstractC10032ct.m31960a(colorSpace).getWhitePoint();
                                                                            whitePoint2 = new WhitePoint(f3, whitePoint4[1]);
                                                                        }
                                                                        WhitePoint whitePoint8 = whitePoint2;
                                                                        if (transferParameters != null) {
                                                                            d = transferParameters.g;
                                                                            d2 = transferParameters.a;
                                                                            d3 = transferParameters.b;
                                                                            d4 = transferParameters.c;
                                                                            d5 = transferParameters.d;
                                                                            d6 = transferParameters.e;
                                                                            d7 = transferParameters.f;
                                                                            transferParameters2 = new TransferParameters(d, d2, d3, d4, d5, d6, d7);
                                                                        } else {
                                                                            transferParameters2 = null;
                                                                        }
                                                                        name = AbstractC10032ct.m31960a(colorSpace).getName();
                                                                        Intrinsics.checkNotNullExpressionValue(name, "this.name");
                                                                        primaries = AbstractC10032ct.m31960a(colorSpace).getPrimaries();
                                                                        Intrinsics.checkNotNullExpressionValue(primaries, "this.primaries");
                                                                        transform = AbstractC10032ct.m31960a(colorSpace).getTransform();
                                                                        DoubleFunction doubleFunction = new DoubleFunction() { // from class: Lt
                                                                            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
                                                                            public final double invoke(double d8) {
                                                                                return C0975Nt.m67162d(colorSpace, d8);
                                                                            }
                                                                        };
                                                                        DoubleFunction doubleFunction2 = new DoubleFunction() { // from class: Mt
                                                                            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
                                                                            public final double invoke(double d8) {
                                                                                return C0975Nt.m67165a(colorSpace, d8);
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id3 = AbstractC10032ct.m31960a(colorSpace).getId();
                                                                        return new Rgb(name, primaries, whitePoint8, transform, doubleFunction, doubleFunction2, minValue, maxValue, transferParameters2, id3);
                                                                    }
                                                                    return ColorSpaces.INSTANCE.getSrgb();
                                                                }
                                                                return ColorSpaces.INSTANCE.getProPhotoRgb();
                                                            }
                                                            return ColorSpaces.INSTANCE.getNtsc1953();
                                                        }
                                                        return ColorSpaces.INSTANCE.getLinearSrgb();
                                                    }
                                                    return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
                                                }
                                                return ColorSpaces.INSTANCE.getExtendedSrgb();
                                            }
                                            return ColorSpaces.INSTANCE.getDisplayP3();
                                        }
                                        return ColorSpaces.INSTANCE.getDciP3();
                                    }
                                    return ColorSpaces.INSTANCE.getCieXyz();
                                }
                                return ColorSpaces.INSTANCE.getCieLab();
                            }
                            return ColorSpaces.INSTANCE.getBt709();
                        }
                        return ColorSpaces.INSTANCE.getBt2020();
                    }
                    return ColorSpaces.INSTANCE.getAdobeRgb();
                }
                return ColorSpaces.INSTANCE.getAcescg();
            }
            return ColorSpaces.INSTANCE.getAces();
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    /* renamed from: i */
    public static final double m67157i(ColorSpace this_composeColorSpace, double d) {
        DoubleUnaryOperator oetf;
        double applyAsDouble;
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        oetf = AbstractC10032ct.m31960a(this_composeColorSpace).getOetf();
        applyAsDouble = oetf.applyAsDouble(d);
        return applyAsDouble;
    }

    /* renamed from: j */
    public static final double m67156j(ColorSpace this_composeColorSpace, double d) {
        DoubleUnaryOperator eotf;
        double applyAsDouble;
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        eotf = AbstractC10032ct.m31960a(this_composeColorSpace).getEotf();
        applyAsDouble = eotf.applyAsDouble(d);
        return applyAsDouble;
    }
}
