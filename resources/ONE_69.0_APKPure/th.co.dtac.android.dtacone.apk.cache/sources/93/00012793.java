package th.p047co.dtac.android.dtacone.util.validation.password.textFormat;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/password/textFormat/TextPasswordFormatRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/BaseUserCollection;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.password.textFormat.TextPasswordFormatRule */
/* loaded from: classes8.dex */
public final class TextPasswordFormatRule implements ValidationRule<BaseUserCollection> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@NotNull BaseUserCollection value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getPassword().length() >= 6) {
            String password = value.getPassword();
            Intrinsics.checkNotNullExpressionValue(password, "value.password");
            if (new Regex("[0-9]").containsMatchIn(password)) {
                String password2 = value.getPassword();
                Intrinsics.checkNotNullExpressionValue(password2, "value.password");
                if (new Regex("[A-Za-z]").containsMatchIn(password2)) {
                    return;
                }
            }
        }
        throw new ValidatedRuleException(R.string.please_set_password_more_equal_6_and_format_incorrect);
    }
}