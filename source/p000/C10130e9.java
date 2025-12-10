package p000;

import io.opencensus.tags.Tag;
import io.opencensus.tags.TagKey;
import io.opencensus.tags.TagMetadata;
import io.opencensus.tags.TagValue;

/* renamed from: e9 */
/* loaded from: classes5.dex */
public final class C10130e9 extends Tag {

    /* renamed from: b */
    public final TagKey f61419b;

    /* renamed from: c */
    public final TagValue f61420c;

    /* renamed from: d */
    public final TagMetadata f61421d;

    public C10130e9(TagKey tagKey, TagValue tagValue, TagMetadata tagMetadata) {
        if (tagKey != null) {
            this.f61419b = tagKey;
            if (tagValue != null) {
                this.f61420c = tagValue;
                if (tagMetadata != null) {
                    this.f61421d = tagMetadata;
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
        if (this.f61419b.equals(tag.getKey()) && this.f61420c.equals(tag.getValue()) && this.f61421d.equals(tag.getTagMetadata())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.tags.Tag
    public TagKey getKey() {
        return this.f61419b;
    }

    @Override // io.opencensus.tags.Tag
    public TagMetadata getTagMetadata() {
        return this.f61421d;
    }

    @Override // io.opencensus.tags.Tag
    public TagValue getValue() {
        return this.f61420c;
    }

    public int hashCode() {
        return ((((this.f61419b.hashCode() ^ 1000003) * 1000003) ^ this.f61420c.hashCode()) * 1000003) ^ this.f61421d.hashCode();
    }

    public String toString() {
        return "Tag{key=" + this.f61419b + ", value=" + this.f61420c + ", tagMetadata=" + this.f61421d + "}";
    }
}
