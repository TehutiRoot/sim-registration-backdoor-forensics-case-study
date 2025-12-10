package io.opencensus.tags;

import io.opencensus.common.Scope;
import io.opencensus.tags.TagMetadata;

/* loaded from: classes5.dex */
public abstract class TagContextBuilder {

    /* renamed from: a */
    public static final TagMetadata f63654a = TagMetadata.create(TagMetadata.TagTtl.NO_PROPAGATION);

    /* renamed from: b */
    public static final TagMetadata f63655b = TagMetadata.create(TagMetadata.TagTtl.UNLIMITED_PROPAGATION);

    public abstract TagContext build();

    public abstract Scope buildScoped();

    @Deprecated
    public abstract TagContextBuilder put(TagKey tagKey, TagValue tagValue);

    public TagContextBuilder put(TagKey tagKey, TagValue tagValue, TagMetadata tagMetadata) {
        return put(tagKey, tagValue);
    }

    public final TagContextBuilder putLocal(TagKey tagKey, TagValue tagValue) {
        return put(tagKey, tagValue, f63654a);
    }

    public final TagContextBuilder putPropagating(TagKey tagKey, TagValue tagValue) {
        return put(tagKey, tagValue, f63655b);
    }

    public abstract TagContextBuilder remove(TagKey tagKey);
}
