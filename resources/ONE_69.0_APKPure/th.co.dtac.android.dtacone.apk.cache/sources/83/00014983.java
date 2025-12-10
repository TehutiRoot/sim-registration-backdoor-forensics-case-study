package th.p047co.dtac.android.dtacone.view.fragment.change_pack;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.change_pack.ChangePackIdentityFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class ChangePackIdentityFragment$onViewCreated$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChangePackIdentityFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackIdentityFragment$onViewCreated$3(ChangePackIdentityFragment changePackIdentityFragment) {
        super(0);
        this.this$0 = changePackIdentityFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DtacClearableEditText dtacClearableEditText;
        DtacCheckBox dtacCheckBox;
        dtacClearableEditText = this.this$0.f98968j;
        DtacCheckBox dtacCheckBox2 = null;
        if (dtacClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etIdentityNumber");
            dtacClearableEditText = null;
        }
        String obj = StringsKt__StringsKt.trim(StringsKt__StringsKt.removeRange(String.valueOf(dtacClearableEditText.getText()), 0, 11).toString()).toString();
        dtacCheckBox = this.this$0.f98969k;
        if (dtacCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkIdExpiration");
        } else {
            dtacCheckBox2 = dtacCheckBox;
        }
        this.this$0.getViewModel().checkOwner(obj, dtacCheckBox2.isChecked());
    }
}