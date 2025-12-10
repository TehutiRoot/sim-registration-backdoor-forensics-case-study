package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$uploadImages$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$uploadImages$1 extends Lambda implements Function1<IndexedValue<? extends String>, ObservableSource<? extends UploadImageResponse>> {
    final /* synthetic */ MultiSubscriber $subscriber;
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nMrtrPrepaidMultiSimViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPrepaidMultiSimViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSimViewModel$uploadImages$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1727:1\n1#2:1728\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$uploadImages$1$1 */
    /* loaded from: classes9.dex */
    public static final class C166471 extends Lambda implements Function1<UploadImageResponse, UploadImageResponse> {
        final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C166471(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
            super(1);
            this.this$0 = mrtrPrepaidMultiSimViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final UploadImageResponse invoke(@NotNull UploadImageResponse it) {
            MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
            Intrinsics.checkNotNullParameter(it, "it");
            String filename = it.getFilename();
            if (filename != null) {
                mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
                mrtrPrepaidMultiSimRepository.getAttachmentNames().add(filename);
            }
            return it;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$uploadImages$1(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel, MultiSubscriber multiSubscriber) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
        this.$subscriber = multiSubscriber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UploadImageResponse invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (UploadImageResponse) tmp0.invoke(obj);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends UploadImageResponse> invoke2(@NotNull IndexedValue<String> indexedValue) {
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
        UploadImageRequest m2107L;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
        m2107L = this.this$0.m2107L(indexedValue.component1(), indexedValue.component2(), this.$subscriber);
        Single<UploadImageResponse> uploadImage = mrtrPrepaidMultiSimRepository.uploadImage(m2107L);
        final C166471 c166471 = new C166471(this.this$0);
        return uploadImage.map(new Function() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                UploadImageResponse invoke$lambda$0;
                invoke$lambda$0 = MrtrPrepaidMultiSimViewModel$uploadImages$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        }).toObservable().onExceptionResumeNext(Observable.just(new UploadImageResponse(null, 1, null))).onErrorResumeNext(Observable.just(new UploadImageResponse(null, 1, null)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends UploadImageResponse> invoke(IndexedValue<? extends String> indexedValue) {
        return invoke2((IndexedValue<String>) indexedValue);
    }
}