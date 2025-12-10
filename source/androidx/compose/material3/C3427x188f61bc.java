package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.material3.TouchExplorationStateProvider_androidKt$touchExplorationState$3$1 */
/* loaded from: classes2.dex */
public final class C3427x188f61bc extends Lambda implements Function0<Boolean> {
    final /* synthetic */ accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3427x188f61bc(accessibility.AccessibilityManager$AccessibilityStateChangeListenerC20428ij0 accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0) {
        super(0);
        this.$listener = accessibility_accessibilitymanager_accessibilitystatechangelistenerc20428ij0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$listener.m30584c());
    }
}
