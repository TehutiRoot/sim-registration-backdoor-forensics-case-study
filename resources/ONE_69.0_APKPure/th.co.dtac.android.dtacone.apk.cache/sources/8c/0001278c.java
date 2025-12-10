package th.p047co.dtac.android.dtacone.util.validation.otp;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/otp/NewOtpValidator;", "Lth/co/dtac/android/dtacone/util/validation/Validator;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.validation.otp.NewOtpValidator */
/* loaded from: classes8.dex */
public final class NewOtpValidator extends Validator<VerifyOtpRequest> {
    public static final int $stable = 0;

    public NewOtpValidator() {
        this.validationRules.add(new NewOtpLengthRule());
    }
}