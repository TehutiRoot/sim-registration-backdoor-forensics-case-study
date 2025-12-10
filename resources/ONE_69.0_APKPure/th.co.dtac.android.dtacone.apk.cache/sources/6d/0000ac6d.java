package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.LineProcessor */
/* loaded from: classes4.dex */
public interface LineProcessor<T> {
    T getResult();

    @CanIgnoreReturnValue
    boolean processLine(String str) throws IOException;
}