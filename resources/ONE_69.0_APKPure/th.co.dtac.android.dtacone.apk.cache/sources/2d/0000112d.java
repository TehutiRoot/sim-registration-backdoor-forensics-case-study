package p000;

import org.apache.commons.p028io.FilenameUtils;
import org.apache.commons.p028io.serialization.ClassNameMatcher;

/* renamed from: S42 */
/* loaded from: classes6.dex */
public final class S42 implements ClassNameMatcher {

    /* renamed from: a */
    public final String f5728a;

    public S42(String str) {
        this.f5728a = str;
    }

    @Override // org.apache.commons.p028io.serialization.ClassNameMatcher
    public boolean matches(String str) {
        return FilenameUtils.wildcardMatch(str, this.f5728a);
    }
}