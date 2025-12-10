package th.p047co.dtac.android.dtacone.app_one.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.model.OneChangePasswordModel;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepositoryImpl;", "Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", "data", "encryptPhoneNumberString", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordResponse;", "checkChangePassword", "(Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordRequest;)Lio/reactivex/Single;", "", "clear", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Lth/co/dtac/android/dtacone/app_one/repository/model/OneChangePasswordModel;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/repository/model/OneChangePasswordModel;", "model", "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "value", "getChangePasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "setChangePasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;)V", "changePasswordData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepositoryImpl */
/* loaded from: classes7.dex */
public final class OneChangePasswordRepositoryImpl implements OneChangePasswordRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f82350a;

    /* renamed from: b */
    public final ConfigurationRepository f82351b;

    /* renamed from: c */
    public OneChangePasswordModel f82352c;

    @Inject
    public OneChangePasswordRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f82350a = api;
        this.f82351b = configurationRepository;
        this.f82352c = new OneChangePasswordModel(null, 1, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    @NotNull
    public Single<ChangePasswordResponse> checkChangePassword(@NotNull ChangePasswordRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f82350a.checkChangePassword(request);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    public void clear() {
        this.f82352c = new OneChangePasswordModel(null, 1, null);
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    @NotNull
    public String decryptCBC(@NotNull String cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        if (cipher.length() == 0) {
            return "";
        }
        return AESCryptUtil.decryptCBC(cipher, this.f82351b.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    @NotNull
    public String encryptCBC(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return "";
        }
        return AESCryptUtil.encryptCBC(text, this.f82351b.dataPrivacyEncryptionAES256CBCKey());
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    @NotNull
    public String encryptPhoneNumberString(@Nullable String str) {
        if (str != null && str.length() != 0) {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(str);
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(data)");
            return AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f82351b.dataPrivacyEncryptionAES256CBCKey());
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    @Nullable
    public OneChangePassword getChangePasswordData() {
        return this.f82352c.getChangePasswordData();
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository
    public void setChangePasswordData(@Nullable OneChangePassword oneChangePassword) {
        this.f82352c.setChangePasswordData(oneChangePassword);
    }
}
