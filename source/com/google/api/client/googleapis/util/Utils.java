package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.Beta;

@Beta
/* loaded from: classes4.dex */
public final class Utils {

    /* renamed from: com.google.api.client.googleapis.util.Utils$a */
    /* loaded from: classes4.dex */
    public static class C7290a {

        /* renamed from: a */
        public static final JsonFactory f52020a = new GsonFactory();
    }

    /* renamed from: com.google.api.client.googleapis.util.Utils$b */
    /* loaded from: classes4.dex */
    public static class C7291b {

        /* renamed from: a */
        public static final HttpTransport f52021a = new NetHttpTransport();
    }

    public static JsonFactory getDefaultJsonFactory() {
        return C7290a.f52020a;
    }

    public static HttpTransport getDefaultTransport() {
        return C7291b.f52021a;
    }
}
