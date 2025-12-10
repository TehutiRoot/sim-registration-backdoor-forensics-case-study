package com.google.firebase.appdistribution.gradle.tasks;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.BinaryType;
import com.google.firebase.appdistribution.gradle.FirebaseAppDistribution;
import com.google.firebase.appdistribution.gradle.UploadDistributionOptions;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__IndentKt;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFile;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.TaskAction;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\bE\b\u0016\u0018\u0000 W2\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0003R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0018\u0010\u0007R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001a\u0010\u0007R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001c\u0010\u0007R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001e\u0010\u0007R \u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b \u0010\u0007R \u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0007R \u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u0007R \u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b)\u0010\u0007R \u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b,\u0010\u0007R \u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u0010\u0007R \u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0015\u001a\u0004\b2\u0010\u0007R \u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0015\u001a\u0004\b5\u0010\u0007R \u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b8\u0010\u0007R \u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u0010\u0007R \u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0007R \u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\bA\u0010\u0007R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bD\u0010\u0007R \u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0015\u001a\u0004\bG\u0010\u0007R \u0010K\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0015\u001a\u0004\bJ\u0010\u0007R\u001a\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010\fR\u001a\u0010S\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010\u000fR\u001a\u0010V\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010\u000f¨\u0006X"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask;", "Lorg/gradle/api/DefaultTask;", "<init>", "()V", "Lorg/gradle/api/provider/Property;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Lorg/gradle/api/provider/Property;", "", OperatorName.FILL_NON_ZERO, "Lorg/gradle/api/file/RegularFileProperty;", "e", "()Lorg/gradle/api/file/RegularFileProperty;", "Lorg/gradle/api/file/DirectoryProperty;", "d", "()Lorg/gradle/api/file/DirectoryProperty;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", OperatorName.CURVE_TO, "", "uploadDistribution", "Lorg/gradle/api/provider/Property;", "getGroups", "groups", "getGroupsFile", "groupsFile", "getReleaseNotes", "releaseNotes", "getReleaseNotesFile", "releaseNotesFile", "getServiceCredentialsFile", "serviceCredentialsFile", "getTesters", "testers", OperatorName.NON_STROKING_GRAY, "getTestersFile", "testersFile", OperatorName.CLOSE_PATH, "getAppId", RemoteConfigConstants.RequestFieldKey.APP_ID, "i", "getArtifactPath", "artifactPath", OperatorName.SET_LINE_JOINSTYLE, "getArtifactType", "artifactType", OperatorName.NON_STROKING_CMYK, "getTestDevices", "testDevices", OperatorName.LINE_TO, "getTesterDevicesFile", "testerDevicesFile", OperatorName.MOVE_TO, "getTestUsername", "testUsername", OperatorName.ENDPATH, "getTestPassword", "testPassword", "o", "getTestPasswordFile", "testPasswordFile", "p", "getTestUsernameResource", "testUsernameResource", OperatorName.SAVE, "getTestPasswordResource", "testPasswordResource", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTestNonBlocking", "testNonBlocking", OperatorName.CLOSE_AND_STROKE, "getTestCases", "testCases", "t", "getTestCasesFile", "testCasesFile", "u", "Lorg/gradle/api/file/RegularFileProperty;", "getInferredAab", "inferredAab", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lorg/gradle/api/file/DirectoryProperty;", "getInferredApkDirectory", "inferredApkDirectory", OperatorName.SET_LINE_WIDTH, "getGoogleServicesDirectory", "googleServicesDirectory", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadDistributionTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadDistributionTask.kt\ncom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,411:1\n774#2:412\n865#2,2:413\n*S KotlinDebug\n*F\n+ 1 UploadDistributionTask.kt\ncom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask\n*L\n386#1:412\n386#1:413,2\n*E\n"})
/* loaded from: classes4.dex */
public class UploadDistributionTask extends DefaultTask {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Property f54666a = m39240f();

    /* renamed from: b */
    public final Property f54667b = m39240f();

    /* renamed from: c */
    public final Property f54668c = m39240f();

    /* renamed from: d */
    public final Property f54669d = m39240f();

    /* renamed from: e */
    public final Property f54670e = m39240f();

    /* renamed from: f */
    public final Property f54671f = m39240f();

    /* renamed from: g */
    public final Property f54672g = m39240f();

    /* renamed from: h */
    public final Property f54673h = m39240f();

    /* renamed from: i */
    public final Property f54674i = m39240f();

    /* renamed from: j */
    public final Property f54675j = m39240f();

    /* renamed from: k */
    public final Property f54676k = m39240f();

    /* renamed from: l */
    public final Property f54677l = m39240f();

    /* renamed from: m */
    public final Property f54678m = m39240f();

    /* renamed from: n */
    public final Property f54679n = m39240f();

    /* renamed from: o */
    public final Property f54680o = m39240f();

    /* renamed from: p */
    public final Property f54681p = m39240f();

    /* renamed from: q */
    public final Property f54682q = m39240f();

    /* renamed from: r */
    public final Property f54683r = m39245a();

    /* renamed from: s */
    public final Property f54684s = m39240f();

    /* renamed from: t */
    public final Property f54685t = m39240f();

    /* renamed from: u */
    public final RegularFileProperty f54686u = m39241e();

    /* renamed from: v */
    public final DirectoryProperty f54687v = m39242d();

    /* renamed from: w */
    public final DirectoryProperty f54688w = m39242d();

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask$Companion;", "", "()V", "ARTIFACT_TYPE_AAB", "", "DEFAULT_UPLOAD_ERROR_MESSAGE", "SUPPORT_EMAIL", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppDistributionException.Reason.values().length];
            try {
                iArr[AppDistributionException.Reason.APP_NOT_ONBOARDED_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppDistributionException.Reason.MISSING_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppDistributionException.Reason.MISSING_APP_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UploadDistributionTask() {
        boolean z;
        try {
            getClass().getMethod("doNotTrackState", null).invoke(this, null);
        } catch (Exception e) {
            if (e instanceof NoSuchMethodException) {
                z = true;
            } else {
                z = e instanceof IllegalAccessException;
            }
            if (z ? true : e instanceof InvocationTargetException) {
                return;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final Property m39245a() {
        Property property = getProject().getObjects().property(Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(property, "project.objects.property(Boolean::class.java)");
        return property;
    }

    /* renamed from: b */
    public final String m39244b() {
        boolean z;
        if (this.f54673h.isPresent()) {
            return (String) this.f54673h.get();
        }
        if (!this.f54688w.isPresent()) {
            return null;
        }
        File file = new File((File) this.f54688w.getAsFile().get(), "values/values.xml");
        if (!file.exists()) {
            return null;
        }
        boolean z2 = true;
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getElementsByTagName(TypedValues.Custom.S_STRING);
            int length = elementsByTagName.getLength();
            for (int i = 0; i < length; i++) {
                Node item = elementsByTagName.item(i);
                if (item.getNodeType() == 1) {
                    Intrinsics.checkNotNull(item, "null cannot be cast to non-null type org.w3c.dom.Element");
                    if (Intrinsics.areEqual(((Element) item).getAttribute("name"), "google_app_id")) {
                        return item.getTextContent();
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof ParserConfigurationException) {
                z = true;
            } else {
                z = e instanceof SAXException;
            }
            if (!z) {
                z2 = e instanceof IOException;
            }
            if (!z2) {
                throw e;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String m39243c() {
        String path;
        if (this.f54674i.isPresent()) {
            getLogger().info("Using {} path specified by the artifactPath parameter in your app's build.gradle: {}.%n", BinaryType.fromPath((String) this.f54674i.get()), this.f54674i.get());
            Object obj = this.f54674i.get();
            Intrinsics.checkNotNullExpressionValue(obj, "artifactPath.get()");
            return (String) obj;
        }
        if (this.f54675j.isPresent() && Intrinsics.areEqual(this.f54675j.get(), "AAB")) {
            if (this.f54686u.isPresent()) {
                path = ((RegularFile) this.f54686u.get()).getAsFile().getPath();
            } else {
                throw new GradleException("Could not find an AAB file for this variant for App Distribution");
            }
        } else {
            Set files = this.f54687v.getAsFileTree().getFiles();
            Intrinsics.checkNotNullExpressionValue(files, "inferredApkDirectory.asFileTree.files");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : files) {
                String path2 = ((File) obj2).getPath();
                Intrinsics.checkNotNullExpressionValue(path2, "it.path");
                if (AbstractC20204hN1.endsWith$default(path2, ".apk", false, 2, null)) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size == 1) {
                    path = ((File) arrayList.get(0)).getPath();
                } else {
                    throw new GradleException("App Distribution found more than 1 output file for this variant. Please contact firebase-support@google.com for help using APK splits with App Distribution.");
                }
            } else {
                throw new GradleException("Could not find an APK file for this variant for App Distribution");
            }
        }
        getLogger().info("Using {} path in the outputs directory: {}.%n", BinaryType.fromPath(path), path);
        Intrinsics.checkNotNullExpressionValue(path, "path");
        return path;
    }

    /* renamed from: d */
    public final DirectoryProperty m39242d() {
        DirectoryProperty directoryProperty = getProject().getObjects().directoryProperty();
        Intrinsics.checkNotNullExpressionValue(directoryProperty, "project.objects.directoryProperty()");
        return directoryProperty;
    }

    /* renamed from: e */
    public final RegularFileProperty m39241e() {
        RegularFileProperty fileProperty = getProject().getObjects().fileProperty();
        Intrinsics.checkNotNullExpressionValue(fileProperty, "project.objects.fileProperty()");
        return fileProperty;
    }

    /* renamed from: f */
    public final Property m39240f() {
        Property property = getProject().getObjects().property(String.class);
        Intrinsics.checkNotNullExpressionValue(property, "project.objects.property(String::class.java)");
        return property;
    }

    @NotNull
    public final Property<String> getAppId() {
        return this.f54673h;
    }

    @NotNull
    public final Property<String> getArtifactPath() {
        return this.f54674i;
    }

    @NotNull
    public final Property<String> getArtifactType() {
        return this.f54675j;
    }

    @NotNull
    public final DirectoryProperty getGoogleServicesDirectory() {
        return this.f54688w;
    }

    @NotNull
    public final Property<String> getGroups() {
        return this.f54666a;
    }

    @NotNull
    public final Property<String> getGroupsFile() {
        return this.f54667b;
    }

    @NotNull
    public final RegularFileProperty getInferredAab() {
        return this.f54686u;
    }

    @NotNull
    public final DirectoryProperty getInferredApkDirectory() {
        return this.f54687v;
    }

    @NotNull
    public final Property<String> getReleaseNotes() {
        return this.f54668c;
    }

    @NotNull
    public final Property<String> getReleaseNotesFile() {
        return this.f54669d;
    }

    @NotNull
    public final Property<String> getServiceCredentialsFile() {
        return this.f54670e;
    }

    @NotNull
    public final Property<String> getTestCases() {
        return this.f54684s;
    }

    @NotNull
    public final Property<String> getTestCasesFile() {
        return this.f54685t;
    }

    @NotNull
    public final Property<String> getTestDevices() {
        return this.f54676k;
    }

    @NotNull
    public final Property<Boolean> getTestNonBlocking() {
        return this.f54683r;
    }

    @NotNull
    public final Property<String> getTestPassword() {
        return this.f54679n;
    }

    @NotNull
    public final Property<String> getTestPasswordFile() {
        return this.f54680o;
    }

    @NotNull
    public final Property<String> getTestPasswordResource() {
        return this.f54682q;
    }

    @NotNull
    public final Property<String> getTestUsername() {
        return this.f54678m;
    }

    @NotNull
    public final Property<String> getTestUsernameResource() {
        return this.f54681p;
    }

    @NotNull
    public final Property<String> getTesterDevicesFile() {
        return this.f54677l;
    }

    @NotNull
    public final Property<String> getTesters() {
        return this.f54671f;
    }

    @NotNull
    public final Property<String> getTestersFile() {
        return this.f54672g;
    }

    @TaskAction
    public final void uploadDistribution() {
        String m39243c = m39243c();
        getLogger().info("Uploading {} to Firebase App Distribution...%n", BinaryType.fromPath(m39243c));
        if (this.f54670e.isPresent()) {
            getLogger().info("Using service credentials file specified by the serviceCredentialsFile property in your app's build.gradle file: {} %n", this.f54670e.get());
        }
        String m39244b = m39244b();
        if (m39244b != null) {
            String str = (String) this.f54668c.getOrNull();
            String str2 = (String) this.f54669d.getOrNull();
            String str3 = (String) this.f54671f.getOrNull();
            String str4 = (String) this.f54672g.getOrNull();
            String str5 = (String) this.f54666a.getOrNull();
            String str6 = (String) this.f54667b.getOrNull();
            String str7 = (String) this.f54676k.getOrNull();
            String str8 = (String) this.f54677l.getOrNull();
            String str9 = (String) this.f54678m.getOrNull();
            String str10 = (String) this.f54679n.getOrNull();
            String str11 = (String) this.f54680o.getOrNull();
            String str12 = (String) this.f54681p.getOrNull();
            String str13 = (String) this.f54682q.getOrNull();
            Boolean bool = (Boolean) this.f54683r.getOrElse(Boolean.FALSE);
            String str14 = (String) this.f54684s.getOrNull();
            String str15 = (String) this.f54685t.getOrNull();
            Intrinsics.checkNotNullExpressionValue(bool, "getOrElse(false)");
            UploadDistributionOptions uploadDistributionOptions = new UploadDistributionOptions(m39244b, false, bool.booleanValue(), m39243c, null, null, (String) this.f54670e.getOrNull(), str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, 50, null);
            try {
                FirebaseAppDistribution.uploadDistribution(uploadDistributionOptions);
                getLogger().info("App Distribution upload finished successfully!");
                return;
            } catch (AppDistributionException e) {
                int i = WhenMappings.$EnumSwitchMapping$0[e.getReason().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Error uploading distribution";
                            }
                            throw new GradleException(message, e);
                        }
                        throw new GradleException("Could not find your app id. Please verify that you set the property `appId` in your app's build.gradle file and try again.");
                    }
                    throw new GradleException("Could not find credentials. To authenticate, you have a few options: \n1. Set the `serviceCredentialsFile` property in your gradle plugin\n2. Set a refresh token with the FIREBASE_TOKEN environment variable\n3. Log in with the Firebase CLI\n4. Set service credentials with the GOOGLE_APPLICATION_CREDENTIALS environment variable");
                }
                throw new GradleException(StringsKt__IndentKt.trimIndent("\n                  App Distribution could not find your app " + uploadDistributionOptions.getAppId() + "\n                  Make sure to onboard your app by pressing the \"Get started\" button on the App Distribution page in the Firebase console:\n                    https://console.firebase.google.com/project/_/appdistribution  \n                "));
            }
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_APP_ID, null, null, 6, null);
    }
}
