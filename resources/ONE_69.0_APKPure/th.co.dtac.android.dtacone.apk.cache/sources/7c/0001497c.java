package th.p047co.dtac.android.dtacone.view.fragment.change_pack;

import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageGroupModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.change_pack.ChangePackBaseFragment$checkBlocking$1$2 */
/* loaded from: classes9.dex */
public final class ChangePackBaseFragment$checkBlocking$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $screen;
    final /* synthetic */ ChangePackBaseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackBaseFragment$checkBlocking$1$2(ChangePackBaseFragment changePackBaseFragment, String str) {
        super(0);
        this.this$0 = changePackBaseFragment;
        this.$screen = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentManager fragmentManager;
        PackageGroupModel tmpSelectPackage = this.this$0.getViewModel().getTmpSelectPackage();
        if (tmpSelectPackage != null) {
            this.this$0.getViewModel().setPackage(tmpSelectPackage);
        }
        if (!Intrinsics.areEqual(this.$screen, ChangePackSearchFragment.TAG) || (fragmentManager = this.this$0.getFragmentManager()) == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}