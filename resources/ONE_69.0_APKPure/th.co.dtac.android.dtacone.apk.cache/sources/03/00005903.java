package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", m29092f = "FloatingActionButton.kt", m29091i = {}, m29090l = {TypedValues.PositionType.TYPE_POSITION_TYPE}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes2.dex */
public final class FloatingActionButtonElevation$animateElevation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1$a */
    /* loaded from: classes2.dex */
    public static final class C3282a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ SnapshotStateList f25894a;

        public C3282a(SnapshotStateList snapshotStateList) {
            this.f25894a = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Interaction interaction, Continuation continuation) {
            if (interaction instanceof HoverInteraction.Enter) {
                this.f25894a.add(interaction);
            } else if (interaction instanceof HoverInteraction.Exit) {
                this.f25894a.remove(((HoverInteraction.Exit) interaction).getEnter());
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f25894a.add(interaction);
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                this.f25894a.remove(((FocusInteraction.Unfocus) interaction).getFocus());
            } else if (interaction instanceof PressInteraction.Press) {
                this.f25894a.add(interaction);
            } else if (interaction instanceof PressInteraction.Release) {
                this.f25894a.remove(((PressInteraction.Release) interaction).getPress());
            } else if (interaction instanceof PressInteraction.Cancel) {
                this.f25894a.remove(((PressInteraction.Cancel) interaction).getPress());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super FloatingActionButtonElevation$animateElevation$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FloatingActionButtonElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Flow<Interaction> interactions = this.$interactionSource.getInteractions();
            C3282a c3282a = new C3282a(this.$interactions);
            this.label = 1;
            if (interactions.collect(c3282a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FloatingActionButtonElevation$animateElevation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}