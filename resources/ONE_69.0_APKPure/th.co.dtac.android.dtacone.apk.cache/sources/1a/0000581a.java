package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u008f\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0017\u0010(\u001a\u00020%8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m29142d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "", "DateInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "Landroidx/compose/material3/CalendarDate;", "initialDate", "onDateChanged", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Landroidx/compose/material3/DateInputValidator;", "dateInputValidator", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Ljava/util/Locale;", "locale", "DateInputTextField-zm97o8M", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/StateData;Landroidx/compose/material3/CalendarDate;Lkotlin/jvm/functions/Function1;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "Landroidx/compose/foundation/layout/PaddingValues;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextFieldPadding", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "InputTextNonErroneousBottomPadding", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,358:1\n36#2:359\n50#2:366\n49#2:367\n36#2:374\n36#2:382\n1114#3,6:360\n1114#3,6:368\n1114#3,6:375\n1114#3,6:383\n154#4:381\n154#4:392\n154#4:393\n154#4:394\n154#4:395\n76#5:389\n102#5,2:390\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt\n*L\n56#1:359\n62#1:366\n62#1:367\n88#1:374\n167#1:382\n56#1:360,6\n62#1:368,6\n88#1:375,6\n167#1:383,6\n162#1:381\n350#1:392\n351#1:393\n352#1:394\n357#1:395\n111#1:389\n111#1:390,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DateInputKt {

    /* renamed from: a */
    public static final PaddingValues f25771a;

    /* renamed from: b */
    public static final float f25772b = C3623Dp.m73842constructorimpl(16);

    static {
        float f = 24;
        f25771a = PaddingKt.m69710PaddingValuesa9UjIt4$default(C3623Dp.m73842constructorimpl(f), C3623Dp.m73842constructorimpl(10), C3623Dp.m73842constructorimpl(f), 0.0f, 8, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateInputContent(@NotNull StateData stateData, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        DateInputFormat dateInputFormat;
        Composer composer2;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer startRestartGroup = composer.startRestartGroup(814303288);
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
                ComposerKt.traceEventStart(814303288, i7, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:48)");
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
            String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(companion.m70749getDateInputInvalidForPatternadMyvUU(), startRestartGroup, 6);
            String m70803getStringNWtq282 = Strings_androidKt.m70803getStringNWtq28(companion.m70751getDateInputInvalidYearRangeadMyvUU(), startRestartGroup, 6);
            String m70803getStringNWtq283 = Strings_androidKt.m70803getStringNWtq28(companion.m70750getDateInputInvalidNotAllowedadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | startRestartGroup.changed(dateFormatter);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2 && rememberedValue2 != Composer.Companion.getEmpty()) {
                dateInputFormat = dateInputFormat2;
                i3 = 6;
            } else {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, dateFormatter, dateValidator, m70803getStringNWtq28, m70803getStringNWtq282, m70803getStringNWtq283, "");
                startRestartGroup.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            }
            startRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m70803getStringNWtq284 = Strings_androidKt.m70803getStringNWtq28(companion.m70752getDateInputLabeladMyvUU(), startRestartGroup, i3);
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), f25771a);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -438341159, true, new DateInputKt$DateInputContent$1(m70803getStringNWtq284, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1914447672, true, new DateInputKt$DateInputContent$2(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed(stateData);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateInputKt$DateInputContent$3$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            m70518DateInputTextFieldzm97o8M(padding, composableLambda, composableLambda2, stateData, value, (Function1) rememberedValue3, InputIdentifier.Companion.m70626getSingleDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, defaultLocale, startRestartGroup, ((i7 << 9) & 7168) | 1075315126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateInputKt$DateInputContent$4(stateData, dateFormatter, dateValidator, i));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_]]")
    /* renamed from: DateInputTextField-zm97o8M  reason: not valid java name */
    public static final void m70518DateInputTextFieldzm97o8M(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @NotNull StateData stateData, @Nullable CalendarDate calendarDate, @NotNull Function1<? super CalendarDate, Unit> onDateChanged, int i, @NotNull DateInputValidator dateInputValidator, @NotNull DateInputFormat dateInputFormat, @NotNull Locale locale, @Nullable Composer composer, int i2) {
        float f;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(onDateChanged, "onDateChanged");
        Intrinsics.checkNotNullParameter(dateInputValidator, "dateInputValidator");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Composer startRestartGroup = composer.startRestartGroup(626552973);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626552973, i2, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m71590rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) DateInputKt$DateInputTextField$errorText$1.INSTANCE, startRestartGroup, 3080, 6);
        MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.Companion.getSaver(), (String) null, (Function0) new DateInputKt$DateInputTextField$text$2(stateData, calendarDate, dateInputFormat, locale), startRestartGroup, 72, 4);
        TextFieldValue m60626a = m60626a(rememberSaveable);
        DateInputKt$DateInputTextField$1 dateInputKt$DateInputTextField$1 = new DateInputKt$DateInputTextField$1(dateInputFormat, mutableState, onDateChanged, stateData, dateInputValidator, i, locale, rememberSaveable);
        if (!AbstractC19741eO1.isBlank((CharSequence) mutableState.getValue())) {
            f = C3623Dp.m73842constructorimpl(0);
        } else {
            f = f25772b;
        }
        Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f, 7, null);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(mutableState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateInputKt$DateInputTextField$2$1(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        OutlinedTextFieldKt.OutlinedTextField(m60626a, (Function1<? super TextFieldValue, Unit>) dateInputKt$DateInputTextField$1, SemanticsModifierKt.semantics$default(m69717paddingqDBjuR0$default, false, (Function1) rememberedValue, 1, null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 785795078, true, new DateInputKt$DateInputTextField$3(mutableState)), !AbstractC19741eO1.isBlank((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, false, KeyboardType.Companion.m73598getNumberPjHm6EE(), ImeAction.Companion.m73550getDoneeUduSuo(), 1, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i2 << 15) & 33030144, 12779904, 0, 8195896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DateInputKt$DateInputTextField$4(modifier, function2, function22, stateData, calendarDate, onDateChanged, i, dateInputValidator, dateInputFormat, locale, i2));
        }
    }

    /* renamed from: a */
    public static final TextFieldValue m60626a(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* renamed from: b */
    public static final void m60625b(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    @NotNull
    public static final PaddingValues getInputTextFieldPadding() {
        return f25771a;
    }
}