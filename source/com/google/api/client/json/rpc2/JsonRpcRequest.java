package com.google.api.client.json.rpc2;

import com.google.api.client.util.Beta;
import com.google.api.client.util.GenericData;

@Beta
/* loaded from: classes4.dex */
public class JsonRpcRequest extends GenericData {

    /* renamed from: c */
    public final String f52195c = "2.0";

    /* renamed from: d */
    public Object f52196d;

    /* renamed from: e */
    public String f52197e;

    /* renamed from: f */
    public Object f52198f;

    public Object getId() {
        return this.f52196d;
    }

    public String getMethod() {
        return this.f52197e;
    }

    public Object getParameters() {
        return this.f52198f;
    }

    public String getVersion() {
        return "2.0";
    }

    public void setId(Object obj) {
        this.f52196d = obj;
    }

    public void setMethod(String str) {
        this.f52197e = str;
    }

    public void setParameters(Object obj) {
        this.f52198f = obj;
    }

    @Override // com.google.api.client.util.GenericData
    public JsonRpcRequest set(String str, Object obj) {
        return (JsonRpcRequest) super.set(str, obj);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public JsonRpcRequest clone() {
        return (JsonRpcRequest) super.clone();
    }
}
