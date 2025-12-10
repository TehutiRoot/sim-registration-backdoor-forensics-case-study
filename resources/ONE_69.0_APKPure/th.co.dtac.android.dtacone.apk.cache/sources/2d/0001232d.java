package th.p047co.dtac.android.dtacone.presenter.face;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/presenter/face/FacePresenter$STATE_DETECT;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmap$12 */
/* loaded from: classes8.dex */
public final class FacePresenter$faceDetectionByBitmap$12 extends Lambda implements Function1<Pair<? extends BitmapCollection, ? extends Boolean>, FacePresenter.STATE_DETECT> {
    final /* synthetic */ Integer $configCounter;
    final /* synthetic */ FacePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacePresenter$faceDetectionByBitmap$12(FacePresenter facePresenter, Integer num) {
        super(1);
        this.this$0 = facePresenter;
        this.$configCounter = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FacePresenter.STATE_DETECT invoke(Pair<? extends BitmapCollection, ? extends Boolean> pair) {
        return invoke2((Pair<BitmapCollection, Boolean>) pair);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final FacePresenter.STATE_DETECT invoke2(@NotNull Pair<BitmapCollection, Boolean> it) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean booleanValue = it.getSecond().booleanValue();
        FacePresenter facePresenter = this.this$0;
        i = facePresenter.f85776h;
        facePresenter.f85776h = i + 1;
        if (!booleanValue) {
            i2 = this.this$0.f85776h;
            Integer num = this.$configCounter;
            Intrinsics.checkNotNull(num);
            return i2 > num.intValue() ? FacePresenter.STATE_DETECT.CONFIRM_BY_RTR : FacePresenter.STATE_DETECT.NOT_FOND;
        }
        return FacePresenter.STATE_DETECT.DETECTED;
    }
}