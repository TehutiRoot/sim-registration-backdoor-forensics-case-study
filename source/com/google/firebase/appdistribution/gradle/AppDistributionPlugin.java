package com.google.firebase.appdistribution.gradle;

import com.android.build.api.AndroidPluginVersion;
import com.android.build.api.variant.ApplicationAndroidComponentsExtension;
import com.android.build.api.variant.ApplicationVariant;
import com.android.build.gradle.AppExtension;
import com.google.firebase.appdistribution.gradle.tasks.AddTestersTask;
import com.google.firebase.appdistribution.gradle.tasks.RemoveTestersTask;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000f"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionPlugin;", "Lorg/gradle/api/Plugin;", "Lorg/gradle/api/Project;", "<init>", "()V", "project", "", "apply", "(Lorg/gradle/api/Project;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "", "Z", "foundAndroidPlugin", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AppDistributionPlugin implements Plugin<Project> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTENSION_NAME = "firebaseAppDistribution";

    /* renamed from: a */
    public boolean f54569a;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionPlugin$Companion;", "", "<init>", "()V", "Lcom/android/build/api/variant/ApplicationVariant;", "variant", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/android/build/api/variant/ApplicationVariant;)Ljava/lang/String;", "ADD_TESTERS_TASK_NAME", "Ljava/lang/String;", "ANDROID_PLUGIN_ID", "EXTENSION_NAME", "REMOVE_TESTERS_TASK_NAME", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m39265a(ApplicationVariant applicationVariant) {
            StringBuilder sb = new StringBuilder();
            String substring = applicationVariant.getName().substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String upperCase = substring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
            String substring2 = applicationVariant.getName().substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb.append(substring2);
            String sb2 = sb.toString();
            return "appDistributionUpload" + sb2;
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    public final void m39267a(Project project) {
        project.getTasks().create("appDistributionAddTesters", AddTestersTask.class);
        project.getTasks().create("appDistributionRemoveTesters", RemoveTestersTask.class);
        project.getExtensions().add(EXTENSION_NAME, AppDistributionExtension.class);
        AppExtension appExtension = (AppExtension) project.getExtensions().getByType(AppExtension.class);
        appExtension.getBuildTypes().all(new C1870a6(AppDistributionPlugin$setUp$1.INSTANCE));
        appExtension.getProductFlavors().all(new C1870a6(AppDistributionPlugin$setUp$2.INSTANCE));
        ApplicationAndroidComponentsExtension applicationAndroidComponentsExtension = (ApplicationAndroidComponentsExtension) project.getExtensions().getByType(ApplicationAndroidComponentsExtension.class);
        applicationAndroidComponentsExtension.onVariants(applicationAndroidComponentsExtension.selector().all(), new AppDistributionPlugin$setUp$3(project, appExtension));
    }

    /* renamed from: b */
    public final void m39266b(Project project) {
        if (((ApplicationAndroidComponentsExtension) project.getExtensions().getByType(ApplicationAndroidComponentsExtension.class)).getPluginVersion().compareTo(new AndroidPluginVersion(7, 0, 0)) >= 0) {
            return;
        }
        throw new GradleException("The App Distribution gradle plugin requires a minimum Android Gradle Plugin version of 7.0.0");
    }

    public void apply(@NotNull Project project) {
        Intrinsics.checkNotNullParameter(project, "project");
        project.getPluginManager().withPlugin("com.android.application", new C1870a6(new AppDistributionPlugin$apply$1(this, project)));
        project.afterEvaluate(new C1870a6(new AppDistributionPlugin$apply$2(this)));
    }
}
