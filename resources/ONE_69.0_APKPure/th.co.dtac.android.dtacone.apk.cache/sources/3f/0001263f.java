package th.p047co.dtac.android.dtacone.repository.print_receipt;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.print_receipt.PrintReceiptRepository_Factory */
/* loaded from: classes8.dex */
public final class PrintReceiptRepository_Factory implements Factory<PrintReceiptRepository> {

    /* renamed from: a */
    public final Provider f86963a;

    /* renamed from: b */
    public final Provider f86964b;

    public PrintReceiptRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        this.f86963a = provider;
        this.f86964b = provider2;
    }

    public static PrintReceiptRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        return new PrintReceiptRepository_Factory(provider, provider2);
    }

    public static PrintReceiptRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository) {
        return new PrintReceiptRepository(rTRApiRx2, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public PrintReceiptRepository get() {
        return newInstance((RTRApiRx2) this.f86963a.get(), (RtrRx2Repository) this.f86964b.get());
    }
}