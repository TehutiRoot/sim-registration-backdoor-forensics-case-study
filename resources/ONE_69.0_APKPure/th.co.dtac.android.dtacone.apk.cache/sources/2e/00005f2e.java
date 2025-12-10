package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.TileMode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, m29142d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,153:1\n154#2:154\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:154\n*E\n"})
/* renamed from: androidx.compose.ui.draw.BlurKt */
/* loaded from: classes2.dex */
public final class BlurKt {
    @Stable
    @NotNull
    /* renamed from: blur-1fqS-gw  reason: not valid java name */
    public static final Modifier m71593blur1fqSgw(@NotNull Modifier blur, float f, float f2, @NotNull Shape shape) {
        int m72248getDecal3opZhB0;
        boolean z;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (shape != null) {
            m72248getDecal3opZhB0 = TileMode.Companion.m72247getClamp3opZhB0();
            z = true;
        } else {
            m72248getDecal3opZhB0 = TileMode.Companion.m72248getDecal3opZhB0();
            z = false;
        }
        float f3 = 0;
        if ((C3623Dp.m73841compareTo0680j_4(f, C3623Dp.m73842constructorimpl(f3)) > 0 && C3623Dp.m73841compareTo0680j_4(f2, C3623Dp.m73842constructorimpl(f3)) > 0) || z) {
            return GraphicsLayerModifierKt.graphicsLayer(blur, new BlurKt$blur$1(f, f2, m72248getDecal3opZhB0, shape, z));
        }
        return blur;
    }

    /* renamed from: blur-1fqS-gw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m71594blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m71597boximpl(BlurredEdgeTreatment.Companion.m71604getRectangleGoahg());
        }
        return m71593blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m71603unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-F8QBwvs  reason: not valid java name */
    public static final Modifier m71595blurF8QBwvs(@NotNull Modifier blur, float f, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m71593blur1fqSgw(blur, f, f, shape);
    }

    /* renamed from: blur-F8QBwvs$default  reason: not valid java name */
    public static /* synthetic */ Modifier m71596blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m71597boximpl(BlurredEdgeTreatment.Companion.m71604getRectangleGoahg());
        }
        return m71595blurF8QBwvs(modifier, f, blurredEdgeTreatment.m71603unboximpl());
    }
}