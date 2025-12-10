package th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.smartcard;

import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.widget.MrtrAttorneySmarCardDialog;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"th/co/dtac/android/dtacone/view/fragment/mrtr_change_sim/smartcard/MrtrChangeSimSmartCardFragment$setAttorneySmartCardDialog$1$1", "Lth/co/dtac/android/dtacone/widget/MrtrAttorneySmarCardDialog$OnButtonClickListener;", "", "onClickOkButton", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_change_sim.smartcard.MrtrChangeSimSmartCardFragment$setAttorneySmartCardDialog$1$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimSmartCardFragment$setAttorneySmartCardDialog$1$1 implements MrtrAttorneySmarCardDialog.OnButtonClickListener {

    /* renamed from: a */
    public final /* synthetic */ MrtrAttorneySmarCardDialog f102023a;

    /* renamed from: b */
    public final /* synthetic */ MrtrChangeSimSmartCardFragment f102024b;

    @Override // th.p047co.dtac.android.dtacone.widget.MrtrAttorneySmarCardDialog.OnButtonClickListener
    public void onClickOkButton() {
        this.f102023a.dismiss();
        this.f102024b.getCardReaderPresenter().setBitmapName(BitmapUtil.IMAGE_ATTORNEY_ID_CARD);
        this.f102024b.m6281C();
    }
}