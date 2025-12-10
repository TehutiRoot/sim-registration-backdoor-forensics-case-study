package com.google.api.client.googleapis.mtls;

import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.util.Beta;
import com.google.api.client.util.SecurityUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.List;

@Beta
/* loaded from: classes4.dex */
public class MtlsUtils {

    /* renamed from: a */
    public static final MtlsProvider f51931a = new C7278a();

    /* renamed from: com.google.api.client.googleapis.mtls.MtlsUtils$a */
    /* loaded from: classes4.dex */
    public static class C7278a implements MtlsProvider {

        /* renamed from: c */
        public static final String f51932c = System.getProperty("user.home") + "/.secureConnect/context_aware_metadata.json";

        /* renamed from: a */
        public InterfaceC7279a f51933a;

        /* renamed from: b */
        public String f51934b;

        /* renamed from: com.google.api.client.googleapis.mtls.MtlsUtils$a$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC7279a {
            /* renamed from: a */
            String mo41784a(String str);
        }

        /* renamed from: com.google.api.client.googleapis.mtls.MtlsUtils$a$b */
        /* loaded from: classes4.dex */
        public static class C7280b implements InterfaceC7279a {
            @Override // com.google.api.client.googleapis.mtls.MtlsUtils.C7278a.InterfaceC7279a
            /* renamed from: a */
            public String mo41784a(String str) {
                return System.getenv(str);
            }
        }

        public C7278a() {
            this(new C7280b(), f51932c);
        }

        /* renamed from: a */
        public static List m41786a(InputStream inputStream) {
            return ((ContextAwareMetadataJson) Utils.getDefaultJsonFactory().createJsonParser(inputStream).parse((Class<Object>) ContextAwareMetadataJson.class)).getCommands();
        }

        /* renamed from: b */
        public static int m41785b(Process process, long j) {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                try {
                    process.exitValue();
                    return process.exitValue();
                } catch (IllegalThreadStateException unused) {
                    if (j > 0) {
                        Thread.sleep(Math.min(1 + j, 100L));
                    }
                    j -= System.currentTimeMillis() - currentTimeMillis;
                    if (j <= 0) {
                        process.destroy();
                        throw new IOException("cert provider command timed out");
                    }
                }
            } while (j <= 0);
            process.destroy();
            throw new IOException("cert provider command timed out");
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public KeyStore getKeyStore() {
            try {
                Process start = new ProcessBuilder(m41786a(new FileInputStream(this.f51934b))).start();
                int m41785b = m41785b(start, 1000L);
                if (m41785b == 0) {
                    return SecurityUtils.createMtlsKeyStore(start.getInputStream());
                }
                throw new IOException("Cert provider command failed with exit code: " + m41785b);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (InterruptedException e) {
                throw new IOException("Interrupted executing certificate provider command", e);
            }
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public String getKeyStorePassword() {
            return "";
        }

        @Override // com.google.api.client.googleapis.mtls.MtlsProvider
        public boolean useMtlsClientCertificate() {
            return "true".equals(this.f51933a.mo41784a("GOOGLE_API_USE_CLIENT_CERTIFICATE"));
        }

        public C7278a(InterfaceC7279a interfaceC7279a, String str) {
            this.f51933a = interfaceC7279a;
            this.f51934b = str;
        }
    }

    public static MtlsProvider getDefaultMtlsProvider() {
        return f51931a;
    }
}
