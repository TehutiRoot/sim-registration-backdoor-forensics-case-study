package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000.C16847um;

/* renamed from: um */
/* loaded from: classes3.dex */
public final class C16847um implements TransportBackend {

    /* renamed from: a */
    public final DataEncoder f107452a;

    /* renamed from: b */
    public final ConnectivityManager f107453b;

    /* renamed from: c */
    public final Context f107454c;

    /* renamed from: d */
    public final URL f107455d;

    /* renamed from: e */
    public final Clock f107456e;

    /* renamed from: f */
    public final Clock f107457f;

    /* renamed from: g */
    public final int f107458g;

    /* renamed from: um$a */
    /* loaded from: classes3.dex */
    public static final class C16848a {

        /* renamed from: a */
        public final URL f107459a;

        /* renamed from: b */
        public final BatchedLogRequest f107460b;

        /* renamed from: c */
        public final String f107461c;

        public C16848a(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f107459a = url;
            this.f107460b = batchedLogRequest;
            this.f107461c = str;
        }

        /* renamed from: a */
        public C16848a m1182a(URL url) {
            return new C16848a(url, this.f107460b, this.f107461c);
        }
    }

    /* renamed from: um$b */
    /* loaded from: classes3.dex */
    public static final class C16849b {

        /* renamed from: a */
        public final int f107462a;

        /* renamed from: b */
        public final URL f107463b;

        /* renamed from: c */
        public final long f107464c;

        public C16849b(int i, URL url, long j) {
            this.f107462a = i;
            this.f107463b = url;
            this.f107464c = j;
        }
    }

    public C16847um(Context context, Clock clock, Clock clock2, int i) {
        this.f107452a = BatchedLogRequest.createDataEncoder();
        this.f107454c = context;
        this.f107453b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f107455d = m1183m(CCTDestination.f43875c);
        this.f107456e = clock2;
        this.f107457f = clock;
        this.f107458g = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C16849b m1195a(C16847um c16847um, C16848a c16848a) {
        return c16847um.m1193c(c16848a);
    }

    /* renamed from: b */
    public static /* synthetic */ C16848a m1194b(C16848a c16848a, C16849b c16849b) {
        return m1185k(c16848a, c16849b);
    }

    /* renamed from: d */
    public static String m1192d(Context context) {
        String simOperator = m1187i(context).getSimOperator();
        if (simOperator != null) {
            return simOperator;
        }
        return "";
    }

    /* renamed from: e */
    public static int m1191e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    /* renamed from: f */
    public static int m1190f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.NetworkType.NONE.getValue();
        }
        return networkInfo.getType();
    }

    /* renamed from: g */
    public static int m1189g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Logging.m49113e("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    public static TelephonyManager m1187i(Context context) {
        return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    /* renamed from: j */
    public static long m1186j() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: k */
    public static /* synthetic */ C16848a m1185k(C16848a c16848a, C16849b c16849b) {
        URL url = c16849b.f107463b;
        if (url != null) {
            Logging.m49116d("CctTransportBackend", "Following redirect to: %s", url);
            return c16848a.m1182a(c16849b.f107463b);
        }
        return null;
    }

    /* renamed from: l */
    public static InputStream m1184l(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: m */
    public static URL m1183m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: c */
    public final C16849b m1193c(C16848a c16848a) {
        Logging.m49112i("CctTransportBackend", "Making request to: %s", c16848a.f107459a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) c16848a.f107459a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f107458g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = c16848a.f107461c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f107452a.encode(c16848a.f107460b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Logging.m49112i("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                Logging.m49116d("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                Logging.m49116d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new C16849b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m1184l = m1184l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        C16849b c16849b = new C16849b(responseCode, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(m1184l))).getNextRequestWaitMillis());
                        if (m1184l != null) {
                            m1184l.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return c16849b;
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                return new C16849b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (EncodingException e) {
            e = e;
            Logging.m49113e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C16849b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            Logging.m49113e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C16849b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Logging.m49113e("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C16849b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Logging.m49113e("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C16849b(400, null, 0L);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public EventInternal decorate(EventInternal eventInternal) {
        NetworkInfo activeNetworkInfo = this.f107453b.getActiveNetworkInfo();
        return eventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata("device", Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT).addMetadata("tz-offset", m1186j()).addMetadata("net-type", m1190f(activeNetworkInfo)).addMetadata("mobile-subtype", m1191e(activeNetworkInfo)).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage()).addMetadata("mcc_mnc", m1192d(this.f107454c)).addMetadata("application_build", Integer.toString(m1189g(this.f107454c))).build();
    }

    /* renamed from: h */
    public final BatchedLogRequest m1188h(BackendRequest backendRequest) {
        LogEvent.Builder protoBuilder;
        HashMap hashMap = new HashMap();
        for (EventInternal eventInternal : backendRequest.getEvents()) {
            String transportName = eventInternal.getTransportName();
            if (!hashMap.containsKey(transportName)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                hashMap.put(transportName, arrayList);
            } else {
                ((List) hashMap.get(transportName)).add(eventInternal);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.f107457f.getTime()).setRequestUptimeMs(this.f107456e.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal2.getInteger("sdk-version"))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get("hardware")).setDevice(eventInternal2.get("device")).setProduct(eventInternal2.get("product")).setOsBuild(eventInternal2.get("os-uild")).setManufacturer(eventInternal2.get("manufacturer")).setFingerprint(eventInternal2.get("fingerprint")).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get("locale")).setMccMnc(eventInternal2.get("mcc_mnc")).setApplicationBuild(eventInternal2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.m49169of("proto"))) {
                    protoBuilder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.m49169of("json"))) {
                    protoBuilder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    Logging.m49111w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                protoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype"))).build());
                if (eventInternal3.getCode() != null) {
                    protoBuilder.setEventCode(eventInternal3.getCode());
                }
                if (eventInternal3.getProductId() != null) {
                    protoBuilder.setComplianceData(ComplianceData.builder().setPrivacyContext(ExternalPrivacyContext.builder().setPrequest(ExternalPRequestContext.builder().setOriginAssociatedProductId(eventInternal3.getProductId()).build()).build()).setProductIdOrigin(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).build());
                }
                if (eventInternal3.getExperimentIdsClear() != null || eventInternal3.getExperimentIdsEncrypted() != null) {
                    ExperimentIds.Builder builder = ExperimentIds.builder();
                    if (eventInternal3.getExperimentIdsClear() != null) {
                        builder.setClearBlob(eventInternal3.getExperimentIdsClear());
                    }
                    if (eventInternal3.getExperimentIdsEncrypted() != null) {
                        builder.setEncryptedBlob(eventInternal3.getExperimentIdsEncrypted());
                    }
                    protoBuilder.setExperimentIds(builder.build());
                }
                arrayList3.add(protoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        return BatchedLogRequest.create(arrayList2);
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public BackendResponse send(BackendRequest backendRequest) {
        BatchedLogRequest m1188h = m1188h(backendRequest);
        URL url = this.f107455d;
        String str = null;
        if (backendRequest.getExtras() != null) {
            try {
                CCTDestination fromByteArray = CCTDestination.fromByteArray(backendRequest.getExtras());
                if (fromByteArray.getAPIKey() != null) {
                    str = fromByteArray.getAPIKey();
                }
                if (fromByteArray.getEndPoint() != null) {
                    url = m1183m(fromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.fatalError();
            }
        }
        try {
            C16849b c16849b = (C16849b) Retries.retry(5, new C16848a(url, m1188h, str), new Function() { // from class: sm
                {
                    C16847um.this = this;
                }

                @Override // com.google.android.datatransport.runtime.retries.Function
                public final Object apply(Object obj) {
                    return C16847um.m1195a(C16847um.this, (C16847um.C16848a) obj);
                }
            }, new RetryStrategy() { // from class: tm
                @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
                public final Object shouldRetry(Object obj, Object obj2) {
                    return C16847um.m1194b((C16847um.C16848a) obj, (C16847um.C16849b) obj2);
                }
            });
            int i = c16849b.f107462a;
            if (i == 200) {
                return BackendResponse.m49131ok(c16849b.f107464c);
            }
            if (i < 500 && i != 404) {
                if (i == 400) {
                    return BackendResponse.invalidPayload();
                }
                return BackendResponse.fatalError();
            }
            return BackendResponse.transientError();
        } catch (IOException e) {
            Logging.m49113e("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.transientError();
        }
    }

    public C16847um(Context context, Clock clock, Clock clock2) {
        this(context, clock, clock2, 130000);
    }
}
