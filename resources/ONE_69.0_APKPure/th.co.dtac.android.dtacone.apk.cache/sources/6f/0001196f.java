package th.p047co.dtac.android.dtacone.facedector;

import android.graphics.Bitmap;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Err;

@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J>\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\nH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/facedector/FaceDetector;", "", "close", "", "detectInImage", ResponseProcessor.CONTENT_TYPE_IMAGE, "Landroid/graphics/Bitmap;", "onSuccess", "Lkotlin/Function1;", "onFail", "Lkotlin/Function2;", "Lth/co/dtac/android/dtacone/model/Err;", "init", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.facedector.FaceDetector */
/* loaded from: classes7.dex */
public interface FaceDetector {
    void close();

    void detectInImage(@NotNull Bitmap bitmap, @NotNull Function1<? super Bitmap, Unit> function1, @NotNull Function2<? super Err, ? super Bitmap, Unit> function2);

    void init();
}