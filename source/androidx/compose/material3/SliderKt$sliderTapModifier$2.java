package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1508:1\n474#2,4:1509\n478#2,2:1517\n482#2:1523\n25#3:1513\n1114#4,3:1514\n1117#4,3:1520\n474#5:1519\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt$sliderTapModifier$2\n*L\n1174#1:1509,4\n1174#1:1517,2\n1174#1:1523\n1174#1:1513\n1174#1:1514,3\n1174#1:1520,3\n1174#1:1519\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderKt$sliderTapModifier$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ DraggableState $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ int $maxPx;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ State<Float> $rawOffset;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1", m28800f = "Slider.kt", m28799i = {}, m28798l = {1176}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1 */
    /* loaded from: classes2.dex */
    public static final class C33671 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DraggableState $draggableState;
        final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ int $maxPx;
        final /* synthetic */ MutableState<Float> $pressOffset;
        final /* synthetic */ State<Float> $rawOffset;
        final /* synthetic */ CoroutineScope $scope;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @DebugMetadata(m28801c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1", m28800f = "Slider.kt", m28799i = {}, m28798l = {1181}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$1 */
        /* loaded from: classes2.dex */
        public static final class C33681 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ int $maxPx;
            final /* synthetic */ MutableState<Float> $pressOffset;
            final /* synthetic */ State<Float> $rawOffset;
            /* synthetic */ long J$0;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33681(boolean z, int i, MutableState<Float> mutableState, State<Float> state, Continuation<? super C33681> continuation) {
                super(3, continuation);
                this.$isRtl = z;
                this.$maxPx = i;
                this.$pressOffset = mutableState;
                this.$rawOffset = state;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m70543invoked4ec7I(pressGestureScope, offset.m71512unboximpl(), continuation);
            }

            @Nullable
            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final Object m70543invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                C33681 c33681 = new C33681(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                c33681.L$0 = pressGestureScope;
                c33681.J$0 = j;
                return c33681.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                float m71502getXimpl;
                Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                        long j = this.J$0;
                        if (this.$isRtl) {
                            m71502getXimpl = this.$maxPx - Offset.m71502getXimpl(j);
                        } else {
                            m71502getXimpl = Offset.m71502getXimpl(j);
                        }
                        this.$pressOffset.setValue(Boxing.boxFloat(m71502getXimpl - this.$rawOffset.getValue().floatValue()));
                        this.label = 1;
                        if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } catch (GestureCancellationException unused) {
                    this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2 */
        /* loaded from: classes2.dex */
        public static final class C33692 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ DraggableState $draggableState;
            final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
            final /* synthetic */ CoroutineScope $scope;

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @DebugMetadata(m28801c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1", m28800f = "Slider.kt", m28799i = {}, m28798l = {1188}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
            /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1 */
            /* loaded from: classes2.dex */
            public static final class C33701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function0<Unit>> $gestureEndAction;
                int label;

                @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                @DebugMetadata(m28801c = "androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1", m28800f = "Slider.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
                /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$2$1$2$1$1 */
                /* loaded from: classes2.dex */
                public static final class C33711 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    public C33711(Continuation<? super C33711> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C33711 c33711 = new C33711(continuation);
                        c33711.L$0 = obj;
                        return c33711;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation<? super Unit> continuation) {
                        return ((C33711) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            ((DragScope) this.L$0).dragBy(0.0f);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C33701(DraggableState draggableState, State<? extends Function0<Unit>> state, Continuation<? super C33701> continuation) {
                    super(2, continuation);
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C33701(this.$draggableState, this.$gestureEndAction, continuation);
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
                        DraggableState draggableState = this.$draggableState;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        C33711 c33711 = new C33711(null);
                        this.label = 1;
                        if (draggableState.drag(mutatePriority, c33711, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.$gestureEndAction.getValue().invoke();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C33701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C33692(CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state) {
                super(1);
                this.$scope = coroutineScope;
                this.$draggableState = draggableState;
                this.$gestureEndAction = state;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m70544invokek4lQ0M(offset.m71512unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m70544invokek4lQ0M(long j) {
                AbstractC1552Vc.m65753e(this.$scope, null, null, new C33701(this.$draggableState, this.$gestureEndAction, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33671(boolean z, int i, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function0<Unit>> state2, Continuation<? super C33671> continuation) {
            super(2, continuation);
            this.$isRtl = z;
            this.$maxPx = i;
            this.$pressOffset = mutableState;
            this.$rawOffset = state;
            this.$scope = coroutineScope;
            this.$draggableState = draggableState;
            this.$gestureEndAction = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C33671 c33671 = new C33671(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
            c33671.L$0 = obj;
            return c33671;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C33671) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C33681 c33681 = new C33681(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                C33692 c33692 = new C33692(this.$scope, this.$draggableState, this.$gestureEndAction);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c33681, c33692, this, 3, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$sliderTapModifier$2(boolean z, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z2, MutableState<Float> mutableState, State<Float> state, State<? extends Function0<Unit>> state2) {
        super(3);
        this.$enabled = z;
        this.$draggableState = draggableState;
        this.$interactionSource = mutableInteractionSource;
        this.$maxPx = i;
        this.$isRtl = z2;
        this.$pressOffset = mutableState;
        this.$rawOffset = state;
        this.$gestureEndAction = state2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(2040469710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2040469710, i, -1, "androidx.compose.material3.sliderTapModifier.<anonymous> (Slider.kt:1171)");
        }
        if (this.$enabled) {
            composer.startReplaceableGroup(773894976);
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{this.$draggableState, this.$interactionSource, Integer.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C33671(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, coroutineScope, this.$draggableState, this.$gestureEndAction, null));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composed;
    }
}
