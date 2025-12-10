package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, m28850d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.animation.core.Animatable$runAnimation$2", m28800f = "Animatable.kt", m28799i = {0, 0}, m28798l = {305}, m28797m = "invokeSuspend", m28796n = {"endState", "clampingNeeded"}, m28795s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, m28850d2 = {"<anonymous>", "", "T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1 */
    /* loaded from: classes.dex */
    public static final class C27321 extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
        final /* synthetic */ Function1<Animatable<T, V>, Unit> $block;
        final /* synthetic */ Ref.BooleanRef $clampingNeeded;
        final /* synthetic */ AnimationState<T, V> $endState;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C27321(Animatable<T, V> animatable, AnimationState<T, V> animationState, Function1<? super Animatable<T, V>, Unit> function1, Ref.BooleanRef booleanRef) {
            super(1);
            this.this$0 = animatable;
            this.$endState = animationState;
            this.$block = function1;
            this.$clampingNeeded = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnimationScope) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AnimationScope<T, V> animate) {
            Object m61710a;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            SuspendAnimationKt.updateState(animate, this.this$0.getInternalState$animation_core_release());
            m61710a = this.this$0.m61710a(animate.getValue());
            if (!Intrinsics.areEqual(m61710a, animate.getValue())) {
                this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(m61710a);
                this.$endState.setValue$animation_core_release(m61710a);
                Function1<Animatable<T, V>, Unit> function1 = this.$block;
                if (function1 != 0) {
                    function1.invoke(this.this$0);
                }
                animate.cancelAnimation();
                this.$clampingNeeded.element = true;
                return;
            }
            Function1<Animatable<T, V>, Unit> function12 = this.$block;
            if (function12 != 0) {
                function12.invoke(this.this$0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super Animatable$runAnimation$2> continuation) {
        super(1, continuation);
        this.this$0 = animatable;
        this.$initialVelocity = t;
        this.$animation = animation;
        this.$startTime = j;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        AnimationEndReason animationEndReason;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    booleanRef = (Ref.BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.m61705f(this.$animation.getTargetValue());
                this.this$0.m61706e(true);
                AnimationState copy$default = AnimationStateKt.copy$default(this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Animation<T, V> animation = this.$animation;
                long j = this.$startTime;
                C27321 c27321 = new C27321(this.this$0, copy$default, this.$block, booleanRef2);
                this.L$0 = copy$default;
                this.L$1 = booleanRef2;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j, c27321, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animationState = copy$default;
                booleanRef = booleanRef2;
            }
            if (booleanRef.element) {
                animationEndReason = AnimationEndReason.BoundReached;
            } else {
                animationEndReason = AnimationEndReason.Finished;
            }
            this.this$0.m61708c();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e) {
            this.this$0.m61708c();
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super AnimationResult<T, V>> continuation) {
        return ((Animatable$runAnimation$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
