package coil.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, m29142d2 = {"Lcoil/target/Target;", "", "onError", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/graphics/drawable/Drawable;", Constant.ServiceAPIName.onStart, "placeholder", "onSuccess", "result", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes3.dex */
public interface Target {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @MainThread
        @Deprecated
        public static void onError(@NotNull Target target, @Nullable Drawable drawable) {
            UR1.m66194a(target, drawable);
        }

        @MainThread
        @Deprecated
        public static void onStart(@NotNull Target target, @Nullable Drawable drawable) {
            UR1.m66193b(target, drawable);
        }

        @MainThread
        @Deprecated
        public static void onSuccess(@NotNull Target target, @NotNull Drawable drawable) {
            UR1.m66192c(target, drawable);
        }
    }

    @MainThread
    void onError(@Nullable Drawable drawable);

    @MainThread
    void onStart(@Nullable Drawable drawable);

    @MainThread
    void onSuccess(@NotNull Drawable drawable);
}