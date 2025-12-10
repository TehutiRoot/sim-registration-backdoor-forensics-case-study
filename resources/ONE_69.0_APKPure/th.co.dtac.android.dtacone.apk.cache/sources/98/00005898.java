package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.DisplayMode;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJp\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m29142d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/DateRangePickerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/Modifier;", "modifier", "", "DateRangePickerTitle", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "DateRangePickerHeadline", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "startDateText", "endDateText", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "startDatePlaceholder", "endDatePlaceholder", "datesDelimiter", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,809:1\n50#2:810\n49#2:811\n460#2,13:834\n473#2,3:848\n1114#3,6:812\n154#4:818\n79#5,2:819\n81#5:847\n85#5:852\n75#6:821\n76#6,11:823\n89#6:851\n76#7:822\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n419#1:810\n419#1:811\n418#1:834,13\n418#1:848,3\n419#1:812,6\n424#1:818\n418#1:819,2\n418#1:847\n418#1:852\n418#1:821\n418#1:823,11\n418#1:851\n418#1:822\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DateRangePickerHeadline(@org.jetbrains.annotations.NotNull androidx.compose.material3.DateRangePickerState r18, @org.jetbrains.annotations.NotNull androidx.compose.material3.DatePickerFormatter r19, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r20, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline(androidx.compose.material3.DateRangePickerState, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DateRangePickerTitle(@org.jetbrains.annotations.NotNull androidx.compose.material3.DateRangePickerState r30, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r31, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public final void m60611a(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-861159957);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(dateRangePickerState)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(datePickerFormatter)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(str)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(str2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changedInstance(function23)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((23967451 & i11) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861159957, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData stateData$material3_release = dateRangePickerState.getStateData$material3_release();
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            String formatDate$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, false, 8, null);
            String formatDate$material3_release$default2 = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, false, 8, null);
            String formatDate$material3_release = datePickerFormatter.formatDate$material3_release(stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, true);
            startRestartGroup.startReplaceableGroup(-1212634278);
            String str3 = "";
            if (formatDate$material3_release == null) {
                int m70550unboximpl = stateData$material3_release.getDisplayMode().getValue().m70550unboximpl();
                DisplayMode.Companion companion = DisplayMode.Companion;
                if (DisplayMode.m70547equalsimpl0(m70550unboximpl, companion.m70552getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096411);
                    formatDate$material3_release = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70758getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m70547equalsimpl0(m70550unboximpl, companion.m70551getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096500);
                    formatDate$material3_release = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70753getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544548443);
                    startRestartGroup.endReplaceableGroup();
                    formatDate$material3_release = "";
                }
            }
            startRestartGroup.endReplaceableGroup();
            String formatDate$material3_release2 = datePickerFormatter.formatDate$material3_release(stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, true);
            startRestartGroup.startReplaceableGroup(-1212633768);
            if (formatDate$material3_release2 == null) {
                int m70550unboximpl2 = stateData$material3_release.getDisplayMode().getValue().m70550unboximpl();
                DisplayMode.Companion companion2 = DisplayMode.Companion;
                if (DisplayMode.m70547equalsimpl0(m70550unboximpl2, companion2.m70552getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096919);
                    str3 = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70758getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m70547equalsimpl0(m70550unboximpl2, companion2.m70551getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922097008);
                    str3 = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70753getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544532695);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                str3 = formatDate$material3_release2;
            }
            startRestartGroup.endReplaceableGroup();
            String str4 = str + ": " + formatDate$material3_release;
            String str5 = str2 + ": " + str3;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(str4) | startRestartGroup.changed(str5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerDefaults$DateRangePickerHeadline$4$1$1(str4, str5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical m69662spacedBy0680j_4 = Arrangement.INSTANCE.m69662spacedBy0680j_4(C3623Dp.m73842constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69662spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
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
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion3.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (formatDate$material3_release$default != null) {
                startRestartGroup.startReplaceableGroup(990390609);
                composer2 = startRestartGroup;
                TextKt.m70882Text4IGK_g(formatDate$material3_release$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(990390686);
                function2.invoke(composer2, Integer.valueOf((i11 >> 15) & 14));
                composer2.endReplaceableGroup();
            }
            function23.invoke(composer2, Integer.valueOf((i11 >> 21) & 14));
            if (formatDate$material3_release$default2 != null) {
                composer2.startReplaceableGroup(990390828);
                TextKt.m70882Text4IGK_g(formatDate$material3_release$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390903);
                function22.invoke(composer2, Integer.valueOf((i11 >> 18) & 14));
                composer2.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$5(this, dateRangePickerState, datePickerFormatter, modifier, str, str2, function2, function22, function23, i));
        }
    }
}