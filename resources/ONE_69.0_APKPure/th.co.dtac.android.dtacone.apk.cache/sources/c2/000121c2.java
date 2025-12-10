package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSaveBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/SaveBitmapPresenter$saveBitmapFromCamera$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter$saveBitmapFromCamera$3 */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter$saveBitmapFromCamera$3 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ SaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBitmapPresenter$saveBitmapFromCamera$3(BitmapCollection bitmapCollection, SaveBitmapPresenter saveBitmapPresenter) {
        super(1);
        this.$bitmap = bitmapCollection;
        this.this$0 = saveBitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        BitmapUtil bitmapUtil;
        BitmapUtil bitmapUtil2;
        BitmapUtil bitmapUtil3;
        BitmapUtil bitmapUtil4;
        String name = this.$bitmap.getName();
        byte[] bArr = null;
        if (Intrinsics.areEqual(name, BitmapUtil.IMAGE_ID_CARD)) {
            bitmapUtil3 = this.this$0.f85316b;
            Bitmap bitmap = this.$bitmap.getBitmap();
            if (bitmap != null) {
                bitmapUtil4 = this.this$0.f85316b;
                bArr = bitmapUtil4.cropImage(bitmap);
            }
            bitmapUtil3.saveInternalImage(bArr, BitmapUtil.IMAGE_ID_CARD_CROP);
        } else if (Intrinsics.areEqual(name, BitmapUtil.IMAGE_RTR_PROFILE)) {
            bitmapUtil = this.this$0.f85316b;
            Bitmap bitmap2 = this.$bitmap.getBitmap();
            if (bitmap2 != null) {
                bitmapUtil2 = this.this$0.f85316b;
                bArr = bitmapUtil2.cropImage(bitmap2);
            }
            bitmapUtil.saveInternalImage(bArr, BitmapUtil.IMAGE_RTR_PROFILE);
        }
    }
}