package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import com.mixpanel.android.mpmetrics.MixpanelAPI;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.mixpanel.register_true_online.RegisterTrueOnlineMixpanelData;
import th.p047co.dtac.android.dtacone.model.mixpanel.register_true_online.RegisterTrueOnlineTracker;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.MixpanelValue;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1", m29092f = "OneRegisterTrueOnlineMixpanelTrackerViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $action;
    final /* synthetic */ RegisterTrueOnlineMixpanelData $registerTrueOnlineMixpanelData;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineMixpanelTrackerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1(OneRegisterTrueOnlineMixpanelTrackerViewModel oneRegisterTrueOnlineMixpanelTrackerViewModel, String str, RegisterTrueOnlineMixpanelData registerTrueOnlineMixpanelData, Continuation<? super OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineMixpanelTrackerViewModel;
        this.$action = str;
        this.$registerTrueOnlineMixpanelData = registerTrueOnlineMixpanelData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1(this.this$0, this.$action, this.$registerTrueOnlineMixpanelData, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RtrRepository rtrRepository;
        TemporaryCache temporaryCache;
        MixpanelAPI mixpanelAPI;
        JSONObject jSONObject;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            rtrRepository = this.this$0.f98124c;
            TokenCollection userSession = rtrRepository.getUserSession();
            String str = this.$action;
            String numberType = this.$registerTrueOnlineMixpanelData.getNumberType();
            String faceRecognitionState = this.$registerTrueOnlineMixpanelData.getFaceRecognitionState();
            String channel = userSession.getChannel();
            String rtrCode = userSession.getRtrCode();
            String subChannel = userSession.getSubChannel();
            String retailerSubType = userSession.getRetailerSubType();
            temporaryCache = this.this$0.f98125d;
            RegisterTrueOnlineTracker registerTrueOnlineTracker = new RegisterTrueOnlineTracker(str, numberType, faceRecognitionState, MixpanelValue.SYSTEM_APP, channel, rtrCode, subChannel, retailerSubType, temporaryCache.getUsedLocation(), userSession.getRetailerType(), this.$registerTrueOnlineMixpanelData.getPortfolio(), this.$registerTrueOnlineMixpanelData.getPackageName(), this.$registerTrueOnlineMixpanelData.getPackagePrice(), this.$registerTrueOnlineMixpanelData.getIdCaptureType());
            mixpanelAPI = this.this$0.f98123b;
            jSONObject = this.this$0.f98126e;
            mixpanelAPI.track("Registration", registerTrueOnlineTracker.getProperties(jSONObject));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineMixpanelTrackerViewModel$track$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}