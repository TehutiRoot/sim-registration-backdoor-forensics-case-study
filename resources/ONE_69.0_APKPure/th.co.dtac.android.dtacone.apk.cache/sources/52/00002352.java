package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.p003ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/ui/graphics/Color;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class PropertyValuesHolderColor$asKeyframeSpec$1 extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Color>, Unit> {
    final /* synthetic */ int $duration;
    final /* synthetic */ PropertyValuesHolderColor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyValuesHolderColor$asKeyframeSpec$1(int i, PropertyValuesHolderColor propertyValuesHolderColor) {
        super(1);
        this.$duration = i;
        this.this$0 = propertyValuesHolderColor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Color> keyframesSpecConfig) {
        invoke2(keyframesSpecConfig);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull KeyframesSpec.KeyframesSpecConfig<Color> keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(this.$duration);
        for (Keyframe<Color> keyframe : this.this$0.getAnimatorKeyframes()) {
            keyframes.with(keyframes.m61644at(keyframe.getValue(), (int) (this.$duration * keyframe.getFraction())), keyframe.getInterpolator());
        }
    }
}