package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class PropertyValue {
    public final PropertyValue next;
    public final Object value;

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$a */
    /* loaded from: classes3.dex */
    public static final class C6080a extends PropertyValue {

        /* renamed from: a */
        public final SettableAnyProperty f43312a;

        /* renamed from: b */
        public final String f43313b;

        public C6080a(PropertyValue propertyValue, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(propertyValue, obj);
            this.f43312a = settableAnyProperty;
            this.f43313b = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
            this.f43312a.set(obj, this.f43313b, this.value);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$b */
    /* loaded from: classes3.dex */
    public static final class C6081b extends PropertyValue {

        /* renamed from: a */
        public final Object f43314a;

        public C6081b(PropertyValue propertyValue, Object obj, Object obj2) {
            super(propertyValue, obj);
            this.f43314a = obj2;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
            ((Map) obj).put(this.f43314a, this.value);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.PropertyValue$c */
    /* loaded from: classes3.dex */
    public static final class C6082c extends PropertyValue {

        /* renamed from: a */
        public final SettableBeanProperty f43315a;

        public C6082c(PropertyValue propertyValue, Object obj, SettableBeanProperty settableBeanProperty) {
            super(propertyValue, obj);
            this.f43315a = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.PropertyValue
        public void assign(Object obj) {
            this.f43315a.set(obj, this.value);
        }
    }

    public PropertyValue(PropertyValue propertyValue, Object obj) {
        this.next = propertyValue;
        this.value = obj;
    }

    public abstract void assign(Object obj) throws IOException, JsonProcessingException;
}