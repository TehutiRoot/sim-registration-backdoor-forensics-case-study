package androidx.compose.material3;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.material3.Strings;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p005os.ConfigurationCompat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28850d2 = {"getString", "", TypedValues.Custom.S_STRING, "Landroidx/compose/material3/Strings;", "getString-NWtq2-8", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "getString-iSCLEhQ", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,211:1\n76#2:212\n76#2:213\n76#2:214\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/Strings_androidKt\n*L\n30#1:212\n31#1:213\n208#1:214\n*E\n"})
/* loaded from: classes2.dex */
public final class Strings_androidKt {
    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: getString-NWtq2-8  reason: not valid java name */
    public static final String m70619getStringNWtq28(int i, @Nullable Composer composer, int i2) {
        String str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:28)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m70552equalsimpl0(i, companion.m70599getNavigationMenuadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70561getCloseDraweradMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.close_drawer);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70562getCloseSheetadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.close_sheet);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70594getDefaultErrorMessageadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.default_error_message);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70596getExposedDropdownMenuadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70602getSliderRangeStartadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.range_start);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70601getSliderRangeEndadMyvUU())) {
            str = resources.getString(androidx.compose.p003ui.R.string.range_end);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_end)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70595getDialogadMyvUU())) {
            str = resources.getString(R.string.dialog);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70598getMenuExpandedadMyvUU())) {
            str = resources.getString(R.string.expanded);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70597getMenuCollapsedadMyvUU())) {
            str = resources.getString(R.string.collapsed);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…rial3.R.string.collapsed)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70603getSnackbarDismissadMyvUU())) {
            str = resources.getString(R.string.snackbar_dismiss);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …nackbar_dismiss\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70600getSearchBarSearchadMyvUU())) {
            str = resources.getString(R.string.search_bar_search);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …arch_bar_search\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70604getSuggestionsAvailableadMyvUU())) {
            str = resources.getString(R.string.suggestions_available);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(andr…ng.suggestions_available)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70583getDatePickerTitleadMyvUU())) {
            str = resources.getString(R.string.date_picker_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …te_picker_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70571getDatePickerHeadlineadMyvUU())) {
            str = resources.getString(R.string.date_picker_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …picker_headline\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70585getDatePickerYearPickerPaneTitleadMyvUU())) {
            str = resources.getString(R.string.date_picker_year_picker_pane_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …cker_pane_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70582getDatePickerSwitchToYearSelectionadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_year_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_year_selection\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70578getDatePickerSwitchToDaySelectionadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_day_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_day_selection\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70580getDatePickerSwitchToNextMonthadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_next_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …h_to_next_month\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70581getDatePickerSwitchToPreviousMonthadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70573getDatePickerNavigateToYearDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_picker_navigate_to_year_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ear_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70572getDatePickerHeadlineDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_picker_headline_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70574getDatePickerNoSelectionDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_picker_no_selection_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ion_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70584getDatePickerTodayDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_picker_today_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …day_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70576getDatePickerScrollToShowLaterYearsadMyvUU())) {
            str = resources.getString(R.string.date_picker_scroll_to_later_years);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_to_later_years\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70575getDatePickerScrollToShowEarlierYearsadMyvUU())) {
            str = resources.getString(R.string.date_picker_scroll_to_earlier_years);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_earlier_years\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70570getDateInputTitleadMyvUU())) {
            str = resources.getString(R.string.date_input_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ate_input_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70563getDateInputHeadlineadMyvUU())) {
            str = resources.getString(R.string.date_input_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_input_headline\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70568getDateInputLabeladMyvUU())) {
            str = resources.getString(R.string.date_input_label);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ate_input_label\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70564getDateInputHeadlineDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_input_headline_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ine_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70569getDateInputNoInputDescriptionadMyvUU())) {
            str = resources.getString(R.string.date_input_no_input_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …put_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70566getDateInputInvalidNotAllowedadMyvUU())) {
            str = resources.getString(R.string.date_input_invalid_not_allowed);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_not_allowed\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70565getDateInputInvalidForPatternadMyvUU())) {
            str = resources.getString(R.string.date_input_invalid_for_pattern);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_for_pattern\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70567getDateInputInvalidYearRangeadMyvUU())) {
            str = resources.getString(R.string.date_input_invalid_year_range);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …alid_year_range\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70577getDatePickerSwitchToCalendarModeadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_calendar_mode);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …o_calendar_mode\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70579getDatePickerSwitchToInputModeadMyvUU())) {
            str = resources.getString(R.string.date_picker_switch_to_input_mode);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …h_to_input_mode\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70593getDateRangePickerTitleadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ge_picker_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70592getDateRangePickerStartHeadlineadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_start_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_start_headline\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70589getDateRangePickerEndHeadlineadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_end_headline);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …er_end_headline\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70590getDateRangePickerScrollToShowNextMonthadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_scroll_to_next_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …l_to_next_month\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70591getDateRangePickerScrollToShowPreviousMonthadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_scroll_to_previous_month);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_previous_month\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70588getDateRangePickerDayInRangeadMyvUU())) {
            str = resources.getString(R.string.date_range_picker_day_in_range);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …er_day_in_range\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70587getDateRangeInputTitleadMyvUU())) {
            str = resources.getString(R.string.date_range_input_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …nge_input_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70586getDateRangeInputInvalidRangeInputadMyvUU())) {
            str = resources.getString(R.string.date_range_input_invalid_range_input);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …lid_range_input\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70559getBottomSheetPaneTitleadMyvUU())) {
            str = resources.getString(R.string.m3c_bottom_sheet_pane_title);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …heet_pane_title\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70557getBottomSheetDragHandleDescriptionadMyvUU())) {
            str = resources.getString(R.string.bottom_sheet_drag_handle_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …dle_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70560getBottomSheetPartialExpandDescriptionadMyvUU())) {
            str = resources.getString(R.string.bottom_sheet_collapse_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …pse_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70556getBottomSheetDismissDescriptionadMyvUU())) {
            str = resources.getString(R.string.bottom_sheet_dismiss_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …iss_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70558getBottomSheetExpandDescriptionadMyvUU())) {
            str = resources.getString(R.string.bottom_sheet_expand_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …and_description\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70617getTooltipLongPressLabeladMyvUU())) {
            str = resources.getString(R.string.tooltip_long_press_label);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ong_press_label\n        )");
        } else if (Strings.m70552equalsimpl0(i, companion.m70606getTimePickerAMadMyvUU())) {
            str = resources.getString(R.string.time_picker_am);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….R.string.time_picker_am)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70615getTimePickerPMadMyvUU())) {
            str = resources.getString(R.string.time_picker_pm);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….R.string.time_picker_pm)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70616getTimePickerPeriodToggleadMyvUU())) {
            str = resources.getString(R.string.time_picker_period_toggle_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …eriod_toggle_description)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70612getTimePickerMinuteSelectionadMyvUU())) {
            str = resources.getString(R.string.time_picker_minute_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …_picker_minute_selection)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70608getTimePickerHourSelectionadMyvUU())) {
            str = resources.getString(R.string.time_picker_hour_selection);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …me_picker_hour_selection)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70609getTimePickerHourSuffixadMyvUU())) {
            str = resources.getString(R.string.time_picker_hour_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….time_picker_hour_suffix)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70613getTimePickerMinuteSuffixadMyvUU())) {
            str = resources.getString(R.string.time_picker_minute_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …ime_picker_minute_suffix)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70605getTimePicker24HourSuffixadMyvUU())) {
            str = resources.getString(R.string.time_picker_hour_24h_suffix);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …e_picker_hour_24h_suffix)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70607getTimePickerHouradMyvUU())) {
            str = resources.getString(R.string.time_picker_hour);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   ….string.time_picker_hour)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70611getTimePickerMinuteadMyvUU())) {
            str = resources.getString(R.string.time_picker_minute);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …tring.time_picker_minute)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70610getTimePickerHourTextFieldadMyvUU())) {
            str = resources.getString(R.string.time_picker_hour_text_field);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …e_picker_hour_text_field)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70614getTimePickerMinuteTextFieldadMyvUU())) {
            str = resources.getString(R.string.time_picker_minute_text_field);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …picker_minute_text_field)");
        } else if (Strings.m70552equalsimpl0(i, companion.m70618getTooltipPaneDescriptionadMyvUU())) {
            str = resources.getString(R.string.tooltip_pane_description);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(\n   …tooltip_pane_description)");
        } else {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return str;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: getString-iSCLEhQ  reason: not valid java name */
    public static final String m70620getStringiSCLEhQ(int i, @NotNull Object[] formatArgs, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126124681, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:204)");
        }
        String m70619getStringNWtq28 = m70619getStringNWtq28(i, composer, i2 & 14);
        Locale locale = ConfigurationCompat.getLocales((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] copyOf = Arrays.copyOf(formatArgs, formatArgs.length);
        String format = String.format(locale, m70619getStringNWtq28, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return format;
    }
}
