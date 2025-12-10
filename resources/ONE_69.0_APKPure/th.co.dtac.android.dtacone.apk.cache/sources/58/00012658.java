package th.p047co.dtac.android.dtacone.p051rx;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "", "kotlin.jvm.PlatformType", "bitmap", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection$applyDetectByBitmapCollection$1$1 */
/* loaded from: classes8.dex */
public final class RxFaceDetection$applyDetectByBitmapCollection$1$1 extends Lambda implements Function1<BitmapCollection, ObservableSource<? extends Pair<? extends BitmapCollection, ? extends Boolean>>> {
    final /* synthetic */ RxFaceDetection this$0;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "", "kotlin.jvm.PlatformType", "it", "invoke", "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection$applyDetectByBitmapCollection$1$1$2 */
    /* loaded from: classes8.dex */
    public static final class C144082 extends Lambda implements Function1<Boolean, Pair<? extends BitmapCollection, ? extends Boolean>> {
        final /* synthetic */ BitmapCollection $bitmap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144082(BitmapCollection bitmapCollection) {
            super(1);
            this.$bitmap = bitmapCollection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair<BitmapCollection, Boolean> invoke(@NotNull Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pair<>(this.$bitmap, it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxFaceDetection$applyDetectByBitmapCollection$1$1(RxFaceDetection rxFaceDetection) {
        super(1);
        this.this$0 = rxFaceDetection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$0(RxFaceDetection this$0, BitmapCollection bitmap) {
        FaceDetection faceDetection;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        faceDetection = this$0.f86991a;
        Bitmap bitmap2 = bitmap.getBitmap();
        Intrinsics.checkNotNull(bitmap2);
        return Boolean.valueOf(faceDetection.onDetected(bitmap2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Pair<BitmapCollection, Boolean>> invoke(@NotNull final BitmapCollection bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final RxFaceDetection rxFaceDetection = this.this$0;
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.rx.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean invoke$lambda$0;
                invoke$lambda$0 = RxFaceDetection$applyDetectByBitmapCollection$1$1.invoke$lambda$0(RxFaceDetection.this, bitmap);
                return invoke$lambda$0;
            }
        });
        final C144082 c144082 = new C144082(bitmap);
        return fromCallable.map(new Function() { // from class: th.co.dtac.android.dtacone.rx.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Pair invoke$lambda$1;
                invoke$lambda$1 = RxFaceDetection$applyDetectByBitmapCollection$1$1.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}