package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidTMNFragment$initView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidTMNFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidTMNFragment$initView$2(OnePostpaidTMNFragment onePostpaidTMNFragment) {
        super(0);
        this.this$0 = onePostpaidTMNFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneDialogBoxTMNConfirm.Companion companion = OneDialogBoxTMNConfirm.Companion;
        String string = this.this$0.getString(R.string.one_tmn_title);
        String string2 = this.this$0.getString(R.string.one_tmn_message);
        String string3 = this.this$0.getString(R.string.cancel_text);
        String string4 = this.this$0.getString(R.string.confirm_text);
        int fontColor = this.this$0.getViewModel().getThemeColorModel().getFontColor();
        int i = R.drawable.background_one_button_red;
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.one_tmn_message)");
        OneDialogBoxTMNConfirm newInstance$default = OneDialogBoxTMNConfirm.Companion.newInstance$default(companion, string, string2, string3, string4, false, Integer.valueOf(i), null, Integer.valueOf(fontColor), 80, null);
        final OnePostpaidTMNFragment onePostpaidTMNFragment = this.this$0;
        newInstance$default.setOnClickListener(new OneDialogBoxTMNConfirm.OnClickButtonListener() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment$initView$2$dialog$1$1
            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm.OnClickButtonListener
            public void onClickLeftButton() {
                OnePostpaidTMNFragment.this.m12292r("N");
            }

            @Override // th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogBoxTMNConfirm.OnClickButtonListener
            public void onClickRightButton() {
                OnePostpaidTMNFragment.this.m12292r("Y");
            }
        });
        FragmentManager fragmentManager = this.this$0.getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction();
            newInstance$default.show(fragmentManager, (String) null);
        }
    }
}