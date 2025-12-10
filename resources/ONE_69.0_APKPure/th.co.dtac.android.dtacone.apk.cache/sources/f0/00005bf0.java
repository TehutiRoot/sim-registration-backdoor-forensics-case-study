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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1673:1\n25#2:1674\n25#2:1681\n25#2:1688\n25#2:1699\n36#2:1712\n1114#3,6:1675\n1114#3,6:1682\n1114#3,6:1689\n1114#3,3:1700\n1117#3,3:1706\n1114#3,6:1713\n474#4,4:1695\n478#4,2:1703\n482#4:1709\n474#5:1705\n76#6:1710\n1#7:1711\n76#8:1719\n102#8,2:1720\n76#8:1722\n102#8,2:1723\n76#8:1725\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$clockDial$2\n*L\n1246#1:1674\n1247#1:1681\n1248#1:1688\n1249#1:1699\n1253#1:1712\n1246#1:1675,6\n1247#1:1682,6\n1248#1:1689,6\n1249#1:1700,3\n1249#1:1706,3\n1253#1:1713,6\n1249#1:1695,4\n1249#1:1703,2\n1249#1:1709\n1249#1:1705\n1250#1:1710\n1246#1:1719\n1246#1:1720,2\n1247#1:1722\n1247#1:1723,2\n1248#1:1725\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt$clockDial$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$2", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1255}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2 */
    /* loaded from: classes2.dex */
    public static final class C33932 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ MutableState<Float> $offsetX$delegate;
        final /* synthetic */ MutableState<Float> $offsetY$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$1", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$1 */
        /* loaded from: classes2.dex */
        public static final class C33941 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33941(MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C33941> continuation) {
                super(3, continuation);
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
                return m70905invoked4ec7I(pressGestureScope, offset.m71696unboximpl(), continuation);
            }

            @Nullable
            /* renamed from: invoke-d-4ec7I  reason: not valid java name */
            public final Object m70905invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation<? super Unit> continuation) {
                C33941 c33941 = new C33941(this.$offsetX$delegate, this.$offsetY$delegate, continuation);
                c33941.J$0 = j;
                return c33941.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.J$0;
                    TimePickerKt$clockDial$2.invoke$lambda$2(this.$offsetX$delegate, Offset.m71686getXimpl(j));
                    TimePickerKt$clockDial$2.invoke$lambda$5(this.$offsetY$delegate, Offset.m71687getYimpl(j));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$2 */
        /* loaded from: classes2.dex */
        public static final class C33952 extends Lambda implements Function1<Offset, Unit> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1261}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$2$2$1 */
            /* loaded from: classes2.dex */
            public static final class C33961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ long $it;
                final /* synthetic */ float $maxDist;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C33961(TimePickerState timePickerState, long j, float f, boolean z, Continuation<? super C33961> continuation) {
                    super(2, continuation);
                    this.$state = timePickerState;
                    this.$it = j;
                    this.$maxDist = f;
                    this.$autoSwitchToMinute = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C33961(this.$state, this.$it, this.$maxDist, this.$autoSwitchToMinute, continuation);
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
                        TimePickerState timePickerState = this.$state;
                        float m71686getXimpl = Offset.m71686getXimpl(this.$it);
                        float m71687getYimpl = Offset.m71687getYimpl(this.$it);
                        float f = this.$maxDist;
                        boolean z = this.$autoSwitchToMinute;
                        this.label = 1;
                        if (timePickerState.onTap$material3_release(m71686getXimpl, m71687getYimpl, f, z, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C33961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33952(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z) {
                super(1);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$autoSwitchToMinute = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m70906invokek4lQ0M(offset.m71696unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
            public final void m70906invokek4lQ0M(long j) {
                AbstractC1539Vc.m65885e(this.$scope, null, null, new C33961(this.$state, j, this.$maxDist, this.$autoSwitchToMinute, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33932(MutableState<Float> mutableState, MutableState<Float> mutableState2, CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z, Continuation<? super C33932> continuation) {
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
            C33932 c33932 = new C33932(this.$offsetX$delegate, this.$offsetY$delegate, this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, continuation);
            c33932.L$0 = obj;
            return c33932;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C33932) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C33941 c33941 = new C33941(this.$offsetX$delegate, this.$offsetY$delegate, null);
                C33952 c33952 = new C33952(this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute);
                this.label = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c33941, c33952, this, 3, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$3", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1266}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3 */
    /* loaded from: classes2.dex */
    public static final class C33973 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ MutableState<Float> $offsetX$delegate;
        final /* synthetic */ MutableState<Float> $offsetY$delegate;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$1 */
        /* loaded from: classes2.dex */
        public static final class C33981 extends Lambda implements Function0<Unit> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1270, 1272}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$1$1 */
            /* loaded from: classes2.dex */
            public static final class C33991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C33991(TimePickerState timePickerState, boolean z, Continuation<? super C33991> continuation) {
                    super(2, continuation);
                    this.$state = timePickerState;
                    this.$autoSwitchToMinute = z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C33991(this.$state, this.$autoSwitchToMinute, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        int m70918getSelectionJiIwxys$material3_release = this.$state.m70918getSelectionJiIwxys$material3_release();
                        Selection.Companion companion = Selection.Companion;
                        if (Selection.m70718equalsimpl0(m70918getSelectionJiIwxys$material3_release, companion.m70722getHourJiIwxys()) && this.$autoSwitchToMinute) {
                            this.$state.m70921setSelectioniHAOin8$material3_release(companion.m70723getMinuteJiIwxys());
                            TimePickerState timePickerState = this.$state;
                            this.label = 1;
                            if (timePickerState.animateToCurrent$material3_release(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (Selection.m70718equalsimpl0(this.$state.m70918getSelectionJiIwxys$material3_release(), companion.m70723getMinuteJiIwxys())) {
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
                    return ((C33991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33981(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z) {
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
                AbstractC1539Vc.m65885e(this.$scope, null, null, new C33991(this.$state, this.$autoSwitchToMinute, null), 3, null);
            }
        }

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$2 */
        /* loaded from: classes2.dex */
        public static final class C34002 extends Lambda implements Function2<PointerInputChange, Offset, Unit> {
            final /* synthetic */ float $maxDist;
            final /* synthetic */ MutableState<Float> $offsetX$delegate;
            final /* synthetic */ MutableState<Float> $offsetY$delegate;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1279}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: androidx.compose.material3.TimePickerKt$clockDial$2$3$2$1 */
            /* loaded from: classes2.dex */
            public static final class C34011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ long $dragAmount;
                final /* synthetic */ MutableState<Float> $offsetX$delegate;
                final /* synthetic */ MutableState<Float> $offsetY$delegate;
                final /* synthetic */ TimePickerState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C34011(long j, TimePickerState timePickerState, MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C34011> continuation) {
                    super(2, continuation);
                    this.$dragAmount = j;
                    this.$state = timePickerState;
                    this.$offsetX$delegate = mutableState;
                    this.$offsetY$delegate = mutableState2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C34011(this.$dragAmount, this.$state, this.$offsetX$delegate, this.$offsetY$delegate, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    float m60374u;
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
                        MutableState<Float> mutableState = this.$offsetX$delegate;
                        TimePickerKt$clockDial$2.invoke$lambda$2(mutableState, TimePickerKt$clockDial$2.invoke$lambda$1(mutableState) + Offset.m71686getXimpl(this.$dragAmount));
                        MutableState<Float> mutableState2 = this.$offsetY$delegate;
                        TimePickerKt$clockDial$2.invoke$lambda$5(mutableState2, TimePickerKt$clockDial$2.invoke$lambda$4(mutableState2) + Offset.m71687getYimpl(this.$dragAmount));
                        TimePickerState timePickerState = this.$state;
                        m60374u = TimePickerKt.m60374u(TimePickerKt$clockDial$2.invoke$lambda$4(this.$offsetY$delegate) - IntOffset.m73961getYimpl(this.$state.m70917getCenternOccac$material3_release()), TimePickerKt$clockDial$2.invoke$lambda$1(this.$offsetX$delegate) - IntOffset.m73960getXimpl(this.$state.m70917getCenternOccac$material3_release()));
                        this.label = 1;
                        if (TimePickerState.update$material3_release$default(timePickerState, m60374u, false, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C34011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C34002(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, MutableState<Float> mutableState, MutableState<Float> mutableState2) {
                super(2);
                this.$scope = coroutineScope;
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$offsetX$delegate = mutableState;
                this.$offsetY$delegate = mutableState2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m70907invokeUv8p0NA(pointerInputChange, offset.m71696unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
            public final void m70907invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j) {
                Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
                AbstractC1539Vc.m65885e(this.$scope, null, null, new C34011(j, this.$state, this.$offsetX$delegate, this.$offsetY$delegate, null), 3, null);
                this.$state.moveSelector$material3_release(TimePickerKt$clockDial$2.invoke$lambda$1(this.$offsetX$delegate), TimePickerKt$clockDial$2.invoke$lambda$4(this.$offsetY$delegate), this.$maxDist);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33973(CoroutineScope coroutineScope, TimePickerState timePickerState, boolean z, float f, MutableState<Float> mutableState, MutableState<Float> mutableState2, Continuation<? super C33973> continuation) {
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
            C33973 c33973 = new C33973(this.$scope, this.$state, this.$autoSwitchToMinute, this.$maxDist, this.$offsetX$delegate, this.$offsetY$delegate, continuation);
            c33973.L$0 = obj;
            return c33973;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C33973) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C33981 c33981 = new C33981(this.$scope, this.$state, this.$autoSwitchToMinute);
                C34002 c34002 = new C34002(this.$scope, this.$state, this.$maxDist, this.$offsetX$delegate, this.$offsetY$delegate);
                this.label = 1;
                if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, c33981, null, c34002, this, 5, null) == coroutine_suspended) {
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
        return mutableState.getValue().m73969unboximpl();
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
            rememberedValue = AbstractC19036aL1.m65148g(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Float.valueOf(0.0f), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(IntOffset.m73951boximpl(IntOffset.Companion.m73970getZeronOccac()), null, 2, null);
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
        f = TimePickerKt.f26477h;
        float mo69622toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo69622toPx0680j_4(f);
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
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) rememberedValue5), new Object[]{this.$state, IntOffset.m73951boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(mo69622toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C33932(mutableState, mutableState2, coroutineScope, this.$state, mo69622toPx0680j_4, this.$autoSwitchToMinute, null)), new Object[]{this.$state, IntOffset.m73951boximpl(invoke$lambda$7(mutableState3)), Float.valueOf(mo69622toPx0680j_4)}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new C33973(coroutineScope, this.$state, this.$autoSwitchToMinute, mo69622toPx0680j_4, mutableState, mutableState2, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}