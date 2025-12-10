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
    public static final class C6207a implements ObjectEncoder {

        /* renamed from: a */
        public static final C6207a f43893a = new C6207a();

        /* renamed from: b */
        public static final FieldDescriptor f43894b = FieldDescriptor.m38754of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c */
        public static final FieldDescriptor f43895c = FieldDescriptor.m38754of("model");

        /* renamed from: d */
        public static final FieldDescriptor f43896d = FieldDescriptor.m38754of("hardware");

        /* renamed from: e */
        public static final FieldDescriptor f43897e = FieldDescriptor.m38754of("device");

        /* renamed from: f */
        public static final FieldDescriptor f43898f = FieldDescriptor.m38754of("product");

        /* renamed from: g */
        public static final FieldDescriptor f43899g = FieldDescriptor.m38754of("osBuild");

        /* renamed from: h */
        public static final FieldDescriptor f43900h = FieldDescriptor.m38754of("manufacturer");

        /* renamed from: i */
        public static final FieldDescriptor f43901i = FieldDescriptor.m38754of("fingerprint");

        /* renamed from: j */
        public static final FieldDescriptor f43902j = FieldDescriptor.m38754of("locale");

        /* renamed from: k */
        public static final FieldDescriptor f43903k = FieldDescriptor.m38754of("country");

        /* renamed from: l */
        public static final FieldDescriptor f43904l = FieldDescriptor.m38754of("mccMnc");

        /* renamed from: m */
        public static final FieldDescriptor f43905m = FieldDescriptor.m38754of("applicationBuild");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43894b, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(f43895c, androidClientInfo.getModel());
            objectEncoderContext.add(f43896d, androidClientInfo.getHardware());
            objectEncoderContext.add(f43897e, androidClientInfo.getDevice());
            objectEncoderContext.add(f43898f, androidClientInfo.getProduct());
            objectEncoderContext.add(f43899g, androidClientInfo.getOsBuild());
            objectEncoderContext.add(f43900h, androidClientInfo.getManufacturer());
            objectEncoderContext.add(f43901i, androidClientInfo.getFingerprint());
            objectEncoderContext.add(f43902j, androidClientInfo.getLocale());
            objectEncoderContext.add(f43903k, androidClientInfo.getCountry());
            objectEncoderContext.add(f43904l, androidClientInfo.getMccMnc());
            objectEncoderContext.add(f43905m, androidClientInfo.getApplicationBuild());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$b */
    /* loaded from: classes3.dex */
    public static final class C6208b implements ObjectEncoder {

        /* renamed from: a */
        public static final C6208b f43906a = new C6208b();

        /* renamed from: b */
        public static final FieldDescriptor f43907b = FieldDescriptor.m38754of("logRequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43907b, batchedLogRequest.getLogRequests());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$c */
    /* loaded from: classes3.dex */
    public static final class C6209c implements ObjectEncoder {

        /* renamed from: a */
        public static final C6209c f43908a = new C6209c();

        /* renamed from: b */
        public static final FieldDescriptor f43909b = FieldDescriptor.m38754of("clientType");

        /* renamed from: c */
        public static final FieldDescriptor f43910c = FieldDescriptor.m38754of("androidClientInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43909b, clientInfo.getClientType());
            objectEncoderContext.add(f43910c, clientInfo.getAndroidClientInfo());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$d */
    /* loaded from: classes3.dex */
    public static final class C6210d implements ObjectEncoder {

        /* renamed from: a */
        public static final C6210d f43911a = new C6210d();

        /* renamed from: b */
        public static final FieldDescriptor f43912b = FieldDescriptor.m38754of("privacyContext");

        /* renamed from: c */
        public static final FieldDescriptor f43913c = FieldDescriptor.m38754of("productIdOrigin");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43912b, complianceData.getPrivacyContext());
            objectEncoderContext.add(f43913c, complianceData.getProductIdOrigin());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$e */
    /* loaded from: classes3.dex */
    public static final class C6211e implements ObjectEncoder {

        /* renamed from: a */
        public static final C6211e f43914a = new C6211e();

        /* renamed from: b */
        public static final FieldDescriptor f43915b = FieldDescriptor.m38754of("clearBlob");

        /* renamed from: c */
        public static final FieldDescriptor f43916c = FieldDescriptor.m38754of("encryptedBlob");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43915b, experimentIds.getClearBlob());
            objectEncoderContext.add(f43916c, experimentIds.getEncryptedBlob());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$f */
    /* loaded from: classes3.dex */
    public static final class C6212f implements ObjectEncoder {

        /* renamed from: a */
        public static final C6212f f43917a = new C6212f();

        /* renamed from: b */
        public static final FieldDescriptor f43918b = FieldDescriptor.m38754of("originAssociatedProductId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43918b, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$g */
    /* loaded from: classes3.dex */
    public static final class C6213g implements ObjectEncoder {

        /* renamed from: a */
        public static final C6213g f43919a = new C6213g();

        /* renamed from: b */
        public static final FieldDescriptor f43920b = FieldDescriptor.m38754of("prequest");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43920b, externalPrivacyContext.getPrequest());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$h */
    /* loaded from: classes3.dex */
    public static final class C6214h implements ObjectEncoder {

        /* renamed from: a */
        public static final C6214h f43921a = new C6214h();

        /* renamed from: b */
        public static final FieldDescriptor f43922b = FieldDescriptor.m38754of("eventTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f43923c = FieldDescriptor.m38754of("eventCode");

        /* renamed from: d */
        public static final FieldDescriptor f43924d = FieldDescriptor.m38754of("complianceData");

        /* renamed from: e */
        public static final FieldDescriptor f43925e = FieldDescriptor.m38754of("eventUptimeMs");

        /* renamed from: f */
        public static final FieldDescriptor f43926f = FieldDescriptor.m38754of("sourceExtension");

        /* renamed from: g */
        public static final FieldDescriptor f43927g = FieldDescriptor.m38754of("sourceExtensionJsonProto3");

        /* renamed from: h */
        public static final FieldDescriptor f43928h = FieldDescriptor.m38754of("timezoneOffsetSeconds");

        /* renamed from: i */
        public static final FieldDescriptor f43929i = FieldDescriptor.m38754of("networkConnectionInfo");

        /* renamed from: j */
        public static final FieldDescriptor f43930j = FieldDescriptor.m38754of("experimentIds");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43922b, logEvent.getEventTimeMs());
            objectEncoderContext.add(f43923c, logEvent.getEventCode());
            objectEncoderContext.add(f43924d, logEvent.getComplianceData());
            objectEncoderContext.add(f43925e, logEvent.getEventUptimeMs());
            objectEncoderContext.add(f43926f, logEvent.getSourceExtension());
            objectEncoderContext.add(f43927g, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(f43928h, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(f43929i, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(f43930j, logEvent.getExperimentIds());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$i */
    /* loaded from: classes3.dex */
    public static final class C6215i implements ObjectEncoder {

        /* renamed from: a */
        public static final C6215i f43931a = new C6215i();

        /* renamed from: b */
        public static final FieldDescriptor f43932b = FieldDescriptor.m38754of("requestTimeMs");

        /* renamed from: c */
        public static final FieldDescriptor f43933c = FieldDescriptor.m38754of("requestUptimeMs");

        /* renamed from: d */
        public static final FieldDescriptor f43934d = FieldDescriptor.m38754of("clientInfo");

        /* renamed from: e */
        public static final FieldDescriptor f43935e = FieldDescriptor.m38754of("logSource");

        /* renamed from: f */
        public static final FieldDescriptor f43936f = FieldDescriptor.m38754of("logSourceName");

        /* renamed from: g */
        public static final FieldDescriptor f43937g = FieldDescriptor.m38754of("logEvent");

        /* renamed from: h */
        public static final FieldDescriptor f43938h = FieldDescriptor.m38754of("qosTier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43932b, logRequest.getRequestTimeMs());
            objectEncoderContext.add(f43933c, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(f43934d, logRequest.getClientInfo());
            objectEncoderContext.add(f43935e, logRequest.getLogSource());
            objectEncoderContext.add(f43936f, logRequest.getLogSourceName());
            objectEncoderContext.add(f43937g, logRequest.getLogEvents());
            objectEncoderContext.add(f43938h, logRequest.getQosTier());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder$j */
    /* loaded from: classes3.dex */
    public static final class C6216j implements ObjectEncoder {

        /* renamed from: a */
        public static final C6216j f43939a = new C6216j();

        /* renamed from: b */
        public static final FieldDescriptor f43940b = FieldDescriptor.m38754of("networkType");

        /* renamed from: c */
        public static final FieldDescriptor f43941c = FieldDescriptor.m38754of("mobileSubtype");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f43940b, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(f43941c, networkConnectionInfo.getMobileSubtype());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C6208b c6208b = C6208b.f43906a;
        encoderConfig.registerEncoder(BatchedLogRequest.class, c6208b);
        encoderConfig.registerEncoder(C11501j8.class, c6208b);
        C6215i c6215i = C6215i.f43931a;
        encoderConfig.registerEncoder(LogRequest.class, c6215i);
        encoderConfig.registerEncoder(C6238h.class, c6215i);
        C6209c c6209c = C6209c.f43908a;
        encoderConfig.registerEncoder(ClientInfo.class, c6209c);
        encoderConfig.registerEncoder(C6220b.class, c6209c);
        C6207a c6207a = C6207a.f43893a;
        encoderConfig.registerEncoder(AndroidClientInfo.class, c6207a);
        encoderConfig.registerEncoder(C6217a.class, c6207a);
        C6214h c6214h = C6214h.f43921a;
        encoderConfig.registerEncoder(LogEvent.class, c6214h);
        encoderConfig.registerEncoder(C6235g.class, c6214h);
        C6210d c6210d = C6210d.f43911a;
        encoderConfig.registerEncoder(ComplianceData.class, c6210d);
        encoderConfig.registerEncoder(C6223c.class, c6210d);
        C6213g c6213g = C6213g.f43919a;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, c6213g);
        encoderConfig.registerEncoder(C6232f.class, c6213g);
        C6212f c6212f = C6212f.f43917a;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, c6212f);
        encoderConfig.registerEncoder(C6229e.class, c6212f);
        C6216j c6216j = C6216j.f43939a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, c6216j);
        encoderConfig.registerEncoder(C6241i.class, c6216j);
        C6211e c6211e = C6211e.f43914a;
        encoderConfig.registerEncoder(ExperimentIds.class, c6211e);
        encoderConfig.registerEncoder(C6226d.class, c6211e);
    }
}