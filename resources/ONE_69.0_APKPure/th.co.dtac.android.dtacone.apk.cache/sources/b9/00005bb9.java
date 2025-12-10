package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$ClockFace$2 extends Lambda implements Function3<List<? extends Integer>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1 */
    /* loaded from: classes2.dex */
    public static final class C33841 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ TimePickerColors $colors;
        final /* synthetic */ List<Integer> $screen;
        final /* synthetic */ TimePickerState $state;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1 */
        /* loaded from: classes2.dex */
        public static final class C33851 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ List<Integer> $screen;
            final /* synthetic */ TimePickerState $state;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$2$1$1$2 */
            /* loaded from: classes2.dex */
            public static final class C33862 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ int $$dirty;
                final /* synthetic */ boolean $autoSwitchToMinute;
                final /* synthetic */ TimePickerState $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C33862(TimePickerState timePickerState, boolean z, int i) {
                    super(2);
                    this.$state = timePickerState;
                    this.$autoSwitchToMinute = z;
                    this.$$dirty = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer, int i) {
                    List list;
                    List list2;
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-448649404, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1167)");
                    }
                    list = TimePickerKt.f26481l;
                    int size = list.size();
                    TimePickerState timePickerState = this.$state;
                    boolean z = this.$autoSwitchToMinute;
                    int i2 = this.$$dirty;
                    for (int i3 = 0; i3 < size; i3++) {
                        list2 = TimePickerKt.f26481l;
                        TimePickerKt.m60392c(timePickerState, ((Number) list2.get(i3)).intValue(), z, composer, i2 & 910);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33851(List<Integer> list, TimePickerState timePickerState, boolean z, int i) {
                super(2);
                this.$screen = list;
                this.$state = timePickerState;
                this.$autoSwitchToMinute = z;
                this.$$dirty = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                float f;
                int intValue;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2018362505, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1150)");
                }
                composer.startReplaceableGroup(-504302349);
                int size = this.$screen.size();
                TimePickerState timePickerState = this.$state;
                List<Integer> list = this.$screen;
                boolean z = this.$autoSwitchToMinute;
                int i2 = this.$$dirty;
                for (int i3 = 0; i3 < size; i3++) {
                    if (timePickerState.is24hour() && !Selection.m70718equalsimpl0(timePickerState.m70918getSelectionJiIwxys$material3_release(), Selection.Companion.m70723getMinuteJiIwxys())) {
                        intValue = list.get(i3).intValue() % 12;
                    } else {
                        intValue = list.get(i3).intValue();
                    }
                    TimePickerKt.m60392c(timePickerState, intValue, z, composer, i2 & 910);
                }
                composer.endReplaceableGroup();
                if (Selection.m70718equalsimpl0(this.$state.m70918getSelectionJiIwxys$material3_release(), Selection.Companion.m70722getHourJiIwxys()) && this.$state.is24hour()) {
                    Modifier m69504backgroundbw27NRU = BackgroundKt.m69504backgroundbw27NRU(SizeKt.m69748size3ABfNKs(LayoutIdKt.layoutId(Modifier.Companion, LayoutId.InnerCircle), TimePickerTokens.INSTANCE.m71484getClockDialContainerSizeD9Ej5fM()), Color.Companion.m71954getTransparent0d7_KjU(), RoundedCornerShapeKt.getCircleShape());
                    f = TimePickerKt.f26471b;
                    TimePickerKt.m60394a(m69504backgroundbw27NRU, f, ComposableLambdaKt.composableLambda(composer, -448649404, true, new C33862(this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 432, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33841(TimePickerColors timePickerColors, List<Integer> list, TimePickerState timePickerState, boolean z, int i) {
            super(2);
            this.$colors = timePickerColors;
            this.$screen = list;
            this.$state = timePickerState;
            this.$autoSwitchToMinute = z;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385633737, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1147)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(this.$colors.m70885clockDialContentColorvNxB06k$material3_release(false)))}, ComposableLambdaKt.composableLambda(composer, -2018362505, true, new C33851(this.$screen, this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockFace$2(TimePickerState timePickerState, boolean z, TimePickerColors timePickerColors, int i) {
        super(3);
        this.$state = timePickerState;
        this.$autoSwitchToMinute = z;
        this.$colors = timePickerColors;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list, Composer composer, Integer num) {
        invoke((List<Integer>) list, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull List<Integer> screen, @Nullable Composer composer, int i) {
        Modifier m60373v;
        Modifier m60371x;
        float f;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1628166511, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1140)");
        }
        m60373v = TimePickerKt.m60373v(Modifier.Companion, this.$state, this.$autoSwitchToMinute);
        m60371x = TimePickerKt.m60371x(SizeKt.m69748size3ABfNKs(m60373v, TimePickerTokens.INSTANCE.m71484getClockDialContainerSizeD9Ej5fM()), this.$state, this.$colors);
        f = TimePickerKt.f26470a;
        TimePickerKt.m60394a(m60371x, f, ComposableLambdaKt.composableLambda(composer, -1385633737, true, new C33841(this.$colors, screen, this.$state, this.$autoSwitchToMinute, this.$$dirty)), composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}