package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.unit.C3641Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.CardElevation$animateElevation$2", m28800f = "Card.kt", m28799i = {}, m28798l = {681, 688}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes2.dex */
public final class CardElevation$animateElevation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<C3641Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2(boolean z, Animatable<C3641Dp, AnimationVector1D> animatable, CardElevation cardElevation, float f, Interaction interaction, Continuation<? super CardElevation$animateElevation$2> continuation) {
        super(2, continuation);
        this.$enabled = z;
        this.$animatable = animatable;
        this.this$0 = cardElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CardElevation$animateElevation$2(this.$enabled, this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$enabled) {
                float m73672unboximpl = this.$animatable.getTargetValue().m73672unboximpl();
                f = this.this$0.f25606b;
                Interaction interaction = null;
                if (!C3641Dp.m73663equalsimpl0(m73672unboximpl, f)) {
                    f2 = this.this$0.f25608d;
                    if (!C3641Dp.m73663equalsimpl0(m73672unboximpl, f2)) {
                        f3 = this.this$0.f25607c;
                        if (!C3641Dp.m73663equalsimpl0(m73672unboximpl, f3)) {
                            f4 = this.this$0.f25609e;
                            if (C3641Dp.m73663equalsimpl0(m73672unboximpl, f4)) {
                                interaction = new DragInteraction.Start();
                            }
                        } else {
                            interaction = new FocusInteraction.Focus();
                        }
                    } else {
                        interaction = new HoverInteraction.Enter();
                    }
                } else {
                    interaction = new PressInteraction.Press(Offset.Companion.m71518getZeroF1C5BW0(), null);
                }
                Animatable<C3641Dp, AnimationVector1D> animatable = this.$animatable;
                float f5 = this.$target;
                Interaction interaction2 = this.$interaction;
                this.label = 1;
                if (ElevationKt.m70381animateElevationrAjV9yQ(animatable, f5, interaction, interaction2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Animatable<C3641Dp, AnimationVector1D> animatable2 = this.$animatable;
                C3641Dp m73656boximpl = C3641Dp.m73656boximpl(this.$target);
                this.label = 2;
                if (animatable2.snapTo(m73656boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CardElevation$animateElevation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
