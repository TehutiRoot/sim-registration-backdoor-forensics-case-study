package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.take_photo.TakePhotoModel;
import th.p047co.dtac.android.dtacone.repository.take_photo.TakePhotoRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/take_photo/TakePhotoModel;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.TakePhotoViewModel$getPhotosMobile$1 */
/* loaded from: classes9.dex */
public final class TakePhotoViewModel$getPhotosMobile$1 extends Lambda implements Function1<TakePhotoModel, Unit> {
    final /* synthetic */ TakePhotoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoViewModel$getPhotosMobile$1(TakePhotoViewModel takePhotoViewModel) {
        super(1);
        this.this$0 = takePhotoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TakePhotoModel takePhotoModel) {
        invoke2(takePhotoModel);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TakePhotoModel it) {
        TakePhotoRepository takePhotoRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.clearPhotoDataStore();
        takePhotoRepository = this.this$0.f107077b;
        takePhotoRepository.setPhotoListFromApi(it);
    }
}