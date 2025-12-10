package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2640f;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class MediaStoreOutputOptions extends OutputOptions {
    @NonNull
    public static final ContentValues EMPTY_CONTENT_VALUES = new ContentValues();

    /* renamed from: b */
    public final AbstractC2599a f11620b;

    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2601a {

        /* renamed from: b */
        public final AbstractC2599a.AbstractC2600a f11621b;

        public Builder(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
            super(new C2640f.C2642b());
            Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            AbstractC2599a.AbstractC2600a abstractC2600a = (AbstractC2599a.AbstractC2600a) this.f11623a;
            this.f11621b = abstractC2600a;
            abstractC2600a.mo62241f(contentResolver).mo62242e(uri).mo62240g(MediaStoreOutputOptions.EMPTY_CONTENT_VALUES);
        }

        @NonNull
        public Builder setContentValues(@NonNull ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.f11621b.mo62240g(contentValues);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setDurationLimitMillis(@IntRange(from = 0) long j) {
            return super.setDurationLimitMillis(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setFileSizeLimit(@IntRange(from = 0) long j) {
            return super.setFileSizeLimit(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2601a
        @NonNull
        public /* bridge */ /* synthetic */ Object setLocation(@Nullable Location location) {
            return super.setLocation(location);
        }

        @NonNull
        /* renamed from: build */
        public MediaStoreOutputOptions m69189build() {
            return new MediaStoreOutputOptions(this.f11621b.mo62243d());
        }
    }

    /* renamed from: androidx.camera.video.MediaStoreOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2599a extends OutputOptions.AbstractC2602b {

        /* renamed from: androidx.camera.video.MediaStoreOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2600a extends OutputOptions.AbstractC2602b.AbstractC2603a {
            /* renamed from: d */
            public abstract AbstractC2599a mo62243d();

            /* renamed from: e */
            public abstract AbstractC2600a mo62242e(Uri uri);

            /* renamed from: f */
            public abstract AbstractC2600a mo62241f(ContentResolver contentResolver);

            /* renamed from: g */
            public abstract AbstractC2600a mo62240g(ContentValues contentValues);
        }

        /* renamed from: d */
        public abstract Uri mo62249d();

        /* renamed from: e */
        public abstract ContentResolver mo62248e();

        /* renamed from: f */
        public abstract ContentValues mo62247f();
    }

    public MediaStoreOutputOptions(AbstractC2599a abstractC2599a) {
        super(abstractC2599a);
        this.f11620b = abstractC2599a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions)) {
            return false;
        }
        return this.f11620b.equals(((MediaStoreOutputOptions) obj).f11620b);
    }

    @NonNull
    public Uri getCollectionUri() {
        return this.f11620b.mo62249d();
    }

    @NonNull
    public ContentResolver getContentResolver() {
        return this.f11620b.mo62248e();
    }

    @NonNull
    public ContentValues getContentValues() {
        return this.f11620b.mo62247f();
    }

    public int hashCode() {
        return this.f11620b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11620b.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}
