package th.p047co.dtac.android.dtacone.presenter.stv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.model.mixpanel.StvTracker;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvSubmitCollection;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvConfirmPresenterImpl$submitNormalPack$2 */
/* loaded from: classes8.dex */
public final class StvConfirmPresenterImpl$submitNormalPack$2 extends Lambda implements Function1<Void, Unit> {
    final /* synthetic */ String $packageGroup;
    final /* synthetic */ StvPackageCollection $stvPackage;
    final /* synthetic */ String $stvSpeed;
    final /* synthetic */ StvSubmitCollection $stvSubmit;
    final /* synthetic */ StvConfirmPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvConfirmPresenterImpl$submitNormalPack$2(StvConfirmPresenterImpl stvConfirmPresenterImpl, String str, StvPackageCollection stvPackageCollection, String str2, StvSubmitCollection stvSubmitCollection) {
        super(1);
        this.this$0 = stvConfirmPresenterImpl;
        this.$packageGroup = str;
        this.$stvPackage = stvPackageCollection;
        this.$stvSpeed = str2;
        this.$stvSubmit = stvSubmitCollection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
        invoke2(r1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Void r14) {
        RtrRepository rtrRepository;
        RtrRepository rtrRepository2;
        RtrRepository rtrRepository3;
        TemporaryCache temporaryCache;
        this.this$0.getView().onSubmitSuccess();
        String str = this.$packageGroup;
        String period = this.$stvPackage.getPeriod();
        String price = this.$stvPackage.getPrice();
        String str2 = this.$stvSpeed;
        String str3 = this.$stvSubmit.getOffer() != null ? Constant.YES : Constant.f87015NO;
        rtrRepository = this.this$0.f86616d;
        String rtrCode = rtrRepository.getSessionNow().getToken().getRtrCode();
        rtrRepository2 = this.this$0.f86616d;
        String retailerNumber = rtrRepository2.getSessionNow().getRetailerNumber();
        Intrinsics.checkNotNullExpressionValue(retailerNumber, "repository.sessionNow.retailerNumber");
        String subscriberNumber = this.$stvSubmit.getSubscriberNumber();
        Intrinsics.checkNotNullExpressionValue(subscriberNumber, "stvSubmit.subscriberNumber");
        rtrRepository3 = this.this$0.f86616d;
        String simR = rtrRepository3.getSessionNow().getToken().getSimR();
        Intrinsics.checkNotNullExpressionValue(simR, "repository.sessionNow.token.simR");
        temporaryCache = this.this$0.f86617e;
        this.this$0.getView().sendEvent(new StvTracker("STV", "Submit", str, period, price, str2, str3, rtrCode, retailerNumber, subscriberNumber, simR, temporaryCache.getLatitudeLongitude()).getProperties());
    }
}