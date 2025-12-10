package p000;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: kk0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20832kk0 implements InterfaceC19794ek0 {

    /* renamed from: a */
    public final LocaleList f68045a;

    public C20832kk0(Object obj) {
        this.f68045a = AbstractC18935Zj0.m65202a(obj);
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: a */
    public String mo29155a() {
        String languageTags;
        languageTags = this.f68045a.toLanguageTags();
        return languageTags;
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: b */
    public Object mo29154b() {
        return this.f68045a;
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: c */
    public Locale mo29153c(String[] strArr) {
        Locale firstMatch;
        firstMatch = this.f68045a.getFirstMatch(strArr);
        return firstMatch;
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: d */
    public int mo29152d(Locale locale) {
        int indexOf;
        indexOf = this.f68045a.indexOf(locale);
        return indexOf;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f68045a.equals(((InterfaceC19794ek0) obj).mo29154b());
        return equals;
    }

    @Override // p000.InterfaceC19794ek0
    public Locale get(int i) {
        Locale locale;
        locale = this.f68045a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f68045a.hashCode();
        return hashCode;
    }

    @Override // p000.InterfaceC19794ek0
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f68045a.isEmpty();
        return isEmpty;
    }

    @Override // p000.InterfaceC19794ek0
    public int size() {
        int size;
        size = this.f68045a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f68045a.toString();
        return localeList;
    }
}