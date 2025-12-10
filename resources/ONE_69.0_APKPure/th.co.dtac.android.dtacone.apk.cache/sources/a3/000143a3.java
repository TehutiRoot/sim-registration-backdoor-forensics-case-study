package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C3623Dp;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneRadioBoxKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContactTimeRange;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInstallContactScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallContactScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallContactScreenKt$ContactTimeSection$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,371:1\n154#2:372\n73#3,5:373\n78#3:406\n82#3:413\n78#4,11:378\n91#4:412\n456#5,8:389\n464#5,3:403\n467#5,3:409\n4144#6,6:397\n13309#7,2:407\n*S KotlinDebug\n*F\n+ 1 InstallContactScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallContactScreenKt$ContactTimeSection$1$2\n*L\n318#1:372\n317#1:373,5\n317#1:406\n317#1:413\n317#1:378,11\n317#1:412\n317#1:389,8\n317#1:403,3\n317#1:409,3\n317#1:397,6\n321#1:407,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallContactScreenKt$ContactTimeSection$1$2 */
/* loaded from: classes10.dex */
public final class InstallContactScreenKt$ContactTimeSection$1$2 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ InstallContact $installContact;
    final /* synthetic */ Function1<InstallContact, Unit> $onInstallInfoChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallContactScreenKt$ContactTimeSection$1$2(InstallContact installContact, Function1<? super InstallContact, Unit> function1) {
        super(3);
        this.$installContact = installContact;
        this.$onInstallInfoChange = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        TextStyle textStyle;
        TextStyle m73418copyv2rsoow;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1957857229, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.ContactTimeSection.<anonymous>.<anonymous> (InstallContactScreen.kt:315)");
        }
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(16));
        float f = 0.0f;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        InstallContact installContact = this.$installContact;
        Function1<InstallContact, Unit> function1 = this.$onInstallInfoChange;
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, Alignment.Companion.getStart(), composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        int i2 = 0;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer2.startReplaceableGroup(2123483850);
        InstallContactTimeRange[] values = InstallContactTimeRange.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            InstallContactTimeRange installContactTimeRange = values[i3];
            String label = installContactTimeRange.getLabel();
            boolean z = installContact.getTimeRange() == installContactTimeRange;
            long colorResource = ColorResources_androidKt.colorResource(R.color.red5, composer2, i2);
            long colorResource2 = ColorResources_androidKt.colorResource(R.color.red5, composer2, i2);
            long colorResource3 = ColorResources_androidKt.colorResource(R.color.warmGray, composer2, i2);
            textStyle = InstallContactScreenKt.f98092a;
            m73418copyv2rsoow = textStyle.m73418copyv2rsoow((r48 & 1) != 0 ? textStyle.f31200a.m73360getColor0d7_KjU() : ColorResources_androidKt.colorResource(R.color.greyishBrown, composer2, i2), (r48 & 2) != 0 ? textStyle.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? textStyle.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? textStyle.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? textStyle.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? textStyle.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? textStyle.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? textStyle.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? textStyle.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.f31200a.getShadow() : null, (r48 & 16384) != 0 ? textStyle.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? textStyle.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? textStyle.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? textStyle.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.f31202c : null, (r48 & 1048576) != 0 ? textStyle.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? textStyle.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? textStyle.f31201b.getTextMotion() : null);
            Function1<InstallContact, Unit> function12 = function1;
            composer2 = composer;
            OneRadioBoxKt.m75131OneRadioButton7dS3OtE(label, z, new InstallContactScreenKt$ContactTimeSection$1$2$1$1$1(function12, installContact, installContactTimeRange), SizeKt.fillMaxWidth$default(Modifier.Companion, f, 1, null), 0.0f, 0.0f, colorResource, colorResource2, colorResource3, m73418copyv2rsoow, 0.0f, composer2, 3072, 0, 1072);
            i3++;
            function1 = function12;
            length = length;
            installContact = installContact;
            values = values;
            i2 = 0;
            f = 0.0f;
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