package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.InputIdentifier;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "", "DateRangeInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "TextFieldSpacing", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n460#2,13:137\n36#2:151\n36#2:158\n473#2,3:165\n1114#3,6:105\n1114#3,6:113\n1114#3,6:152\n1114#3,6:159\n76#4,5:119\n81#4:150\n85#4:169\n75#5:124\n76#5,11:126\n89#5:168\n76#6:125\n154#7:170\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n39#1:104\n46#1:111\n46#1:112\n58#1:137,13\n75#1:151\n93#1:158\n58#1:165,3\n39#1:105,6\n46#1:113,6\n75#1:152,6\n93#1:159,6\n58#1:119,5\n58#1:150\n58#1:169\n58#1:124\n58#1:126,11\n58#1:168\n58#1:125\n102#1:170\n*E\n"})
/* loaded from: classes2.dex */
public final class DateRangeInputKt {

    /* renamed from: a */
    public static final float f25731a = C3641Dp.m73658constructorimpl(8);

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangeInputContent(@NotNull StateData stateData, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        DateInputFormat dateInputFormat;
        Locale locale;
        Composer composer2;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer startRestartGroup = composer.startRestartGroup(-1163802470);
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
            if (startRestartGroup.changed(dateFormatter)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(dateValidator)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = i2;
        if ((i7 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163802470, i7, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)");
            }
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = stateData.getCalendarModel().getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            Strings.Companion companion = Strings.Companion;
            String m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(companion.m70565getDateInputInvalidForPatternadMyvUU(), startRestartGroup, 6);
            String m70619getStringNWtq282 = Strings_androidKt.m70619getStringNWtq28(companion.m70567getDateInputInvalidYearRangeadMyvUU(), startRestartGroup, 6);
            String m70619getStringNWtq283 = Strings_androidKt.m70619getStringNWtq28(companion.m70566getDateInputInvalidNotAllowedadMyvUU(), startRestartGroup, 6);
            String m70619getStringNWtq284 = Strings_androidKt.m70619getStringNWtq28(companion.m70586getDateRangeInputInvalidRangeInputadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | startRestartGroup.changed(dateFormatter);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2 && rememberedValue2 != Composer.Companion.getEmpty()) {
                dateInputFormat = dateInputFormat2;
                locale = defaultLocale;
                i3 = 6;
            } else {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                locale = defaultLocale;
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, dateFormatter, dateValidator, m70619getStringNWtq28, m70619getStringNWtq282, m70619getStringNWtq283, m70619getStringNWtq284);
                startRestartGroup.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            }
            startRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier padding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            Arrangement.HorizontalOrVertical m69478spacedBy0680j_4 = Arrangement.INSTANCE.m69478spacedBy0680j_4(f25731a);
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m69478spacedBy0680j_4, Alignment.Companion.getTop(), startRestartGroup, i3);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
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
            Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m70619getStringNWtq285 = Strings_androidKt.m70619getStringNWtq28(companion.m70592getDateRangePickerStartHeadlineadMyvUU(), startRestartGroup, i3);
            Modifier m68013a = AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 576559191, true, new DateRangeInputKt$DateRangeInputContent$1$1(m70619getStringNWtq285, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1726391478, true, new DateRangeInputKt$DateRangeInputContent$1$2(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed(stateData);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateRangeInputKt$DateRangeInputContent$1$3$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            InputIdentifier.Companion companion4 = InputIdentifier.Companion;
            int i8 = ((i7 << 9) & 7168) | 1075315120;
            composer2 = startRestartGroup;
            DateInputKt.m70334DateInputTextFieldzm97o8M(m68013a, composableLambda, composableLambda2, stateData, value, (Function1) rememberedValue3, companion4.m70443getStartDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale, startRestartGroup, i8);
            String m70619getStringNWtq286 = Strings_androidKt.m70619getStringNWtq28(companion.m70589getDateRangePickerEndHeadlineadMyvUU(), composer2, i3);
            Modifier m68013a2 = AbstractC17770Hy1.m68013a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -663502784, true, new DateRangeInputKt$DateRangeInputContent$1$4(m70619getStringNWtq286, upperCase));
            ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, 518729951, true, new DateRangeInputKt$DateRangeInputContent$1$5(upperCase));
            CalendarDate value2 = stateData.getSelectedEndDate().getValue();
            composer2.startReplaceableGroup(1157296644);
            boolean changed4 = composer2.changed(stateData);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new DateRangeInputKt$DateRangeInputContent$1$6$1(stateData);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            DateInputKt.m70334DateInputTextFieldzm97o8M(m68013a2, composableLambda3, composableLambda4, stateData, value2, (Function1) rememberedValue4, companion4.m70441getEndDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale, composer2, i8);
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
            endRestartGroup.updateScope(new DateRangeInputKt$DateRangeInputContent$2(stateData, dateFormatter, dateValidator, i));
        }
    }
}
