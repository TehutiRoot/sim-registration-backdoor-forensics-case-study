package th.p047co.dtac.android.dtacone.app_one.presenter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneIdCardReaderPresenter$oneFetchCardData$2 */
/* loaded from: classes7.dex */
public final class OneIdCardReaderPresenter$oneFetchCardData$2 extends Lambda implements Function1<IdCardInformationCollection, Unit> {
    final /* synthetic */ OneIdCardReaderPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneIdCardReaderPresenter$oneFetchCardData$2(OneIdCardReaderPresenter oneIdCardReaderPresenter) {
        super(1);
        this.this$0 = oneIdCardReaderPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IdCardInformationCollection idCardInformationCollection) {
        invoke2(idCardInformationCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IdCardInformationCollection cardInformation) {
        BitmapUtil bitmapUtil;
        DrawBitmap drawBitmap;
        String str;
        Intrinsics.checkNotNullParameter(cardInformation, "cardInformation");
        bitmapUtil = this.this$0.f82308k;
        Intrinsics.checkNotNull(bitmapUtil);
        bitmapUtil.saveInternalImage(cardInformation.getPicture(), BitmapUtil.IMAGE_FACE);
        drawBitmap = this.this$0.f82310m;
        Intrinsics.checkNotNull(drawBitmap);
        str = this.this$0.f82312o;
        drawBitmap.drawIdCardWithSave(cardInformation, str);
    }
}
