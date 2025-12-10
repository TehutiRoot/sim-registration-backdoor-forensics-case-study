package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,445:1\n79#2,2:446\n81#2:474\n85#2:479\n75#3:448\n76#3,11:450\n89#3:478\n76#4:449\n460#5,13:461\n473#5,3:475\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n*L\n172#1:446,2\n172#1:474\n172#1:479\n172#1:448\n172#1:450,11\n172#1:478\n172#1:449\n172#1:461,13\n172#1:475,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TabKt$LeadingIconTab$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z2;
        this.$onClick = function0;
        this.$icon = function2;
        this.$$dirty = i;
        this.$text = function22;
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
        float f2;
        float f3;
        TextStyle m73414copyCXVQc50;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-429037564, i, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
        }
        Modifier modifier = this.$modifier;
        f = TabKt.f26378a;
        Modifier m69872selectableO2vRcR0 = SelectableKt.m69872selectableO2vRcR0(SizeKt.m69734height3ABfNKs(modifier, f), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m73247boximpl(Role.Companion.m73259getTabo7Vup1c()), this.$onClick);
        f2 = TabKt.f26380c;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m69715paddingVpY3zN4$default(m69872selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Function2<Composer, Integer, Unit> function2 = this.$icon;
        int i2 = this.$$dirty;
        Function2<Composer, Integer, Unit> function22 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
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
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
        Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        Modifier.Companion companion2 = Modifier.Companion;
        f3 = TabKt.f26384g;
        SpacerKt.Spacer(SizeKt.m69745requiredWidth3ABfNKs(companion2, f3), composer, 6);
        m73414copyCXVQc50 = r8.m73414copyCXVQc50((r46 & 1) != 0 ? r8.f31200a.m73360getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r8.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r8.f31200a.getFontWeight() : null, (r46 & 8) != 0 ? r8.f31200a.m73362getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r8.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r8.f31200a.getFontFamily() : null, (r46 & 64) != 0 ? r8.f31200a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r8.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r8.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r8.f31200a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r8.f31200a.getLocaleList() : null, (r46 & 2048) != 0 ? r8.f31200a.m73358getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r8.f31200a.getTextDecoration() : null, (r46 & 8192) != 0 ? r8.f31200a.getShadow() : null, (r46 & 16384) != 0 ? r8.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r46 & 32768) != 0 ? r8.f31201b.m73318getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r8.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r8.f31201b.getTextIndent() : null, (r46 & 262144) != 0 ? r8.f31202c : null, (r46 & 524288) != 0 ? r8.f31201b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r8.f31201b.m73313getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).f31201b.m73311getHyphensEaSxIns() : null);
        TextKt.ProvideTextStyle(m73414copyCXVQc50, function22, composer, (i2 >> 3) & 112);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}