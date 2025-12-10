package p000;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.pojo.InstanceCreator;
import org.bson.codecs.pojo.PropertyModel;
import org.bson.codecs.pojo.annotations.BsonProperty;

/* renamed from: af0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19035af0 implements InstanceCreator {

    /* renamed from: a */
    public final C0982Nz f8384a;

    /* renamed from: b */
    public final Map f8385b;

    /* renamed from: c */
    public final Map f8386c;

    /* renamed from: d */
    public final Object[] f8387d;

    /* renamed from: e */
    public Object f8388e;

    public C19035af0(C0982Nz c0982Nz) {
        this.f8384a = c0982Nz;
        if (c0982Nz.m67143i().isEmpty()) {
            this.f8385b = null;
            this.f8386c = null;
            this.f8387d = null;
            this.f8388e = c0982Nz.m67147e();
            return;
        }
        this.f8385b = new HashMap();
        this.f8386c = new HashMap();
        for (int i = 0; i < c0982Nz.m67143i().size(); i++) {
            if (c0982Nz.m67148d() != null && c0982Nz.m67148d().intValue() == i) {
                this.f8386c.put("_id", c0982Nz.m67148d());
            } else {
                this.f8386c.put(((BsonProperty) c0982Nz.m67143i().get(i)).value(), Integer.valueOf(i));
            }
        }
        this.f8387d = new Object[this.f8386c.size()];
    }

    /* renamed from: a */
    public final void m65075a() {
        try {
            this.f8388e = this.f8384a.m67146f(this.f8387d);
            for (Map.Entry entry : this.f8385b.entrySet()) {
                m65074b((PropertyModel) entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            throw new CodecConfigurationException(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public final void m65074b(PropertyModel propertyModel, Object obj) {
        set(obj, propertyModel);
    }

    @Override // org.bson.codecs.pojo.InstanceCreator
    public Object getInstance() {
        if (this.f8388e == null) {
            try {
                for (Map.Entry entry : this.f8386c.entrySet()) {
                    this.f8387d[((Integer) entry.getValue()).intValue()] = null;
                }
                m65075a();
            } catch (CodecConfigurationException e) {
                throw new CodecConfigurationException(String.format("Could not construct new instance of: %s. Missing the following properties: %s", this.f8384a.m67142j().getSimpleName(), this.f8386c.keySet()), e);
            }
        }
        return this.f8388e;
    }

    @Override // org.bson.codecs.pojo.InstanceCreator
    public void set(Object obj, PropertyModel propertyModel) {
        if (this.f8388e != null) {
            propertyModel.getPropertyAccessor().set(this.f8388e, obj);
            return;
        }
        if (!this.f8386c.isEmpty()) {
            String writeName = propertyModel.getWriteName();
            if (!this.f8386c.containsKey(writeName)) {
                writeName = propertyModel.getName();
            }
            Integer num = (Integer) this.f8386c.get(writeName);
            if (num != null) {
                this.f8387d[num.intValue()] = obj;
            }
            this.f8386c.remove(writeName);
        }
        if (this.f8386c.isEmpty()) {
            m65075a();
        } else {
            this.f8385b.put(propertyModel, obj);
        }
    }
}
