package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Throwables;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GenericJson extends GenericData implements Cloneable {

    /* renamed from: c */
    public JsonFactory f52182c;

    public final JsonFactory getFactory() {
        return this.f52182c;
    }

    public final void setFactory(JsonFactory jsonFactory) {
        this.f52182c = jsonFactory;
    }

    public String toPrettyString() throws IOException {
        JsonFactory jsonFactory = this.f52182c;
        if (jsonFactory != null) {
            return jsonFactory.toPrettyString(this);
        }
        return super.toString();
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public String toString() {
        JsonFactory jsonFactory = this.f52182c;
        if (jsonFactory != null) {
            try {
                return jsonFactory.toString(this);
            } catch (IOException e) {
                throw Throwables.propagate(e);
            }
        }
        return super.toString();
    }

    @Override // com.google.api.client.util.GenericData
    public GenericJson set(String str, Object obj) {
        return (GenericJson) super.set(str, obj);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public GenericJson clone() {
        return (GenericJson) super.clone();
    }
}
