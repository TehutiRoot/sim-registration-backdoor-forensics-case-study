package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidRetailerSearchPackageGroupResponse;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/OnePostpaidRetailerSearchPackageGroupResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePostpaidPackagesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePostpaidPackagesViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,530:1\n1#2:531\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1 extends Lambda implements Function1<OnePostpaidRetailerSearchPackageGroupResponse, OnePostpaidSearchPackage> {
    final /* synthetic */ OnePostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1(OnePostpaidPackagesViewModel onePostpaidPackagesViewModel) {
        super(1);
        this.this$0 = onePostpaidPackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final OnePostpaidSearchPackage invoke(@NotNull OnePostpaidRetailerSearchPackageGroupResponse it) {
        boolean m11744x;
        boolean m11743y;
        OnePostpaidSearchPackage m11768F;
        Intrinsics.checkNotNullParameter(it, "it");
        OnePostpaidSearchPackage data = it.getData();
        if (data != null) {
            m11743y = this.this$0.m11743y(data);
            if (m11743y) {
                m11768F = this.this$0.m11768F(it.getData());
                return m11768F;
            }
        }
        OnePostpaidSearchPackage data2 = it.getData();
        if (data2 != null) {
            m11744x = this.this$0.m11744x(data2);
            if (m11744x) {
                return new OnePostpaidSearchPackage(it.getData().getPackages(), it.getData().getPaginate(), "ไม่พบแพ็กเกจที่ค้นหา\nใส่คำค้นหาเพิ่มเติม หรือใส่รหัสแพ็กเกจที่ต้องการดูนะคะ");
            }
        }
        return it.getData();
    }
}