package org.apache.commons.p028io.output;

import java.io.IOException;

/* renamed from: org.apache.commons.io.output.UncheckedAppendable */
/* loaded from: classes6.dex */
public interface UncheckedAppendable extends Appendable {
    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ Appendable append(char c) throws IOException;

    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException;

    @Override // java.lang.Appendable
    /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException;

    @Override // java.lang.Appendable
    UncheckedAppendable append(char c);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence);

    @Override // java.lang.Appendable
    UncheckedAppendable append(CharSequence charSequence, int i, int i2);
}