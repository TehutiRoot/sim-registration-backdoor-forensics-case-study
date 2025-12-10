package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.TypeKt;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneButtonKt;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSignaturePageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$SignatureModalBottomSheet$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1068:1\n67#2,5:1069\n72#2:1102\n67#2,5:1196\n72#2:1229\n76#2:1247\n76#2:1268\n78#3,11:1074\n78#3,11:1111\n78#3,11:1142\n91#3:1190\n78#3,11:1201\n91#3:1246\n91#3:1262\n91#3:1267\n456#4,8:1085\n464#4,3:1099\n456#4,8:1122\n464#4,3:1136\n456#4,8:1153\n464#4,3:1167\n36#4:1172\n50#4:1179\n49#4:1180\n467#4,3:1187\n456#4,8:1212\n464#4,3:1226\n67#4,3:1232\n66#4:1235\n467#4,3:1243\n67#4,3:1249\n66#4:1252\n467#4,3:1259\n467#4,3:1264\n4144#5,6:1093\n4144#5,6:1130\n4144#5,6:1161\n4144#5,6:1220\n154#6:1103\n154#6:1104\n154#6:1171\n154#6:1192\n154#6:1193\n154#6:1194\n154#6:1195\n154#6:1230\n154#6:1231\n154#6:1242\n154#6:1248\n72#7,6:1105\n78#7:1139\n82#7:1263\n77#8,2:1140\n79#8:1170\n83#8:1191\n1097#9,6:1173\n1097#9,6:1181\n1097#9,6:1236\n1097#9,6:1253\n*S KotlinDebug\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$SignatureModalBottomSheet$3\n*L\n853#1:1069,5\n853#1:1102\n916#1:1196,5\n916#1:1229\n916#1:1247\n853#1:1268\n853#1:1074,11\n860#1:1111,11\n867#1:1142,11\n867#1:1190\n916#1:1201,11\n916#1:1246\n860#1:1262\n853#1:1267\n853#1:1085,8\n853#1:1099,3\n860#1:1122,8\n860#1:1136,3\n867#1:1153,8\n867#1:1167,3\n877#1:1172\n898#1:1179\n898#1:1180\n867#1:1187,3\n916#1:1212,8\n916#1:1226,3\n936#1:1232,3\n936#1:1235\n916#1:1243,3\n973#1:1249,3\n973#1:1252\n860#1:1259,3\n853#1:1264,3\n853#1:1093,6\n860#1:1130,6\n867#1:1161,6\n916#1:1220,6\n862#1:1103\n865#1:1104\n876#1:1171\n915#1:1192\n918#1:1193\n921#1:1194\n923#1:1195\n931#1:1230\n933#1:1231\n967#1:1242\n971#1:1248\n860#1:1105,6\n860#1:1139\n860#1:1263\n867#1:1140,2\n867#1:1170\n867#1:1191\n877#1:1173,6\n898#1:1181,6\n936#1:1236,6\n973#1:1253,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignatureModalBottomSheet$3 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignatureModalBottomSheet$3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableState<Boolean> $clearClick$delegate;
    final /* synthetic */ MutableState<Boolean> $doneClick$delegate;
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ boolean $isTrueThemes;
    final /* synthetic */ State<C3623Dp> $offsetY$delegate;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onComplete;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableState<Boolean> $showNotFoundSignature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignaturePageScreenKt$SignatureModalBottomSheet$3(State<C3623Dp> state, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Function0<Unit> function0, int i, boolean z, MutableState<ImageBitmap> mutableState3, MutableState<Boolean> mutableState4, Function1<? super ImageBitmap, Unit> function1) {
        super(3);
        this.$offsetY$delegate = state;
        this.$doneClick$delegate = mutableState;
        this.$showNotFoundSignature = mutableState2;
        this.$onDismiss = function0;
        this.$$dirty = i;
        this.$isTrueThemes = z;
        this.$imageBitmap$delegate = mutableState3;
        this.$clearClick$delegate = mutableState4;
        this.$onComplete = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r86v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer, int i) {
        float m1759p;
        int i2;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2011440817, i, -1, "th.co.dtac.android.dtacone.widget.compose.signature.SignatureModalBottomSheet.<anonymous> (SignaturePageScreen.kt:851)");
        }
        Alignment.Companion companion = Alignment.Companion;
        Alignment bottomCenter = companion.getBottomCenter();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier m69505backgroundbw27NRU$default = BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Color.m71918copywmQWz5c$default(ColorResources_androidKt.colorResource(R.color.colorBlack, composer, 0), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        m1759p = SignaturePageScreenKt.m1759p(this.$offsetY$delegate);
        Modifier m69687offsetVpY3zN4$default = OffsetKt.m69687offsetVpY3zN4$default(m69505backgroundbw27NRU$default, 0.0f, m1759p, 1, null);
        MutableState<Boolean> mutableState = this.$doneClick$delegate;
        MutableState<Boolean> mutableState2 = this.$showNotFoundSignature;
        Function0<Unit> function0 = this.$onDismiss;
        int i3 = this.$$dirty;
        boolean z = this.$isTrueThemes;
        MutableState<ImageBitmap> mutableState3 = this.$imageBitmap$delegate;
        MutableState<Boolean> mutableState4 = this.$clearClick$delegate;
        Function1<ImageBitmap, Unit> function1 = this.$onComplete;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69687offsetVpY3zN4$default);
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
        float f = 16;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(companion2, RoundedCornerShapeKt.m69897RoundedCornerShapea9UjIt4$default(C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 12, null)), 0.0f, 1, null);
        Color.Companion companion4 = Color.Companion;
        Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69505backgroundbw27NRU$default(fillMaxWidth$default, companion4.m71956getWhite0d7_KjU(), null, 2, null), C3623Dp.m73842constructorimpl(f));
        composer.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
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
        Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
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
        Updater.m71584setimpl(m71577constructorimpl3, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier m69748size3ABfNKs = SizeKt.m69748size3ABfNKs(companion2, C3623Dp.m73842constructorimpl(32));
        int i4 = i3 >> 3;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(function0);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$1$1$1(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        IconKt.m70610Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close_gray, composer, 0), "", ClickableKt.m69531clickableXHw0xAI$default(m69748size3ABfNKs, false, null, null, rememberedValue, 7, null), ColorResources_androidKt.colorResource(R.color.grayishBrown48, composer, 0), (Composer) composer, 56, 0);
        Modifier m68554a = AbstractC17608Ez1.m68554a(rowScopeInstance, companion2, 1.0f, false, 2, null);
        String stringResource = StringResources_androidKt.stringResource(R.string.one_signature_title, composer, 0);
        long colorResource = ColorResources_androidKt.colorResource(R.color.jet_back, composer, 0);
        FontFamily betterTogetherFont = TypeKt.getBetterTogetherFont();
        long sp = TextUnitKt.getSp(16);
        long sp2 = TextUnitKt.getSp(26);
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextKt.m70882Text4IGK_g(stringResource, m68554a, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource, sp, companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, betterTogetherFont, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65020);
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(mutableState3) | composer.changed(mutableState4);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$1$2$1(mutableState3, mutableState4);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier m69531clickableXHw0xAI$default = ClickableKt.m69531clickableXHw0xAI$default(companion2, false, null, null, rememberedValue2, 7, null);
        String stringResource2 = StringResources_androidKt.stringResource(R.string.one_signature_text_renew, composer, 0);
        if (z) {
            composer.startReplaceableGroup(1564388725);
            i2 = R.color.red5;
        } else {
            composer.startReplaceableGroup(1564388763);
            i2 = R.color.niceBlueFive;
        }
        long colorResource2 = ColorResources_androidKt.colorResource(i2, composer, 0);
        composer.endReplaceableGroup();
        TextKt.m70882Text4IGK_g(stringResource2, m69531clickableXHw0xAI$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(colorResource2, TextUnitKt.getSp(16), companion5.getMedium(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(24)), composer, 6);
        Modifier m69505backgroundbw27NRU$default2 = BackgroundKt.m69505backgroundbw27NRU$default(BorderKt.m69512borderxT4_qwU(SizeKt.fillMaxWidth$default(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(280)), 0.0f, 1, null), C3623Dp.m73842constructorimpl(1), ColorResources_androidKt.colorResource(R.color.opacityWhite25PercentOne, composer, 0), RoundedCornerShapeKt.m69895RoundedCornerShape0680j_4(C3623Dp.m73842constructorimpl(8))), companion4.m71956getWhite0d7_KjU(), null, 2, null);
        Alignment center = companion.getCenter();
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m69505backgroundbw27NRU$default2);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m71577constructorimpl4 = Updater.m71577constructorimpl(composer);
        Updater.m71584setimpl(m71577constructorimpl4, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (m71577constructorimpl4.getInserting() || !Intrinsics.areEqual(m71577constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m71577constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m71577constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        modifierMaterializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(0);
        long m71956getWhite0d7_KjU = companion4.m71956getWhite0d7_KjU();
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(200);
        long m71945getBlack0d7_KjU = companion4.m71945getBlack0d7_KjU();
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -328580868, true, new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$2$1(mutableState));
        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, -784413443, true, new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$2$2(mutableState4));
        composer.startReplaceableGroup(1618982084);
        boolean changed3 = composer.changed(mutableState2) | composer.changed(mutableState3) | composer.changed(function1);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$2$3$1(mutableState2, mutableState3, function1);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        ComposeSignatureCustomKt.m75353ComposeSignatureCustom4oWs0OM(fillMaxSize$default, m71956getWhite0d7_KjU, m73842constructorimpl2, m71945getBlack0d7_KjU, m73842constructorimpl, 10.0f, false, composableLambda, composableLambda2, rememberedValue3, null, composer, 113470902, 0, 1088);
        TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.one_signature_customer_tiltle, composer, 0), boxScopeInstance.align(PaddingKt.m69717paddingqDBjuR0$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f), 0.0f, 0.0f, 13, null), companion.getTopCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorResources_androidKt.colorResource(R.color.colorGray, composer, 0), TextUnitKt.getSp(16), companion5.getNormal(), (FontStyle) null, (FontSynthesis) null, TypeKt.getBetterTogetherFont(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), (Composer) composer, 0, 0, 65532);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f)), composer, 6);
        composer.startReplaceableGroup(1618982084);
        boolean changed4 = composer.changed(mutableState) | composer.changed(mutableState2) | composer.changed(function0);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new SignaturePageScreenKt$SignatureModalBottomSheet$3$1$1$3$1(mutableState2, function0, mutableState);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        OneButtonKt.OneButton(rememberedValue4, StringResources_androidKt.stringResource(R.string.ok, composer, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), z, composer, (i4 & 7168) | 384, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
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