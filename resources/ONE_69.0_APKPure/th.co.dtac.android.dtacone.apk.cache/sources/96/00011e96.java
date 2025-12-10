package th.p047co.dtac.android.dtacone.model.livedata;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/livedata/NavEvent;", "", "clazz", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/Class;Landroid/os/Bundle;)V", "getBundle", "()Landroid/os/Bundle;", "getClazz", "()Ljava/lang/Class;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.livedata.NavEvent */
/* loaded from: classes8.dex */
public abstract class NavEvent {
    public static final int $stable = 8;
    @Nullable
    private final Bundle bundle;
    @NotNull
    private final Class<?> clazz;

    public NavEvent(@NotNull Class<?> clazz, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.clazz = clazz;
        this.bundle = bundle;
    }

    @Nullable
    public final Bundle getBundle() {
        return this.bundle;
    }

    @NotNull
    public final Class<?> getClazz() {
        return this.clazz;
    }
}