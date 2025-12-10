package android.support.p001v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C1948a();
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;

    /* renamed from: a */
    public final int f8531a;

    /* renamed from: b */
    public final float f8532b;

    /* renamed from: c */
    public Object f8533c;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.RatingCompat$StarStyle */
    /* loaded from: classes.dex */
    public @interface StarStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: android.support.v4.media.RatingCompat$Style */
    /* loaded from: classes.dex */
    public @interface Style {
    }

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes.dex */
    public static class C1948a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f8531a = i;
        this.f8532b = f;
    }

    public static RatingCompat fromRating(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = newHeartRating(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = newThumbRating(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = newStarRating(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = newPercentageRating(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = newUnratedRating(ratingStyle);
            }
            ratingCompat.f8533c = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat newHeartRating(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(1, f);
    }

    public static RatingCompat newPercentageRating(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        return null;
    }

    public static RatingCompat newStarRating(int i, float f) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid rating style (");
                    sb.append(i);
                    sb.append(") for a star rating");
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat newThumbRating(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(2, f);
    }

    public static RatingCompat newUnratedRating(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f8531a;
    }

    public float getPercentRating() {
        if (this.f8531a == 6 && isRated()) {
            return this.f8532b;
        }
        return -1.0f;
    }

    public Object getRating() {
        if (this.f8533c == null) {
            if (isRated()) {
                int i = this.f8531a;
                switch (i) {
                    case 1:
                        this.f8533c = Rating.newHeartRating(hasHeart());
                        break;
                    case 2:
                        this.f8533c = Rating.newThumbRating(isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f8533c = Rating.newStarRating(i, getStarRating());
                        break;
                    case 6:
                        this.f8533c = Rating.newPercentageRating(getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                this.f8533c = Rating.newUnratedRating(this.f8531a);
            }
        }
        return this.f8533c;
    }

    public int getRatingStyle() {
        return this.f8531a;
    }

    public float getStarRating() {
        int i = this.f8531a;
        if ((i == 3 || i == 4 || i == 5) && isRated()) {
            return this.f8532b;
        }
        return -1.0f;
    }

    public boolean hasHeart() {
        if (this.f8531a != 1 || this.f8532b != 1.0f) {
            return false;
        }
        return true;
    }

    public boolean isRated() {
        if (this.f8532b >= 0.0f) {
            return true;
        }
        return false;
    }

    public boolean isThumbUp() {
        if (this.f8531a != 2 || this.f8532b != 1.0f) {
            return false;
        }
        return true;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f8531a);
        sb.append(" rating=");
        float f = this.f8532b;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8531a);
        parcel.writeFloat(this.f8532b);
    }
}
