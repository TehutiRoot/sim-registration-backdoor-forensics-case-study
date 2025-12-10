package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* renamed from: com.google.firebase.crashlytics.internal.model.f */
/* loaded from: classes4.dex */
public final class C8425f extends CrashlyticsReport.FilesPayload.File {

    /* renamed from: a */
    public final String f55165a;

    /* renamed from: b */
    public final byte[] f55166b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.f$b */
    /* loaded from: classes4.dex */
    public static final class C8427b extends CrashlyticsReport.FilesPayload.File.Builder {

        /* renamed from: a */
        public String f55167a;

        /* renamed from: b */
        public byte[] f55168b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File build() {
            byte[] bArr;
            String str = this.f55167a;
            if (str != null && (bArr = this.f55168b) != null) {
                return new C8425f(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f55167a == null) {
                sb.append(" filename");
            }
            if (this.f55168b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr != null) {
                this.f55168b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str != null) {
                this.f55167a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    public boolean equals(Object obj) {
        byte[] contents;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f55165a.equals(file.getFilename())) {
            byte[] bArr = this.f55166b;
            if (file instanceof C8425f) {
                contents = ((C8425f) file).f55166b;
            } else {
                contents = file.getContents();
            }
            if (Arrays.equals(bArr, contents)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public byte[] getContents() {
        return this.f55166b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public String getFilename() {
        return this.f55165a;
    }

    public int hashCode() {
        return ((this.f55165a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f55166b);
    }

    public String toString() {
        return "File{filename=" + this.f55165a + ", contents=" + Arrays.toString(this.f55166b) + "}";
    }

    public C8425f(String str, byte[] bArr) {
        this.f55165a = str;
        this.f55166b = bArr;
    }
}
