package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/phone_number/PhoneNumberValidate;", "", "()V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidate */
/* loaded from: classes8.dex */
public final class PhoneNumberValidate {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/phone_number/PhoneNumberValidate$Companion;", "", "()V", "validateEmpty", "", "value", "", "emptyError", "", "validateLength", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidate$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void validateEmpty(@Nullable String str, int i) {
            if (str != null && str.length() != 0) {
                return;
            }
            throw new ValidatedRuleException(i);
        }

        public final void validateLength(@Nullable String str, int i) {
            int i2;
            String removeAllSpecialCharacter;
            if (str != null && (removeAllSpecialCharacter = StringExtKt.toRemoveAllSpecialCharacter(str)) != null) {
                i2 = removeAllSpecialCharacter.length();
            } else {
                i2 = 0;
            }
            if (i2 >= 10) {
                return;
            }
            throw new ValidatedRuleException(i);
        }

        public Companion() {
        }
    }
}