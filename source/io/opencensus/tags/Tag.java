package io.opencensus.tags;

import io.opencensus.tags.TagMetadata;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Tag {

    /* renamed from: a */
    public static final TagMetadata f63653a = TagMetadata.create(TagMetadata.TagTtl.UNLIMITED_PROPAGATION);

    @Deprecated
    public static Tag create(TagKey tagKey, TagValue tagValue) {
        return create(tagKey, tagValue, f63653a);
    }

    public abstract TagKey getKey();

    public abstract TagMetadata getTagMetadata();

    public abstract TagValue getValue();

    public static Tag create(TagKey tagKey, TagValue tagValue, TagMetadata tagMetadata) {
        return new C10130e9(tagKey, tagValue, tagMetadata);
    }
}
