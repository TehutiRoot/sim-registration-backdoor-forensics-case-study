package th.p047co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ColorKt;
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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.LocalAppThemeKt;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m29142d2 = {"", "leftTimeMillis", "", "wordingInfoTime", "", "ReviewFaceCompareKyc2ndLineWaitingScreen", "(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWaitingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitingScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/kyc2ndLine/WaitingScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n76#2:193\n154#3:194\n154#3:230\n154#3:231\n154#3:232\n154#3:264\n154#3:265\n154#3:266\n154#3:272\n154#3:273\n72#4,6:195\n78#4:229\n82#4:278\n78#5,11:201\n78#5,11:235\n91#5:270\n91#5:277\n456#6,8:212\n464#6,3:226\n456#6,8:246\n464#6,3:260\n467#6,3:267\n467#6,3:274\n4144#7,6:220\n4144#7,6:254\n77#8,2:233\n79#8:263\n83#8:271\n81#9:279\n*S KotlinDebug\n*F\n+ 1 WaitingScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/kyc2ndLine/WaitingScreenKt\n*L\n49#1:193\n68#1:194\n78#1:230\n82#1:231\n83#1:232\n89#1:264\n90#1:265\n109#1:266\n123#1:272\n134#1:273\n64#1:195,6\n64#1:229\n64#1:278\n64#1:201,11\n80#1:235,11\n80#1:270\n64#1:277\n64#1:212,8\n64#1:226,3\n80#1:246,8\n80#1:260,3\n80#1:267,3\n64#1:274,3\n64#1:220,6\n80#1:254,6\n80#1:233,2\n80#1:263\n80#1:271\n58#1:279\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.WaitingScreenKt */
/* loaded from: classes10.dex */
public final class WaitingScreenKt {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.WaitingScreenKt$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CompanyThemes.values().length];
            try {
                iArr[CompanyThemes.ONE_DTAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CompanyThemes.ONE_TRUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CompanyThemes.OLD_DTAC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ReviewFaceCompareKyc2ndLineWaitingScreen(long j, @NotNull String wordingInfoTime, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer composer2;
        long m70439getPrimary0d7_KjU;
        TextStyle m73418copyv2rsoow;
        TextStyle m73418copyv2rsoow2;
        TextStyle m73418copyv2rsoow3;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(wordingInfoTime, "wordingInfoTime");
        Composer startRestartGroup = composer.startRestartGroup(-503391125);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(j)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(wordingInfoTime)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-503391125, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ReviewFaceCompareKyc2ndLineWaitingScreen (WaitingScreen.kt:44)");
            }
            CompanyThemes companyThemes = (CompanyThemes) startRestartGroup.consume(LocalAppThemeKt.getLocalAppTheme());
            int i7 = WhenMappings.$EnumSwitchMapping$0[companyThemes.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        i3 = R.drawable.ic_clock_xt;
                    } else {
                        i3 = R.drawable.ic_clock_dtac;
                    }
                } else {
                    i3 = R.drawable.ic_clock_xt;
                }
            } else {
                i3 = R.drawable.ic_clock_xd;
            }
            int i8 = i3;
            CompanyThemes companyThemes2 = CompanyThemes.ONE_TRUE;
            if (companyThemes == companyThemes2) {
                i4 = R.raw.animated_kyc_2nd_line_waiting_xt;
            } else {
                i4 = R.raw.animated_kyc_2nd_line_waiting_xd;
            }
            composer2 = startRestartGroup;
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m74198boximpl(LottieCompositionSpec.RawRes.m74199constructorimpl(i4)), null, null, null, null, null, startRestartGroup, 0, 62);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(j);
            long seconds = timeUnit.toSeconds(j) % 60;
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.Companion;
            float f = 24;
            Modifier m69713padding3ABfNKs = PaddingKt.m69713padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), C3623Dp.m73842constructorimpl(f));
            composer2.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69713padding3ABfNKs);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(composer2);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            LottieAnimationKt.LottieAnimation(m9118d(rememberLottieComposition), PaddingKt.m69715paddingVpY3zN4$default(SizeKt.m69734height3ABfNKs(companion2, C3623Dp.m73842constructorimpl((float) SyslogConstants.LOG_LOCAL4)), 0.0f, C3623Dp.m73842constructorimpl(16), 1, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, null, composer2, 1572920, 0, 262076);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = arrangement.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(2));
            float f2 = 8;
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f2), 1, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
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
            Updater.m71584setimpl(m71577constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i8, composer2, 0), (String) null, PaddingKt.m69713padding3ABfNKs(SizeKt.m69748size3ABfNKs(companion2, C3623Dp.m73842constructorimpl(f)), C3623Dp.m73842constructorimpl(4)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(seconds)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            composer2.startReplaceableGroup(-111539492);
            if (companyThemes == CompanyThemes.ONE_DTAC) {
                m70439getPrimary0d7_KjU = ColorKt.Color(4278210733L);
            } else if (companyThemes == companyThemes2) {
                m70439getPrimary0d7_KjU = ColorKt.Color(4290052366L);
            } else if (companyThemes == CompanyThemes.OLD_DTAC) {
                m70439getPrimary0d7_KjU = ColorKt.Color(4278234344L);
            } else {
                m70439getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m70439getPrimary0d7_KjU();
            }
            long j2 = m70439getPrimary0d7_KjU;
            composer2.endReplaceableGroup();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i9 = MaterialTheme.$stable;
            TextStyle headlineMedium = materialTheme.getTypography(composer2, i9).getHeadlineMedium();
            long sp = TextUnitKt.getSp(18);
            long sp2 = TextUnitKt.getSp(28);
            FontWeight.Companion companion4 = FontWeight.Companion;
            m73418copyv2rsoow = headlineMedium.m73418copyv2rsoow((r48 & 1) != 0 ? headlineMedium.f31200a.m73360getColor0d7_KjU() : materialTheme.getColorScheme(composer2, i9).m70439getPrimary0d7_KjU(), (r48 & 2) != 0 ? headlineMedium.f31200a.m73361getFontSizeXSAIIZE() : sp, (r48 & 4) != 0 ? headlineMedium.f31200a.getFontWeight() : companion4.getMedium(), (r48 & 8) != 0 ? headlineMedium.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? headlineMedium.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? headlineMedium.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? headlineMedium.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? headlineMedium.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? headlineMedium.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? headlineMedium.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? headlineMedium.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? headlineMedium.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? headlineMedium.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? headlineMedium.f31200a.getShadow() : null, (r48 & 16384) != 0 ? headlineMedium.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? headlineMedium.f31201b.m73316getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? headlineMedium.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? headlineMedium.f31201b.m73315getLineHeightXSAIIZE() : sp2, (r48 & 262144) != 0 ? headlineMedium.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? headlineMedium.f31202c : null, (r48 & 1048576) != 0 ? headlineMedium.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? headlineMedium.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? headlineMedium.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? headlineMedium.f31201b.getTextMotion() : null);
            TextKt.m70882Text4IGK_g(format, PaddingKt.m69715paddingVpY3zN4$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f2), 1, null), j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow, composer2, 48, 0, 65528);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            long Color = ColorKt.Color(4282927176L);
            String stringResource = StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_waiting_text, composer2, 0);
            TextStyle headlineMedium2 = materialTheme.getTypography(composer2, i9).getHeadlineMedium();
            long sp3 = TextUnitKt.getSp(18);
            long sp4 = TextUnitKt.getSp(28);
            FontWeight medium = companion4.getMedium();
            TextAlign.Companion companion5 = TextAlign.Companion;
            m73418copyv2rsoow2 = headlineMedium2.m73418copyv2rsoow((r48 & 1) != 0 ? headlineMedium2.f31200a.m73360getColor0d7_KjU() : Color, (r48 & 2) != 0 ? headlineMedium2.f31200a.m73361getFontSizeXSAIIZE() : sp3, (r48 & 4) != 0 ? headlineMedium2.f31200a.getFontWeight() : medium, (r48 & 8) != 0 ? headlineMedium2.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? headlineMedium2.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? headlineMedium2.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? headlineMedium2.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? headlineMedium2.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? headlineMedium2.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? headlineMedium2.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? headlineMedium2.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? headlineMedium2.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? headlineMedium2.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? headlineMedium2.f31200a.getShadow() : null, (r48 & 16384) != 0 ? headlineMedium2.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? headlineMedium2.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(companion5.m73732getCentere0LSkKk()), (r48 & 65536) != 0 ? headlineMedium2.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? headlineMedium2.f31201b.m73315getLineHeightXSAIIZE() : sp4, (r48 & 262144) != 0 ? headlineMedium2.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? headlineMedium2.f31202c : null, (r48 & 1048576) != 0 ? headlineMedium2.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? headlineMedium2.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? headlineMedium2.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? headlineMedium2.f31201b.getTextMotion() : null);
            TextKt.m70882Text4IGK_g(stringResource, PaddingKt.m69715paddingVpY3zN4$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f2), 1, null), Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow2, composer2, 432, 0, 65528);
            m73418copyv2rsoow3 = r98.m73418copyv2rsoow((r48 & 1) != 0 ? r98.f31200a.m73360getColor0d7_KjU() : Color, (r48 & 2) != 0 ? r98.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r98.f31200a.getFontWeight() : null, (r48 & 8) != 0 ? r98.f31200a.m73362getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r98.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r98.f31200a.getFontFamily() : null, (r48 & 64) != 0 ? r98.f31200a.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r98.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r98.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r98.f31200a.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r98.f31200a.getLocaleList() : null, (r48 & 2048) != 0 ? r98.f31200a.m73358getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r98.f31200a.getTextDecoration() : null, (r48 & 8192) != 0 ? r98.f31200a.getShadow() : null, (r48 & 16384) != 0 ? r98.f31200a.getDrawStyle() : null, (r48 & 32768) != 0 ? r98.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(companion5.m73732getCentere0LSkKk()), (r48 & 65536) != 0 ? r98.f31201b.m73318getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r98.f31201b.m73315getLineHeightXSAIIZE() : TextUnitKt.getSp(26), (r48 & 262144) != 0 ? r98.f31201b.getTextIndent() : null, (r48 & 524288) != 0 ? r98.f31202c : null, (r48 & 1048576) != 0 ? r98.f31201b.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r98.f31201b.m73313getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r98.f31201b.m73311getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? materialTheme.getTypography(composer2, i9).getBodyLarge().f31201b.getTextMotion() : null);
            TextKt.m70882Text4IGK_g(wordingInfoTime + "\n" + StringResources_androidKt.stringResource(R.string.up_pass_kyc_2nd_line_waiting_detail, composer2, 0), PaddingKt.m69715paddingVpY3zN4$default(companion2, 0.0f, C3623Dp.m73842constructorimpl(f2), 1, null), Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m73418copyv2rsoow3, composer2, 432, 0, 65528);
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
            endRestartGroup.updateScope(new WaitingScreenKt$ReviewFaceCompareKyc2ndLineWaitingScreen$2(j, wordingInfoTime, i));
        }
    }

    /* renamed from: a */
    public static final void m9121a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2035602679);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2035602679, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.Kyc2ndLineDtacPreview (WaitingScreen.kt:140)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableSingletons$WaitingScreenKt.INSTANCE.m75286getLambda1$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new WaitingScreenKt$Kyc2ndLineDtacPreview$1(i));
        }
    }

    /* renamed from: b */
    public static final void m9120b(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(82379974);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(82379974, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.Kyc2ndLineOldDtacPreview (WaitingScreen.kt:176)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableSingletons$WaitingScreenKt.INSTANCE.m75288getLambda3$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new WaitingScreenKt$Kyc2ndLineOldDtacPreview$1(i));
        }
    }

    /* renamed from: c */
    public static final void m9119c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318603291);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-318603291, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.Kyc2ndLineTruePreview (WaitingScreen.kt:158)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableSingletons$WaitingScreenKt.INSTANCE.m75287getLambda2$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new WaitingScreenKt$Kyc2ndLineTruePreview$1(i));
        }
    }

    /* renamed from: d */
    public static final LottieComposition m9118d(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }
}