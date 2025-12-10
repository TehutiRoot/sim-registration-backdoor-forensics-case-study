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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.print_receipt.PrintReceiptViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class PrintReceiptViewModelFactory_Factory implements Factory<PrintReceiptViewModelFactory> {

    /* renamed from: a */
    public final Provider f107035a;

    /* renamed from: b */
    public final Provider f107036b;

    /* renamed from: c */
    public final Provider f107037c;

    public PrintReceiptViewModelFactory_Factory(Provider<PrintReceiptRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f107035a = provider;
        this.f107036b = provider2;
        this.f107037c = provider3;
    }

    public static PrintReceiptViewModelFactory_Factory create(Provider<PrintReceiptRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new PrintReceiptViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static PrintReceiptViewModelFactory newInstance(PrintReceiptRepository printReceiptRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new PrintReceiptViewModelFactory(printReceiptRepository, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public PrintReceiptViewModelFactory get() {
        return newInstance((PrintReceiptRepository) this.f107035a.get(), (Rx2ThreadService) this.f107036b.get(), (ServerErrorService) this.f107037c.get());
    }
}