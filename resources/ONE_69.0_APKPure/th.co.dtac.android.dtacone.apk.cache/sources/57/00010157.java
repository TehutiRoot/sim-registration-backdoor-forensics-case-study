package org.bson;

import org.bson.p044io.OutputBuffer;

/* loaded from: classes6.dex */
public interface BSONEncoder {
    void done();

    byte[] encode(BSONObject bSONObject);

    int putObject(BSONObject bSONObject);

    void set(OutputBuffer outputBuffer);
}