package th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordRequest;
import th.p047co.dtac.android.dtacone.app_one.model.changePassword.ChangePasswordResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.OneChangePasswordRepository;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneChangePassword;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R'\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0012\u0010\u001fR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/changepassword/OneChangePasswordViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "<init>", "(Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;)V", "", "checkForgotPassword", "()V", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/repository/OneChangePasswordRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/changePassword/ChangePasswordResponse;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_checkChangePasswordResponse", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/LiveData;", "getCheckChangePasswordResponse", "()Landroidx/lifecycle/LiveData;", "checkChangePasswordResponse", "Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "value", "getChangePasswordData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;", "setChangePasswordData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneChangePassword;)V", "changePasswordData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.changepassword.OneChangePasswordViewModel */
/* loaded from: classes7.dex */
public final class OneChangePasswordViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneChangePasswordRepository f82667b;

    /* renamed from: c */
    public final Rx2ThreadService f82668c;

    /* renamed from: d */
    public final OneErrorService f82669d;

    /* renamed from: e */
    public final CompositeDisposable f82670e;

    /* renamed from: f */
    public final Lazy f82671f;

    /* renamed from: g */
    public final LiveData f82672g;

    @Inject
    public OneChangePasswordViewModel(@NotNull OneChangePasswordRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        this.f82667b = repository;
        this.f82668c = threadService;
        this.f82669d = oneErrorService;
        this.f82670e = new CompositeDisposable();
        this.f82671f = LazyKt__LazyJVMKt.lazy(OneChangePasswordViewModel$_checkChangePasswordResponse$2.INSTANCE);
        this.f82672g = m20252d();
    }

    /* renamed from: b */
    public static /* synthetic */ void m20254b(Function1 function1, Object obj) {
        m20253c(function1, obj);
    }

    /* renamed from: c */
    public static final void m20253c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void checkForgotPassword() {
        String str;
        String str2;
        OneChangePasswordRepository oneChangePasswordRepository = this.f82667b;
        OneChangePassword changePasswordData = getChangePasswordData();
        String str3 = null;
        if (changePasswordData != null) {
            str = changePasswordData.getOldPassword();
        } else {
            str = null;
        }
        String encryptCBC = oneChangePasswordRepository.encryptCBC(String.valueOf(str));
        OneChangePasswordRepository oneChangePasswordRepository2 = this.f82667b;
        OneChangePassword changePasswordData2 = getChangePasswordData();
        if (changePasswordData2 != null) {
            str2 = changePasswordData2.getPassword();
        } else {
            str2 = null;
        }
        String encryptCBC2 = oneChangePasswordRepository2.encryptCBC(String.valueOf(str2));
        OneChangePasswordRepository oneChangePasswordRepository3 = this.f82667b;
        OneChangePassword changePasswordData3 = getChangePasswordData();
        if (changePasswordData3 != null) {
            str3 = changePasswordData3.getPhoneNumber();
        }
        Single<R> compose = oneChangePasswordRepository.checkChangePassword(new ChangePasswordRequest(oneChangePasswordRepository3.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(str3)), encryptCBC2, encryptCBC)).compose(this.f82668c.applySingleAsync());
        final OneChangePasswordViewModel$checkForgotPassword$1 oneChangePasswordViewModel$checkForgotPassword$1 = new OneChangePasswordViewModel$checkForgotPassword$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: gO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneChangePasswordViewModel.m20254b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun checkForgotPassword(…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneChangePasswordViewModel$checkForgotPassword$2(this), new OneChangePasswordViewModel$checkForgotPassword$3(this)), this.f82670e);
    }

    /* renamed from: d */
    public final MutableLiveData m20252d() {
        return (MutableLiveData) this.f82671f.getValue();
    }

    @Nullable
    public final OneChangePassword getChangePasswordData() {
        return this.f82667b.getChangePasswordData();
    }

    @NotNull
    public final LiveData<Resource<ChangePasswordResponse>> getCheckChangePasswordResponse() {
        return this.f82672g;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f82670e;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f82670e.clear();
        this.f82667b.clear();
    }

    public final void setChangePasswordData(@Nullable OneChangePassword oneChangePassword) {
        this.f82667b.setChangePasswordData(oneChangePassword);
    }
}