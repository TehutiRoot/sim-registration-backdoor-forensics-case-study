package androidx.compose.material;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
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
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,434:1\n77#2,2:435\n79#2:465\n83#2:470\n78#3,11:437\n91#3:469\n456#4,8:448\n464#4,3:462\n467#4,3:466\n4144#5,6:456\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n*L\n169#1:435,2\n169#1:465\n169#1:470\n169#1:437,11\n169#1:469\n169#1:448,8\n169#1:462,3\n169#1:466,3\n169#1:456,6\n*E\n"})
/* loaded from: classes.dex */
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
        TextStyle m73418copyv2rsoow;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866677691, i, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
        }
        Modifier modifier = this.$modifier;
        f = TabKt.f14763a;
        Modifier m69872selectableO2vRcR0 = SelectableKt.m69872selectableO2vRcR0(SizeKt.m69734height3ABfNKs(modifier, f), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m73247boximpl(Role.Companion.m73259getTabo7Vup1c()), this.$onClick);
        f2 = TabKt.f14765c;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m69715paddingVpY3zN4$default(m69872selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        Function2<Composer, Integer, Unit> function2 = this.$icon;
        int i2 = this.$$dirty;
        Function2<Composer, Integer, Unit> function22 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        Modifier.Companion companion2 = Modifier.Companion;
        f3 = TabKt.f14769g;
        SpacerKt.Spacer(SizeKt.m69745requiredWidth3ABfNKs(companion2, f3), composer, 6);
        m73418copyv2rsoow = r8.m73418copyv2rsoow((r48 & 1) != 0 ? r8.f31200a.m73360getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r8.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r8.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? r8.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r8.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r8.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r8.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r8.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r8.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r8.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r8.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r8.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r8.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r8.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r8.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r8.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r48 & 65536) != 0 ? r8.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r8.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r8.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r8.f31202c : null, (r48 & 1048576) != 0 ? r8.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r8.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r8.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getButton().f31201b.getTextMotion() : null);
        TextKt.ProvideTextStyle(m73418copyv2rsoow, function22, composer, (i2 >> 3) & 112);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}