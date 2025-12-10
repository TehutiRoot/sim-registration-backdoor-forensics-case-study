package androidx.activity.contextaware;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m29142d2 = {"Landroidx/activity/contextaware/OnContextAvailableListener;", "", "onContextAvailable", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "activity_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public interface OnContextAvailableListener {
    void onContextAvailable(@NotNull Context context);
}