package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m29142d2 = {"th/co/dtac/android/dtacone/view/appOne/postpaid_registration/fragment/true_company/OnePostpaidReserveNumberListFragment$showDialogMaxAllow$dialog$1$1", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogBoxConfirm$OnClickButtonListener;", "", "onClickLeftButton", "()V", "onClickRightButton", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidReserveNumberListFragment$showDialogMaxAllow$dialog$1$1 */
/* loaded from: classes10.dex */
public final class C14967x4a1c15b9 implements OneDialogBoxConfirm.OnClickButtonListener {

    /* renamed from: a */
    public final /* synthetic */ OnePostpaidReserveNumberListFragment f94354a;

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
    public void onClickLeftButton() {
    }

    @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxConfirm.OnClickButtonListener
    public void onClickRightButton() {
        this.f94354a.getViewModel().verifyAndGenAutoApproveCode();
    }
}