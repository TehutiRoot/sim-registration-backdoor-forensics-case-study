package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b&\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J5\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J-\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b+\u0010!J\u0015\u0010.\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b-\u0010!J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\t¢\u0006\u0004\b/\u0010!J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u0013J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b3\u0010\u0013J\u0010\u00108\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u0010;\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010@\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010A\u001a\u0004\bB\u0010C\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m28850d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "values", "constructor-impl", "([F)[F", "", "row", "column", "", "get-impl", "([FII)F", "get", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "", "set-impl", "([FIIF)V", "set", "reset-impl", "([F)V", "reset", "src", "set-jHG-Opc", "([F[F)V", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", "m1", "m2", PDPageLabelRange.STYLE_LETTERS_LOWER, "([F[FI[FI)F", "sat", "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "degrees", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "[F", "getValues", "()[F", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,328:1\n97#1,2:329\n97#1,2:331\n97#1,2:333\n97#1,2:335\n84#1:337\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n97#1,2:357\n97#1,2:359\n97#1,2:361\n97#1,2:363\n97#1,2:365\n97#1,2:367\n97#1,2:369\n97#1,2:371\n97#1,2:373\n97#1,2:375\n97#1,2:377\n97#1,2:379\n97#1,2:381\n97#1,2:383\n97#1,2:385\n97#1,2:387\n97#1,2:389\n97#1,2:391\n97#1,2:393\n97#1,2:395\n84#1:397\n84#1:398\n84#1:399\n84#1:400\n97#1,2:401\n97#1,2:403\n97#1,2:405\n97#1,2:407\n97#1,2:409\n97#1,2:411\n97#1,2:413\n97#1,2:415\n97#1,2:417\n97#1,2:419\n97#1,2:421\n97#1,2:423\n97#1,2:425\n133#1,5:427\n97#1,2:432\n97#1,2:434\n97#1,2:436\n97#1,2:438\n138#1:440\n133#1,5:441\n97#1,2:446\n97#1,2:448\n97#1,2:450\n97#1,2:452\n138#1:454\n133#1,5:455\n97#1,2:460\n97#1,2:462\n97#1,2:464\n97#1,2:466\n138#1:468\n97#1,2:469\n97#1,2:471\n97#1,2:473\n97#1,2:475\n97#1,2:477\n97#1,2:479\n97#1,2:481\n97#1,2:483\n97#1,2:485\n97#1,2:487\n97#1,2:489\n97#1,2:491\n97#1,2:493\n97#1,2:495\n97#1,2:497\n97#1,2:499\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:329,2\n112#1:331,2\n113#1:333,2\n114#1:335,2\n148#1:337\n149#1:338\n150#1:339\n151#1:340\n152#1:341\n158#1:342\n159#1:343\n160#1:344\n161#1:345\n162#1:346\n168#1:347\n169#1:348\n170#1:349\n171#1:350\n172#1:351\n178#1:352\n179#1:353\n180#1:354\n181#1:355\n182#1:356\n184#1:357,2\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n211#1:397\n212#1:398\n213#1:399\n214#1:400\n228#1:401,2\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n255#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n265#1:427,5\n266#1:432,2\n267#1:434,2\n268#1:436,2\n269#1:438,2\n265#1:440\n277#1:441,5\n278#1:446,2\n279#1:448,2\n280#1:450,2\n281#1:452,2\n277#1:454\n289#1:455,5\n290#1:460,2\n291#1:462,2\n292#1:464,2\n293#1:466,2\n289#1:468\n303#1:469,2\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n320#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.ColorMatrix */
/* loaded from: classes2.dex */
public final class ColorMatrix {

    /* renamed from: a */
    public final float[] f29048a;

    public /* synthetic */ ColorMatrix(float[] fArr) {
        this.f29048a = fArr;
    }

    /* renamed from: a */
    public static final float m59750a(float[] fArr, float[] fArr2, int i, float[] fArr3, int i2) {
        int i3 = i * 5;
        return (fArr2[i3] * fArr3[i2]) + (fArr2[i3 + 1] * fArr3[5 + i2]) + (fArr2[i3 + 2] * fArr3[10 + i2]) + (fArr2[i3 + 3] * fArr3[15 + i2]);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m71789boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl  reason: not valid java name */
    public static float[] m71790constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default  reason: not valid java name */
    public static /* synthetic */ float[] m71791constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m71790constructorimpl(fArr);
    }

    /* renamed from: convertRgbToYuv-impl  reason: not valid java name */
    public static final void m71792convertRgbToYuvimpl(float[] fArr) {
        m71798resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl  reason: not valid java name */
    public static final void m71793convertYuvToRgbimpl(float[] fArr) {
        m71798resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m71794equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m71808unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m71795equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl  reason: not valid java name */
    public static final float m71796getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m71797hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: reset-impl  reason: not valid java name */
    public static final void m71798resetimpl(float[] fArr) {
        ArraysKt___ArraysJvmKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* renamed from: set-impl  reason: not valid java name */
    public static final void m71799setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: set-jHG-Opc  reason: not valid java name */
    public static final void m71800setjHGOpc(float[] fArr, @NotNull float[] src) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt___ArraysJvmKt.copyInto$default(src, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* renamed from: setToRotateBlue-impl  reason: not valid java name */
    public static final void m71801setToRotateBlueimpl(float[] fArr, float f) {
        m71798resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[6] = cos;
        fArr[0] = cos;
        fArr[1] = sin;
        fArr[5] = -sin;
    }

    /* renamed from: setToRotateGreen-impl  reason: not valid java name */
    public static final void m71802setToRotateGreenimpl(float[] fArr, float f) {
        m71798resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[0] = cos;
        fArr[2] = -sin;
        fArr[10] = sin;
    }

    /* renamed from: setToRotateRed-impl  reason: not valid java name */
    public static final void m71803setToRotateRedimpl(float[] fArr, float f) {
        m71798resetimpl(fArr);
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        fArr[12] = cos;
        fArr[6] = cos;
        fArr[7] = sin;
        fArr[11] = -sin;
    }

    /* renamed from: setToSaturation-impl  reason: not valid java name */
    public static final void m71804setToSaturationimpl(float[] fArr, float f) {
        m71798resetimpl(fArr);
        float f2 = 1 - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl  reason: not valid java name */
    public static final void m71805setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        m71798resetimpl(fArr);
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: timesAssign-jHG-Opc  reason: not valid java name */
    public static final void m71806timesAssignjHGOpc(float[] fArr, @NotNull float[] colorMatrix) {
        Intrinsics.checkNotNullParameter(colorMatrix, "colorMatrix");
        float m59750a = m59750a(fArr, fArr, 0, colorMatrix, 0);
        float m59750a2 = m59750a(fArr, fArr, 0, colorMatrix, 1);
        float m59750a3 = m59750a(fArr, fArr, 0, colorMatrix, 2);
        float m59750a4 = m59750a(fArr, fArr, 0, colorMatrix, 3);
        float f = (fArr[0] * colorMatrix[4]) + (fArr[1] * colorMatrix[9]) + (fArr[2] * colorMatrix[14]) + (fArr[3] * colorMatrix[19]) + fArr[4];
        float m59750a5 = m59750a(fArr, fArr, 1, colorMatrix, 0);
        float m59750a6 = m59750a(fArr, fArr, 1, colorMatrix, 1);
        float m59750a7 = m59750a(fArr, fArr, 1, colorMatrix, 2);
        float m59750a8 = m59750a(fArr, fArr, 1, colorMatrix, 3);
        float f2 = (fArr[5] * colorMatrix[4]) + (fArr[6] * colorMatrix[9]) + (fArr[7] * colorMatrix[14]) + (fArr[8] * colorMatrix[19]) + fArr[9];
        float m59750a9 = m59750a(fArr, fArr, 2, colorMatrix, 0);
        float m59750a10 = m59750a(fArr, fArr, 2, colorMatrix, 1);
        float m59750a11 = m59750a(fArr, fArr, 2, colorMatrix, 2);
        float m59750a12 = m59750a(fArr, fArr, 2, colorMatrix, 3);
        float f3 = (fArr[10] * colorMatrix[4]) + (fArr[11] * colorMatrix[9]) + (fArr[12] * colorMatrix[14]) + (fArr[13] * colorMatrix[19]) + fArr[14];
        float m59750a13 = m59750a(fArr, fArr, 3, colorMatrix, 0);
        float m59750a14 = m59750a(fArr, fArr, 3, colorMatrix, 1);
        float m59750a15 = m59750a(fArr, fArr, 3, colorMatrix, 2);
        float m59750a16 = m59750a(fArr, fArr, 3, colorMatrix, 3);
        fArr[0] = m59750a;
        fArr[1] = m59750a2;
        fArr[2] = m59750a3;
        fArr[3] = m59750a4;
        fArr[4] = f;
        fArr[5] = m59750a5;
        fArr[6] = m59750a6;
        fArr[7] = m59750a7;
        fArr[8] = m59750a8;
        fArr[9] = f2;
        fArr[10] = m59750a9;
        fArr[11] = m59750a10;
        fArr[12] = m59750a11;
        fArr[13] = m59750a12;
        fArr[14] = f3;
        fArr[15] = m59750a13;
        fArr[16] = m59750a14;
        fArr[17] = m59750a15;
        fArr[18] = m59750a16;
        fArr[19] = (fArr[15] * colorMatrix[4]) + (fArr[16] * colorMatrix[9]) + (fArr[17] * colorMatrix[14]) + (fArr[18] * colorMatrix[19]) + fArr[19];
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m71807toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m71794equalsimpl(this.f29048a, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.f29048a;
    }

    public int hashCode() {
        return m71797hashCodeimpl(this.f29048a);
    }

    public String toString() {
        return m71807toStringimpl(this.f29048a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ float[] m71808unboximpl() {
        return this.f29048a;
    }
}
