package th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModel$faceDetectionByBitmapCollection$1 */
/* loaded from: classes9.dex */
public final class FaceDetectionViewModel$faceDetectionByBitmapCollection$1 extends Lambda implements Function1<BitmapCollection, ObservableSource<? extends BitmapCollection>> {
    public static final FaceDetectionViewModel$faceDetectionByBitmapCollection$1 INSTANCE = new FaceDetectionViewModel$faceDetectionByBitmapCollection$1();

    public FaceDetectionViewModel$faceDetectionByBitmapCollection$1() {
        super(1);
    }

    public static final BitmapCollection invoke$lambda$0(BitmapCollection it) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(it, "$it");
        String name = it.getName();
        Bitmap bitmap2 = it.getBitmap();
        if (bitmap2 != null) {
            bitmap = BitmapExtKt.toRotate(bitmap2);
        } else {
            bitmap = null;
        }
        return new BitmapCollection(name, bitmap);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends BitmapCollection> invoke(@NotNull final BitmapCollection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.viewmodel.face_recognition.detection.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BitmapCollection invoke$lambda$0;
                invoke$lambda$0 = FaceDetectionViewModel$faceDetectionByBitmapCollection$1.invoke$lambda$0(it);
                return invoke$lambda$0;
            }
        });
    }
}