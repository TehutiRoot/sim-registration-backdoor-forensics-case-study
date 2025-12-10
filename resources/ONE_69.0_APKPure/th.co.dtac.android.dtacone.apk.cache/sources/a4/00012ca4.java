package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;
import th.p047co.dtac.android.dtacone.model.blacklist.ExtraAdvanceMasterInformation;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceCheckBlackListAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueDeviceCheckBlackListAdapter_Factory implements Factory<OneDeviceSaleTrueDeviceCheckBlackListAdapter> {

    /* renamed from: a */
    public final Provider f89717a;

    /* renamed from: b */
    public final Provider f89718b;

    public OneDeviceSaleTrueDeviceCheckBlackListAdapter_Factory(Provider<ArrayList<ExtraAdvanceMasterInformation>> provider, Provider<OnePre2PostThemeModel> provider2) {
        this.f89717a = provider;
        this.f89718b = provider2;
    }

    public static OneDeviceSaleTrueDeviceCheckBlackListAdapter_Factory create(Provider<ArrayList<ExtraAdvanceMasterInformation>> provider, Provider<OnePre2PostThemeModel> provider2) {
        return new OneDeviceSaleTrueDeviceCheckBlackListAdapter_Factory(provider, provider2);
    }

    public static OneDeviceSaleTrueDeviceCheckBlackListAdapter newInstance(ArrayList<ExtraAdvanceMasterInformation> arrayList, OnePre2PostThemeModel onePre2PostThemeModel) {
        return new OneDeviceSaleTrueDeviceCheckBlackListAdapter(arrayList, onePre2PostThemeModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueDeviceCheckBlackListAdapter get() {
        return newInstance((ArrayList) this.f89717a.get(), (OnePre2PostThemeModel) this.f89718b.get());
    }
}