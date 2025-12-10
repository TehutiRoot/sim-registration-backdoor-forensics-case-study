package th.p047co.dtac.android.dtacone.view.appOne.rectify.repository;

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
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyConfirmRequest;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyConfirmResponse;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListRequest;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.model.OneRectifyModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010.\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00101\u001a\u0004\u0018\u00010\n2\b\u0010)\u001a\u0004\u0018\u00010\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R(\u00107\u001a\u0004\u0018\u0001022\b\u0010)\u001a\u0004\u0018\u0001028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/rectify/repository/OneRectifyRepositoryImpl;", "Lth/co/dtac/android/dtacone/view/appOne/rectify/repository/OneRectifyRepository;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", "customerNumber", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse;", "getRectify", "(Ljava/lang/String;)Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyConfirmRequest;", "request", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyConfirmResponse;", "rectifyConfirm", "(Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyConfirmRequest;)Lio/reactivex/Single;", TextBundle.TEXT_ENTRY, "encryptCBC", "(Ljava/lang/String;)Ljava/lang/String;", "cipher", "decryptCBC", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/rectify/model/OneRectifyModel;", "d", "Lth/co/dtac/android/dtacone/view/appOne/rectify/model/OneRectifyModel;", "getModel", "()Lth/co/dtac/android/dtacone/view/appOne/rectify/model/OneRectifyModel;", "setModel", "(Lth/co/dtac/android/dtacone/view/appOne/rectify/model/OneRectifyModel;)V", "model", "value", "getCustomerPhoneNumber", "()Ljava/lang/String;", "setCustomerPhoneNumber", "(Ljava/lang/String;)V", "customerPhoneNumber", "getPin", "setPin", "pin", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "getRectifyListCollection", "()Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "setRectifyListCollection", "(Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;)V", "rectifyListCollection", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepositoryImpl */
/* loaded from: classes10.dex */
public final class OneRectifyRepositoryImpl implements OneRectifyRepository {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f96152a;

    /* renamed from: b */
    public final ConfigurationRepository f96153b;

    /* renamed from: c */
    public final PreferencesViewModel f96154c;

    /* renamed from: d */
    public OneRectifyModel f96155d;

    @Inject
    public OneRectifyRepositoryImpl(@NotNull RTRApiRx2 api, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f96152a = api;
        this.f96153b = configurationRepository;
        this.f96154c = pfViewModel;
        this.f96155d = new OneRectifyModel(null, null, null, 7, null);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @NotNull
    public String decryptCBC(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return AESCryptUtil.decryptCBC(str, this.f96153b.dataPrivacyEncryptionAES256CBCKey());
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @NotNull
    public String encryptCBC(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return AESCryptUtil.encryptCBC(str, this.f96153b.dataPrivacyEncryptionAES256CBCKey());
        }
        return "";
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @Nullable
    public String getCustomerPhoneNumber() {
        return this.f96155d.getCustomerPhoneNumber();
    }

    @NotNull
    public final OneRectifyModel getModel() {
        return this.f96155d;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @Nullable
    public String getPin() {
        return this.f96155d.getPin();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @NotNull
    public Observable<OneRectifyListResponse> getRectify(@Nullable String str) {
        String str2;
        RTRApiRx2 rTRApiRx2 = this.f96152a;
        String suffixApi = this.f96154c.getSuffixApi();
        if (str != null && str.length() != 0) {
            str2 = encryptCBC(str);
        } else {
            str2 = null;
        }
        return rTRApiRx2.getRectifyList(suffixApi, new OneRectifyListRequest(str2));
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @Nullable
    public OneRectifyListResponse.DataItem.RectifyItem getRectifyListCollection() {
        return this.f96155d.getRectifyListCollection();
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    @NotNull
    public Single<OneRectifyConfirmResponse> rectifyConfirm(@NotNull OneRectifyConfirmRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f96152a.oneRectifyConfirm(this.f96154c.getSuffixApi(), request);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    public void setCustomerPhoneNumber(@Nullable String str) {
        this.f96155d.setCustomerPhoneNumber(str);
    }

    public final void setModel(@NotNull OneRectifyModel oneRectifyModel) {
        Intrinsics.checkNotNullParameter(oneRectifyModel, "<set-?>");
        this.f96155d = oneRectifyModel;
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    public void setPin(@Nullable String str) {
        this.f96155d.setPin(str);
    }

    @Override // th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository
    public void setRectifyListCollection(@Nullable OneRectifyListResponse.DataItem.RectifyItem rectifyItem) {
        this.f96155d.setRectifyListCollection(rectifyItem);
    }
}