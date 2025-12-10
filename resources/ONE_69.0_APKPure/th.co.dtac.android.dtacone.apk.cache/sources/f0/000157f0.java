package th.p047co.dtac.android.dtacone.viewmodel.login_mrtr;

import androidx.lifecycle.MutableLiveData;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callOneLoginApi$7;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callOneLoginApi$7 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callOneLoginApi$7 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $userName;
    final /* synthetic */ LoginMrtrViewModel this$0;

    @Metadata(m29143d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m29142d2 = {"th/co/dtac/android/dtacone/viewmodel/login_mrtr/LoginMrtrViewModel$callOneLoginApi$7$2", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService$ExceptionHandler;", "handle", "", "e", "", "supportHttpCode", "", "code", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callOneLoginApi$7$2 */
    /* loaded from: classes9.dex */
    public static final class C165782 implements OneErrorService.ExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ LoginMrtrViewModel f106172a;

        /* renamed from: b */
        public final /* synthetic */ String f106173b;

        public C165782(LoginMrtrViewModel loginMrtrViewModel, String str) {
            this.f106172a = loginMrtrViewModel;
            this.f106173b = str;
        }

        /* renamed from: b */
        public static final void m2432b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
        public void handle(@Nullable Throwable th2) {
            MutableLiveData m2486G;
            MrtrErrorService mrtrErrorService;
            MutableLiveData m2485H;
            LoginRepository loginRepository;
            Rx2ThreadService rx2ThreadService;
            CompositeDisposable compositeDisposable;
            if (!(th2 instanceof ServerErrorException)) {
                m2486G = this.f106172a.m2486G();
                Resource.Companion companion = Resource.Companion;
                mrtrErrorService = this.f106172a.f106150g;
                m2486G.setValue(companion.success(mrtrErrorService.getErrorMessage(th2)));
                return;
            }
            ServerErrorException serverErrorException = (ServerErrorException) th2;
            if (AbstractC19741eO1.equals$default(serverErrorException.error().getStatusCode(), "10055155", false, 2, null)) {
                loginRepository = this.f106172a.f106145b;
                Single<WhatNewCollection.Android> minimumVersion = loginRepository.getMinimumVersion();
                final LoginMrtrViewModel$callOneLoginApi$7$2$handle$1 loginMrtrViewModel$callOneLoginApi$7$2$handle$1 = new LoginMrtrViewModel$callOneLoginApi$7$2$handle$1(this.f106172a);
                Single<WhatNewCollection.Android> doOnSubscribe = minimumVersion.doOnSubscribe(new Consumer() { // from class: Hl0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        LoginMrtrViewModel$callOneLoginApi$7.C165782.m2432b(loginMrtrViewModel$callOneLoginApi$7$2$handle$1, obj);
                    }
                });
                rx2ThreadService = this.f106172a.f106148e;
                Single<R> compose = doOnSubscribe.compose(rx2ThreadService.applySingleAsync());
                Intrinsics.checkNotNullExpressionValue(compose, "fun callOneLoginApi(user… .addTo(disposable)\n    }");
                Disposable subscribeBy = SubscribersKt.subscribeBy(compose, new LoginMrtrViewModel$callOneLoginApi$7$2$handle$2(this.f106172a), new LoginMrtrViewModel$callOneLoginApi$7$2$handle$3(this.f106172a));
                compositeDisposable = this.f106172a.f106153j;
                DisposableKt.addTo(subscribeBy, compositeDisposable);
                return;
            }
            m2485H = this.f106172a.m2485H();
            m2485H.setValue(Resource.Companion.success(new Pair(this.f106173b, serverErrorException)));
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i != 401;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callOneLoginApi$7(LoginMrtrViewModel loginMrtrViewModel, String str) {
        super(1);
        this.this$0 = loginMrtrViewModel;
        this.$userName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(@NotNull Throwable throwable) {
        MutableLiveData m2475R;
        LoginRepository loginRepository;
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m2475R = this.this$0.m2475R();
        m2475R.setValue(Resource.Companion.success(Boolean.FALSE));
        loginRepository = this.this$0.f106145b;
        loginRepository.setToken(null);
        loginRepository.setRetailerNumber(null);
        oneErrorService = this.this$0.f106151h;
        oneErrorService.handleException(throwable, new C165782(this.this$0, this.$userName));
    }
}