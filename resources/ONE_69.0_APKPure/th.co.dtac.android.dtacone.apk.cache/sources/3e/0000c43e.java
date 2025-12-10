package p000;

import android.util.Size;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import java.util.Map;

/* renamed from: d9 */
/* loaded from: classes.dex */
public final class C10044d9 extends SurfaceSizeDefinition {

    /* renamed from: a */
    public final Size f61114a;

    /* renamed from: b */
    public final Map f61115b;

    /* renamed from: c */
    public final Size f61116c;

    /* renamed from: d */
    public final Map f61117d;

    /* renamed from: e */
    public final Size f61118e;

    /* renamed from: f */
    public final Map f61119f;

    /* renamed from: g */
    public final Map f61120g;

    public C10044d9(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size != null) {
            this.f61114a = size;
            if (map != null) {
                this.f61115b = map;
                if (size2 != null) {
                    this.f61116c = size2;
                    if (map2 != null) {
                        this.f61117d = map2;
                        if (size3 != null) {
                            this.f61118e = size3;
                            if (map3 != null) {
                                this.f61119f = map3;
                                if (map4 != null) {
                                    this.f61120g = map4;
                                    return;
                                }
                                throw new NullPointerException("Null ultraMaximumSizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceSizeDefinition)) {
            return false;
        }
        SurfaceSizeDefinition surfaceSizeDefinition = (SurfaceSizeDefinition) obj;
        if (this.f61114a.equals(surfaceSizeDefinition.getAnalysisSize()) && this.f61115b.equals(surfaceSizeDefinition.getS720pSizeMap()) && this.f61116c.equals(surfaceSizeDefinition.getPreviewSize()) && this.f61117d.equals(surfaceSizeDefinition.getS1440pSizeMap()) && this.f61118e.equals(surfaceSizeDefinition.getRecordSize()) && this.f61119f.equals(surfaceSizeDefinition.getMaximumSizeMap()) && this.f61120g.equals(surfaceSizeDefinition.getUltraMaximumSizeMap())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getAnalysisSize() {
        return this.f61114a;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getMaximumSizeMap() {
        return this.f61119f;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getPreviewSize() {
        return this.f61116c;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getRecordSize() {
        return this.f61118e;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getS1440pSizeMap() {
        return this.f61117d;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getS720pSizeMap() {
        return this.f61115b;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getUltraMaximumSizeMap() {
        return this.f61120g;
    }

    public int hashCode() {
        return ((((((((((((this.f61114a.hashCode() ^ 1000003) * 1000003) ^ this.f61115b.hashCode()) * 1000003) ^ this.f61116c.hashCode()) * 1000003) ^ this.f61117d.hashCode()) * 1000003) ^ this.f61118e.hashCode()) * 1000003) ^ this.f61119f.hashCode()) * 1000003) ^ this.f61120g.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f61114a + ", s720pSizeMap=" + this.f61115b + ", previewSize=" + this.f61116c + ", s1440pSizeMap=" + this.f61117d + ", recordSize=" + this.f61118e + ", maximumSizeMap=" + this.f61119f + ", ultraMaximumSizeMap=" + this.f61120g + "}";
    }
}