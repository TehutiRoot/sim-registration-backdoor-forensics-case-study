package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$FilterChip$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ State<Color> $contentColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1 */
    /* loaded from: classes.dex */
    public static final class C30781 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty1;
        final /* synthetic */ SelectableChipColors $colors;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ State<Color> $contentColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

        @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,753:1\n154#2:754\n154#2:755\n77#3,2:756\n79#3:786\n83#3:871\n78#4,11:758\n78#4,11:794\n78#4,11:828\n91#4:860\n91#4:865\n91#4:870\n456#5,8:769\n464#5,3:783\n456#5,8:805\n464#5,3:819\n456#5,8:839\n464#5,3:853\n467#5,3:857\n467#5,3:862\n467#5,3:867\n4144#6,6:777\n4144#6,6:813\n4144#6,6:847\n65#7,7:787\n72#7:822\n67#7,5:823\n72#7:856\n76#7:861\n76#7:866\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt$FilterChip$3$1$1\n*L\n223#1:754\n231#1:755\n215#1:756,2\n215#1:786\n215#1:871\n215#1:758,11\n239#1:794,11\n264#1:828,11\n264#1:860\n239#1:865\n215#1:870\n215#1:769,8\n215#1:783,3\n239#1:805,8\n239#1:819,3\n264#1:839,8\n264#1:853,3\n264#1:857,3\n239#1:862,3\n215#1:867,3\n215#1:777,6\n239#1:813,6\n264#1:847,6\n239#1:787,7\n239#1:822\n264#1:823,5\n264#1:856\n264#1:861\n239#1:866\n*E\n"})
        /* renamed from: androidx.compose.material.ChipKt$FilterChip$3$1$1 */
        /* loaded from: classes.dex */
        public static final class C30791 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ int $$dirty1;
            final /* synthetic */ SelectableChipColors $colors;
            final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
            final /* synthetic */ State<Color> $contentColor;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            final /* synthetic */ boolean $selected;
            final /* synthetic */ Function2<Composer, Integer, Unit> $selectedIcon;
            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C30791(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2, State<Color> state) {
                super(2);
                this.$leadingIcon = function2;
                this.$selected = z;
                this.$selectedIcon = function22;
                this.$trailingIcon = function23;
                this.$content = function3;
                this.$$dirty1 = i;
                this.$colors = selectableChipColors;
                this.$enabled = z2;
                this.$$dirty = i2;
                this.$contentColor = state;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                float m73842constructorimpl;
                float m73842constructorimpl2;
                float f;
                RowScopeInstance rowScopeInstance;
                int i2;
                float f2;
                int i3;
                Modifier modifier;
                float f3;
                float f4;
                float f5;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1543702066, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:213)");
                }
                Modifier.Companion companion = Modifier.Companion;
                Modifier m69733defaultMinSizeVpY3zN4$default = SizeKt.m69733defaultMinSizeVpY3zN4$default(companion, 0.0f, ChipDefaults.INSTANCE.m70140getMinHeightD9Ej5fM(), 1, null);
                if (this.$leadingIcon == null && (!this.$selected || this.$selectedIcon == null)) {
                    m73842constructorimpl = ChipKt.f14500a;
                } else {
                    m73842constructorimpl = C3623Dp.m73842constructorimpl(0);
                }
                float f6 = m73842constructorimpl;
                if (this.$trailingIcon == null) {
                    m73842constructorimpl2 = ChipKt.f14500a;
                } else {
                    m73842constructorimpl2 = C3623Dp.m73842constructorimpl(0);
                }
                Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(m69733defaultMinSizeVpY3zN4$default, f6, 0.0f, m73842constructorimpl2, 0.0f, 10, null);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion2 = Alignment.Companion;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Function2<Composer, Integer, Unit> function2 = this.$leadingIcon;
                boolean z = this.$selected;
                Function2<Composer, Integer, Unit> function22 = this.$selectedIcon;
                Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                int i4 = this.$$dirty1;
                Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
                SelectableChipColors selectableChipColors = this.$colors;
                boolean z2 = this.$enabled;
                int i5 = this.$$dirty;
                State<Color> state = this.$contentColor;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69717paddingqDBjuR0$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
                Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-1943412047);
                if (function2 != null || (z && function22 != null)) {
                    f = ChipKt.f14501b;
                    SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, f), composer, 6);
                    composer.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    rowScopeInstance = rowScopeInstance2;
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                    i2 = i4;
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer);
                    Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(649985685);
                    if (function2 != null) {
                        State<Color> leadingIconColor = selectableChipColors.leadingIconColor(z2, z, composer, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896));
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m71921getAlphaimpl(leadingIconColor.getValue().m71929unboximpl())))}, function2, composer, ((i5 >> 21) & 112) | 8);
                    }
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1943411233);
                    if (z && function22 != null) {
                        long m71929unboximpl = state.getValue().m71929unboximpl();
                        composer.startReplaceableGroup(649986516);
                        if (function2 != null) {
                            f3 = ChipKt.f14504e;
                            modifier = ClipKt.clip(BackgroundKt.m69504backgroundbw27NRU(SizeKt.m69740requiredSize3ABfNKs(companion, f3), state.getValue().m71929unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                            m71929unboximpl = selectableChipColors.backgroundColor(z2, z, composer, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 15) & 896)).getValue().m71929unboximpl();
                        } else {
                            modifier = companion;
                        }
                        composer.endReplaceableGroup();
                        Alignment center = companion2.getCenter();
                        composer.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                        composer.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer m71577constructorimpl3 = Updater.m71577constructorimpl(composer);
                        Updater.m71584setimpl(m71577constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
                        composer.startReplaceableGroup(2058660585);
                        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(m71929unboximpl))}, function22, composer, ((i5 >> 24) & 112) | 8);
                        composer.endReplaceableGroup();
                        composer.endNode();
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
                    }
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    f2 = ChipKt.f14502c;
                    i3 = 6;
                    SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, f2), composer, 6);
                } else {
                    rowScopeInstance = rowScopeInstance2;
                    i2 = i4;
                    i3 = 6;
                }
                composer.endReplaceableGroup();
                function3.invoke(rowScopeInstance, composer, Integer.valueOf((i2 & 112) | i3));
                composer.startReplaceableGroup(-1181292829);
                if (function23 != null) {
                    f4 = ChipKt.f14503d;
                    SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, f4), composer, i3);
                    function23.invoke(composer, Integer.valueOf(i2 & 14));
                    f5 = ChipKt.f14503d;
                    SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, f5), composer, i3);
                }
                composer.endReplaceableGroup();
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
        public C30781(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2, State<Color> state) {
            super(2);
            this.$leadingIcon = function2;
            this.$selected = z;
            this.$selectedIcon = function22;
            this.$trailingIcon = function23;
            this.$content = function3;
            this.$$dirty1 = i;
            this.$colors = selectableChipColors;
            this.$enabled = z2;
            this.$$dirty = i2;
            this.$contentColor = state;
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
                ComposerKt.traceEventStart(1582291359, i, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:210)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2(), ComposableLambdaKt.composableLambda(composer, -1543702066, true, new C30791(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$FilterChip$3(State<Color> state, Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i, SelectableChipColors selectableChipColors, boolean z2, int i2) {
        super(2);
        this.$contentColor = state;
        this.$leadingIcon = function2;
        this.$selected = z;
        this.$selectedIcon = function22;
        this.$trailingIcon = function23;
        this.$content = function3;
        this.$$dirty1 = i;
        this.$colors = selectableChipColors;
        this.$enabled = z2;
        this.$$dirty = i2;
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
            ComposerKt.traceEventStart(722126431, i, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
        }
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m71921getAlphaimpl(this.$contentColor.getValue().m71929unboximpl())))}, ComposableLambdaKt.composableLambda(composer, 1582291359, true, new C30781(this.$leadingIcon, this.$selected, this.$selectedIcon, this.$trailingIcon, this.$content, this.$$dirty1, this.$colors, this.$enabled, this.$$dirty, this.$contentColor)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}