package th.p047co.dtac.android.dtacone.view.appOne.tol.fragment;

import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.vision.face.FaceDetector;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.util.CustomTabsUtil;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment_MembersInjector;

@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePassportCardFormFragment_MembersInjector */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlinePassportCardFormFragment_MembersInjector implements MembersInjector<OneRegisterTrueOnlinePassportCardFormFragment> {

    /* renamed from: a */
    public final Provider f97797a;

    /* renamed from: b */
    public final Provider f97798b;

    /* renamed from: c */
    public final Provider f97799c;

    /* renamed from: d */
    public final Provider f97800d;

    /* renamed from: e */
    public final Provider f97801e;

    /* renamed from: f */
    public final Provider f97802f;

    /* renamed from: g */
    public final Provider f97803g;

    public OneRegisterTrueOnlinePassportCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        this.f97797a = provider;
        this.f97798b = provider2;
        this.f97799c = provider3;
        this.f97800d = provider4;
        this.f97801e = provider5;
        this.f97802f = provider6;
        this.f97803g = provider7;
    }

    public static MembersInjector<OneRegisterTrueOnlinePassportCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        return new OneRegisterTrueOnlinePassportCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePassportCardFormFragment.fileUtil")
    public static void injectFileUtil(OneRegisterTrueOnlinePassportCardFormFragment oneRegisterTrueOnlinePassportCardFormFragment, FileUtil fileUtil) {
        oneRegisterTrueOnlinePassportCardFormFragment.fileUtil = fileUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneRegisterTrueOnlinePassportCardFormFragment oneRegisterTrueOnlinePassportCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(oneRegisterTrueOnlinePassportCardFormFragment, (InputMethodManager) this.f97797a.get());
        BaseFragment_MembersInjector.injectDetector(oneRegisterTrueOnlinePassportCardFormFragment, (FaceDetector) this.f97798b.get());
        BaseFragment_MembersInjector.injectPref(oneRegisterTrueOnlinePassportCardFormFragment, (PreferencesRepository) this.f97799c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(oneRegisterTrueOnlinePassportCardFormFragment, (MixpanelAPI) this.f97800d.get());
        BaseFragment_MembersInjector.injectCustomTabs(oneRegisterTrueOnlinePassportCardFormFragment, (CustomTabsUtil) this.f97801e.get());
        BaseFragment_MembersInjector.injectPfViewModel(oneRegisterTrueOnlinePassportCardFormFragment, (PreferencesViewModel) this.f97802f.get());
        injectFileUtil(oneRegisterTrueOnlinePassportCardFormFragment, (FileUtil) this.f97803g.get());
    }
}