package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
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
import th.p047co.dtac.android.dtacone.extension.format.IdCardNumberExtKt;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.LabelValue;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen.component.LabelValuesListKt;
import th.p047co.dtac.android.dtacone.widget.compose.common.OneButtonKt;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"", "sessionId", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "formResult", "Lkotlin/Function0;", "", "onNextClick", "OcrResultScreen", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOcrResultScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcrResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/OcrResultScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,87:1\n72#2,6:88\n78#2:122\n82#2:128\n78#3,11:94\n91#3:127\n456#4,8:105\n464#4,3:119\n467#4,3:124\n4144#5,6:113\n154#6:123\n*S KotlinDebug\n*F\n+ 1 OcrResultScreen.kt\nth/co/dtac/android/dtacone/view/compose/upPassDemo/screen/OcrResultScreenKt\n*L\n48#1:88,6\n48#1:122\n48#1:128\n48#1:94,11\n48#1:127\n48#1:105,8\n48#1:119,3\n48#1:124,3\n48#1:113,6\n58#1:123\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.OcrResultScreenKt */
/* loaded from: classes10.dex */
public final class OcrResultScreenKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OcrResultScreen(@NotNull String sessionId, @NotNull UpPassFormResult formResult, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i, int i2) {
        OcrResultScreenKt$OcrResultScreen$1 ocrResultScreenKt$OcrResultScreen$1;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Composer composer2;
        String str9;
        String str10;
        String str11;
        String docNumber;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(formResult, "formResult");
        Composer startRestartGroup = composer.startRestartGroup(1746523005);
        if ((i2 & 4) != 0) {
            ocrResultScreenKt$OcrResultScreen$1 = OcrResultScreenKt$OcrResultScreen$1.INSTANCE;
        } else {
            ocrResultScreenKt$OcrResultScreen$1 = function0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1746523005, i, -1, "th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.OcrResultScreen (OcrResultScreen.kt:24)");
        }
        IdDocumentResult idDocument = formResult.getIdDocument();
        LabelValue labelValue = new LabelValue("Session ID", sessionId);
        LabelValue labelValue2 = new LabelValue(HelpFormatter.DEFAULT_OPT_PREFIX, null, 2, null);
        if (formResult.isCardReader()) {
            str = "ใช่";
        } else {
            str = "ไม่ใช่";
        }
        LabelValue labelValue3 = new LabelValue("ใช้เครื่องอ่านบัตร", str);
        LabelValue labelValue4 = new LabelValue(HelpFormatter.DEFAULT_OPT_PREFIX, null, 2, null);
        if (idDocument != null) {
            str2 = idDocument.getDocType();
        } else {
            str2 = null;
        }
        LabelValue labelValue5 = new LabelValue("ประเภทเอกสาร", str2);
        if (idDocument != null && (docNumber = idDocument.getDocNumber()) != null) {
            str3 = IdCardNumberExtKt.toThaiIdCardSpaceFormat(docNumber);
        } else {
            str3 = null;
        }
        LabelValue labelValue6 = new LabelValue("เลขประจำตัวประชาชน", str3);
        if (idDocument != null) {
            str4 = idDocument.getFirstName();
        } else {
            str4 = null;
        }
        LabelValue labelValue7 = new LabelValue("ชื่อ", str4);
        if (idDocument != null) {
            str5 = idDocument.getLastName();
        } else {
            str5 = null;
        }
        LabelValue labelValue8 = new LabelValue("นามสกุล", str5);
        if (idDocument != null) {
            str6 = idDocument.getBirthday();
        } else {
            str6 = null;
        }
        LabelValue labelValue9 = new LabelValue("วันเกิด", str6);
        if (idDocument != null) {
            str7 = idDocument.getExpire();
        } else {
            str7 = null;
        }
        LabelValue labelValue10 = new LabelValue("วันหมดอายุ", str7);
        if (idDocument != null) {
            str8 = idDocument.getAddress();
        } else {
            str8 = null;
        }
        LabelValue labelValue11 = new LabelValue("ที่อยู่", str8);
        if (idDocument != null) {
            str9 = idDocument.getGender();
            composer2 = startRestartGroup;
        } else {
            composer2 = startRestartGroup;
            str9 = null;
        }
        LabelValue labelValue12 = new LabelValue("เพศ", str9);
        LabelValue labelValue13 = new LabelValue(HelpFormatter.DEFAULT_OPT_PREFIX, null, 2, null);
        if (idDocument != null) {
            str10 = idDocument.getDopaStatus();
        } else {
            str10 = null;
        }
        LabelValue labelValue14 = new LabelValue("DOPA Status", str10);
        if (idDocument != null) {
            str11 = idDocument.getDopaFlag();
        } else {
            str11 = null;
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LabelValue[]{labelValue, labelValue2, labelValue3, labelValue4, labelValue5, labelValue6, labelValue7, labelValue8, labelValue9, labelValue10, labelValue11, labelValue12, labelValue13, labelValue14, new LabelValue("DOPA Flag", str11)});
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
        composer3.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
        if (!(composer3.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor);
        } else {
            composer3.useNode();
        }
        Composer m71577constructorimpl = Updater.m71577constructorimpl(composer3);
        Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        LabelValuesListKt.LabelValuesList(ColumnScopeInstance.INSTANCE, listOf, composer3, 6);
        OneButtonKt.OneButton(ocrResultScreenKt$OcrResultScreen$1, StringResources_androidKt.stringResource(R.string.next, composer3, 0), PaddingKt.m69713padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3623Dp.m73842constructorimpl(16)), composer3, ((i >> 6) & 14) | 384, 0);
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OcrResultScreenKt$OcrResultScreen$3(sessionId, formResult, ocrResultScreenKt$OcrResultScreen$1, i, i2));
        }
    }

    /* renamed from: a */
    public static final void m9083a(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-453321067);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453321067, i, -1, "th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.OcrResultPreview (OcrResultScreen.kt:64)");
            }
            ThemeKt.OneTheme(CompanyThemes.ONE_DTAC, false, ComposableSingletons$OcrResultScreenKt.INSTANCE.m75293getLambda1$app_prodRelease(), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new OcrResultScreenKt$OcrResultPreview$1(i));
        }
    }
}