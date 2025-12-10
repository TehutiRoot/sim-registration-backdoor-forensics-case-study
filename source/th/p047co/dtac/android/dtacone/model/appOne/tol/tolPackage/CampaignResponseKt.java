package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, m28850d2 = {"getUniqueSortedSpeeds", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/UniqueSortedSpeedData;", "campaigns", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nCampaignResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignResponse.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1549#2:282\n1620#2,3:283\n1655#2,8:286\n1054#2:294\n*S KotlinDebug\n*F\n+ 1 CampaignResponse.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponseKt\n*L\n203#1:282\n203#1:283,3\n210#1:286,8\n211#1:294\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponseKt */
/* loaded from: classes8.dex */
public final class CampaignResponseKt {
    @NotNull
    public static final List<UniqueSortedSpeedData> getUniqueSortedSpeeds(@NotNull List<Campaign> campaigns) {
        int i;
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        List<Campaign> list = campaigns;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (Campaign campaign : list) {
            Integer intOrNull = AbstractC20032gN1.toIntOrNull(campaign.getCampaignSpeedValue());
            if (intOrNull != null) {
                i = intOrNull.intValue();
            } else {
                i = 0;
            }
            arrayList.add(new UniqueSortedSpeedData(i, campaign.getCampaignSpeedUnit(), campaign.getCampaignSpeedKbps()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(Integer.valueOf(((UniqueSortedSpeedData) obj).getUniqueSpeedMbps()))) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponseKt$getUniqueSortedSpeeds$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC16857uu.compareValues(Integer.valueOf(((UniqueSortedSpeedData) t2).getUniqueSpeedMbps()), Integer.valueOf(((UniqueSortedSpeedData) t).getUniqueSpeedMbps()));
            }
        });
    }
}
