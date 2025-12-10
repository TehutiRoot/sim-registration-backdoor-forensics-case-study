package th.p047co.dtac.android.dtacone.app_one.widget.dialog.address;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.presenter.address.QueryAddressFromDbPresenter;
import th.p047co.dtac.android.dtacone.presenter.address.QueryAddressPresenter;

@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment_MembersInjector */
/* loaded from: classes7.dex */
public final class OneAddressInfoDialogFragment_MembersInjector implements MembersInjector<OneAddressInfoDialogFragment> {

    /* renamed from: a */
    public final Provider f83029a;

    /* renamed from: b */
    public final Provider f83030b;

    public OneAddressInfoDialogFragment_MembersInjector(Provider<QueryAddressFromDbPresenter> provider, Provider<QueryAddressPresenter> provider2) {
        this.f83029a = provider;
        this.f83030b = provider2;
    }

    public static MembersInjector<OneAddressInfoDialogFragment> create(Provider<QueryAddressFromDbPresenter> provider, Provider<QueryAddressPresenter> provider2) {
        return new OneAddressInfoDialogFragment_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment.queryAddressApiPresenter")
    public static void injectQueryAddressApiPresenter(OneAddressInfoDialogFragment oneAddressInfoDialogFragment, QueryAddressPresenter queryAddressPresenter) {
        oneAddressInfoDialogFragment.queryAddressApiPresenter = queryAddressPresenter;
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.app_one.widget.dialog.address.OneAddressInfoDialogFragment.queryDbPresenter")
    public static void injectQueryDbPresenter(OneAddressInfoDialogFragment oneAddressInfoDialogFragment, QueryAddressFromDbPresenter queryAddressFromDbPresenter) {
        oneAddressInfoDialogFragment.queryDbPresenter = queryAddressFromDbPresenter;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneAddressInfoDialogFragment oneAddressInfoDialogFragment) {
        injectQueryDbPresenter(oneAddressInfoDialogFragment, (QueryAddressFromDbPresenter) this.f83029a.get());
        injectQueryAddressApiPresenter(oneAddressInfoDialogFragment, (QueryAddressPresenter) this.f83030b.get());
    }
}
