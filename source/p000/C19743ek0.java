package p000;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: ek0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19743ek0 implements InterfaceC18824Yj0 {

    /* renamed from: a */
    public final LocaleList f61579a;

    public C19743ek0(Object obj) {
        this.f61579a = AbstractC18504Tj0.m66173a(obj);
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: a */
    public String mo31497a() {
        String languageTags;
        languageTags = this.f61579a.toLanguageTags();
        return languageTags;
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: b */
    public Object mo31496b() {
        return this.f61579a;
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: c */
    public Locale mo31495c(String[] strArr) {
        Locale firstMatch;
        firstMatch = this.f61579a.getFirstMatch(strArr);
        return firstMatch;
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: d */
    public int mo31494d(Locale locale) {
        int indexOf;
        indexOf = this.f61579a.indexOf(locale);
        return indexOf;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f61579a.equals(((InterfaceC18824Yj0) obj).mo31496b());
        return equals;
    }

    @Override // p000.InterfaceC18824Yj0
    public Locale get(int i) {
        Locale locale;
        locale = this.f61579a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f61579a.hashCode();
        return hashCode;
    }

    @Override // p000.InterfaceC18824Yj0
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f61579a.isEmpty();
        return isEmpty;
    }

    @Override // p000.InterfaceC18824Yj0
    public int size() {
        int size;
        size = this.f61579a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f61579a.toString();
        return localeList;
    }
}
