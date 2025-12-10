package th.p047co.dtac.android.dtacone.presenter.runtime_permission;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.runtime_permission.CallPermissionPresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/runtime_permission/CallPermissionPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "rxPermissions", "<init>", "(Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "askCallPermission", "()V", "onDestroy", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "e", "()Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/presenter/runtime_permission/CallPermissionPresenter$View;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/presenter/runtime_permission/CallPermissionPresenter$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.runtime_permission.CallPermissionPresenter */
/* loaded from: classes8.dex */
public final class CallPermissionPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RxPermissions f86395a;

    /* renamed from: b */
    public final Lazy f86396b;

    /* renamed from: c */
    public View f86397c;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/runtime_permission/CallPermissionPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "onPermissionCallDenied", "", "onPermissionCallGranted", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.runtime_permission.CallPermissionPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView {
        void onPermissionCallDenied();

        void onPermissionCallGranted();
    }

    @Inject
    public CallPermissionPresenter(@NotNull RxPermissions rxPermissions) {
        Intrinsics.checkNotNullParameter(rxPermissions, "rxPermissions");
        this.f86395a = rxPermissions;
        this.f86396b = LazyKt__LazyJVMKt.lazy(CallPermissionPresenter$subscription$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ Permission m17414a(Function1 function1, Object obj) {
        return m17412c(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17413b(Function1 function1, Object obj) {
        m17411d(function1, obj);
    }

    /* renamed from: c */
    public static final Permission m17412c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Permission) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final void m17411d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    private final CompositeDisposable m17410e() {
        return (CompositeDisposable) this.f86396b.getValue();
    }

    public final void askCallPermission() {
        CompositeDisposable m17410e = m17410e();
        Observable<Permission> requestEach = this.f86395a.requestEach("android.permission.CALL_PHONE");
        final CallPermissionPresenter$askCallPermission$1 callPermissionPresenter$askCallPermission$1 = CallPermissionPresenter$askCallPermission$1.INSTANCE;
        Observable<Permission> onErrorReturn = requestEach.onErrorReturn(new Function() { // from class: ih
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CallPermissionPresenter.m17414a(Function1.this, obj);
            }
        });
        final CallPermissionPresenter$askCallPermission$2 callPermissionPresenter$askCallPermission$2 = new CallPermissionPresenter$askCallPermission$2(this);
        m17410e.add(onErrorReturn.subscribe(new Consumer() { // from class: jh
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CallPermissionPresenter.m17413b(Function1.this, obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.runtime_permission.CallPermissionPresenter.View");
        this.f86397c = (View) iView;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m17410e().clear();
    }
}