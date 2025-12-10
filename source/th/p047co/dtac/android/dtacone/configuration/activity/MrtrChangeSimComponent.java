package th.p047co.dtac.android.dtacone.configuration.activity;

import dagger.Subcomponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.configuration.AbstractActivityComponent;
import th.p047co.dtac.android.dtacone.configuration.PerActivity;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_changesim.MrtrChangeSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimChooseAttorneyFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimFaceRecognitionFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimPreviewOptionalImageFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimSignatureFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimSuccessFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimUpPassFlowFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.MrtrChangeSimWriteSimFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.camera.MrtrChangeSimCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.camera.MrtrChangeSimIdCardCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.camera.MrtrChangeSimIdFormFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.camera.MrtrChangeSimPreviewCustomerCameraFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.camera.MrtrChangeSimPreviewIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.payment.MrtrChangeSimAddressRecieptFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.payment.MrtrChangeSimPaymentFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.payment.address.MrtrChangeSimInputAddressIdCardFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.payment.address.MrtrChangeSimInputAddressPassportFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.payment.address.MrtrChangeSimInputAddressPersonFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMInProgressFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMShowQrCodeFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.smartcard.MrtrChangeSimSmartCardFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.AddressDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.address.MrtrAddressDialogFragment;

@Subcomponent(modules = {ActivityModule.class})
@Metadata(m28851d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0014H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0016H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0017H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0018H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0019H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001aH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001cH&¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/activity/MrtrChangeSimComponent;", "Lth/co/dtac/android/dtacone/configuration/AbstractActivityComponent;", "Lth/co/dtac/android/dtacone/view/activity/mrtr_changesim/MrtrChangeSimActivity;", "inject", "", "fragment", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimChooseAttorneyFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimFaceRecognitionFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimPreviewOptionalImageFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimSignatureFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimSuccessFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimUpPassFlowFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/MrtrChangeSimWriteSimFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/camera/MrtrChangeSimCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/camera/MrtrChangeSimIdCardCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/camera/MrtrChangeSimIdFormFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/camera/MrtrChangeSimPreviewCustomerCameraFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/camera/MrtrChangeSimPreviewIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/payment/MrtrChangeSimAddressRecieptFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/payment/MrtrChangeSimPaymentFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/payment/address/MrtrChangeSimInputAddressIdCardFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/payment/address/MrtrChangeSimInputAddressPassportFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/payment/address/MrtrChangeSimInputAddressPersonFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/qrCode/ESimChangeSIMInProgressFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/qrCode/ESimChangeSIMShowQrCodeFragment;", "Lth/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/smartcard/MrtrChangeSimSmartCardFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/AddressDialogFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/address/MrtrAddressDialogFragment;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@PerActivity
/* renamed from: th.co.dtac.android.dtacone.configuration.activity.MrtrChangeSimComponent */
/* loaded from: classes7.dex */
public interface MrtrChangeSimComponent extends AbstractActivityComponent<MrtrChangeSimActivity> {
    void inject(@NotNull MrtrChangeSimChooseAttorneyFragment mrtrChangeSimChooseAttorneyFragment);

    void inject(@NotNull MrtrChangeSimFaceRecognitionFragment mrtrChangeSimFaceRecognitionFragment);

    void inject(@NotNull MrtrChangeSimFormFragment mrtrChangeSimFormFragment);

    void inject(@NotNull MrtrChangeSimPreviewOptionalImageFragment mrtrChangeSimPreviewOptionalImageFragment);

    void inject(@NotNull MrtrChangeSimSignatureFragment mrtrChangeSimSignatureFragment);

    void inject(@NotNull MrtrChangeSimSuccessFragment mrtrChangeSimSuccessFragment);

    void inject(@NotNull MrtrChangeSimUpPassFlowFragment mrtrChangeSimUpPassFlowFragment);

    void inject(@NotNull MrtrChangeSimWriteSimFragment mrtrChangeSimWriteSimFragment);

    void inject(@NotNull MrtrChangeSimCustomerCameraFragment mrtrChangeSimCustomerCameraFragment);

    void inject(@NotNull MrtrChangeSimIdCardCameraFragment mrtrChangeSimIdCardCameraFragment);

    void inject(@NotNull MrtrChangeSimIdFormFragment mrtrChangeSimIdFormFragment);

    void inject(@NotNull MrtrChangeSimPreviewCustomerCameraFragment mrtrChangeSimPreviewCustomerCameraFragment);

    void inject(@NotNull MrtrChangeSimPreviewIdCardFragment mrtrChangeSimPreviewIdCardFragment);

    void inject(@NotNull MrtrChangeSimAddressRecieptFragment mrtrChangeSimAddressRecieptFragment);

    void inject(@NotNull MrtrChangeSimPaymentFragment mrtrChangeSimPaymentFragment);

    void inject(@NotNull MrtrChangeSimInputAddressIdCardFragment mrtrChangeSimInputAddressIdCardFragment);

    void inject(@NotNull MrtrChangeSimInputAddressPassportFragment mrtrChangeSimInputAddressPassportFragment);

    void inject(@NotNull MrtrChangeSimInputAddressPersonFragment mrtrChangeSimInputAddressPersonFragment);

    void inject(@NotNull ESimChangeSIMInProgressFragment eSimChangeSIMInProgressFragment);

    void inject(@NotNull ESimChangeSIMShowQrCodeFragment eSimChangeSIMShowQrCodeFragment);

    void inject(@NotNull MrtrChangeSimSmartCardFragment mrtrChangeSimSmartCardFragment);

    void inject(@NotNull AddressDialogFragment addressDialogFragment);

    void inject(@NotNull MrtrAddressDialogFragment mrtrAddressDialogFragment);
}
