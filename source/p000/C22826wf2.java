package p000;

import com.google.android.odml.image.ImageProperties;

/* renamed from: wf2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22826wf2 extends ImageProperties {

    /* renamed from: a */
    public final int f108080a;

    /* renamed from: b */
    public final int f108081b;

    public /* synthetic */ C22826wf2(int i, int i2, Q92 q92) {
        this.f108080a = i;
        this.f108081b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.f108080a == imageProperties.getImageFormat() && this.f108081b == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.f108080a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.f108081b;
    }

    public final int hashCode() {
        return ((this.f108080a ^ 1000003) * 1000003) ^ this.f108081b;
    }

    public final String toString() {
        int i = this.f108080a;
        int i2 = this.f108081b;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ImageProperties{imageFormat=");
        sb.append(i);
        sb.append(", storageType=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
