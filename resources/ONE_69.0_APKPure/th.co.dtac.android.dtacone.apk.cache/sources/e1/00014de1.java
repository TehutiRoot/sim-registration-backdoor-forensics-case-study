package th.p047co.dtac.android.dtacone.view.fragment.home;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.adapter.home.GroupServiceAdapter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "itemPosition", "", "invoke", "(I)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.home.HomeFragment$initView$3 */
/* loaded from: classes9.dex */
public final class HomeFragment$initView$3 extends Lambda implements Function1<Integer, Boolean> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$initView$3(HomeFragment homeFragment) {
        super(1);
        this.this$0 = homeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Boolean invoke(int i) {
        boolean z;
        GroupServiceAdapter groupServiceAdapter;
        if (i >= 0) {
            groupServiceAdapter = this.this$0.f101453l;
            if (groupServiceAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                groupServiceAdapter = null;
            }
            if (i < groupServiceAdapter.getItemCount() && i % 2 == 0) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}