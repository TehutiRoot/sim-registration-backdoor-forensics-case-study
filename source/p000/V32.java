package p000;

import org.apache.commons.p028io.FilenameUtils;
import org.apache.commons.p028io.serialization.ClassNameMatcher;

/* renamed from: V32 */
/* loaded from: classes6.dex */
public final class V32 implements ClassNameMatcher {

    /* renamed from: a */
    public final String f6531a;

    public V32(String str) {
        this.f6531a = str;
    }

    @Override // org.apache.commons.p028io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return FilenameUtils.wildcardMatch(str, this.f6531a);
    }
}
