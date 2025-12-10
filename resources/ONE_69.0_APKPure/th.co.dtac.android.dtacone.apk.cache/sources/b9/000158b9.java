package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.postpaid_registration.PostpaidSearchPackage;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/postpaid_registration/PostpaidSearchPackage;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1 extends Lambda implements Function1<PostpaidSearchPackage, PostpaidSearchPackage> {
    final /* synthetic */ MrtrPostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidPackagesViewModel$searchPackageGroupRetailer$1(MrtrPostpaidPackagesViewModel mrtrPostpaidPackagesViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidPackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PostpaidSearchPackage invoke(@NotNull PostpaidSearchPackage it) {
        boolean m2313x;
        boolean m2312y;
        PostpaidSearchPackage m2337C;
        Intrinsics.checkNotNullParameter(it, "it");
        m2313x = this.this$0.m2313x(it);
        if (m2313x) {
            m2337C = this.this$0.m2337C(it);
            return m2337C;
        }
        m2312y = this.this$0.m2312y(it);
        return m2312y ? new PostpaidSearchPackage(it.getPackages(), it.getPaginate(), "ไม่พบแพ็กเกจที่ค้นหา ใส่คำค้นหาเพิ่มเติม หรือใส่รหัสแพ็กเกจที่ต้องการดูนะคะ") : it;
    }
}