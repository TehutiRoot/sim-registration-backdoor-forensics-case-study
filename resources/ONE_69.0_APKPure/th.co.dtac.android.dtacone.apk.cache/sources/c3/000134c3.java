package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.adapter;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegistrationAdditionalPictureResponse;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneOnlineRegistrationBankAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineRegistrationBankAdapter_Factory implements Factory<OneOnlineRegistrationBankAdapter> {

    /* renamed from: a */
    public final Provider f92556a;

    /* renamed from: b */
    public final Provider f92557b;

    public OneOnlineRegistrationBankAdapter_Factory(Provider<Activity> provider, Provider<List<OneOnlineRegistrationAdditionalPictureResponse>> provider2) {
        this.f92556a = provider;
        this.f92557b = provider2;
    }

    public static OneOnlineRegistrationBankAdapter_Factory create(Provider<Activity> provider, Provider<List<OneOnlineRegistrationAdditionalPictureResponse>> provider2) {
        return new OneOnlineRegistrationBankAdapter_Factory(provider, provider2);
    }

    public static OneOnlineRegistrationBankAdapter newInstance(Activity activity, List<OneOnlineRegistrationAdditionalPictureResponse> list) {
        return new OneOnlineRegistrationBankAdapter(activity, list);
    }

    @Override // javax.inject.Provider
    public OneOnlineRegistrationBankAdapter get() {
        return newInstance((Activity) this.f92556a.get(), (List) this.f92557b.get());
    }
}