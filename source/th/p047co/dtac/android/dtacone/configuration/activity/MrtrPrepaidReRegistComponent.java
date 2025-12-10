package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist.MrtrPrepaidReRegistActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistFormMrtrFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistRequestOtpFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistSubmitFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistTabFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistVerifyOtpFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistCameraCustomerFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistPreviewImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistReferencePreviewFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.camera.MrtrPrepaidReregistTakeReferenceDocFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.input_document.MrtrPrepaidReregistInputDocumentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.smartcard.MrtrPrepaidReregistReadIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.telco.MrtrPrepaidReregistNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.fragment.slide_image.SlideImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrPrepaidReRegistComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_prepaid_reregist/MrtrPrepaidReRegistActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistFormMrtrFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistRequestOtpFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistSubmitFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistTabFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/MrtrPrepaidReregistVerifyOtpFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/camera/MrtrPrepaidReregistCameraCustomerFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/camera/MrtrPrepaidReregistCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/camera/MrtrPrepaidReregistPreviewImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/camera/MrtrPrepaidReregistReferencePreviewFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/camera/MrtrPrepaidReregistTakeReferenceDocFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/input_document/MrtrPrepaidReregistInputDocumentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/smartcard/MrtrPrepaidReregistReadIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_prepaid_reregist/telco/MrtrPrepaidReregistNonTelcoFragment;", "Lth/co/dtac/android/dtacone/view/fragment/slide_image/SlideImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/upPass/UpPassFormFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrPrepaidReRegistComponent */
/* loaded from: classes7.dex */
public interface MrtrPrepaidReRegistComponent extends AbstractActivityComponent<MrtrPrepaidReRegistActivity> {
    void inject(@NotNull MrtrPrepaidReregistFaceRecognitionFragment mrtrPrepaidReregistFaceRecognitionFragment);

    void inject(@NotNull MrtrPrepaidReregistFormMrtrFragment mrtrPrepaidReregistFormMrtrFragment);

    void inject(@NotNull MrtrPrepaidReregistRequestOtpFragment mrtrPrepaidReregistRequestOtpFragment);

    void inject(@NotNull MrtrPrepaidReregistSubmitFragment mrtrPrepaidReregistSubmitFragment);

    void inject(@NotNull MrtrPrepaidReregistSuccessFragment mrtrPrepaidReregistSuccessFragment);

    void inject(@NotNull MrtrPrepaidReregistTabFragment mrtrPrepaidReregistTabFragment);

    void inject(@NotNull MrtrPrepaidReregistVerifyOtpFragment mrtrPrepaidReregistVerifyOtpFragment);

    void inject(@NotNull MrtrPrepaidReregistCameraCustomerFragment mrtrPrepaidReregistCameraCustomerFragment);

    void inject(@NotNull MrtrPrepaidReregistCameraFragment mrtrPrepaidReregistCameraFragment);

    void inject(@NotNull MrtrPrepaidReregistPreviewImageFragment mrtrPrepaidReregistPreviewImageFragment);

    void inject(@NotNull MrtrPrepaidReregistReferencePreviewFragment mrtrPrepaidReregistReferencePreviewFragment);

    void inject(@NotNull MrtrPrepaidReregistTakeReferenceDocFragment mrtrPrepaidReregistTakeReferenceDocFragment);

    void inject(@NotNull MrtrPrepaidReregistInputDocumentFragment mrtrPrepaidReregistInputDocumentFragment);

    void inject(@NotNull MrtrPrepaidReregistReadIdCardFragment mrtrPrepaidReregistReadIdCardFragment);

    void inject(@NotNull MrtrPrepaidReregistNonTelcoFragment mrtrPrepaidReregistNonTelcoFragment);

    void inject(@NotNull SlideImageFragment slideImageFragment);

    void inject(@NotNull UpPassFormFragment upPassFormFragment);
}
