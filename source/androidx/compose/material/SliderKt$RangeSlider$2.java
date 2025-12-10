package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n76#2:1191\n76#2:1192\n25#3:1193\n25#3:1200\n25#3:1211\n83#3,3:1222\n50#3:1231\n49#3:1232\n50#3:1239\n49#3:1240\n1097#4,6:1194\n1097#4,6:1201\n1097#4,3:1212\n1100#4,3:1218\n1097#4,6:1225\n1097#4,6:1233\n1097#4,6:1241\n486#5,4:1207\n490#5,2:1215\n494#5:1221\n486#6:1217\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n316#1:1191\n321#1:1192\n332#1:1193\n333#1:1200\n350#1:1211\n375#1:1222,3\n417#1:1231\n417#1:1232\n425#1:1239\n425#1:1240\n332#1:1194,6\n333#1:1201,6\n350#1:1212,3\n350#1:1218,3\n375#1:1225,6\n417#1:1233,6\n425#1:1241,6\n350#1:1207,4\n350#1:1215,2\n350#1:1221\n350#1:1217\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2 */
    /* loaded from: classes.dex */
    public /* synthetic */ class C31562 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31562(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        @NotNull
        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$3 */
    /* loaded from: classes.dex */
    public /* synthetic */ class C31573 extends FunctionReferenceImpl implements Function1<Float, Float> {
        final /* synthetic */ Ref.FloatRef $maxPx;
        final /* synthetic */ Ref.FloatRef $minPx;
        final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31573(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = floatRef;
            this.$maxPx = floatRef2;
        }

        @NotNull
        public final Float invoke(float f) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i2, Function0<Unit> function0, List<Float> list, SliderColors sliderColors) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$value = closedFloatingPointRange2;
        this.$$dirty = i;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$steps = i2;
        this.$onValueChangeFinished = function0;
        this.$tickFractions = list;
        this.$colors = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        float m60820j;
        m60820j = SliderKt.m60820j(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
        return m60820j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        ClosedFloatingPointRange<Float> m60819k;
        m60819k = SliderKt.m60819k(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return m60819k;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v54 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
        Modifier m60821i;
        float m60822h;
        float m60822h2;
        Modifier m60818l;
        Modifier m60818l2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((((i & 14) == 0 ? (composer.changed(BoxWithConstraints) ? 4 : 2) | i : i) & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(652589923, i, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:314)");
        }
        boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(BoxWithConstraints.mo69493getConstraintsmsEJaDk());
        Ref.FloatRef floatRef = new Ref.FloatRef();
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        floatRef.element = m73626getMaxWidthimpl - density.mo69438toPx0680j_4(SliderKt.getThumbRadius());
        floatRef2.element = density.mo69438toPx0680j_4(SliderKt.getThumbRadius());
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef2, floatRef, closedFloatingPointRange.getStart().floatValue()));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef2, floatRef, closedFloatingPointRange3.getEndInclusive().floatValue()));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        SliderKt.m60829a(new C31562(this.$valueRange, floatRef2, floatRef), this.$valueRange, AbstractC18012Lr1.rangeTo(floatRef2.element, floatRef.element), mutableFloatState, this.$value.getStart().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
        SliderKt.m60829a(new C31573(this.$valueRange, floatRef2, floatRef), this.$valueRange, AbstractC18012Lr1.rangeTo(floatRef2.element, floatRef.element), mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & 112) | 3072);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue3 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        composer.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$gestureEndAction$1(mutableFloatState, mutableFloatState2, this.$tickFractions, floatRef2, floatRef, this.$onValueChangeFinished, coroutineScope, this.$onValueChangeState, this.$valueRange), composer, 0);
        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
        Float valueOf = Float.valueOf(floatRef2.element);
        Float valueOf2 = Float.valueOf(floatRef.element);
        ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$value;
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
        Object[] objArr = {mutableFloatState, mutableFloatState2, closedFloatingPointRange5, valueOf, valueOf2, closedFloatingPointRange6, state};
        ClosedFloatingPointRange<Float> closedFloatingPointRange7 = this.$valueRange;
        composer.startReplaceableGroup(-568225417);
        boolean z2 = false;
        for (int i2 = 0; i2 < 7; i2++) {
            z2 |= composer.changed(objArr[i2]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z2 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$onDrag$1$1(mutableFloatState, mutableFloatState2, closedFloatingPointRange6, floatRef2, floatRef, state, closedFloatingPointRange7);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(rememberedValue4, composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        m60821i = SliderKt.m60821i(companion2, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z, m73626getMaxWidthimpl, this.$valueRange, rememberUpdatedState, rememberUpdatedState2);
        float coerceIn = AbstractC11719c.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
        float coerceIn2 = AbstractC11719c.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        m60822h = SliderKt.m60822h(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
        m60822h2 = SliderKt.m60822h(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
        int floor = (int) Math.floor(this.$steps * m60822h2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - m60822h));
        boolean z3 = this.$enabled;
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
        Float valueOf3 = Float.valueOf(coerceIn2);
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(state2) | composer.changed(valueOf3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new SliderKt$RangeSlider$2$startThumbSemantics$1$1(state3, coerceIn2);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        m60818l = SliderKt.m60818l(companion2, coerceIn, z3, rememberedValue5, this.$onValueChangeFinished, AbstractC18012Lr1.rangeTo(this.$valueRange.getStart().floatValue(), coerceIn2), floor);
        boolean z4 = this.$enabled;
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state4 = this.$onValueChangeState;
        Float valueOf4 = Float.valueOf(coerceIn);
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state5 = this.$onValueChangeState;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(state4) | composer.changed(valueOf4);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new SliderKt$RangeSlider$2$endThumbSemantics$1$1(state5, coerceIn);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        m60818l2 = SliderKt.m60818l(companion2, coerceIn2, z4, rememberedValue6, this.$onValueChangeFinished, AbstractC18012Lr1.rangeTo(coerceIn, this.$valueRange.getEndInclusive().floatValue()), floor2);
        boolean z5 = this.$enabled;
        List<Float> list = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        float f = floatRef.element - floatRef2.element;
        MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
        MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
        int i3 = this.$$dirty;
        SliderKt.m60828b(z5, m60822h, m60822h2, list, sliderColors, f, mutableInteractionSource, mutableInteractionSource2, m60821i, m60818l, m60818l2, composer, ((i3 >> 9) & 14) | 14159872 | ((i3 >> 9) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
