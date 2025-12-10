package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.widget.RatingBarChangeEvent;

/* renamed from: Q8 */
/* loaded from: classes5.dex */
public final class C1139Q8 extends RatingBarChangeEvent {

    /* renamed from: a */
    public final RatingBar f5129a;

    /* renamed from: b */
    public final float f5130b;

    /* renamed from: c */
    public final boolean f5131c;

    public C1139Q8(RatingBar ratingBar, float f, boolean z) {
        if (ratingBar != null) {
            this.f5129a = ratingBar;
            this.f5130b = f;
            this.f5131c = z;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RatingBarChangeEvent)) {
            return false;
        }
        RatingBarChangeEvent ratingBarChangeEvent = (RatingBarChangeEvent) obj;
        if (this.f5129a.equals(ratingBarChangeEvent.view()) && Float.floatToIntBits(this.f5130b) == Float.floatToIntBits(ratingBarChangeEvent.rating()) && this.f5131c == ratingBarChangeEvent.fromUser()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public boolean fromUser() {
        return this.f5131c;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f5129a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f5130b)) * 1000003;
        if (this.f5131c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public float rating() {
        return this.f5130b;
    }

    public String toString() {
        return "RatingBarChangeEvent{view=" + this.f5129a + ", rating=" + this.f5130b + ", fromUser=" + this.f5131c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public RatingBar view() {
        return this.f5129a;
    }
}