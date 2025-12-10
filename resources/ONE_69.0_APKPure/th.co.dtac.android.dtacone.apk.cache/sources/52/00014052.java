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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment_MembersInjector */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineIdCardFormFragment_MembersInjector implements MembersInjector<OneRegisterTrueOnlineIdCardFormFragment> {

    /* renamed from: a */
    public final Provider f97765a;

    /* renamed from: b */
    public final Provider f97766b;

    /* renamed from: c */
    public final Provider f97767c;

    /* renamed from: d */
    public final Provider f97768d;

    /* renamed from: e */
    public final Provider f97769e;

    /* renamed from: f */
    public final Provider f97770f;

    /* renamed from: g */
    public final Provider f97771g;

    /* renamed from: h */
    public final Provider f97772h;

    public OneRegisterTrueOnlineIdCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7, Provider<InputMethodManager> provider8) {
        this.f97765a = provider;
        this.f97766b = provider2;
        this.f97767c = provider3;
        this.f97768d = provider4;
        this.f97769e = provider5;
        this.f97770f = provider6;
        this.f97771g = provider7;
        this.f97772h = provider8;
    }

    public static MembersInjector<OneRegisterTrueOnlineIdCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7, Provider<InputMethodManager> provider8) {
        return new OneRegisterTrueOnlineIdCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment.fileUtil")
    public static void injectFileUtil(OneRegisterTrueOnlineIdCardFormFragment oneRegisterTrueOnlineIdCardFormFragment, FileUtil fileUtil) {
        oneRegisterTrueOnlineIdCardFormFragment.fileUtil = fileUtil;
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineIdCardFormFragment.inputMethodManager")
    public static void injectInputMethodManager(OneRegisterTrueOnlineIdCardFormFragment oneRegisterTrueOnlineIdCardFormFragment, InputMethodManager inputMethodManager) {
        oneRegisterTrueOnlineIdCardFormFragment.inputMethodManager = inputMethodManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneRegisterTrueOnlineIdCardFormFragment oneRegisterTrueOnlineIdCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(oneRegisterTrueOnlineIdCardFormFragment, (InputMethodManager) this.f97765a.get());
        BaseFragment_MembersInjector.injectDetector(oneRegisterTrueOnlineIdCardFormFragment, (FaceDetector) this.f97766b.get());
        BaseFragment_MembersInjector.injectPref(oneRegisterTrueOnlineIdCardFormFragment, (PreferencesRepository) this.f97767c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(oneRegisterTrueOnlineIdCardFormFragment, (MixpanelAPI) this.f97768d.get());
        BaseFragment_MembersInjector.injectCustomTabs(oneRegisterTrueOnlineIdCardFormFragment, (CustomTabsUtil) this.f97769e.get());
        BaseFragment_MembersInjector.injectPfViewModel(oneRegisterTrueOnlineIdCardFormFragment, (PreferencesViewModel) this.f97770f.get());
        injectFileUtil(oneRegisterTrueOnlineIdCardFormFragment, (FileUtil) this.f97771g.get());
        injectInputMethodManager(oneRegisterTrueOnlineIdCardFormFragment, (InputMethodManager) this.f97772h.get());
    }
}