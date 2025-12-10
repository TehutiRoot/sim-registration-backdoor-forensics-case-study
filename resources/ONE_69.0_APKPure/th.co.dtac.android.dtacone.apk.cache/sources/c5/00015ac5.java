package th.p047co.dtac.android.dtacone.viewmodel.print_receipt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.print_receipt.PrintReceiptRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.print_receipt.PrintReceiptViewModel_Factory */
/* loaded from: classes9.dex */
public final class PrintReceiptViewModel_Factory implements Factory<PrintReceiptViewModel> {

    /* renamed from: a */
    public final Provider f107038a;

    /* renamed from: b */
    public final Provider f107039b;

    /* renamed from: c */
    public final Provider f107040c;

    public PrintReceiptViewModel_Factory(Provider<PrintReceiptRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f107038a = provider;
        this.f107039b = provider2;
        this.f107040c = provider3;
    }

    public static PrintReceiptViewModel_Factory create(Provider<PrintReceiptRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new PrintReceiptViewModel_Factory(provider, provider2, provider3);
    }

    public static PrintReceiptViewModel newInstance(PrintReceiptRepository printReceiptRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new PrintReceiptViewModel(printReceiptRepository, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public PrintReceiptViewModel get() {
        return newInstance((PrintReceiptRepository) this.f107038a.get(), (Rx2ThreadService) this.f107039b.get(), (ServerErrorService) this.f107040c.get());
    }
}