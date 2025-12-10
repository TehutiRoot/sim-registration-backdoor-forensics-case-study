package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class GlobalLibraryVersionRegistrar {

    /* renamed from: b */
    public static volatile GlobalLibraryVersionRegistrar f56326b;

    /* renamed from: a */
    public final Set f56327a = new HashSet();

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = f56326b;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = f56326b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        f56326b = globalLibraryVersionRegistrar;
                    }
                } finally {
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    /* renamed from: a */
    public Set m37818a() {
        Set unmodifiableSet;
        synchronized (this.f56327a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f56327a);
        }
        return unmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.f56327a) {
            this.f56327a.add(AbstractC18218Oi0.m67097a(str, str2));
        }
    }
}