package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "position", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostAllPackageUserLanFragment$showMainPackage$itemAdapter$1 */
/* loaded from: classes9.dex */
public final class C16330x1252a6b8 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ List<PackageGroups> $dataList;
    final /* synthetic */ MrtrPre2PostAllPackageUserLanFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16330x1252a6b8(MrtrPre2PostAllPackageUserLanFragment mrtrPre2PostAllPackageUserLanFragment, List<PackageGroups> list) {
        super(1);
        this.this$0 = mrtrPre2PostAllPackageUserLanFragment;
        this.$dataList = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.this$0.m5266r(this.$dataList.get(i), i);
    }
}