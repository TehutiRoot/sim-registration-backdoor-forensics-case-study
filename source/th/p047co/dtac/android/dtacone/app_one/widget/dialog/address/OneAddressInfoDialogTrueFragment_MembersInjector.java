package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;

@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment_MembersInjector */
/* loaded from: classes7.dex */
public final class OneAddressInfoDialogTrueFragment_MembersInjector implements MembersInjector<OneAddressInfoDialogTrueFragment> {

    /* renamed from: a */
    public final Provider f83045a;

    public OneAddressInfoDialogTrueFragment_MembersInjector(Provider<RtrRx2Repository> provider) {
        this.f83045a = provider;
    }

    public static MembersInjector<OneAddressInfoDialogTrueFragment> create(Provider<RtrRx2Repository> provider) {
        return new OneAddressInfoDialogTrueFragment_MembersInjector(provider);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogTrueFragment.rtrRx2Repository")
    public static void injectRtrRx2Repository(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment, RtrRx2Repository rtrRx2Repository) {
        oneAddressInfoDialogTrueFragment.rtrRx2Repository = rtrRx2Repository;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneAddressInfoDialogTrueFragment oneAddressInfoDialogTrueFragment) {
        injectRtrRx2Repository(oneAddressInfoDialogTrueFragment, (RtrRx2Repository) this.f83045a.get());
    }
}
