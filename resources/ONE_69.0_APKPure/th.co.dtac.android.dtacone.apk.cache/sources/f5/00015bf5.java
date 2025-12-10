package th.p047co.dtac.android.dtacone.widget.compose.common;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogImagePreview$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1309:1\n66#2,6:1310\n72#2:1344\n76#2:1359\n78#3,11:1316\n91#3:1358\n456#4,8:1327\n464#4,3:1341\n67#4,3:1345\n66#4:1348\n467#4,3:1355\n4144#5,6:1335\n1097#6,6:1349\n*S KotlinDebug\n*F\n+ 1 OneDialog.kt\nth/co/dtac/android/dtacone/widget/compose/common/OneDialogKt$OneDialogImagePreview$1\n*L\n402#1:1310,6\n402#1:1344\n402#1:1359\n402#1:1316,11\n402#1:1358\n402#1:1327,8\n402#1:1341,3\n414#1:1345,3\n414#1:1348\n402#1:1355,3\n402#1:1335,6\n414#1:1349,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogImagePreview$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogImagePreview$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ long $bitmapSize;
    final /* synthetic */ MutableState<IntSize> $imageSize$delegate;
    final /* synthetic */ MutableFloatState $maxScale$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableFloatState $scale$delegate;
    final /* synthetic */ TransformableState $state;
    final /* synthetic */ MutableState<Offset> $translation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogImagePreview$1(TransformableState transformableState, Bitmap bitmap, MutableState<IntSize> mutableState, MutableFloatState mutableFloatState, long j, Function0<Unit> function0, int i, MutableFloatState mutableFloatState2, MutableState<Offset> mutableState2) {
        super(2);
        this.$state = transformableState;
        this.$bitmap = bitmap;
        this.$imageSize$delegate = mutableState;
        this.$maxScale$delegate = mutableFloatState;
        this.$bitmapSize = j;
        this.$onDismiss = function0;
        this.$$dirty = i;
        this.$scale$delegate = mutableFloatState2;
        this.$translation$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        float m1819I;
        float m1819I2;
        long m1824D;
        long m1824D2;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(76034380, i, -1, "th.co.dtac.android.dtacone.widget.compose.common.OneDialogImagePreview.<anonymous> (OneDialog.kt:400)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier transformable$default = TransformableKt.transformable$default(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m71945getBlack0d7_KjU(), null, 2, null), this.$state, false, false, 6, null);
        Bitmap bitmap = this.$bitmap;
        MutableState<IntSize> mutableState = this.$imageSize$delegate;
        MutableFloatState mutableFloatState = this.$maxScale$delegate;
        long j = this.$bitmapSize;
        Function0<Unit> function0 = this.$onDismiss;
        int i2 = this.$$dirty;
        MutableFloatState mutableFloatState2 = this.$scale$delegate;
        MutableState<Offset> mutableState2 = this.$translation$delegate;
        composer.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(transformable$default);
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
        ImageBitmap asImageBitmap = AndroidImageBitmap_androidKt.asImageBitmap(bitmap);
        ContentScale fit = ContentScale.Companion.getFit();
        Modifier align = boxScopeInstance.align(companion, companion2.getCenter());
        Object m73994boximpl = IntSize.m73994boximpl(j);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m73994boximpl) | composer.changed(mutableState) | composer.changed(mutableFloatState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneDialogKt$OneDialogImagePreview$1$1$1$1(j, mutableState, mutableFloatState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(align, (Function1) rememberedValue);
        m1819I = OneDialogKt.m1819I(mutableFloatState2);
        m1819I2 = OneDialogKt.m1819I(mutableFloatState2);
        m1824D = OneDialogKt.m1824D(mutableState2);
        float m71686getXimpl = Offset.m71686getXimpl(m1824D);
        m1824D2 = OneDialogKt.m1824D(mutableState2);
        ImageKt.m69548Image5hnEew(asImageBitmap, "Preview Photo", GraphicsLayerModifierKt.m72062graphicsLayerAp8cVGQ$default(onGloballyPositioned, m1819I, m1819I2, 0.0f, m71686getXimpl, Offset.m71687getYimpl(m1824D2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131044, null), null, fit, 0.0f, null, 0, composer, 24632, 232);
        IconButtonKt.IconButton(function0, boxScopeInstance.align(companion, companion2.getTopEnd()), false, null, null, ComposableSingletons$OneDialogKt.INSTANCE.m75309getLambda1$app_prodRelease(), composer, ((i2 >> 3) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 28);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}