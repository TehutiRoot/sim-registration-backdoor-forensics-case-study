package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.material3.Selection;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1673:1\n25#2:1674\n25#2:1681\n25#2:1688\n25#2:1699\n36#2:1712\n1114#3,6:1675\n1114#3,6:1682\n1114#3,6:1689\n1114#3,3:1700\n1117#3,3:1706\n1114#3,6:1713\n474#4,4:1695\n478#4,2:1703\n482#4:1709\n474#5:1705\n76#6:1710\n1#7:1711\n76#8:1719\n102#8,2:1720\n76#8:1722\n102#8,2:1723\n76#8:1725\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n*L\n1246#1:1674\n1247#1:1681\n1248#1:1688\n1249#1:1699\n1253#1:1712\n1246#1:1675,6\n1247#1:1682,6\n1248#1:1689,6\n1249#1:1700,3\n1249#1:1706,3\n1253#1:1713,6\n1249#1:1695,4\n1249#1:1703,2\n1249#1:1709\n1249#1:1705\n1250#1:1710\n1246#1:1719\n1246#1:1720,2\n1247#1:1722\n1247#1:1723,2\n1248#1:1725\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt$clockDial$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$2", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {1255}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2 */
    /* loaded from: classes2.dex */
    public static final class C34112 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ MutableState<Float> $offsetX$delegate;
        final /* synthetic */ MutableState<Float> $offsetY$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$1", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$1 */
        /* loaded from: classes2.dex */
        public static final class C34121 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C34121(MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C34121> continuation) {
                super(3, continuation);
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m70721invoked4ec7I(pressGestureScope, offset.m71512unboximpl(), continuation);
            }

            @Nullable
            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final Object m70721invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                C34121 c34121 = new C34121(this.$offsetX$delegate, this.$offsetY$delegate, continuation);
                c34121.J$0 = j;
                return c34121.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.J$0;
                    TimePickerKt$clockDial$2.invoke$lambda$2(this.$offsetX$delegate, Offset.m71502getXimpl(j));
                    TimePickerKt$clockDial$2.invoke$lambda$5(this.$offsetY$delegate, Offset.m71503getYimpl(j));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$2 */
        /* loaded from: classes2.dex */
        public static final class C34132 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {1261}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1 */
            /* loaded from: classes2.dex */
            public static final class C34141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ long $it;
                final /* synthetic */ float $maxDist;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34141(TimePickerState timePickerState, long j, float f, boolean z, Continuation<? super C34141> continuation) {
                    super(2, continuation);
                    this.$state = timePickerState;
                    this.$it = j;
                    this.$maxDist = f;
                    this.$autoSwitchToMinute = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C34141(this.$state, this.$it, this.$maxDist, this.$autoSwitchToMinute, continuation);
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
                        TimePickerState timePickerState = this.$state;
                        float m71502getXimpl = Offset.m71502getXimpl(this.$it);
                        float m71503getYimpl = Offset.m71503getYimpl(this.$it);
                        float f = this.$maxDist;
                        boolean z = this.$autoSwitchToMinute;
                        this.label = 1;
                        if (timePickerState.onTap$material3_release(m71502getXimpl, m71503getYimpl, f, z, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C34141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C34132(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z) {
                super(1);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$autoSwitchToMinute = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m70722invokek4lQ0M(offset.m71512unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m70722invokek4lQ0M(long j) {
                AbstractC1552Vc.m65753e(this.$scope, null, null, new C34141(this.$state, j, this.$maxDist, this.$autoSwitchToMinute, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34112(MutableState<Float> mutableState, MutableState<Float> mutableState2, CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z, Continuation<? super C34112> continuation) {
            super(2, continuation);
            this.$offsetX$delegate = mutableState;
            this.$offsetY$delegate = mutableState2;
            this.$scope = coroutineScope;
            this.$state = timePickerState;
            this.$maxDist = f;
            this.$autoSwitchToMinute = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C34112 c34112 = new C34112(this.$offsetX$delegate, this.$offsetY$delegate, this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, continuation);
            c34112.L$0 = obj;
            return c34112;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34112) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C34121 c34121 = new C34121(this.$offsetX$delegate, this.$offsetY$delegate, null);
                C34132 c34132 = new C34132(this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c34121, c34132, this, 3, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$3", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {1266}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3 */
    /* loaded from: classes2.dex */
    public static final class C34153 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ MutableState<Float> $offsetX$delegate;
        final /* synthetic */ MutableState<Float> $offsetY$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$1 */
        /* loaded from: classes2.dex */
        public static final class C34161 extends Lambda implements Function0<Unit> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {1270, 1272}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1 */
            /* loaded from: classes2.dex */
            public static final class C34171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34171(TimePickerState timePickerState, boolean z, Continuation<? super C34171> continuation) {
                    super(2, continuation);
                    this.$state = timePickerState;
                    this.$autoSwitchToMinute = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C34171(this.$state, this.$autoSwitchToMinute, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        int m70734getSelectionJiIwxys$material3_release = this.$state.m70734getSelectionJiIwxys$material3_release();
                        Selection.Companion companion = Selection.Companion;
                        if (Selection.m70534equalsimpl0(m70734getSelectionJiIwxys$material3_release, companion.m70538getHourJiIwxys()) && this.$autoSwitchToMinute) {
                            this.$state.m70737setSelectioniHAOin8$material3_release(companion.m70539getMinuteJiIwxys());
                            TimePickerState timePickerState = this.$state;
                            this.label = 1;
                            if (timePickerState.animateToCurrent$material3_release(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (Selection.m70534equalsimpl0(this.$state.m70734getSelectionJiIwxys$material3_release(), companion.m70539getMinuteJiIwxys())) {
                            TimePickerState timePickerState2 = this.$state;
                            this.label = 2;
                            if (timePickerState2.settle(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C34171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C34161(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z) {
                super(0);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$autoSwitchToMinute = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AbstractC1552Vc.m65753e(this.$scope, null, null, new C34171(this.$state, this.$autoSwitchToMinute, null), 3, null);
            }
        }

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$2 */
        /* loaded from: classes2.dex */
        public static final class C34182 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
            final /* synthetic */ float $maxDist;
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            @DebugMetadata(m28801c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1", m28800f = "TimePicker.kt", m28799i = {}, m28798l = {1279}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1 */
            /* loaded from: classes2.dex */
            public static final class C34191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ long $dragAmount;
                final /* synthetic */ MutableState<Float> $offsetX$delegate;
                final /* synthetic */ MutableState<Float> $offsetY$delegate;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34191(long j, TimePickerState timePickerState, MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C34191> continuation) {
                    super(2, continuation);
                    this.$dragAmount = j;
                    this.$state = timePickerState;
                    this.$offsetX$delegate = mutableState;
                    this.$offsetY$delegate = mutableState2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C34191(this.$dragAmount, this.$state, this.$offsetX$delegate, this.$offsetY$delegate, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    float m60424u;
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
                        MutableState<Float> mutableState = this.$offsetX$delegate;
                        TimePickerKt$clockDial$2.invoke$lambda$2(mutableState, TimePickerKt$clockDial$2.invoke$lambda$1(mutableState) + Offset.m71502getXimpl(this.$dragAmount));
                        MutableState<Float> mutableState2 = this.$offsetY$delegate;
                        TimePickerKt$clockDial$2.invoke$lambda$5(mutableState2, TimePickerKt$clockDial$2.invoke$lambda$4(mutableState2) + Offset.m71503getYimpl(this.$dragAmount));
                        TimePickerState timePickerState = this.$state;
                        m60424u = TimePickerKt.m60424u(TimePickerKt$clockDial$2.invoke$lambda$4(this.$offsetY$delegate) - IntOffset.m73777getYimpl(this.$state.m70733getCenternOccac$material3_release()), TimePickerKt$clockDial$2.invoke$lambda$1(this.$offsetX$delegate) - IntOffset.m73776getXimpl(this.$state.m70733getCenternOccac$material3_release()));
                        this.label = 1;
                        if (TimePickerState.update$material3_release$default(timePickerState, m60424u, false, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C34191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C34182(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, MutableState<Float> mutableState, MutableState<Float> mutableState2) {
                super(2);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m70723invokeUv8p0NA(pointerInputChange, offset.m71512unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m70723invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
                Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
                AbstractC1552Vc.m65753e(this.$scope, null, null, new C34191(j, this.$state, this.$offsetX$delegate, this.$offsetY$delegate, null), 3, null);
                this.$state.moveSelector$material3_release(TimePickerKt$clockDial$2.invoke$lambda$1(this.$offsetX$delegate), TimePickerKt$clockDial$2.invoke$lambda$4(this.$offsetY$delegate), this.$maxDist);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34153(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z, float f, MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C34153> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$state = timePickerState;
            this.$autoSwitchToMinute = z;
            this.$maxDist = f;
            this.$offsetX$delegate = mutableState;
            this.$offsetY$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C34153 c34153 = new C34153(this.$scope, this.$state, this.$autoSwitchToMinute, this.$maxDist, this.$offsetX$delegate, this.$offsetY$delegate, continuation);
            c34153.L$0 = obj;
            return c34153;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34153) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                C34161 c34161 = new C34161(this.$scope, this.$state, this.$autoSwitchToMinute);
                C34182 c34182 = new C34182(this.$scope, this.$state, this.$maxDist, this.$offsetX$delegate, this.$offsetY$delegate);
                this.label = 1;
                if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, c34161, null, c34182, this, 5, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$clockDial$2(TimePickerState timePickerState, boolean z) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$4(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final long invoke$lambda$7(MutableState<IntOffset> mutableState) {
        return mutableState.getValue().m73785unboximpl();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        float f;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(-1645090088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1645090088, i, -1, "androidx.compose.material3.clockDial.<anonymous> (TimePicker.kt:1244)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19508dK1.m31891g(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19508dK1.m31891g(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19508dK1.m31891g(IntOffset.m73767boximpl(IntOffset.Companion.m73786getZeronOccac()), null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue3;
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue4 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue4).getCoroutineScope();
        composer.endReplaceableGroup();
        f = TimePickerKt.f26389h;
        float mo69438toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo69438toPx0680j_4(f);
        Modifier.Companion companion2 = Modifier.Companion;
        TimePickerState timePickerState = this.$state;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(timePickerState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new TimePickerKt$clockDial$2$1$1(timePickerState);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) rememberedValue5), new Object[]{this.$state, IntOffset.m73767boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(mo69438toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C34112(mutableState, mutableState2, coroutineScope, this.$state, mo69438toPx0680j_4, this.$autoSwitchToMinute, null)), new Object[]{this.$state, IntOffset.m73767boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(mo69438toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C34153(coroutineScope, this.$state, this.$autoSwitchToMinute, mo69438toPx0680j_4, mutableState, mutableState2, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
