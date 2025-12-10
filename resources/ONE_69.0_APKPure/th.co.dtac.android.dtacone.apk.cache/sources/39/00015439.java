package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.Blocking;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckBlockingRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckBlockingResponse;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.util.p052enum.PackageType;
import th.p047co.dtac.android.dtacone.util.p052enum.PackageTypeKt;
import th.p047co.dtac.android.dtacone.util.p052enum.StartDateOption;
import th.p047co.dtac.android.dtacone.util.p052enum.TelephoneType;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.RemovePackageSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.CheckBlockingPackageType;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.CheckBlockingPackageTypeResponse;

@Metadata(m29143d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\u001aF\u0010\f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0003\u001a\n\u0010\u0015\u001a\u00020\u0014*\u00020\u0003¨\u0006\u0016"}, m29142d2 = {"checkBlockingExpireRequest", "Lth/co/dtac/android/dtacone/model/device_sale/CheckBlockingRequest;", RemovePackageSummaryFragment.SpecificDate, "", "packageRequestMode", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "customerNumber", "packageGroupCode", "packageCode", "packageType", ConstsKt.TELEPHONE_TYPE, "Lth/co/dtac/android/dtacone/util/enum/TelephoneType;", "checkBlockingRequest", "newPackageGroupCode", "startDateOption", "checkIsBlocking", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/CheckBlockingPackageTypeResponse;", "it", "Lth/co/dtac/android/dtacone/model/device_sale/CheckBlockingResponse;", "isCanBuyDeviceWithContract", "", "isCheckExternalBlacklist", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.ControllerKt */
/* loaded from: classes9.dex */
public final class ControllerKt {
    @NotNull
    public static final CheckBlockingRequest checkBlockingExpireRequest(@NotNull String specificDate, @NotNull String packageRequestMode, @NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String packageGroupCode, @NotNull String packageCode, @NotNull String packageType, @NotNull TelephoneType telephoneType) {
        String str;
        Intrinsics.checkNotNullParameter(specificDate, "specificDate");
        Intrinsics.checkNotNullParameter(packageRequestMode, "packageRequestMode");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        if (Intrinsics.areEqual(packageType, "10")) {
            str = packageGroupCode;
        } else {
            str = packageCode;
        }
        return new CheckBlockingRequest(null, null, null, customerNumber, "", str, "3", subscriberNumber, telephoneType.getType(), "", "Y", specificDate, packageRequestMode, 7, null);
    }

    @NotNull
    public static final CheckBlockingRequest checkBlockingRequest(@NotNull String subscriberNumber, @NotNull String customerNumber, @NotNull String packageGroupCode, @NotNull String str, @NotNull String packageCode, @NotNull String startDateOption, @NotNull String packageType, @NotNull TelephoneType telephoneType) {
        PackageType packageType2;
        String str2;
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        String newPackageGroupCode = str;
        Intrinsics.checkNotNullParameter(newPackageGroupCode, "newPackageGroupCode");
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        Intrinsics.checkNotNullParameter(startDateOption, "startDateOption");
        Intrinsics.checkNotNullParameter(packageType, "packageType");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        boolean areEqual = Intrinsics.areEqual(packageType, "10");
        if (areEqual) {
            packageType2 = PackageType.MainPackage;
        } else {
            packageType2 = PackageType.AddtionalPackage;
        }
        if (!areEqual) {
            newPackageGroupCode = "";
        }
        String str3 = newPackageGroupCode;
        if (areEqual) {
            str2 = packageGroupCode;
        } else {
            str2 = packageCode;
        }
        StartDateOption.Companion companion = StartDateOption.Companion;
        return new CheckBlockingRequest(null, null, null, customerNumber, str3, str2, PackageTypeKt.getSaveFlagFromStartDateOption(packageType2, companion.fromType(startDateOption)), subscriberNumber, telephoneType.getType(), PackageTypeKt.getTransactionTypeFromStartDateOption(packageType2, companion.fromType(startDateOption)), null, null, null, 7175, null);
    }

    @NotNull
    public static final CheckBlockingPackageTypeResponse checkIsBlocking(@NotNull CheckBlockingResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Blocking blocking = it.getBlocking();
        if (blocking.getTotal() != 0 && !Intrinsics.areEqual(blocking.getUserType(), "B")) {
            return new CheckBlockingPackageTypeResponse(CheckBlockingPackageType.Warning, blocking.getCodeSequence(), blocking.getDescriptionThai(), blocking.getDescriptionEnglish());
        }
        if (blocking.getTotal() != 0 && Intrinsics.areEqual(blocking.getUserType(), "B")) {
            return new CheckBlockingPackageTypeResponse(CheckBlockingPackageType.Blocking, blocking.getCodeSequence(), blocking.getDescriptionThai(), blocking.getDescriptionEnglish());
        }
        return new CheckBlockingPackageTypeResponse(CheckBlockingPackageType.UnBlocking, null, null, null, 14, null);
    }

    public static final boolean isCanBuyDeviceWithContract(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AbstractC19741eO1.equals(str, "Y", true);
    }

    public static final boolean isCheckExternalBlacklist(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AbstractC19741eO1.equals(str, "Y", true);
    }
}