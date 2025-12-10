package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.colorspace.ColorModel;
import androidx.compose.p003ui.graphics.colorspace.RenderIntent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.protocol.HTTP;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 '2\u00020\u0001:\u0002'(B>\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fB$\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ%\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0015J8\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0010ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", FirebaseAnalytics.Param.DESTINATION, "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(FFF)[F", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "([F)[F", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getDestination", OperatorName.CURVE_TO, "d", "e", "I", "getRenderIntent-uksYyKA", "()I", OperatorName.FILL_NON_ZERO, "[F", "Companion", "RgbConnector", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,339:1\n34#2:340\n41#2:341\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n162#1:340\n163#1:341\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Connector */
/* loaded from: classes2.dex */
public class Connector {
    @NotNull
    public static final Companion Companion;

    /* renamed from: g */
    public static final Connector f29250g;

    /* renamed from: h */
    public static final Connector f29251h;

    /* renamed from: i */
    public static final Connector f29252i;

    /* renamed from: a */
    public final ColorSpace f29253a;

    /* renamed from: b */
    public final ColorSpace f29254b;

    /* renamed from: c */
    public final ColorSpace f29255c;

    /* renamed from: d */
    public final ColorSpace f29256d;

    /* renamed from: e */
    public final int f29257e;

    /* renamed from: f */
    public final float[] f29258f;

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;", HTTP.IDENTITY_CODING, FirebaseAnalytics.Param.DESTINATION, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "SrgbIdentity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getSrgbIdentity$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/Connector;", "SrgbToOklabPerceptual", "getSrgbToOklabPerceptual$ui_graphics_release", "OklabToSrgbPerceptual", "getOklabToSrgbPerceptual$ui_graphics_release", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.colorspace.Connector$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float[] m59729a(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
            float[] d50Xyz$ui_graphics_release;
            float[] d50Xyz$ui_graphics_release2;
            if (!RenderIntent.m72115equalsimpl0(i, RenderIntent.Companion.m72119getAbsoluteuksYyKA())) {
                return null;
            }
            long m72105getModelxdoWZVw = colorSpace.m72105getModelxdoWZVw();
            ColorModel.Companion companion = ColorModel.Companion;
            boolean m72096equalsimpl0 = ColorModel.m72096equalsimpl0(m72105getModelxdoWZVw, companion.m72103getRgbxdoWZVw());
            boolean m72096equalsimpl02 = ColorModel.m72096equalsimpl0(colorSpace2.m72105getModelxdoWZVw(), companion.m72103getRgbxdoWZVw());
            if (m72096equalsimpl0 && m72096equalsimpl02) {
                return null;
            }
            if (!m72096equalsimpl0 && !m72096equalsimpl02) {
                return null;
            }
            if (!m72096equalsimpl0) {
                colorSpace = colorSpace2;
            }
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (m72096equalsimpl0) {
                d50Xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            if (m72096equalsimpl02) {
                d50Xyz$ui_graphics_release2 = rgb.getWhitePoint().toXyz$ui_graphics_release();
            } else {
                d50Xyz$ui_graphics_release2 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            }
            return new float[]{d50Xyz$ui_graphics_release[0] / d50Xyz$ui_graphics_release2[0], d50Xyz$ui_graphics_release[1] / d50Xyz$ui_graphics_release2[1], d50Xyz$ui_graphics_release[2] / d50Xyz$ui_graphics_release2[2]};
        }

        @NotNull
        public final Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return Connector.f29252i;
        }

        @NotNull
        public final Connector getSrgbIdentity$ui_graphics_release() {
            return Connector.f29250g;
        }

        @NotNull
        public final Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return Connector.f29251h;
        }

        @NotNull
        public final Connector identity$ui_graphics_release(@NotNull final ColorSpace source) {
            Intrinsics.checkNotNullParameter(source, "source");
            final int m72121getRelativeuksYyKA = RenderIntent.Companion.m72121getRelativeuksYyKA();
            return new Connector(source, m72121getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(source, source, m72121getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.p003ui.graphics.colorspace.Connector
                @NotNull
                public float[] transform(@NotNull float[] v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    return v;
                }

                @Override // androidx.compose.p003ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo72110transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
                    return ColorKt.Color(f, f2, f3, f4, getDestination());
                }
            };
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0010ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "transform", "([F)[F", "", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Color;", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "transformToColor", "source", FirebaseAnalytics.Param.DESTINATION, "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/graphics/colorspace/Rgb;", OperatorName.NON_STROKING_CMYK, OperatorName.LINE_TO, "[F", "mTransform", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.colorspace.Connector$RgbConnector */
    /* loaded from: classes2.dex */
    public static final class RgbConnector extends Connector {

        /* renamed from: j */
        public final Rgb f29259j;

        /* renamed from: k */
        public final Rgb f29260k;

        /* renamed from: l */
        public final float[] f29261l;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        /* renamed from: a */
        public final float[] m59728a(Rgb rgb, Rgb rgb2, int i) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            WhitePoint whitePoint = rgb.getWhitePoint();
            Illuminant illuminant = Illuminant.INSTANCE;
            if (!ColorSpaceKt.compare(whitePoint, illuminant.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, copyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), illuminant.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = illuminant.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, copyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m72115equalsimpl0(i, RenderIntent.Companion.m72119getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.p003ui.graphics.colorspace.Connector
        @NotNull
        public float[] transform(@NotNull float[] v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v[0] = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(v[0]);
            v[1] = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(v[1]);
            v[2] = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(v[2]);
            ColorSpaceKt.mul3x3Float3(this.f29261l, v);
            v[0] = (float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(v[0]);
            v[1] = (float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(v[1]);
            v[2] = (float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(v[2]);
            return v;
        }

        @Override // androidx.compose.p003ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo72110transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
            float invoke = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(f);
            float invoke2 = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(f2);
            float invoke3 = (float) this.f29259j.getEotfFunc$ui_graphics_release().invoke(f3);
            return ColorKt.Color((float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_0(this.f29261l, invoke, invoke2, invoke3)), (float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_1(this.f29261l, invoke, invoke2, invoke3)), (float) this.f29260k.getOetfFunc$ui_graphics_release().invoke(ColorSpaceKt.mul3x3Float3_2(this.f29261l, invoke, invoke2, invoke3)), f4, this.f29260k);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RgbConnector(Rgb mSource, Rgb mDestination, int i) {
            super(mSource, mDestination, mSource, mDestination, i, null, null);
            Intrinsics.checkNotNullParameter(mSource, "mSource");
            Intrinsics.checkNotNullParameter(mDestination, "mDestination");
            this.f29259j = mSource;
            this.f29260k = mDestination;
            this.f29261l = m59728a(mSource, mDestination, i);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        f29250g = companion.identity$ui_graphics_release(colorSpaces.getSrgb());
        Rgb srgb = colorSpaces.getSrgb();
        ColorSpace oklab = colorSpaces.getOklab();
        RenderIntent.Companion companion2 = RenderIntent.Companion;
        f29251h = new Connector(srgb, oklab, companion2.m72120getPerceptualuksYyKA(), null);
        f29252i = new Connector(colorSpaces.getOklab(), colorSpaces.getSrgb(), companion2.m72120getPerceptualuksYyKA(), null);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }

    @NotNull
    public final ColorSpace getDestination() {
        return this.f29254b;
    }

    /* renamed from: getRenderIntent-uksYyKA  reason: not valid java name */
    public final int m72109getRenderIntentuksYyKA() {
        return this.f29257e;
    }

    @NotNull
    public final ColorSpace getSource() {
        return this.f29253a;
    }

    @NotNull
    public final float[] transform(float f, float f2, float f3) {
        return transform(new float[]{f, f2, f3});
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release  reason: not valid java name */
    public long mo72110transformToColorwmQWz5c$ui_graphics_release(float f, float f2, float f3, float f4) {
        long xy$ui_graphics_release = this.f29255c.toXy$ui_graphics_release(f, f2, f3);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        float intBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & BodyPartID.bodyIdMax));
        float z$ui_graphics_release = this.f29255c.toZ$ui_graphics_release(f, f2, f3);
        float[] fArr = this.f29258f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f5 = intBitsToFloat2;
        float f6 = intBitsToFloat;
        return this.f29256d.mo72106xyzaToColorJlNiLsg$ui_graphics_release(f6, f5, z$ui_graphics_release, f4, this.f29254b);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    @NotNull
    public float[] transform(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float[] xyz = this.f29255c.toXyz(v);
        float[] fArr = this.f29258f;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.f29256d.fromXyz(xyz);
    }

    public Connector(ColorSpace source, ColorSpace destination, ColorSpace transformSource, ColorSpace transformDestination, int i, float[] fArr) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transformSource, "transformSource");
        Intrinsics.checkNotNullParameter(transformDestination, "transformDestination");
        this.f29253a = source;
        this.f29254b = destination;
        this.f29255c = transformSource;
        this.f29256d = transformDestination;
        this.f29257e = i;
        this.f29258f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Connector(androidx.compose.p003ui.graphics.colorspace.ColorSpace r13, androidx.compose.p003ui.graphics.colorspace.ColorSpace r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r13.m72105getModelxdoWZVw()
            androidx.compose.ui.graphics.colorspace.ColorModel$Companion r2 = androidx.compose.p003ui.graphics.colorspace.ColorModel.Companion
            long r3 = r2.m72103getRgbxdoWZVw()
            boolean r0 = androidx.compose.p003ui.graphics.colorspace.ColorModel.m72096equalsimpl0(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L28
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.p003ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.p003ui.graphics.colorspace.ColorSpaceKt.adapt$default(r13, r0, r3, r1, r3)
            r7 = r0
            goto L29
        L28:
            r7 = r13
        L29:
            long r4 = r14.m72105getModelxdoWZVw()
            long r8 = r2.m72103getRgbxdoWZVw()
            boolean r0 = androidx.compose.p003ui.graphics.colorspace.ColorModel.m72096equalsimpl0(r4, r8)
            if (r0 == 0) goto L43
            androidx.compose.ui.graphics.colorspace.Illuminant r0 = androidx.compose.p003ui.graphics.colorspace.Illuminant.INSTANCE
            androidx.compose.ui.graphics.colorspace.WhitePoint r0 = r0.getD50()
            androidx.compose.ui.graphics.colorspace.ColorSpace r0 = androidx.compose.p003ui.graphics.colorspace.ColorSpaceKt.adapt$default(r14, r0, r3, r1, r3)
            r8 = r0
            goto L44
        L43:
            r8 = r14
        L44:
            androidx.compose.ui.graphics.colorspace.Connector$Companion r0 = androidx.compose.p003ui.graphics.colorspace.Connector.Companion
            float[] r10 = androidx.compose.p003ui.graphics.colorspace.Connector.Companion.m72111access$computeTransformYBCOT_4(r0, r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.colorspace.Connector.<init>(androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace, int):void");
    }
}
