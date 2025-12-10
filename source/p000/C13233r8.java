package p000;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.ProductData;

/* renamed from: r8 */
/* loaded from: classes3.dex */
public final class C13233r8 extends Event {

    /* renamed from: a */
    public final Integer f77179a;

    /* renamed from: b */
    public final Object f77180b;

    /* renamed from: c */
    public final Priority f77181c;

    /* renamed from: d */
    public final ProductData f77182d;

    /* renamed from: e */
    public final EventContext f77183e;

    public C13233r8(Integer num, Object obj, Priority priority, ProductData productData, EventContext eventContext) {
        this.f77179a = num;
        if (obj != null) {
            this.f77180b = obj;
            if (priority != null) {
                this.f77181c = priority;
                this.f77182d = productData;
                this.f77183e = eventContext;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public boolean equals(Object obj) {
        ProductData productData;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.f77179a;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.f77180b.equals(event.getPayload()) && this.f77181c.equals(event.getPriority()) && ((productData = this.f77182d) != null ? productData.equals(event.getProductData()) : event.getProductData() == null)) {
                EventContext eventContext = this.f77183e;
                if (eventContext == null) {
                    if (event.getEventContext() == null) {
                        return true;
                    }
                } else if (eventContext.equals(event.getEventContext())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    public Integer getCode() {
        return this.f77179a;
    }

    @Override // com.google.android.datatransport.Event
    public EventContext getEventContext() {
        return this.f77183e;
    }

    @Override // com.google.android.datatransport.Event
    public Object getPayload() {
        return this.f77180b;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.f77181c;
    }

    @Override // com.google.android.datatransport.Event
    public ProductData getProductData() {
        return this.f77182d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f77179a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((((hashCode ^ 1000003) * 1000003) ^ this.f77180b.hashCode()) * 1000003) ^ this.f77181c.hashCode()) * 1000003;
        ProductData productData = this.f77182d;
        if (productData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = productData.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode2) * 1000003;
        EventContext eventContext = this.f77183e;
        if (eventContext != null) {
            i = eventContext.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "Event{code=" + this.f77179a + ", payload=" + this.f77180b + ", priority=" + this.f77181c + ", productData=" + this.f77182d + ", eventContext=" + this.f77183e + "}";
    }
}
