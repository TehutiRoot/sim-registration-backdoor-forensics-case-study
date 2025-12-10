package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.dialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, m29142d2 = {"<anonymous>", "", "position", "", "filterTitle", "", "contactStatus", "", "unpaidBillCount", "dueStatus", "invoke", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.dialog.OneNadOutboundFilterDialogFragment$setupView$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundFilterDialogFragment$setupView$1 extends Lambda implements Function5<Integer, String, Boolean, String, String, Unit> {
    final /* synthetic */ OneNadOutboundFilterDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundFilterDialogFragment$setupView$1(OneNadOutboundFilterDialogFragment oneNadOutboundFilterDialogFragment) {
        super(5);
        this.this$0 = oneNadOutboundFilterDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, Boolean bool, String str2, String str3) {
        invoke(num.intValue(), str, bool, str2, str3);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, @Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
        OneNadOutboundViewModel m13376s;
        if (i != 0) {
            m13376s = this.this$0.m13376s();
            if (bool != null) {
                m13376s.getOneModel().setContactStatus(bool.booleanValue());
            }
            if (str2 != null && str2.length() != 0) {
                m13376s.getOneModel().setUnpaidBillCount(str2);
            }
            if (str3 != null && str3.length() != 0) {
                m13376s.getOneModel().setDueStatus(str3);
            }
            if (str == null) {
                str = "";
            }
            m13376s.onSelectedFilterItem(str);
        }
        this.this$0.dismiss();
    }
}