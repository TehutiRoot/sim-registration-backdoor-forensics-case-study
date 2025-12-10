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
    public static final class C8381a implements ObjectEncoder {

        /* renamed from: a */
        public static final C8381a f54942a = new C8381a();

        /* renamed from: b */
        public static final FieldDescriptor f54943b = FieldDescriptor.m38762of("arch");

        /* renamed from: c */
        public static final FieldDescriptor f54944c = FieldDescriptor.m38762of("libraryName");

        /* renamed from: d */
        public static final FieldDescriptor f54945d = FieldDescriptor.m38762of("buildId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54943b, buildIdMappingForArch.getArch());
            objectEncoderContext.add(f54944c, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(f54945d, buildIdMappingForArch.getBuildId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$b */
    /* loaded from: classes4.dex */
    public static final class C8382b implements ObjectEncoder {

        /* renamed from: a */
        public static final C8382b f54946a = new C8382b();

        /* renamed from: b */
        public static final FieldDescriptor f54947b = FieldDescriptor.m38762of("pid");

        /* renamed from: c */
        public static final FieldDescriptor f54948c = FieldDescriptor.m38762of("processName");

        /* renamed from: d */
        public static final FieldDescriptor f54949d = FieldDescriptor.m38762of("reasonCode");

        /* renamed from: e */
        public static final FieldDescriptor f54950e = FieldDescriptor.m38762of("importance");

        /* renamed from: f */
        public static final FieldDescriptor f54951f = FieldDescriptor.m38762of("pss");

        /* renamed from: g */
        public static final FieldDescriptor f54952g = FieldDescriptor.m38762of("rss");

        /* renamed from: h */
        public static final FieldDescriptor f54953h = FieldDescriptor.m38762of("timestamp");

        /* renamed from: i */
        public static final FieldDescriptor f54954i = FieldDescriptor.m38762of("traceFile");

        /* renamed from: j */
        public static final FieldDescriptor f54955j = FieldDescriptor.m38762of("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54947b, applicationExitInfo.getPid());
            objectEncoderContext.add(f54948c, applicationExitInfo.getProcessName());
            objectEncoderContext.add(f54949d, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(f54950e, applicationExitInfo.getImportance());
            objectEncoderContext.add(f54951f, applicationExitInfo.getPss());
            objectEncoderContext.add(f54952g, applicationExitInfo.getRss());
            objectEncoderContext.add(f54953h, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(f54954i, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(f54955j, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$c */
    /* loaded from: classes4.dex */
    public static final class C8383c implements ObjectEncoder {

        /* renamed from: a */
        public static final C8383c f54956a = new C8383c();

        /* renamed from: b */
        public static final FieldDescriptor f54957b = FieldDescriptor.m38762of(Action.KEY_ATTRIBUTE);

        /* renamed from: c */
        public static final FieldDescriptor f54958c = FieldDescriptor.m38762of("value");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54957b, customAttribute.getKey());
            objectEncoderContext.add(f54958c, customAttribute.getValue());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$d */
    /* loaded from: classes4.dex */
    public static final class C8384d implements ObjectEncoder {

        /* renamed from: a */
        public static final C8384d f54959a = new C8384d();

        /* renamed from: b */
        public static final FieldDescriptor f54960b = FieldDescriptor.m38762of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c */
        public static final FieldDescriptor f54961c = FieldDescriptor.m38762of("gmpAppId");

        /* renamed from: d */
        public static final FieldDescriptor f54962d = FieldDescriptor.m38762of("platform");

        /* renamed from: e */
        public static final FieldDescriptor f54963e = FieldDescriptor.m38762of("installationUuid");

        /* renamed from: f */
        public static final FieldDescriptor f54964f = FieldDescriptor.m38762of("firebaseInstallationId");

        /* renamed from: g */
        public static final FieldDescriptor f54965g = FieldDescriptor.m38762of("firebaseAuthenticationToken");

        /* renamed from: h */
        public static final FieldDescriptor f54966h = FieldDescriptor.m38762of("appQualitySessionId");

        /* renamed from: i */
        public static final FieldDescriptor f54967i = FieldDescriptor.m38762of("buildVersion");

        /* renamed from: j */
        public static final FieldDescriptor f54968j = FieldDescriptor.m38762of("displayVersion");

        /* renamed from: k */
        public static final FieldDescriptor f54969k = FieldDescriptor.m38762of("session");

        /* renamed from: l */
        public static final FieldDescriptor f54970l = FieldDescriptor.m38762of("ndkPayload");

        /* renamed from: m */
        public static final FieldDescriptor f54971m = FieldDescriptor.m38762of("appExitInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54960b, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(f54961c, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(f54962d, crashlyticsReport.getPlatform());
            objectEncoderContext.add(f54963e, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(f54964f, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(f54965g, crashlyticsReport.getFirebaseAuthenticationToken());
            objectEncoderContext.add(f54966h, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(f54967i, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(f54968j, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(f54969k, crashlyticsReport.getSession());
            objectEncoderContext.add(f54970l, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(f54971m, crashlyticsReport.getAppExitInfo());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$e */
    /* loaded from: classes4.dex */
    public static final class C8385e implements ObjectEncoder {

        /* renamed from: a */
        public static final C8385e f54972a = new C8385e();

        /* renamed from: b */
        public static final FieldDescriptor f54973b = FieldDescriptor.m38762of("files");

        /* renamed from: c */
        public static final FieldDescriptor f54974c = FieldDescriptor.m38762of("orgId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54973b, filesPayload.getFiles());
            objectEncoderContext.add(f54974c, filesPayload.getOrgId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$f */
    /* loaded from: classes4.dex */
    public static final class C8386f implements ObjectEncoder {

        /* renamed from: a */
        public static final C8386f f54975a = new C8386f();

        /* renamed from: b */
        public static final FieldDescriptor f54976b = FieldDescriptor.m38762of("filename");

        /* renamed from: c */
        public static final FieldDescriptor f54977c = FieldDescriptor.m38762of("contents");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54976b, file.getFilename());
            objectEncoderContext.add(f54977c, file.getContents());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$g */
    /* loaded from: classes4.dex */
    public static final class C8387g implements ObjectEncoder {

        /* renamed from: a */
        public static final C8387g f54978a = new C8387g();

        /* renamed from: b */
        public static final FieldDescriptor f54979b = FieldDescriptor.m38762of("identifier");

        /* renamed from: c */
        public static final FieldDescriptor f54980c = FieldDescriptor.m38762of(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        public static final FieldDescriptor f54981d = FieldDescriptor.m38762of("displayVersion");

        /* renamed from: e */
        public static final FieldDescriptor f54982e = FieldDescriptor.m38762of("organization");

        /* renamed from: f */
        public static final FieldDescriptor f54983f = FieldDescriptor.m38762of("installationUuid");

        /* renamed from: g */
        public static final FieldDescriptor f54984g = FieldDescriptor.m38762of("developmentPlatform");

        /* renamed from: h */
        public static final FieldDescriptor f54985h = FieldDescriptor.m38762of("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54979b, application.getIdentifier());
            objectEncoderContext.add(f54980c, application.getVersion());
            objectEncoderContext.add(f54981d, application.getDisplayVersion());
            objectEncoderContext.add(f54982e, application.getOrganization());
            objectEncoderContext.add(f54983f, application.getInstallationUuid());
            objectEncoderContext.add(f54984g, application.getDevelopmentPlatform());
            objectEncoderContext.add(f54985h, application.getDevelopmentPlatformVersion());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$h */
    /* loaded from: classes4.dex */
    public static final class C8388h implements ObjectEncoder {

        /* renamed from: a */
        public static final C8388h f54986a = new C8388h();

        /* renamed from: b */
        public static final FieldDescriptor f54987b = FieldDescriptor.m38762of("clsId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54987b, organization.getClsId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$i */
    /* loaded from: classes4.dex */
    public static final class C8389i implements ObjectEncoder {

        /* renamed from: a */
        public static final C8389i f54988a = new C8389i();

        /* renamed from: b */
        public static final FieldDescriptor f54989b = FieldDescriptor.m38762of("arch");

        /* renamed from: c */
        public static final FieldDescriptor f54990c = FieldDescriptor.m38762of("model");

        /* renamed from: d */
        public static final FieldDescriptor f54991d = FieldDescriptor.m38762of("cores");

        /* renamed from: e */
        public static final FieldDescriptor f54992e = FieldDescriptor.m38762of("ram");

        /* renamed from: f */
        public static final FieldDescriptor f54993f = FieldDescriptor.m38762of("diskSpace");

        /* renamed from: g */
        public static final FieldDescriptor f54994g = FieldDescriptor.m38762of("simulator");

        /* renamed from: h */
        public static final FieldDescriptor f54995h = FieldDescriptor.m38762of(RemoteConfigConstants.ResponseFieldKey.STATE);

        /* renamed from: i */
        public static final FieldDescriptor f54996i = FieldDescriptor.m38762of("manufacturer");

        /* renamed from: j */
        public static final FieldDescriptor f54997j = FieldDescriptor.m38762of("modelClass");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Device device2, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54989b, device2.getArch());
            objectEncoderContext.add(f54990c, device2.getModel());
            objectEncoderContext.add(f54991d, device2.getCores());
            objectEncoderContext.add(f54992e, device2.getRam());
            objectEncoderContext.add(f54993f, device2.getDiskSpace());
            objectEncoderContext.add(f54994g, device2.isSimulator());
            objectEncoderContext.add(f54995h, device2.getState());
            objectEncoderContext.add(f54996i, device2.getManufacturer());
            objectEncoderContext.add(f54997j, device2.getModelClass());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$j */
    /* loaded from: classes4.dex */
    public static final class C8390j implements ObjectEncoder {

        /* renamed from: a */
        public static final C8390j f54998a = new C8390j();

        /* renamed from: b */
        public static final FieldDescriptor f54999b = FieldDescriptor.m38762of("generator");

        /* renamed from: c */
        public static final FieldDescriptor f55000c = FieldDescriptor.m38762of("identifier");

        /* renamed from: d */
        public static final FieldDescriptor f55001d = FieldDescriptor.m38762of("appQualitySessionId");

        /* renamed from: e */
        public static final FieldDescriptor f55002e = FieldDescriptor.m38762of("startedAt");

        /* renamed from: f */
        public static final FieldDescriptor f55003f = FieldDescriptor.m38762of("endedAt");

        /* renamed from: g */
        public static final FieldDescriptor f55004g = FieldDescriptor.m38762of("crashed");

        /* renamed from: h */
        public static final FieldDescriptor f55005h = FieldDescriptor.m38762of("app");

        /* renamed from: i */
        public static final FieldDescriptor f55006i = FieldDescriptor.m38762of("user");

        /* renamed from: j */
        public static final FieldDescriptor f55007j = FieldDescriptor.m38762of("os");

        /* renamed from: k */
        public static final FieldDescriptor f55008k = FieldDescriptor.m38762of("device");

        /* renamed from: l */
        public static final FieldDescriptor f55009l = FieldDescriptor.m38762of("events");

        /* renamed from: m */
        public static final FieldDescriptor f55010m = FieldDescriptor.m38762of("generatorType");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f54999b, session.getGenerator());
            objectEncoderContext.add(f55000c, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(f55001d, session.getAppQualitySessionId());
            objectEncoderContext.add(f55002e, session.getStartedAt());
            objectEncoderContext.add(f55003f, session.getEndedAt());
            objectEncoderContext.add(f55004g, session.isCrashed());
            objectEncoderContext.add(f55005h, session.getApp());
            objectEncoderContext.add(f55006i, session.getUser());
            objectEncoderContext.add(f55007j, session.getOs());
            objectEncoderContext.add(f55008k, session.getDevice());
            objectEncoderContext.add(f55009l, session.getEvents());
            objectEncoderContext.add(f55010m, session.getGeneratorType());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$k */
    /* loaded from: classes4.dex */
    public static final class C8391k implements ObjectEncoder {

        /* renamed from: a */
        public static final C8391k f55011a = new C8391k();

        /* renamed from: b */
        public static final FieldDescriptor f55012b = FieldDescriptor.m38762of("execution");

        /* renamed from: c */
        public static final FieldDescriptor f55013c = FieldDescriptor.m38762of("customAttributes");

        /* renamed from: d */
        public static final FieldDescriptor f55014d = FieldDescriptor.m38762of("internalKeys");

        /* renamed from: e */
        public static final FieldDescriptor f55015e = FieldDescriptor.m38762of("background");

        /* renamed from: f */
        public static final FieldDescriptor f55016f = FieldDescriptor.m38762of("currentProcessDetails");

        /* renamed from: g */
        public static final FieldDescriptor f55017g = FieldDescriptor.m38762of("appProcessDetails");

        /* renamed from: h */
        public static final FieldDescriptor f55018h = FieldDescriptor.m38762of("uiOrientation");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55012b, application.getExecution());
            objectEncoderContext.add(f55013c, application.getCustomAttributes());
            objectEncoderContext.add(f55014d, application.getInternalKeys());
            objectEncoderContext.add(f55015e, application.getBackground());
            objectEncoderContext.add(f55016f, application.getCurrentProcessDetails());
            objectEncoderContext.add(f55017g, application.getAppProcessDetails());
            objectEncoderContext.add(f55018h, application.getUiOrientation());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$l */
    /* loaded from: classes4.dex */
    public static final class C8392l implements ObjectEncoder {

        /* renamed from: a */
        public static final C8392l f55019a = new C8392l();

        /* renamed from: b */
        public static final FieldDescriptor f55020b = FieldDescriptor.m38762of("baseAddress");

        /* renamed from: c */
        public static final FieldDescriptor f55021c = FieldDescriptor.m38762of("size");

        /* renamed from: d */
        public static final FieldDescriptor f55022d = FieldDescriptor.m38762of("name");

        /* renamed from: e */
        public static final FieldDescriptor f55023e = FieldDescriptor.m38762of("uuid");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55020b, binaryImage.getBaseAddress());
            objectEncoderContext.add(f55021c, binaryImage.getSize());
            objectEncoderContext.add(f55022d, binaryImage.getName());
            objectEncoderContext.add(f55023e, binaryImage.getUuidUtf8Bytes());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$m */
    /* loaded from: classes4.dex */
    public static final class C8393m implements ObjectEncoder {

        /* renamed from: a */
        public static final C8393m f55024a = new C8393m();

        /* renamed from: b */
        public static final FieldDescriptor f55025b = FieldDescriptor.m38762of("threads");

        /* renamed from: c */
        public static final FieldDescriptor f55026c = FieldDescriptor.m38762of("exception");

        /* renamed from: d */
        public static final FieldDescriptor f55027d = FieldDescriptor.m38762of("appExitInfo");

        /* renamed from: e */
        public static final FieldDescriptor f55028e = FieldDescriptor.m38762of("signal");

        /* renamed from: f */
        public static final FieldDescriptor f55029f = FieldDescriptor.m38762of("binaries");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55025b, execution.getThreads());
            objectEncoderContext.add(f55026c, execution.getException());
            objectEncoderContext.add(f55027d, execution.getAppExitInfo());
            objectEncoderContext.add(f55028e, execution.getSignal());
            objectEncoderContext.add(f55029f, execution.getBinaries());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$n */
    /* loaded from: classes4.dex */
    public static final class C8394n implements ObjectEncoder {

        /* renamed from: a */
        public static final C8394n f55030a = new C8394n();

        /* renamed from: b */
        public static final FieldDescriptor f55031b = FieldDescriptor.m38762of("type");

        /* renamed from: c */
        public static final FieldDescriptor f55032c = FieldDescriptor.m38762of("reason");

        /* renamed from: d */
        public static final FieldDescriptor f55033d = FieldDescriptor.m38762of("frames");

        /* renamed from: e */
        public static final FieldDescriptor f55034e = FieldDescriptor.m38762of("causedBy");

        /* renamed from: f */
        public static final FieldDescriptor f55035f = FieldDescriptor.m38762of("overflowCount");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55031b, exception.getType());
            objectEncoderContext.add(f55032c, exception.getReason());
            objectEncoderContext.add(f55033d, exception.getFrames());
            objectEncoderContext.add(f55034e, exception.getCausedBy());
            objectEncoderContext.add(f55035f, exception.getOverflowCount());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$o */
    /* loaded from: classes4.dex */
    public static final class C8395o implements ObjectEncoder {

        /* renamed from: a */
        public static final C8395o f55036a = new C8395o();

        /* renamed from: b */
        public static final FieldDescriptor f55037b = FieldDescriptor.m38762of("name");

        /* renamed from: c */
        public static final FieldDescriptor f55038c = FieldDescriptor.m38762of("code");

        /* renamed from: d */
        public static final FieldDescriptor f55039d = FieldDescriptor.m38762of("address");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55037b, signal.getName());
            objectEncoderContext.add(f55038c, signal.getCode());
            objectEncoderContext.add(f55039d, signal.getAddress());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$p */
    /* loaded from: classes4.dex */
    public static final class C8396p implements ObjectEncoder {

        /* renamed from: a */
        public static final C8396p f55040a = new C8396p();

        /* renamed from: b */
        public static final FieldDescriptor f55041b = FieldDescriptor.m38762of("name");

        /* renamed from: c */
        public static final FieldDescriptor f55042c = FieldDescriptor.m38762of("importance");

        /* renamed from: d */
        public static final FieldDescriptor f55043d = FieldDescriptor.m38762of("frames");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55041b, thread.getName());
            objectEncoderContext.add(f55042c, thread.getImportance());
            objectEncoderContext.add(f55043d, thread.getFrames());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$q */
    /* loaded from: classes4.dex */
    public static final class C8397q implements ObjectEncoder {

        /* renamed from: a */
        public static final C8397q f55044a = new C8397q();

        /* renamed from: b */
        public static final FieldDescriptor f55045b = FieldDescriptor.m38762of("pc");

        /* renamed from: c */
        public static final FieldDescriptor f55046c = FieldDescriptor.m38762of("symbol");

        /* renamed from: d */
        public static final FieldDescriptor f55047d = FieldDescriptor.m38762of("file");

        /* renamed from: e */
        public static final FieldDescriptor f55048e = FieldDescriptor.m38762of(TypedValues.CycleType.S_WAVE_OFFSET);

        /* renamed from: f */
        public static final FieldDescriptor f55049f = FieldDescriptor.m38762of("importance");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55045b, frame.getPc());
            objectEncoderContext.add(f55046c, frame.getSymbol());
            objectEncoderContext.add(f55047d, frame.getFile());
            objectEncoderContext.add(f55048e, frame.getOffset());
            objectEncoderContext.add(f55049f, frame.getImportance());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$r */
    /* loaded from: classes4.dex */
    public static final class C8398r implements ObjectEncoder {

        /* renamed from: a */
        public static final C8398r f55050a = new C8398r();

        /* renamed from: b */
        public static final FieldDescriptor f55051b = FieldDescriptor.m38762of("processName");

        /* renamed from: c */
        public static final FieldDescriptor f55052c = FieldDescriptor.m38762of("pid");

        /* renamed from: d */
        public static final FieldDescriptor f55053d = FieldDescriptor.m38762of("importance");

        /* renamed from: e */
        public static final FieldDescriptor f55054e = FieldDescriptor.m38762of("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55051b, processDetails.getProcessName());
            objectEncoderContext.add(f55052c, processDetails.getPid());
            objectEncoderContext.add(f55053d, processDetails.getImportance());
            objectEncoderContext.add(f55054e, processDetails.isDefaultProcess());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$s */
    /* loaded from: classes4.dex */
    public static final class C8399s implements ObjectEncoder {

        /* renamed from: a */
        public static final C8399s f55055a = new C8399s();

        /* renamed from: b */
        public static final FieldDescriptor f55056b = FieldDescriptor.m38762of("batteryLevel");

        /* renamed from: c */
        public static final FieldDescriptor f55057c = FieldDescriptor.m38762of("batteryVelocity");

        /* renamed from: d */
        public static final FieldDescriptor f55058d = FieldDescriptor.m38762of("proximityOn");

        /* renamed from: e */
        public static final FieldDescriptor f55059e = FieldDescriptor.m38762of("orientation");

        /* renamed from: f */
        public static final FieldDescriptor f55060f = FieldDescriptor.m38762of("ramUsed");

        /* renamed from: g */
        public static final FieldDescriptor f55061g = FieldDescriptor.m38762of("diskUsed");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Device device2, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55056b, device2.getBatteryLevel());
            objectEncoderContext.add(f55057c, device2.getBatteryVelocity());
            objectEncoderContext.add(f55058d, device2.isProximityOn());
            objectEncoderContext.add(f55059e, device2.getOrientation());
            objectEncoderContext.add(f55060f, device2.getRamUsed());
            objectEncoderContext.add(f55061g, device2.getDiskUsed());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$t */
    /* loaded from: classes4.dex */
    public static final class C8400t implements ObjectEncoder {

        /* renamed from: a */
        public static final C8400t f55062a = new C8400t();

        /* renamed from: b */
        public static final FieldDescriptor f55063b = FieldDescriptor.m38762of("timestamp");

        /* renamed from: c */
        public static final FieldDescriptor f55064c = FieldDescriptor.m38762of("type");

        /* renamed from: d */
        public static final FieldDescriptor f55065d = FieldDescriptor.m38762of("app");

        /* renamed from: e */
        public static final FieldDescriptor f55066e = FieldDescriptor.m38762of("device");

        /* renamed from: f */
        public static final FieldDescriptor f55067f = FieldDescriptor.m38762of("log");

        /* renamed from: g */
        public static final FieldDescriptor f55068g = FieldDescriptor.m38762of("rollouts");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55063b, event.getTimestamp());
            objectEncoderContext.add(f55064c, event.getType());
            objectEncoderContext.add(f55065d, event.getApp());
            objectEncoderContext.add(f55066e, event.getDevice());
            objectEncoderContext.add(f55067f, event.getLog());
            objectEncoderContext.add(f55068g, event.getRollouts());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$u */
    /* loaded from: classes4.dex */
    public static final class C8401u implements ObjectEncoder {

        /* renamed from: a */
        public static final C8401u f55069a = new C8401u();

        /* renamed from: b */
        public static final FieldDescriptor f55070b = FieldDescriptor.m38762of("content");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55070b, log.getContent());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$v */
    /* loaded from: classes4.dex */
    public static final class C8402v implements ObjectEncoder {

        /* renamed from: a */
        public static final C8402v f55071a = new C8402v();

        /* renamed from: b */
        public static final FieldDescriptor f55072b = FieldDescriptor.m38762of("rolloutVariant");

        /* renamed from: c */
        public static final FieldDescriptor f55073c = FieldDescriptor.m38762of("parameterKey");

        /* renamed from: d */
        public static final FieldDescriptor f55074d = FieldDescriptor.m38762of("parameterValue");

        /* renamed from: e */
        public static final FieldDescriptor f55075e = FieldDescriptor.m38762of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55072b, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(f55073c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f55074d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f55075e, rolloutAssignment.getTemplateVersion());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$w */
    /* loaded from: classes4.dex */
    public static final class C8403w implements ObjectEncoder {

        /* renamed from: a */
        public static final C8403w f55076a = new C8403w();

        /* renamed from: b */
        public static final FieldDescriptor f55077b = FieldDescriptor.m38762of("rolloutId");

        /* renamed from: c */
        public static final FieldDescriptor f55078c = FieldDescriptor.m38762of(RemoteConfigConstants.ExperimentDescriptionFieldKey.VARIANT_ID);

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55077b, rolloutVariant.getRolloutId());
            objectEncoderContext.add(f55078c, rolloutVariant.getVariantId());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$x */
    /* loaded from: classes4.dex */
    public static final class C8404x implements ObjectEncoder {

        /* renamed from: a */
        public static final C8404x f55079a = new C8404x();

        /* renamed from: b */
        public static final FieldDescriptor f55080b = FieldDescriptor.m38762of("assignments");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55080b, rolloutsState.getRolloutAssignments());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$y */
    /* loaded from: classes4.dex */
    public static final class C8405y implements ObjectEncoder {

        /* renamed from: a */
        public static final C8405y f55081a = new C8405y();

        /* renamed from: b */
        public static final FieldDescriptor f55082b = FieldDescriptor.m38762of("platform");

        /* renamed from: c */
        public static final FieldDescriptor f55083c = FieldDescriptor.m38762of(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        public static final FieldDescriptor f55084d = FieldDescriptor.m38762of("buildVersion");

        /* renamed from: e */
        public static final FieldDescriptor f55085e = FieldDescriptor.m38762of("jailbroken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55082b, operatingSystem.getPlatform());
            objectEncoderContext.add(f55083c, operatingSystem.getVersion());
            objectEncoderContext.add(f55084d, operatingSystem.getBuildVersion());
            objectEncoderContext.add(f55085e, operatingSystem.isJailbroken());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$z */
    /* loaded from: classes4.dex */
    public static final class C8406z implements ObjectEncoder {

        /* renamed from: a */
        public static final C8406z f55086a = new C8406z();

        /* renamed from: b */
        public static final FieldDescriptor f55087b = FieldDescriptor.m38762of("identifier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        /* renamed from: a */
        public void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f55087b, user.getIdentifier());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        C8384d c8384d = C8384d.f54959a;
        encoderConfig.registerEncoder(CrashlyticsReport.class, c8384d);
        encoderConfig.registerEncoder(C8410a.class, c8384d);
        C8390j c8390j = C8390j.f54998a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, c8390j);
        encoderConfig.registerEncoder(C8428g.class, c8390j);
        C8387g c8387g = C8387g.f54978a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, c8387g);
        encoderConfig.registerEncoder(C8431h.class, c8387g);
        C8388h c8388h = C8388h.f54986a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, c8388h);
        encoderConfig.registerEncoder(C8434i.class, c8388h);
        C8406z c8406z = C8406z.f55086a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, c8406z);
        encoderConfig.registerEncoder(C8486z.class, c8406z);
        C8405y c8405y = C8405y.f55081a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, c8405y);
        encoderConfig.registerEncoder(C8483y.class, c8405y);
        C8389i c8389i = C8389i.f54988a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, c8389i);
        encoderConfig.registerEncoder(C8437j.class, c8389i);
        C8400t c8400t = C8400t.f55062a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, c8400t);
        encoderConfig.registerEncoder(C8440k.class, c8400t);
        C8391k c8391k = C8391k.f55011a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, c8391k);
        encoderConfig.registerEncoder(C8443l.class, c8391k);
        C8393m c8393m = C8393m.f55024a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, c8393m);
        encoderConfig.registerEncoder(C8446m.class, c8393m);
        C8396p c8396p = C8396p.f55040a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, c8396p);
        encoderConfig.registerEncoder(C8458q.class, c8396p);
        C8397q c8397q = C8397q.f55044a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, c8397q);
        encoderConfig.registerEncoder(C8461r.class, c8397q);
        C8394n c8394n = C8394n.f55030a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, c8394n);
        encoderConfig.registerEncoder(C8452o.class, c8394n);
        C8382b c8382b = C8382b.f54946a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, c8382b);
        encoderConfig.registerEncoder(C8413b.class, c8382b);
        C8381a c8381a = C8381a.f54942a;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, c8381a);
        encoderConfig.registerEncoder(C8416c.class, c8381a);
        C8395o c8395o = C8395o.f55036a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, c8395o);
        encoderConfig.registerEncoder(C8455p.class, c8395o);
        C8392l c8392l = C8392l.f55019a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, c8392l);
        encoderConfig.registerEncoder(C8449n.class, c8392l);
        C8383c c8383c = C8383c.f54956a;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, c8383c);
        encoderConfig.registerEncoder(C8419d.class, c8383c);
        C8398r c8398r = C8398r.f55050a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, c8398r);
        encoderConfig.registerEncoder(C8464s.class, c8398r);
        C8399s c8399s = C8399s.f55055a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, c8399s);
        encoderConfig.registerEncoder(C8468t.class, c8399s);
        C8401u c8401u = C8401u.f55069a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, c8401u);
        encoderConfig.registerEncoder(C8471u.class, c8401u);
        C8404x c8404x = C8404x.f55079a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, c8404x);
        encoderConfig.registerEncoder(C8480x.class, c8404x);
        C8402v c8402v = C8402v.f55071a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, c8402v);
        encoderConfig.registerEncoder(C8474v.class, c8402v);
        C8403w c8403w = C8403w.f55076a;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, c8403w);
        encoderConfig.registerEncoder(C8477w.class, c8403w);
        C8385e c8385e = C8385e.f54972a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, c8385e);
        encoderConfig.registerEncoder(C8422e.class, c8385e);
        C8386f c8386f = C8386f.f54975a;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, c8386f);
        encoderConfig.registerEncoder(C8425f.class, c8386f);
    }
}
