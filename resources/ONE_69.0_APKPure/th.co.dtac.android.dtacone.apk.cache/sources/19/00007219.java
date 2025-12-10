package androidx.navigation;

import androidx.navigation.NavDeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"", "", "Landroidx/navigation/NavDeepLink$c;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, m29141k = 3, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavDeepLink$queryArgsMap$2 extends Lambda implements Function0<Map<String, NavDeepLink.C4792c>> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$queryArgsMap$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<String, NavDeepLink.C4792c> invoke() {
        Map<String, NavDeepLink.C4792c> m53807v;
        m53807v = this.this$0.m53807v();
        return m53807v;
    }
}