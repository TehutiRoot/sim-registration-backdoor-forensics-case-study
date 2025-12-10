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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", m28800f = "BasicMarquee.kt", m28799i = {}, m28798l = {352}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1 */
    /* loaded from: classes.dex */
    public static final class C27811 extends Lambda implements Function0<Float> {
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27811(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.this$0 = marqueeModifierNode;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Float invoke() {
            int m61555n;
            int m61556m;
            int m61555n2;
            int m61552q;
            boolean m61553p;
            m61555n = this.this$0.m61555n();
            m61556m = this.this$0.m61556m();
            if (m61555n <= m61556m) {
                return null;
            }
            if (MarqueeAnimationMode.m69372equalsimpl0(this.this$0.m61557l(), MarqueeAnimationMode.Companion.m69379getWhileFocusedZbEOnfQ())) {
                m61553p = this.this$0.m61553p();
                if (!m61553p) {
                    return null;
                }
            }
            m61555n2 = this.this$0.m61555n();
            m61552q = this.this$0.m61552q();
            return Float.valueOf(m61555n2 + m61552q);
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", m28800f = "BasicMarquee.kt", m28799i = {0, 0}, m28798l = {365, 367, 369, 369}, m28797m = "invokeSuspend", m28796n = {"contentWithSpacingWidth", "spec"}, m28795s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2 */
    /* loaded from: classes.dex */
    public static final class C27822 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27822(MarqueeModifierNode marqueeModifierNode, Continuation<? super C27822> continuation) {
            super(2, continuation);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C27822 c27822 = new C27822(this.this$0, continuation);
            c27822.L$0 = obj;
            return c27822;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable Float f, @Nullable Continuation<? super Unit> continuation) {
            return ((C27822) create(f, continuation)).invokeSuspend(Unit.INSTANCE);
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
                java.lang.Object r10 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
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
                int r15 = androidx.compose.foundation.MarqueeModifierNode.m61562g(r3)
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r17 = androidx.compose.foundation.MarqueeModifierNode.m61563f(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r18 = androidx.compose.foundation.MarqueeModifierNode.m61566c(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                float r19 = androidx.compose.foundation.MarqueeModifierNode.m61559j(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                androidx.compose.ui.unit.Density r20 = androidx.compose.p003ui.node.DelegatableNodeKt.requireDensity(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m69321access$createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifierNode r4 = r9.this$0
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.m61561h(r4)
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
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.m61561h(r0)     // Catch: java.lang.Throwable -> L33
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
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.m61561h(r0)
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
                androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.m61561h(r1)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.C27822.invokeSuspend(java.lang.Object):java.lang.Object");
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
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new C27811(this.this$0));
            C27822 c27822 = new C27822(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(snapshotFlow, c27822, this) == coroutine_suspended) {
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
