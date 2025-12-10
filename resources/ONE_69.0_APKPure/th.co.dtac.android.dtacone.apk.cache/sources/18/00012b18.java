package th.p047co.dtac.android.dtacone.view.appOne.campaign.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import th.p047co.dtac.android.dtacone.model.campaign.reward.Data;
import th.p047co.dtac.android.dtacone.model.campaign.reward.DataReward;
import th.p047co.dtac.android.dtacone.model.campaign.reward.DetailsItem;
import th.p047co.dtac.android.dtacone.model.campaign.reward.OneTrueCampaignRewardResponse;
import th.p047co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/campaign/reward/OneTrueCampaignRewardResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignRepository.kt\nth/co/dtac/android/dtacone/view/appOne/campaign/repository/OneCampaignRepository$oneTrueCampaignReward$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1855#2,2:135\n*S KotlinDebug\n*F\n+ 1 OneCampaignRepository.kt\nth/co/dtac/android/dtacone/view/appOne/campaign/repository/OneCampaignRepository$oneTrueCampaignReward$1\n*L\n71#1:135,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository$oneTrueCampaignReward$1 */
/* loaded from: classes10.dex */
public final class OneCampaignRepository$oneTrueCampaignReward$1 extends Lambda implements Function1<OneTrueCampaignRewardResponse, OneTrueCampaignRewardResponse> {
    public static final OneCampaignRepository$oneTrueCampaignReward$1 INSTANCE = new OneCampaignRepository$oneTrueCampaignReward$1();

    public OneCampaignRepository$oneTrueCampaignReward$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneTrueCampaignRewardResponse invoke(@NotNull OneTrueCampaignRewardResponse it) {
        List<DetailsItem> emptyList;
        List<DetailsItem> details;
        Intrinsics.checkNotNullParameter(it, "it");
        DataReward dataReward = new DataReward(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 32767, null);
        Data data = it.getData();
        if (data == null || (emptyList = data.getDetails()) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Collections.sort(emptyList, new Comparator<DetailsItem>() { // from class: th.co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository$oneTrueCampaignReward$1.1
            @Override // java.util.Comparator
            public int compare(@NotNull DetailsItem o1, @NotNull DetailsItem o2) {
                Intrinsics.checkNotNullParameter(o1, "o1");
                Intrinsics.checkNotNullParameter(o2, "o2");
                String line = o1.getLine();
                if (line == null) {
                    line = "0";
                }
                int parseInt = Integer.parseInt(line);
                String line2 = o2.getLine();
                return Intrinsics.compare(parseInt, Integer.parseInt(line2 != null ? line2 : "0"));
            }
        });
        Data data2 = it.getData();
        if (data2 != null && (details = data2.getDetails()) != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (DetailsItem detailsItem : details) {
                String uiStyle = detailsItem.getUiStyle();
                if (uiStyle != null) {
                    switch (uiStyle.hashCode()) {
                        case -1139657850:
                            if (uiStyle.equals("SUMMARY")) {
                                if (i == 0) {
                                    dataReward.setSummaryCollectTitle(detailsItem.getData1());
                                    dataReward.setSummaryCollectValue(detailsItem.getData2());
                                } else if (i != 1) {
                                    dataReward.setSummaryMaxCollectTitle(detailsItem.getData1());
                                    dataReward.setSummaryMaxCollectValue(detailsItem.getData2());
                                    i = 0;
                                    break;
                                } else {
                                    dataReward.setSummaryNextCollectTitle(detailsItem.getData1());
                                    dataReward.setSummaryNextCollectValue(detailsItem.getData2());
                                }
                                i++;
                                break;
                            } else {
                                continue;
                            }
                        case -964705750:
                            if (uiStyle.equals("WIN_BLOCK")) {
                                dataReward.setWinBlock(true);
                                dataReward.setWinBlockTitle(detailsItem.getData1());
                                break;
                            } else {
                                continue;
                            }
                        case 63294573:
                            if (uiStyle.equals("BLOCK")) {
                                if (i2 == 0) {
                                    dataReward.setBlockSellSimTitle(detailsItem.getData1());
                                    dataReward.setBlockSellSimValue(detailsItem.getData2());
                                    i2++;
                                    break;
                                } else {
                                    dataReward.setBlockProfitTitle(detailsItem.getData1());
                                    dataReward.setBlockProfitValue(detailsItem.getData2());
                                    i2 = 0;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 2013072465:
                            if (uiStyle.equals("DETAIL")) {
                                it.getRewardRoadmapList().add(new RewardRoadmapItem(detailsItem.getData1(), detailsItem.getData2(), detailsItem.getData3()));
                                break;
                            } else {
                                continue;
                            }
                        case 2079435163:
                            if (uiStyle.equals("FOOTER")) {
                                if (i3 == 0) {
                                    String footerDescription = dataReward.getFooterDescription();
                                    String data1 = detailsItem.getData1();
                                    dataReward.setFooterDescription(footerDescription + Marker.ANY_MARKER + data1);
                                    i3++;
                                    break;
                                } else {
                                    String footerDescription2 = dataReward.getFooterDescription();
                                    String data12 = detailsItem.getData1();
                                    dataReward.setFooterDescription(footerDescription2 + "\n*" + data12);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 2127025805:
                            if (uiStyle.equals("HEADER")) {
                                dataReward.setDetailHeaderLeft(detailsItem.getData1());
                                dataReward.setDetailHeaderRight(detailsItem.getData2());
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
        it.setDataReward(dataReward);
        return it;
    }
}