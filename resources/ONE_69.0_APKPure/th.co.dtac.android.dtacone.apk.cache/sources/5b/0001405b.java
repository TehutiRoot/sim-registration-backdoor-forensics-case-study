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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment_MembersInjector */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineOtherCardFormFragment_MembersInjector implements MembersInjector<OneRegisterTrueOnlineOtherCardFormFragment> {

    /* renamed from: a */
    public final Provider f97786a;

    /* renamed from: b */
    public final Provider f97787b;

    /* renamed from: c */
    public final Provider f97788c;

    /* renamed from: d */
    public final Provider f97789d;

    /* renamed from: e */
    public final Provider f97790e;

    /* renamed from: f */
    public final Provider f97791f;

    /* renamed from: g */
    public final Provider f97792g;

    public OneRegisterTrueOnlineOtherCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        this.f97786a = provider;
        this.f97787b = provider2;
        this.f97788c = provider3;
        this.f97789d = provider4;
        this.f97790e = provider5;
        this.f97791f = provider6;
        this.f97792g = provider7;
    }

    public static MembersInjector<OneRegisterTrueOnlineOtherCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        return new OneRegisterTrueOnlineOtherCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineOtherCardFormFragment.fileUtil")
    public static void injectFileUtil(OneRegisterTrueOnlineOtherCardFormFragment oneRegisterTrueOnlineOtherCardFormFragment, FileUtil fileUtil) {
        oneRegisterTrueOnlineOtherCardFormFragment.fileUtil = fileUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OneRegisterTrueOnlineOtherCardFormFragment oneRegisterTrueOnlineOtherCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(oneRegisterTrueOnlineOtherCardFormFragment, (InputMethodManager) this.f97786a.get());
        BaseFragment_MembersInjector.injectDetector(oneRegisterTrueOnlineOtherCardFormFragment, (FaceDetector) this.f97787b.get());
        BaseFragment_MembersInjector.injectPref(oneRegisterTrueOnlineOtherCardFormFragment, (PreferencesRepository) this.f97788c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(oneRegisterTrueOnlineOtherCardFormFragment, (MixpanelAPI) this.f97789d.get());
        BaseFragment_MembersInjector.injectCustomTabs(oneRegisterTrueOnlineOtherCardFormFragment, (CustomTabsUtil) this.f97790e.get());
        BaseFragment_MembersInjector.injectPfViewModel(oneRegisterTrueOnlineOtherCardFormFragment, (PreferencesViewModel) this.f97791f.get());
        injectFileUtil(oneRegisterTrueOnlineOtherCardFormFragment, (FileUtil) this.f97792g.get());
    }
}