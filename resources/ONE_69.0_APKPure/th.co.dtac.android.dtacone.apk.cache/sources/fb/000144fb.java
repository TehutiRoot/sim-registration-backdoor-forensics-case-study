package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignPackageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$SearchBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,610:1\n73#2,6:611\n79#2:645\n83#2:672\n78#3,11:617\n91#3:671\n456#4,8:628\n464#4,3:642\n36#4:650\n36#4:659\n467#4,3:668\n4144#5,6:636\n154#6:646\n154#6:647\n154#6:648\n154#6:649\n154#6:657\n154#6:658\n154#6:666\n154#6:667\n1097#7,6:651\n1097#7,6:660\n*S KotlinDebug\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$SearchBar$1\n*L\n265#1:611,6\n265#1:645\n265#1:672\n265#1:617,11\n265#1:671\n265#1:628,8\n265#1:642,3\n288#1:650\n316#1:659\n265#1:668,3\n265#1:636,6\n270#1:646\n275#1:647\n278#1:648\n283#1:649\n309#1:657\n311#1:658\n319#1:666\n322#1:667\n288#1:651,6\n316#1:660,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$SearchBar$1 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$SearchBar$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<String, Unit> $onTextChange;
    final /* synthetic */ String $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneCampaignPackageScreenKt$SearchBar$1(String str, Function1<? super String, Unit> function1, int i) {
        super(3);
        this.$textState = str;
        this.$onTextChange = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r61v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231725586, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.SearchBar.<anonymous> (OneCampaignPackageScreen.kt:263)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        String str = this.$textState;
        Function1<String, Unit> function1 = this.$onTextChange;
        int i2 = this.$$dirty;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
        Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 12;
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), composer, 6);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_search, composer, 0);
        float f2 = 24;
        Modifier m69748size3ABfNKs = SizeKt.m69748size3ABfNKs(companion, C3623Dp.m73842constructorimpl(f2));
        ColorFilter.Companion companion3 = ColorFilter.Companion;
        ImageKt.Image(painterResource, (String) null, m69748size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m71960tintxETnrds$default(companion3, ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), 0, 2, null), (Composer) composer, 440, 56);
        float f3 = 8;
        SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f3)), composer, 6);
        Modifier m69734height3ABfNKs = SizeKt.m69734height3ABfNKs(AbstractC17608Ez1.m68554a(rowScopeInstance, companion, 1.0f, false, 2, null), C3623Dp.m73842constructorimpl(26));
        KeyboardOptions m69922copy3m2b7yw$default = KeyboardOptions.m69922copy3m2b7yw$default(KeyboardOptions.Companion.getDefault(), 0, false, 0, ImeAction.Companion.m73550getDoneeUduSuo(), 7, null);
        TextStyle textStyle = new TextStyle(Color.Companion.m71945getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneCampaignPackageScreenKt$SearchBar$1$1$1$1(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) rememberedValue, m69734height3ABfNKs, false, false, textStyle, m69922copy3m2b7yw$default, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer, -617340800, true, new OneCampaignPackageScreenKt$SearchBar$1$1$2(str)), (Composer) composer, (i2 & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21, (int) ProfileVerifier.CompilationStatus.f36619xf2722a21, 32664);
        if (str.length() == 0) {
            composer.startReplaceableGroup(-1510687146);
            SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1510687068);
            SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f3)), composer, 6);
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_close, composer, 0);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new OneCampaignPackageScreenKt$SearchBar$1$1$3$1(function1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ImageKt.Image(painterResource2, (String) null, SizeKt.m69748size3ABfNKs(ClickableKt.m69531clickableXHw0xAI$default(companion, false, null, null, rememberedValue2, 7, null), C3623Dp.m73842constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m71960tintxETnrds$default(companion3, ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), 0, 2, null), (Composer) composer, 56, 56);
            SpacerKt.Spacer(SizeKt.m69753width3ABfNKs(companion, C3623Dp.m73842constructorimpl(f)), composer, 6);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}