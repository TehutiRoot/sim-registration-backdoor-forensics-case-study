package p000;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.api.client.googleapis.auth.oauth2.GoogleOAuthConstants;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.PemReader;
import com.google.api.client.util.SecurityUtils;
import com.google.auth.http.HttpTransportFactory;
import com.google.common.base.Strings;
import com.google.common.p014io.BaseEncoding;
import com.google.common.p014io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpStatus;

/* renamed from: IJ0 */
/* loaded from: classes4.dex */
public abstract class IJ0 {

    /* renamed from: a */
    public static final URI f2652a = URI.create(GoogleOAuthConstants.TOKEN_SERVER_URL);

    /* renamed from: b */
    public static final URI f2653b = URI.create("https://oauth2.googleapis.com/revoke");

    /* renamed from: c */
    public static final URI f2654c = URI.create(GoogleOAuthConstants.AUTHORIZATION_SERVER_URL);

    /* renamed from: d */
    public static final HttpTransport f2655d = new NetHttpTransport();

    /* renamed from: e */
    public static final HttpTransportFactory f2656e = new C0580a();

    /* renamed from: f */
    public static final JsonFactory f2657f = GsonFactory.getDefaultInstance();

    /* renamed from: g */
    public static String f2658g = "%sExpected value %s not found.";

    /* renamed from: h */
    public static String f2659h = "%sExpected %s value %s of wrong type.";

    /* renamed from: i */
    public static final Set f2660i = new HashSet(Arrays.asList(500, 503, Integer.valueOf((int) HttpStatus.SC_REQUEST_TIMEOUT), Integer.valueOf((int) HttpStatus.SC_TOO_MANY_REQUESTS)));

    /* renamed from: IJ0$a */
    /* loaded from: classes4.dex */
    public static class C0580a implements HttpTransportFactory {
        @Override // com.google.auth.http.HttpTransportFactory
        public HttpTransport create() {
            return IJ0.f2655d;
        }
    }

    /* renamed from: a */
    public static String m68034a(String str, String str2) {
        if (!Strings.isNullOrEmpty(str) && !Strings.isNullOrEmpty(str2)) {
            String encode = BaseEncoding.base64().encode((str + ":" + str2).getBytes());
            return "Basic " + encode;
        }
        throw new IllegalArgumentException("Username and password cannot be null or empty.");
    }

    /* renamed from: b */
    public static boolean m68033b(HttpHeaders httpHeaders, String str, String str2) {
        Object obj = httpHeaders.get(str);
        if (obj instanceof Collection) {
            return ((Collection) obj).contains(str2);
        }
        return false;
    }

    /* renamed from: c */
    public static GenericJson m68032c(String str) {
        JsonObjectParser jsonObjectParser = new JsonObjectParser(f2657f);
        Charset charset = StandardCharsets.UTF_8;
        return (GenericJson) jsonObjectParser.parseAndClose((InputStream) new ByteArrayInputStream(str.getBytes(charset)), charset, (Class<Object>) GenericJson.class);
    }

    /* renamed from: d */
    public static PrivateKey m68031d(String str) {
        PemReader.Section readFirstSectionAndClose = PemReader.readFirstSectionAndClose(new StringReader(str), "PRIVATE KEY");
        if (readFirstSectionAndClose != null) {
            try {
                return SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(readFirstSectionAndClose.getBase64DecodedBytes()));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new IOException("Unexpected exception reading PKCS#8 data", e);
            }
        }
        throw new IOException("Invalid PKCS#8 data.");
    }

    /* renamed from: e */
    public static int m68030e(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).intValueExact();
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            throw new IOException(String.format(f2659h, str2, TypedValues.Custom.S_INT, str));
        }
        throw new IOException(String.format(f2658g, str2, str));
    }

    /* renamed from: f */
    public static long m68029f(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).longValueExact();
            }
            if (obj instanceof Long) {
                return ((Long) obj).longValue();
            }
            throw new IOException(String.format(f2659h, str2, "long", str));
        }
        throw new IOException(String.format(f2658g, str2, str));
    }

    /* renamed from: g */
    public static Map m68028g(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof Map) {
                return (Map) obj;
            }
            throw new IOException(String.format(f2659h, str2, "Map", str));
        }
        throw new IOException(String.format(f2658g, str2, str));
    }

    /* renamed from: h */
    public static List m68027h(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new IOException(String.format(f2659h, str2, "List<String>", str));
    }

    /* renamed from: i */
    public static String m68026i(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IOException(String.format(f2659h, str2, TypedValues.Custom.S_STRING, str));
    }

    /* renamed from: j */
    public static String m68025j(Map map, String str, String str2) {
        Object obj = map.get(str);
        if (obj != null) {
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new IOException(String.format(f2659h, str2, TypedValues.Custom.S_STRING, str));
        }
        throw new IOException(String.format(f2658g, str2, str));
    }

    /* renamed from: k */
    public static void m68024k(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        try {
            ByteStreams.copy(inputStream, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }
}