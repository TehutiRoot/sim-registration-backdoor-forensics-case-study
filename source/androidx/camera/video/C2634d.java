package androidx.camera.video;

import android.location.Location;
import androidx.camera.video.FileOutputOptions;
import java.io.File;

/* renamed from: androidx.camera.video.d */
/* loaded from: classes.dex */
public final class C2634d extends FileOutputOptions.AbstractC2597a {

    /* renamed from: a */
    public final long f11821a;

    /* renamed from: b */
    public final long f11822b;

    /* renamed from: c */
    public final Location f11823c;

    /* renamed from: d */
    public final File f11824d;

    /* renamed from: androidx.camera.video.d$b */
    /* loaded from: classes.dex */
    public static final class C2636b extends FileOutputOptions.AbstractC2597a.AbstractC2598a {

        /* renamed from: a */
        public Long f11825a;

        /* renamed from: b */
        public Long f11826b;

        /* renamed from: c */
        public Location f11827c;

        /* renamed from: d */
        public File f11828d;

        @Override // androidx.camera.video.FileOutputOptions.AbstractC2597a.AbstractC2598a
        /* renamed from: d */
        public FileOutputOptions.AbstractC2597a mo62259d() {
            String str = "";
            if (this.f11825a == null) {
                str = " fileSizeLimit";
            }
            if (this.f11826b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f11828d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C2634d(this.f11825a.longValue(), this.f11826b.longValue(), this.f11827c, this.f11828d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.FileOutputOptions.AbstractC2597a.AbstractC2598a
        /* renamed from: e */
        public FileOutputOptions.AbstractC2597a.AbstractC2598a mo62258e(File file) {
            if (file != null) {
                this.f11828d = file;
                return this;
            }
            throw new NullPointerException("Null file");
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: f */
        public FileOutputOptions.AbstractC2597a.AbstractC2598a mo62246a(long j) {
            this.f11826b = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: g */
        public FileOutputOptions.AbstractC2597a.AbstractC2598a mo62245b(long j) {
            this.f11825a = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: h */
        public FileOutputOptions.AbstractC2597a.AbstractC2598a mo62244c(Location location) {
            this.f11827c = location;
            return this;
        }
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: a */
    public long mo62252a() {
        return this.f11822b;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: b */
    public long mo62251b() {
        return this.f11821a;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: c */
    public Location mo62250c() {
        return this.f11823c;
    }

    @Override // androidx.camera.video.FileOutputOptions.AbstractC2597a
    /* renamed from: d */
    public File mo62260d() {
        return this.f11824d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions.AbstractC2597a)) {
            return false;
        }
        FileOutputOptions.AbstractC2597a abstractC2597a = (FileOutputOptions.AbstractC2597a) obj;
        if (this.f11821a == abstractC2597a.mo62251b() && this.f11822b == abstractC2597a.mo62252a() && ((location = this.f11823c) != null ? location.equals(abstractC2597a.mo62250c()) : abstractC2597a.mo62250c() == null) && this.f11824d.equals(abstractC2597a.mo62260d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f11821a;
        long j2 = this.f11822b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.f11823c;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        return this.f11824d.hashCode() ^ ((i ^ hashCode) * 1000003);
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f11821a + ", durationLimitMillis=" + this.f11822b + ", location=" + this.f11823c + ", file=" + this.f11824d + "}";
    }

    public C2634d(long j, long j2, Location location, File file) {
        this.f11821a = j;
        this.f11822b = j2;
        this.f11823c = location;
        this.f11824d = file;
    }
}
