package th.p047co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.LocalAppThemeKt;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneButtonKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u001aI\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m29142d2 = {"", "isSuccess", "isApprove", "Lkotlin/Function0;", "", "onSuccess", "onRetry", "onBack", "ReviewFaceCompareKyc2ndLineResultScreen", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onClick", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/runtime/Composer;I)V", OperatorName.CURVE_TO, "d", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResultScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/kyc2ndLine/ResultScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,151:1\n76#2:152\n154#3:153\n154#3:154\n154#3:186\n154#3:187\n154#3:188\n76#4,2:155\n78#4:185\n76#4,2:189\n78#4:219\n82#4:224\n82#4:236\n78#5,11:157\n78#5,11:191\n91#5:223\n91#5:235\n456#6,8:168\n464#6,3:182\n456#6,8:202\n464#6,3:216\n467#6,3:220\n36#6:225\n467#6,3:232\n4144#7,6:176\n4144#7,6:210\n1097#8,6:226\n*S KotlinDebug\n*F\n+ 1 ResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/kyc2ndLine/ResultScreenKt\n*L\n38#1:152\n41#1:153\n44#1:154\n60#1:186\n74#1:187\n75#1:188\n39#1:155,2\n39#1:185\n72#1:189,2\n72#1:219\n72#1:224\n39#1:236\n39#1:157,11\n72#1:191,11\n72#1:223\n39#1:235\n39#1:168,8\n39#1:182,3\n72#1:202,8\n72#1:216,3\n72#1:220,3\n92#1:225\n39#1:232,3\n39#1:176,6\n72#1:210,6\n92#1:226,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ResultScreenKt */
/* loaded from: classes10.dex */
public final class ResultScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ReviewFaceCompareKyc2ndLineResultScreen(boolean z, boolean z2, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onRetry, @NotNull Function0<Unit> onBack, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        Composer composer2;
        int i4;
        String stringResource;
        TextStyle m73418copyv2rsoow;
        Composer composer3;
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer startRestartGroup = composer.startRestartGroup(-1224204232);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onSuccess) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onRetry) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onBack) ? 16384 : 8192;
        }
        int i5 = i2;
        if ((46811 & i5) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224204232, i5, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ReviewFaceCompareKyc2ndLineResultScreen (ResultScreen.kt:30)");
            }
            CompanyThemes companyThemes = (CompanyThemes) startRestartGroup.consume(LocalAppThemeKt.getLocalAppTheme());
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 24;
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f));
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
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
            if (companyThemes == CompanyThemes.ONE_TRUE) {
                if (!z) {
                    i3 = R.drawable.ic_kyc_2nd_line_result_timeout_xt;
                } else if (z2) {
                    i3 = R.drawable.ic_kyc_2nd_line_result_success_xt;
                } else {
                    i3 = R.drawable.ic_kyc_2nd_line_result_failure_xt;
                }
            } else if (!z) {
                i3 = R.drawable.ic_kyc_2nd_line_result_timeout_xd;
            } else if (z2) {
                i3 = R.drawable.ic_kyc_2nd_line_result_success_xd;
            } else {
                i3 = R.drawable.ic_kyc_2nd_line_result_failure_xd;
            }
            Painter painterResource = PainterResources_androidKt.painterResource(i3, startRestartGroup, 0);
            float f2 = 16;
            ImageKt.Image(painterResource, (String) null, PaddingKt.m69717paddingqDBjuR0$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f2), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            if (z) {
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(-428050546);
                if (z2) {
                    composer2.startReplaceableGroup(-428050517);
                    i4 = 0;
                    stringResource = StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_result_approved, composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    i4 = 0;
                    composer2.startReplaceableGroup(-428050438);
                    stringResource = StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_result_rejected, composer2, 0);
                    composer2.endReplaceableGroup();
                }
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                i4 = 0;
                composer2.startReplaceableGroup(-428050361);
                stringResource = StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_result_timeout, composer2, 0);
                composer2.endReplaceableGroup();
            }
            long Color = ColorKt.Color(4281677109L);
            m73418copyv2rsoow = r36.m73418copyv2rsoow((r48 & 1) != 0 ? r36.f31200a.m73360getColor0d7_KjU() : Color, (r48 & 2) != 0 ? r36.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r36.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? r36.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r36.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r36.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r36.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r36.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r36.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r36.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r36.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r36.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r36.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r36.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r36.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r36.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r48 & 65536) != 0 ? r36.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r36.f31201b.m73315getLineHeightXSAIIZE() : TextUnitKt.getSp(26), (r48 & 262144) != 0 ? r36.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r36.f31202c : null, (r48 & 1048576) != 0 ? r36.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r36.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r36.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge().f31201b.getTextMotion() : null);
            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_42 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f2));
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(companion2, C3623Dp.m73842constructorimpl(f2), 0.0f, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_42, centerHorizontally2, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, i4);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m69715paddingVpY3zN4$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer2);
            Updater.m71584setimpl(m71577constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, Integer.valueOf(i4));
            composer2.startReplaceableGroup(2058660585);
            composer3 = composer2;
            TextKt.m70882Text4IGK_g(stringResource, (Modifier) null, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow, composer3, 384, 0, 65530);
            composer3.startReplaceableGroup(-428049693);
            if (!z) {
                TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_result_detail, composer3, 0), (Modifier) null, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow, composer3, 384, 0, 65530);
            }
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (z) {
                composer3.startReplaceableGroup(-428049423);
                if (z2) {
                    composer3.startReplaceableGroup(-428049394);
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceableGroup(1157296644);
                    boolean changed = composer3.changed(onSuccess);
                    Object rememberedValue = composer3.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ResultScreenKt$ReviewFaceCompareKyc2ndLineResultScreen$1$2$1(onSuccess, null);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    composer3.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2) rememberedValue, composer3, 70);
                    composer3.endReplaceableGroup();
                } else {
                    composer3.startReplaceableGroup(-428049161);
                    m9125a(onRetry, composer3, (i5 >> 9) & 14);
                    composer3.endReplaceableGroup();
                }
                composer3.endReplaceableGroup();
            } else {
                composer3.startReplaceableGroup(-428049118);
                m9125a(onBack, composer3, (i5 >> 12) & 14);
                composer3.endReplaceableGroup();
            }
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ResultScreenKt$ReviewFaceCompareKyc2ndLineResultScreen$2(z, z2, onSuccess, onRetry, onBack, i));
    }

    /* renamed from: a */
    public static final void m9125a(Function0 function0, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1185561374);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1185561374, i2, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.OkButton (ResultScreen.kt:103)");
            }
            OneButtonKt.OneButton(function0, StringResources_androidKt.stringResource(R.string.ok, startRestartGroup, 0), SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), startRestartGroup, (i2 & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ResultScreenKt$OkButton$1(function0, i));
        }
    }

    /* renamed from: b */
    public static final void m9124b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(446525682);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(446525682, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ResultPreviewApprove (ResultScreen.kt:114)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableSingletons$ResultScreenKt.INSTANCE.m75283getLambda1$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ResultScreenKt$ResultPreviewApprove$1(i));
        }
    }

    /* renamed from: c */
    public static final void m9123c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-419449762);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-419449762, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ResultPreviewReject (ResultScreen.kt:127)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableSingletons$ResultScreenKt.INSTANCE.m75284getLambda2$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ResultScreenKt$ResultPreviewReject$1(i));
        }
    }

    /* renamed from: d */
    public static final void m9122d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(988400390);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(988400390, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ResultPreviewTimeout (ResultScreen.kt:140)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableSingletons$ResultScreenKt.INSTANCE.m75285getLambda3$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ResultScreenKt$ResultPreviewTimeout$1(i));
        }
    }
}