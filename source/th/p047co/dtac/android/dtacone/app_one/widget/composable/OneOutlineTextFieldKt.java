package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.R;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0091\u0001\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/painter/Painter;", "icon", "iconModifier", "placeholder", "", "isClearable", "isEnable", "isReadOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "OneOutlineTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/runtime/Composer;III)V", OperatorName.CURVE_TO, "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneOutlineTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOutlineTextField.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextFieldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,187:1\n154#2:188\n154#2:196\n154#2:211\n154#2:212\n25#3:189\n36#3:197\n25#3:204\n456#3,8:229\n464#3,3:243\n36#3:247\n36#3:254\n36#3:261\n467#3,3:268\n1097#4,6:190\n1097#4,6:198\n1097#4,6:205\n1097#4,6:248\n1097#4,6:255\n1097#4,6:262\n73#5,5:213\n78#5:246\n82#5:272\n78#6,11:218\n91#6:271\n4144#7,6:237\n81#8:273\n107#8,2:274\n81#8:276\n107#8,2:277\n*S KotlinDebug\n*F\n+ 1 OneOutlineTextField.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/OneOutlineTextFieldKt\n*L\n54#1:188\n149#1:196\n160#1:211\n161#1:212\n63#1:189\n150#1:197\n158#1:204\n159#1:229,8\n159#1:243,3\n165#1:247\n172#1:254\n180#1:261\n159#1:268,3\n63#1:190,6\n150#1:198,6\n158#1:205,6\n165#1:248,6\n172#1:255,6\n180#1:262,6\n159#1:213,5\n159#1:246\n159#1:272\n159#1:218,11\n159#1:271\n159#1:237,6\n63#1:273\n63#1:274,2\n158#1:276\n158#1:277,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt */
/* loaded from: classes7.dex */
public final class OneOutlineTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OneOutlineTextField(@org.jetbrains.annotations.NotNull java.lang.String r80, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r82, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.painter.Painter r83, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r84, @org.jetbrains.annotations.Nullable java.lang.String r85, boolean r86, boolean r87, boolean r88, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r89, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r90, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.VisualTransformation r91, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1019
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldKt.OneOutlineTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, androidx.compose.ui.Modifier, java.lang.String, boolean, boolean, boolean, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final FocusState m19823a(MutableState mutableState) {
        return (FocusState) mutableState.getValue();
    }

    /* renamed from: b */
    public static final void m19822b(MutableState mutableState, FocusState focusState) {
        mutableState.setValue(focusState);
    }

    /* renamed from: c */
    public static final void m19821c(Composer composer, int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1157667026);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1157667026, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.OneOutlineTextFieldPreview (OneOutlineTextField.kt:156)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = AbstractC19508dK1.m31891g("123", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 16;
            float m73658constructorimpl = C3641Dp.m73658constructorimpl(f);
            Alignment.Companion companion2 = Alignment.Companion;
            Arrangement.Vertical m69480spacedByD5KLDUw = arrangement.m69480spacedByD5KLDUw(m73658constructorimpl, companion2.getTop());
            Modifier m69529padding3ABfNKs = PaddingKt.m69529padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), C3641Dp.m73658constructorimpl(f));
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m69480spacedByD5KLDUw, companion2.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m69529padding3ABfNKs);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String m19820d = m19820d(mutableState);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_id_card_edit_text, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            OneOutlineTextField(m19820d, (Function1) rememberedValue2, null, painterResource, null, "Placeholder", true, false, false, null, null, null, startRestartGroup, 1773568, 0, 3988);
            String m19820d2 = m19820d(mutableState);
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_id_card_edit_text, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$2$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            OneOutlineTextField(m19820d2, (Function1) rememberedValue3, null, painterResource2, null, "Placeholder", true, false, true, null, null, null, startRestartGroup, 102436864, 0, 3732);
            String m19820d3 = m19820d(mutableState);
            Painter painterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_id_card_edit_text, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed(mutableState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new OneOutlineTextFieldKt$OneOutlineTextFieldPreview$1$3$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            OneOutlineTextField(m19820d3, (Function1) rememberedValue4, null, painterResource3, null, "Placeholder", true, false, false, null, null, null, startRestartGroup, 14356480, 0, 3860);
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
            endRestartGroup.updateScope(new OneOutlineTextFieldKt$OneOutlineTextFieldPreview$2(i));
        }
    }

    /* renamed from: d */
    public static final String m19820d(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* renamed from: e */
    public static final void m19819e(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
