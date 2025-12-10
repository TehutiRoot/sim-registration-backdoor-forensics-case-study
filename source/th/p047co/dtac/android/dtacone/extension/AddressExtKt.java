package th.p047co.dtac.android.dtacone.extension;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.Data;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;

@Metadata(m28851d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001\u001a \u0001\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\f0\u000f2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\f0\u000f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\f0\u000f2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\f0\u000f¨\u0006\u0019"}, m28850d2 = {"getDistrictFromProvince", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/DistrictsItem;", "", "province", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/ProvinceItem;", "getProvinceFromTrueLocation", "locationData", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "getSubDistrictFromDistrict", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/SubDistrictItem;", "district", "prefillAddressTrue", "", "Lth/co/dtac/android/dtacone/model/upPass/IdDocumentResult;", "onSelectProvice", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "provinceData", "onSelectDistrict", "districtData", "onSelectSubDistrict", "subDistrictData", "onSelectPostcode", "zipCode", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nAddressExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressExt.kt\nth/co/dtac/android/dtacone/extension/AddressExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n766#2:86\n857#2,2:87\n766#2:89\n857#2,2:90\n766#2:92\n857#2,2:93\n*S KotlinDebug\n*F\n+ 1 AddressExt.kt\nth/co/dtac/android/dtacone/extension/AddressExtKt\n*L\n44#1:86\n44#1:87,2\n59#1:89\n59#1:90,2\n74#1:92\n74#1:93,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.AddressExtKt */
/* loaded from: classes7.dex */
public final class AddressExtKt {
    @Nullable
    public static final DistrictsItem getDistrictFromProvince(@NotNull String str, @NotNull ProvinceItem province) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(province, "province");
        if (Intrinsics.areEqual(str, "")) {
            return null;
        }
        List<DistrictsItem> districts = province.getDistricts();
        if (districts != null) {
            arrayList = new ArrayList();
            for (Object obj : districts) {
                if (Intrinsics.areEqual(((DistrictsItem) obj).getTh(), StringsKt__StringsKt.trim(new Regex("(เขต|อำเภอ)").replace(str, "")).toString())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (DistrictsItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
    }

    @Nullable
    public static final ProvinceItem getProvinceFromTrueLocation(@NotNull String str, @NotNull OneCommonTrueLocationResponse locationData) {
        ArrayList arrayList;
        List<ProvinceItem> province;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        if (Intrinsics.areEqual(str, "")) {
            return null;
        }
        Data data = locationData.getData();
        if (data != null && (province = data.getProvince()) != null) {
            arrayList = new ArrayList();
            for (Object obj : province) {
                if (Intrinsics.areEqual(((ProvinceItem) obj).getTh(), StringsKt__StringsKt.trim(new Regex("(จังหวัด|จ\\.)").replace(str, "")).toString())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (ProvinceItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
    }

    @Nullable
    public static final SubDistrictItem getSubDistrictFromDistrict(@NotNull String str, @NotNull DistrictsItem district) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(district, "district");
        if (Intrinsics.areEqual(str, "")) {
            return null;
        }
        List<SubDistrictItem> subDistrict = district.getSubDistrict();
        if (subDistrict != null) {
            arrayList = new ArrayList();
            for (Object obj : subDistrict) {
                if (Intrinsics.areEqual(((SubDistrictItem) obj).getTh(), StringsKt__StringsKt.trim(new Regex("(เขต|อำเภอ)").replace(str, "")).toString())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (SubDistrictItem) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
    }

    public static final void prefillAddressTrue(@Nullable IdDocumentResult idDocumentResult, @NotNull OneCommonTrueLocationResponse locationData, @NotNull Function1<? super ProvinceItem, Unit> onSelectProvice, @NotNull Function1<? super DistrictsItem, Unit> onSelectDistrict, @NotNull Function1<? super SubDistrictItem, Unit> onSelectSubDistrict, @NotNull Function1<? super String, Unit> onSelectPostcode) {
        Intrinsics.checkNotNullParameter(locationData, "locationData");
        Intrinsics.checkNotNullParameter(onSelectProvice, "onSelectProvice");
        Intrinsics.checkNotNullParameter(onSelectDistrict, "onSelectDistrict");
        Intrinsics.checkNotNullParameter(onSelectSubDistrict, "onSelectSubDistrict");
        Intrinsics.checkNotNullParameter(onSelectPostcode, "onSelectPostcode");
        String str = "";
        String str2 = (idDocumentResult == null || (str2 = idDocumentResult.getProvince()) == null) ? "" : "";
        String str3 = (idDocumentResult == null || (str3 = idDocumentResult.getDistrict()) == null) ? "" : "";
        String str4 = (idDocumentResult == null || (str4 = idDocumentResult.getSubDistrict()) == null) ? "" : "";
        ProvinceItem provinceFromTrueLocation = getProvinceFromTrueLocation(str2, locationData);
        if (provinceFromTrueLocation == null) {
            return;
        }
        onSelectProvice.invoke(provinceFromTrueLocation);
        DistrictsItem districtFromProvince = getDistrictFromProvince(str3, provinceFromTrueLocation);
        if (districtFromProvince == null) {
            return;
        }
        onSelectDistrict.invoke(districtFromProvince);
        SubDistrictItem subDistrictFromDistrict = getSubDistrictFromDistrict(str4, districtFromProvince);
        if (subDistrictFromDistrict == null) {
            return;
        }
        onSelectSubDistrict.invoke(subDistrictFromDistrict);
        String zipCode = subDistrictFromDistrict.getZipCode();
        if (zipCode != null) {
            str = zipCode;
        }
        onSelectPostcode.invoke(str);
    }
}
