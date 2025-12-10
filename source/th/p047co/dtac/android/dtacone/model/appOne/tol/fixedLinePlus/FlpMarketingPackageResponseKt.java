package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m28850d2 = {"formatMktOfferName", "", "item", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpOffer;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpMarketingPackageResponseKt */
/* loaded from: classes8.dex */
public final class FlpMarketingPackageResponseKt {
    @NotNull
    public static final String formatMktOfferName(@NotNull FlpOffer item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String mktOfferName = item.getMktOfferName();
        String mktOfferCode = item.getMktOfferCode();
        if (AbstractC20204hN1.startsWith$default(mktOfferName, mktOfferCode + " :", false, 2, null)) {
            return item.getMktOfferName();
        }
        String mktOfferCode2 = item.getMktOfferCode();
        String mktOfferName2 = item.getMktOfferName();
        return mktOfferCode2 + " : " + mktOfferName2;
    }
}
