package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Data;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class GoogleJsonError extends GenericJson {

    /* renamed from: d */
    public List f51881d;

    /* renamed from: e */
    public int f51882e;

    /* renamed from: f */
    public String f51883f;

    /* renamed from: g */
    public List f51884g;

    /* loaded from: classes4.dex */
    public static class Details extends GenericJson {

        /* renamed from: d */
        public String f51885d;

        /* renamed from: e */
        public String f51886e;

        /* renamed from: f */
        public String f51887f;

        /* renamed from: g */
        public List f51888g;

        public String getDetail() {
            return this.f51886e;
        }

        public List<ParameterViolations> getParameterViolations() {
            return this.f51888g;
        }

        public String getReason() {
            return this.f51887f;
        }

        public String getType() {
            return this.f51885d;
        }

        public void setDetail(String str) {
            this.f51886e = str;
        }

        public void setParameterViolations(List<ParameterViolations> list) {
            this.f51888g = ImmutableList.copyOf((Collection) list);
        }

        public void setReason(String str) {
            this.f51887f = str;
        }

        public void setType(String str) {
            this.f51885d = str;
        }
    }

    /* loaded from: classes4.dex */
    public static class ParameterViolations {

        /* renamed from: a */
        public String f51894a;

        /* renamed from: b */
        public String f51895b;

        public String getDescription() {
            return this.f51895b;
        }

        public String getParameter() {
            return this.f51894a;
        }

        public void setDescription(String str) {
            this.f51895b = str;
        }

        public void setParameter(String str) {
            this.f51894a = str;
        }
    }

    static {
        Data.nullOf(ErrorInfo.class);
    }

    public static GoogleJsonError parse(JsonFactory jsonFactory, HttpResponse httpResponse) throws IOException {
        return (GoogleJsonError) new JsonObjectParser.Builder(jsonFactory).setWrapperKeys(Collections.singleton(Constants.IPC_BUNDLE_KEY_SEND_ERROR)).build().parseAndClose(httpResponse.getContent(), httpResponse.getContentCharset(), (Class<Object>) GoogleJsonError.class);
    }

    public final int getCode() {
        return this.f51882e;
    }

    public List<Details> getDetails() {
        return this.f51884g;
    }

    public final List<ErrorInfo> getErrors() {
        return this.f51881d;
    }

    public final String getMessage() {
        return this.f51883f;
    }

    public final void setCode(int i) {
        this.f51882e = i;
    }

    public void setDetails(List<Details> list) {
        this.f51884g = ImmutableList.copyOf((Collection) list);
    }

    public final void setErrors(List<ErrorInfo> list) {
        this.f51881d = ImmutableList.copyOf((Collection) list);
    }

    public final void setMessage(String str) {
        this.f51883f = str;
    }

    /* loaded from: classes4.dex */
    public static class ErrorInfo extends GenericJson {

        /* renamed from: d */
        public String f51889d;

        /* renamed from: e */
        public String f51890e;

        /* renamed from: f */
        public String f51891f;

        /* renamed from: g */
        public String f51892g;

        /* renamed from: h */
        public String f51893h;

        public final String getDomain() {
            return this.f51889d;
        }

        public final String getLocation() {
            return this.f51892g;
        }

        public final String getLocationType() {
            return this.f51893h;
        }

        public final String getMessage() {
            return this.f51891f;
        }

        public final String getReason() {
            return this.f51890e;
        }

        public final void setDomain(String str) {
            this.f51889d = str;
        }

        public final void setLocation(String str) {
            this.f51892g = str;
        }

        public final void setLocationType(String str) {
            this.f51893h = str;
        }

        public final void setMessage(String str) {
            this.f51891f = str;
        }

        public final void setReason(String str) {
            this.f51890e = str;
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
        public ErrorInfo set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }

        @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
        public ErrorInfo clone() {
            return (ErrorInfo) super.clone();
        }
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleJsonError set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleJsonError clone() {
        return (GoogleJsonError) super.clone();
    }
}
