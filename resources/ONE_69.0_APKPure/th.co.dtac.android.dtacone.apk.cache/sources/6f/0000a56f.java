package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessControlException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DefaultCredentialProvider extends C19228bR1 {

    /* renamed from: b */
    public GoogleCredential f51811b = null;

    /* renamed from: c */
    public Environment f51812c = null;

    /* loaded from: classes4.dex */
    public enum Environment {
        UNKNOWN,
        ENVIRONMENT_VARIABLE,
        WELL_KNOWN_FILE,
        CLOUD_SHELL,
        APP_ENGINE,
        COMPUTE_ENGINE
    }

    /* renamed from: com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7257a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51813a;

        static {
            int[] iArr = new int[Environment.values().length];
            f51813a = iArr;
            try {
                iArr[Environment.ENVIRONMENT_VARIABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51813a[Environment.WELL_KNOWN_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51813a[Environment.APP_ENGINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51813a[Environment.CLOUD_SHELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51813a[Environment.COMPUTE_ENGINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$b */
    /* loaded from: classes4.dex */
    public static class C7258b extends GoogleCredential {

        /* renamed from: u */
        public static final String f51814u = OAuth2Utils.getMetadataServerUrl() + "/computeMetadata/v1/instance/service-accounts/default/token";

        public C7258b(HttpTransport httpTransport, JsonFactory jsonFactory) {
            super(new GoogleCredential.Builder().setTransport(httpTransport).setJsonFactory(jsonFactory).setTokenServerEncodedUrl(f51814u));
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.GoogleCredential, com.google.api.client.auth.oauth2.Credential
        public TokenResponse executeRefreshToken() {
            HttpRequest buildGetRequest = getTransport().createRequestFactory().buildGetRequest(new GenericUrl(getTokenServerEncodedUrl()));
            JsonObjectParser jsonObjectParser = new JsonObjectParser(getJsonFactory());
            buildGetRequest.setParser(jsonObjectParser);
            buildGetRequest.getHeaders().set("Metadata-Flavor", "Google");
            buildGetRequest.setThrowExceptionOnExecuteError(false);
            HttpResponse execute = buildGetRequest.execute();
            int statusCode = execute.getStatusCode();
            if (statusCode == 200) {
                InputStream content = execute.getContent();
                if (content != null) {
                    return (TokenResponse) jsonObjectParser.parseAndClose(content, execute.getContentCharset(), (Class<Object>) TokenResponse.class);
                }
                throw new IOException("Empty content from metadata token server request.");
            } else if (statusCode == 404) {
                throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", Integer.valueOf(statusCode)));
            } else {
                throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", Integer.valueOf(statusCode), execute.parseAsString()));
            }
        }
    }

    /* renamed from: b */
    public final Environment m41823b(HttpTransport httpTransport) {
        if (m41810o()) {
            return Environment.ENVIRONMENT_VARIABLE;
        }
        if (m41809p()) {
            return Environment.WELL_KNOWN_FILE;
        }
        if (m41808q()) {
            return Environment.APP_ENGINE;
        }
        if (m41811n()) {
            return Environment.CLOUD_SHELL;
        }
        if (OAuth2Utils.m41800d(httpTransport, this)) {
            return Environment.COMPUTE_ENGINE;
        }
        return Environment.UNKNOWN;
    }

    /* renamed from: c */
    public boolean m41822c(File file) {
        if (file.exists() && !file.isDirectory()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public Class m41821d(String str) {
        return Class.forName(str);
    }

    /* renamed from: e */
    public final GoogleCredential m41820e(HttpTransport httpTransport, JsonFactory jsonFactory) {
        try {
            return (GoogleCredential) m41821d("com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper").getConstructor(HttpTransport.class, JsonFactory.class).newInstance(httpTransport, jsonFactory);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw ((IOException) OAuth2Utils.m41803a(new IOException(String.format("Application Default Credentials failed to create the Google App Engine service account credentials class %s. Check that the component 'google-api-client-appengine' is deployed.", "com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper")), e));
        }
    }

    /* renamed from: f */
    public final GoogleCredential m41819f(JsonFactory jsonFactory) {
        return new CloudShellCredential(Integer.parseInt(m51937a("DEVSHELL_CLIENT_PORT")), jsonFactory);
    }

    /* renamed from: g */
    public final GoogleCredential m41818g(HttpTransport httpTransport, JsonFactory jsonFactory) {
        return new C7258b(httpTransport, jsonFactory);
    }

    /* renamed from: h */
    public final GoogleCredential m41817h(HttpTransport httpTransport, JsonFactory jsonFactory) {
        String m51937a = m51937a("GOOGLE_APPLICATION_CREDENTIALS");
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m51937a);
                try {
                    GoogleCredential fromStream = GoogleCredential.fromStream(fileInputStream2, httpTransport, jsonFactory);
                    fileInputStream2.close();
                    return fromStream;
                } catch (IOException e) {
                    e = e;
                    throw ((IOException) OAuth2Utils.m41803a(new IOException(String.format("Error reading credential file from environment variable %s, value '%s': %s", "GOOGLE_APPLICATION_CREDENTIALS", m51937a, e.getMessage())), e));
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: i */
    public final GoogleCredential m41816i(HttpTransport httpTransport, JsonFactory jsonFactory) {
        File m41812m = m41812m();
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m41812m);
                try {
                    GoogleCredential fromStream = GoogleCredential.fromStream(fileInputStream2, httpTransport, jsonFactory);
                    fileInputStream2.close();
                    return fromStream;
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    throw new IOException(String.format("Error reading credential file from location %s: %s", m41812m, e.getMessage()));
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: j */
    public final GoogleCredential m41815j(HttpTransport httpTransport, JsonFactory jsonFactory) {
        synchronized (this) {
            try {
                if (this.f51811b == null) {
                    this.f51811b = m41814k(httpTransport, jsonFactory);
                }
                GoogleCredential googleCredential = this.f51811b;
                if (googleCredential != null) {
                    return googleCredential;
                }
                throw new IOException(String.format("The Application Default Credentials are not available. They are available if running on Google App Engine, Google Compute Engine, or Google Cloud Shell. Otherwise, the environment variable %s must be defined pointing to a file defining the credentials. See %s for more information.", "GOOGLE_APPLICATION_CREDENTIALS", "https://developers.google.com/accounts/docs/application-default-credentials"));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public final GoogleCredential m41814k(HttpTransport httpTransport, JsonFactory jsonFactory) {
        if (this.f51812c == null) {
            this.f51812c = m41823b(httpTransport);
        }
        int i = C7257a.f51813a[this.f51812c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return m41818g(httpTransport, jsonFactory);
                    }
                    return m41819f(jsonFactory);
                }
                return m41820e(httpTransport, jsonFactory);
            }
            return m41816i(httpTransport, jsonFactory);
        }
        return m41817h(httpTransport, jsonFactory);
    }

    /* renamed from: l */
    public String m41813l(String str, String str2) {
        return System.getProperty(str, str2);
    }

    /* renamed from: m */
    public final File m41812m() {
        File file;
        if (m41813l("os.name", "").toLowerCase(Locale.US).indexOf("windows") >= 0) {
            file = new File(new File(m51937a("APPDATA")), "gcloud");
        } else {
            file = new File(new File(m41813l("user.home", ""), ".config"), "gcloud");
        }
        return new File(file, "application_default_credentials.json");
    }

    /* renamed from: n */
    public final boolean m41811n() {
        if (m51937a("DEVSHELL_CLIENT_PORT") != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m41810o() {
        String m51937a = m51937a("GOOGLE_APPLICATION_CREDENTIALS");
        if (m51937a != null && m51937a.length() != 0) {
            try {
                File file = new File(m51937a);
                if (file.exists() && !file.isDirectory()) {
                    return true;
                }
                throw new IOException(String.format("Error reading credential file from environment variable %s, value '%s': File does not exist.", "GOOGLE_APPLICATION_CREDENTIALS", m51937a));
            } catch (AccessControlException unused) {
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m41809p() {
        try {
            return m41822c(m41812m());
        } catch (AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m41808q() {
        try {
            try {
                Field field = m41821d("com.google.appengine.api.utils.SystemProperty").getField("environment");
                if (field.getType().getMethod("value", null).invoke(field.get(null), null) != null) {
                    return true;
                }
                return false;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                throw ((RuntimeException) OAuth2Utils.m41803a(new RuntimeException(String.format("Unexpected error trying to determine if running on Google App Engine: %s", e.getMessage())), e));
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}