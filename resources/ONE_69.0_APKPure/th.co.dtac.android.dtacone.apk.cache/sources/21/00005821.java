package androidx.compose.material3;

import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.runtime.MutableState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,358:1\n1064#2,2:359\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateInputKt$DateInputTextField$1\n*L\n132#1:359,2\n*E\n"})
/* loaded from: classes2.dex */
public final class DateInputKt$DateInputTextField$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    final /* synthetic */ DateInputFormat $dateInputFormat;
    final /* synthetic */ DateInputValidator $dateInputValidator;
    final /* synthetic */ MutableState<String> $errorText;
    final /* synthetic */ int $inputIdentifier;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ Function1<CalendarDate, Unit> $onDateChanged;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ MutableState<TextFieldValue> $text$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateInputKt$DateInputTextField$1(DateInputFormat dateInputFormat, MutableState<String> mutableState, Function1<? super CalendarDate, Unit> function1, StateData stateData, DateInputValidator dateInputValidator, int i, Locale locale, MutableState<TextFieldValue> mutableState2) {
        super(1);
        this.$dateInputFormat = dateInputFormat;
        this.$errorText = mutableState;
        this.$onDateChanged = function1;
        this.$stateData = stateData;
        this.$dateInputValidator = dateInputValidator;
        this.$inputIdentifier = i;
        this.$locale = locale;
        this.$text$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getText().length() <= this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
            String text = input.getText();
            for (int i = 0; i < text.length(); i++) {
                if (!Character.isDigit(text.charAt(i))) {
                    return;
                }
            }
            DateInputKt.m60625b(this.$text$delegate, input);
            String obj = StringsKt__StringsKt.trim(input.getText()).toString();
            if (obj.length() == 0 || obj.length() < this.$dateInputFormat.getPatternWithoutDelimiters().length()) {
                this.$errorText.setValue("");
                this.$onDateChanged.invoke(null);
                return;
            }
            CalendarDate parse = this.$stateData.getCalendarModel().parse(obj, this.$dateInputFormat.getPatternWithoutDelimiters());
            this.$errorText.setValue(this.$dateInputValidator.m70519validateXivgLIo(parse, this.$inputIdentifier, this.$locale));
            this.$onDateChanged.invoke(this.$errorText.getValue().length() == 0 ? parse : null);
        }
    }
}