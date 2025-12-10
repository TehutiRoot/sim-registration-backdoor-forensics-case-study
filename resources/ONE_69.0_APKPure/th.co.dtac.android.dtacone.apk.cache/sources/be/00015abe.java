package th.p047co.dtac.android.dtacone.viewmodel.print_receipt;

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
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.repository.print_receipt.PrintReceiptRepository;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.print_receipt.PrintReceiptViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/print_receipt/PrintReceiptViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/print_receipt/PrintReceiptRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/print_receipt/PrintReceiptRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;)V", "", "orderID", "orderNumber", "", "getReceiptBase64", "(Ljava/lang/String;Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/print_receipt/PrintReceiptRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", OperatorName.FILL_NON_ZERO, "Landroidx/lifecycle/MutableLiveData;", "_getReceiptBase64Response", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/LiveData;", "getGetReceiptBase64Response", "()Landroidx/lifecycle/LiveData;", "getReceiptBase64Response", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.print_receipt.PrintReceiptViewModel */
/* loaded from: classes9.dex */
public final class PrintReceiptViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final PrintReceiptRepository f107026b;

    /* renamed from: c */
    public final Rx2ThreadService f107027c;

    /* renamed from: d */
    public final ServerErrorService f107028d;

    /* renamed from: e */
    public final Lazy f107029e;

    /* renamed from: f */
    public final MutableLiveData f107030f;

    /* renamed from: g */
    public final LiveData f107031g;

    @Inject
    public PrintReceiptViewModel(@NotNull PrintReceiptRepository repository, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f107026b = repository;
        this.f107027c = threadService;
        this.f107028d = errorService;
        this.f107029e = LazyKt__LazyJVMKt.lazy(PrintReceiptViewModel$disposable$2.INSTANCE);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f107030f = mutableLiveData;
        this.f107031g = mutableLiveData;
    }

    /* renamed from: c */
    public static final void m1911c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final CompositeDisposable getDisposable() {
        return (CompositeDisposable) this.f107029e.getValue();
    }

    @NotNull
    public final LiveData<Resource<String>> getGetReceiptBase64Response() {
        return this.f107031g;
    }

    public final void getReceiptBase64(@NotNull String orderID, @NotNull String orderNumber) {
        Intrinsics.checkNotNullParameter(orderID, "orderID");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        Single<R> compose = this.f107026b.printReceipt(orderID, orderNumber).compose(this.f107027c.applySingleAsync());
        final PrintReceiptViewModel$getReceiptBase64$1 printReceiptViewModel$getReceiptBase64$1 = new PrintReceiptViewModel$getReceiptBase64$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Jo1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PrintReceiptViewModel.m1911c(printReceiptViewModel$getReceiptBase64$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getReceiptBase64(ord…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new PrintReceiptViewModel$getReceiptBase64$2(this), new PrintReceiptViewModel$getReceiptBase64$3(this)), getDisposable());
    }
}