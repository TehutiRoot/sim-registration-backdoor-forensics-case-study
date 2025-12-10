package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignPackageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$OneSelectCampaignScreen$filteredList$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,610:1\n766#2:611\n857#2,2:612\n*S KotlinDebug\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$OneSelectCampaignScreen$filteredList$2$1\n*L\n79#1:611\n79#1:612,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$OneSelectCampaignScreen$filteredList$2$1 */
/* loaded from: classes10.dex */
public final class C15614x698395f5 extends Lambda implements Function0<List<? extends Campaign>> {
    final /* synthetic */ MutableState<UniqueSortedSpeedData> $buttonFilter$delegate;
    final /* synthetic */ MutableState<List<Campaign>> $campaignsResp$delegate;
    final /* synthetic */ MutableState<String> $filterText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15614x698395f5(MutableState<List<Campaign>> mutableState, MutableState<UniqueSortedSpeedData> mutableState2, MutableState<String> mutableState3) {
        super(0);
        this.$campaignsResp$delegate = mutableState;
        this.$buttonFilter$delegate = mutableState2;
        this.$filterText$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends Campaign> invoke() {
        List m9381d;
        UniqueSortedSpeedData m9374k;
        String m9376i;
        String m9376i2;
        m9381d = OneCampaignPackageScreenKt.m9381d(this.$campaignsResp$delegate);
        MutableState<UniqueSortedSpeedData> mutableState = this.$buttonFilter$delegate;
        MutableState<String> mutableState2 = this.$filterText$delegate;
        ArrayList arrayList = new ArrayList();
        for (Object obj : m9381d) {
            Campaign campaign = (Campaign) obj;
            String campaignSpeedValue = campaign.getCampaignSpeedValue();
            Intrinsics.checkNotNull(campaignSpeedValue);
            m9374k = OneCampaignPackageScreenKt.m9374k(mutableState);
            if (StringsKt__StringsKt.contains((CharSequence) campaignSpeedValue, (CharSequence) String.valueOf(m9374k.getUniqueSpeed()), true)) {
                m9376i = OneCampaignPackageScreenKt.m9376i(mutableState2);
                if (m9376i.length() != 0) {
                    String campaignName = campaign.getCampaignName();
                    Intrinsics.checkNotNull(campaignName);
                    m9376i2 = OneCampaignPackageScreenKt.m9376i(mutableState2);
                    if (StringsKt__StringsKt.contains((CharSequence) campaignName, (CharSequence) m9376i2, true)) {
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}