package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment;

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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment_MembersInjector */
/* loaded from: classes10.dex */
public final class OnePostpaidOtherCardFormFragment_MembersInjector implements MembersInjector<OnePostpaidOtherCardFormFragment> {

    /* renamed from: a */
    public final Provider f93545a;

    /* renamed from: b */
    public final Provider f93546b;

    /* renamed from: c */
    public final Provider f93547c;

    /* renamed from: d */
    public final Provider f93548d;

    /* renamed from: e */
    public final Provider f93549e;

    /* renamed from: f */
    public final Provider f93550f;

    /* renamed from: g */
    public final Provider f93551g;

    public OnePostpaidOtherCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        this.f93545a = provider;
        this.f93546b = provider2;
        this.f93547c = provider3;
        this.f93548d = provider4;
        this.f93549e = provider5;
        this.f93550f = provider6;
        this.f93551g = provider7;
    }

    public static MembersInjector<OnePostpaidOtherCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        return new OnePostpaidOtherCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidOtherCardFormFragment.fileUtil")
    public static void injectFileUtil(OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment, FileUtil fileUtil) {
        onePostpaidOtherCardFormFragment.fileUtil = fileUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnePostpaidOtherCardFormFragment onePostpaidOtherCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(onePostpaidOtherCardFormFragment, (InputMethodManager) this.f93545a.get());
        BaseFragment_MembersInjector.injectDetector(onePostpaidOtherCardFormFragment, (FaceDetector) this.f93546b.get());
        BaseFragment_MembersInjector.injectPref(onePostpaidOtherCardFormFragment, (PreferencesRepository) this.f93547c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(onePostpaidOtherCardFormFragment, (MixpanelAPI) this.f93548d.get());
        BaseFragment_MembersInjector.injectCustomTabs(onePostpaidOtherCardFormFragment, (CustomTabsUtil) this.f93549e.get());
        BaseFragment_MembersInjector.injectPfViewModel(onePostpaidOtherCardFormFragment, (PreferencesViewModel) this.f93550f.get());
        injectFileUtil(onePostpaidOtherCardFormFragment, (FileUtil) this.f93551g.get());
    }
}