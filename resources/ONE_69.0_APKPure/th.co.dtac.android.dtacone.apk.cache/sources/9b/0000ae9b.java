package com.google.firebase.appdistribution.gradle;

import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class AppDistributionExtension {
    public String appId;
    public String artifactPath;
    public String artifactType;
    public String groups;
    public String groupsFile;
    public String releaseNotes;
    public String releaseNotesFile;
    public String serviceCredentialsFile;
    public String testCases;
    public String testCasesFile;
    public String testDevices;
    public String testDevicesFile;
    public Boolean testNonBlocking;
    public String testPassword;
    public String testPasswordFile;
    public String testPasswordResource;
    public String testUsername;
    public String testUsernameResource;
    public String testers;
    public String testersFile;

    /* renamed from: c */
    public static Boolean m39261c(Boolean bool, Boolean bool2) {
        return bool != null ? bool : bool2;
    }

    /* renamed from: d */
    public static String m39260d(String str, String str2) {
        return str != null ? str : str2;
    }

    /* renamed from: a */
    public AppDistributionExtension m39263a(BuildType buildType, List list) {
        AppDistributionExtension appDistributionExtension;
        AppDistributionExtension appDistributionExtension2 = (AppDistributionExtension) AbstractC1380Tc.m66333a(buildType).findByName(AppDistributionPlugin.EXTENSION_NAME);
        if (appDistributionExtension2 != null) {
            appDistributionExtension = m39262b(appDistributionExtension2);
        } else {
            appDistributionExtension = this;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AppDistributionExtension appDistributionExtension3 = (AppDistributionExtension) AbstractC1380Tc.m66332b((ProductFlavor) it.next()).findByName(AppDistributionPlugin.EXTENSION_NAME);
            if (appDistributionExtension3 != null) {
                appDistributionExtension = appDistributionExtension.m39262b(appDistributionExtension3);
            }
        }
        return appDistributionExtension;
    }

    /* renamed from: b */
    public final AppDistributionExtension m39262b(AppDistributionExtension appDistributionExtension) {
        AppDistributionExtension appDistributionExtension2 = new AppDistributionExtension();
        appDistributionExtension2.artifactPath = m39260d(appDistributionExtension.artifactPath, this.artifactPath);
        appDistributionExtension2.artifactType = m39260d(appDistributionExtension.artifactType, this.artifactType);
        appDistributionExtension2.serviceCredentialsFile = m39260d(appDistributionExtension.serviceCredentialsFile, this.serviceCredentialsFile);
        appDistributionExtension2.appId = m39260d(appDistributionExtension.appId, this.appId);
        appDistributionExtension2.releaseNotes = m39260d(appDistributionExtension.releaseNotes, this.releaseNotes);
        appDistributionExtension2.releaseNotesFile = m39260d(appDistributionExtension.releaseNotesFile, this.releaseNotesFile);
        appDistributionExtension2.testers = m39260d(appDistributionExtension.testers, this.testers);
        appDistributionExtension2.testersFile = m39260d(appDistributionExtension.testersFile, this.testersFile);
        appDistributionExtension2.groups = m39260d(appDistributionExtension.groups, this.groups);
        appDistributionExtension2.groupsFile = m39260d(appDistributionExtension.groupsFile, this.groupsFile);
        appDistributionExtension2.testDevices = m39260d(appDistributionExtension.testDevices, this.testDevices);
        appDistributionExtension2.testDevicesFile = m39260d(appDistributionExtension.testDevicesFile, this.testDevicesFile);
        appDistributionExtension2.testUsername = m39260d(appDistributionExtension.testUsername, this.testUsername);
        appDistributionExtension2.testPassword = m39260d(appDistributionExtension.testPassword, this.testPassword);
        appDistributionExtension2.testPasswordFile = m39260d(appDistributionExtension.testPasswordFile, this.testPasswordFile);
        appDistributionExtension2.testUsernameResource = m39260d(appDistributionExtension.testUsernameResource, this.testUsernameResource);
        appDistributionExtension2.testPasswordResource = m39260d(appDistributionExtension.testPasswordResource, this.testPasswordResource);
        appDistributionExtension2.testNonBlocking = m39261c(appDistributionExtension.testNonBlocking, this.testNonBlocking);
        appDistributionExtension2.testCases = m39260d(appDistributionExtension.testCases, this.testCases);
        appDistributionExtension2.testCasesFile = m39260d(appDistributionExtension.testCasesFile, this.testCasesFile);
        return appDistributionExtension2;
    }
}