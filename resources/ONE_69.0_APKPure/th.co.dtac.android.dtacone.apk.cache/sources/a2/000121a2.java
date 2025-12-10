package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCompressSaveBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressSaveBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter$saveBitmap$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1747#2,3:104\n*S KotlinDebug\n*F\n+ 1 CompressSaveBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter$saveBitmap$1$1\n*L\n88#1:104,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter$saveBitmap$1$1 */
/* loaded from: classes8.dex */
public final class CompressSaveBitmapPresenter$saveBitmap$1$1 extends Lambda implements Function1<Bitmap, ObservableSource<? extends Object>> {
    final /* synthetic */ List<String> $cropImage;
    final /* synthetic */ String $imageName;
    final /* synthetic */ CompressSaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompressSaveBitmapPresenter$saveBitmap$1$1(List<String> list, CompressSaveBitmapPresenter compressSaveBitmapPresenter, String str) {
        super(1);
        this.$cropImage = list;
        this.this$0 = compressSaveBitmapPresenter;
        this.$imageName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$1(CompressSaveBitmapPresenter this$0, Bitmap bitmap, String imageName) {
        BitmapUtil bitmapUtil;
        BitmapUtil bitmapUtil2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        bitmapUtil = this$0.f85292a;
        bitmapUtil2 = this$0.f85292a;
        return bitmapUtil.saveInternalImage(bitmapUtil2.cropImage(bitmap), imageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(CompressSaveBitmapPresenter this$0, Bitmap bitmap, String imageName) {
        BitmapUtil bitmapUtil;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        bitmapUtil = this$0.f85292a;
        bitmapUtil.saveInternalImage(bitmap, imageName);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Object> invoke(@NotNull final Bitmap bitmap) {
        Rx2ThreadService rx2ThreadService;
        Rx2ThreadService rx2ThreadService2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        List<String> list = this.$cropImage;
        String str = this.$imageName;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (Intrinsics.areEqual(str2, str)) {
                    final CompressSaveBitmapPresenter compressSaveBitmapPresenter = this.this$0;
                    final String str3 = this.$imageName;
                    Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.b
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String invoke$lambda$1;
                            invoke$lambda$1 = CompressSaveBitmapPresenter$saveBitmap$1$1.invoke$lambda$1(CompressSaveBitmapPresenter.this, bitmap, str3);
                            return invoke$lambda$1;
                        }
                    });
                    rx2ThreadService = this.this$0.f85293b;
                    return fromCallable.compose(rx2ThreadService.applyBackground());
                }
            }
        }
        final CompressSaveBitmapPresenter compressSaveBitmapPresenter2 = this.this$0;
        final String str4 = this.$imageName;
        Observable fromCallable2 = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit invoke$lambda$2;
                invoke$lambda$2 = CompressSaveBitmapPresenter$saveBitmap$1$1.invoke$lambda$2(CompressSaveBitmapPresenter.this, bitmap, str4);
                return invoke$lambda$2;
            }
        });
        rx2ThreadService2 = this.this$0.f85293b;
        return fromCallable2.compose(rx2ThreadService2.applyBackground());
    }
}