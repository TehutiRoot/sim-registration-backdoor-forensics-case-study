package androidx.compose.animation.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00060\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolderPath;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "", "propertyName", "Landroidx/compose/animation/graphics/vector/Keyframe;", "animatorKeyframes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "fraction", "interpolate", "(F)Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getAnimatorKeyframes", "()Ljava/util/List;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/PropertyValuesHolderPath\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,650:1\n350#2,7:651\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/PropertyValuesHolderPath\n*L\n417#1:651,7\n*E\n"})
/* loaded from: classes.dex */
public final class PropertyValuesHolderPath extends PropertyValuesHolder1D<List<? extends PathNode>> {

    /* renamed from: b */
    public final List f12718b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValuesHolderPath(@NotNull String propertyName, @NotNull List<Keyframe<List<PathNode>>> animatorKeyframes) {
        super(propertyName, null);
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(animatorKeyframes, "animatorKeyframes");
        this.f12718b = animatorKeyframes;
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValuesHolder1D
    @NotNull
    public List<Keyframe<List<? extends PathNode>>> getAnimatorKeyframes() {
        return this.f12718b;
    }

    @NotNull
    public final List<PathNode> interpolate(float f) {
        List<PathNode> m61655b;
        Iterator<Keyframe<List<? extends PathNode>>> it = getAnimatorKeyframes().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getFraction() >= f) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        int coerceAtLeast = AbstractC11719c.coerceAtLeast(i - 1, 0);
        int i2 = coerceAtLeast + 1;
        m61655b = AnimatorKt.m61655b(getAnimatorKeyframes().get(coerceAtLeast).getValue(), getAnimatorKeyframes().get(i2).getValue(), getAnimatorKeyframes().get(i2).getInterpolator().transform(AbstractC11719c.coerceIn((f - getAnimatorKeyframes().get(coerceAtLeast).getFraction()) / (getAnimatorKeyframes().get(i2).getFraction() - getAnimatorKeyframes().get(coerceAtLeast).getFraction()), 0.0f, 1.0f)));
        return m61655b;
    }
}
