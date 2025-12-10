package th.p047co.dtac.android.dtacone.configuration;

import androidx.compose.runtime.internal.StabilityInferred;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraFactory;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/CameraModule;", "", "()V", "provideCameraFactory", "Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/CameraFactory;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@Module
/* renamed from: th.co.dtac.android.dtacone.configuration.CameraModule */
/* loaded from: classes7.dex */
public final class CameraModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    @NotNull
    public final CameraFactory provideCameraFactory() {
        return new CameraFactory();
    }
}
