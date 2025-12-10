package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from;

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
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment_MembersInjector */
/* loaded from: classes9.dex */
public final class MrtrPostpaidOtherCardFormFragment_MembersInjector implements MembersInjector<MrtrPostpaidOtherCardFormFragment> {

    /* renamed from: a */
    public final Provider f102479a;

    /* renamed from: b */
    public final Provider f102480b;

    /* renamed from: c */
    public final Provider f102481c;

    /* renamed from: d */
    public final Provider f102482d;

    /* renamed from: e */
    public final Provider f102483e;

    /* renamed from: f */
    public final Provider f102484f;

    /* renamed from: g */
    public final Provider f102485g;

    public MrtrPostpaidOtherCardFormFragment_MembersInjector(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        this.f102479a = provider;
        this.f102480b = provider2;
        this.f102481c = provider3;
        this.f102482d = provider4;
        this.f102483e = provider5;
        this.f102484f = provider6;
        this.f102485g = provider7;
    }

    public static MembersInjector<MrtrPostpaidOtherCardFormFragment> create(Provider<InputMethodManager> provider, Provider<FaceDetector> provider2, Provider<PreferencesRepository> provider3, Provider<MixpanelAPI> provider4, Provider<CustomTabsUtil> provider5, Provider<PreferencesViewModel> provider6, Provider<FileUtil> provider7) {
        return new MrtrPostpaidOtherCardFormFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @InjectedFieldSignature("th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.from.MrtrPostpaidOtherCardFormFragment.fileUtil")
    public static void injectFileUtil(MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment, FileUtil fileUtil) {
        mrtrPostpaidOtherCardFormFragment.fileUtil = fileUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MrtrPostpaidOtherCardFormFragment mrtrPostpaidOtherCardFormFragment) {
        BaseFragment_MembersInjector.injectImManager(mrtrPostpaidOtherCardFormFragment, (InputMethodManager) this.f102479a.get());
        BaseFragment_MembersInjector.injectDetector(mrtrPostpaidOtherCardFormFragment, (FaceDetector) this.f102480b.get());
        BaseFragment_MembersInjector.injectPref(mrtrPostpaidOtherCardFormFragment, (PreferencesRepository) this.f102481c.get());
        BaseFragment_MembersInjector.injectMixpanelAPI(mrtrPostpaidOtherCardFormFragment, (MixpanelAPI) this.f102482d.get());
        BaseFragment_MembersInjector.injectCustomTabs(mrtrPostpaidOtherCardFormFragment, (CustomTabsUtil) this.f102483e.get());
        BaseFragment_MembersInjector.injectPfViewModel(mrtrPostpaidOtherCardFormFragment, (PreferencesViewModel) this.f102484f.get());
        injectFileUtil(mrtrPostpaidOtherCardFormFragment, (FileUtil) this.f102485g.get());
    }
}