package th.p047co.dtac.android.dtacone.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.device_sale.Blocking;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckBlockingResponse;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.CheckBlockingPackageType;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.CheckBlockingPackageTypeResponse;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0006¨\u0006\b"}, m29142d2 = {"checkIsBlocking", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/CheckBlockingPackageTypeResponse;", "it", "Lth/co/dtac/android/dtacone/model/device_sale/CheckBlockingResponse;", "isCanBuyDeviceWithContract", "", "", "isCheckExternalBlacklist", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.BlockingControllerKt */
/* loaded from: classes8.dex */
public final class BlockingControllerKt {
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