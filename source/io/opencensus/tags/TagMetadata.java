package io.opencensus.tags;

import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class TagMetadata {

    /* loaded from: classes5.dex */
    public enum TagTtl {
        NO_PROPAGATION(0),
        UNLIMITED_PROPAGATION(-1);
        
        private final int hops;

        TagTtl(int i) {
            this.hops = i;
        }
    }

    public static TagMetadata create(TagTtl tagTtl) {
        return new C10670a(tagTtl);
    }

    public abstract TagTtl getTagTtl();
}
