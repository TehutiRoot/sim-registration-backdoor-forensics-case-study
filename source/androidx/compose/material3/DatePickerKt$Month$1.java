package androidx.compose.material3;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n92#2:1921\n75#3,5:1922\n80#3:1953\n84#3:2015\n75#4:1927\n76#4,11:1929\n75#4:1956\n76#4,11:1958\n89#4:2009\n89#4:2014\n76#5:1928\n76#5:1957\n460#6,13:1940\n460#6,13:1969\n50#6:1983\n49#6:1984\n50#6:1991\n49#6:1992\n36#6:1999\n473#6,3:2006\n473#6,3:2011\n79#7,2:1954\n81#7:1982\n85#7:2010\n1114#8,6:1985\n1114#8,6:1993\n1114#8,6:2000\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n*L\n1449#1:1921\n1447#1:1922,5\n1447#1:1953\n1447#1:2015\n1447#1:1927\n1447#1:1929,11\n1454#1:1956\n1454#1:1958,11\n1454#1:2009\n1447#1:2014\n1447#1:1928\n1454#1:1957\n1447#1:1940,13\n1454#1:1969,13\n1479#1:1983\n1479#1:1984\n1505#1:1991\n1505#1:1992\n1510#1:1999\n1454#1:2006,3\n1447#1:2011,3\n1454#1:1954,2\n1454#1:1982\n1454#1:2010\n1479#1:1985,6\n1505#1:1993,6\n1510#1:2000,6\n*E\n"})
/* loaded from: classes2.dex */
public final class DatePickerKt$Month$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ Locale $defaultLocale;
    final /* synthetic */ MutableState<CalendarDate> $endSelection;
    final /* synthetic */ CalendarMonth $month;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ Modifier $rangeSelectionDrawModifier;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ MutableState<CalendarDate> $startSelection;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$Month$1(Modifier modifier, CalendarMonth calendarMonth, CalendarDate calendarDate, MutableState<CalendarDate> mutableState, MutableState<CalendarDate> mutableState2, boolean z, int i, DatePickerFormatter datePickerFormatter, Locale locale, Function1<? super Long, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$rangeSelectionDrawModifier = modifier;
        this.$month = calendarMonth;
        this.$today = calendarDate;
        this.$startSelection = mutableState;
        this.$endSelection = mutableState2;
        this.$rangeSelectionEnabled = z;
        this.$$dirty = i;
        this.$dateFormatter = datePickerFormatter;
        this.$defaultLocale = locale;
        this.$onDateSelected = function1;
        this.$colors = datePickerColors;
        this.$stateData = stateData;
        this.$dateValidator = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x030f, code lost:
        if (r7 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r6v20 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt$Month$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
