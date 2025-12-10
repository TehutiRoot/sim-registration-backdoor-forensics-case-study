package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.Data;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.OneMnpTruePackageListResponse;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.PackagesItem;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.MnpQueryPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.PackageSetListItem;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/MnpQueryPackageSetResponse;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/OneMnpTruePackageListResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneMnpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMnpViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/viewModel/OneMnpViewModel$queryPackageSetTrue$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3332:1\n1855#2,2:3333\n*S KotlinDebug\n*F\n+ 1 OneMnpViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/mnp/viewModel/OneMnpViewModel$queryPackageSetTrue$1\n*L\n775#1:3333,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$queryPackageSetTrue$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$queryPackageSetTrue$1 extends Lambda implements Function1<OneMnpTruePackageListResponse, MnpQueryPackageSetResponse> {
    public static final OneMnpViewModel$queryPackageSetTrue$1 INSTANCE = new OneMnpViewModel$queryPackageSetTrue$1();

    public OneMnpViewModel$queryPackageSetTrue$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MnpQueryPackageSetResponse invoke(@NotNull OneMnpTruePackageListResponse it) {
        List<PackagesItem> packages;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList();
        Data data = it.getData();
        if (data != null && (packages = data.getPackages()) != null) {
            for (PackagesItem packagesItem : packages) {
                arrayList.add(new PackageSetListItem(packagesItem.getVoiceData(), packagesItem.getPrice(), packagesItem.getWifiData(), packagesItem.getPricePlanName(), packagesItem.getPricePlanCode(), "", null, "", packagesItem.getPricePlanDesc(), packagesItem.getInternetData()));
            }
        }
        return new MnpQueryPackageSetResponse(arrayList);
    }
}