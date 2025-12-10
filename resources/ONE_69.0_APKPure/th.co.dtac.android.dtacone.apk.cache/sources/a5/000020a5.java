package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.C2622f;
import androidx.camera.video.OutputOptions;
import androidx.core.util.Preconditions;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class MediaStoreOutputOptions extends OutputOptions {
    @NonNull
    public static final ContentValues EMPTY_CONTENT_VALUES = new ContentValues();

    /* renamed from: b */
    public final AbstractC2581a f11708b;

    /* loaded from: classes.dex */
    public static final class Builder extends OutputOptions.AbstractC2583a {

        /* renamed from: b */
        public final AbstractC2581a.AbstractC2582a f11709b;

        public Builder(@NonNull ContentResolver contentResolver, @NonNull Uri uri) {
            super(new C2622f.C2624b());
            Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            AbstractC2581a.AbstractC2582a abstractC2582a = (AbstractC2581a.AbstractC2582a) this.f11711a;
            this.f11709b = abstractC2582a;
            abstractC2582a.mo62189f(contentResolver).mo62190e(uri).mo62188g(MediaStoreOutputOptions.EMPTY_CONTENT_VALUES);
        }

        @NonNull
        public Builder setContentValues(@NonNull ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.f11709b.mo62188g(contentValues);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setDurationLimitMillis(@IntRange(from = 0) long j) {
            return super.setDurationLimitMillis(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setFileSizeLimit(@IntRange(from = 0) long j) {
            return super.setFileSizeLimit(j);
        }

        @Override // androidx.camera.video.OutputOptions.AbstractC2583a
        @NonNull
        public /* bridge */ /* synthetic */ Object setLocation(@Nullable Location location) {
            return super.setLocation(location);
        }

        @NonNull
        /* renamed from: build */
        public MediaStoreOutputOptions m69375build() {
            return new MediaStoreOutputOptions(this.f11709b.mo62191d());
        }
    }

    /* renamed from: androidx.camera.video.MediaStoreOutputOptions$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2581a extends OutputOptions.AbstractC2584b {

        /* renamed from: androidx.camera.video.MediaStoreOutputOptions$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2582a extends OutputOptions.AbstractC2584b.AbstractC2585a {
            /* renamed from: d */
            public abstract AbstractC2581a mo62191d();

            /* renamed from: e */
            public abstract AbstractC2582a mo62190e(Uri uri);

            /* renamed from: f */
            public abstract AbstractC2582a mo62189f(ContentResolver contentResolver);

            /* renamed from: g */
            public abstract AbstractC2582a mo62188g(ContentValues contentValues);
        }

        /* renamed from: d */
        public abstract Uri mo62197d();

        /* renamed from: e */
        public abstract ContentResolver mo62196e();

        /* renamed from: f */
        public abstract ContentValues mo62195f();
    }

    public MediaStoreOutputOptions(AbstractC2581a abstractC2581a) {
        super(abstractC2581a);
        this.f11708b = abstractC2581a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStoreOutputOptions)) {
            return false;
        }
        return this.f11708b.equals(((MediaStoreOutputOptions) obj).f11708b);
    }

    @NonNull
    public Uri getCollectionUri() {
        return this.f11708b.mo62197d();
    }

    @NonNull
    public ContentResolver getContentResolver() {
        return this.f11708b.mo62196e();
    }

    @NonNull
    public ContentValues getContentValues() {
        return this.f11708b.mo62195f();
    }

    public int hashCode() {
        return this.f11708b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f11708b.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}