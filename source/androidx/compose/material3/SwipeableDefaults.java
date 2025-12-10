package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p003ui.unit.C3641Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/material3/SwipeableDefaults;", "", "<init>", "()V", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material3/ResistanceConfig;", "resistanceConfig$material3_release", "(Ljava/util/Set;FF)Landroidx/compose/material3/ResistanceConfig;", "resistanceConfig", "Landroidx/compose/animation/core/SpringSpec;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getVelocityThreshold-D9Ej5fM$material3_release", "()F", "VelocityThreshold", "StiffResistanceFactor", "StandardResistanceFactor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,886:1\n154#2:887\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n*L\n808#1:887\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeableDefaults {
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    @NotNull
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();

    /* renamed from: a */
    public static final SpringSpec f26213a = new SpringSpec(0.0f, 0.0f, null, 7, null);

    /* renamed from: b */
    public static final float f26214b = C3641Dp.m73658constructorimpl(125);

    public static /* synthetic */ ResistanceConfig resistanceConfig$material3_release$default(SwipeableDefaults swipeableDefaults, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig$material3_release(set, f, f2);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec$material3_release() {
        return f26213a;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3_release */
    public final float m70637getVelocityThresholdD9Ej5fM$material3_release() {
        return f26214b;
    }

    @Nullable
    public final ResistanceConfig resistanceConfig$material3_release(@NotNull Set<Float> anchors, float f, float f2) {
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        Float m74198maxOrNull = CollectionsKt___CollectionsKt.m74198maxOrNull((Iterable<Float>) set);
        Intrinsics.checkNotNull(m74198maxOrNull);
        float floatValue = m74198maxOrNull.floatValue();
        Float m74202minOrNull = CollectionsKt___CollectionsKt.m74202minOrNull((Iterable<Float>) set);
        Intrinsics.checkNotNull(m74202minOrNull);
        return new ResistanceConfig(floatValue - m74202minOrNull.floatValue(), f, f2);
    }
}
