package th.p047co.dtac.android.dtacone.app_one.repository;

import io.reactivex.Single;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H&J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;", "", "changePasswordData", "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "getChangePasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "setChangePasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;)V", "checkChangePassword", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordResponse;", "request", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordRequest;", "clear", "", "decryptCBC", "", "cipher", "encryptCBC", TextBundle.TEXT_ENTRY, "encryptPhoneNumberString", "data", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository */
/* loaded from: classes7.dex */
public interface OneChangePasswordRepository {
    @NotNull
    Single<ChangePasswordResponse> checkChangePassword(@NotNull ChangePasswordRequest changePasswordRequest);

    void clear();

    @NotNull
    String decryptCBC(@NotNull String str);

    @NotNull
    String encryptCBC(@NotNull String str);

    @NotNull
    String encryptPhoneNumberString(@Nullable String str);

    @Nullable
    OneChangePassword getChangePasswordData();

    void setChangePasswordData(@Nullable OneChangePassword oneChangePassword);
}
