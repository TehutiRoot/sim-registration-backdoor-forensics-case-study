package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import androidx.camera.video.FileDescriptorOutputOptions;

/* renamed from: androidx.camera.video.c */
/* loaded from: classes.dex */
public final class C2631c extends FileDescriptorOutputOptions.AbstractC2595a {

    /* renamed from: a */
    public final long f11813a;

    /* renamed from: b */
    public final long f11814b;

    /* renamed from: c */
    public final Location f11815c;

    /* renamed from: d */
    public final ParcelFileDescriptor f11816d;

    /* renamed from: androidx.camera.video.c$b */
    /* loaded from: classes.dex */
    public static final class C2633b extends FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a {

        /* renamed from: a */
        public Long f11817a;

        /* renamed from: b */
        public Long f11818b;

        /* renamed from: c */
        public Location f11819c;

        /* renamed from: d */
        public ParcelFileDescriptor f11820d;

        @Override // androidx.camera.video.FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a
        /* renamed from: d */
        public FileDescriptorOutputOptions.AbstractC2595a mo62265d() {
            String str = "";
            if (this.f11817a == null) {
                str = " fileSizeLimit";
            }
            if (this.f11818b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f11820d == null) {
                str = str + " parcelFileDescriptor";
            }
            if (str.isEmpty()) {
                return new C2631c(this.f11817a.longValue(), this.f11818b.longValue(), this.f11819c, this.f11820d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a
        /* renamed from: e */
        public FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a mo62264e(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor != null) {
                this.f11820d = parcelFileDescriptor;
                return this;
            }
            throw new NullPointerException("Null parcelFileDescriptor");
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: f */
        public FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a mo62246a(long j) {
            this.f11818b = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: g */
        public FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a mo62245b(long j) {
            this.f11817a = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: h */
        public FileDescriptorOutputOptions.AbstractC2595a.AbstractC2596a mo62244c(Location location) {
            this.f11819c = location;
            return this;
        }
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: a */
    public long mo62252a() {
        return this.f11814b;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: b */
    public long mo62251b() {
        return this.f11813a;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: c */
    public Location mo62250c() {
        return this.f11815c;
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.AbstractC2595a
    /* renamed from: d */
    public ParcelFileDescriptor mo62266d() {
        return this.f11816d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileDescriptorOutputOptions.AbstractC2595a)) {
            return false;
        }
        FileDescriptorOutputOptions.AbstractC2595a abstractC2595a = (FileDescriptorOutputOptions.AbstractC2595a) obj;
        if (this.f11813a == abstractC2595a.mo62251b() && this.f11814b == abstractC2595a.mo62252a() && ((location = this.f11815c) != null ? location.equals(abstractC2595a.mo62250c()) : abstractC2595a.mo62250c() == null) && this.f11816d.equals(abstractC2595a.mo62266d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f11813a;
        long j2 = this.f11814b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.f11815c;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        return this.f11816d.hashCode() ^ ((i ^ hashCode) * 1000003);
    }

    public String toString() {
        return "FileDescriptorOutputOptionsInternal{fileSizeLimit=" + this.f11813a + ", durationLimitMillis=" + this.f11814b + ", location=" + this.f11815c + ", parcelFileDescriptor=" + this.f11816d + "}";
    }

    public C2631c(long j, long j2, Location location, ParcelFileDescriptor parcelFileDescriptor) {
        this.f11813a = j;
        this.f11814b = j2;
        this.f11815c = location;
        this.f11816d = parcelFileDescriptor;
    }
}
