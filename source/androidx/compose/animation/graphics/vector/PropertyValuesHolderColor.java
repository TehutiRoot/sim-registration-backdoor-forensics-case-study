package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.p003ui.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B&\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR)\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00058\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/animation/graphics/vector/PropertyValuesHolderColor;", "Landroidx/compose/animation/graphics/vector/PropertyValuesHolder1D;", "Landroidx/compose/ui/graphics/Color;", "", "propertyName", "", "Landroidx/compose/animation/graphics/vector/Keyframe;", "animatorKeyframes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/animation/core/KeyframesSpec;", "asKeyframeSpec", "(I)Landroidx/compose/animation/core/KeyframesSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getAnimatorKeyframes", "()Ljava/util/List;", "animation-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PropertyValuesHolderColor extends PropertyValuesHolder1D<Color> {

    /* renamed from: b */
    public final List f12715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValuesHolderColor(@NotNull String propertyName, @NotNull List<Keyframe<Color>> animatorKeyframes) {
        super(propertyName, null);
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(animatorKeyframes, "animatorKeyframes");
        this.f12715b = animatorKeyframes;
    }

    @NotNull
    public final KeyframesSpec<Color> asKeyframeSpec(int i) {
        return AnimationSpecKt.keyframes(new PropertyValuesHolderColor$asKeyframeSpec$1(i, this));
    }

    @Override // androidx.compose.animation.graphics.vector.PropertyValuesHolder1D
    @NotNull
    public List<Keyframe<Color>> getAnimatorKeyframes() {
        return this.f12715b;
    }
}
