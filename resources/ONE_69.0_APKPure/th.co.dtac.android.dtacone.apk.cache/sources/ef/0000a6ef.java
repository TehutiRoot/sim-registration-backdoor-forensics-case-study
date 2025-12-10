package com.google.auth.oauth2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MemoryTokensStorage implements TokenStore {

    /* renamed from: a */
    public final Map f52490a = new HashMap();

    @Override // com.google.auth.oauth2.TokenStore
    public void delete(String str) throws IOException {
        this.f52490a.remove(str);
    }

    @Override // com.google.auth.oauth2.TokenStore
    public String load(String str) throws IOException {
        return (String) this.f52490a.get(str);
    }

    @Override // com.google.auth.oauth2.TokenStore
    public void store(String str, String str2) throws IOException {
        this.f52490a.put(str, str2);
    }
}