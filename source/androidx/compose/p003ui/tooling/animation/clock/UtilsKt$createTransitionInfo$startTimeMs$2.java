package androidx.compose.p003ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.RepeatableSpec;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.StartOffsetType;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "invoke", "()Ljava/lang/Long;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.clock.UtilsKt$createTransitionInfo$startTimeMs$2 */
/* loaded from: classes2.dex */
public final class UtilsKt$createTransitionInfo$startTimeMs$2 extends Lambda implements Function0<Long> {
    final /* synthetic */ AnimationSpec<T> $animationSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$createTransitionInfo$startTimeMs$2(AnimationSpec<T> animationSpec) {
        super(0);
        this.$animationSpec = animationSpec;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        Number valueOf;
        Object obj = this.$animationSpec;
        if (obj instanceof TweenSpec) {
            valueOf = Integer.valueOf(((TweenSpec) obj).getDelay());
        } else if (obj instanceof SnapSpec) {
            valueOf = Integer.valueOf(((SnapSpec) obj).getDelay());
        } else if (obj instanceof KeyframesSpec) {
            valueOf = Integer.valueOf(((KeyframesSpec) obj).getConfig().getDelayMillis());
        } else if (obj instanceof RepeatableSpec) {
            if (StartOffsetType.m69291equalsimpl0(StartOffset.m69285getOffsetTypeEo1U57Q(((RepeatableSpec) obj).m69277getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m69295getDelayEo1U57Q())) {
                valueOf = Integer.valueOf(StartOffset.m69284getOffsetMillisimpl(((RepeatableSpec) this.$animationSpec).m69277getInitialStartOffsetRmkjzm4()));
            } else {
                valueOf = 0L;
            }
        } else if (obj instanceof InfiniteRepeatableSpec) {
            if (StartOffsetType.m69291equalsimpl0(StartOffset.m69285getOffsetTypeEo1U57Q(((InfiniteRepeatableSpec) obj).m69265getInitialStartOffsetRmkjzm4()), StartOffsetType.Companion.m69295getDelayEo1U57Q())) {
                valueOf = Integer.valueOf(StartOffset.m69284getOffsetMillisimpl(((InfiniteRepeatableSpec) this.$animationSpec).m69265getInitialStartOffsetRmkjzm4()));
            } else {
                valueOf = 0L;
            }
        } else {
            valueOf = obj instanceof VectorizedDurationBasedAnimationSpec ? Integer.valueOf(((VectorizedDurationBasedAnimationSpec) obj).getDelayMillis()) : 0L;
        }
        return Long.valueOf(valueOf.longValue());
    }
}
