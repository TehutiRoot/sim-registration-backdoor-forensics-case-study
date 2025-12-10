package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.ScrollAxisRange;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,809:1\n474#2,4:810\n478#2,2:818\n482#2:824\n25#3:814\n1114#4,3:815\n1117#4,3:821\n474#5:820\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n532#1:810,4\n532#1:818,2\n532#1:824\n532#1:814\n532#1:815,3\n532#1:821,3\n532#1:820\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangePickerKt$VerticalMonthsList$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1 */
    /* loaded from: classes2.dex */
    public static final class C32761 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C32761 INSTANCE = new C32761();

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$1 */
        /* loaded from: classes2.dex */
        public static final class C32771 extends Lambda implements Function0<Float> {
            public static final C32771 INSTANCE = new C32771();

            public C32771() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$2 */
        /* loaded from: classes2.dex */
        public static final class C32782 extends Lambda implements Function0<Float> {
            public static final C32782 INSTANCE = new C32782();

            public C32782() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        public C32761() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, new ScrollAxisRange(C32771.INSTANCE, C32782.INSTANCE, false, 4, null));
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2 */
    /* loaded from: classes2.dex */
    public static final class C32792 extends Lambda implements Function1<LazyListScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ DatePickerFormatter $dateFormatter;
        final /* synthetic */ Function1<Long, Boolean> $dateValidator;
        final /* synthetic */ CalendarMonth $firstMonth;
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ Function1<Long, Unit> $onDateSelected;
        final /* synthetic */ String $scrollToNextMonthLabel;
        final /* synthetic */ String $scrollToPreviousMonthLabel;
        final /* synthetic */ StateData $stateData;
        final /* synthetic */ CalendarDate $today;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,809:1\n74#2,6:810\n80#2:842\n84#2:847\n75#3:816\n76#3,11:818\n89#3:846\n76#4:817\n460#5,13:829\n473#5,3:843\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1$2$1\n*L\n549#1:810,6\n549#1:842\n549#1:847\n549#1:816\n549#1:818,11\n549#1:846\n549#1:817\n549#1:829,13\n549#1:843,3\n*E\n"})
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1 */
        /* loaded from: classes2.dex */
        public static final class C32801 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ DatePickerColors $colors;
            final /* synthetic */ CoroutineScope $coroutineScope;
            final /* synthetic */ DatePickerFormatter $dateFormatter;
            final /* synthetic */ Function1<Long, Boolean> $dateValidator;
            final /* synthetic */ CalendarMonth $firstMonth;
            final /* synthetic */ LazyListState $lazyListState;
            final /* synthetic */ Function1<Long, Unit> $onDateSelected;
            final /* synthetic */ String $scrollToNextMonthLabel;
            final /* synthetic */ String $scrollToPreviousMonthLabel;
            final /* synthetic */ StateData $stateData;
            final /* synthetic */ CalendarDate $today;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C32801(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12, int i, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
                super(4);
                this.$stateData = stateData;
                this.$firstMonth = calendarMonth;
                this.$dateFormatter = datePickerFormatter;
                this.$colors = datePickerColors;
                this.$onDateSelected = function1;
                this.$today = calendarDate;
                this.$dateValidator = function12;
                this.$$dirty = i;
                this.$lazyListState = lazyListState;
                this.$coroutineScope = coroutineScope;
                this.$scrollToPreviousMonthLabel = str;
                this.$scrollToNextMonthLabel = str2;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(items) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1246706073, i2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
                }
                CalendarMonth plusMonths = this.$stateData.getCalendarModel().plusMonths(this.$firstMonth, i);
                Modifier.Companion companion = Modifier.Companion;
                Modifier m23621d = AbstractC21629pi0.m23621d(items, companion, 0.0f, 1, null);
                DatePickerFormatter datePickerFormatter = this.$dateFormatter;
                StateData stateData = this.$stateData;
                DatePickerColors datePickerColors = this.$colors;
                Function1<Long, Unit> function1 = this.$onDateSelected;
                CalendarDate calendarDate = this.$today;
                Function1<Long, Boolean> function12 = this.$dateValidator;
                int i4 = this.$$dirty;
                LazyListState lazyListState = this.$lazyListState;
                CoroutineScope coroutineScope = this.$coroutineScope;
                String str = this.$scrollToPreviousMonthLabel;
                String str2 = this.$scrollToNextMonthLabel;
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m23621d);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
                Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl, density, companion2.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String formatMonthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(plusMonths, stateData.getCalendarModel(), CalendarModel_androidKt.defaultLocale(composer, 0));
                if (formatMonthYear$material3_release == null) {
                    formatMonthYear$material3_release = HelpFormatter.DEFAULT_OPT_PREFIX;
                }
                TextKt.m70698Text4IGK_g(formatMonthYear$material3_release, SemanticsModifierKt.semantics$default(ClickableKt.m69345clickableXHw0xAI$default(PaddingKt.padding(companion, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, DateRangePickerKt$VerticalMonthsList$1$2$1$1$1.INSTANCE, 7, null), false, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(lazyListState, coroutineScope, str, str2), 1, null), datePickerColors.m70339getSubheadContentColor0d7_KjU$material3_release(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131064);
                int i5 = i4 << 3;
                int i6 = i4 << 6;
                DatePickerKt.Month(plusMonths, function1, calendarDate, stateData, true, function12, datePickerFormatter, datePickerColors, composer, ((i4 << 9) & 3670016) | (i5 & 458752) | (i5 & 112) | 24576 | (i6 & 7168) | (29360128 & i6));
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32792(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12, int i, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
            super(1);
            this.$stateData = stateData;
            this.$firstMonth = calendarMonth;
            this.$dateFormatter = datePickerFormatter;
            this.$colors = datePickerColors;
            this.$onDateSelected = function1;
            this.$today = calendarDate;
            this.$dateValidator = function12;
            this.$$dirty = i;
            this.$lazyListState = lazyListState;
            this.$coroutineScope = coroutineScope;
            this.$scrollToPreviousMonthLabel = str;
            this.$scrollToNextMonthLabel = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
            invoke2(lazyListScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.CC.m61271k(LazyColumn, this.$stateData.getTotalMonthsInRange(), null, null, ComposableLambdaKt.composableLambdaInstance(1246706073, true, new C32801(this.$stateData, this.$firstMonth, this.$dateFormatter, this.$colors, this.$onDateSelected, this.$today, this.$dateValidator, this.$$dirty, this.$lazyListState, this.$coroutineScope, this.$scrollToPreviousMonthLabel, this.$scrollToNextMonthLabel)), 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$VerticalMonthsList$1(LazyListState lazyListState, int i, StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$lazyListState = lazyListState;
        this.$$dirty = i;
        this.$stateData = stateData;
        this.$firstMonth = calendarMonth;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$onDateSelected = function1;
        this.$today = calendarDate;
        this.$dateValidator = function12;
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
            ComposerKt.traceEventStart(56792252, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
        }
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
        Strings.Companion companion = Strings.Companion;
        String m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(companion.m70591getDateRangePickerScrollToShowPreviousMonthadMyvUU(), composer, 6);
        String m70619getStringNWtq282 = Strings_androidKt.m70619getStringNWtq28(companion.m70590getDateRangePickerScrollToShowNextMonthadMyvUU(), composer, 6);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, C32761.INSTANCE, 1, null);
        LazyListState lazyListState = this.$lazyListState;
        LazyDslKt.LazyColumn(semantics$default, lazyListState, null, false, null, null, null, false, new C32792(this.$stateData, this.$firstMonth, this.$dateFormatter, this.$colors, this.$onDateSelected, this.$today, this.$dateValidator, this.$$dirty, lazyListState, coroutineScope, m70619getStringNWtq28, m70619getStringNWtq282), composer, (this.$$dirty >> 3) & 112, 252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
