package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSaveBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/SaveBitmapPresenter$saveCustomerBitmap$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter$saveCustomerBitmap$7 */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter$saveCustomerBitmap$7 extends Lambda implements Function1<Bitmap, ObservableSource<? extends String>> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    final /* synthetic */ SaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBitmapPresenter$saveCustomerBitmap$7(SaveBitmapPresenter saveBitmapPresenter, BitmapCollection bitmapCollection, int i, int i2) {
        super(1);
        this.this$0 = saveBitmapPresenter;
        this.$bitmap = bitmapCollection;
        this.$width = i;
        this.$height = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$1(SaveBitmapPresenter this$0, Bitmap it, BitmapCollection bitmap, int i, int i2) {
        BitmapUtil bitmapUtil;
        BitmapUtil bitmapUtil2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        bitmapUtil = this$0.f85316b;
        bitmapUtil2 = this$0.f85316b;
        return bitmapUtil.saveInternalImage(bitmapUtil2.cropImage(it, i, i2), bitmap.getName());
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends String> invoke(@NotNull final Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final SaveBitmapPresenter saveBitmapPresenter = this.this$0;
        final BitmapCollection bitmapCollection = this.$bitmap;
        final int i = this.$width;
        final int i2 = this.$height;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String invoke$lambda$1;
                invoke$lambda$1 = SaveBitmapPresenter$saveCustomerBitmap$7.invoke$lambda$1(SaveBitmapPresenter.this, it, bitmapCollection, i, i2);
                return invoke$lambda$1;
            }
        });
    }
}