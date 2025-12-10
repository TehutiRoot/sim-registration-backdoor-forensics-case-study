package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

/* loaded from: classes.dex */
public class IADataForComplexProperty {

    /* renamed from: a */
    public final PropertySetter f39770a;

    /* renamed from: b */
    public final AggregationType f39771b;

    /* renamed from: c */
    public final String f39772c;

    /* renamed from: d */
    public Object f39773d;

    /* renamed from: e */
    public boolean f39774e;

    public IADataForComplexProperty(PropertySetter propertySetter, AggregationType aggregationType, String str) {
        this.f39770a = propertySetter;
        this.f39771b = aggregationType;
        this.f39772c = str;
    }

    public AggregationType getAggregationType() {
        return this.f39771b;
    }

    public String getComplexPropertyName() {
        return this.f39772c;
    }

    public Object getNestedComplexProperty() {
        return this.f39773d;
    }

    public void setNestedComplexProperty(Object obj) {
        this.f39773d = obj;
    }
}