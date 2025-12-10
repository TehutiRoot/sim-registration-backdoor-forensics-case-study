package th.p047co.dtac.android.dtacone.presenter.prepaid.submit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.subjects.AsyncSubject;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceCompareResponse;
import th.p047co.dtac.android.dtacone.model.face_recognition.FaceRecognitionRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardInformationCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidImage;
import th.p047co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;
import th.p047co.dtac.android.dtacone.presenter.prepaid.submit.PrepaidRegistrationRequest;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b20\u0010\u0010\u001a,\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000e0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u0019\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010!\u001a\u0004\u0018\u00010 20\u0010\u0010\u001a,\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000e0\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b!\u0010\"JC\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0\u00112\u0014\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/prepaid/submit/PrepaidRegistrationRequest;", "", "<init>", "()V", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "card", "Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;", "cardInformation", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;", "prepaidConfig", "Lkotlin/Pair;", "", "Lrx/subjects/AsyncSubject;", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidImage;", "Ljava/util/LinkedHashMap;", "", "optionalImage", "Lrx/Observable;", "prepaidImageObs", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;", "faceCompareResponse", "fileNameOfCustomerPhoto", "Lth/co/dtac/android/dtacone/model/prepaid/RegisterPrepaidCollection;", "makeRegistrationRequestObservable", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Lth/co/dtac/android/dtacone/model/prepaid/CardInformationCollection;Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;Lkotlin/Pair;Lrx/Observable;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;Ljava/lang/String;)Lrx/Observable;", "prepaid", "", "optionalImages", "Ljava/util/ArrayList;", "e", "(Lth/co/dtac/android/dtacone/model/prepaid/PrepaidImage;Ljava/util/List;)Ljava/util/ArrayList;", "faceCompare", "Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecognitionRequest;", OperatorName.FILL_NON_ZERO, "(Lkotlin/Pair;Lth/co/dtac/android/dtacone/model/face_recognition/FaceCompareResponse;)Lth/co/dtac/android/dtacone/model/face_recognition/FaceRecognitionRequest;", "optionalImageObs", OperatorName.CLOSE_PATH, "(Ljava/util/Collection;Lth/co/dtac/android/dtacone/model/prepaid/PrepaidConfig;Ljava/lang/String;)Lrx/Observable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.submit.PrepaidRegistrationRequest */
/* loaded from: classes8.dex */
public final class PrepaidRegistrationRequest {
    public static final int $stable = 0;

    /* renamed from: a */
    public static /* synthetic */ String m17581a(Function1 function1, Object obj) {
        return m17572j(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m17580b(Function1 function1, Object obj) {
        return m17571k(function1, obj);
    }

    /* renamed from: g */
    public static final RegisterPrepaidCollection m17575g(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (RegisterPrepaidCollection) tmp0.invoke(obj, obj2);
    }

    /* renamed from: i */
    public static final PrepaidImage m17573i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PrepaidImage) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final String m17572j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final Boolean m17571k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final ArrayList m17577e(PrepaidImage prepaidImage, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(prepaidImage.getFileName());
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: f */
    public final FaceRecognitionRequest m17576f(Pair pair, FaceCompareResponse faceCompareResponse) {
        PrepaidImage prepaidImage;
        String str = null;
        if (faceCompareResponse == null) {
            return null;
        }
        AsyncSubject asyncSubject = (AsyncSubject) ((LinkedHashMap) pair.getSecond()).get(BitmapUtil.IMAGE_COMPARE);
        if (asyncSubject != null && (prepaidImage = (PrepaidImage) asyncSubject.getValue()) != null) {
            str = prepaidImage.getFileName();
        }
        if (str == null) {
            str = "";
        }
        return new FaceRecognitionRequest(faceCompareResponse.getConfidence(), faceCompareResponse.getThreshold(), faceCompareResponse.getNbtcStatusCode(), faceCompareResponse.getNbtcResponseMessage(), faceCompareResponse.getAttempted(), str, faceCompareResponse.getKnowYourCustomer(), faceCompareResponse.getLaseId());
    }

    /* renamed from: h */
    public final Observable m17574h(Collection collection, PrepaidConfig prepaidConfig, String str) {
        int i;
        List<String> optionalImages;
        if (collection != null) {
            Observable from = Observable.from(collection);
            final PrepaidRegistrationRequest$optionalImageNameObs$1 prepaidRegistrationRequest$optionalImageNameObs$1 = PrepaidRegistrationRequest$optionalImageNameObs$1.INSTANCE;
            Observable map = from.map(new Func1() { // from class: vn1
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    PrepaidImage m17573i;
                    m17573i = PrepaidRegistrationRequest.m17573i(Function1.this, obj);
                    return m17573i;
                }
            });
            final PrepaidRegistrationRequest$optionalImageNameObs$2 prepaidRegistrationRequest$optionalImageNameObs$2 = PrepaidRegistrationRequest$optionalImageNameObs$2.INSTANCE;
            Observable map2 = map.map(new Func1() { // from class: wn1
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    return PrepaidRegistrationRequest.m17581a(Function1.this, obj);
                }
            });
            final PrepaidRegistrationRequest$optionalImageNameObs$3 prepaidRegistrationRequest$optionalImageNameObs$3 = new PrepaidRegistrationRequest$optionalImageNameObs$3(str);
            Observable list = map2.filter(new Func1() { // from class: xn1
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    return PrepaidRegistrationRequest.m17580b(Function1.this, obj);
                }
            }).toList();
            UpdatePrepaidOptionalImage optionalImage = prepaidConfig.getOptionalImage();
            if (optionalImage != null && (optionalImages = optionalImage.getOptionalImages()) != null) {
                i = optionalImages.size();
            } else {
                i = 0;
            }
            Observable take = list.take(i);
            Intrinsics.checkNotNullExpressionValue(take, "fileNameOfCustomerPhoto:….optionalImages?.size?:0)");
            return take;
        }
        Observable just = Observable.just(CollectionsKt__CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(just, "just(emptyList())");
        return just;
    }

    @NotNull
    public final Observable<RegisterPrepaidCollection> makeRegistrationRequestObservable(@NotNull CardCollection card, @NotNull CardInformationCollection cardInformation, @NotNull PrepaidConfig prepaidConfig, @NotNull Pair<? extends Collection<AsyncSubject<PrepaidImage>>, ? extends LinkedHashMap<String, AsyncSubject<PrepaidImage>>> optionalImage, @NotNull Observable<PrepaidImage> prepaidImageObs, @Nullable FaceCompareResponse faceCompareResponse, @Nullable String str) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardInformation, "cardInformation");
        Intrinsics.checkNotNullParameter(prepaidConfig, "prepaidConfig");
        Intrinsics.checkNotNullParameter(optionalImage, "optionalImage");
        Intrinsics.checkNotNullParameter(prepaidImageObs, "prepaidImageObs");
        Observable m17574h = m17574h(optionalImage.getFirst(), prepaidConfig, str);
        final PrepaidRegistrationRequest$makeRegistrationRequestObservable$1 prepaidRegistrationRequest$makeRegistrationRequestObservable$1 = new PrepaidRegistrationRequest$makeRegistrationRequestObservable$1(card, cardInformation, prepaidConfig, this, optionalImage, faceCompareResponse);
        Observable zipWith = prepaidImageObs.zipWith(m17574h, new Func2() { // from class: un1
            @Override // p046rx.functions.Func2
            public final Object call(Object obj, Object obj2) {
                RegisterPrepaidCollection m17575g;
                m17575g = PrepaidRegistrationRequest.m17575g(Function2.this, obj, obj2);
                return m17575g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(zipWith, "fun makeRegistrationRequ…esponse))\n        }\n    }");
        return zipWith;
    }
}