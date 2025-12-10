package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel;

import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.onlineRegister.response.OneOnlineRegisterCreateRetailerProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.UploadRetailerDocumentResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/UploadRetailerDocumentResponse;", "kotlin.jvm.PlatformType", "fileName", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$uploadDocumentSequence$1 */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterViewModel$uploadDocumentSequence$1 extends Lambda implements Function1<String, ObservableSource<? extends UploadRetailerDocumentResponse>> {
    final /* synthetic */ OneOnlineRegisterCreateRetailerProfileResponse $submitResponse;
    final /* synthetic */ OneOnlineRegisterViewModel this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/UploadRetailerDocumentResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$uploadDocumentSequence$1$1 */
    /* loaded from: classes10.dex */
    public static final class C148351 extends Lambda implements Function1<UploadRetailerDocumentResponse, UploadRetailerDocumentResponse> {
        final /* synthetic */ String $fileName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C148351(String str) {
            super(1);
            this.$fileName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UploadRetailerDocumentResponse invoke(@NotNull UploadRetailerDocumentResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            response.setFileName(this.$fileName);
            return response;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOnlineRegisterViewModel$uploadDocumentSequence$1(OneOnlineRegisterCreateRetailerProfileResponse oneOnlineRegisterCreateRetailerProfileResponse, OneOnlineRegisterViewModel oneOnlineRegisterViewModel) {
        super(1);
        this.$submitResponse = oneOnlineRegisterCreateRetailerProfileResponse;
        this.this$0 = oneOnlineRegisterViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UploadRetailerDocumentResponse invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (UploadRetailerDocumentResponse) tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.reactivex.ObservableSource<? extends th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit.UploadRetailerDocumentResponse> invoke(@org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.viewModel.OneOnlineRegisterViewModel$uploadDocumentSequence$1.invoke(java.lang.String):io.reactivex.ObservableSource");
    }
}