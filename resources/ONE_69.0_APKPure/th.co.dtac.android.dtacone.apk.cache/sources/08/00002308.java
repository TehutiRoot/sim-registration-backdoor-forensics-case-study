package androidx.compose.animation.core;

import androidx.compose.p003ui.unit.C3623Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke-u2uoSUM", "(Landroidx/compose/animation/core/AnimationVector1D;)F"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt$DpToVector$2 extends Lambda implements Function1<AnimationVector1D, C3623Dp> {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    public VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C3623Dp invoke(AnimationVector1D animationVector1D) {
        return C3623Dp.m73840boximpl(m69486invokeu2uoSUM(animationVector1D));
    }

    /* renamed from: invoke-u2uoSUM  reason: not valid java name */
    public final float m69486invokeu2uoSUM(@NotNull AnimationVector1D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C3623Dp.m73842constructorimpl(it.getValue());
    }
}