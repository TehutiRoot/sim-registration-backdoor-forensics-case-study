package p000;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: R02 */
/* loaded from: classes.dex */
public final class R02 implements VectorizedFiniteAnimationSpec {

    /* renamed from: a */
    public final List f5247a;

    public R02(List animations) {
        Intrinsics.checkNotNullParameter(animations, "animations");
        this.f5247a = animations;
    }

    /* renamed from: a */
    public final Pair m66510a(long j) {
        Object obj;
        List list = this.f5247a;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((Number) ((Pair) obj).component1()).longValue() <= j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair == null) {
            return (Pair) CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f5247a);
        }
        return pair;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Pair pair = (Pair) CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f5247a);
        return ((Number) pair.component1()).longValue() + ((VectorizedFiniteAnimationSpec) pair.component2()).getDurationNanos(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Q02.m66695a(this, animationVector, animationVector2, animationVector3);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getValueFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Pair m66510a = m66510a(j);
        return ((VectorizedFiniteAnimationSpec) m66510a.component2()).getValueFromNanos(j - ((Number) m66510a.component1()).longValue(), initialValue, targetValue, initialVelocity);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.animation.core.AnimationVector] */
    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector getVelocityFromNanos(long j, AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Pair m66510a = m66510a(j);
        return ((VectorizedFiniteAnimationSpec) m66510a.component2()).getVelocityFromNanos(j - ((Number) m66510a.component1()).longValue(), initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return T02.m66244a(this);
    }
}
