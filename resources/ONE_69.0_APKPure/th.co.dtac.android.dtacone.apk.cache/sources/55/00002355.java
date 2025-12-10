package androidx.compose.animation.graphics.vector;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolderInt;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "", "", "propertyName", "", "Landroidx/compose/animation/graphics/vector/Keyframe;", "animatorKeyframes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getAnimatorKeyframes", "()Ljava/util/List;", "animation-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PropertyValuesHolderInt extends PropertyValuesHolder1D<Integer> {

    /* renamed from: b */
    public final List f12805b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValuesHolderInt(@NotNull String propertyName, @NotNull List<Keyframe<Integer>> animatorKeyframes) {
        super(propertyName, null);
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(animatorKeyframes, "animatorKeyframes");
        this.f12805b = animatorKeyframes;
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValuesHolder1D
    @NotNull
    public List<Keyframe<Integer>> getAnimatorKeyframes() {
        return this.f12805b;
    }
}