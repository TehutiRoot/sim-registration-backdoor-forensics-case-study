package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lio/reactivex/ObservableSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSaveBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/SaveBitmapPresenter$saveBitmapFromCamera$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter$saveBitmapFromCamera$1 */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter$saveBitmapFromCamera$1 extends Lambda implements Function1<Unit, ObservableSource<? extends Bitmap>> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ SaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBitmapPresenter$saveBitmapFromCamera$1(BitmapCollection bitmapCollection, SaveBitmapPresenter saveBitmapPresenter) {
        super(1);
        this.$bitmap = bitmapCollection;
        this.this$0 = saveBitmapPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap invoke$lambda$1(BitmapCollection bitmap, SaveBitmapPresenter this$0) {
        BitmapUtil bitmapUtil;
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String name = bitmap.getName();
        if (name != null) {
            bitmapUtil = this$0.f85316b;
            return bitmapUtil.rotateExistImage(name);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Bitmap> invoke(@NotNull Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final BitmapCollection bitmapCollection = this.$bitmap;
        final SaveBitmapPresenter saveBitmapPresenter = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap invoke$lambda$1;
                invoke$lambda$1 = SaveBitmapPresenter$saveBitmapFromCamera$1.invoke$lambda$1(BitmapCollection.this, saveBitmapPresenter);
                return invoke$lambda$1;
            }
        });
    }
}