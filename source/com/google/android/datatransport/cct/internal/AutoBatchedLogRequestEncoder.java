package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes3.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$a */
    /* loaded from: classes3.dex */
    public static final class C6218a implements ObjectEncoder {

        /* renamed from: a */
        public static final C6218a f43881a = new C6218a();

        /* renamed from: b */
        public static final FieldDescriptor f43882b = FieldDescriptor.m38762of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c */
        public static final FieldDescriptor f43883c = FieldDescriptor.m38762of("model");

        /* renamed from: d */
        public static final FieldDescriptor f43884d = FieldDescriptor.m38762of("hardware");

        /* renamed from: e */
        public static final FieldDescriptor f43885e = FieldDescriptor.m38762of("device");

        /* renamed from: f */
        public static final FieldDescriptor f43886f = FieldDescriptor.m38762of("product");

        /* renamed from: g */
        public static final FieldDescriptor f43887g = FieldDescriptor.m38762of("osBuild");

        /* renamed from: h */
        public static final FieldDescriptor f43888h = FieldDescriptor.m38762of("manufacturer");

        /* renamed from: i */
        public static final FieldDescriptor f43889i = FieldDescriptor.m38762of("fingerprint");

        /* renamed from: j */
        public static final FieldDescriptor f43890j = FieldDescriptor.m38762of("locale");

        /* renamed from: k */
        public static final FieldDescriptor f43891k = FieldDescriptor.m38762of("country");

        /* renamed from: l */
        public static final FieldDescriptor f43892l = FieldDescriptor.m38762of("mccMnc");

        /* renamed from: m */
        public static final FieldDescriptor f43893m = FieldDescriptor.m38762of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43882b, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(f43883c, androidClientInfo.getModel());
            objectEncoderContext.add(f43884d, androidClientInfo.getHardware());
            objectEncoderContext.add(f43885e, androidClientInfo.getDevice());
            objectEncoderContext.add(f43886f, androidClientInfo.getProduct());
            objectEncoderContext.add(f43887g, androidClientInfo.getOsBuild());
            objectEncoderContext.add(f43888h, androidClientInfo.getManufacturer());
            objectEncoderContext.add(f43889i, androidClientInfo.getFingerprint());
            objectEncoderContext.add(f43890j, androidClientInfo.getLocale());
            objectEncoderContext.add(f43891k, androidClientInfo.getCountry());
            objectEncoderContext.add(f43892l, androidClientInfo.getMccMnc());
            objectEncoderContext.add(f43893m, androidClientInfo.getApplicationBuild());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$b */
    /* loaded from: classes3.dex */
    public static final class C6219b implements ObjectEncoder {

        /* renamed from: a */
        public static final C6219b f43894a = new C6219b();

        /* renamed from: b */
        public static final FieldDescriptor f43895b = FieldDescriptor.m38762of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43895b, batchedLogRequest.getLogRequests());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$c */
    /* loaded from: classes3.dex */
    public static final class C6220c implements ObjectEncoder {

        /* renamed from: a */
        public static final C6220c f43896a = new C6220c();

        /* renamed from: b */
        public static final FieldDescriptor f43897b = FieldDescriptor.m38762of("clientType");

        /* renamed from: c */
        public static final FieldDescriptor f43898c = FieldDescriptor.m38762of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43897b, clientInfo.getClientType());
            objectEncoderContext.add(f43898c, clientInfo.getAndroidClientInfo());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$d */
    /* loaded from: classes3.dex */
    public static final class C6221d implements ObjectEncoder {

        /* renamed from: a */
        public static final C6221d f43899a = new C6221d();

        /* renamed from: b */
        public static final FieldDescriptor f43900b = FieldDescriptor.m38762of("privacyContext");

        /* renamed from: c */
        public static final FieldDescriptor f43901c = FieldDescriptor.m38762of("productIdOrigin");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43900b, complianceData.getPrivacyContext());
            objectEncoderContext.add(f43901c, complianceData.getProductIdOrigin());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$e */
    /* loaded from: classes3.dex */
    public static final class C6222e implements ObjectEncoder {

        /* renamed from: a */
        public static final C6222e f43902a = new C6222e();

        /* renamed from: b */
        public static final FieldDescriptor f43903b = FieldDescriptor.m38762of("clearBlob");

        /* renamed from: c */
        public static final FieldDescriptor f43904c = FieldDescriptor.m38762of("encryptedBlob");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43903b, experimentIds.getClearBlob());
            objectEncoderContext.add(f43904c, experimentIds.getEncryptedBlob());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$f */
    /* loaded from: classes3.dex */
    public static final class C6223f implements ObjectEncoder {

        /* renamed from: a */
        public static final C6223f f43905a = new C6223f();

        /* renamed from: b */
        public static final FieldDescriptor f43906b = FieldDescriptor.m38762of("originAssociatedProductId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43906b, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$g */
    /* loaded from: classes3.dex */
    public static final class C6224g implements ObjectEncoder {

        /* renamed from: a */
        public static final C6224g f43907a = new C6224g();

        /* renamed from: b */
        public static final FieldDescriptor f43908b = FieldDescriptor.m38762of("prequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43908b, externalPrivacyContext.getPrequest());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$h */
    /* loaded from: classes3.dex */
    public static final class C6225h implements ObjectEncoder {

        /* renamed from: a */
        public static final C6225h f43909a = new C6225h();

        /* renamed from: b */
        public static final FieldDescriptor f43910b = FieldDescriptor.m38762of("eventTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f43911c = FieldDescriptor.m38762of("eventCode");

        /* renamed from: d */
        public static final FieldDescriptor f43912d = FieldDescriptor.m38762of("complianceData");

        /* renamed from: e */
        public static final FieldDescriptor f43913e = FieldDescriptor.m38762of("eventUptimeMs");

        /* renamed from: f */
        public static final FieldDescriptor f43914f = FieldDescriptor.m38762of("sourceExtension");

        /* renamed from: g */
        public static final FieldDescriptor f43915g = FieldDescriptor.m38762of("sourceExtensionJsonProto3");

        /* renamed from: h */
        public static final FieldDescriptor f43916h = FieldDescriptor.m38762of("timezoneOffsetSeconds");

        /* renamed from: i */
        public static final FieldDescriptor f43917i = FieldDescriptor.m38762of("networkConnectionInfo");

        /* renamed from: j */
        public static final FieldDescriptor f43918j = FieldDescriptor.m38762of("experimentIds");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43910b, logEvent.getEventTimeMs());
            objectEncoderContext.add(f43911c, logEvent.getEventCode());
            objectEncoderContext.add(f43912d, logEvent.getComplianceData());
            objectEncoderContext.add(f43913e, logEvent.getEventUptimeMs());
            objectEncoderContext.add(f43914f, logEvent.getSourceExtension());
            objectEncoderContext.add(f43915g, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(f43916h, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(f43917i, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(f43918j, logEvent.getExperimentIds());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$i */
    /* loaded from: classes3.dex */
    public static final class C6226i implements ObjectEncoder {

        /* renamed from: a */
        public static final C6226i f43919a = new C6226i();

        /* renamed from: b */
        public static final FieldDescriptor f43920b = FieldDescriptor.m38762of("requestTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f43921c = FieldDescriptor.m38762of("requestUptimeMs");

        /* renamed from: d */
        public static final FieldDescriptor f43922d = FieldDescriptor.m38762of("clientInfo");

        /* renamed from: e */
        public static final FieldDescriptor f43923e = FieldDescriptor.m38762of("logSource");

        /* renamed from: f */
        public static final FieldDescriptor f43924f = FieldDescriptor.m38762of("logSourceName");

        /* renamed from: g */
        public static final FieldDescriptor f43925g = FieldDescriptor.m38762of("logEvent");

        /* renamed from: h */
        public static final FieldDescriptor f43926h = FieldDescriptor.m38762of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43920b, logRequest.getRequestTimeMs());
            objectEncoderContext.add(f43921c, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(f43922d, logRequest.getClientInfo());
            objectEncoderContext.add(f43923e, logRequest.getLogSource());
            objectEncoderContext.add(f43924f, logRequest.getLogSourceName());
            objectEncoderContext.add(f43925g, logRequest.getLogEvents());
            objectEncoderContext.add(f43926h, logRequest.getQosTier());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$j */
    /* loaded from: classes3.dex */
    public static final class C6227j implements ObjectEncoder {

        /* renamed from: a */
        public static final C6227j f43927a = new C6227j();

        /* renamed from: b */
        public static final FieldDescriptor f43928b = FieldDescriptor.m38762of("networkType");

        /* renamed from: c */
        public static final FieldDescriptor f43929c = FieldDescriptor.m38762of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43928b, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(f43929c, networkConnectionInfo.getMobileSubtype());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C6219b c6219b = C6219b.f43894a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, c6219b);
        encoderConfig.registerEncoder(C11513j8.class, c6219b);
        C6226i c6226i = C6226i.f43919a;
        encoderConfig.registerEncoder(LogRequest.class, c6226i);
        encoderConfig.registerEncoder(C6249h.class, c6226i);
        C6220c c6220c = C6220c.f43896a;
        encoderConfig.registerEncoder(ClientInfo.class, c6220c);
        encoderConfig.registerEncoder(C6231b.class, c6220c);
        C6218a c6218a = C6218a.f43881a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, c6218a);
        encoderConfig.registerEncoder(C6228a.class, c6218a);
        C6225h c6225h = C6225h.f43909a;
        encoderConfig.registerEncoder(LogEvent.class, c6225h);
        encoderConfig.registerEncoder(C6246g.class, c6225h);
        C6221d c6221d = C6221d.f43899a;
        encoderConfig.registerEncoder(ComplianceData.class, c6221d);
        encoderConfig.registerEncoder(C6234c.class, c6221d);
        C6224g c6224g = C6224g.f43907a;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, c6224g);
        encoderConfig.registerEncoder(C6243f.class, c6224g);
        C6223f c6223f = C6223f.f43905a;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, c6223f);
        encoderConfig.registerEncoder(C6240e.class, c6223f);
        C6227j c6227j = C6227j.f43927a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, c6227j);
        encoderConfig.registerEncoder(C6252i.class, c6227j);
        C6222e c6222e = C6222e.f43902a;
        encoderConfig.registerEncoder(ExperimentIds.class, c6222e);
        encoderConfig.registerEncoder(C6237d.class, c6222e);
    }
}
