package io.opencensus.tags;

import io.opencensus.tags.TagMetadata;

/* renamed from: io.opencensus.tags.a */
/* loaded from: classes5.dex */
public final class C10657a extends TagMetadata {

    /* renamed from: a */
    public final TagMetadata.TagTtl f63721a;

    public C10657a(TagMetadata.TagTtl tagTtl) {
        if (tagTtl != null) {
            this.f63721a = tagTtl;
            return;
        }
        throw new NullPointerException("Null tagTtl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TagMetadata) {
            return this.f63721a.equals(((TagMetadata) obj).getTagTtl());
        }
        return false;
    }

    @Override // io.opencensus.tags.TagMetadata
    public TagMetadata.TagTtl getTagTtl() {
        return this.f63721a;
    }

    public int hashCode() {
        return this.f63721a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagMetadata{tagTtl=" + this.f63721a + "}";
    }
}