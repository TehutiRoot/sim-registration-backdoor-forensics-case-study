package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocument;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneSummitUnifyRequest;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", FirebaseAnalytics.Param.SUCCESS, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$processImagesSequentially$1$3 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$processImagesSequentially$1$3 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ int $currentIndex;
    final /* synthetic */ OneSummitUnifyRequest $defaultData;
    final /* synthetic */ List<ImageDocument> $imageDocs;
    final /* synthetic */ int $totalImages;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$processImagesSequentially$1$3(int i, int i2, OneConsentAndESignViewModel oneConsentAndESignViewModel, List<ImageDocument> list, OneSummitUnifyRequest oneSummitUnifyRequest) {
        super(1);
        this.$currentIndex = i;
        this.$totalImages = i2;
        this.this$0 = oneConsentAndESignViewModel;
        this.$imageDocs = list;
        this.$defaultData = oneSummitUnifyRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        if (z) {
            int i = this.$currentIndex;
            int i2 = this.$totalImages;
            if (i == i2 - 1) {
                mutableStateFlow = this.this$0.f90976v;
                mutableStateFlow2 = this.this$0.f90976v;
                ValidateDocApproved copy$default = ValidateDocApproved.copy$default((ValidateDocApproved) mutableStateFlow2.getValue(), null, 1, null);
                copy$default.updateAllDocumentApprovalStatus(true);
                mutableStateFlow.setValue(copy$default);
                return;
            }
            this.this$0.m14320g(this.$imageDocs, this.$defaultData, i + 1, i2);
        }
    }
}