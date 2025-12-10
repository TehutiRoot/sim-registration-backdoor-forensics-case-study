package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TouchExplorationStateProvider_androidKt$touchExplorationState$1 extends Lambda implements Function1<Lifecycle.Event, Unit> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$1(accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0, AccessibilityManager accessibilityManager) {
        super(1);
        this.$listener = accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
        invoke2(event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            this.$listener.m30583d(this.$accessibilityManager);
        }
    }
}
