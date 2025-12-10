package th.p047co.dtac.android.dtacone.view.callback;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/callback/CameraImpl;", "Lth/co/dtac/android/dtacone/view/callback/ICamera;", "()V", "onCameraTaken", "", "byte", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.callback.CameraImpl */
/* loaded from: classes10.dex */
public final class CameraImpl implements ICamera {
    public static final int $stable = 0;
    @NotNull
    public static final CameraImpl INSTANCE = new CameraImpl();

    @Override // th.p047co.dtac.android.dtacone.view.callback.ICamera
    public void onCameraTaken(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "byte");
    }
}