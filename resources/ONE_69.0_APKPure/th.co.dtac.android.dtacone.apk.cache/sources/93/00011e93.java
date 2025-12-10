package th.p047co.dtac.android.dtacone.model.livedata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/livedata/ActivityNavEvent;", "Lth/co/dtac/android/dtacone/model/livedata/NavEvent;", "clazz", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "(Ljava/lang/Class;Landroid/os/Bundle;)V", "buildIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.livedata.ActivityNavEvent */
/* loaded from: classes8.dex */
public final class ActivityNavEvent extends NavEvent {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavEvent(@NotNull Class<?> clazz, @Nullable Bundle bundle) {
        super(clazz, bundle);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
    }

    @NotNull
    public final Intent buildIntent(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, getClazz());
        Bundle bundle = getBundle();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public /* synthetic */ ActivityNavEvent(Class cls, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? null : bundle);
    }
}