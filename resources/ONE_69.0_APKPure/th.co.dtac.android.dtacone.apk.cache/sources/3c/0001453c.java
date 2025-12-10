package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.model.mixpanel.register_true_online.RegisterTrueOnlineMixpanelData;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineMixpanelTrackerViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", "mixpanel", "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;Lth/co/dtac/android/dtacone/manager/TemporaryCache;Lorg/json/JSONObject;)V", "", "action", "Lth/co/dtac/android/dtacone/model/mixpanel/register_true_online/RegisterTrueOnlineMixpanelData;", "registerTrueOnlineMixpanelData", "", "track", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/mixpanel/register_true_online/RegisterTrueOnlineMixpanelData;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/mixpanel/android/mpmetrics/MixpanelAPI;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/data/cache/realm/RtrRepository;", "d", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "e", "Lorg/json/JSONObject;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineMixpanelTrackerViewModel */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineMixpanelTrackerViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MixpanelAPI f98123b;

    /* renamed from: c */
    public final RtrRepository f98124c;

    /* renamed from: d */
    public final TemporaryCache f98125d;

    /* renamed from: e */
    public final JSONObject f98126e;

    @Inject
    public OneRegisterTrueOnlineMixpanelTrackerViewModel(@NotNull MixpanelAPI mixpanel, @NotNull RtrRepository repository, @NotNull TemporaryCache temporaryCache, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(mixpanel, "mixpanel");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f98123b = mixpanel;
        this.f98124c = repository;
        this.f98125d = temporaryCache;
        this.f98126e = jsonObject;
    }

    public final void track(@NotNull String action, @NotNull RegisterTrueOnlineMixpanelData registerTrueOnlineMixpanelData) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(registerTrueOnlineMixpanelData, "registerTrueOnlineMixpanelData");
        AbstractC1539Vc.m65885e(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1(this, action, registerTrueOnlineMixpanelData, null), 2, null);
    }
}