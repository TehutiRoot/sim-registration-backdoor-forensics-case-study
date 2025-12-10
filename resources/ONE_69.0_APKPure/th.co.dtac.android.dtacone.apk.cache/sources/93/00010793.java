package p000;

import com.google.android.datatransport.Event;
import com.google.android.datatransport.EventContext;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.ProductData;

/* renamed from: r8 */
/* loaded from: classes3.dex */
public final class C13233r8 extends Event {

    /* renamed from: a */
    public final Integer f77410a;

    /* renamed from: b */
    public final Object f77411b;

    /* renamed from: c */
    public final Priority f77412c;

    /* renamed from: d */
    public final ProductData f77413d;

    /* renamed from: e */
    public final EventContext f77414e;

    public C13233r8(Integer num, Object obj, Priority priority, ProductData productData, EventContext eventContext) {
        this.f77410a = num;
        if (obj != null) {
            this.f77411b = obj;
            if (priority != null) {
                this.f77412c = priority;
                this.f77413d = productData;
                this.f77414e = eventContext;
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
        Integer num = this.f77410a;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.f77411b.equals(event.getPayload()) && this.f77412c.equals(event.getPriority()) && ((productData = this.f77413d) != null ? productData.equals(event.getProductData()) : event.getProductData() == null)) {
                EventContext eventContext = this.f77414e;
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
        return this.f77410a;
    }

    @Override // com.google.android.datatransport.Event
    public EventContext getEventContext() {
        return this.f77414e;
    }

    @Override // com.google.android.datatransport.Event
    public Object getPayload() {
        return this.f77411b;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.f77412c;
    }

    @Override // com.google.android.datatransport.Event
    public ProductData getProductData() {
        return this.f77413d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f77410a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((((hashCode ^ 1000003) * 1000003) ^ this.f77411b.hashCode()) * 1000003) ^ this.f77412c.hashCode()) * 1000003;
        ProductData productData = this.f77413d;
        if (productData == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = productData.hashCode();
        }
        int i2 = (hashCode3 ^ hashCode2) * 1000003;
        EventContext eventContext = this.f77414e;
        if (eventContext != null) {
            i = eventContext.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "Event{code=" + this.f77410a + ", payload=" + this.f77411b + ", priority=" + this.f77412c + ", productData=" + this.f77413d + ", eventContext=" + this.f77414e + "}";
    }
}