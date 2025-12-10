package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.tooling.animation.clock.AnimatedVisibilityClock;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$trackAnimatedVisibility$2 */
/* loaded from: classes2.dex */
public final class PreviewAnimationClock$trackAnimatedVisibility$2 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ Transition<?> $animation;
    final /* synthetic */ Function0<Unit> $onSeek;
    final /* synthetic */ PreviewAnimationClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackAnimatedVisibility$2(Transition<?> transition, Function0<Unit> function0, PreviewAnimationClock previewAnimationClock) {
        super(1);
        this.$animation = transition;
        this.$onSeek = function0;
        this.this$0 = previewAnimationClock;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(this.$animation, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Boolean>");
        AnimatedVisibilityComposeAnimation parseAnimatedVisibility = AnimatedVisibilityComposeAnimationKt.parseAnimatedVisibility(this.$animation);
        this.$onSeek.invoke();
        Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> animatedVisibilityClocks$ui_tooling_release = this.this$0.getAnimatedVisibilityClocks$ui_tooling_release();
        AnimatedVisibilityClock animatedVisibilityClock = new AnimatedVisibilityClock(parseAnimatedVisibility);
        animatedVisibilityClock.setClockTime(0L);
        animatedVisibilityClocks$ui_tooling_release.put(parseAnimatedVisibility, animatedVisibilityClock);
        this.this$0.notifySubscribe(parseAnimatedVisibility);
    }
}