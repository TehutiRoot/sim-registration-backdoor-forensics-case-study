package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", m29092f = "LazyLayoutAnimateItemModifierNode.kt", m29091i = {0}, m29090l = {97, 103}, m29089m = "invokeSuspend", m29088n = {"spec"}, m29087s = {"L$0"})
@SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n79#2:136\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1\n*L\n102#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n79#2:136\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1\n*L\n105#1:136\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1$1 */
    /* loaded from: classes.dex */
    public static final class C29081 extends Lambda implements Function1<Animatable<IntOffset, AnimationVector2D>, Unit> {
        final /* synthetic */ long $animationTarget;
        final /* synthetic */ LazyLayoutAnimateItemModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29081(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j) {
            super(1);
            this.this$0 = lazyLayoutAnimateItemModifierNode;
            this.$animationTarget = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable) {
            invoke2(animatable);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Animatable<IntOffset, AnimationVector2D> animateTo) {
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = this.this$0;
            long m73969unboximpl = animateTo.getValue().m73969unboximpl();
            long j = this.$animationTarget;
            lazyLayoutAnimateItemModifierNode.m61167b(IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(m73969unboximpl) - IntOffset.m73960getXimpl(j), IntOffset.m73961getYimpl(m73969unboximpl) - IntOffset.m73961getYimpl(j)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode, long j, Continuation<? super LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutAnimateItemModifierNode;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this.this$0, this.$totalDelta, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Animatable animatable;
        FiniteAnimationSpec<IntOffset> placementAnimationSpec;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.m61168a(false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finiteAnimationSpec = (FiniteAnimationSpec) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            animatable = this.this$0.f13703q;
            if (animatable.isRunning()) {
                if (!(this.this$0.getPlacementAnimationSpec() instanceof SpringSpec)) {
                    placementAnimationSpec = LazyLayoutAnimateItemModifierNodeKt.f13705a;
                } else {
                    placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
                }
            } else {
                placementAnimationSpec = this.this$0.getPlacementAnimationSpec();
            }
            finiteAnimationSpec = placementAnimationSpec;
            animatable2 = this.this$0.f13703q;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.f13703q;
                IntOffset m73951boximpl = IntOffset.m73951boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable3.snapTo(m73951boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = finiteAnimationSpec;
        animatable4 = this.this$0.f13703q;
        long m73969unboximpl = ((IntOffset) animatable4.getValue()).m73969unboximpl();
        long j = this.$totalDelta;
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73960getXimpl(m73969unboximpl) - IntOffset.m73960getXimpl(j), IntOffset.m73961getYimpl(m73969unboximpl) - IntOffset.m73961getYimpl(j));
        animatable5 = this.this$0.f13703q;
        IntOffset m73951boximpl2 = IntOffset.m73951boximpl(IntOffset);
        C29081 c29081 = new C29081(this.this$0, IntOffset);
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, m73951boximpl2, finiteAnimationSpec2, null, c29081, this, 4, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.m61168a(false);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}