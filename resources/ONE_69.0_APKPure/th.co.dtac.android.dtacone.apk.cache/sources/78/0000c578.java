package p000;

import io.opencensus.tags.Tag;
import io.opencensus.tags.TagKey;
import io.opencensus.tags.TagMetadata;
import io.opencensus.tags.TagValue;

/* renamed from: e9 */
/* loaded from: classes5.dex */
public final class C10127e9 extends Tag {

    /* renamed from: b */
    public final TagKey f61485b;

    /* renamed from: c */
    public final TagValue f61486c;

    /* renamed from: d */
    public final TagMetadata f61487d;

    public C10127e9(TagKey tagKey, TagValue tagValue, TagMetadata tagMetadata) {
        if (tagKey != null) {
            this.f61485b = tagKey;
            if (tagValue != null) {
                this.f61486c = tagValue;
                if (tagMetadata != null) {
                    this.f61487d = tagMetadata;
                    return;
                }
                throw new NullPointerException("Null tagMetadata");
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (this.f61485b.equals(tag.getKey()) && this.f61486c.equals(tag.getValue()) && this.f61487d.equals(tag.getTagMetadata())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.tags.Tag
    public TagKey getKey() {
        return this.f61485b;
    }

    @Override // io.opencensus.tags.Tag
    public TagMetadata getTagMetadata() {
        return this.f61487d;
    }

    @Override // io.opencensus.tags.Tag
    public TagValue getValue() {
        return this.f61486c;
    }

    public int hashCode() {
        return ((((this.f61485b.hashCode() ^ 1000003) * 1000003) ^ this.f61486c.hashCode()) * 1000003) ^ this.f61487d.hashCode();
    }

    public String toString() {
        return "Tag{key=" + this.f61485b + ", value=" + this.f61486c + ", tagMetadata=" + this.f61487d + "}";
    }
}