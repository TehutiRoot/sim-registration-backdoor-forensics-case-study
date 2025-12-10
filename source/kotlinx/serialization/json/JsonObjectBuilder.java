package kotlinx.serialization.json;

import ch.qos.logback.core.joran.action.Action;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28850d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Lkotlinx/serialization/json/JsonElement;", "element", "put", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonObject;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lkotlinx/serialization/json/JsonObject;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "content", "kotlinx-serialization-json"}, m28849k = 1, m28848mv = {1, 9, 0})
@JsonDslMarker
/* loaded from: classes6.dex */
public final class JsonObjectBuilder {

    /* renamed from: a */
    public final Map f71343a = new LinkedHashMap();

    @PublishedApi
    @NotNull
    public final JsonObject build() {
        return new JsonObject(this.f71343a);
    }

    @Nullable
    public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (JsonElement) this.f71343a.put(key, element);
    }
}
