package androidx.compose.animation.graphics.vector;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010*\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006+"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/AnimatorSet;", "Landroidx/compose/animation/graphics/vector/Animator;", "", "animators", "Landroidx/compose/animation/graphics/vector/Ordering;", "ordering", "<init>", "(Ljava/util/List;Landroidx/compose/animation/graphics/vector/Ordering;)V", "", "", "Landroidx/compose/animation/graphics/vector/PropertyValues;", "propertyValuesMap", "", "overallDuration", "parentDelay", "", "collectPropertyValues", "(Ljava/util/Map;II)V", "component1", "()Ljava/util/List;", "component2", "()Landroidx/compose/animation/graphics/vector/Ordering;", "copy", "(Ljava/util/List;Landroidx/compose/animation/graphics/vector/Ordering;)Landroidx/compose/animation/graphics/vector/AnimatorSet;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getAnimators", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/graphics/vector/Ordering;", "getOrdering", OperatorName.CURVE_TO, "I", "getTotalDuration", "totalDuration", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/AnimatorSet\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,650:1\n171#2,13:651\n132#2,3:664\n33#2,4:667\n135#2,2:671\n38#2:673\n137#2:674\n33#2,6:675\n33#2,6:681\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/AnimatorSet\n*L\n326#1:651,13\n327#1:664,3\n327#1:667,4\n327#1:671,2\n327#1:673\n327#1:674\n337#1:675,6\n347#1:681,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatorSet extends Animator {

    /* renamed from: a */
    public final List f12697a;

    /* renamed from: b */
    public final Ordering f12698b;

    /* renamed from: c */
    public final int f12699c;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ordering.values().length];
            try {
                iArr[Ordering.Together.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ordering.Sequentially.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatorSet(@NotNull List<? extends Animator> animators, @NotNull Ordering ordering) {
        super(null);
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(ordering, "ordering");
        Animator animator = null;
        this.f12697a = animators;
        this.f12698b = ordering;
        int i = WhenMappings.$EnumSwitchMapping$0[ordering.ordinal()];
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            if (i == 2) {
                int size = animators.size();
                int i4 = 0;
                while (i2 < size) {
                    i4 += animators.get(i2).getTotalDuration();
                    i2++;
                }
                i2 = i4;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!animators.isEmpty()) {
                Animator animator2 = animators.get(0);
                int totalDuration = animator2.getTotalDuration();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(animators);
                if (1 <= lastIndex) {
                    while (true) {
                        Animator animator3 = animators.get(i3);
                        int totalDuration2 = animator3.getTotalDuration();
                        if (totalDuration < totalDuration2) {
                            animator2 = animator3;
                            totalDuration = totalDuration2;
                        }
                        if (i3 == lastIndex) {
                            break;
                        }
                        i3++;
                    }
                }
                animator = animator2;
            }
            Animator animator4 = animator;
            if (animator4 != null) {
                i2 = animator4.getTotalDuration();
            }
        }
        this.f12699c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimatorSet copy$default(AnimatorSet animatorSet, List list, Ordering ordering, int i, Object obj) {
        if ((i & 1) != 0) {
            list = animatorSet.f12697a;
        }
        if ((i & 2) != 0) {
            ordering = animatorSet.f12698b;
        }
        return animatorSet.copy(list, ordering);
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public void collectPropertyValues(@NotNull Map<String, PropertyValues<?>> propertyValuesMap, int i, int i2) {
        Intrinsics.checkNotNullParameter(propertyValuesMap, "propertyValuesMap");
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.f12698b.ordinal()];
        int i4 = 0;
        if (i3 != 1) {
            if (i3 == 2) {
                List list = this.f12697a;
                int size = list.size();
                while (i4 < size) {
                    Animator animator = (Animator) list.get(i4);
                    animator.collectPropertyValues(propertyValuesMap, i, i2);
                    i2 += animator.getTotalDuration();
                    i4++;
                }
                return;
            }
            return;
        }
        List list2 = this.f12697a;
        int size2 = list2.size();
        while (i4 < size2) {
            ((Animator) list2.get(i4)).collectPropertyValues(propertyValuesMap, i, i2);
            i4++;
        }
    }

    @NotNull
    public final List<Animator> component1() {
        return this.f12697a;
    }

    @NotNull
    public final Ordering component2() {
        return this.f12698b;
    }

    @NotNull
    public final AnimatorSet copy(@NotNull List<? extends Animator> animators, @NotNull Ordering ordering) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        Intrinsics.checkNotNullParameter(ordering, "ordering");
        return new AnimatorSet(animators, ordering);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimatorSet) {
            AnimatorSet animatorSet = (AnimatorSet) obj;
            return Intrinsics.areEqual(this.f12697a, animatorSet.f12697a) && this.f12698b == animatorSet.f12698b;
        }
        return false;
    }

    @NotNull
    public final List<Animator> getAnimators() {
        return this.f12697a;
    }

    @NotNull
    public final Ordering getOrdering() {
        return this.f12698b;
    }

    @Override // androidx.compose.animation.graphics.vector.Animator
    public int getTotalDuration() {
        return this.f12699c;
    }

    public int hashCode() {
        return (this.f12697a.hashCode() * 31) + this.f12698b.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnimatorSet(animators=" + this.f12697a + ", ordering=" + this.f12698b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
