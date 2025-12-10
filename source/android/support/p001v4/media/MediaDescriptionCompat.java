package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.AbstractC1961d;
import android.support.p001v4.media.AbstractC1963e;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C1946a();
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;

    /* renamed from: a */
    public final String f8506a;

    /* renamed from: b */
    public final CharSequence f8507b;

    /* renamed from: c */
    public final CharSequence f8508c;

    /* renamed from: d */
    public final CharSequence f8509d;

    /* renamed from: e */
    public final Bitmap f8510e;

    /* renamed from: f */
    public final Uri f8511f;

    /* renamed from: g */
    public final Bundle f8512g;

    /* renamed from: h */
    public final Uri f8513h;

    /* renamed from: i */
    public Object f8514i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$Builder */
    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f8515a;

        /* renamed from: b */
        public CharSequence f8516b;

        /* renamed from: c */
        public CharSequence f8517c;

        /* renamed from: d */
        public CharSequence f8518d;

        /* renamed from: e */
        public Bitmap f8519e;

        /* renamed from: f */
        public Uri f8520f;

        /* renamed from: g */
        public Bundle f8521g;

        /* renamed from: h */
        public Uri f8522h;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.f8515a, this.f8516b, this.f8517c, this.f8518d, this.f8519e, this.f8520f, this.f8521g, this.f8522h);
        }

        public Builder setDescription(@Nullable CharSequence charSequence) {
            this.f8518d = charSequence;
            return this;
        }

        public Builder setExtras(@Nullable Bundle bundle) {
            this.f8521g = bundle;
            return this;
        }

        public Builder setIconBitmap(@Nullable Bitmap bitmap) {
            this.f8519e = bitmap;
            return this;
        }

        public Builder setIconUri(@Nullable Uri uri) {
            this.f8520f = uri;
            return this;
        }

        public Builder setMediaId(@Nullable String str) {
            this.f8515a = str;
            return this;
        }

        public Builder setMediaUri(@Nullable Uri uri) {
            this.f8522h = uri;
            return this;
        }

        public Builder setSubtitle(@Nullable CharSequence charSequence) {
            this.f8517c = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f8516b = charSequence;
            return this;
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public static class C1946a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(AbstractC1961d.m64946a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f8506a = str;
        this.f8507b = charSequence;
        this.f8508c = charSequence2;
        this.f8509d = charSequence3;
        this.f8510e = bitmap;
        this.f8511f = uri;
        this.f8512g = bundle;
        this.f8513h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.p001v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$Builder r2 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r2.<init>()
            java.lang.String r3 = android.support.p001v4.media.AbstractC1961d.m64941f(r9)
            r2.setMediaId(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.AbstractC1961d.m64939h(r9)
            r2.setTitle(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.AbstractC1961d.m64940g(r9)
            r2.setSubtitle(r3)
            java.lang.CharSequence r3 = android.support.p001v4.media.AbstractC1961d.m64945b(r9)
            r2.setDescription(r3)
            android.graphics.Bitmap r3 = android.support.p001v4.media.AbstractC1961d.m64943d(r9)
            r2.setIconBitmap(r3)
            android.net.Uri r3 = android.support.p001v4.media.AbstractC1961d.m64942e(r9)
            r2.setIconUri(r3)
            android.os.Bundle r3 = android.support.p001v4.media.AbstractC1961d.m64944c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L46
            android.support.p001v4.media.session.MediaSessionCompat.ensureClassLoader(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L47
        L46:
            r5 = r0
        L47:
            if (r5 == 0) goto L5f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L59
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L59
            goto L60
        L59:
            r3.remove(r4)
            r3.remove(r6)
        L5f:
            r0 = r3
        L60:
            r2.setExtras(r0)
            if (r5 == 0) goto L69
            r2.setMediaUri(r5)
            goto L74
        L69:
            r0 = 23
            if (r1 < r0) goto L74
            android.net.Uri r0 = android.support.p001v4.media.AbstractC1963e.m64928a(r9)
            r2.setMediaUri(r0)
        L74:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.build()
            r0.f8514i = r9
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.fromMediaDescription(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.f8509d;
    }

    @Nullable
    public Bundle getExtras() {
        return this.f8512g;
    }

    @Nullable
    public Bitmap getIconBitmap() {
        return this.f8510e;
    }

    @Nullable
    public Uri getIconUri() {
        return this.f8511f;
    }

    public Object getMediaDescription() {
        Object obj = this.f8514i;
        if (obj == null) {
            int i = Build.VERSION.SDK_INT;
            Object m64936b = AbstractC1961d.C1962a.m64936b();
            AbstractC1961d.C1962a.m64931g(m64936b, this.f8506a);
            AbstractC1961d.C1962a.m64929i(m64936b, this.f8507b);
            AbstractC1961d.C1962a.m64930h(m64936b, this.f8508c);
            AbstractC1961d.C1962a.m64935c(m64936b, this.f8509d);
            AbstractC1961d.C1962a.m64933e(m64936b, this.f8510e);
            AbstractC1961d.C1962a.m64932f(m64936b, this.f8511f);
            Bundle bundle = this.f8512g;
            if (i < 23 && this.f8513h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
                }
                bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.f8513h);
            }
            AbstractC1961d.C1962a.m64934d(m64936b, bundle);
            if (i >= 23) {
                AbstractC1963e.C1964a.m64927a(m64936b, this.f8513h);
            }
            Object m64937a = AbstractC1961d.C1962a.m64937a(m64936b);
            this.f8514i = m64937a;
            return m64937a;
        }
        return obj;
    }

    @Nullable
    public String getMediaId() {
        return this.f8506a;
    }

    @Nullable
    public Uri getMediaUri() {
        return this.f8513h;
    }

    @Nullable
    public CharSequence getSubtitle() {
        return this.f8508c;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.f8507b;
    }

    public String toString() {
        return ((Object) this.f8507b) + ", " + ((Object) this.f8508c) + ", " + ((Object) this.f8509d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbstractC1961d.m64938i(getMediaDescription(), parcel, i);
    }
}
