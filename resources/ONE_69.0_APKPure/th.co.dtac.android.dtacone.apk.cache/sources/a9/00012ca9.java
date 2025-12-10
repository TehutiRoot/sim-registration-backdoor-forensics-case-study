package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.OneDeviceSaleDeviceModelPackageInfo;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OnePre2PostThemeModel;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.adapter.OneDeviceSaleTrueDeviceModelPackageInfoAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueDeviceModelPackageInfoAdapter_Factory implements Factory<OneDeviceSaleTrueDeviceModelPackageInfoAdapter> {

    /* renamed from: a */
    public final Provider f89724a;

    /* renamed from: b */
    public final Provider f89725b;

    public OneDeviceSaleTrueDeviceModelPackageInfoAdapter_Factory(Provider<ArrayList<OneDeviceSaleDeviceModelPackageInfo>> provider, Provider<OnePre2PostThemeModel> provider2) {
        this.f89724a = provider;
        this.f89725b = provider2;
    }

    public static OneDeviceSaleTrueDeviceModelPackageInfoAdapter_Factory create(Provider<ArrayList<OneDeviceSaleDeviceModelPackageInfo>> provider, Provider<OnePre2PostThemeModel> provider2) {
        return new OneDeviceSaleTrueDeviceModelPackageInfoAdapter_Factory(provider, provider2);
    }

    public static OneDeviceSaleTrueDeviceModelPackageInfoAdapter newInstance(ArrayList<OneDeviceSaleDeviceModelPackageInfo> arrayList, OnePre2PostThemeModel onePre2PostThemeModel) {
        return new OneDeviceSaleTrueDeviceModelPackageInfoAdapter(arrayList, onePre2PostThemeModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueDeviceModelPackageInfoAdapter get() {
        return newInstance((ArrayList) this.f89724a.get(), (OnePre2PostThemeModel) this.f89725b.get());
    }
}