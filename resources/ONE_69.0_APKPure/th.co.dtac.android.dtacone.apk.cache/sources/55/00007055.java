package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m29142d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onCreate", "", Constant.REGISTER_LEVEL_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onPause", "onResume", Constant.ServiceAPIName.onStart, "onStop", "lifecycle-common"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    void onCreate(@NotNull LifecycleOwner lifecycleOwner);

    void onDestroy(@NotNull LifecycleOwner lifecycleOwner);

    void onPause(@NotNull LifecycleOwner lifecycleOwner);

    void onResume(@NotNull LifecycleOwner lifecycleOwner);

    void onStart(@NotNull LifecycleOwner lifecycleOwner);

    void onStop(@NotNull LifecycleOwner lifecycleOwner);
}