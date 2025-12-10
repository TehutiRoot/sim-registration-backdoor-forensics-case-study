package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.p028io.serialization.ClassNameMatcher;

/* renamed from: h50  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20203h50 implements ClassNameMatcher {

    /* renamed from: a */
    public final Set f62369a;

    public C20203h50(String... strArr) {
        this.f62369a = Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    @Override // org.apache.commons.p028io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return this.f62369a.contains(str);
    }
}