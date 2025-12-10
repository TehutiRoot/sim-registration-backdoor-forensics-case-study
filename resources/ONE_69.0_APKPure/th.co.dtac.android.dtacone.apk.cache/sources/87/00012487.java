package th.p047co.dtac.android.dtacone.presenter.prepaid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidImage;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/model/prepaid/PrepaidImage;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidUploadImagePresenter$uploadObs$1 */
/* loaded from: classes8.dex */
public final class PrepaidUploadImagePresenter$uploadObs$1 extends Lambda implements Function1<PrepaidImage, Observable<? extends PrepaidImage>> {
    final /* synthetic */ PrepaidUploadImagePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepaidUploadImagePresenter$uploadObs$1(PrepaidUploadImagePresenter prepaidUploadImagePresenter) {
        super(1);
        this.this$0 = prepaidUploadImagePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends PrepaidImage> invoke(PrepaidImage prepaidImage) {
        RTRApi rTRApi;
        rTRApi = this.this$0.f86225a;
        return rTRApi.uploadImage(prepaidImage);
    }
}