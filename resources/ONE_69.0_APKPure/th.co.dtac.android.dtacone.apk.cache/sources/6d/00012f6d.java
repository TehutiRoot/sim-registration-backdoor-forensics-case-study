package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

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
@SourceDebugExtension({"SMAP\nOneDeviceSalePackagesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSalePackagesViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackagesViewModel$searchOneDeviceSalePackageGroupRetailer$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,403:1\n1#2:404\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModel$searchOneDeviceSalePackageGroupRetailer$1 */
/* loaded from: classes10.dex */
public final class C14637x1e8ac021 extends Lambda implements Function1<OnePostpaidRetailerSearchPackageGroupResponse, OnePostpaidSearchPackage> {
    final /* synthetic */ OneDeviceSalePackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14637x1e8ac021(OneDeviceSalePackagesViewModel oneDeviceSalePackagesViewModel) {
        super(1);
        this.this$0 = oneDeviceSalePackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final OnePostpaidSearchPackage invoke(@NotNull OnePostpaidRetailerSearchPackageGroupResponse it) {
        boolean m14431s;
        boolean m14430t;
        OnePostpaidSearchPackage m14424z;
        Intrinsics.checkNotNullParameter(it, "it");
        OnePostpaidSearchPackage data = it.getData();
        if (data != null) {
            m14430t = this.this$0.m14430t(data);
            if (m14430t) {
                m14424z = this.this$0.m14424z(it.getData());
                return m14424z;
            }
        }
        OnePostpaidSearchPackage data2 = it.getData();
        if (data2 != null) {
            m14431s = this.this$0.m14431s(data2);
            if (m14431s) {
                return new OnePostpaidSearchPackage(it.getData().getPackages(), it.getData().getPaginate(), "ไม่พบแพ็กเกจที่ค้นหา\nใส่คำค้นหาเพิ่มเติม หรือใส่รหัสแพ็กเกจที่ต้องการดูนะคะ");
            }
        }
        return it.getData();
    }
}