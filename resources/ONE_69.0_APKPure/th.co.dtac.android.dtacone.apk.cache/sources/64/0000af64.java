package com.google.firebase.crashlytics.internal.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes4.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$a */
    /* loaded from: classes4.dex */
    public static final class C8370a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8370a f54954a = new C8370a();

        /* renamed from: b */
        public static final FieldDescriptor f54955b = FieldDescriptor.m38754of("arch");

        /* renamed from: c */
        public static final FieldDescriptor f54956c = FieldDescriptor.m38754of("libraryName");

        /* renamed from: d */
        public static final FieldDescriptor f54957d = FieldDescriptor.m38754of("buildId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54955b, buildIdMappingForArch.getArch());
            objectEncoderContext.add(f54956c, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(f54957d, buildIdMappingForArch.getBuildId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8371b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8371b f54958a = new C8371b();

        /* renamed from: b */
        public static final FieldDescriptor f54959b = FieldDescriptor.m38754of("pid");

        /* renamed from: c */
        public static final FieldDescriptor f54960c = FieldDescriptor.m38754of("processName");

        /* renamed from: d */
        public static final FieldDescriptor f54961d = FieldDescriptor.m38754of("reasonCode");

        /* renamed from: e */
        public static final FieldDescriptor f54962e = FieldDescriptor.m38754of("importance");

        /* renamed from: f */
        public static final FieldDescriptor f54963f = FieldDescriptor.m38754of("pss");

        /* renamed from: g */
        public static final FieldDescriptor f54964g = FieldDescriptor.m38754of("rss");

        /* renamed from: h */
        public static final FieldDescriptor f54965h = FieldDescriptor.m38754of("timestamp");

        /* renamed from: i */
        public static final FieldDescriptor f54966i = FieldDescriptor.m38754of("traceFile");

        /* renamed from: j */
        public static final FieldDescriptor f54967j = FieldDescriptor.m38754of("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54959b, applicationExitInfo.getPid());
            objectEncoderContext.add(f54960c, applicationExitInfo.getProcessName());
            objectEncoderContext.add(f54961d, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(f54962e, applicationExitInfo.getImportance());
            objectEncoderContext.add(f54963f, applicationExitInfo.getPss());
            objectEncoderContext.add(f54964g, applicationExitInfo.getRss());
            objectEncoderContext.add(f54965h, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(f54966i, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(f54967j, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8372c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8372c f54968a = new C8372c();

        /* renamed from: b */
        public static final FieldDescriptor f54969b = FieldDescriptor.m38754of(Action.KEY_ATTRIBUTE);

        /* renamed from: c */
        public static final FieldDescriptor f54970c = FieldDescriptor.m38754of("value");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54969b, customAttribute.getKey());
            objectEncoderContext.add(f54970c, customAttribute.getValue());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$d */
    /* loaded from: classes4.dex */
    public static final class C8373d implements ObjectEncoder {

        /* renamed from: a */
        public static final C8373d f54971a = new C8373d();

        /* renamed from: b */
        public static final FieldDescriptor f54972b = FieldDescriptor.m38754of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c */
        public static final FieldDescriptor f54973c = FieldDescriptor.m38754of("gmpAppId");

        /* renamed from: d */
        public static final FieldDescriptor f54974d = FieldDescriptor.m38754of("platform");

        /* renamed from: e */
        public static final FieldDescriptor f54975e = FieldDescriptor.m38754of("installationUuid");

        /* renamed from: f */
        public static final FieldDescriptor f54976f = FieldDescriptor.m38754of("firebaseInstallationId");

        /* renamed from: g */
        public static final FieldDescriptor f54977g = FieldDescriptor.m38754of("firebaseAuthenticationToken");

        /* renamed from: h */
        public static final FieldDescriptor f54978h = FieldDescriptor.m38754of("appQualitySessionId");

        /* renamed from: i */
        public static final FieldDescriptor f54979i = FieldDescriptor.m38754of("buildVersion");

        /* renamed from: j */
        public static final FieldDescriptor f54980j = FieldDescriptor.m38754of("displayVersion");

        /* renamed from: k */
        public static final FieldDescriptor f54981k = FieldDescriptor.m38754of("session");

        /* renamed from: l */
        public static final FieldDescriptor f54982l = FieldDescriptor.m38754of("ndkPayload");

        /* renamed from: m */
        public static final FieldDescriptor f54983m = FieldDescriptor.m38754of("appExitInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54972b, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(f54973c, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(f54974d, crashlyticsReport.getPlatform());
            objectEncoderContext.add(f54975e, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(f54976f, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(f54977g, crashlyticsReport.getFirebaseAuthenticationToken());
            objectEncoderContext.add(f54978h, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(f54979i, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(f54980j, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(f54981k, crashlyticsReport.getSession());
            objectEncoderContext.add(f54982l, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(f54983m, crashlyticsReport.getAppExitInfo());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$e */
    /* loaded from: classes4.dex */
    public static final class C8374e implements ObjectEncoder {

        /* renamed from: a */
        public static final C8374e f54984a = new C8374e();

        /* renamed from: b */
        public static final FieldDescriptor f54985b = FieldDescriptor.m38754of("files");

        /* renamed from: c */
        public static final FieldDescriptor f54986c = FieldDescriptor.m38754of("orgId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54985b, filesPayload.getFiles());
            objectEncoderContext.add(f54986c, filesPayload.getOrgId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$f */
    /* loaded from: classes4.dex */
    public static final class C8375f implements ObjectEncoder {

        /* renamed from: a */
        public static final C8375f f54987a = new C8375f();

        /* renamed from: b */
        public static final FieldDescriptor f54988b = FieldDescriptor.m38754of("filename");

        /* renamed from: c */
        public static final FieldDescriptor f54989c = FieldDescriptor.m38754of("contents");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54988b, file.getFilename());
            objectEncoderContext.add(f54989c, file.getContents());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$g */
    /* loaded from: classes4.dex */
    public static final class C8376g implements ObjectEncoder {

        /* renamed from: a */
        public static final C8376g f54990a = new C8376g();

        /* renamed from: b */
        public static final FieldDescriptor f54991b = FieldDescriptor.m38754of("identifier");

        /* renamed from: c */
        public static final FieldDescriptor f54992c = FieldDescriptor.m38754of(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        public static final FieldDescriptor f54993d = FieldDescriptor.m38754of("displayVersion");

        /* renamed from: e */
        public static final FieldDescriptor f54994e = FieldDescriptor.m38754of("organization");

        /* renamed from: f */
        public static final FieldDescriptor f54995f = FieldDescriptor.m38754of("installationUuid");

        /* renamed from: g */
        public static final FieldDescriptor f54996g = FieldDescriptor.m38754of("developmentPlatform");

        /* renamed from: h */
        public static final FieldDescriptor f54997h = FieldDescriptor.m38754of("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54991b, application.getIdentifier());
            objectEncoderContext.add(f54992c, application.getVersion());
            objectEncoderContext.add(f54993d, application.getDisplayVersion());
            objectEncoderContext.add(f54994e, application.getOrganization());
            objectEncoderContext.add(f54995f, application.getInstallationUuid());
            objectEncoderContext.add(f54996g, application.getDevelopmentPlatform());
            objectEncoderContext.add(f54997h, application.getDevelopmentPlatformVersion());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$h */
    /* loaded from: classes4.dex */
    public static final class C8377h implements ObjectEncoder {

        /* renamed from: a */
        public static final C8377h f54998a = new C8377h();

        /* renamed from: b */
        public static final FieldDescriptor f54999b = FieldDescriptor.m38754of("clsId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54999b, organization.getClsId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$i */
    /* loaded from: classes4.dex */
    public static final class C8378i implements ObjectEncoder {

        /* renamed from: a */
        public static final C8378i f55000a = new C8378i();

        /* renamed from: b */
        public static final FieldDescriptor f55001b = FieldDescriptor.m38754of("arch");

        /* renamed from: c */
        public static final FieldDescriptor f55002c = FieldDescriptor.m38754of("model");

        /* renamed from: d */
        public static final FieldDescriptor f55003d = FieldDescriptor.m38754of("cores");

        /* renamed from: e */
        public static final FieldDescriptor f55004e = FieldDescriptor.m38754of("ram");

        /* renamed from: f */
        public static final FieldDescriptor f55005f = FieldDescriptor.m38754of("diskSpace");

        /* renamed from: g */
        public static final FieldDescriptor f55006g = FieldDescriptor.m38754of("simulator");

        /* renamed from: h */
        public static final FieldDescriptor f55007h = FieldDescriptor.m38754of(RemoteConfigConstants.ResponseFieldKey.STATE);

        /* renamed from: i */
        public static final FieldDescriptor f55008i = FieldDescriptor.m38754of("manufacturer");

        /* renamed from: j */
        public static final FieldDescriptor f55009j = FieldDescriptor.m38754of("modelClass");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Device device2, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55001b, device2.getArch());
            objectEncoderContext.add(f55002c, device2.getModel());
            objectEncoderContext.add(f55003d, device2.getCores());
            objectEncoderContext.add(f55004e, device2.getRam());
            objectEncoderContext.add(f55005f, device2.getDiskSpace());
            objectEncoderContext.add(f55006g, device2.isSimulator());
            objectEncoderContext.add(f55007h, device2.getState());
            objectEncoderContext.add(f55008i, device2.getManufacturer());
            objectEncoderContext.add(f55009j, device2.getModelClass());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$j */
    /* loaded from: classes4.dex */
    public static final class C8379j implements ObjectEncoder {

        /* renamed from: a */
        public static final C8379j f55010a = new C8379j();

        /* renamed from: b */
        public static final FieldDescriptor f55011b = FieldDescriptor.m38754of("generator");

        /* renamed from: c */
        public static final FieldDescriptor f55012c = FieldDescriptor.m38754of("identifier");

        /* renamed from: d */
        public static final FieldDescriptor f55013d = FieldDescriptor.m38754of("appQualitySessionId");

        /* renamed from: e */
        public static final FieldDescriptor f55014e = FieldDescriptor.m38754of("startedAt");

        /* renamed from: f */
        public static final FieldDescriptor f55015f = FieldDescriptor.m38754of("endedAt");

        /* renamed from: g */
        public static final FieldDescriptor f55016g = FieldDescriptor.m38754of("crashed");

        /* renamed from: h */
        public static final FieldDescriptor f55017h = FieldDescriptor.m38754of("app");

        /* renamed from: i */
        public static final FieldDescriptor f55018i = FieldDescriptor.m38754of("user");

        /* renamed from: j */
        public static final FieldDescriptor f55019j = FieldDescriptor.m38754of("os");

        /* renamed from: k */
        public static final FieldDescriptor f55020k = FieldDescriptor.m38754of("device");

        /* renamed from: l */
        public static final FieldDescriptor f55021l = FieldDescriptor.m38754of("events");

        /* renamed from: m */
        public static final FieldDescriptor f55022m = FieldDescriptor.m38754of("generatorType");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55011b, session.getGenerator());
            objectEncoderContext.add(f55012c, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(f55013d, session.getAppQualitySessionId());
            objectEncoderContext.add(f55014e, session.getStartedAt());
            objectEncoderContext.add(f55015f, session.getEndedAt());
            objectEncoderContext.add(f55016g, session.isCrashed());
            objectEncoderContext.add(f55017h, session.getApp());
            objectEncoderContext.add(f55018i, session.getUser());
            objectEncoderContext.add(f55019j, session.getOs());
            objectEncoderContext.add(f55020k, session.getDevice());
            objectEncoderContext.add(f55021l, session.getEvents());
            objectEncoderContext.add(f55022m, session.getGeneratorType());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$k */
    /* loaded from: classes4.dex */
    public static final class C8380k implements ObjectEncoder {

        /* renamed from: a */
        public static final C8380k f55023a = new C8380k();

        /* renamed from: b */
        public static final FieldDescriptor f55024b = FieldDescriptor.m38754of("execution");

        /* renamed from: c */
        public static final FieldDescriptor f55025c = FieldDescriptor.m38754of("customAttributes");

        /* renamed from: d */
        public static final FieldDescriptor f55026d = FieldDescriptor.m38754of("internalKeys");

        /* renamed from: e */
        public static final FieldDescriptor f55027e = FieldDescriptor.m38754of("background");

        /* renamed from: f */
        public static final FieldDescriptor f55028f = FieldDescriptor.m38754of("currentProcessDetails");

        /* renamed from: g */
        public static final FieldDescriptor f55029g = FieldDescriptor.m38754of("appProcessDetails");

        /* renamed from: h */
        public static final FieldDescriptor f55030h = FieldDescriptor.m38754of("uiOrientation");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55024b, application.getExecution());
            objectEncoderContext.add(f55025c, application.getCustomAttributes());
            objectEncoderContext.add(f55026d, application.getInternalKeys());
            objectEncoderContext.add(f55027e, application.getBackground());
            objectEncoderContext.add(f55028f, application.getCurrentProcessDetails());
            objectEncoderContext.add(f55029g, application.getAppProcessDetails());
            objectEncoderContext.add(f55030h, application.getUiOrientation());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$l */
    /* loaded from: classes4.dex */
    public static final class C8381l implements ObjectEncoder {

        /* renamed from: a */
        public static final C8381l f55031a = new C8381l();

        /* renamed from: b */
        public static final FieldDescriptor f55032b = FieldDescriptor.m38754of("baseAddress");

        /* renamed from: c */
        public static final FieldDescriptor f55033c = FieldDescriptor.m38754of("size");

        /* renamed from: d */
        public static final FieldDescriptor f55034d = FieldDescriptor.m38754of("name");

        /* renamed from: e */
        public static final FieldDescriptor f55035e = FieldDescriptor.m38754of("uuid");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55032b, binaryImage.getBaseAddress());
            objectEncoderContext.add(f55033c, binaryImage.getSize());
            objectEncoderContext.add(f55034d, binaryImage.getName());
            objectEncoderContext.add(f55035e, binaryImage.getUuidUtf8Bytes());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$m */
    /* loaded from: classes4.dex */
    public static final class C8382m implements ObjectEncoder {

        /* renamed from: a */
        public static final C8382m f55036a = new C8382m();

        /* renamed from: b */
        public static final FieldDescriptor f55037b = FieldDescriptor.m38754of("threads");

        /* renamed from: c */
        public static final FieldDescriptor f55038c = FieldDescriptor.m38754of("exception");

        /* renamed from: d */
        public static final FieldDescriptor f55039d = FieldDescriptor.m38754of("appExitInfo");

        /* renamed from: e */
        public static final FieldDescriptor f55040e = FieldDescriptor.m38754of("signal");

        /* renamed from: f */
        public static final FieldDescriptor f55041f = FieldDescriptor.m38754of("binaries");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55037b, execution.getThreads());
            objectEncoderContext.add(f55038c, execution.getException());
            objectEncoderContext.add(f55039d, execution.getAppExitInfo());
            objectEncoderContext.add(f55040e, execution.getSignal());
            objectEncoderContext.add(f55041f, execution.getBinaries());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$n */
    /* loaded from: classes4.dex */
    public static final class C8383n implements ObjectEncoder {

        /* renamed from: a */
        public static final C8383n f55042a = new C8383n();

        /* renamed from: b */
        public static final FieldDescriptor f55043b = FieldDescriptor.m38754of("type");

        /* renamed from: c */
        public static final FieldDescriptor f55044c = FieldDescriptor.m38754of("reason");

        /* renamed from: d */
        public static final FieldDescriptor f55045d = FieldDescriptor.m38754of("frames");

        /* renamed from: e */
        public static final FieldDescriptor f55046e = FieldDescriptor.m38754of("causedBy");

        /* renamed from: f */
        public static final FieldDescriptor f55047f = FieldDescriptor.m38754of("overflowCount");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55043b, exception.getType());
            objectEncoderContext.add(f55044c, exception.getReason());
            objectEncoderContext.add(f55045d, exception.getFrames());
            objectEncoderContext.add(f55046e, exception.getCausedBy());
            objectEncoderContext.add(f55047f, exception.getOverflowCount());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$o */
    /* loaded from: classes4.dex */
    public static final class C8384o implements ObjectEncoder {

        /* renamed from: a */
        public static final C8384o f55048a = new C8384o();

        /* renamed from: b */
        public static final FieldDescriptor f55049b = FieldDescriptor.m38754of("name");

        /* renamed from: c */
        public static final FieldDescriptor f55050c = FieldDescriptor.m38754of("code");

        /* renamed from: d */
        public static final FieldDescriptor f55051d = FieldDescriptor.m38754of("address");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55049b, signal.getName());
            objectEncoderContext.add(f55050c, signal.getCode());
            objectEncoderContext.add(f55051d, signal.getAddress());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$p */
    /* loaded from: classes4.dex */
    public static final class C8385p implements ObjectEncoder {

        /* renamed from: a */
        public static final C8385p f55052a = new C8385p();

        /* renamed from: b */
        public static final FieldDescriptor f55053b = FieldDescriptor.m38754of("name");

        /* renamed from: c */
        public static final FieldDescriptor f55054c = FieldDescriptor.m38754of("importance");

        /* renamed from: d */
        public static final FieldDescriptor f55055d = FieldDescriptor.m38754of("frames");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55053b, thread.getName());
            objectEncoderContext.add(f55054c, thread.getImportance());
            objectEncoderContext.add(f55055d, thread.getFrames());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$q */
    /* loaded from: classes4.dex */
    public static final class C8386q implements ObjectEncoder {

        /* renamed from: a */
        public static final C8386q f55056a = new C8386q();

        /* renamed from: b */
        public static final FieldDescriptor f55057b = FieldDescriptor.m38754of("pc");

        /* renamed from: c */
        public static final FieldDescriptor f55058c = FieldDescriptor.m38754of("symbol");

        /* renamed from: d */
        public static final FieldDescriptor f55059d = FieldDescriptor.m38754of("file");

        /* renamed from: e */
        public static final FieldDescriptor f55060e = FieldDescriptor.m38754of(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f */
        public static final FieldDescriptor f55061f = FieldDescriptor.m38754of("importance");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55057b, frame.getPc());
            objectEncoderContext.add(f55058c, frame.getSymbol());
            objectEncoderContext.add(f55059d, frame.getFile());
            objectEncoderContext.add(f55060e, frame.getOffset());
            objectEncoderContext.add(f55061f, frame.getImportance());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$r */
    /* loaded from: classes4.dex */
    public static final class C8387r implements ObjectEncoder {

        /* renamed from: a */
        public static final C8387r f55062a = new C8387r();

        /* renamed from: b */
        public static final FieldDescriptor f55063b = FieldDescriptor.m38754of("processName");

        /* renamed from: c */
        public static final FieldDescriptor f55064c = FieldDescriptor.m38754of("pid");

        /* renamed from: d */
        public static final FieldDescriptor f55065d = FieldDescriptor.m38754of("importance");

        /* renamed from: e */
        public static final FieldDescriptor f55066e = FieldDescriptor.m38754of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55063b, processDetails.getProcessName());
            objectEncoderContext.add(f55064c, processDetails.getPid());
            objectEncoderContext.add(f55065d, processDetails.getImportance());
            objectEncoderContext.add(f55066e, processDetails.isDefaultProcess());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$s */
    /* loaded from: classes4.dex */
    public static final class C8388s implements ObjectEncoder {

        /* renamed from: a */
        public static final C8388s f55067a = new C8388s();

        /* renamed from: b */
        public static final FieldDescriptor f55068b = FieldDescriptor.m38754of("batteryLevel");

        /* renamed from: c */
        public static final FieldDescriptor f55069c = FieldDescriptor.m38754of("batteryVelocity");

        /* renamed from: d */
        public static final FieldDescriptor f55070d = FieldDescriptor.m38754of("proximityOn");

        /* renamed from: e */
        public static final FieldDescriptor f55071e = FieldDescriptor.m38754of("orientation");

        /* renamed from: f */
        public static final FieldDescriptor f55072f = FieldDescriptor.m38754of("ramUsed");

        /* renamed from: g */
        public static final FieldDescriptor f55073g = FieldDescriptor.m38754of("diskUsed");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Device device2, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55068b, device2.getBatteryLevel());
            objectEncoderContext.add(f55069c, device2.getBatteryVelocity());
            objectEncoderContext.add(f55070d, device2.isProximityOn());
            objectEncoderContext.add(f55071e, device2.getOrientation());
            objectEncoderContext.add(f55072f, device2.getRamUsed());
            objectEncoderContext.add(f55073g, device2.getDiskUsed());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$t */
    /* loaded from: classes4.dex */
    public static final class C8389t implements ObjectEncoder {

        /* renamed from: a */
        public static final C8389t f55074a = new C8389t();

        /* renamed from: b */
        public static final FieldDescriptor f55075b = FieldDescriptor.m38754of("timestamp");

        /* renamed from: c */
        public static final FieldDescriptor f55076c = FieldDescriptor.m38754of("type");

        /* renamed from: d */
        public static final FieldDescriptor f55077d = FieldDescriptor.m38754of("app");

        /* renamed from: e */
        public static final FieldDescriptor f55078e = FieldDescriptor.m38754of("device");

        /* renamed from: f */
        public static final FieldDescriptor f55079f = FieldDescriptor.m38754of("log");

        /* renamed from: g */
        public static final FieldDescriptor f55080g = FieldDescriptor.m38754of("rollouts");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55075b, event.getTimestamp());
            objectEncoderContext.add(f55076c, event.getType());
            objectEncoderContext.add(f55077d, event.getApp());
            objectEncoderContext.add(f55078e, event.getDevice());
            objectEncoderContext.add(f55079f, event.getLog());
            objectEncoderContext.add(f55080g, event.getRollouts());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$u */
    /* loaded from: classes4.dex */
    public static final class C8390u implements ObjectEncoder {

        /* renamed from: a */
        public static final C8390u f55081a = new C8390u();

        /* renamed from: b */
        public static final FieldDescriptor f55082b = FieldDescriptor.m38754of("content");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55082b, log.getContent());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$v */
    /* loaded from: classes4.dex */
    public static final class C8391v implements ObjectEncoder {

        /* renamed from: a */
        public static final C8391v f55083a = new C8391v();

        /* renamed from: b */
        public static final FieldDescriptor f55084b = FieldDescriptor.m38754of("rolloutVariant");

        /* renamed from: c */
        public static final FieldDescriptor f55085c = FieldDescriptor.m38754of("parameterKey");

        /* renamed from: d */
        public static final FieldDescriptor f55086d = FieldDescriptor.m38754of("parameterValue");

        /* renamed from: e */
        public static final FieldDescriptor f55087e = FieldDescriptor.m38754of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55084b, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(f55085c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f55086d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f55087e, rolloutAssignment.getTemplateVersion());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$w */
    /* loaded from: classes4.dex */
    public static final class C8392w implements ObjectEncoder {

        /* renamed from: a */
        public static final C8392w f55088a = new C8392w();

        /* renamed from: b */
        public static final FieldDescriptor f55089b = FieldDescriptor.m38754of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f55090c = FieldDescriptor.m38754of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55089b, rolloutVariant.getRolloutId());
            objectEncoderContext.add(f55090c, rolloutVariant.getVariantId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$x */
    /* loaded from: classes4.dex */
    public static final class C8393x implements ObjectEncoder {

        /* renamed from: a */
        public static final C8393x f55091a = new C8393x();

        /* renamed from: b */
        public static final FieldDescriptor f55092b = FieldDescriptor.m38754of("assignments");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55092b, rolloutsState.getRolloutAssignments());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$y */
    /* loaded from: classes4.dex */
    public static final class C8394y implements ObjectEncoder {

        /* renamed from: a */
        public static final C8394y f55093a = new C8394y();

        /* renamed from: b */
        public static final FieldDescriptor f55094b = FieldDescriptor.m38754of("platform");

        /* renamed from: c */
        public static final FieldDescriptor f55095c = FieldDescriptor.m38754of(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        public static final FieldDescriptor f55096d = FieldDescriptor.m38754of("buildVersion");

        /* renamed from: e */
        public static final FieldDescriptor f55097e = FieldDescriptor.m38754of("jailbroken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55094b, operatingSystem.getPlatform());
            objectEncoderContext.add(f55095c, operatingSystem.getVersion());
            objectEncoderContext.add(f55096d, operatingSystem.getBuildVersion());
            objectEncoderContext.add(f55097e, operatingSystem.isJailbroken());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$z */
    /* loaded from: classes4.dex */
    public static final class C8395z implements ObjectEncoder {

        /* renamed from: a */
        public static final C8395z f55098a = new C8395z();

        /* renamed from: b */
        public static final FieldDescriptor f55099b = FieldDescriptor.m38754of("identifier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55099b, user.getIdentifier());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8373d c8373d = C8373d.f54971a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, c8373d);
        encoderConfig.registerEncoder(C8399a.class, c8373d);
        C8379j c8379j = C8379j.f55010a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, c8379j);
        encoderConfig.registerEncoder(C8417g.class, c8379j);
        C8376g c8376g = C8376g.f54990a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, c8376g);
        encoderConfig.registerEncoder(C8420h.class, c8376g);
        C8377h c8377h = C8377h.f54998a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, c8377h);
        encoderConfig.registerEncoder(C8423i.class, c8377h);
        C8395z c8395z = C8395z.f55098a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, c8395z);
        encoderConfig.registerEncoder(C8475z.class, c8395z);
        C8394y c8394y = C8394y.f55093a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, c8394y);
        encoderConfig.registerEncoder(C8472y.class, c8394y);
        C8378i c8378i = C8378i.f55000a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, c8378i);
        encoderConfig.registerEncoder(C8426j.class, c8378i);
        C8389t c8389t = C8389t.f55074a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, c8389t);
        encoderConfig.registerEncoder(C8429k.class, c8389t);
        C8380k c8380k = C8380k.f55023a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, c8380k);
        encoderConfig.registerEncoder(C8432l.class, c8380k);
        C8382m c8382m = C8382m.f55036a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, c8382m);
        encoderConfig.registerEncoder(C8435m.class, c8382m);
        C8385p c8385p = C8385p.f55052a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, c8385p);
        encoderConfig.registerEncoder(C8447q.class, c8385p);
        C8386q c8386q = C8386q.f55056a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, c8386q);
        encoderConfig.registerEncoder(C8450r.class, c8386q);
        C8383n c8383n = C8383n.f55042a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, c8383n);
        encoderConfig.registerEncoder(C8441o.class, c8383n);
        C8371b c8371b = C8371b.f54958a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, c8371b);
        encoderConfig.registerEncoder(C8402b.class, c8371b);
        C8370a c8370a = C8370a.f54954a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, c8370a);
        encoderConfig.registerEncoder(C8405c.class, c8370a);
        C8384o c8384o = C8384o.f55048a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, c8384o);
        encoderConfig.registerEncoder(C8444p.class, c8384o);
        C8381l c8381l = C8381l.f55031a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, c8381l);
        encoderConfig.registerEncoder(C8438n.class, c8381l);
        C8372c c8372c = C8372c.f54968a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, c8372c);
        encoderConfig.registerEncoder(C8408d.class, c8372c);
        C8387r c8387r = C8387r.f55062a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, c8387r);
        encoderConfig.registerEncoder(C8453s.class, c8387r);
        C8388s c8388s = C8388s.f55067a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, c8388s);
        encoderConfig.registerEncoder(C8457t.class, c8388s);
        C8390u c8390u = C8390u.f55081a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, c8390u);
        encoderConfig.registerEncoder(C8460u.class, c8390u);
        C8393x c8393x = C8393x.f55091a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, c8393x);
        encoderConfig.registerEncoder(C8469x.class, c8393x);
        C8391v c8391v = C8391v.f55083a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, c8391v);
        encoderConfig.registerEncoder(C8463v.class, c8391v);
        C8392w c8392w = C8392w.f55088a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, c8392w);
        encoderConfig.registerEncoder(C8466w.class, c8392w);
        C8374e c8374e = C8374e.f54984a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, c8374e);
        encoderConfig.registerEncoder(C8411e.class, c8374e);
        C8375f c8375f = C8375f.f54987a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, c8375f);
        encoderConfig.registerEncoder(C8414f.class, c8375f);
    }
}