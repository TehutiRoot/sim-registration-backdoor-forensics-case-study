package androidx.compose.p003ui.graphics.colorspace;

import androidx.compose.p003ui.graphics.ColorKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J@\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "z", PDPageLabelRange.STYLE_LETTERS_LOWER, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.colorspace.Lab */
/* loaded from: classes2.dex */
public final class Lab extends ColorSpace {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.Lab$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String name, int i) {
        super(name, ColorModel.Companion.m72286getLabxdoWZVw(), i, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(v, "v");
        float f4 = v[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f5 = f4 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f6 = v[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f7 = v[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f5 > 0.008856452f) {
            f = (float) Math.pow(f5, 0.33333334f);
        } else {
            f = (f5 * 7.787037f) + 0.13793103f;
        }
        if (f6 > 0.008856452f) {
            f2 = (float) Math.pow(f6, 0.33333334f);
        } else {
            f2 = (f6 * 7.787037f) + 0.13793103f;
        }
        if (f7 > 0.008856452f) {
            f3 = (float) Math.pow(f7, 0.33333334f);
        } else {
            f3 = 0.13793103f + (f7 * 7.787037f);
        }
        v[0] = AbstractC11695c.coerceIn((116.0f * f2) - 16.0f, 0.0f, 100.0f);
        v[1] = AbstractC11695c.coerceIn((f - f2) * 500.0f, -128.0f, 128.0f);
        v[2] = AbstractC11695c.coerceIn((f2 - f3) * 200.0f, -128.0f, 128.0f);
        return v;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f2, float f3) {
        float f4;
        float f5;
        float coerceIn = (AbstractC11695c.coerceIn(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float coerceIn2 = (AbstractC11695c.coerceIn(f, -128.0f, 128.0f) * 0.002f) + coerceIn;
        if (coerceIn2 > 0.20689656f) {
            f4 = coerceIn2 * coerceIn2 * coerceIn2;
        } else {
            f4 = (coerceIn2 - 0.13793103f) * 0.12841855f;
        }
        if (coerceIn > 0.20689656f) {
            f5 = coerceIn * coerceIn * coerceIn;
        } else {
            f5 = (coerceIn - 0.13793103f) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        return (Float.floatToIntBits(f4 * illuminant.getD50Xyz$ui_graphics_release()[0]) << 32) | (Float.floatToIntBits(f5 * illuminant.getD50Xyz$ui_graphics_release()[1]) & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(v, "v");
        v[0] = AbstractC11695c.coerceIn(v[0], 0.0f, 100.0f);
        v[1] = AbstractC11695c.coerceIn(v[1], -128.0f, 128.0f);
        float coerceIn = AbstractC11695c.coerceIn(v[2], -128.0f, 128.0f);
        v[2] = coerceIn;
        float f4 = (v[0] + 16.0f) / 116.0f;
        float f5 = (v[1] * 0.002f) + f4;
        float f6 = f4 - (coerceIn * 0.005f);
        if (f5 > 0.20689656f) {
            f = f5 * f5 * f5;
        } else {
            f = (f5 - 0.13793103f) * 0.12841855f;
        }
        if (f4 > 0.20689656f) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = (f4 - 0.13793103f) * 0.12841855f;
        }
        if (f6 > 0.20689656f) {
            f3 = f6 * f6 * f6;
        } else {
            f3 = (f6 - 0.13793103f) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        v[0] = f * illuminant.getD50Xyz$ui_graphics_release()[0];
        v[1] = f2 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v[2] = f3 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v;
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f2, float f3) {
        float f4;
        float coerceIn = ((AbstractC11695c.coerceIn(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (AbstractC11695c.coerceIn(f3, -128.0f, 128.0f) * 0.005f);
        if (coerceIn > 0.20689656f) {
            f4 = coerceIn * coerceIn * coerceIn;
        } else {
            f4 = 0.12841855f * (coerceIn - 0.13793103f);
        }
        return f4 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p003ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo72290xyzaToColorJlNiLsg$ui_graphics_release(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        float f5;
        float f6;
        float f7;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Illuminant illuminant = Illuminant.INSTANCE;
        float f8 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f9 = f2 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f10 = f3 / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f8 > 0.008856452f) {
            f5 = (float) Math.pow(f8, 0.33333334f);
        } else {
            f5 = (f8 * 7.787037f) + 0.13793103f;
        }
        if (f9 > 0.008856452f) {
            f6 = (float) Math.pow(f9, 0.33333334f);
        } else {
            f6 = (f9 * 7.787037f) + 0.13793103f;
        }
        if (f10 > 0.008856452f) {
            f7 = (float) Math.pow(f10, 0.33333334f);
        } else {
            f7 = (f10 * 7.787037f) + 0.13793103f;
        }
        return ColorKt.Color(AbstractC11695c.coerceIn((116.0f * f6) - 16.0f, 0.0f, 100.0f), AbstractC11695c.coerceIn((f5 - f6) * 500.0f, -128.0f, 128.0f), AbstractC11695c.coerceIn((f6 - f7) * 200.0f, -128.0f, 128.0f), f4, colorSpace);
    }
}