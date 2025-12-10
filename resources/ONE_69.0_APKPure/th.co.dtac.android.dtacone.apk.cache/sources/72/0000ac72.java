package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.PatternFilenameFilter */
/* loaded from: classes4.dex */
public final class PatternFilenameFilter implements FilenameFilter {

    /* renamed from: a */
    public final Pattern f53992a;

    public PatternFilenameFilter(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f53992a.matcher(str).matches();
    }

    public PatternFilenameFilter(Pattern pattern) {
        this.f53992a = (Pattern) Preconditions.checkNotNull(pattern);
    }
}