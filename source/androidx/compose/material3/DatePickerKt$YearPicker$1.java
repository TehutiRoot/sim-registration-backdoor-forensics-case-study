package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1920:1\n76#2:1921\n474#3,4:1922\n478#3,2:1930\n482#3:1936\n25#4:1926\n1114#5,3:1927\n1117#5,3:1933\n474#6:1932\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1\n*L\n1650#1:1921\n1654#1:1922,4\n1654#1:1930,2\n1654#1:1936\n1654#1:1926\n1654#1:1927,3\n1654#1:1933,3\n1654#1:1932\n*E\n"})
/* loaded from: classes2.dex */
public final class DatePickerKt$YearPicker$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
    final /* synthetic */ StateData $stateData;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1 */
    /* loaded from: classes2.dex */
    public static final class C32641 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final C32641 INSTANCE = new C32641();

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1 */
        /* loaded from: classes2.dex */
        public static final class C32651 extends Lambda implements Function0<Float> {
            public static final C32651 INSTANCE = new C32651();

            public C32651() {
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
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$2 */
        /* loaded from: classes2.dex */
        public static final class C32662 extends Lambda implements Function0<Float> {
            public static final C32662 INSTANCE = new C32662();

            public C32662() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        public C32641() {
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
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, new ScrollAxisRange(C32651.INSTANCE, C32662.INSTANCE, false, 4, null));
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2 */
    /* loaded from: classes2.dex */
    public static final class C32672 extends Lambda implements Function1<LazyGridScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ int $currentYear;
        final /* synthetic */ int $displayedYear;
        final /* synthetic */ LazyGridState $lazyGridState;
        final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
        final /* synthetic */ String $scrollToEarlierYearsLabel;
        final /* synthetic */ String $scrollToLaterYearsLabel;
        final /* synthetic */ StateData $stateData;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n50#2:1921\n49#2:1922\n1114#3,6:1923\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$YearPicker$1$2$1\n*L\n1698#1:1921\n1698#1:1922\n1698#1:1923,6\n*E\n"})
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1 */
        /* loaded from: classes2.dex */
        public static final class C32681 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ DatePickerColors $colors;
            final /* synthetic */ CoroutineScope $coroutineScope;
            final /* synthetic */ int $currentYear;
            final /* synthetic */ int $displayedYear;
            final /* synthetic */ LazyGridState $lazyGridState;
            final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
            final /* synthetic */ String $scrollToEarlierYearsLabel;
            final /* synthetic */ String $scrollToLaterYearsLabel;
            final /* synthetic */ StateData $stateData;

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1 */
            /* loaded from: classes2.dex */
            public static final class C32691 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                final /* synthetic */ CoroutineScope $coroutineScope;
                final /* synthetic */ int $it;
                final /* synthetic */ LazyGridState $lazyGridState;
                final /* synthetic */ String $scrollToEarlierYearsLabel;
                final /* synthetic */ String $scrollToLaterYearsLabel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C32691(LazyGridState lazyGridState, int i, CoroutineScope coroutineScope, String str, String str2) {
                    super(1);
                    this.$lazyGridState = lazyGridState;
                    this.$it = i;
                    this.$coroutineScope = coroutineScope;
                    this.$scrollToEarlierYearsLabel = str;
                    this.$scrollToLaterYearsLabel = str2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                    List m60664k;
                    LazyGridItemInfo lazyGridItemInfo;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    if (this.$lazyGridState.getFirstVisibleItemIndex() == this.$it || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.$lazyGridState.getLayoutInfo().getVisibleItemsInfo())) != null && lazyGridItemInfo.getIndex() == this.$it)) {
                        m60664k = DatePickerKt.m60664k(this.$lazyGridState, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel);
                    } else {
                        m60664k = CollectionsKt__CollectionsKt.emptyList();
                    }
                    SemanticsPropertiesKt.setCustomActions(semantics, m60664k);
                }
            }

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3 */
            /* loaded from: classes2.dex */
            public static final class C32703 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ String $localizedYear;

                @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
                /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3$1 */
                /* loaded from: classes2.dex */
                public static final class C32711 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final C32711 INSTANCE = new C32711();

                    public C32711() {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull SemanticsPropertyReceiver clearAndSetSemantics) {
                        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C32703(String str) {
                    super(2);
                    this.$localizedYear = str;
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
                        ComposerKt.traceEventStart(2095319565, i, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1701)");
                    }
                    TextKt.m70698Text4IGK_g(this.$localizedYear, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, C32711.INSTANCE), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73541boximpl(TextAlign.Companion.m73548getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 130556);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C32681(StateData stateData, int i, int i2, Function1<? super Integer, Unit> function1, int i3, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
                super(4);
                this.$stateData = stateData;
                this.$displayedYear = i;
                this.$currentYear = i2;
                this.$onYearSelected = function1;
                this.$$dirty = i3;
                this.$colors = datePickerColors;
                this.$lazyGridState = lazyGridState;
                this.$coroutineScope = coroutineScope;
                this.$scrollToEarlierYearsLabel = str;
                this.$scrollToLaterYearsLabel = str2;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 112) == 0) {
                    i3 = (composer.changed(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i3 & 721) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1369226173, i2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)");
                }
                int first = i + this.$stateData.getYearRange().getFirst();
                String localString = DatePickerKt.toLocalString(first);
                Modifier.Companion companion = Modifier.Companion;
                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m69558requiredSizeVpY3zN4(companion, datePickerModalTokens.m70935getSelectionYearContainerWidthD9Ej5fM(), datePickerModalTokens.m70934getSelectionYearContainerHeightD9Ej5fM()), false, new C32691(this.$lazyGridState, i, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel), 1, null);
                boolean z = first == this.$displayedYear;
                boolean z2 = first == this.$currentYear;
                Function1<Integer, Unit> function1 = this.$onYearSelected;
                Integer valueOf = Integer.valueOf(first);
                Function1<Integer, Unit> function12 = this.$onYearSelected;
                composer.startReplaceableGroup(511388516);
                boolean changed = composer.changed(function1) | composer.changed(valueOf);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$YearPicker$1$2$1$2$1(function12, first);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                String format = String.format(Strings_androidKt.m70619getStringNWtq28(Strings.Companion.m70573getDatePickerNavigateToYearDescriptionadMyvUU(), composer, 6), Arrays.copyOf(new Object[]{localString}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                DatePickerKt.m60667h(semantics$default, z, z2, (Function0) rememberedValue, format, this.$colors, ComposableLambdaKt.composableLambda(composer, 2095319565, true, new C32703(localString)), composer, ((this.$$dirty << 9) & 458752) | 1572864);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32672(StateData stateData, int i, int i2, Function1<? super Integer, Unit> function1, int i3, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
            super(1);
            this.$stateData = stateData;
            this.$displayedYear = i;
            this.$currentYear = i2;
            this.$onYearSelected = function1;
            this.$$dirty = i3;
            this.$colors = datePickerColors;
            this.$lazyGridState = lazyGridState;
            this.$coroutineScope = coroutineScope;
            this.$scrollToEarlierYearsLabel = str;
            this.$scrollToLaterYearsLabel = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
            invoke2(lazyGridScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull LazyGridScope LazyVerticalGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            LazyGridScope.CC.m61235b(LazyVerticalGrid, CollectionsKt___CollectionsKt.count(this.$stateData.getYearRange()), null, null, null, ComposableLambdaKt.composableLambdaInstance(1369226173, true, new C32681(this.$stateData, this.$displayedYear, this.$currentYear, this.$onYearSelected, this.$$dirty, this.$colors, this.$lazyGridState, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel)), 14, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPicker$1(StateData stateData, DatePickerColors datePickerColors, Modifier modifier, Function1<? super Integer, Unit> function1, int i) {
        super(2);
        this.$stateData = stateData;
        this.$colors = datePickerColors;
        this.$modifier = modifier;
        this.$onYearSelected = function1;
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
        long m70336getContainerColor0d7_KjU$material3_release;
        float f;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-145469688, i, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
        }
        int year = this.$stateData.getCurrentMonth().getYear();
        int year2 = this.$stateData.getDisplayedMonth().getYear();
        LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - this.$stateData.getYearRange().getFirst()) - 3), 0, composer, 0, 2);
        composer.startReplaceableGroup(-969349200);
        long m70336getContainerColor0d7_KjU$material3_release2 = this.$colors.m70336getContainerColor0d7_KjU$material3_release();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m71736equalsimpl0(m70336getContainerColor0d7_KjU$material3_release2, materialTheme.getColorScheme(composer, 6).m70260getSurface0d7_KjU())) {
            m70336getContainerColor0d7_KjU$material3_release = ColorSchemeKt.m70301surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), ((C3641Dp) composer.consume(SurfaceKt.getLocalAbsoluteTonalElevation())).m73672unboximpl());
        } else {
            m70336getContainerColor0d7_KjU$material3_release = this.$colors.m70336getContainerColor0d7_KjU$material3_release();
        }
        long j = m70336getContainerColor0d7_KjU$material3_release;
        composer.endReplaceableGroup();
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
        String m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(companion.m70575getDatePickerScrollToShowEarlierYearsadMyvUU(), composer, 6);
        String m70619getStringNWtq282 = Strings_androidKt.m70619getStringNWtq28(companion.m70576getDatePickerScrollToShowLaterYearsadMyvUU(), composer, 6);
        GridCells.Fixed fixed = new GridCells.Fixed(3);
        Modifier semantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m69319backgroundbw27NRU$default(this.$modifier, j, null, 2, null), false, C32641.INSTANCE, 1, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
        f = DatePickerKt.f25726g;
        LazyGridDslKt.LazyVerticalGrid(fixed, semantics$default, rememberLazyGridState, null, false, arrangement.m69478spacedBy0680j_4(f), spaceEvenly, null, false, new C32672(this.$stateData, year2, year, this.$onYearSelected, this.$$dirty, this.$colors, rememberLazyGridState, coroutineScope, m70619getStringNWtq28, m70619getStringNWtq282), composer, 1769472, HttpStatus.SC_REQUEST_TIMEOUT);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
