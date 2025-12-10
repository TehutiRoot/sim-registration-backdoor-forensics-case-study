package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;

/* loaded from: classes4.dex */
public class GoogleJsonErrorContainer extends GenericJson {

    /* renamed from: d */
    public GoogleJsonError f51896d;

    public final GoogleJsonError getError() {
        return this.f51896d;
    }

    public final void setError(GoogleJsonError googleJsonError) {
        this.f51896d = googleJsonError;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleJsonErrorContainer set(String str, Object obj) {
        return (GoogleJsonErrorContainer) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleJsonErrorContainer clone() {
        return (GoogleJsonErrorContainer) super.clone();
    }
}
