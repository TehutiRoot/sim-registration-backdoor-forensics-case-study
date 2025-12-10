package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableV2Kt$rememberSwipeableV2State$2 extends Lambda implements Function0<SwipeableV2State<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<T, Boolean> $confirmValueChange;
    final /* synthetic */ T $initialValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2Kt$rememberSwipeableV2State$2(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
        super(0);
        this.$initialValue = t;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SwipeableV2State<T> invoke() {
        Object obj = this.$initialValue;
        AnimationSpec<Float> animationSpec = this.$animationSpec;
        Function1<T, Boolean> function1 = this.$confirmValueChange;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        return new SwipeableV2State<>(obj, animationSpec, function1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m70825getVelocityThresholdD9Ej5fM(), null);
    }
}