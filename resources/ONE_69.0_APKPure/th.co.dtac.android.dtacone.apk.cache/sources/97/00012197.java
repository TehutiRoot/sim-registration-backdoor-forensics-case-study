package th.p047co.dtac.android.dtacone.presenter.bitmap;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lio/reactivex/ObservableSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/BitmapPresenter$saveBitmapBothOriginalAndWatermark$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.BitmapPresenter$saveBitmapBothOriginalAndWatermark$2 */
/* loaded from: classes8.dex */
public final class BitmapPresenter$saveBitmapBothOriginalAndWatermark$2 extends Lambda implements Function1<Unit, ObservableSource<? extends byte[]>> {
    final /* synthetic */ BitmapCollection $bitmapForWatermark;
    final /* synthetic */ String $watermarkString;
    final /* synthetic */ BitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapPresenter$saveBitmapBothOriginalAndWatermark$2(BitmapCollection bitmapCollection, BitmapPresenter bitmapPresenter, String str) {
        super(1);
        this.$bitmapForWatermark = bitmapCollection;
        this.this$0 = bitmapPresenter;
        this.$watermarkString = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends byte[]> invoke(@NotNull Unit it) {
        Observable m18982r;
        Intrinsics.checkNotNullParameter(it, "it");
        String name = this.$bitmapForWatermark.getName();
        if (name != null) {
            m18982r = this.this$0.m18982r(name, this.$watermarkString);
            return m18982r;
        }
        return null;
    }
}