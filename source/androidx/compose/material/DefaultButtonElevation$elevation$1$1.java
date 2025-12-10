package androidx.compose.material;

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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", m28800f = "Button.kt", m28799i = {}, m28798l = {509}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes.dex */
public final class DefaultButtonElevation$elevation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* renamed from: androidx.compose.material.DefaultButtonElevation$elevation$1$1$a */
    /* loaded from: classes.dex */
    public static final class C3098a implements FlowCollector {

        /* renamed from: a */
        public final /* synthetic */ SnapshotStateList f14438a;

        public C3098a(SnapshotStateList snapshotStateList) {
            this.f14438a = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Interaction interaction, Continuation continuation) {
            if (interaction instanceof HoverInteraction.Enter) {
                this.f14438a.add(interaction);
            } else if (interaction instanceof HoverInteraction.Exit) {
                this.f14438a.remove(((HoverInteraction.Exit) interaction).getEnter());
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f14438a.add(interaction);
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                this.f14438a.remove(((FocusInteraction.Unfocus) interaction).getFocus());
            } else if (interaction instanceof PressInteraction.Press) {
                this.f14438a.add(interaction);
            } else if (interaction instanceof PressInteraction.Release) {
                this.f14438a.remove(((PressInteraction.Release) interaction).getPress());
            } else if (interaction instanceof PressInteraction.Cancel) {
                this.f14438a.remove(((PressInteraction.Cancel) interaction).getPress());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultButtonElevation$elevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super DefaultButtonElevation$elevation$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultButtonElevation$elevation$1$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
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
            C3098a c3098a = new C3098a(this.$interactions);
            this.label = 1;
            if (interactions.collect(c3098a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DefaultButtonElevation$elevation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
