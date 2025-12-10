package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: e */
    public static /* synthetic */ String m39311e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m39310f(Context context) {
        int i;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i = applicationInfo.minSdkVersion;
            return String.valueOf(i);
        }
        return "";
    }

    /* renamed from: g */
    public static /* synthetic */ String m39309g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return PDPrintFieldAttributeObject.ROLE_TV;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* renamed from: h */
    public static /* synthetic */ String m39308h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m39307i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    public static String m39307i(String str) {
        return str.replace(TokenParser.f74644SP, '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create("fire-core", BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create("device-name", m39307i(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create("device-model", m39307i(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create("device-brand", m39307i(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext("android-target-sdk", new LibraryVersionComponent.VersionExtractor() { // from class: m10
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                String m39311e;
                m39311e = FirebaseCommonRegistrar.m39311e((Context) obj);
                return m39311e;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-min-sdk", new LibraryVersionComponent.VersionExtractor() { // from class: n10
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                String m39310f;
                m39310f = FirebaseCommonRegistrar.m39310f((Context) obj);
                return m39310f;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-platform", new LibraryVersionComponent.VersionExtractor() { // from class: o10
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                String m39309g;
                m39309g = FirebaseCommonRegistrar.m39309g((Context) obj);
                return m39309g;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext("android-installer", new LibraryVersionComponent.VersionExtractor() { // from class: p10
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                String m39308h;
                m39308h = FirebaseCommonRegistrar.m39308h((Context) obj);
                return m39308h;
            }
        }));
        String detectVersion = KotlinDetector.detectVersion();
        if (detectVersion != null) {
            arrayList.add(LibraryVersionComponent.create("kotlin", detectVersion));
        }
        return arrayList;
    }
}