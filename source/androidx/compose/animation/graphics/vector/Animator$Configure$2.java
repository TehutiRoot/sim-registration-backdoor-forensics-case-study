package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class Animator$Configure$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ StateVectorConfig $config;
    final /* synthetic */ int $overallDuration;
    final /* synthetic */ Animator $tmp0_rcvr;
    final /* synthetic */ Transition<Boolean> $transition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animator$Configure$2(Animator animator, Transition<Boolean> transition, StateVectorConfig stateVectorConfig, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = animator;
        this.$transition = transition;
        this.$config = stateVectorConfig;
        this.$overallDuration = i;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp0_rcvr.Configure(this.$transition, this.$config, this.$overallDuration, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
