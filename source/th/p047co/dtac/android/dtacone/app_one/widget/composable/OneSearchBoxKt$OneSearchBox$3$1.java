package th.p047co.dtac.android.dtacone.app_one.widget.composable;

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
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
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
import androidx.compose.p003ui.text.input.KeyboardType;
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
import androidx.compose.p003ui.unit.C3641Dp;
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

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nOneSearchBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSearchBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSearchBoxKt$OneSearchBox$3$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,191:1\n73#2,6:192\n79#2:226\n83#2:253\n78#3,11:198\n91#3:252\n456#4,8:209\n464#4,3:223\n36#4:231\n36#4:240\n467#4,3:249\n4144#5,6:217\n154#6:227\n154#6:228\n154#6:229\n154#6:230\n154#6:238\n154#6:239\n154#6:247\n154#6:248\n1097#7,6:232\n1097#7,6:241\n*S KotlinDebug\n*F\n+ 1 OneSearchBox.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneSearchBoxKt$OneSearchBox$3$1\n*L\n87#1:192,6\n87#1:226\n87#1:253\n87#1:198,11\n87#1:252\n87#1:209,8\n87#1:223,3\n117#1:231\n145#1:240\n87#1:249,3\n87#1:217,6\n92#1:227\n97#1:228\n100#1:229\n105#1:230\n138#1:238\n140#1:239\n148#1:247\n151#1:248\n117#1:232,6\n145#1:241,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt$OneSearchBox$3$1 */
/* loaded from: classes7.dex */
public final class OneSearchBoxKt$OneSearchBox$3$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ Function1<String, Unit> $onTextChange;
    final /* synthetic */ String $placeHolder;
    final /* synthetic */ boolean $setKeyBoardNumber;
    final /* synthetic */ boolean $shouldFocus;
    final /* synthetic */ String $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSearchBoxKt$OneSearchBox$3$1(boolean z, FocusRequester focusRequester, boolean z2, String str, Function1<? super String, Unit> function1, int i, String str2) {
        super(3);
        this.$shouldFocus = z;
        this.$focusRequester = focusRequester;
        this.$setKeyBoardNumber = z2;
        this.$textState = str;
        this.$onTextChange = function1;
        this.$$dirty = i;
        this.$placeHolder = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r65v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        KeyboardOptions m69738copy3m2b7yw$default;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2138526854, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBox.<anonymous>.<anonymous> (OneSearchBox.kt:85)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        boolean z = this.$shouldFocus;
        FocusRequester focusRequester = this.$focusRequester;
        boolean z2 = this.$setKeyBoardNumber;
        String str = this.$textState;
        Function1<String, Unit> function1 = this.$onTextChange;
        int i2 = this.$$dirty;
        String str2 = this.$placeHolder;
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
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 12;
        SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion, C3641Dp.m73658constructorimpl(f)), composer, 6);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_search, composer, 0);
        float f2 = 24;
        Modifier m69564size3ABfNKs = SizeKt.m69564size3ABfNKs(companion, C3641Dp.m73658constructorimpl(f2));
        ColorFilter.Companion companion3 = ColorFilter.Companion;
        ImageKt.Image(painterResource, (String) null, m69564size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m71776tintxETnrds$default(companion3, ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), 0, 2, null), (Composer) composer, 440, 56);
        float f3 = 8;
        SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion, C3641Dp.m73658constructorimpl(f3)), composer, 6);
        Modifier m69550height3ABfNKs = SizeKt.m69550height3ABfNKs(AbstractC17770Hy1.m68013a(rowScopeInstance, FocusRequesterModifierKt.focusRequester(companion, z ? focusRequester : new FocusRequester()), 1.0f, false, 2, null), C3641Dp.m73658constructorimpl(26));
        if (z2) {
            m69738copy3m2b7yw$default = KeyboardOptions.m69738copy3m2b7yw$default(KeyboardOptions.Companion.getDefault(), 0, false, KeyboardType.Companion.m73414getNumberPjHm6EE(), ImeAction.Companion.m73366getDoneeUduSuo(), 3, null);
        } else {
            m69738copy3m2b7yw$default = KeyboardOptions.m69738copy3m2b7yw$default(KeyboardOptions.Companion.getDefault(), 0, false, 0, ImeAction.Companion.m73366getDoneeUduSuo(), 7, null);
        }
        KeyboardOptions keyboardOptions = m69738copy3m2b7yw$default;
        TextStyle textStyle = new TextStyle(Color.Companion.m71761getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OneSearchBoxKt$OneSearchBox$3$1$1$1$1(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) rememberedValue, m69550height3ABfNKs, false, false, textStyle, keyboardOptions, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer, -887788724, true, new OneSearchBoxKt$OneSearchBox$3$1$1$2(str, str2, i2)), (Composer) composer, ((i2 >> 15) & 14) | ProfileVerifier.CompilationStatus.f36531xf2722a21, (int) ProfileVerifier.CompilationStatus.f36531xf2722a21, 32664);
        if (str.length() == 0) {
            composer.startReplaceableGroup(1197655882);
            SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion, C3641Dp.m73658constructorimpl(f)), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1197655968);
            SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion, C3641Dp.m73658constructorimpl(f3)), composer, 6);
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_close, composer, 0);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new OneSearchBoxKt$OneSearchBox$3$1$1$3$1(function1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ImageKt.Image(painterResource2, (String) null, SizeKt.m69564size3ABfNKs(ClickableKt.m69345clickableXHw0xAI$default(companion, false, null, null, rememberedValue2, 7, null), C3641Dp.m73658constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m71776tintxETnrds$default(companion3, ColorResources_androidKt.colorResource(R.color.greyishBrown, composer, 0), 0, 2, null), (Composer) composer, 56, 56);
            SpacerKt.Spacer(SizeKt.m69569width3ABfNKs(companion, C3641Dp.m73658constructorimpl(f)), composer, 6);
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
