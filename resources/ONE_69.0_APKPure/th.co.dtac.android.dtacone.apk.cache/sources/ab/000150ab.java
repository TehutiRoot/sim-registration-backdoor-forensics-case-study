package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import android.app.Dialog;
import kotlin.Metadata;
import th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m29142d2 = {"th/co/dtac/android/dtacone/view/fragment/mrtr_pre2post/MrtrPre2PostIdCardFormFragment$showDialogConfirmTakeReferenceDoc$dialog$1$1", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrDialogBoxConfirm$OnClickButtonListener;", "", "onClickLeftButton", "()V", "onClickRightButton", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostIdCardFormFragment$showDialogConfirmTakeReferenceDoc$dialog$1$1 */
/* loaded from: classes9.dex */
public final class C16340xd5c26d8a implements MrtrDialogBoxConfirm.OnClickButtonListener {

    /* renamed from: a */
    public final /* synthetic */ MrtrPre2PostIdCardFormFragment f103140a;

    /* renamed from: b */
    public final /* synthetic */ MrtrDialogBoxConfirm f103141b;

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm.OnClickButtonListener
    public void onClickLeftButton() {
        this.f103140a.m5198q();
        Dialog dialog = this.f103141b.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm.OnClickButtonListener
    public void onClickRightButton() {
        this.f103140a.m5199p();
        Dialog dialog = this.f103141b.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}