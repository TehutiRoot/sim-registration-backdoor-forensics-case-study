package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1 */
    /* loaded from: classes.dex */
    public static final class C27111 extends Lambda implements Function1<Color, AnimationVector4D> {
        public static final C27111 INSTANCE = new C27111();

        public C27111() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
            return m69402invoke8_81llA(color.m71929unboximpl());
        }

        @NotNull
        /* renamed from: invoke-8_81llA  reason: not valid java name */
        public final AnimationVector4D m69402invoke8_81llA(long j) {
            long m71916convertvNxB06k = Color.m71916convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m71913component4impl(m71916convertvNxB06k), Color.m71910component1impl(m71916convertvNxB06k), Color.m71911component2impl(m71916convertvNxB06k), Color.m71912component3impl(m71916convertvNxB06k));
        }
    }

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "vector", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2 */
    /* loaded from: classes.dex */
    public static final class C27122 extends Lambda implements Function1<AnimationVector4D, Color> {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27122(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
            return Color.m71909boximpl(m69403invokevNxB06k(animationVector4D));
        }

        /* renamed from: invoke-vNxB06k  reason: not valid java name */
        public final long m69403invokevNxB06k(@NotNull AnimationVector4D vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            return Color.m71916convertvNxB06k(ColorKt.Color(AbstractC11695c.coerceIn(vector.getV2(), 0.0f, 1.0f), AbstractC11695c.coerceIn(vector.getV3(), -0.5f, 0.5f), AbstractC11695c.coerceIn(vector.getV4(), -0.5f, 0.5f), AbstractC11695c.coerceIn(vector.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final TwoWayConverter<Color, AnimationVector4D> invoke(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(C27111.INSTANCE, new C27122(colorSpace));
    }
}