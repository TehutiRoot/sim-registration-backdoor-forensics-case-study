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
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;
import th.p047co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$7;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$7 */
/* loaded from: classes9.dex */
public final class LoginMrtrViewModel$callAPILoginMrtr$7 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $userName;
    final /* synthetic */ LoginMrtrViewModel this$0;

    @Metadata(m29143d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m29142d2 = {"th/co/dtac/android/dtacone/viewmodel/login_mrtr/LoginMrtrViewModel$callAPILoginMrtr$7$2", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService$ExceptionHandler;", "handle", "", "e", "", "supportHttpCode", "", "code", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.login_mrtr.LoginMrtrViewModel$callAPILoginMrtr$7$2 */
    /* loaded from: classes9.dex */
    public static final class C165772 implements MrtrErrorService.ExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ LoginMrtrViewModel f106170a;

        /* renamed from: b */
        public final /* synthetic */ String f106171b;

        public C165772(LoginMrtrViewModel loginMrtrViewModel, String str) {
            this.f106170a = loginMrtrViewModel;
            this.f106171b = str;
        }

        /* renamed from: b */
        public static final void m2435b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
        public void handle(@Nullable Throwable th2) {
            MutableLiveData m2486G;
            MrtrErrorService mrtrErrorService;
            MutableLiveData m2485H;
            LoginRepository loginRepository;
            Rx2ThreadService rx2ThreadService;
            CompositeDisposable compositeDisposable;
            if (!(th2 instanceof ServerErrorException)) {
                m2486G = this.f106170a.m2486G();
                Resource.Companion companion = Resource.Companion;
                mrtrErrorService = this.f106170a.f106150g;
                m2486G.setValue(companion.success(mrtrErrorService.getErrorMessage(th2)));
                return;
            }
            ServerErrorException serverErrorException = (ServerErrorException) th2;
            if (AbstractC19741eO1.equals$default(serverErrorException.error().getStatusCode(), "10055155", false, 2, null)) {
                loginRepository = this.f106170a.f106145b;
                Single<WhatNewCollection.Android> minimumVersion = loginRepository.getMinimumVersion();
                final LoginMrtrViewModel$callAPILoginMrtr$7$2$handle$1 loginMrtrViewModel$callAPILoginMrtr$7$2$handle$1 = new LoginMrtrViewModel$callAPILoginMrtr$7$2$handle$1(this.f106170a);
                Single<WhatNewCollection.Android> doOnSubscribe = minimumVersion.doOnSubscribe(new Consumer() { // from class: Gl0
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        LoginMrtrViewModel$callAPILoginMrtr$7.C165772.m2435b(loginMrtrViewModel$callAPILoginMrtr$7$2$handle$1, obj);
                    }
                });
                rx2ThreadService = this.f106170a.f106148e;
                Single<R> compose = doOnSubscribe.compose(rx2ThreadService.applySingleAsync());
                Intrinsics.checkNotNullExpressionValue(compose, "fun callAPILoginMrtr(use… .addTo(disposable)\n    }");
                Disposable subscribeBy = SubscribersKt.subscribeBy(compose, new LoginMrtrViewModel$callAPILoginMrtr$7$2$handle$2(this.f106170a), new LoginMrtrViewModel$callAPILoginMrtr$7$2$handle$3(this.f106170a));
                compositeDisposable = this.f106170a.f106153j;
                DisposableKt.addTo(subscribeBy, compositeDisposable);
                return;
            }
            m2485H = this.f106170a.m2485H();
            m2485H.setValue(Resource.Companion.success(new Pair(this.f106171b, serverErrorException)));
        }

        @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
        public boolean supportHttpCode(int i) {
            return i != 401;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginMrtrViewModel$callAPILoginMrtr$7(LoginMrtrViewModel loginMrtrViewModel, String str) {
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
        MrtrErrorService mrtrErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m2475R = this.this$0.m2475R();
        m2475R.setValue(Resource.Companion.success(Boolean.FALSE));
        loginRepository = this.this$0.f106145b;
        loginRepository.setToken(null);
        loginRepository.setRetailerNumber(null);
        mrtrErrorService = this.this$0.f106150g;
        mrtrErrorService.handleException(throwable, new C165772(this.this$0, this.$userName));
    }
}