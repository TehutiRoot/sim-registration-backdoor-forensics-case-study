package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes4.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$a */
    /* loaded from: classes4.dex */
    public static final class C8634a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8634a f56504a = new C8634a();

        /* renamed from: b */
        public static final FieldDescriptor f56505b = FieldDescriptor.m38754of(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);

        /* renamed from: c */
        public static final FieldDescriptor f56506c = FieldDescriptor.m38754of("versionName");

        /* renamed from: d */
        public static final FieldDescriptor f56507d = FieldDescriptor.m38754of("appBuildVersion");

        /* renamed from: e */
        public static final FieldDescriptor f56508e = FieldDescriptor.m38754of("deviceManufacturer");

        /* renamed from: f */
        public static final FieldDescriptor f56509f = FieldDescriptor.m38754of("currentProcessDetails");

        /* renamed from: g */
        public static final FieldDescriptor f56510g = FieldDescriptor.m38754of("appProcessDetails");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56505b, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(f56506c, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(f56507d, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(f56508e, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(f56509f, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(f56510g, androidApplicationInfo.getAppProcessDetails());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8635b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8635b f56511a = new C8635b();

        /* renamed from: b */
        public static final FieldDescriptor f56512b = FieldDescriptor.m38754of(RemoteConfigConstants.RequestFieldKey.APP_ID);

        /* renamed from: c */
        public static final FieldDescriptor f56513c = FieldDescriptor.m38754of("deviceModel");

        /* renamed from: d */
        public static final FieldDescriptor f56514d = FieldDescriptor.m38754of("sessionSdkVersion");

        /* renamed from: e */
        public static final FieldDescriptor f56515e = FieldDescriptor.m38754of("osVersion");

        /* renamed from: f */
        public static final FieldDescriptor f56516f = FieldDescriptor.m38754of("logEnvironment");

        /* renamed from: g */
        public static final FieldDescriptor f56517g = FieldDescriptor.m38754of("androidAppInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56512b, applicationInfo.getAppId());
            objectEncoderContext.add(f56513c, applicationInfo.getDeviceModel());
            objectEncoderContext.add(f56514d, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(f56515e, applicationInfo.getOsVersion());
            objectEncoderContext.add(f56516f, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(f56517g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8636c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8636c f56518a = new C8636c();

        /* renamed from: b */
        public static final FieldDescriptor f56519b = FieldDescriptor.m38754of("performance");

        /* renamed from: c */
        public static final FieldDescriptor f56520c = FieldDescriptor.m38754of("crashlytics");

        /* renamed from: d */
        public static final FieldDescriptor f56521d = FieldDescriptor.m38754of("sessionSamplingRate");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56519b, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(f56520c, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(f56521d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$d */
    /* loaded from: classes4.dex */
    public static final class C8637d implements ObjectEncoder {

        /* renamed from: a */
        public static final C8637d f56522a = new C8637d();

        /* renamed from: b */
        public static final FieldDescriptor f56523b = FieldDescriptor.m38754of("processName");

        /* renamed from: c */
        public static final FieldDescriptor f56524c = FieldDescriptor.m38754of("pid");

        /* renamed from: d */
        public static final FieldDescriptor f56525d = FieldDescriptor.m38754of("importance");

        /* renamed from: e */
        public static final FieldDescriptor f56526e = FieldDescriptor.m38754of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56523b, processDetails.getProcessName());
            objectEncoderContext.add(f56524c, processDetails.getPid());
            objectEncoderContext.add(f56525d, processDetails.getImportance());
            objectEncoderContext.add(f56526e, processDetails.isDefaultProcess());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$e */
    /* loaded from: classes4.dex */
    public static final class C8638e implements ObjectEncoder {

        /* renamed from: a */
        public static final C8638e f56527a = new C8638e();

        /* renamed from: b */
        public static final FieldDescriptor f56528b = FieldDescriptor.m38754of("eventType");

        /* renamed from: c */
        public static final FieldDescriptor f56529c = FieldDescriptor.m38754of("sessionData");

        /* renamed from: d */
        public static final FieldDescriptor f56530d = FieldDescriptor.m38754of("applicationInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56528b, sessionEvent.getEventType());
            objectEncoderContext.add(f56529c, sessionEvent.getSessionData());
            objectEncoderContext.add(f56530d, sessionEvent.getApplicationInfo());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$f */
    /* loaded from: classes4.dex */
    public static final class C8639f implements ObjectEncoder {

        /* renamed from: a */
        public static final C8639f f56531a = new C8639f();

        /* renamed from: b */
        public static final FieldDescriptor f56532b = FieldDescriptor.m38754of("sessionId");

        /* renamed from: c */
        public static final FieldDescriptor f56533c = FieldDescriptor.m38754of("firstSessionId");

        /* renamed from: d */
        public static final FieldDescriptor f56534d = FieldDescriptor.m38754of("sessionIndex");

        /* renamed from: e */
        public static final FieldDescriptor f56535e = FieldDescriptor.m38754of("eventTimestampUs");

        /* renamed from: f */
        public static final FieldDescriptor f56536f = FieldDescriptor.m38754of("dataCollectionStatus");

        /* renamed from: g */
        public static final FieldDescriptor f56537g = FieldDescriptor.m38754of("firebaseInstallationId");

        /* renamed from: h */
        public static final FieldDescriptor f56538h = FieldDescriptor.m38754of("firebaseAuthenticationToken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56532b, sessionInfo.getSessionId());
            objectEncoderContext.add(f56533c, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(f56534d, sessionInfo.getSessionIndex());
            objectEncoderContext.add(f56535e, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(f56536f, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(f56537g, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(f56538h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, C8638e.f56527a);
        encoderConfig.registerEncoder(SessionInfo.class, C8639f.f56531a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, C8636c.f56518a);
        encoderConfig.registerEncoder(ApplicationInfo.class, C8635b.f56511a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, C8634a.f56504a);
        encoderConfig.registerEncoder(ProcessDetails.class, C8637d.f56522a);
    }
}