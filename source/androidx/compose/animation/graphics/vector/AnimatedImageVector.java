package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedImageVector;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "imageVector", "", "Landroidx/compose/animation/graphics/vector/AnimatedVectorTarget;", "targets", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/util/List;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/ImageVector;", "getImageVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getTargets$animation_graphics_release", "()Ljava/util/List;", "", OperatorName.CURVE_TO, "I", "getTotalDuration", "()I", "totalDuration", "Companion", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalAnimationGraphicsApi
@Immutable
@SourceDebugExtension({"SMAP\nAnimatedImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedImageVector.kt\nandroidx/compose/animation/graphics/vector/AnimatedImageVector\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n171#2,13:64\n*S KotlinDebug\n*F\n+ 1 AnimatedImageVector.kt\nandroidx/compose/animation/graphics/vector/AnimatedImageVector\n*L\n45#1:64,13\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedImageVector {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final ImageVector f12692a;

    /* renamed from: b */
    public final List f12693b;

    /* renamed from: c */
    public final int f12694c;

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/AnimatedImageVector$Companion;", "", "()V", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public AnimatedImageVector(@NotNull ImageVector imageVector, @NotNull List<AnimatedVectorTarget> targets) {
        AnimatedVectorTarget animatedVectorTarget;
        Animator animator;
        Intrinsics.checkNotNullParameter(imageVector, "imageVector");
        Intrinsics.checkNotNullParameter(targets, "targets");
        this.f12692a = imageVector;
        this.f12693b = targets;
        int i = 0;
        if (targets.isEmpty()) {
            animatedVectorTarget = null;
        } else {
            animatedVectorTarget = targets.get(0);
            int totalDuration = animatedVectorTarget.getAnimator().getTotalDuration();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(targets);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    AnimatedVectorTarget animatedVectorTarget2 = targets.get(i2);
                    int totalDuration2 = animatedVectorTarget2.getAnimator().getTotalDuration();
                    if (totalDuration < totalDuration2) {
                        animatedVectorTarget = animatedVectorTarget2;
                        totalDuration = totalDuration2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
        }
        AnimatedVectorTarget animatedVectorTarget3 = animatedVectorTarget;
        if (animatedVectorTarget3 != null && (animator = animatedVectorTarget3.getAnimator()) != null) {
            i = animator.getTotalDuration();
        }
        this.f12694c = i;
    }

    @NotNull
    public final ImageVector getImageVector() {
        return this.f12692a;
    }

    @NotNull
    public final List<AnimatedVectorTarget> getTargets$animation_graphics_release() {
        return this.f12693b;
    }

    public final int getTotalDuration() {
        return this.f12694c;
    }
}
