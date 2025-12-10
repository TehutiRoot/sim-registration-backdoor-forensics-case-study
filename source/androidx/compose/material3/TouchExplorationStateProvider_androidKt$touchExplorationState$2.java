package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TouchExplorationStateProvider_androidKt$touchExplorationState$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$2(accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0, AccessibilityManager accessibilityManager) {
        super(0);
        this.$listener = accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.m30580g(this.$accessibilityManager);
    }
}
