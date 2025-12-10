package p000;

import android.widget.RatingBar;
import com.jakewharton.rxbinding2.widget.RatingBarChangeEvent;

/* renamed from: Q8 */
/* loaded from: classes5.dex */
public final class C1150Q8 extends RatingBarChangeEvent {

    /* renamed from: a */
    public final RatingBar f4964a;

    /* renamed from: b */
    public final float f4965b;

    /* renamed from: c */
    public final boolean f4966c;

    public C1150Q8(RatingBar ratingBar, float f, boolean z) {
        if (ratingBar != null) {
            this.f4964a = ratingBar;
            this.f4965b = f;
            this.f4966c = z;
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
        if (this.f4964a.equals(ratingBarChangeEvent.view()) && Float.floatToIntBits(this.f4965b) == Float.floatToIntBits(ratingBarChangeEvent.rating()) && this.f4966c == ratingBarChangeEvent.fromUser()) {
            return true;
        }
        return false;
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public boolean fromUser() {
        return this.f4966c;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f4964a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f4965b)) * 1000003;
        if (this.f4966c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public float rating() {
        return this.f4965b;
    }

    public String toString() {
        return "RatingBarChangeEvent{view=" + this.f4964a + ", rating=" + this.f4965b + ", fromUser=" + this.f4966c + "}";
    }

    @Override // com.jakewharton.rxbinding2.widget.RatingBarChangeEvent
    public RatingBar view() {
        return this.f4964a;
    }
}
