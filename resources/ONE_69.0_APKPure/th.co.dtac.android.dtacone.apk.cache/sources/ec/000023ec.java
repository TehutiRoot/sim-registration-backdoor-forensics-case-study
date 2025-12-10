package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m29092f = "BasicMarquee.kt", m29091i = {}, m29090l = {352}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1 */
    /* loaded from: classes.dex */
    public static final class C27631 extends Lambda implements Function0<Float> {
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27631(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.this$0 = marqueeModifierNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Float invoke() {
            int m61505n;
            int m61506m;
            int m61505n2;
            int m61502q;
            boolean m61503p;
            m61505n = this.this$0.m61505n();
            m61506m = this.this$0.m61506m();
            if (m61505n <= m61506m) {
                return null;
            }
            if (MarqueeAnimationMode.m69557equalsimpl0(this.this$0.m61507l(), MarqueeAnimationMode.Companion.m69564getWhileFocusedZbEOnfQ())) {
                m61503p = this.this$0.m61503p();
                if (!m61503p) {
                    return null;
                }
            }
            m61505n2 = this.this$0.m61505n();
            m61502q = this.this$0.m61502q();
            return Float.valueOf(m61505n2 + m61502q);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m29092f = "BasicMarquee.kt", m29091i = {0, 0}, m29090l = {365, 367, 369, 369}, m29089m = "invokeSuspend", m29088n = {"contentWithSpacingWidth", "spec"}, m29087s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2 */
    /* loaded from: classes.dex */
    public static final class C27642 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27642(MarqueeModifierNode marqueeModifierNode, Continuation<? super C27642> continuation) {
            super(2, continuation);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C27642 c27642 = new C27642(this.this$0, continuation);
            c27642.L$0 = obj;
            return c27642;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable Float f, @Nullable Continuation<? super Unit> continuation) {
            return ((C27642) create(f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = p000.AbstractC19782eg0.getCOROUTINE_SUSPENDED()
                int r0 = r9.label
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L43
                if (r0 == r2) goto L36
                if (r0 == r1) goto L2e
                if (r0 == r12) goto L29
                if (r0 == r11) goto L20
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r22)
                goto Ld5
            L29:
                kotlin.ResultKt.throwOnFailure(r22)
                goto Lbb
            L2e:
                kotlin.ResultKt.throwOnFailure(r22)     // Catch: java.lang.Throwable -> L33
                goto La8
            L33:
                r0 = move-exception
                goto Lbe
            L36:
                java.lang.Object r0 = r9.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r9.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                kotlin.ResultKt.throwOnFailure(r22)
                r3 = r0
                goto L8d
            L43:
                kotlin.ResultKt.throwOnFailure(r22)
                java.lang.Object r0 = r9.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L4f
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4f:
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r15 = androidx.compose.foundation.MarqueeModifierNode.m61512g(r3)
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r17 = androidx.compose.foundation.MarqueeModifierNode.m61513f(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r18 = androidx.compose.foundation.MarqueeModifierNode.m61516c(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                float r19 = androidx.compose.foundation.MarqueeModifierNode.m61509j(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                androidx.compose.ui.unit.Density r20 = androidx.compose.p003ui.node.DelegatableNodeKt.requireDensity(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m69507access$createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifierNode r4 = r9.this$0
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.m61511h(r4)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                r9.L$0 = r0
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r2 = r4.snapTo(r5, r9)
                if (r2 != r10) goto L8c
                return r10
            L8c:
                r2 = r0
            L8d:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0     // Catch: java.lang.Throwable -> L33
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.m61511h(r0)     // Catch: java.lang.Throwable -> L33
                r9.L$0 = r13     // Catch: java.lang.Throwable -> L33
                r9.L$1 = r13     // Catch: java.lang.Throwable -> L33
                r9.label = r1     // Catch: java.lang.Throwable -> L33
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
                if (r0 != r10) goto La8
                return r10
            La8:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.m61511h(r0)
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                r9.label = r12
                java.lang.Object r0 = r0.snapTo(r1, r9)
                if (r0 != r10) goto Lbb
                return r10
            Lbb:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            Lbe:
                androidx.compose.foundation.MarqueeModifierNode r1 = r9.this$0
                androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.m61511h(r1)
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r14)
                r9.L$0 = r0
                r9.L$1 = r13
                r9.label = r11
                java.lang.Object r1 = r1.snapTo(r2, r9)
                if (r1 != r10) goto Ld5
                return r10
            Ld5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.C27642.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, Continuation<? super MarqueeModifierNode$runAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, continuation);
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
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new C27631(this.this$0));
            C27642 c27642 = new C27642(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(snapshotFlow, c27642, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarqueeModifierNode$runAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}