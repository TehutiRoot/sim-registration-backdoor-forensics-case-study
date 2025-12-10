package androidx.compose.animation.graphics.vector;

import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m29142d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedVectorTarget;", "", "", "name", "Landroidx/compose/animation/graphics/vector/Animator;", "animator", "<init>", "(Ljava/lang/String;Landroidx/compose/animation/graphics/vector/Animator;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/graphics/vector/Animator;", "getAnimator", "()Landroidx/compose/animation/graphics/vector/Animator;", "animation-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimatedVectorTarget {

    /* renamed from: a */
    public final String f12783a;

    /* renamed from: b */
    public final Animator f12784b;

    public AnimatedVectorTarget(@NotNull String name, @NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.f12783a = name;
        this.f12784b = animator;
    }

    @NotNull
    public final Animator getAnimator() {
        return this.f12784b;
    }

    @NotNull
    public final String getName() {
        return this.f12783a;
    }
}