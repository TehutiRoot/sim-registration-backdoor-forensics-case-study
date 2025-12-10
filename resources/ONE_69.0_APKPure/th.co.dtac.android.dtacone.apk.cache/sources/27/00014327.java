package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInputInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$AddressSelectSheet$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1296:1\n154#2:1297\n154#2:1298\n154#2:1334\n154#2:1335\n66#3,6:1299\n72#3:1333\n76#3:1340\n78#4,11:1305\n91#4:1339\n456#5,8:1316\n464#5,3:1330\n467#5,3:1336\n4144#6,6:1324\n*S KotlinDebug\n*F\n+ 1 InputInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/inputInfo/InputInfoScreenKt$AddressSelectSheet$1\n*L\n677#1:1297\n678#1:1298\n688#1:1334\n743#1:1335\n674#1:1299,6\n674#1:1333\n674#1:1340\n674#1:1305,11\n674#1:1339\n674#1:1316,8\n674#1:1330,3\n674#1:1336,3\n674#1:1324,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$AddressSelectSheet$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ boolean $canBack;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ AddressSelectType $selectType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputInfoScreenKt$AddressSelectSheet$1(AddressSelectType addressSelectType, boolean z, Function0<Unit> function0, int i, int i2, Function0<Unit> function02) {
        super(2);
        this.$selectType = addressSelectType;
        this.$canBack = z;
        this.$onBack = function0;
        this.$$dirty1 = i;
        this.$$dirty = i2;
        this.$onDismiss = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        int i2;
        Function0<Unit> function0;
        int i3;
        AddressSelectType addressSelectType;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1602478127, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.AddressSelectSheet.<anonymous> (InputInfoScreen.kt:672)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(SizeKt.m69734height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(59)), C3623Dp.m73842constructorimpl(16), 0.0f, 2, null);
        AddressSelectType addressSelectType2 = this.$selectType;
        boolean z = this.$canBack;
        Function0<Unit> function02 = this.$onBack;
        int i4 = this.$$dirty1;
        int i5 = this.$$dirty;
        Function0<Unit> function03 = this.$onDismiss;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69715paddingVpY3zN4$default);
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
        Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1260125900);
        if (addressSelectType2 == AddressSelectType.PROVINCE || !z) {
            i2 = i5;
            function0 = function03;
            i3 = i4;
            addressSelectType = addressSelectType2;
        } else {
            i2 = i5;
            function0 = function03;
            i3 = i4;
            addressSelectType = addressSelectType2;
            IconButtonKt.IconButton(function02, SizeKt.m69748size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenterStart()), C3623Dp.m73842constructorimpl(24)), false, IconButtonDefaults.INSTANCE.m70605iconButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), 0L, 0L, composer, IconButtonDefaults.$stable << 12, 13), null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75204getLambda1$app_prodRelease(), composer, ((i3 >> 15) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 20);
        }
        composer.endReplaceableGroup();
        AnimatedContentKt.AnimatedContent(addressSelectType, boxScopeInstance.align(companion, companion2.getCenter()), InputInfoScreenKt$AddressSelectSheet$1$1$1.INSTANCE, null, null, null, ComposableLambdaKt.composableLambda(composer, 1135853404, true, new InputInfoScreenKt$AddressSelectSheet$1$1$2(boxScopeInstance)), composer, (i2 & 14) | 1573248, 56);
        Function0<Unit> function04 = function0;
        IconButtonKt.IconButton(function04, SizeKt.m69748size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenterEnd()), C3623Dp.m73842constructorimpl(24)), false, IconButtonDefaults.INSTANCE.m70605iconButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0), 0L, 0L, composer, IconButtonDefaults.$stable << 12, 13), null, ComposableSingletons$InputInfoScreenKt.INSTANCE.m75212getLambda2$app_prodRelease(), composer, ((i3 >> 18) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 20);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}