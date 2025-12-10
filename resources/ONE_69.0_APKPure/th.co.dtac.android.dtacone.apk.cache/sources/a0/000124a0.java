package th.p047co.dtac.android.dtacone.presenter.profile;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010\u000b\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/profile/ProfilePicturePresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "serverErrorService", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "getProfileImage", "()V", "deleteProfileImage", "onDestroy", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "getApi", "()Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "getServerErrorService", "()Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lio/reactivex/disposables/CompositeDisposable;", "d", "Lkotlin/Lazy;", OperatorName.MOVE_TO, "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/presenter/profile/ProfilePicturePresenter$View;", "e", "Lth/co/dtac/android/dtacone/presenter/profile/ProfilePicturePresenter$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter */
/* loaded from: classes8.dex */
public final class ProfilePicturePresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f86267a;

    /* renamed from: b */
    public final ServerErrorService f86268b;

    /* renamed from: c */
    public final Rx2ThreadService f86269c;

    /* renamed from: d */
    public final Lazy f86270d;

    /* renamed from: e */
    public View f86271e;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/profile/ProfilePicturePresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onDeleteProfileImageSuccess", "", "onGetProfileImageFailed", "onGetProfileImageSuccess", ImagesContract.URL, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onDeleteProfileImageSuccess();

        void onGetProfileImageFailed();

        void onGetProfileImageSuccess(@NotNull String str);
    }

    @Inject
    public ProfilePicturePresenter(@NotNull RTRApiRx2 api, @NotNull ServerErrorService serverErrorService, @NotNull Rx2ThreadService threadService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(serverErrorService, "serverErrorService");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f86267a = api;
        this.f86268b = serverErrorService;
        this.f86269c = threadService;
        this.f86270d = LazyKt__LazyJVMKt.lazy(ProfilePicturePresenter$subscription$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m17563a(Function1 function1, Object obj) {
        m17556h(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17562b(Function1 function1, Object obj) {
        m17553k(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17561c(ProfilePicturePresenter profilePicturePresenter) {
        m17557g(profilePicturePresenter);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17560d(Function1 function1, Object obj) {
        m17552l(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17559e() {
        m17554j();
    }

    /* renamed from: f */
    public static /* synthetic */ void m17558f(Function1 function1, Object obj) {
        m17555i(function1, obj);
    }

    /* renamed from: g */
    public static final void m17557g(ProfilePicturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f86271e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: h */
    public static final void m17556h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m17555i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m17554j() {
    }

    /* renamed from: k */
    public static final void m17553k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m17552l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    private final CompositeDisposable m17551m() {
        return (CompositeDisposable) this.f86270d.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.profile.ProfilePicturePresenter.View");
        this.f86271e = (View) iView;
    }

    public final void deleteProfileImage() {
        View view = this.f86271e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m17551m = m17551m();
        Observable doOnTerminate = this.f86267a.deleteProfileImage().compose(this.f86269c.applyAsync()).doOnTerminate(new Action() { // from class: xp1
            @Override // io.reactivex.functions.Action
            public final void run() {
                ProfilePicturePresenter.m17561c(ProfilePicturePresenter.this);
            }
        });
        final ProfilePicturePresenter$deleteProfileImage$2 profilePicturePresenter$deleteProfileImage$2 = new ProfilePicturePresenter$deleteProfileImage$2(this);
        Consumer consumer = new Consumer() { // from class: yp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfilePicturePresenter.m17563a(Function1.this, obj);
            }
        };
        final ProfilePicturePresenter$deleteProfileImage$3 profilePicturePresenter$deleteProfileImage$3 = new ProfilePicturePresenter$deleteProfileImage$3(this);
        m17551m.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: zp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfilePicturePresenter.m17558f(Function1.this, obj);
            }
        }));
    }

    @NotNull
    public final RTRApiRx2 getApi() {
        return this.f86267a;
    }

    public final void getProfileImage() {
        CompositeDisposable m17551m = m17551m();
        Observable doOnTerminate = this.f86267a.getProfileImage().compose(this.f86269c.applyAsync()).doOnTerminate(new Action() { // from class: up1
            @Override // io.reactivex.functions.Action
            public final void run() {
                ProfilePicturePresenter.m17559e();
            }
        });
        final ProfilePicturePresenter$getProfileImage$2 profilePicturePresenter$getProfileImage$2 = new ProfilePicturePresenter$getProfileImage$2(this);
        Consumer consumer = new Consumer() { // from class: vp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfilePicturePresenter.m17562b(Function1.this, obj);
            }
        };
        final ProfilePicturePresenter$getProfileImage$3 profilePicturePresenter$getProfileImage$3 = new ProfilePicturePresenter$getProfileImage$3(this);
        m17551m.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: wp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfilePicturePresenter.m17560d(Function1.this, obj);
            }
        }));
    }

    @NotNull
    public final ServerErrorService getServerErrorService() {
        return this.f86268b;
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f86269c;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m17551m().clear();
    }
}