package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.colorspace.Rgb;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b0\u0018\u0000 z2\u00020\u0001:\u0001zB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0013\u0010\u0018BY\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001cB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001dB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u001fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010%J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010(J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b&\u0010(J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010,J%\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f¢\u0006\u0004\b1\u00102J\u0015\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b1\u0010(J%\u00104\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f¢\u0006\u0004\b4\u00102J\u0015\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u0010(J'\u0010<\u001a\u0002092\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0010¢\u0006\u0004\b=\u0010>J@\u0010G\u001a\u00020D2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010(J\u001a\u0010L\u001a\u00020K2\b\u0010J\u001a\u0004\u0018\u00010IH\u0096\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0011H\u0016¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010UR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b/\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010%R\u001a\u0010)\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010%R\u001a\u0010e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010l\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010b\u001a\u0004\bk\u0010dR\u001a\u0010o\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010b\u001a\u0004\bn\u0010dR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bp\u0010g\u001a\u0004\bq\u0010iR\u001a\u0010t\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010b\u001a\u0004\bs\u0010dR\u001a\u0010w\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010y\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010v\u001a\u0004\by\u0010x\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006{"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "getPrimaries", "()[F", "getTransform", "getInverseTransform", "([F)[F", "inverseTransform", "component", "getMinValue", "(I)F", "getMaxValue", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "toLinear", "(FFF)[F", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "fromLinear", "toXyz", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "e", "F", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", OperatorName.CLOSE_PATH, "[F", "getPrimaries$ui_graphics_release", "i", "getTransform$ui_graphics_release", OperatorName.SET_LINE_JOINSTYLE, "getInverseTransform$ui_graphics_release", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", OperatorName.LINE_TO, "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", OperatorName.MOVE_TO, "getOetfFunc$ui_graphics_release", "oetfFunc", OperatorName.ENDPATH, "getEotfOrig$ui_graphics_release", "eotfOrig", "o", "getEotf", "p", "getEotfFunc$ui_graphics_release", "eotfFunc", OperatorName.SAVE, "Z", "isWideGamut", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Rgb */
/* loaded from: classes2.dex */
public final class Rgb extends ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: s */
    public static final DoubleFunction f29281s = new DoubleFunction() { // from class: my1
        @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d) {
            return Rgb.m59720h(d);
        }
    };

    /* renamed from: d */
    public final WhitePoint f29282d;

    /* renamed from: e */
    public final float f29283e;

    /* renamed from: f */
    public final float f29284f;

    /* renamed from: g */
    public final TransferParameters f29285g;

    /* renamed from: h */
    public final float[] f29286h;

    /* renamed from: i */
    public final float[] f29287i;

    /* renamed from: j */
    public final float[] f29288j;

    /* renamed from: k */
    public final DoubleFunction f29289k;

    /* renamed from: l */
    public final Function1 f29290l;

    /* renamed from: m */
    public final DoubleFunction f29291m;

    /* renamed from: n */
    public final DoubleFunction f29292n;

    /* renamed from: o */
    public final Function1 f29293o;

    /* renamed from: p */
    public final DoubleFunction f29294p;

    /* renamed from: q */
    public final boolean f29295q;

    /* renamed from: r */
    public final boolean f29296r;

    @Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0019\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001eJ/\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0007J\u001f\u0010,\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "toXYZ", "computePrimaries$ui_graphics_release", "([F)[F", "computePrimaries", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "OETF", "EOTF", "", "min", "max", "", "id", "", OperatorName.NON_STROKING_GRAY, "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFI)Z", "", "point", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(DLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;)Z", OperatorName.CLOSE_PATH, "([FFF)Z", "([F)F", "ax", "ay", "bx", "by", OperatorName.FILL_NON_ZERO, "(FFFF)F", "p1", "p2", "e", "([F[F)Z", OperatorName.CURVE_TO, "([F)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "i", "d", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.colorspace.Rgb$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m59701a(float[] fArr) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            if (f7 < 0.0f) {
                return -f7;
            }
            return f7;
        }

        /* renamed from: b */
        public final boolean m59700b(double d, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            if (Math.abs(doubleFunction.invoke(d) - doubleFunction2.invoke(d)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final WhitePoint m59699c(float[] fArr) {
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(fArr, new float[]{1.0f, 1.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] toXYZ) {
            Intrinsics.checkNotNullParameter(toXYZ, "toXYZ");
            float[] mul3x3Float3 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{1.0f, 0.0f, 0.0f});
            float[] mul3x3Float32 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 1.0f, 0.0f});
            float[] mul3x3Float33 = ColorSpaceKt.mul3x3Float3(toXYZ, new float[]{0.0f, 0.0f, 1.0f});
            float f = mul3x3Float3[0];
            float f2 = mul3x3Float3[1];
            float f3 = f + f2 + mul3x3Float3[2];
            float f4 = mul3x3Float32[0];
            float f5 = mul3x3Float32[1];
            float f6 = f4 + f5 + mul3x3Float32[2];
            float f7 = mul3x3Float33[0];
            float f8 = mul3x3Float33[1];
            float f9 = f7 + f8 + mul3x3Float33[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        /* renamed from: d */
        public final float[] m59698d(float[] fArr, WhitePoint whitePoint) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f7 = 1;
            float f8 = (f7 - f) / f2;
            float f9 = f / f2;
            float f10 = (f3 / f4) - f9;
            float f11 = (x / y) - f9;
            float f12 = ((f7 - f3) / f4) - f8;
            float f13 = (f5 / f6) - f9;
            float f14 = (((((f7 - x) / y) - f8) * f10) - (f11 * f12)) / (((((f7 - f5) / f6) - f8) * f10) - (f12 * f13));
            float f15 = (f11 - (f13 * f14)) / f10;
            float f16 = (1.0f - f15) - f14;
            float f17 = f16 / f2;
            float f18 = f15 / f4;
            float f19 = f14 / f6;
            return new float[]{f17 * f, f16, f17 * ((1.0f - f) - f2), f18 * f3, f15, f18 * ((1.0f - f3) - f4), f19 * f5, f14, f19 * ((1.0f - f5) - f6)};
        }

        /* renamed from: e */
        public final boolean m59697e(float[] fArr, float[] fArr2) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[1];
            float f5 = fArr[4];
            float f6 = fArr2[4];
            float f7 = fArr[5];
            float f8 = fArr2[5];
            float[] fArr3 = {f - f2, f3 - f4, fArr[2] - fArr2[2], fArr[3] - fArr2[3], f5 - f6, f7 - f8};
            if (m59696f(fArr3[0], fArr3[1], f2 - f6, f4 - f8) < 0.0f || m59696f(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || m59696f(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || m59696f(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || m59696f(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || m59696f(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final float m59696f(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: g */
        public final boolean m59695g(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, int i) {
            if (i == 0) {
                return true;
            }
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if (!ColorSpaceKt.compare(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f != 0.0f || f2 != 1.0f) {
                return false;
            }
            Rgb srgb = colorSpaces.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!m59700b(d, doubleFunction, srgb.getOetfOrig$ui_graphics_release()) || !m59700b(d, doubleFunction2, srgb.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: h */
        public final boolean m59694h(float[] fArr, float f, float f2) {
            float m59701a = m59701a(fArr);
            ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
            if ((m59701a / m59701a(colorSpaces.getNtsc1953Primaries$ui_graphics_release()) > 0.9f && m59697e(fArr, colorSpaces.getSrgbPrimaries$ui_graphics_release())) || (f < 0.0f && f2 > 1.0f)) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final float[] m59693i(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = f + f2 + fArr[2];
                fArr2[0] = f / f3;
                fArr2[1] = f2 / f3;
                float f4 = fArr[3];
                float f5 = fArr[4];
                float f6 = f4 + f5 + fArr[5];
                fArr2[2] = f4 / f6;
                fArr2[3] = f5 / f6;
                float f7 = fArr[6];
                float f8 = fArr[7];
                float f9 = f7 + f8 + fArr[8];
                fArr2[4] = f7 / f9;
                fArr2[5] = f8 / f9;
            } else {
                ArraysKt___ArraysJvmKt.copyInto$default(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @Nullable float[] fArr, @NotNull DoubleFunction oetf, @NotNull DoubleFunction eotf, float f, float f2, @Nullable TransferParameters transferParameters, int i) {
        super(name, ColorModel.Companion.m72103getRgbxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
        this.f29282d = whitePoint;
        this.f29283e = f;
        this.f29284f = f2;
        this.f29285g = transferParameters;
        this.f29289k = oetf;
        this.f29290l = new Rgb$oetf$1(this);
        this.f29291m = new DoubleFunction() { // from class: hy1
            {
                Rgb.this = this;
            }

            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59726b(Rgb.this, d);
            }
        };
        this.f29292n = eotf;
        this.f29293o = new Rgb$eotf$1(this);
        this.f29294p = new DoubleFunction() { // from class: ly1
            {
                Rgb.this = this;
            }

            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59727a(Rgb.this, d);
            }
        };
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            Companion companion = Companion;
            float[] m59693i = companion.m59693i(primaries);
            this.f29286h = m59693i;
            if (fArr == null) {
                this.f29287i = companion.m59698d(m59693i, whitePoint);
            } else if (fArr.length == 9) {
                this.f29287i = fArr;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr.length);
            }
            this.f29288j = ColorSpaceKt.inverse3x3(this.f29287i);
            this.f29295q = companion.m59694h(m59693i, f, f2);
            this.f29296r = companion.m59695g(m59693i, whitePoint, oetf, eotf, f, f2, i);
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* renamed from: a */
    public static /* synthetic */ double m59727a(Rgb rgb, double d) {
        return m59703y(rgb, d);
    }

    /* renamed from: b */
    public static /* synthetic */ double m59726b(Rgb rgb, double d) {
        return m59702z(rgb, d);
    }

    /* renamed from: c */
    public static /* synthetic */ double m59725c(Function1 function1, double d) {
        return m59708t(function1, d);
    }

    /* renamed from: d */
    public static /* synthetic */ double m59724d(TransferParameters transferParameters, double d) {
        return m59704x(transferParameters, d);
    }

    /* renamed from: e */
    public static /* synthetic */ double m59723e(TransferParameters transferParameters, double d) {
        return m59705w(transferParameters, d);
    }

    /* renamed from: f */
    public static /* synthetic */ double m59722f(Function1 function1, double d) {
        return m59711q(function1, d);
    }

    /* renamed from: g */
    public static /* synthetic */ double m59721g(TransferParameters transferParameters, double d) {
        return m59706v(transferParameters, d);
    }

    /* renamed from: h */
    public static /* synthetic */ double m59720h(double d) {
        return m59714n(d);
    }

    /* renamed from: i */
    public static /* synthetic */ double m59719i(TransferParameters transferParameters, double d) {
        return m59707u(transferParameters, d);
    }

    /* renamed from: j */
    public static /* synthetic */ double m59718j(double d, double d2) {
        return m59712p(d, d2);
    }

    /* renamed from: k */
    public static /* synthetic */ double m59717k(Function1 function1, double d) {
        return m59710r(function1, d);
    }

    /* renamed from: l */
    public static /* synthetic */ double m59716l(double d, double d2) {
        return m59713o(d, d2);
    }

    /* renamed from: m */
    public static /* synthetic */ double m59715m(Function1 function1, double d) {
        return m59709s(function1, d);
    }

    /* renamed from: n */
    public static final double m59714n(double d) {
        return d;
    }

    /* renamed from: o */
    public static final double m59713o(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* renamed from: p */
    public static final double m59712p(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    /* renamed from: q */
    public static final double m59711q(Function1 oetf, double d) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: r */
    public static final double m59710r(Function1 eotf, double d) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: s */
    public static final double m59709s(Function1 oetf, double d) {
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: t */
    public static final double m59708t(Function1 eotf, double d) {
        Intrinsics.checkNotNullParameter(eotf, "$eotf");
        return ((Number) eotf.invoke(Double.valueOf(d))).doubleValue();
    }

    /* renamed from: u */
    public static final double m59707u(TransferParameters function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* renamed from: v */
    public static final double m59706v(TransferParameters function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* renamed from: w */
    public static final double m59705w(TransferParameters function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    /* renamed from: x */
    public static final double m59704x(TransferParameters function, double d) {
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d, function.getA(), function.getB(), function.getC(), function.getD(), function.getE(), function.getF(), function.getGamma());
    }

    /* renamed from: y */
    public static final double m59703y(Rgb this$0, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f29292n.invoke(AbstractC11719c.coerceIn(d, this$0.f29283e, this$0.f29284f));
    }

    /* renamed from: z */
    public static final double m59702z(Rgb this$0, double d) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return AbstractC11719c.coerceIn(this$0.f29289k.invoke(d), this$0.f29283e, this$0.f29284f);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f29283e, this.f29283e) != 0 || Float.compare(rgb.f29284f, this.f29284f) != 0 || !Intrinsics.areEqual(this.f29282d, rgb.f29282d) || !Arrays.equals(this.f29286h, rgb.f29286h)) {
            return false;
        }
        TransferParameters transferParameters = this.f29285g;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.f29285g);
        }
        if (rgb.f29285g == null) {
            return true;
        }
        if (!Intrinsics.areEqual(this.f29289k, rgb.f29289k)) {
            return false;
        }
        return Intrinsics.areEqual(this.f29292n, rgb.f29292n);
    }

    @NotNull
    public final float[] fromLinear(float f, float f2, float f3) {
        return fromLinear(new float[]{f, f2, f3});
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        ColorSpaceKt.mul3x3Float3(this.f29288j, v);
        v[0] = (float) this.f29291m.invoke(v[0]);
        v[1] = (float) this.f29291m.invoke(v[1]);
        v[2] = (float) this.f29291m.invoke(v[2]);
        return v;
    }

    @NotNull
    public final Function1<Double, Double> getEotf() {
        return this.f29293o;
    }

    @NotNull
    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.f29294p;
    }

    @NotNull
    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.f29292n;
    }

    @NotNull
    public final float[] getInverseTransform() {
        float[] fArr = this.f29288j;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.f29288j;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return this.f29284f;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return this.f29283e;
    }

    @NotNull
    public final Function1<Double, Double> getOetf() {
        return this.f29290l;
    }

    @NotNull
    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.f29291m;
    }

    @NotNull
    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.f29289k;
    }

    @NotNull
    public final float[] getPrimaries() {
        float[] fArr = this.f29286h;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getPrimaries$ui_graphics_release() {
        return this.f29286h;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.f29285g;
    }

    @NotNull
    public final float[] getTransform() {
        float[] fArr = this.f29287i;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public final float[] getTransform$ui_graphics_release() {
        return this.f29287i;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.f29282d;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = ((((super.hashCode() * 31) + this.f29282d.hashCode()) * 31) + Arrays.hashCode(this.f29286h)) * 31;
        float f = this.f29283e;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.f29284f;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        TransferParameters transferParameters = this.f29285g;
        if (transferParameters != null) {
            i = transferParameters.hashCode();
        }
        int i4 = i3 + i;
        if (this.f29285g == null) {
            return (((i4 * 31) + this.f29289k.hashCode()) * 31) + this.f29292n.hashCode();
        }
        return i4;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.f29296r;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.f29295q;
    }

    @NotNull
    public final float[] toLinear(float f, float f2, float f3) {
        return toLinear(new float[]{f, f2, f3});
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float invoke = (float) this.f29294p.invoke(f);
        float invoke2 = (float) this.f29294p.invoke(f2);
        float invoke3 = (float) this.f29294p.invoke(f3);
        return (Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_0(this.f29287i, invoke, invoke2, invoke3)) << 32) | (Float.floatToIntBits(ColorSpaceKt.mul3x3Float3_1(this.f29287i, invoke, invoke2, invoke3)) & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.f29294p.invoke(v[0]);
        v[1] = (float) this.f29294p.invoke(v[1]);
        v[2] = (float) this.f29294p.invoke(v[2]);
        return ColorSpaceKt.mul3x3Float3(this.f29287i, v);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        return ColorSpaceKt.mul3x3Float3_2(this.f29287i, (float) this.f29294p.invoke(f), (float) this.f29294p.invoke(f2), (float) this.f29294p.invoke(f3));
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo72106xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return ColorKt.Color((float) this.f29291m.invoke(ColorSpaceKt.mul3x3Float3_0(this.f29288j, f, f2, f3)), (float) this.f29291m.invoke(ColorSpaceKt.mul3x3Float3_1(this.f29288j, f, f2, f3)), (float) this.f29291m.invoke(ColorSpaceKt.mul3x3Float3_2(this.f29288j, f, f2, f3)), f4, colorSpace);
    }

    @NotNull
    public final float[] fromLinear(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.f29291m.invoke(v[0]);
        v[1] = (float) this.f29291m.invoke(v[1]);
        v[2] = (float) this.f29291m.invoke(v[2]);
        return v;
    }

    @NotNull
    public final float[] getInverseTransform(@NotNull float[] inverseTransform) {
        Intrinsics.checkNotNullParameter(inverseTransform, "inverseTransform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.f29288j, inverseTransform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getPrimaries(@NotNull float[] primaries) {
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.f29286h, primaries, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] getTransform(@NotNull float[] transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        return ArraysKt___ArraysJvmKt.copyInto$default(this.f29287i, transform, 0, 0, 0, 14, (Object) null);
    }

    @NotNull
    public final float[] toLinear(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = (float) this.f29294p.invoke(v[0]);
        v[1] = (float) this.f29294p.invoke(v[1]);
        v[2] = (float) this.f29294p.invoke(v[2]);
        return v;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull float[] r17, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r18, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super java.lang.Double, java.lang.Double> r19) {
        /*
            r15 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "name"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "oetf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "eotf"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r3 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion
            float[] r6 = r3.computePrimaries$ui_graphics_release(r0)
            androidx.compose.ui.graphics.colorspace.WhitePoint r7 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r3, r0)
            ny1 r9 = new ny1
            r9.<init>()
            oy1 r10 = new oy1
            r10.<init>()
            r13 = 0
            r14 = -1
            r8 = 0
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull final Function1<? super Double, Double> oetf, @NotNull final Function1<? super Double, Double> eotf, float f, float f2) {
        this(name, primaries, whitePoint, null, new DoubleFunction() { // from class: ry1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59715m(oetf, d);
            }
        }, new DoubleFunction() { // from class: sy1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59725c(eotf, d);
            }
        }, f, f2, null, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(oetf, "oetf");
        Intrinsics.checkNotNullParameter(eotf, "eotf");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull float[] r9, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.graphics.colorspace.TransferParameters r10) {
        /*
            r7 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r9)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r9)
            r6 = -1
            r1 = r7
            r2 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.TransferParameters):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull TransferParameters function) {
        this(name, primaries, whitePoint, function, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, @NotNull final TransferParameters function, int i) {
        this(name, primaries, whitePoint, null, (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: ty1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59719i(function, d);
            }
        } : new DoubleFunction() { // from class: iy1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59721g(function, d);
            }
        }, (function.getE() == 0.0d && function.getF() == 0.0d) ? new DoubleFunction() { // from class: jy1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59723e(function, d);
            }
        } : new DoubleFunction() { // from class: ky1
            @Override // androidx.compose.p003ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.m59724d(function, d);
            }
        }, 0.0f, 1.0f, function, i);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(function, "function");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull float[] r12, double r13) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "toXYZ"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.compose.ui.graphics.colorspace.Rgb$Companion r0 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion
            float[] r3 = r0.computePrimaries$ui_graphics_release(r12)
            androidx.compose.ui.graphics.colorspace.WhitePoint r4 = androidx.compose.p003ui.graphics.colorspace.Rgb.Companion.access$computeWhitePoint(r0, r12)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r7 = 0
            r1 = r10
            r2 = r11
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], double):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull String name, @NotNull float[] primaries, @NotNull WhitePoint whitePoint, double d) {
        this(name, primaries, whitePoint, d, 0.0f, 1.0f, -1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primaries, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Rgb(@org.jetbrains.annotations.NotNull java.lang.String r23, @org.jetbrains.annotations.NotNull float[] r24, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.graphics.colorspace.WhitePoint r25, final double r26, float r28, float r29, int r30) {
        /*
            r22 = this;
            r1 = r26
            java.lang.String r0 = "name"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "primaries"
            r14 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "whitePoint"
            r11 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L22
            androidx.compose.ui.graphics.colorspace.DoubleFunction r3 = androidx.compose.p003ui.graphics.colorspace.Rgb.f29281s
        L1f:
            r17 = r3
            goto L28
        L22:
            py1 r3 = new py1
            r3.<init>()
            goto L1f
        L28:
            if (r0 != 0) goto L2f
            androidx.compose.ui.graphics.colorspace.DoubleFunction r0 = androidx.compose.p003ui.graphics.colorspace.Rgb.f29281s
        L2c:
            r18 = r0
            goto L35
        L2f:
            qy1 r0 = new qy1
            r0.<init>()
            goto L2c
        L35:
            androidx.compose.ui.graphics.colorspace.TransferParameters r19 = new androidx.compose.ui.graphics.colorspace.TransferParameters
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r20 = 0
            r11 = r20
            r13 = r20
            r1 = r26
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r5 = 0
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r6 = r17
            r7 = r18
            r8 = r28
            r9 = r29
            r10 = r19
            r11 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.colorspace.Rgb.<init>(java.lang.String, float[], androidx.compose.ui.graphics.colorspace.WhitePoint, double, float, float, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Rgb(@NotNull Rgb colorSpace, @NotNull float[] transform, @NotNull WhitePoint whitePoint) {
        this(colorSpace.getName(), colorSpace.f29286h, whitePoint, transform, colorSpace.f29289k, colorSpace.f29292n, colorSpace.f29283e, colorSpace.f29284f, colorSpace.f29285g, -1);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
    }
}
