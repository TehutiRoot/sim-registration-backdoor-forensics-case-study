package com.google.firebase.appdistribution.gradle.tasks;

import com.android.build.api.artifact.SingleArtifact;
import com.android.build.api.variant.ApplicationVariant;
import com.google.firebase.appdistribution.gradle.AppDistributionExtension;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.AbstractC12026a;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Transformer;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.TaskProvider;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTaskConfigurator;", "", "<init>", "()V", "Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask;", "task", "Lcom/android/build/api/variant/ApplicationVariant;", "variant", "Lcom/google/firebase/appdistribution/gradle/AppDistributionExtension;", "extension", "", "configure", "(Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask;Lcom/android/build/api/variant/ApplicationVariant;Lcom/google/firebase/appdistribution/gradle/AppDistributionExtension;)V", "d", "(Lcom/google/firebase/appdistribution/gradle/tasks/UploadDistributionTask;Lcom/android/build/api/variant/ApplicationVariant;)V", "", OperatorName.CURVE_TO, "(Lcom/android/build/api/variant/ApplicationVariant;)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "stringPath", "Lorg/gradle/api/Project;", "project", "e", "(Ljava/lang/String;Lorg/gradle/api/Project;)Ljava/lang/String;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UploadDistributionTaskConfigurator {
    @NotNull
    public static final UploadDistributionTaskConfigurator INSTANCE = new UploadDistributionTaskConfigurator();

    @JvmStatic
    public static final void configure(@NotNull UploadDistributionTask task, @NotNull ApplicationVariant variant, @NotNull AppDistributionExtension extension) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(extension, "extension");
        UploadDistributionTaskConfigurator uploadDistributionTaskConfigurator = INSTANCE;
        task.setMustRunAfter(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{uploadDistributionTaskConfigurator.m39238b(variant), uploadDistributionTaskConfigurator.m39239a(variant)}));
        task.getAppId().set(extension.appId);
        Property<String> artifactPath = task.getArtifactPath();
        String str = extension.artifactPath;
        Project project = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project, "project");
        artifactPath.set(uploadDistributionTaskConfigurator.m39235e(str, project));
        task.getArtifactType().set(extension.artifactType);
        task.getGroups().set(extension.groups);
        Property<String> groupsFile = task.getGroupsFile();
        String str2 = extension.groupsFile;
        Project project2 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project2, "project");
        groupsFile.set(uploadDistributionTaskConfigurator.m39235e(str2, project2));
        task.getReleaseNotes().set(extension.releaseNotes);
        Property<String> releaseNotesFile = task.getReleaseNotesFile();
        String str3 = extension.releaseNotesFile;
        Project project3 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project3, "project");
        releaseNotesFile.set(uploadDistributionTaskConfigurator.m39235e(str3, project3));
        task.getTesters().set(extension.testers);
        Property<String> testersFile = task.getTestersFile();
        String str4 = extension.testersFile;
        Project project4 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project4, "project");
        testersFile.set(uploadDistributionTaskConfigurator.m39235e(str4, project4));
        task.getTestDevices().set(extension.testDevices);
        Property<String> testerDevicesFile = task.getTesterDevicesFile();
        String str5 = extension.testDevicesFile;
        Project project5 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project5, "project");
        testerDevicesFile.set(uploadDistributionTaskConfigurator.m39235e(str5, project5));
        task.getTestUsername().set(extension.testUsername);
        task.getTestPassword().set(extension.testPassword);
        task.getTestPasswordFile().set(extension.testPasswordFile);
        task.getTestUsernameResource().set(extension.testUsernameResource);
        task.getTestPasswordResource().set(extension.testPasswordResource);
        task.getTestNonBlocking().set(extension.testNonBlocking);
        Property<String> serviceCredentialsFile = task.getServiceCredentialsFile();
        String str6 = extension.serviceCredentialsFile;
        Project project6 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project6, "project");
        serviceCredentialsFile.set(uploadDistributionTaskConfigurator.m39235e(str6, project6));
        task.getInferredAab().value(variant.getArtifacts().get(SingleArtifact.BUNDLE.INSTANCE));
        task.getInferredApkDirectory().value(variant.getArtifacts().get(SingleArtifact.APK.INSTANCE));
        task.getTestCases().value(extension.testCases);
        Property<String> testCasesFile = task.getTestCasesFile();
        String str7 = extension.testCasesFile;
        Project project7 = task.getProject();
        Intrinsics.checkNotNullExpressionValue(project7, "project");
        testCasesFile.value(uploadDistributionTaskConfigurator.m39235e(str7, project7));
        uploadDistributionTaskConfigurator.m39236d(task, variant);
    }

    /* renamed from: a */
    public final String m39239a(ApplicationVariant applicationVariant) {
        return "assemble" + m39237c(applicationVariant);
    }

    /* renamed from: b */
    public final String m39238b(ApplicationVariant applicationVariant) {
        return "bundle" + m39237c(applicationVariant);
    }

    /* renamed from: c */
    public final String m39237c(ApplicationVariant applicationVariant) {
        String valueOf;
        String name = applicationVariant.getName();
        if (name.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = name.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                valueOf = AbstractC12026a.titlecase(charAt, ROOT);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = name.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return name;
    }

    /* renamed from: d */
    public final void m39236d(UploadDistributionTask uploadDistributionTask, ApplicationVariant applicationVariant) {
        Provider provider;
        try {
            TaskProvider named = uploadDistributionTask.getProject().getTasks().named("process" + m39237c(applicationVariant) + "GoogleServices");
            final C8340xca8e95ce c8340xca8e95ce = new C8340xca8e95ce(uploadDistributionTask);
            provider = named.flatMap(new Transformer() { // from class: DZ1
            });
        } catch (UnknownTaskException unused) {
            provider = null;
        }
        if (provider != null) {
            uploadDistributionTask.getGoogleServicesDirectory().set(provider);
        }
    }

    /* renamed from: e */
    public final String m39235e(String str, Project project) {
        Path path;
        boolean isAbsolute;
        Path path2;
        Path resolve;
        if (str != null) {
            try {
                path = Paths.get(str, new String[0]);
                isAbsolute = path.isAbsolute();
                if (!isAbsolute) {
                    path2 = Paths.get(project.getRootDir().getPath(), new String[0]);
                    Intrinsics.checkNotNullExpressionValue(path2, "get(project.getRootDir().getPath())");
                    resolve = path2.resolve(path);
                    str = resolve.toString();
                } else {
                    str = path.toString();
                }
                return str;
            } catch (InvalidPathException e) {
                throw new GradleException(str + " is an invalid path", e);
            }
        }
        return null;
    }
}
