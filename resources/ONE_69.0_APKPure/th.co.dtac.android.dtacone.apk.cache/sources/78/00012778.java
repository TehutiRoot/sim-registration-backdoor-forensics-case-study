package th.p047co.dtac.android.dtacone.util.validation.changeMainPack;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.changeMainPack.submit.request.SubmitChangeMainPackRequest;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.util.validation.self_update.IdCardValidate;
import th.p047co.dtac.android.dtacone.util.validation.self_update.PhoneNumberValidate;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/changeMainPack/ChangeMainPackValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/changeMainPack/submit/request/SubmitChangeMainPackRequest;", "()V", "validate", "", "value", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.changeMainPack.ChangeMainPackValidate */
/* loaded from: classes8.dex */
public final class ChangeMainPackValidate implements ValidationRule<SubmitChangeMainPackRequest> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@NotNull SubmitChangeMainPackRequest value) {
        Intrinsics.checkNotNullParameter(value, "value");
        new PhoneNumberValidate().validate(value.getSubscriberNumber());
        if (!Intrinsics.areEqual(value.getCardType(), "15")) {
            new IdCardValidate().validate(value.getCardNumber());
        }
        String packageCode = value.getPackageCode();
        if (packageCode == null || packageCode.length() == 0) {
            String packageName = value.getPackageName();
            if (packageName == null || packageName.length() == 0) {
                throw new ValidatedRuleException(R.string.change_main_pack_validate_select_package);
            }
        }
    }
}