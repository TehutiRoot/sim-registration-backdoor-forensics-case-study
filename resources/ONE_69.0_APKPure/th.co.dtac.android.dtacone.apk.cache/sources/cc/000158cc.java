package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.blacklist.PackagePriceTierResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/blacklist/PackagePriceTierResponse$ExtraAdvance;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$_getExtraAdvanceMaster$2 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$_getExtraAdvanceMaster$2 extends Lambda implements Function0<MutableLiveData<Resource<? extends List<? extends PackagePriceTierResponse.ExtraAdvance>>>> {
    public static final MrtrPostpaidRegistrationViewModel$_getExtraAdvanceMaster$2 INSTANCE = new MrtrPostpaidRegistrationViewModel$_getExtraAdvanceMaster$2();

    public MrtrPostpaidRegistrationViewModel$_getExtraAdvanceMaster$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final MutableLiveData<Resource<? extends List<? extends PackagePriceTierResponse.ExtraAdvance>>> invoke2() {
        return new MutableLiveData<>();
    }
}