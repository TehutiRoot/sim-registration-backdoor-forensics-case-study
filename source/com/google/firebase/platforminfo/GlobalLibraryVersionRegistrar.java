package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class GlobalLibraryVersionRegistrar {

    /* renamed from: b */
    public static volatile GlobalLibraryVersionRegistrar f56314b;

    /* renamed from: a */
    public final Set f56315a = new HashSet();

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = f56314b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = f56314b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        f56314b = globalLibraryVersionRegistrar;
                    }
                } finally {
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    /* renamed from: a */
    public Set m37826a() {
        Set unmodifiableSet;
        synchronized (this.f56315a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f56315a);
        }
        return unmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f56315a) {
            this.f56315a.add(AbstractC17797Ii0.m67880a(str, str2));
        }
    }
}
