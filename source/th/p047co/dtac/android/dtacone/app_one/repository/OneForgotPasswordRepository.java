package th.p047co.dtac.android.dtacone.app_one.repository;

import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;

@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H&J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\u0019H&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\u000b\u001a\u00020\u001cH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;", "", "forgotPasswordData", "Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "getForgotPasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "setForgotPasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;)V", "checkForgotPassword", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", "request", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordRequest;", "clear", "", "decryptCBC", "", "cipher", "encryptCBC", TextBundle.TEXT_ENTRY, "encryptPhoneNumberString", "data", "requestOtp", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "verifyOTP", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository */
/* loaded from: classes7.dex */
public interface OneForgotPasswordRepository {
    @NotNull
    Single<ForgotPasswordResponse> checkForgotPassword(@NotNull ForgotPasswordRequest forgotPasswordRequest);

    void clear();

    @NotNull
    String decryptCBC(@NotNull String str);

    @NotNull
    String encryptCBC(@NotNull String str);

    @NotNull
    String encryptPhoneNumberString(@Nullable String str);

    @Nullable
    OneForgotPassword getForgotPasswordData();

    @NotNull
    Observable<RequestOtpResponse> requestOtp(@NotNull RequestOtpBody requestOtpBody);

    void setForgotPasswordData(@Nullable OneForgotPassword oneForgotPassword);

    @NotNull
    Observable<TokenCollection> verifyOTP(@NotNull VerifyOtpRequest verifyOtpRequest);
}
