package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

/* loaded from: classes.dex */
public class IADataForComplexProperty {

    /* renamed from: a */
    public final PropertySetter f39772a;

    /* renamed from: b */
    public final AggregationType f39773b;

    /* renamed from: c */
    public final String f39774c;

    /* renamed from: d */
    public Object f39775d;

    /* renamed from: e */
    public boolean f39776e;

    public IADataForComplexProperty(PropertySetter propertySetter, AggregationType aggregationType, String str) {
        this.f39772a = propertySetter;
        this.f39773b = aggregationType;
        this.f39774c = str;
    }

    public AggregationType getAggregationType() {
        return this.f39773b;
    }

    public String getComplexPropertyName() {
        return this.f39774c;
    }

    public Object getNestedComplexProperty() {
        return this.f39775d;
    }

    public void setNestedComplexProperty(Object obj) {
        this.f39775d = obj;
    }
}
