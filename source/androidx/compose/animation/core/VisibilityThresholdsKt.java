package androidx.compose.animation.core;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.DpOffset;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\".\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\f8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0012*\u00020\u00118Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0013\"\u0015\u0010\u0010\u001a\u00020\u0015*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016\"\u0018\u0010\u0010\u001a\u00020\u0018*\u00020\u00178Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019\"\u0018\u0010\u0010\u001a\u00020\u001b*\u00020\u001a8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001c\"\u0018\u0010\u0010\u001a\u00020\u001e*\u00020\u001d8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001f\"\u0018\u0010\u0010\u001a\u00020!*\u00020 8Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\"\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020#8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m28850d2 = {"Landroidx/compose/ui/geometry/Rect;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/geometry/Rect;", "rectVisibilityThreshold", "", "Landroidx/compose/animation/core/TwoWayConverter;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "visibilityThresholdMap", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,114:1\n174#2:115\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:115\n*E\n"})
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {

    /* renamed from: a */
    public static final Rect f12676a;

    /* renamed from: b */
    public static final Map f12677b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        f12676a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE);
        Float valueOf2 = Float.valueOf(1.0f);
        Pair m28844to = TuplesKt.m28844to(vectorConverter, valueOf2);
        Pair m28844to2 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2);
        Pair m28844to3 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2);
        Pair m28844to4 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
        Pair m28844to5 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf);
        Pair m28844to6 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf);
        Pair m28844to7 = TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf);
        TwoWayConverter<C3641Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C3641Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        f12677b = AbstractC11687a.mapOf(m28844to, m28844to2, m28844to3, m28844to4, m28844to5, m28844to6, m28844to7, TuplesKt.m28844to(vectorConverter2, valueOf3), TuplesKt.m28844to(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
    }

    public static final int getVisibilityThreshold(@NotNull IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return 1;
    }

    @NotNull
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return f12677b;
    }

    public static final long getVisibilityThreshold(@NotNull IntOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull DpOffset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        C3641Dp.Companion companion2 = C3641Dp.Companion;
        return DpKt.m73679DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(@NotNull Size.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@NotNull IntSize.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return IntSizeKt.IntSize(1, 1);
    }

    @NotNull
    public static final Rect getVisibilityThreshold(@NotNull Rect.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f12676a;
    }

    public static final float getVisibilityThreshold(@NotNull C3641Dp.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C3641Dp.m73658constructorimpl(0.1f);
    }
}
