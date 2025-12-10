package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "", "S", "invoke", "()Ljava/lang/Long;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1156:1\n1855#2,2:1157\n1855#2,2:1159\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$totalDurationNanos$2\n*L\n273#1:1157,2\n276#1:1159,2\n*E\n"})
/* loaded from: classes.dex */
public final class Transition$totalDurationNanos$2 extends Lambda implements Function0<Long> {
    final /* synthetic */ Transition<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() {
        SnapshotStateList<Transition.TransitionAnimationState> snapshotStateList;
        SnapshotStateList<Transition> snapshotStateList2;
        snapshotStateList = this.this$0.f12688h;
        long j = 0;
        for (Transition.TransitionAnimationState transitionAnimationState : snapshotStateList) {
            j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
        }
        snapshotStateList2 = this.this$0.f12689i;
        for (Transition transition : snapshotStateList2) {
            j = Math.max(j, transition.getTotalDurationNanos());
        }
        return Long.valueOf(j);
    }
}