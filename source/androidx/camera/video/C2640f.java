package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import androidx.camera.video.MediaStoreOutputOptions;

/* renamed from: androidx.camera.video.f */
/* loaded from: classes.dex */
public final class C2640f extends MediaStoreOutputOptions.AbstractC2599a {

    /* renamed from: a */
    public final long f11835a;

    /* renamed from: b */
    public final long f11836b;

    /* renamed from: c */
    public final Location f11837c;

    /* renamed from: d */
    public final ContentResolver f11838d;

    /* renamed from: e */
    public final Uri f11839e;

    /* renamed from: f */
    public final ContentValues f11840f;

    /* renamed from: androidx.camera.video.f$b */
    /* loaded from: classes.dex */
    public static final class C2642b extends MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a {

        /* renamed from: a */
        public Long f11841a;

        /* renamed from: b */
        public Long f11842b;

        /* renamed from: c */
        public Location f11843c;

        /* renamed from: d */
        public ContentResolver f11844d;

        /* renamed from: e */
        public Uri f11845e;

        /* renamed from: f */
        public ContentValues f11846f;

        @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a
        /* renamed from: d */
        public MediaStoreOutputOptions.AbstractC2599a mo62243d() {
            String str = "";
            if (this.f11841a == null) {
                str = " fileSizeLimit";
            }
            if (this.f11842b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f11844d == null) {
                str = str + " contentResolver";
            }
            if (this.f11845e == null) {
                str = str + " collectionUri";
            }
            if (this.f11846f == null) {
                str = str + " contentValues";
            }
            if (str.isEmpty()) {
                return new C2640f(this.f11841a.longValue(), this.f11842b.longValue(), this.f11843c, this.f11844d, this.f11845e, this.f11846f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a
        /* renamed from: e */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62242e(Uri uri) {
            if (uri != null) {
                this.f11845e = uri;
                return this;
            }
            throw new NullPointerException("Null collectionUri");
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a
        /* renamed from: f */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62241f(ContentResolver contentResolver) {
            if (contentResolver != null) {
                this.f11844d = contentResolver;
                return this;
            }
            throw new NullPointerException("Null contentResolver");
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a
        /* renamed from: g */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62240g(ContentValues contentValues) {
            if (contentValues != null) {
                this.f11846f = contentValues;
                return this;
            }
            throw new NullPointerException("Null contentValues");
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: h */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62246a(long j) {
            this.f11842b = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: i */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62245b(long j) {
            this.f11841a = Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2602b.AbstractC2603a
        /* renamed from: j */
        public MediaStoreOutputOptions.AbstractC2599a.AbstractC2600a mo62244c(Location location) {
            this.f11843c = location;
            return this;
        }
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: a */
    public long mo62252a() {
        return this.f11836b;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: b */
    public long mo62251b() {
        return this.f11835a;
    }

    @Override // androidx.camera.video.OutputOptions.AbstractC2602b
    /* renamed from: c */
    public Location mo62250c() {
        return this.f11837c;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a
    /* renamed from: d */
    public Uri mo62249d() {
        return this.f11839e;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a
    /* renamed from: e */
    public ContentResolver mo62248e() {
        return this.f11838d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions.AbstractC2599a)) {
            return false;
        }
        MediaStoreOutputOptions.AbstractC2599a abstractC2599a = (MediaStoreOutputOptions.AbstractC2599a) obj;
        if (this.f11835a == abstractC2599a.mo62251b() && this.f11836b == abstractC2599a.mo62252a() && ((location = this.f11837c) != null ? location.equals(abstractC2599a.mo62250c()) : abstractC2599a.mo62250c() == null) && this.f11838d.equals(abstractC2599a.mo62248e()) && this.f11839e.equals(abstractC2599a.mo62249d()) && this.f11840f.equals(abstractC2599a.mo62247f())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.AbstractC2599a
    /* renamed from: f */
    public ContentValues mo62247f() {
        return this.f11840f;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f11835a;
        long j2 = this.f11836b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.f11837c;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        return this.f11840f.hashCode() ^ ((((((i ^ hashCode) * 1000003) ^ this.f11838d.hashCode()) * 1000003) ^ this.f11839e.hashCode()) * 1000003);
    }

    public String toString() {
        return "MediaStoreOutputOptionsInternal{fileSizeLimit=" + this.f11835a + ", durationLimitMillis=" + this.f11836b + ", location=" + this.f11837c + ", contentResolver=" + this.f11838d + ", collectionUri=" + this.f11839e + ", contentValues=" + this.f11840f + "}";
    }

    public C2640f(long j, long j2, Location location, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.f11835a = j;
        this.f11836b = j2;
        this.f11837c = location;
        this.f11838d = contentResolver;
        this.f11839e = uri;
        this.f11840f = contentValues;
    }
}
