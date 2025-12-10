package th.p047co.dtac.android.dtacone.app_one.repository;

import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;

@Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0003H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H&J\u0012\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0003H&J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002040'2\u0006\u0010)\u001a\u000205H&J \u00106\u001a\b\u0012\u0004\u0012\u0002070'2\b\u00108\u001a\u0004\u0018\u00010\u00032\u0006\u0010)\u001a\u000209H&J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010)\u001a\u00020=H&J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020?0;2\u0006\u0010)\u001a\u00020@H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007R\u0018\u0010\u001d\u001a\u00020\u001eX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007¨\u0006A"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;", "", "idCard", "", "getIdCard", "()Ljava/lang/String;", "setIdCard", "(Ljava/lang/String;)V", "inputData", "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "getInputData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "setInputData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;)V", "itemSelected", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "getItemSelected", "()Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "setItemSelected", "(Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;)V", "oneRegistrationPassWord", "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "getOneRegistrationPassWord", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "setOneRegistrationPassWord", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;)V", "phoneNumberOnline", "getPhoneNumberOnline", "setPhoneNumberOnline", "registrationType", "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "getRegistrationType", "()Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "setRegistrationType", "(Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;)V", "rtrCodeVerify", "getRtrCodeVerify", "setRtrCodeVerify", "checkProfileRegister", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse;", "request", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterRequest;", "clear", "", "decryptCBC", "cipher", "encryptCBC", TextBundle.TEXT_ENTRY, "encryptPhoneNumberString", "data", "getListSIMRetailer", "Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerResponse;", "Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerRequest;", "registerOwner", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerResponse;", "rtrCode", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "requestOtp", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "verifyOTP", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository */
/* loaded from: classes7.dex */
public interface OneRegistrationRepository {
    @NotNull
    Single<CheckProfileRegisterResponse> checkProfileRegister(@NotNull CheckProfileRegisterRequest checkProfileRegisterRequest);

    void clear();

    @NotNull
    String decryptCBC(@NotNull String str);

    @NotNull
    String encryptCBC(@NotNull String str);

    @NotNull
    String encryptPhoneNumberString(@Nullable String str);

    @Nullable
    String getIdCard();

    @Nullable
    OneInputInfoData getInputData();

    @Nullable
    SimData getItemSelected();

    @NotNull
    Single<ListSIMRetailerResponse> getListSIMRetailer(@NotNull ListSIMRetailerRequest listSIMRetailerRequest);

    @Nullable
    OneRegistrationPassWord getOneRegistrationPassWord();

    @Nullable
    String getPhoneNumberOnline();

    @NotNull
    RegistrationType getRegistrationType();

    @Nullable
    String getRtrCodeVerify();

    @NotNull
    Single<OneRegisterOwnerResponse> registerOwner(@Nullable String str, @NotNull OneRegisterOwnerRequest oneRegisterOwnerRequest);

    @NotNull
    Observable<RequestOtpResponse> requestOtp(@NotNull RequestOtpBody requestOtpBody);

    void setIdCard(@Nullable String str);

    void setInputData(@Nullable OneInputInfoData oneInputInfoData);

    void setItemSelected(@Nullable SimData simData);

    void setOneRegistrationPassWord(@Nullable OneRegistrationPassWord oneRegistrationPassWord);

    void setPhoneNumberOnline(@Nullable String str);

    void setRegistrationType(@NotNull RegistrationType registrationType);

    void setRtrCodeVerify(@Nullable String str);

    @NotNull
    Observable<TokenCollection> verifyOTP(@NotNull VerifyOtpRequest verifyOtpRequest);
}
