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
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.model.OneRegistrationModel;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0007\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010!J\u0019\u0010%\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010!J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00108\u001a\u0002022\u0006\u00103\u001a\u0002028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R(\u0010>\u001a\u0004\u0018\u0001092\b\u00103\u001a\u0004\u0018\u0001098V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010C\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR(\u0010L\u001a\u0004\u0018\u00010G2\b\u00103\u001a\u0004\u0018\u00010G8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010R\u001a\u0004\u0018\u00010M2\b\u00103\u001a\u0004\u0018\u00010M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010U\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010@\"\u0004\bT\u0010B¨\u0006V"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepositoryImpl;", "Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;)V", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse;", "checkProfileRegister", "(Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterRequest;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpResponse;", "requestOtp", "(Lth/co/dtac/android/dtacone/model/otp/request/RequestOtpBody;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;", "Lth/co/dtac/android/dtacone/model/login/TokenCollection;", "verifyOTP", "(Lth/co/dtac/android/dtacone/model/otp/verify/VerifyOtpRequest;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerRequest;", "Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerResponse;", "getListSIMRetailer", "(Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerRequest;)Lio/reactivex/Single;", "", "rtrCode", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerResponse;", "registerOwner", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;)Lio/reactivex/Single;", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "data", "encryptPhoneNumberString", "", "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "secretKey", "Lth/co/dtac/android/dtacone/app_one/repository/model/OneRegistrationModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/repository/model/OneRegistrationModel;", "model", "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "value", "getRegistrationType", "()Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "setRegistrationType", "(Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;)V", "registrationType", "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "getInputData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "setInputData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;)V", "inputData", "getRtrCodeVerify", "()Ljava/lang/String;", "setRtrCodeVerify", "(Ljava/lang/String;)V", "rtrCodeVerify", "getPhoneNumberOnline", "setPhoneNumberOnline", "phoneNumberOnline", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "getItemSelected", "()Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "setItemSelected", "(Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;)V", "itemSelected", "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "getOneRegistrationPassWord", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "setOneRegistrationPassWord", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;)V", "oneRegistrationPassWord", "getIdCard", "setIdCard", "idCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneRegistrationRepositoryImpl */
/* loaded from: classes7.dex */
public final class OneRegistrationRepositoryImpl implements OneRegistrationRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f82451a;

    /* renamed from: b */
    public final String f82452b;

    /* renamed from: c */
    public OneRegistrationModel f82453c;

    @Inject
    public OneRegistrationRepositoryImpl(@NotNull RTRApiRx2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.f82451a = api;
        this.f82452b = "JfMhPmSpUrXuZw4z6B8EbGdJgNjQmTKl";
        this.f82453c = new OneRegistrationModel(null, null, null, null, null, null, null, 127, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public Single<CheckProfileRegisterResponse> checkProfileRegister(@NotNull CheckProfileRegisterRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82451a.checkProfileRegister(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void clear() {
        this.f82453c = new OneRegistrationModel(null, null, null, null, null, null, null, 127, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f82452b);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f82452b);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public String encryptPhoneNumberString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(data)");
            return AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f82452b);
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public String getIdCard() {
        return this.f82453c.getIdCard();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public OneInputInfoData getInputData() {
        return this.f82453c.getInputData();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public SimData getItemSelected() {
        return this.f82453c.getItemSelected();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public Single<ListSIMRetailerResponse> getListSIMRetailer(@NotNull ListSIMRetailerRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82451a.getListSIMRetailer(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public OneRegistrationPassWord getOneRegistrationPassWord() {
        return this.f82453c.getOneRegistrationPassWord();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public String getPhoneNumberOnline() {
        return this.f82453c.getPhoneNumberOnline();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public RegistrationType getRegistrationType() {
        return this.f82453c.getRegistrationType();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @Nullable
    public String getRtrCodeVerify() {
        return this.f82453c.getRtrCodeVerify();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public Single<OneRegisterOwnerResponse> registerOwner(@Nullable String str, @NotNull OneRegisterOwnerRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82451a.registerOwner(str, request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public Observable<RequestOtpResponse> requestOtp(@NotNull RequestOtpBody request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82451a.requestOtp(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setIdCard(@Nullable String str) {
        this.f82453c.setIdCard(str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setInputData(@Nullable OneInputInfoData oneInputInfoData) {
        this.f82453c.setInputData(oneInputInfoData);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setItemSelected(@Nullable SimData simData) {
        this.f82453c.setItemSelected(simData);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setOneRegistrationPassWord(@Nullable OneRegistrationPassWord oneRegistrationPassWord) {
        this.f82453c.setOneRegistrationPassWord(oneRegistrationPassWord);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setPhoneNumberOnline(@Nullable String str) {
        this.f82453c.setPhoneNumberOnline(str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setRegistrationType(@NotNull RegistrationType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f82453c.setRegistrationType(value);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    public void setRtrCodeVerify(@Nullable String str) {
        this.f82453c.setRtrCodeVerify(str);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository
    @NotNull
    public Observable<TokenCollection> verifyOTP(@NotNull VerifyOtpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82451a.verifyOTP(request);
    }
}