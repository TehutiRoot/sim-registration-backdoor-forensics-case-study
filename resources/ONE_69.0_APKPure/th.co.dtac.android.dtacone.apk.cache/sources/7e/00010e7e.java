package p000;

import com.google.android.odml.image.ImageProperties;

/* renamed from: tg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22379tg2 extends ImageProperties {

    /* renamed from: a */
    public final int f80272a;

    /* renamed from: b */
    public final int f80273b;

    public /* synthetic */ C22379tg2(int i, int i2, AbstractC18131Na2 abstractC18131Na2) {
        this.f80272a = i;
        this.f80273b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.f80272a == imageProperties.getImageFormat() && this.f80273b == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.f80272a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.f80273b;
    }

    public final int hashCode() {
        return ((this.f80272a ^ 1000003) * 1000003) ^ this.f80273b;
    }

    public final String toString() {
        int i = this.f80272a;
        int i2 = this.f80273b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}