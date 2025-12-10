package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u001a!\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\b\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u0002*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u000f\u0010\f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u000f\u0010\u000f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\r\u001a\u000f\u0010\u0010\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m29142d2 = {"Landroidx/compose/foundation/layout/BoxScope;", "Lkotlin/Function0;", "", "onTakePhoto", "TakePhotoButton", "(Landroidx/compose/foundation/layout/BoxScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onRetakePhoto", "onConfirmPreview", "ConfirmButtons", "(Landroidx/compose/foundation/layout/BoxScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onTakeMore", "TakeMoreButton", "d", "(Landroidx/compose/runtime/Composer;I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTakePhotoButtons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePhotoButtons.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/takePhoto/TakePhotoButtonsKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,195:1\n72#2,6:196\n78#2:230\n82#2:237\n72#2,6:238\n78#2:272\n82#2:319\n72#2,6:320\n78#2:354\n82#2:360\n78#3,11:202\n91#3:236\n78#3,11:244\n78#3,11:280\n91#3:312\n91#3:318\n78#3,11:326\n91#3:359\n456#4,8:213\n464#4,3:227\n467#4,3:233\n456#4,8:255\n464#4,3:269\n456#4,8:291\n464#4,3:305\n467#4,3:309\n467#4,3:315\n456#4,8:337\n464#4,3:351\n467#4,3:356\n4144#5,6:221\n4144#5,6:263\n4144#5,6:299\n4144#5,6:345\n154#6:231\n154#6:232\n154#6:273\n154#6:314\n154#6:355\n73#7,6:274\n79#7:308\n83#7:313\n*S KotlinDebug\n*F\n+ 1 TakePhotoButtons.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/layout/takePhoto/TakePhotoButtonsKt\n*L\n38#1:196,6\n38#1:230\n38#1:237\n67#1:238,6\n67#1:272\n67#1:319\n103#1:320,6\n103#1:354\n103#1:360\n38#1:202,11\n38#1:236\n67#1:244,11\n68#1:280,11\n68#1:312\n67#1:318\n103#1:326,11\n103#1:359\n38#1:213,8\n38#1:227,3\n38#1:233,3\n67#1:255,8\n67#1:269,3\n68#1:291,8\n68#1:305,3\n68#1:309,3\n67#1:315,3\n103#1:337,8\n103#1:351,3\n103#1:356,3\n38#1:221,6\n67#1:263,6\n68#1:299,6\n103#1:345,6\n50#1:231\n58#1:232\n68#1:273\n95#1:314\n118#1:355\n68#1:274,6\n68#1:308\n68#1:313\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.TakePhotoButtonsKt */
/* loaded from: classes10.dex */
public final class TakePhotoButtonsKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ConfirmButtons(@NotNull BoxScope boxScope, @NotNull Function0<Unit> onRetakePhoto, @NotNull Function0<Unit> onConfirmPreview, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onRetakePhoto, "onRetakePhoto");
        Intrinsics.checkNotNullParameter(onConfirmPreview, "onConfirmPreview");
        Composer startRestartGroup = composer.startRestartGroup(1173640713);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(onRetakePhoto)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(onConfirmPreview)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1173640713, i6, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.ConfirmButtons (TakePhotoButtons.kt:62)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier align = boxScope.align(companion, companion2.getBottomCenter());
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(8), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69715paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl2 = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            Color.Companion companion4 = Color.Companion;
            long m71956getWhite0d7_KjU = companion4.m71956getWhite0d7_KjU();
            long colorResource = ColorResources_androidKt.colorResource(R.color.grayishBrown, startRestartGroup, 0);
            int i7 = ButtonDefaults.$stable;
            ButtonColors m70405textButtonColorsro_MJ88 = buttonDefaults.m70405textButtonColorsro_MJ88(0L, m71956getWhite0d7_KjU, 0L, colorResource, startRestartGroup, (i7 << 12) | 48, 5);
            ComposableSingletons$TakePhotoButtonsKt composableSingletons$TakePhotoButtonsKt = ComposableSingletons$TakePhotoButtonsKt.INSTANCE;
            ButtonKt.TextButton(onRetakePhoto, null, false, null, m70405textButtonColorsro_MJ88, null, null, null, null, composableSingletons$TakePhotoButtonsKt.m75235getLambda2$app_prodRelease(), startRestartGroup, ((i6 >> 3) & 14) | 805306368, 494);
            SpacerKt.Spacer(AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            ButtonKt.TextButton(onConfirmPreview, null, false, null, buttonDefaults.m70405textButtonColorsro_MJ88(0L, companion4.m71956getWhite0d7_KjU(), 0L, ColorResources_androidKt.colorResource(R.color.grayishBrown, startRestartGroup, 0), startRestartGroup, (i7 << 12) | 48, 5), null, null, null, null, composableSingletons$TakePhotoButtonsKt.m75236getLambda3$app_prodRelease(), startRestartGroup, ((i6 >> 6) & 14) | 805306368, 494);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(56)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$ConfirmButtons$2(boxScope, onRetakePhoto, onConfirmPreview, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TakeMoreButton(@NotNull BoxScope boxScope, @NotNull Function0<Unit> onTakeMore, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onTakeMore, "onTakeMore");
        Composer startRestartGroup = composer.startRestartGroup(-621208760);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(onTakeMore)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621208760, i5, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.TakeMoreButton (TakePhotoButtons.kt:99)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier align = boxScope.align(companion, companion2.getBottomCenter());
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ButtonKt.TextButton(onTakeMore, null, false, null, ButtonDefaults.INSTANCE.m70405textButtonColorsro_MJ88(0L, Color.Companion.m71956getWhite0d7_KjU(), 0L, ColorResources_androidKt.colorResource(R.color.grayishBrown, startRestartGroup, 0), startRestartGroup, (ButtonDefaults.$stable << 12) | 48, 5), null, null, null, null, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75237getLambda4$app_prodRelease(), startRestartGroup, ((i5 >> 3) & 14) | 805306368, 494);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(8)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$TakeMoreButton$2(boxScope, onTakeMore, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TakePhotoButton(@NotNull BoxScope boxScope, @NotNull Function0<Unit> onTakePhoto, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(onTakePhoto, "onTakePhoto");
        Composer startRestartGroup = composer.startRestartGroup(-1103965689);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(onTakePhoto)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1103965689, i2, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.TakePhotoButton (TakePhotoButtons.kt:36)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier align = boxScope.align(companion, companion2.getBottomCenter());
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            IconButtonKt.IconButton(onTakePhoto, BackgroundKt.m69504backgroundbw27NRU(SizeKt.m69748size3ABfNKs(companion, C3623Dp.m73842constructorimpl(72)), ColorResources_androidKt.colorResource(R.color.white, startRestartGroup, 0), RoundedCornerShapeKt.getCircleShape()), false, IconButtonDefaults.INSTANCE.m70605iconButtonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.white, startRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.jet_back, startRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.white, startRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.grayishBrown, startRestartGroup, 0), startRestartGroup, IconButtonDefaults.$stable << 12, 0), null, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75234getLambda1$app_prodRelease(), startRestartGroup, ((i2 >> 3) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21, 20);
            SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion, C3623Dp.m73842constructorimpl(56)), composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$TakePhotoButton$2(boxScope, onTakePhoto, i));
        }
    }

    /* renamed from: a */
    public static final void m9467a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1673492964);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673492964, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.ConfirmAndTakeMorePreview (TakePhotoButtons.kt:178)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75241getLambda8$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$ConfirmAndTakeMorePreview$1(i));
        }
    }

    /* renamed from: b */
    public static final void m9466b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1270963662);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1270963662, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.ConfirmButtonsPreview (TakePhotoButtons.kt:142)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75239getLambda6$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$ConfirmButtonsPreview$1(i));
        }
    }

    /* renamed from: c */
    public static final void m9465c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-562285375);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-562285375, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.TakeMoreButtonPreview (TakePhotoButtons.kt:160)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75240getLambda7$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$TakeMoreButtonPreview$1(i));
        }
    }

    /* renamed from: d */
    public static final void m9464d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(397309966);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(397309966, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.takePhoto.TakePhotoButtonPreview (TakePhotoButtons.kt:124)");
            }
            ThemeKt.OneTheme(null, false, ComposableSingletons$TakePhotoButtonsKt.INSTANCE.m75238getLambda5$app_prodRelease(), startRestartGroup, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TakePhotoButtonsKt$TakePhotoButtonPreview$1(i));
        }
    }
}