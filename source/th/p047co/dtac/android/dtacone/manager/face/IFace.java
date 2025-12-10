package th.p047co.dtac.android.dtacone.manager.face;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J,\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&¨\u0006\u000b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/face/IFace;", "", "onDetected", "", "bitmap", "Landroid/graphics/Bitmap;", "onDetectedMlKit", "", FirebaseAnalytics.Param.SUCCESS, "Lkotlin/Function0;", "fail", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.face.IFace */
/* loaded from: classes7.dex */
public interface IFace {
    boolean onDetected(@NotNull Bitmap bitmap);

    void onDetectedMlKit(@NotNull Bitmap bitmap, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02);
}
