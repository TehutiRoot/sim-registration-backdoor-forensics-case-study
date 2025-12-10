package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ExternalTypeHandler {

    /* renamed from: a */
    public final JavaType f43287a;

    /* renamed from: b */
    public final C6090a[] f43288b;

    /* renamed from: c */
    public final Map f43289c;

    /* renamed from: d */
    public final String[] f43290d;

    /* renamed from: e */
    public final TokenBuffer[] f43291e;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final JavaType f43292a;

        /* renamed from: b */
        public final List f43293b = new ArrayList();

        /* renamed from: c */
        public final Map f43294c = new HashMap();

        public Builder(JavaType javaType) {
            this.f43292a = javaType;
        }

        /* renamed from: a */
        public final void m49476a(String str, Integer num) {
            Object obj = this.f43294c.get(str);
            if (obj == null) {
                this.f43294c.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.f43294c.put(str, linkedList);
            }
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this.f43293b.size());
            this.f43293b.add(new C6090a(settableBeanProperty, typeDeserializer));
            m49476a(settableBeanProperty.getName(), valueOf);
            m49476a(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this.f43293b.size();
            C6090a[] c6090aArr = new C6090a[size];
            for (int i = 0; i < size; i++) {
                C6090a c6090a = (C6090a) this.f43293b.get(i);
                SettableBeanProperty find = beanPropertyMap.find(c6090a.m49472d());
                if (find != null) {
                    c6090a.m49469g(find);
                }
                c6090aArr[i] = c6090a;
            }
            return new ExternalTypeHandler(this.f43292a, c6090aArr, this.f43294c, null, null);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a */
    /* loaded from: classes3.dex */
    public static final class C6090a {

        /* renamed from: a */
        public final SettableBeanProperty f43295a;

        /* renamed from: b */
        public final TypeDeserializer f43296b;

        /* renamed from: c */
        public final String f43297c;

        /* renamed from: d */
        public SettableBeanProperty f43298d;

        public C6090a(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this.f43295a = settableBeanProperty;
            this.f43296b = typeDeserializer;
            this.f43297c = typeDeserializer.getPropertyName();
        }

        /* renamed from: a */
        public String m49475a() {
            Class<?> defaultImpl = this.f43296b.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this.f43296b.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        /* renamed from: b */
        public SettableBeanProperty m49474b() {
            return this.f43295a;
        }

        /* renamed from: c */
        public SettableBeanProperty m49473c() {
            return this.f43298d;
        }

        /* renamed from: d */
        public String m49472d() {
            return this.f43297c;
        }

        /* renamed from: e */
        public boolean m49471e() {
            if (this.f43296b.getDefaultImpl() != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m49470f(String str) {
            return str.equals(this.f43297c);
        }

        /* renamed from: g */
        public void m49469g(SettableBeanProperty settableBeanProperty) {
            this.f43298d = settableBeanProperty;
        }
    }

    public ExternalTypeHandler(JavaType javaType, C6090a[] c6090aArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this.f43287a = javaType;
        this.f43288b = c6090aArr;
        this.f43289c = map;
        this.f43290d = strArr;
        this.f43291e = tokenBufferArr;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) throws IOException {
        JsonParser asParser = this.f43291e[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        return this.f43288b[i].m49474b().deserialize(asParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws IOException {
        JsonParser asParser = this.f43291e[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this.f43288b[i].m49474b().set(obj, null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this.f43288b[i].m49474b().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    /* renamed from: a */
    public final boolean m49477a(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) {
        if (!this.f43288b[i].m49470f(str)) {
            return false;
        }
        if (obj != null && this.f43291e[i] != null) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
            this.f43291e[i] = null;
            return true;
        }
        this.f43290d[i] = str2;
        return true;
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        int length = this.f43288b.length;
        for (int i = 0; i < length; i++) {
            String str = this.f43290d[i];
            if (str == null) {
                TokenBuffer tokenBuffer = this.f43291e[i];
                if (tokenBuffer != null) {
                    if (tokenBuffer.firstToken().isScalarValue()) {
                        JsonParser asParser = tokenBuffer.asParser(jsonParser);
                        asParser.nextToken();
                        SettableBeanProperty m49474b = this.f43288b[i].m49474b();
                        Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, m49474b.getType());
                        if (deserializeIfNatural != null) {
                            m49474b.set(obj, deserializeIfNatural);
                        } else if (!this.f43288b[i].m49471e()) {
                            deserializationContext.reportInputMismatch(obj.getClass(), "Missing external type id property '%s'", this.f43288b[i].m49472d());
                        } else {
                            str = this.f43288b[i].m49475a();
                        }
                    }
                }
            } else if (this.f43291e[i] == null) {
                SettableBeanProperty m49474b2 = this.f43288b[i].m49474b();
                if (m49474b2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    deserializationContext.reportInputMismatch(obj.getClass(), "Missing property '%s' for external type id '%s'", m49474b2.getName(), this.f43288b[i].m49472d());
                }
                return obj;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r9.f43291e[r0] != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r9.f43290d[r0] != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r12 = r9.f43290d;
        r8 = r12[r0];
        r12[r0] = null;
        _deserializeAndSet(r10, r11, r13, r0, r8);
        r9.f43291e[r0] = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) throws java.io.IOException {
        /*
            r9 = this;
            java.util.Map r0 = r9.f43289c
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r10 = 0
            return r10
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L73
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r1 = r9.f43288b
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.m49470f(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.getText()
            r10.skipChildren()
            java.lang.String[] r10 = r9.f43290d
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            java.lang.String[] r10 = r9.f43290d
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r12.<init>(r10, r11)
            r12.copyCurrentStructure(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9.f43291e
            int r11 = r0.intValue()
            r10[r11] = r12
        L5d:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L72
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9.f43291e
            java.lang.Object r11 = r13.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10[r11] = r12
            goto L5d
        L72:
            return r2
        L73:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$a[] r1 = r9.f43288b
            r1 = r1[r0]
            boolean r12 = r1.m49470f(r12)
            if (r12 == 0) goto L97
            java.lang.String[] r12 = r9.f43290d
            java.lang.String r1 = r10.getText()
            r12[r0] = r1
            r10.skipChildren()
            if (r13 == 0) goto Lbe
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r9.f43291e
            r12 = r12[r0]
            if (r12 == 0) goto Lbe
            goto Lab
        L97:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r12.<init>(r10, r11)
            r12.copyCurrentStructure(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r1 = r9.f43291e
            r1[r0] = r12
            if (r13 == 0) goto Lbe
            java.lang.String[] r12 = r9.f43290d
            r12 = r12[r0]
            if (r12 == 0) goto Lbe
        Lab:
            java.lang.String[] r12 = r9.f43290d
            r8 = r12[r0]
            r1 = 0
            r12[r0] = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r0
            r3._deserializeAndSet(r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r9.f43291e
            r10[r0] = r1
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) throws IOException {
        Object obj2 = this.f43289c.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (obj2 instanceof List) {
            for (Integer num : (List) obj2) {
                if (m49477a(jsonParser, deserializationContext, str, obj, text, num.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return m49477a(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this.f43287a = externalTypeHandler.f43287a;
        C6090a[] c6090aArr = externalTypeHandler.f43288b;
        this.f43288b = c6090aArr;
        this.f43289c = externalTypeHandler.f43289c;
        int length = c6090aArr.length;
        this.f43290d = new String[length];
        this.f43291e = new TokenBuffer[length];
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) throws IOException {
        int length = this.f43288b.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str = this.f43290d[i];
            C6090a c6090a = this.f43288b[i];
            if (str == null) {
                if (this.f43291e[i] != null) {
                    if (!c6090a.m49471e()) {
                        deserializationContext.reportInputMismatch(this.f43287a, "Missing external type id property '%s'", c6090a.m49472d());
                    } else {
                        str = c6090a.m49475a();
                    }
                }
            } else if (this.f43291e[i] == null) {
                deserializationContext.reportInputMismatch(this.f43287a, "Missing property '%s' for external type id '%s'", c6090a.m49474b().getName(), this.f43288b[i].m49472d());
            }
            objArr[i] = _deserialize(jsonParser, deserializationContext, i, str);
            SettableBeanProperty m49474b = c6090a.m49474b();
            if (m49474b.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(m49474b, objArr[i]);
                SettableBeanProperty m49473c = c6090a.m49473c();
                if (m49473c != null && m49473c.getCreatorIndex() >= 0) {
                    propertyValueBuffer.assignParameter(m49473c, str);
                }
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty m49474b2 = this.f43288b[i2].m49474b();
            if (m49474b2.getCreatorIndex() < 0) {
                m49474b2.set(build, objArr[i2]);
            }
        }
        return build;
    }
}
