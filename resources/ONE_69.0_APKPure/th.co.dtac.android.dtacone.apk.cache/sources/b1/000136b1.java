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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment_MembersInjector */
/* loaded from: classes10.dex */
public final class OnePostpaidIdCardFormFragment_MembersInjector implements MembersInjector<OnePostpaidIdCardFormFragment> {

    /* renamed from: a */
    public final Provider f93464a;

    /* renamed from: b */
    public final Provider f93465b;

    /* renamed from: c */
    public final Provider f93466c;

    /* renamed from: d */
    public final Provider f93467d;

    /* renamed from: e */
    public final Provider f93468e;

    /* renamed from: f */
    public final Provider f93469f;

    /* renamed from: g */
    public final Provider f93470g;

    /* renamed from: h */
    public final Provider f93471h;

    public OnePostpaidIdCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7, Provider<InputMethodManager> provider8) {
        this.f93464a = provider;
        this.f93465b = provider2;
        this.f93466c = provider3;
        this.f93467d = provider4;
        this.f93468e = provider5;
        this.f93469f = provider6;
        this.f93470g = provider7;
        this.f93471h = provider8;
    }

    public static MembersInjector<OnePostpaidIdCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7, Provider<InputMethodManager> provider8) {
        return new OnePostpaidIdCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment.fileUtil")
    public static void injectFileUtil(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, FileUtil fileUtil) {
        onePostpaidIdCardFormFragment.fileUtil = fileUtil;
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.OnePostpaidIdCardFormFragment.inputMethodManager")
    public static void injectInputMethodManager(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment, InputMethodManager inputMethodManager) {
        onePostpaidIdCardFormFragment.inputMethodManager = inputMethodManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnePostpaidIdCardFormFragment onePostpaidIdCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(onePostpaidIdCardFormFragment, (InputMethodManager) this.f93464a.get());
        BaseFragment_MembersInjector.injectDetector(onePostpaidIdCardFormFragment, (FaceDetector) this.f93465b.get());
        BaseFragment_MembersInjector.injectPref(onePostpaidIdCardFormFragment, (PreferencesRepository) this.f93466c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(onePostpaidIdCardFormFragment, (MixpanelAPI) this.f93467d.get());
        BaseFragment_MembersInjector.injectCustomTabs(onePostpaidIdCardFormFragment, (CustomTabsUtil) this.f93468e.get());
        BaseFragment_MembersInjector.injectPfViewModel(onePostpaidIdCardFormFragment, (PreferencesViewModel) this.f93469f.get());
        injectFileUtil(onePostpaidIdCardFormFragment, (FileUtil) this.f93470g.get());
        injectInputMethodManager(onePostpaidIdCardFormFragment, (InputMethodManager) this.f93471h.get());
    }
}