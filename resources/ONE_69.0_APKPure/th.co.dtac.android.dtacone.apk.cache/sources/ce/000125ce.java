package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidFaceRecognition;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidUpdateProfile;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/updateprepaid/UpdatePrepaidUpdateProfile;", "kotlin.jvm.PlatformType", "cards", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidProfileSubmitPresenter$updateProfile$1 */
/* loaded from: classes8.dex */
public final class UpdatePrepaidProfileSubmitPresenter$updateProfile$1 extends Lambda implements Function1<List<? extends String>, UpdatePrepaidUpdateProfile> {
    final /* synthetic */ UpdatePrepaidFaceRecognition $faceRecognition;
    final /* synthetic */ String $isSmartCardData;
    final /* synthetic */ RegisterPrepaidCollection.ProfileCollection $profile;
    final /* synthetic */ RegisterPrepaidCollection.SubscriberCollection $subscriber;
    final /* synthetic */ UpdatePrepaidVerifyOtpResponseCollection $transaction;
    final /* synthetic */ UpdatePrepaidProfileSubmitPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePrepaidProfileSubmitPresenter$updateProfile$1(UpdatePrepaidProfileSubmitPresenter updatePrepaidProfileSubmitPresenter, RegisterPrepaidCollection.ProfileCollection profileCollection, RegisterPrepaidCollection.SubscriberCollection subscriberCollection, String str, UpdatePrepaidVerifyOtpResponseCollection updatePrepaidVerifyOtpResponseCollection, UpdatePrepaidFaceRecognition updatePrepaidFaceRecognition) {
        super(1);
        this.this$0 = updatePrepaidProfileSubmitPresenter;
        this.$profile = profileCollection;
        this.$subscriber = subscriberCollection;
        this.$isSmartCardData = str;
        this.$transaction = updatePrepaidVerifyOtpResponseCollection;
        this.$faceRecognition = updatePrepaidFaceRecognition;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ UpdatePrepaidUpdateProfile invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final UpdatePrepaidUpdateProfile invoke2(List<String> cards) {
        UpdatePrepaidUpdateProfile m17060k;
        UpdatePrepaidProfileSubmitPresenter updatePrepaidProfileSubmitPresenter = this.this$0;
        RegisterPrepaidCollection.ProfileCollection profileCollection = this.$profile;
        RegisterPrepaidCollection.SubscriberCollection subscriberCollection = this.$subscriber;
        Intrinsics.checkNotNullExpressionValue(cards, "cards");
        m17060k = updatePrepaidProfileSubmitPresenter.m17060k(profileCollection, subscriberCollection, cards, this.$isSmartCardData, this.$transaction, this.$faceRecognition);
        return m17060k;
    }
}