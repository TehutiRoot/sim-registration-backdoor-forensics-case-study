package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class DataTransportCrashlyticsReportSender {

    /* renamed from: c */
    public static final CrashlyticsReportJsonTransform f55384c = new CrashlyticsReportJsonTransform();

    /* renamed from: d */
    public static final String f55385d = m38791c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    public static final String f55386e = m38791c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    public static final Transformer f55387f = new Transformer() { // from class: JD
        @Override // com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.m38793a((CrashlyticsReport) obj);
        }
    };

    /* renamed from: a */
    public final C19095ax1 f55388a;

    /* renamed from: b */
    public final Transformer f55389b;

    public DataTransportCrashlyticsReportSender(C19095ax1 c19095ax1, Transformer transformer) {
        this.f55388a = c19095ax1;
        this.f55389b = transformer;
    }

    /* renamed from: a */
    public static /* synthetic */ byte[] m38793a(CrashlyticsReport crashlyticsReport) {
        return m38792b(crashlyticsReport);
    }

    /* renamed from: b */
    public static /* synthetic */ byte[] m38792b(CrashlyticsReport crashlyticsReport) {
        return f55384c.reportToJson(crashlyticsReport).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: c */
    public static String m38791c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.initialize(context);
        TransportFactory newFactory = TransportRuntime.getInstance().newFactory(new CCTDestination(f55385d, f55386e));
        Encoding m49169of = Encoding.m49169of("json");
        Transformer transformer = f55387f;
        return new DataTransportCrashlyticsReportSender(new C19095ax1(newFactory.getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, m49169of, transformer), settingsProvider.getSettingsSync(), onDemandCounter), transformer);
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.f55388a.m52071i(crashlyticsReportWithSessionId, z).getTask();
    }
}
