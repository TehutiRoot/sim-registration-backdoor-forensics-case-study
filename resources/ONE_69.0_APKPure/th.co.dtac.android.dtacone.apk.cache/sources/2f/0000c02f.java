package com.tom_roush.fontbox;

import com.tom_roush.fontbox.encoding.Encoding;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface EncodedFont {
    Encoding getEncoding() throws IOException;
}