package com.google.firebase.appdistribution.gradle.tasks;

import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.TesterManagementOptions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.options.Option;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/tasks/TesterManagementTask;", "Lorg/gradle/api/DefaultTask;", "<init>", "()V", "", "projectNumber", "", "setProjectNumber", "(Ljava/lang/String;)V", "emails", "setEmails", "filePath", "setFile", "serviceCredentialsFilePath", "setServiceCredentialsFile", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "e", "processException", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException;)V", "Lorg/gradle/api/provider/Property;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lorg/gradle/api/provider/Property;", "getProjectNumber", "()Lorg/gradle/api/provider/Property;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEmails", OperatorName.CURVE_TO, "getFile", "file", "d", "getServiceCredentialsFile", "serviceCredentialsFile", "Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;", "getOptions", "()Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;", "options", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class TesterManagementTask extends DefaultTask {

    /* renamed from: a */
    public final Property f54674a;

    /* renamed from: b */
    public final Property f54675b;

    /* renamed from: c */
    public final Property f54676c;

    /* renamed from: d */
    public final Property f54677d;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppDistributionException.Reason.values().length];
            try {
                iArr[AppDistributionException.Reason.MISSING_PROJECT_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppDistributionException.Reason.MISSING_TESTER_EMAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppDistributionException.Reason.MISSING_CREDENTIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TesterManagementTask() {
        Property property = getProject().getObjects().property(Long.TYPE);
        Intrinsics.checkNotNullExpressionValue(property, "project.objects.property(Long::class.java)");
        this.f54674a = property;
        Property property2 = getProject().getObjects().property(String.class);
        Intrinsics.checkNotNullExpressionValue(property2, "project.objects.property(String::class.java)");
        this.f54675b = property2;
        Property property3 = getProject().getObjects().property(String.class);
        Intrinsics.checkNotNullExpressionValue(property3, "project.objects.property(String::class.java)");
        this.f54676c = property3;
        Property property4 = getProject().getObjects().property(String.class);
        Intrinsics.checkNotNullExpressionValue(property4, "project.objects.property(String::class.java)");
        this.f54677d = property4;
    }

    @NotNull
    public final Property<String> getEmails() {
        return this.f54675b;
    }

    @NotNull
    public final Property<String> getFile() {
        return this.f54676c;
    }

    @Internal
    @NotNull
    public final TesterManagementOptions getOptions() {
        Long l = (Long) this.f54674a.getOrNull();
        if (l != null) {
            return new TesterManagementOptions(l.longValue(), (String) this.f54675b.getOrNull(), (String) this.f54676c.getOrNull(), (String) this.f54677d.getOrNull(), null, 16, null);
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_PROJECT_NUMBER, null, null, 6, null);
    }

    @NotNull
    public final Property<Long> getProjectNumber() {
        return this.f54674a;
    }

    @NotNull
    public final Property<String> getServiceCredentialsFile() {
        return this.f54677d;
    }

    public final void processException(@NotNull AppDistributionException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        int i = WhenMappings.$EnumSwitchMapping$0[e.getReason().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown exception occurred";
                    }
                    throw new GradleException(message, e);
                }
                throw new GradleException("Could not find credentials. To authenticate, you have a few options: \n1. Set the `serviceCredentialsFile` command line flag\n2. Set a refresh token with the FIREBASE_TOKEN environment variable\n3. Log in with the Firebase CLI\n4. Set service credentials with the GOOGLE_APPLICATION_CREDENTIALS environment variable");
            }
            throw new GradleException("Could not find tester emails. Please verify that you set either the command line flag `emails` or `file` with valid emails, then try again.");
        }
        throw new GradleException("Could not find your project number. Please verify that you set the command line flag `projectNumber` and try again.");
    }

    @Option(description = "Comma separated list of tester emails", option = "emails")
    public final void setEmails(@NotNull String emails) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        this.f54675b.set(emails);
    }

    @Option(description = "Path to a file containing a comma or newline separated list of tester emails", option = "file")
    public final void setFile(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f54676c.set(filePath);
    }

    @Option(description = "Firebase project number", option = "projectNumber")
    public final void setProjectNumber(@NotNull String projectNumber) {
        Intrinsics.checkNotNullParameter(projectNumber, "projectNumber");
        try {
            this.f54674a.set(Long.valueOf(Long.parseLong(projectNumber)));
        } catch (NumberFormatException unused) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("Invalid project number %s", Arrays.copyOf(new Object[]{projectNumber}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            throw new GradleException(format);
        }
    }

    @Option(description = "Path to your service account private key JSON file. Required only if you use service account authentication.", option = "serviceCredentialsFile")
    public final void setServiceCredentialsFile(@NotNull String serviceCredentialsFilePath) {
        Intrinsics.checkNotNullParameter(serviceCredentialsFilePath, "serviceCredentialsFilePath");
        this.f54677d.set(serviceCredentialsFilePath);
    }
}