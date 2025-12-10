package com.google.mlkit.common.internal.model;

import com.google.mlkit.common.internal.model.ModelUtils;

/* renamed from: com.google.mlkit.common.internal.model.a */
/* loaded from: classes4.dex */
public final class C8816a extends ModelUtils.AutoMLManifest {

    /* renamed from: a */
    public final String f56871a;

    /* renamed from: b */
    public final String f56872b;

    /* renamed from: c */
    public final String f56873c;

    public C8816a(String str, String str2, String str3) {
        if (str != null) {
            this.f56871a = str;
            if (str2 != null) {
                this.f56872b = str2;
                if (str3 != null) {
                    this.f56873c = str3;
                    return;
                }
                throw new NullPointerException("Null labelsFile");
            }
            throw new NullPointerException("Null modelFile");
        }
        throw new NullPointerException("Null modelType");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.AutoMLManifest) {
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            if (this.f56871a.equals(autoMLManifest.getModelType()) && this.f56872b.equals(autoMLManifest.getModelFile()) && this.f56873c.equals(autoMLManifest.getLabelsFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public String getLabelsFile() {
        return this.f56873c;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public String getModelFile() {
        return this.f56872b;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public String getModelType() {
        return this.f56871a;
    }

    public final int hashCode() {
        return ((((this.f56871a.hashCode() ^ 1000003) * 1000003) ^ this.f56872b.hashCode()) * 1000003) ^ this.f56873c.hashCode();
    }

    public final String toString() {
        return "AutoMLManifest{modelType=" + this.f56871a + ", modelFile=" + this.f56872b + ", labelsFile=" + this.f56873c + "}";
    }
}
