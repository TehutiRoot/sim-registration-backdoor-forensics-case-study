package th.p047co.dtac.android.dtacone.presenter.prepaid.submit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.subjects.AsyncSubject;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecognitionRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.NationWideCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidImage;
import th.p047co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/prepaid/RegisterPrepaidCollection;", "kotlin.jvm.PlatformType", "prepaid", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidImage;", "optionalImages", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.submit.PrepaidRegistrationRequest$makeRegistrationRequestObservable$1 */
/* loaded from: classes8.dex */
public final class PrepaidRegistrationRequest$makeRegistrationRequestObservable$1 extends Lambda implements Function2<PrepaidImage, List<? extends String>, RegisterPrepaidCollection> {
    final /* synthetic */ CardCollection $card;
    final /* synthetic */ CardInformationCollection $cardInformation;
    final /* synthetic */ FaceCompareResponse $faceCompareResponse;
    final /* synthetic */ Pair<Collection<AsyncSubject<PrepaidImage>>, LinkedHashMap<String, AsyncSubject<PrepaidImage>>> $optionalImage;
    final /* synthetic */ PrepaidConfig $prepaidConfig;
    final /* synthetic */ PrepaidRegistrationRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrepaidRegistrationRequest$makeRegistrationRequestObservable$1(CardCollection cardCollection, CardInformationCollection cardInformationCollection, PrepaidConfig prepaidConfig, PrepaidRegistrationRequest prepaidRegistrationRequest, Pair<? extends Collection<AsyncSubject<PrepaidImage>>, ? extends LinkedHashMap<String, AsyncSubject<PrepaidImage>>> pair, FaceCompareResponse faceCompareResponse) {
        super(2);
        this.$card = cardCollection;
        this.$cardInformation = cardInformationCollection;
        this.$prepaidConfig = prepaidConfig;
        this.this$0 = prepaidRegistrationRequest;
        this.$optionalImage = pair;
        this.$faceCompareResponse = faceCompareResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ RegisterPrepaidCollection invoke(PrepaidImage prepaidImage, List<? extends String> list) {
        return invoke2(prepaidImage, (List<String>) list);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final RegisterPrepaidCollection invoke2(PrepaidImage prepaid, List<String> optionalImages) {
        ArrayList m17577e;
        FaceRecognitionRequest m17576f;
        CardCollection cardCollection = this.$card;
        CardInformationCollection cardInformationCollection = this.$cardInformation;
        NationWideCollection nationWide = this.$prepaidConfig.getNationWide();
        PrepaidRegistrationRequest prepaidRegistrationRequest = this.this$0;
        Intrinsics.checkNotNullExpressionValue(prepaid, "prepaid");
        Intrinsics.checkNotNullExpressionValue(optionalImages, "optionalImages");
        m17577e = prepaidRegistrationRequest.m17577e(prepaid, optionalImages);
        m17576f = this.this$0.m17576f(this.$optionalImage, this.$faceCompareResponse);
        return new RegisterPrepaidCollection(cardCollection, cardInformationCollection, nationWide, m17577e, m17576f);
    }
}