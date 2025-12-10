package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.request.OneUploadDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.uploadImage.response.OneUploadDocumentResponse;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/uploadImage/response/OneUploadDocumentResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$uploadImageTrueCompany$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$uploadImageTrueCompany$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends OneUploadDocumentResponse>> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$uploadImageTrueCompany$1(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends OneUploadDocumentResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        OneMnpRepository oneMnpRepository;
        String m13538M0;
        String m13538M02;
        String m13506W0;
        String m13515T0;
        String m13506W02;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        int component1 = indexedValue.component1();
        String component2 = indexedValue.component2();
        oneMnpRepository = this.this$0.f92116c;
        String transactionId = this.this$0.getTransactionId();
        m13538M0 = this.this$0.m13538M0(component1);
        m13538M02 = this.this$0.m13538M0(component1);
        String str = Intrinsics.areEqual(m13538M02, "DOC_APP_REQUIRED") ? "DOC_APP_REQUIRED" : component2;
        m13506W0 = this.this$0.m13506W0(component2);
        String str2 = "data:image/" + m13506W0 + ";base64,";
        m13515T0 = this.this$0.m13515T0(component2);
        Integer valueOf = Integer.valueOf(component1 + 1);
        m13506W02 = this.this$0.m13506W0(component2);
        return oneMnpRepository.oneCommonUploadImage(new OneUploadDocumentRequest(transactionId, m13538M0, str, str2, m13515T0, valueOf, m13506W02)).toObservable();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends OneUploadDocumentResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}