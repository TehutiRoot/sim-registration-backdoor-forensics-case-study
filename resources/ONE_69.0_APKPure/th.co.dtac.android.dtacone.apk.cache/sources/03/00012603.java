package th.p047co.dtac.android.dtacone.repository;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11663a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.ConfigurationRepository$getMobileConfig$1 */
/* loaded from: classes8.dex */
public final class ConfigurationRepository$getMobileConfig$1 extends Lambda implements Function1<Map<String, ? extends String>, Map<String, ? extends String>> {
    final /* synthetic */ ConfigurationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationRepository$getMobileConfig$1(ConfigurationRepository configurationRepository) {
        super(1);
        this.this$0 = configurationRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Map<String, ? extends String> invoke(Map<String, ? extends String> map) {
        return invoke2((Map<String, String>) map);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Map<String, String> invoke2(@NotNull Map<String, String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.f86791c = AbstractC11663a.toMutableMap(it);
        return it;
    }
}