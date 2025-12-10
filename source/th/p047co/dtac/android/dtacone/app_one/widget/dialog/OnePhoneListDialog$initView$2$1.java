package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePhoneListDialog$initView$2$1 */
/* loaded from: classes7.dex */
public final class OnePhoneListDialog$initView$2$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OnePhoneListDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePhoneListDialog$initView$2$1(OnePhoneListDialog onePhoneListDialog) {
        super(1);
        this.this$0 = onePhoneListDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.f82996e = it;
        Function1<String, Unit> onButtonClick = this.this$0.getOnButtonClick();
        if (onButtonClick != null) {
            str = this.this$0.f82996e;
            onButtonClick.invoke(str);
        }
    }
}
