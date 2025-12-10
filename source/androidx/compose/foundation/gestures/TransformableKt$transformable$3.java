package androidx.compose.foundation.gestures;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,220:1\n25#2:221\n25#2:228\n1097#3,6:222\n1097#3,6:229\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$3\n*L\n101#1:221\n122#1:228\n101#1:222,6\n122#1:229,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt$transformable$3 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function0<Boolean> $canPan;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1", m28800f = "Transformable.kt", m28799i = {0, 0, 1}, m28798l = {105, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m28797m = "invokeSuspend", m28796n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect"}, m28795s = {"L$0", "L$1", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1 */
    /* loaded from: classes.dex */
    public static final class C28251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<TransformEvent> $channel;
        final /* synthetic */ TransformableState $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @DebugMetadata(m28801c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1", m28800f = "Transformable.kt", m28799i = {0}, m28798l = {113}, m28797m = "invokeSuspend", m28796n = {"$this$transform"}, m28795s = {"L$0"})
        /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1 */
        /* loaded from: classes.dex */
        public static final class C28261 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Channel<TransformEvent> $channel;
            final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28261(Ref.ObjectRef<TransformEvent> objectRef, Channel<TransformEvent> channel, Continuation<? super C28261> continuation) {
                super(2, continuation);
                this.$event = objectRef;
                this.$channel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C28261 c28261 = new C28261(this.$event, this.$channel, continuation);
                c28261.L$0 = obj;
                return c28261;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C28261) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0059). Please submit an issue!!! */
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
                    androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                    kotlin.ResultKt.throwOnFailure(r7)
                    goto L59
                L17:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1f:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r7 = r6.L$0
                    androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                    r3 = r7
                L27:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                    T r7 = r7.element
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                    if (r1 != 0) goto L5c
                    boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                    if (r1 == 0) goto L36
                    androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                    goto L37
                L36:
                    r7 = 0
                L37:
                    if (r7 == 0) goto L48
                    float r1 = r7.getZoomChange()
                    long r4 = r7.m69453getPanChangeF1C5BW0()
                    float r7 = r7.getRotationChange()
                    r3.mo69384transformByd4ec7I(r1, r4, r7)
                L48:
                    kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                    kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$channel
                    r6.L$0 = r3
                    r6.L$1 = r1
                    r6.label = r2
                    java.lang.Object r7 = r7.receive(r6)
                    if (r7 != r0) goto L59
                    return r0
                L59:
                    r1.element = r7
                    goto L27
                L5c:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$3.C28251.C28261.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28251(Channel<TransformEvent> channel, TransformableState transformableState, Continuation<? super C28251> continuation) {
            super(2, continuation);
            this.$channel = channel;
            this.$state = transformableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C28251 c28251 = new C28251(this.$channel, this.$state, continuation);
            c28251.L$0 = obj;
            return c28251;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007b -> B:14:0x0038). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L17
            L15:
                r10 = r1
                goto L38
            L17:
                goto L15
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.L$2
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r4 = r9.L$1
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                java.lang.Object r5 = r9.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlin.ResultKt.throwOnFailure(r10)
                goto L57
            L31:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            L38:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r10)
                if (r1 == 0) goto L7d
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r4 = r9.$channel
                r9.L$0 = r10
                r9.L$1 = r1
                r9.L$2 = r1
                r9.label = r3
                java.lang.Object r4 = r4.receive(r9)
                if (r4 != r0) goto L54
                return r0
            L54:
                r5 = r10
                r10 = r4
                r4 = r1
            L57:
                r1.element = r10
                T r10 = r4.element
                boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                if (r10 == 0) goto L7b
                androidx.compose.foundation.gestures.TransformableState r10 = r9.$state     // Catch: java.util.concurrent.CancellationException -> L7a
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L7a
                androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1 r6 = new androidx.compose.foundation.gestures.TransformableKt$transformable$3$1$1     // Catch: java.util.concurrent.CancellationException -> L7a
                kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> r7 = r9.$channel     // Catch: java.util.concurrent.CancellationException -> L7a
                r8 = 0
                r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L7a
                r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L7a
                java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L7a
                if (r10 != r0) goto L7b
                return r0
            L7a:
            L7b:
                r10 = r5
                goto L38
            L7d:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$3.C28251.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C28251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$3(boolean z, Function0<Boolean> function0, boolean z2, TransformableState transformableState) {
        super(3);
        this.$lockRotationOnZoomPan = z;
        this.$canPan = function0;
        this.$enabled = z2;
        this.$state = transformableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(298661433);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(298661433, i, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:97)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$canPan, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Channel channel = (Channel) rememberedValue;
        composer.startReplaceableGroup(-2015615917);
        if (this.$enabled) {
            TransformableState transformableState = this.$state;
            EffectsKt.LaunchedEffect(transformableState, new C28251(channel, transformableState, null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TransformableKt$transformable$3$block$1$1(rememberUpdatedState, channel, rememberUpdatedState2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, channel, (Function2) rememberedValue2) : Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
