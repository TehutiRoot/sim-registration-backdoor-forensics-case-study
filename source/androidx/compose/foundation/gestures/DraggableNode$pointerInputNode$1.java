package androidx.compose.foundation.gestures;

import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", m28800f = "Draggable.kt", m28799i = {}, m28798l = {302}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes.dex */
public final class DraggableNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", m28800f = "Draggable.kt", m28799i = {0}, m28798l = {326}, m28797m = "invokeSuspend", m28796n = {"$this$coroutineScope"}, m28795s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1 */
    /* loaded from: classes.dex */
    public static final class C28001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", m28800f = "Draggable.kt", m28799i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, m28798l = {305, 307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 321}, m28797m = "invokeSuspend", m28796n = {"$this$launch", "event", "$this$launch", "event", "$this$launch", "event", "$this$launch", "$this$launch", "$this$launch"}, m28795s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1 */
        /* loaded from: classes.dex */
        public static final class C28011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", m28800f = "Draggable.kt", m28799i = {0}, m28798l = {312}, m28797m = "invokeSuspend", m28796n = {"$this$drag"}, m28795s = {"L$0"})
            @SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableNode$pointerInputNode$1$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,583:1\n1#2:584\n*E\n"})
            /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1 */
            /* loaded from: classes.dex */
            public static final class C28021 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ DraggableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C28021(Ref.ObjectRef<DragEvent> objectRef, DraggableNode draggableNode, Continuation<? super C28021> continuation) {
                    super(2, continuation);
                    this.$event = objectRef;
                    this.this$0 = draggableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C28021 c28021 = new C28021(this.$event, this.this$0, continuation);
                    c28021.L$0 = obj;
                    return c28021;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C28021) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0060 -> B:22:0x0063). Please submit an issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                        int r1 = r6.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r6.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r3 = r6.L$0
                        androidx.compose.foundation.gestures.DragScope r3 = (androidx.compose.foundation.gestures.DragScope) r3
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L63
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        kotlin.ResultKt.throwOnFailure(r7)
                        java.lang.Object r7 = r6.L$0
                        androidx.compose.foundation.gestures.DragScope r7 = (androidx.compose.foundation.gestures.DragScope) r7
                        r3 = r7
                    L27:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r7 = r6.$event
                        T r7 = r7.element
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                        if (r1 != 0) goto L66
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                        if (r1 != 0) goto L66
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                        if (r1 == 0) goto L3a
                        androidx.compose.foundation.gestures.DragEvent$DragDelta r7 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r7
                        goto L3b
                    L3a:
                        r7 = 0
                    L3b:
                        if (r7 == 0) goto L4e
                        androidx.compose.foundation.gestures.DraggableNode r1 = r6.this$0
                        long r4 = r7.m69385getDeltaF1C5BW0()
                        androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.DraggableNode.access$getOrientation$p(r1)
                        float r7 = androidx.compose.foundation.gestures.DraggableKt.m69414access$toFloat3MmeM6k(r4, r7)
                        r3.dragBy(r7)
                    L4e:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r6.$event
                        androidx.compose.foundation.gestures.DraggableNode r7 = r6.this$0
                        kotlinx.coroutines.channels.Channel r7 = androidx.compose.foundation.gestures.DraggableNode.access$getChannel$p(r7)
                        r6.L$0 = r3
                        r6.L$1 = r1
                        r6.label = r2
                        java.lang.Object r7 = r7.receive(r6)
                        if (r7 != r0) goto L63
                        return r0
                    L63:
                        r1.element = r7
                        goto L27
                    L66:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.C28001.C28011.C28021.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28011(DraggableNode draggableNode, Continuation<? super C28011> continuation) {
                super(2, continuation);
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C28011 c28011 = new C28011(this.this$0, continuation);
                c28011.L$0 = obj;
                return c28011;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
                r1 = r8;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[Catch: CancellationException -> 0x00de, TryCatch #1 {CancellationException -> 0x00de, blocks: (B:35:0x00c0, B:37:0x00c6, B:41:0x00e1, B:43:0x00e5), top: B:54:0x00c0 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[Catch: CancellationException -> 0x00de, TryCatch #1 {CancellationException -> 0x00de, blocks: (B:35:0x00c0, B:37:0x00c6, B:41:0x00e1, B:43:0x00e5), top: B:54:0x00c0 }] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00db -> B:20:0x0061). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e3 -> B:20:0x0061). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00f2 -> B:20:0x0061). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0102 -> B:12:0x002a). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0105 -> B:20:0x0061). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.C28001.C28011.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C28011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", m28800f = "Draggable.kt", m28799i = {0, 1, 1}, m28798l = {328, 336}, m28797m = "invokeSuspend", m28796n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, m28795s = {"L$0", "L$0", "I$0"})
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2 */
        /* loaded from: classes.dex */
        public static final class C28032 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28032(CoroutineScope coroutineScope, DraggableNode draggableNode, Continuation<? super C28032> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C28032 c28032 = new C28032(this.$$this$coroutineScope, this.this$0, continuation);
                c28032.L$0 = obj;
                return c28032;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull AwaitPointerEventScope awaitPointerEventScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C28032) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:26|(1:27)|28|29|30|31|(1:33)(9:35|9|10|(0)(0)|16|17|18|19|(2:63|64)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0146 A[Catch: all -> 0x0147, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:54:0x0132, B:58:0x0146), top: B:72:0x0132 }] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d3 -> B:74:0x00da). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0138 -> B:41:0x010f). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0176 -> B:18:0x0054). Please submit an issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 383
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.C28001.C28032.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28001(PointerInputScope pointerInputScope, DraggableNode draggableNode, Continuation<? super C28001> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C28001 c28001 = new C28001(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            c28001.L$0 = obj;
            return c28001;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r11.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L53
            L13:
                r12 = move-exception
                goto L4d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
                kotlinx.coroutines.CoroutineStart r5 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1 r6 = new androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1
                androidx.compose.foundation.gestures.DraggableNode r1 = r11.this$0
                r9 = 0
                r6.<init>(r1, r9)
                r7 = 1
                r8 = 0
                r4 = 0
                r3 = r12
                kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
                androidx.compose.ui.input.pointer.PointerInputScope r1 = r11.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L49
                androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2 r3 = new androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2     // Catch: java.util.concurrent.CancellationException -> L49
                androidx.compose.foundation.gestures.DraggableNode r4 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L49
                r3.<init>(r12, r4, r9)     // Catch: java.util.concurrent.CancellationException -> L49
                r11.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L49
                r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L49
                java.lang.Object r12 = r1.awaitPointerEventScope(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L49
                if (r12 != r0) goto L53
                return r0
            L49:
                r0 = move-exception
                r10 = r0
                r0 = r12
                r12 = r10
            L4d:
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r0 == 0) goto L56
            L53:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            L56:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.C28001.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C28001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$pointerInputNode$1(DraggableNode draggableNode, Continuation<? super DraggableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DraggableNode$pointerInputNode$1 draggableNode$pointerInputNode$1 = new DraggableNode$pointerInputNode$1(this.this$0, continuation);
        draggableNode$pointerInputNode$1.L$0 = obj;
        return draggableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DraggableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            z = this.this$0.f12986s;
            if (!z) {
                return Unit.INSTANCE;
            }
            C28001 c28001 = new C28001(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(c28001, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
