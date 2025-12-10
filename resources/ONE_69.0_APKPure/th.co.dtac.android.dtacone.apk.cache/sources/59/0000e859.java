package kotlinx.serialization.json;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.StringOpsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lkotlinx/serialization/json/JsonElement;", "invoke"}, m29141k = 3, m29140mv = {1, 9, 0}, m29138xi = 48)
/* loaded from: classes6.dex */
public final class JsonObject$toString$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {
    public static final JsonObject$toString$1 INSTANCE = new JsonObject$toString$1();

    public JsonObject$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends JsonElement> entry) {
        return invoke2((Map.Entry<String, ? extends JsonElement>) entry);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(@NotNull Map.Entry<String, ? extends JsonElement> entry) {
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        StringBuilder sb = new StringBuilder();
        StringOpsKt.printQuoted(sb, entry.getKey());
        sb.append(':');
        sb.append(entry.getValue());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}