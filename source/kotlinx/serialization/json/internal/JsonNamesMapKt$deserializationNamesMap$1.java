package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "", "", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class JsonNamesMapKt$deserializationNamesMap$1 extends Lambda implements Function0<Map<String, ? extends Integer>> {
    final /* synthetic */ SerialDescriptor $descriptor;
    final /* synthetic */ Json $this_deserializationNamesMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonNamesMapKt$deserializationNamesMap$1(SerialDescriptor serialDescriptor, Json json) {
        super(0);
        this.$descriptor = serialDescriptor;
        this.$this_deserializationNamesMap = json;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Map<String, ? extends Integer> invoke() {
        Map<String, ? extends Integer> m26638a;
        m26638a = JsonNamesMapKt.m26638a(this.$descriptor, this.$this_deserializationNamesMap);
        return m26638a;
    }
}
