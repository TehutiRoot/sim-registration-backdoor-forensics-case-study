package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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
@DebugMetadata(m29093c = "androidx.compose.material3.ChipElevation$animateElevation$1$1", m29092f = "Chip.kt", m29091i = {}, m29090l = {1497}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes2.dex */
public final class ChipElevation$animateElevation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* renamed from: androidx.compose.material3.ChipElevation$animateElevation$1$1$a */
    /* loaded from: classes2.dex */
    public static final class C3231a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ SnapshotStateList f25732a;

        public C3231a(SnapshotStateList snapshotStateList) {
            this.f25732a = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Interaction interaction, Continuation continuation) {
            if (interaction instanceof HoverInteraction.Enter) {
                this.f25732a.add(interaction);
            } else if (interaction instanceof HoverInteraction.Exit) {
                this.f25732a.remove(((HoverInteraction.Exit) interaction).getEnter());
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f25732a.add(interaction);
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                this.f25732a.remove(((FocusInteraction.Unfocus) interaction).getFocus());
            } else if (interaction instanceof PressInteraction.Press) {
                this.f25732a.add(interaction);
            } else if (interaction instanceof PressInteraction.Release) {
                this.f25732a.remove(((PressInteraction.Release) interaction).getPress());
            } else if (interaction instanceof PressInteraction.Cancel) {
                this.f25732a.remove(((PressInteraction.Cancel) interaction).getPress());
            } else if (interaction instanceof DragInteraction.Start) {
                this.f25732a.add(interaction);
            } else if (interaction instanceof DragInteraction.Stop) {
                this.f25732a.remove(((DragInteraction.Stop) interaction).getStart());
            } else if (interaction instanceof DragInteraction.Cancel) {
                this.f25732a.remove(((DragInteraction.Cancel) interaction).getStart());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super ChipElevation$animateElevation$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ChipElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, continuation);
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
            C3231a c3231a = new C3231a(this.$interactions);
            this.label = 1;
            if (interactions.collect(c3231a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ChipElevation$animateElevation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}