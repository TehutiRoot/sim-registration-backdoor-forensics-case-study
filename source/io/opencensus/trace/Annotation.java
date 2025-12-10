package io.opencensus.trace;

import io.opencensus.internal.Utils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Annotation {

    /* renamed from: a */
    public static final Map f63669a = Collections.unmodifiableMap(Collections.emptyMap());

    public static Annotation fromDescription(String str) {
        return new C10362h8(str, f63669a);
    }

    public static Annotation fromDescriptionAndAttributes(String str, Map<String, AttributeValue> map) {
        return new C10362h8(str, Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map, "attributes"))));
    }

    public abstract Map<String, AttributeValue> getAttributes();

    public abstract String getDescription();
}
