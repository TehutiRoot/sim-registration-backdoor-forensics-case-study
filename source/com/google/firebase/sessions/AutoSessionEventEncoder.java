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
    public static final class C8645a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8645a f56492a = new C8645a();

        /* renamed from: b */
        public static final FieldDescriptor f56493b = FieldDescriptor.m38762of(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);

        /* renamed from: c */
        public static final FieldDescriptor f56494c = FieldDescriptor.m38762of("versionName");

        /* renamed from: d */
        public static final FieldDescriptor f56495d = FieldDescriptor.m38762of("appBuildVersion");

        /* renamed from: e */
        public static final FieldDescriptor f56496e = FieldDescriptor.m38762of("deviceManufacturer");

        /* renamed from: f */
        public static final FieldDescriptor f56497f = FieldDescriptor.m38762of("currentProcessDetails");

        /* renamed from: g */
        public static final FieldDescriptor f56498g = FieldDescriptor.m38762of("appProcessDetails");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56493b, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(f56494c, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(f56495d, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(f56496e, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(f56497f, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(f56498g, androidApplicationInfo.getAppProcessDetails());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8646b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8646b f56499a = new C8646b();

        /* renamed from: b */
        public static final FieldDescriptor f56500b = FieldDescriptor.m38762of(RemoteConfigConstants.RequestFieldKey.APP_ID);

        /* renamed from: c */
        public static final FieldDescriptor f56501c = FieldDescriptor.m38762of("deviceModel");

        /* renamed from: d */
        public static final FieldDescriptor f56502d = FieldDescriptor.m38762of("sessionSdkVersion");

        /* renamed from: e */
        public static final FieldDescriptor f56503e = FieldDescriptor.m38762of("osVersion");

        /* renamed from: f */
        public static final FieldDescriptor f56504f = FieldDescriptor.m38762of("logEnvironment");

        /* renamed from: g */
        public static final FieldDescriptor f56505g = FieldDescriptor.m38762of("androidAppInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56500b, applicationInfo.getAppId());
            objectEncoderContext.add(f56501c, applicationInfo.getDeviceModel());
            objectEncoderContext.add(f56502d, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(f56503e, applicationInfo.getOsVersion());
            objectEncoderContext.add(f56504f, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(f56505g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8647c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8647c f56506a = new C8647c();

        /* renamed from: b */
        public static final FieldDescriptor f56507b = FieldDescriptor.m38762of("performance");

        /* renamed from: c */
        public static final FieldDescriptor f56508c = FieldDescriptor.m38762of("crashlytics");

        /* renamed from: d */
        public static final FieldDescriptor f56509d = FieldDescriptor.m38762of("sessionSamplingRate");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56507b, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(f56508c, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(f56509d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$d */
    /* loaded from: classes4.dex */
    public static final class C8648d implements ObjectEncoder {

        /* renamed from: a */
        public static final C8648d f56510a = new C8648d();

        /* renamed from: b */
        public static final FieldDescriptor f56511b = FieldDescriptor.m38762of("processName");

        /* renamed from: c */
        public static final FieldDescriptor f56512c = FieldDescriptor.m38762of("pid");

        /* renamed from: d */
        public static final FieldDescriptor f56513d = FieldDescriptor.m38762of("importance");

        /* renamed from: e */
        public static final FieldDescriptor f56514e = FieldDescriptor.m38762of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56511b, processDetails.getProcessName());
            objectEncoderContext.add(f56512c, processDetails.getPid());
            objectEncoderContext.add(f56513d, processDetails.getImportance());
            objectEncoderContext.add(f56514e, processDetails.isDefaultProcess());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$e */
    /* loaded from: classes4.dex */
    public static final class C8649e implements ObjectEncoder {

        /* renamed from: a */
        public static final C8649e f56515a = new C8649e();

        /* renamed from: b */
        public static final FieldDescriptor f56516b = FieldDescriptor.m38762of("eventType");

        /* renamed from: c */
        public static final FieldDescriptor f56517c = FieldDescriptor.m38762of("sessionData");

        /* renamed from: d */
        public static final FieldDescriptor f56518d = FieldDescriptor.m38762of("applicationInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56516b, sessionEvent.getEventType());
            objectEncoderContext.add(f56517c, sessionEvent.getSessionData());
            objectEncoderContext.add(f56518d, sessionEvent.getApplicationInfo());
        }
    }

    /* renamed from: com.google.firebase.sessions.AutoSessionEventEncoder$f */
    /* loaded from: classes4.dex */
    public static final class C8650f implements ObjectEncoder {

        /* renamed from: a */
        public static final C8650f f56519a = new C8650f();

        /* renamed from: b */
        public static final FieldDescriptor f56520b = FieldDescriptor.m38762of("sessionId");

        /* renamed from: c */
        public static final FieldDescriptor f56521c = FieldDescriptor.m38762of("firstSessionId");

        /* renamed from: d */
        public static final FieldDescriptor f56522d = FieldDescriptor.m38762of("sessionIndex");

        /* renamed from: e */
        public static final FieldDescriptor f56523e = FieldDescriptor.m38762of("eventTimestampUs");

        /* renamed from: f */
        public static final FieldDescriptor f56524f = FieldDescriptor.m38762of("dataCollectionStatus");

        /* renamed from: g */
        public static final FieldDescriptor f56525g = FieldDescriptor.m38762of("firebaseInstallationId");

        /* renamed from: h */
        public static final FieldDescriptor f56526h = FieldDescriptor.m38762of("firebaseAuthenticationToken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f56520b, sessionInfo.getSessionId());
            objectEncoderContext.add(f56521c, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(f56522d, sessionInfo.getSessionIndex());
            objectEncoderContext.add(f56523e, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(f56524f, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(f56525g, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(f56526h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, C8649e.f56515a);
        encoderConfig.registerEncoder(SessionInfo.class, C8650f.f56519a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, C8647c.f56506a);
        encoderConfig.registerEncoder(ApplicationInfo.class, C8646b.f56499a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, C8645a.f56492a);
        encoderConfig.registerEncoder(ProcessDetails.class, C8648d.f56510a);
    }
}
