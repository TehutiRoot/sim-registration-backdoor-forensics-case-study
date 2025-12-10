package th.p047co.dtac.android.dtacone.view.compose.upPass.screen;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
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
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.extension.format.LocalDateTimeExt;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneButtonKt;
import th.p047co.dtac.android.dtacone.widget.compose.helper.IdCardNumberVisualTransformation;

@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\n\u001a\u0019\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010\n\u001a\u000f\u0010 \u001a\u00020\u0003H\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\"\u0010!\u001a\u000f\u0010#\u001a\u00020\u0003H\u0003¢\u0006\u0004\b#\u0010!\"\u0014\u0010%\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "customerInfo", "Lkotlin/Function0;", "", "onNext", "ReviewIdCardReaderScreen", "(Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "resId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILandroidx/compose/runtime/Composer;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;Landroidx/compose/runtime/Composer;I)V", "", "date", OperatorName.FILL_NON_ZERO, "(Ljava/lang/String;)Ljava/lang/String;", "value", "labelResId", "Lkotlin/Function1;", "onValueChange", "", "enabled", "Landroidx/compose/ui/Modifier;", "modifier", "trailingIconResId", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "UpPassFilledTextField", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Ljava/lang/Integer;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/runtime/Composer;II)V", "TextFieldLabel", "TextFieldIcon", "d", "(Landroidx/compose/runtime/Composer;I)V", "e", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "ocrResult", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReviewIdCardReaderScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewIdCardReaderScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/ReviewIdCardReaderScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n154#2:363\n154#2:364\n154#2:405\n154#2:406\n154#2:407\n154#2:408\n73#3,5:365\n78#3:398\n82#3:403\n78#4,11:370\n91#4:402\n456#5,8:381\n464#5,3:395\n467#5,3:399\n4144#6,6:389\n1#7:404\n*S KotlinDebug\n*F\n+ 1 ReviewIdCardReaderScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPass/screen/ReviewIdCardReaderScreenKt\n*L\n57#1:363\n61#1:364\n293#1:405\n296#1:406\n297#1:407\n311#1:408\n56#1:365,5\n56#1:398\n56#1:403\n56#1:370,11\n56#1:402\n56#1:381,8\n56#1:395,3\n56#1:399,3\n56#1:389,6\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardReaderScreenKt */
/* loaded from: classes10.dex */
public final class ReviewIdCardReaderScreenKt {

    /* renamed from: a */
    public static final IdDocumentResult f98625a = new IdDocumentResult("I", null, "1234567890123", "นาย", "John", "", "Doe", null, "1975-12-31", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, -382, 31, null);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ReviewIdCardReaderScreen(@NotNull IdDocumentResult customerInfo, @NotNull Function0<Unit> onNext, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Composer startRestartGroup = composer.startRestartGroup(-1652033641);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1652033641, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardReaderScreen (ReviewIdCardReaderScreen.kt:50)");
        }
        float f = 16;
        Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(f));
        Modifier.Companion companion = Modifier.Companion;
        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m69713padding3ABfNKs(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), Color.Companion.m71956getWhite0d7_KjU(), null, 2, null), C3623Dp.m73842constructorimpl(f)), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69662spacedBy0680j_4, Alignment.Companion.getStart(), startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(verticalScroll$default);
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
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        m9164a(customerInfo, startRestartGroup, 8);
        SpacerKt.Spacer(AbstractC1256Rt.m66581a(columnScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
        OneButtonKt.OneButtonOutlineRed(onNext, StringResources_androidKt.stringResource(R.string.up_pass_review_id_card_reader_next, startRestartGroup, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), startRestartGroup, ((i >> 3) & 14) | 384, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$ReviewIdCardReaderScreen$2(customerInfo, onNext, i));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldIcon(@DrawableRes int i, @Nullable Composer composer, int i2) {
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1634341457);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1634341457, i3, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.TextFieldIcon (ReviewIdCardReaderScreen.kt:306)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i3 & 14), (String) null, SizeKt.m69748size3ABfNKs(PaddingKt.m69713padding3ABfNKs(Modifier.Companion, C3623Dp.m73842constructorimpl(12)), C3623Dp.m73842constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$TextFieldIcon$1(i, i2));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldLabel(@StringRes int i, @Nullable Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1831942796);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1831942796, i3, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.TextFieldLabel (ReviewIdCardReaderScreen.kt:301)");
            }
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(i, startRestartGroup, i3 & 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$TextFieldLabel$1(i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void UpPassFilledTextField(@org.jetbrains.annotations.NotNull java.lang.String r112, @androidx.annotation.StringRes int r113, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r114, boolean r115, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r116, @androidx.annotation.DrawableRes @org.jetbrains.annotations.Nullable java.lang.Integer r117, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.VisualTransformation r118, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r119, int r120, int r121) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardReaderScreenKt.UpPassFilledTextField(java.lang.String, int, kotlin.jvm.functions.Function1, boolean, androidx.compose.ui.Modifier, java.lang.Integer, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m9164a(IdDocumentResult idDocumentResult, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-440575790);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-440575790, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.CustomerSection (ReviewIdCardReaderScreen.kt:98)");
        }
        m9163b(R.string.up_pass_review_id_card_reader_header, startRestartGroup, 0);
        String docNumber = idDocumentResult.getDocNumber();
        int i2 = R.string.up_pass_review_id_card_reader_id_card;
        IdCardNumberVisualTransformation idCardNumberVisualTransformation = new IdCardNumberVisualTransformation();
        Modifier.Companion companion = Modifier.Companion;
        UpPassFilledTextField(docNumber, i2, ReviewIdCardReaderScreenKt$CustomerSection$1.INSTANCE, false, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, idCardNumberVisualTransformation, startRestartGroup, 28032, 32);
        UpPassFilledTextField(idDocumentResult.getFirstName(), R.string.up_pass_review_id_card_reader_firstname, ReviewIdCardReaderScreenKt$CustomerSection$2.INSTANCE, false, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, startRestartGroup, 28032, 96);
        UpPassFilledTextField(idDocumentResult.getLastName(), R.string.up_pass_review_id_card_reader_lastname, ReviewIdCardReaderScreenKt$CustomerSection$3.INSTANCE, false, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, startRestartGroup, 28032, 96);
        String m9159f = m9159f(idDocumentResult.getBirthday());
        int i3 = R.string.up_pass_review_id_card_reader_birthday;
        int i4 = R.drawable.ic_calendar_black;
        UpPassFilledTextField(m9159f, i3, ReviewIdCardReaderScreenKt$CustomerSection$4.INSTANCE, false, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Integer.valueOf(i4), null, startRestartGroup, 28032, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$CustomerSection$5(idDocumentResult, i));
        }
    }

    public static final /* synthetic */ IdDocumentResult access$getOcrResult$p() {
        return f98625a;
    }

    /* renamed from: b */
    public static final void m9163b(int i, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1774136769);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(i)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1774136769, i3, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.HeaderText (ReviewIdCardReaderScreen.kt:89)");
            }
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g(StringResources_androidKt.stringResource(i, startRestartGroup, i3 & 14), (Modifier) null, ColorResources_androidKt.colorResource(R.color.greyishBrown, startRestartGroup, 0), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge(), composer2, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$HeaderText$1(i, i2));
        }
    }

    /* renamed from: c */
    public static final void m9162c(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-719084365);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-719084365, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardDtacOnePreview (ReviewIdCardReaderScreen.kt:344)");
            }
            ThemeKt.OneTheme(CompanyThemes.OLD_DTAC, false, ComposableSingletons$ReviewIdCardReaderScreenKt.INSTANCE.m75282getLambda3$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$ReviewIdCardDtacOnePreview$1(i));
        }
    }

    /* renamed from: d */
    public static final void m9161d(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1980229481);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980229481, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardOneDtacPreview (ReviewIdCardReaderScreen.kt:326)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableSingletons$ReviewIdCardReaderScreenKt.INSTANCE.m75280getLambda1$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$ReviewIdCardOneDtacPreview$1(i));
        }
    }

    /* renamed from: e */
    public static final void m9160e(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-263230093);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263230093, i, -1, "th.co.dtac.android.dtacone.view.compose.upPass.screen.ReviewIdCardOneTruePreview (ReviewIdCardReaderScreen.kt:335)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_TRUE, false, ComposableSingletons$ReviewIdCardReaderScreenKt.INSTANCE.m75281getLambda2$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReviewIdCardReaderScreenKt$ReviewIdCardOneTruePreview$1(i));
        }
    }

    /* renamed from: f */
    public static final String m9159f(String str) {
        if (str != null && str.length() > 0) {
            Calendar calendar = Calendar.getInstance();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            calendar.setTime(DateFormatExtKt.toDate(str, "yyyy-MM-dd", US));
            int i = calendar.get(5);
            int i2 = calendar.get(2);
            int i3 = calendar.get(1);
            String str2 = LocalDateTimeExt.Companion.getFullMonthThList()[i2];
            return i + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + str2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + i3;
        }
        return "";
    }
}