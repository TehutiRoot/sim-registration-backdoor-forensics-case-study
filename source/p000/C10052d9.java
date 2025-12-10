package p000;

import android.util.Size;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import java.util.Map;

/* renamed from: d9 */
/* loaded from: classes.dex */
public final class C10052d9 extends SurfaceSizeDefinition {

    /* renamed from: a */
    public final Size f61078a;

    /* renamed from: b */
    public final Map f61079b;

    /* renamed from: c */
    public final Size f61080c;

    /* renamed from: d */
    public final Map f61081d;

    /* renamed from: e */
    public final Size f61082e;

    /* renamed from: f */
    public final Map f61083f;

    /* renamed from: g */
    public final Map f61084g;

    public C10052d9(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size != null) {
            this.f61078a = size;
            if (map != null) {
                this.f61079b = map;
                if (size2 != null) {
                    this.f61080c = size2;
                    if (map2 != null) {
                        this.f61081d = map2;
                        if (size3 != null) {
                            this.f61082e = size3;
                            if (map3 != null) {
                                this.f61083f = map3;
                                if (map4 != null) {
                                    this.f61084g = map4;
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
        if (this.f61078a.equals(surfaceSizeDefinition.getAnalysisSize()) && this.f61079b.equals(surfaceSizeDefinition.getS720pSizeMap()) && this.f61080c.equals(surfaceSizeDefinition.getPreviewSize()) && this.f61081d.equals(surfaceSizeDefinition.getS1440pSizeMap()) && this.f61082e.equals(surfaceSizeDefinition.getRecordSize()) && this.f61083f.equals(surfaceSizeDefinition.getMaximumSizeMap()) && this.f61084g.equals(surfaceSizeDefinition.getUltraMaximumSizeMap())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getAnalysisSize() {
        return this.f61078a;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getMaximumSizeMap() {
        return this.f61083f;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getPreviewSize() {
        return this.f61080c;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Size getRecordSize() {
        return this.f61082e;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getS1440pSizeMap() {
        return this.f61081d;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getS720pSizeMap() {
        return this.f61079b;
    }

    @Override // androidx.camera.core.impl.SurfaceSizeDefinition
    public Map getUltraMaximumSizeMap() {
        return this.f61084g;
    }

    public int hashCode() {
        return ((((((((((((this.f61078a.hashCode() ^ 1000003) * 1000003) ^ this.f61079b.hashCode()) * 1000003) ^ this.f61080c.hashCode()) * 1000003) ^ this.f61081d.hashCode()) * 1000003) ^ this.f61082e.hashCode()) * 1000003) ^ this.f61083f.hashCode()) * 1000003) ^ this.f61084g.hashCode();
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f61078a + ", s720pSizeMap=" + this.f61079b + ", previewSize=" + this.f61080c + ", s1440pSizeMap=" + this.f61081d + ", recordSize=" + this.f61082e + ", maximumSizeMap=" + this.f61083f + ", ultraMaximumSizeMap=" + this.f61084g + "}";
    }
}
