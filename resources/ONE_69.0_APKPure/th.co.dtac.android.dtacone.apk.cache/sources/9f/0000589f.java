package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.CustomAccessibilityAction;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\"\u0010#\u001af\u0010*\u001a\u00020\u000b2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010-\u001a)\u00105\u001a\u00020\u000b*\u00020.2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a5\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0001\u001a\u00020(2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0002¢\u0006\u0004\b=\u0010>\"\u001a\u0010C\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bA\u0010B\"\u0014\u0010D\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010@\"\u0014\u0010E\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@\"\u0017\u0010H\u001a\u00020F8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, m29142d2 = {"Landroidx/compose/material3/DateRangePickerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", MessageBundle.TITLE_ENTRY, "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDateRangePickerState-pMw4iz8", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/StateData;", "stateData", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/ParameterName;", "name", "dateInMillis", "onDateSelected", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", OperatorName.CURVE_TO, "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "e", "(Landroidx/compose/material3/StateData;J)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "d", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "Landroidx/compose/ui/unit/Dp;", "F", "HeaderHeightOffset", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,809:1\n25#2:810\n36#2:818\n460#2,13:844\n473#2,3:858\n36#2:863\n50#2:870\n49#2:871\n1114#3,6:811\n1114#3,6:819\n1114#3,6:864\n1114#3,6:872\n58#4:817\n74#5,6:825\n80#5:857\n84#5:862\n75#6:831\n76#6,11:833\n89#6:861\n76#7:832\n154#8:878\n154#8:879\n154#8:880\n154#8:881\n154#8:882\n154#8:883\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:810\n490#1:818\n493#1:844,13\n493#1:858,3\n521#1:863\n585#1:870\n585#1:871\n88#1:811,6\n490#1:819,6\n521#1:864,6\n585#1:872,6\n128#1:817\n493#1:825,6\n493#1:857\n493#1:862\n493#1:831\n493#1:833,11\n493#1:861\n493#1:832\n613#1:878\n614#1:879\n615#1:880\n801#1:881\n803#1:882\n808#1:883\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangePickerKt {

    /* renamed from: b */
    public static final PaddingValues f25821b;

    /* renamed from: c */
    public static final PaddingValues f25822c;

    /* renamed from: a */
    public static final PaddingValues f25820a = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(24), C3623Dp.m73842constructorimpl(20), 0.0f, C3623Dp.m73842constructorimpl(8), 4, null);

    /* renamed from: d */
    public static final float f25823d = C3623Dp.m73842constructorimpl(60);

    static {
        float f = 64;
        float f2 = 12;
        f25821b = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(f), 0.0f, C3623Dp.m73842constructorimpl(f2), 0.0f, 10, null);
        f25822c = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(f), 0.0f, C3623Dp.m73842constructorimpl(f2), C3623Dp.m73842constructorimpl(f2), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DateRangePicker(@org.jetbrains.annotations.NotNull androidx.compose.material3.DateRangePickerState r56, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r57, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerFormatter r58, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r59, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, boolean r62, @org.jetbrains.annotations.Nullable androidx.compose.material3.DatePickerColors r63, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m60610a(StateData stateData, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1003501610);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(stateData)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003501610, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(stateData);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Function1 function12 = (Function1) rememberedValue;
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m69715paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, stateData.getCalendarModel(), startRestartGroup, (i2 >> 9) & 14);
            int i7 = i2 << 6;
            m60608c(function12, stateData, rememberLazyListState, datePickerFormatter, function1, datePickerColors, startRestartGroup, ((i2 << 3) & 112) | (i7 & 7168) | (57344 & i7) | (i7 & 458752));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$DateRangePickerContent$2(stateData, datePickerFormatter, function1, datePickerColors, i));
        }
    }

    /* renamed from: b */
    public static final void m60609b(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(984055784);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(dateRangePickerState)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984055784, i7, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int m70542getDisplayModejFl4v0 = dateRangePickerState.m70542getDisplayModejFl4v0();
            SpringSpec spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            CrossfadeKt.Crossfade(DisplayMode.m70544boximpl(m70542getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.Companion, false, DateRangePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null), spring$default, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1354418636, true, new DateRangePickerKt$SwitchableDateEntryContent$2(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i7)), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$SwitchableDateEntryContent$3(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i));
        }
    }

    /* renamed from: c */
    public static final void m60608c(Function1 function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1 function12, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-837198453);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(stateData)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(lazyListState)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(function12)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(datePickerColors)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837198453, i9, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)");
            }
            CalendarDate today = stateData.getCalendarModel().getToday();
            IntRange yearRange = stateData.getYearRange();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(yearRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 56792252, true, new DateRangePickerKt$VerticalMonthsList$1(lazyListState, i9, stateData, (CalendarMonth) rememberedValue, datePickerFormatter, datePickerColors, function1, today, function12)), startRestartGroup, 48);
            int i10 = (i9 >> 6) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed2 = startRestartGroup.changed(lazyListState) | startRestartGroup.changed(stateData);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, stateData, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2) rememberedValue2, startRestartGroup, i10 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateRangePickerKt$VerticalMonthsList$3(function1, stateData, lazyListState, datePickerFormatter, function12, datePickerColors, i));
        }
    }

    /* renamed from: d */
    public static final List m60607d(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, coroutineScope)), new CustomAccessibilityAction(str2, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, coroutineScope))});
    }

    /* renamed from: drawRangeBackground-mxwnekA  reason: not valid java name */
    public static final void m70538drawRangeBackgroundmxwnekA(@NotNull ContentDrawScope drawRangeBackground, @NotNull SelectedRangeInfo selectedRangeInfo, long j) {
        float f;
        boolean z;
        float m71755getWidthimpl;
        float m71755getWidthimpl2;
        float f2;
        Intrinsics.checkNotNullParameter(drawRangeBackground, "$this$drawRangeBackground");
        Intrinsics.checkNotNullParameter(selectedRangeInfo, "selectedRangeInfo");
        float mo69622toPx0680j_4 = drawRangeBackground.mo69622toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo69622toPx0680j_42 = drawRangeBackground.mo69622toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float mo69622toPx0680j_43 = drawRangeBackground.mo69622toPx0680j_4(DatePickerModalTokens.INSTANCE.m71110getDateStateLayerHeightD9Ej5fM());
        float f3 = 2;
        float f4 = (mo69622toPx0680j_42 - mo69622toPx0680j_43) / f3;
        float f5 = 7;
        float m71755getWidthimpl3 = (Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc()) - (f5 * mo69622toPx0680j_4)) / f5;
        long m73969unboximpl = selectedRangeInfo.getGridCoordinates().getFirst().m73969unboximpl();
        int m73952component1impl = IntOffset.m73952component1impl(m73969unboximpl);
        int m73953component2impl = IntOffset.m73953component2impl(m73969unboximpl);
        long m73969unboximpl2 = selectedRangeInfo.getGridCoordinates().getSecond().m73969unboximpl();
        int m73952component1impl2 = IntOffset.m73952component1impl(m73969unboximpl2);
        int m73953component2impl2 = IntOffset.m73953component2impl(m73969unboximpl2);
        float f6 = mo69622toPx0680j_4 + m71755getWidthimpl3;
        float f7 = m73952component1impl * f6;
        if (selectedRangeInfo.getFirstIsSelectionStart()) {
            f = mo69622toPx0680j_4 / f3;
        } else {
            f = 0.0f;
        }
        float f8 = m71755getWidthimpl3 / f3;
        float f9 = f7 + f + f8;
        float f10 = (m73953component2impl * mo69622toPx0680j_42) + f4;
        float f11 = m73952component1impl2 * f6;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            mo69622toPx0680j_4 /= f3;
        }
        float f12 = f11 + mo69622toPx0680j_4 + f8;
        float f13 = (m73953component2impl2 * mo69622toPx0680j_42) + f4;
        if (drawRangeBackground.getLayoutDirection() == LayoutDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f9 = Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc()) - f9;
            f12 = Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc()) - f12;
        }
        float f14 = f12;
        long Offset = OffsetKt.Offset(f9, f10);
        if (m73953component2impl == m73953component2impl2) {
            m71755getWidthimpl = f14 - f9;
        } else if (z) {
            m71755getWidthimpl = -f9;
        } else {
            m71755getWidthimpl = Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc()) - f9;
        }
        AbstractC12264mK.m26705K(drawRangeBackground, j, Offset, SizeKt.Size(m71755getWidthimpl, mo69622toPx0680j_43), 0.0f, null, null, 0, 120, null);
        if (m73953component2impl != m73953component2impl2) {
            for (int i = (m73953component2impl2 - m73953component2impl) - 1; i > 0; i--) {
                AbstractC12264mK.m26705K(drawRangeBackground, j, OffsetKt.Offset(0.0f, f10 + (i * mo69622toPx0680j_42)), SizeKt.Size(Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc()), mo69622toPx0680j_43), 0.0f, null, null, 0, 120, null);
            }
            if (drawRangeBackground.getLayoutDirection() == LayoutDirection.Ltr) {
                f2 = f13;
                m71755getWidthimpl2 = 0.0f;
            } else {
                m71755getWidthimpl2 = Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc());
                f2 = f13;
            }
            long Offset2 = OffsetKt.Offset(m71755getWidthimpl2, f2);
            if (z) {
                f14 -= Size.m71755getWidthimpl(drawRangeBackground.mo72328getSizeNHjbRc());
            }
            AbstractC12264mK.m26705K(drawRangeBackground, j, Offset2, SizeKt.Size(f14, mo69622toPx0680j_43), 0.0f, null, null, 0, 120, null);
        }
    }

    /* renamed from: e */
    public static final void m60606e(StateData stateData, long j) {
        CalendarDate canonicalDate = stateData.getCalendarModel().getCanonicalDate(j);
        CalendarDate value = stateData.getSelectedStartDate().getValue();
        CalendarDate value2 = stateData.getSelectedEndDate().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && canonicalDate.compareTo(value) < 0))) {
            stateData.getSelectedStartDate().setValue(canonicalDate);
            stateData.getSelectedEndDate().setValue(null);
        } else if (value != null && canonicalDate.compareTo(value) >= 0) {
            stateData.getSelectedEndDate().setValue(canonicalDate);
        }
    }

    @NotNull
    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return f25820a;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* renamed from: rememberDateRangePickerState-pMw4iz8  reason: not valid java name */
    public static final DateRangePickerState m70539rememberDateRangePickerStatepMw4iz8(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable IntRange intRange, int i, @Nullable Composer composer, int i2, int i3) {
        Long l4;
        Long l5;
        Long l6;
        IntRange intRange2;
        int i4;
        composer.startReplaceableGroup(501019096);
        if ((i3 & 1) != 0) {
            l4 = null;
        } else {
            l4 = l;
        }
        if ((i3 & 2) != 0) {
            l5 = null;
        } else {
            l5 = l2;
        }
        if ((i3 & 4) != 0) {
            l6 = l4;
        } else {
            l6 = l3;
        }
        if ((i3 & 8) != 0) {
            intRange2 = DatePickerDefaults.INSTANCE.getYearRange();
        } else {
            intRange2 = intRange;
        }
        if ((i3 & 16) != 0) {
            i4 = DisplayMode.Companion.m70552getPickerjFl4v0();
        } else {
            i4 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501019096, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.m71590rememberSaveable(new Object[0], DateRangePickerState.Companion.Saver(), (String) null, (Function0<? extends Object>) new DateRangePickerKt$rememberDateRangePickerState$1(l4, l5, l6, intRange2, i4), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerState;
    }
}