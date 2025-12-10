package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", m29092f = "ContraintControllers.kt", m29091i = {}, m29090l = {55}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes.dex */
public final class ConstraintController$track$1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConstraintController<T> this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "T", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.work.impl.constraints.controllers.ConstraintController$track$1$1 */
    /* loaded from: classes.dex */
    public static final class C52271 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ConstraintController$track$1$listener$1 $listener;
        final /* synthetic */ ConstraintController<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C52271(ConstraintController constraintController, ConstraintController$track$1$listener$1 constraintController$track$1$listener$1) {
            super(0);
            this.this$0 = constraintController;
            this.$listener = constraintController$track$1$listener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConstraintTracker constraintTracker;
            constraintTracker = this.this$0.f38589a;
            constraintTracker.removeListener(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintController$track$1(ConstraintController<T> constraintController, Continuation<? super ConstraintController$track$1> continuation) {
        super(2, continuation);
        this.this$0 = constraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ConstraintController$track$1 constraintController$track$1 = new ConstraintController$track$1(this.this$0, continuation);
        constraintController$track$1.L$0 = obj;
        return constraintController$track$1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.ConstraintListener, androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ConstraintTracker constraintTracker;
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
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ConstraintController<T> constraintController = this.this$0;
            ?? r1 = new ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.ConstraintController$track$1$listener$1
                @Override // androidx.work.impl.constraints.ConstraintListener
                public void onConstraintChanged(T t) {
                    ConstraintsState constraintsState;
                    if (ConstraintController.this.isConstrained((ConstraintController) t)) {
                        constraintsState = new ConstraintsState.ConstraintsNotMet(ConstraintController.this.getReason());
                    } else {
                        constraintsState = ConstraintsState.ConstraintsMet.INSTANCE;
                    }
                    producerScope.getChannel().mo74250trySendJP2dKIU(constraintsState);
                }
            };
            constraintTracker = this.this$0.f38589a;
            constraintTracker.addListener(r1);
            C52271 c52271 = new C52271(this.this$0, r1);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c52271, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super ConstraintsState> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConstraintController$track$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}