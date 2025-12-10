package kotlinx.serialization.json;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m29142d2 = {"Lkotlinx/serialization/json/JsonArrayBuilder;", "", "<init>", "()V", "Lkotlinx/serialization/json/JsonElement;", "element", "", ProductAction.ACTION_ADD, "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Lkotlinx/serialization/json/JsonArray;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lkotlinx/serialization/json/JsonArray;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "content", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
@JsonDslMarker
/* loaded from: classes6.dex */
public final class JsonArrayBuilder {

    /* renamed from: a */
    public final List f71322a = new ArrayList();

    public final boolean add(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f71322a.add(element);
        return true;
    }

    @ExperimentalSerializationApi
    public final boolean addAll(@NotNull Collection<? extends JsonElement> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f71322a.addAll(elements);
    }

    @PublishedApi
    @NotNull
    public final JsonArray build() {
        return new JsonArray(this.f71322a);
    }
}