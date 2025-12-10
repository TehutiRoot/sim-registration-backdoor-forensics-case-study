package th.p047co.dtac.android.dtacone;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import io.realm.RealmConfiguration;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.config.MobileConfigService;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;

@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.MobileRTRApplication_MembersInjector */
/* loaded from: classes7.dex */
public final class MobileRTRApplication_MembersInjector implements MembersInjector<MobileRTRApplication> {

    /* renamed from: a */
    public final Provider f80923a;

    /* renamed from: b */
    public final Provider f80924b;

    /* renamed from: c */
    public final Provider f80925c;

    public MobileRTRApplication_MembersInjector(Provider<RealmConfiguration> provider, Provider<LanguageService> provider2, Provider<MobileConfigService> provider3) {
        this.f80923a = provider;
        this.f80924b = provider2;
        this.f80925c = provider3;
    }

    public static MembersInjector<MobileRTRApplication> create(Provider<RealmConfiguration> provider, Provider<LanguageService> provider2, Provider<MobileConfigService> provider3) {
        return new MobileRTRApplication_MembersInjector(provider, provider2, provider3);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.MobileRTRApplication.configService")
    public static void injectConfigService(MobileRTRApplication mobileRTRApplication, MobileConfigService mobileConfigService) {
        mobileRTRApplication.f80919c = mobileConfigService;
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.MobileRTRApplication.languageService")
    public static void injectLanguageService(MobileRTRApplication mobileRTRApplication, LanguageService languageService) {
        mobileRTRApplication.f80918b = languageService;
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.MobileRTRApplication.realmConfiguration")
    public static void injectRealmConfiguration(MobileRTRApplication mobileRTRApplication, RealmConfiguration realmConfiguration) {
        mobileRTRApplication.f80917a = realmConfiguration;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MobileRTRApplication mobileRTRApplication) {
        injectRealmConfiguration(mobileRTRApplication, (RealmConfiguration) this.f80923a.get());
        injectLanguageService(mobileRTRApplication, (LanguageService) this.f80924b.get());
        injectConfigService(mobileRTRApplication, (MobileConfigService) this.f80925c.get());
    }
}
