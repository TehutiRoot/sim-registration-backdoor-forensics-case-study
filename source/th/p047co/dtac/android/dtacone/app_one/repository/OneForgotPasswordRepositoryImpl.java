package th.p047co.dtac.android.dtacone.app_one.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.model.OneForgotPasswordModel;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneForgotPassword;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0007\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepositoryImpl;", "Lth/co/dtac/android/dtacone/app_one/repository/OneForgotPasswordRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "request", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "requestOtp", "(Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "verifyOTP", "(Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;)Lio/reactivex/Observable;", "", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "data", "encryptPhoneNumberString", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordRequest;", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordResponse;", "checkForgotPassword", "(Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordRequest;)Lio/reactivex/Single;", "", "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "secretKey", "Lth/co/dtac/android/dtacone/app_one/repository/model/OneForgotPasswordModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/repository/model/OneForgotPasswordModel;", "model", "Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "value", "getForgotPasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;", "setForgotPasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneForgotPassword;)V", "forgotPasswordData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepositoryImpl */
/* loaded from: classes7.dex */
public final class OneForgotPasswordRepositoryImpl implements OneForgotPasswordRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f82355a;

    /* renamed from: b */
    public final String f82356b;

    /* renamed from: c */
    public OneForgotPasswordModel f82357c;

    @Inject
    public OneForgotPasswordRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f82355a = api;
        this.f82356b = "JfMhPmSpUrXuZw4z6B8EbGdJgNjQmTKl";
        this.f82357c = new OneForgotPasswordModel(null, 1, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public Single<ForgotPasswordResponse> checkForgotPassword(@NotNull ForgotPasswordRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82355a.checkForgotPassword(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    public void clear() {
        this.f82357c = new OneForgotPasswordModel(null, 1, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f82356b);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f82356b);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public String encryptPhoneNumberString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(data)");
            return AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f82356b);
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @Nullable
    public OneForgotPassword getForgotPasswordData() {
        return this.f82357c.getForgotPasswordData();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public Observable<RequestOtpResponse> requestOtp(@NotNull RequestOtpBody request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82355a.requestOtp(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    public void setForgotPasswordData(@Nullable OneForgotPassword oneForgotPassword) {
        this.f82357c.setForgotPasswordData(oneForgotPassword);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository
    @NotNull
    public Observable<TokenCollection> verifyOTP(@NotNull VerifyOtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82355a.verifyOTP(request);
    }
}
